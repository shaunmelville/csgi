package com.shaunmelville.poc.base.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 
 * @author shaun
 * 
 *         Exception helper. Must expand to sanitize exceptions.
 *
 */
@ControllerAdvice
public class ExceptionHelper {

	private static final Logger logger = LoggerFactory.getLogger(ExceptionHelper.class);

	@ExceptionHandler(value = { Exception.class })

	public ResponseEntity<Object> handleException(Exception ex) {

		logger.error("Exception: ", ex);

		return new ResponseEntity<Object>(ex, HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
