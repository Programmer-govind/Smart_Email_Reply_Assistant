package com.email.writer.DTO;

import lombok.Data;

@Data
public class EmailRequest {
	private String content;
	private String tone;
}
