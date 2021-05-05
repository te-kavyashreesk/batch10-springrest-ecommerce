package com.te.springresteitem.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.springresteitem.bean.ItemResponse;
import com.te.springresteitem.exception.ItemException;

@RestControllerAdvice
public class ItemRestControllerAdvice {

	@ExceptionHandler(ItemException.class)
	public ItemResponse handleEmployeeExp(ItemException exception) {
		ItemResponse response = new ItemResponse();
		response.setStatusCode(500);
		response.setMsg(exception.getMessage());
		return response;
	}
}