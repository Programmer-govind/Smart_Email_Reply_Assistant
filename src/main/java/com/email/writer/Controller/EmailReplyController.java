package com.email.writer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.email.writer.DTO.EmailRequest;
import com.email.writer.service.EmailService;

@RestController
@RequestMapping("/api/email")
public class EmailReplyController {
	@Autowired
	private EmailService service;

	@PostMapping("/generate")
	public ResponseEntity<String> generateEmailReply(@RequestBody EmailRequest emailRequest) {
		// logic to generate Email Reply

		String response = service.generateReply(emailRequest);

		return new ResponseEntity<String>(response, HttpStatus.OK);

	}
}
