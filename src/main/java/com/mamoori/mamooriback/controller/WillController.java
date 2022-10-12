package com.mamoori.mamooriback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mamoori.mamooriback.controller.request.WillRequest;
import com.mamoori.mamooriback.dto.WillDto;
import com.mamoori.mamooriback.entity.Will;
import com.mamoori.mamooriback.service.WillService;
import com.mamoori.mamooriback.service.impl.WillServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/will")
public class WillController {
	@Autowired
	private WillServiceImpl willServiceImpl;

	@PostMapping("/create")
	public ResponseEntity<Will> create(@RequestBody WillRequest willRequest) {
		return ResponseEntity.ok(willServiceImpl.create(willRequest));
	}



	}



