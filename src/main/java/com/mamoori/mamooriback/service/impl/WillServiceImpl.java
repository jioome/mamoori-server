package com.mamoori.mamooriback.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mamoori.mamooriback.controller.request.WillRequest;
import com.mamoori.mamooriback.entity.Will;
import com.mamoori.mamooriback.repository.WillRepository;
import com.mamoori.mamooriback.service.WillService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WillServiceImpl  {
	@Autowired
	private WillRepository willRepository;

	public Will create(WillRequest willRequest){
		final Will will = new Will(willRequest.getTitle(), willRequest.getContent(), willRequest.getUserId());
		return willRepository.save(will);
	}



}
