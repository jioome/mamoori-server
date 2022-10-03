package com.mamoori.mamooriback.controller.request;

import org.springframework.web.bind.annotation.RestController;

import com.mamoori.mamooriback.service.WillService;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WillRequest {
	private String title;


}
