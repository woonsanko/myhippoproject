package org.example.services.impl;

import org.example.services.FooService;
import org.springframework.stereotype.Service;

@Service
public class FooServiceImpl implements FooService {

	@Override
	public String getMessage(String message) {
		return message;
	}
}
