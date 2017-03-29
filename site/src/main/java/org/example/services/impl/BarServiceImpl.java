package org.example.services.impl;

import org.example.services.BarService;
import org.springframework.stereotype.Service;

@Service
public class BarServiceImpl implements BarService {

	@Override
	public String getMessage(String message) {
		return message;
	}
}
