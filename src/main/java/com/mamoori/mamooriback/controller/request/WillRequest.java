package com.mamoori.mamooriback.controller.request;

import org.springframework.web.bind.annotation.RestController;

import com.mamoori.mamooriback.service.WillService;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class WillRequest {
	private String title;
	private String content;
	private Long userId; // User


}
