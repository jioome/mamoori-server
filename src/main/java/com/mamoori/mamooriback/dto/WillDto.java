package com.mamoori.mamooriback.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WillDto {
	private Long willId;
	private String title;
	private String content;
	private String receiver;

	public WillDto(Long willId, String title, String content, String receiver) {
		this.willId = willId;
		this.title = title;
		this.content = content;
		this.receiver = receiver;
	}
}
