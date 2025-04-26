package com.email.writer.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.email.writer.DTO.EmailRequest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmailService {
	@Value("${gemini.api.key}")
	private String GEMINI_API_KEY = "";
	@Value("${gemini.api.url}")
	private String GEMINI_API_URL = "";
	// Web Client
	private WebClient webClient;

	EmailService(WebClient.Builder builder) {
		this.webClient = builder.build();
	}

	public String generateReply(EmailRequest emailRequest) {
		// 1. build prompt using email request - Done
		String prompt = generatePrompt(emailRequest);

		// 2. generate request Body - Done
		Map<String, Object> requestBody = Map.of("contents",
				new Object[] { Map.of("parts", new Object[] { Map.of("text", prompt) }) });

		// 3. Send Request and get Response
		String response = webClient.post().uri(GEMINI_API_URL + GEMINI_API_KEY)
				.header("Content-Type", "application/json").bodyValue(requestBody).retrieve().bodyToMono(String.class)
				.block();

		return extractResponseContent(response);

	}

	private String extractResponseContent(String response) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode rootNode = mapper.readTree(response);
			return rootNode.path("candidates").get(0).path("content").path("parts").get(0).path("text").asText();
		} catch (Exception e) {
			return "Error processing request: " + e.getMessage();
		}
	}

	private String generatePrompt(EmailRequest emailRequest) {
		// TODO Auto-generated method stub
		StringBuilder prompt = new StringBuilder();
		prompt.append("Generate a Email reply for the following email content. Don't generate any subject line. ");
		if (emailRequest.getTone() != null && !emailRequest.getContent().isEmpty()) {
			prompt.append("Use a " + emailRequest.getTone()).append(" tone. ");
		}
		prompt.append("\nOriginal Email Content:\n");
		prompt.append(emailRequest.getContent());
		return prompt.toString();
	}

}
