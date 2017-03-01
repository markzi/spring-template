/**
 * Copyright (c) HPI Limited 2017
 * 
 * All rights reserved. No part of this work may be reproduced or transmitted, in any form or by any
 * means, or adapted (including for the purposes of error correction) without the written permission
 * of the copyright owner except in accordance with the provisions of the Copyright, Designs and
 * Patents Act 1988 or under the terms of a Licence entered into with the copyright owner.
 * 
 * Warning: the doing of an unauthorised act in relation to a copyright work may result in both a
 * civil claim for damages and a criminal prosecution.
 */

package com.example.spring.web.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("example/")
public class ExampleController {

	private static Logger LOGGER = LoggerFactory.getLogger(ExampleController.class);

	@Autowired
	private RulesService rulesService;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String home() {
		LOGGER.info("Handling home");
		return "Hello World";
	}

	@RequestMapping("/rules")
	@ApiOperation(value = "Returns all rule default", notes = "Returns a complete list of default customer rules.", response = RuleDto.class)
	public List<RuleDto> ruleDefault(@RequestParam(value="customerId", required=true) String customerId) throws RuleException {
		
		MDC.put("customerId", customerId);
		
		List<RuleDto> rules = rulesService.getAllDefaultRules();
		
		LOGGER.info("returning rules, count={}", new Object[]{rules.size()});
		
		return rules;
	}

	@RequestMapping("/rules/1")
	@ApiOperation(value = "Returns all rule default", notes = "Returns a complete list of default customer rules.", response = RuleDto.class)
	public List<RuleDto> throwRuleException(@RequestHeader(value="X-CustomerId") String customerId) throws RuleException {
		
		MDC.put("customerId", customerId);
		
		throw new RuleException("test rule exception");
	}

	@RequestMapping("/rules/2")
	@ApiOperation(value = "Returns all rule default", notes = "Returns a complete list of default customer rules.", response = RuleDto.class)
	public List<RuleDto> throwIOException(@RequestHeader(value="X-CustomerId") String customerId) throws IOException {
		
		MDC.put("customerId", customerId);
		
		throw new IOException("test io exception");
	}

	@RequestMapping("/rules/3")
	@ApiOperation(value = "Returns all rule default", notes = "Returns a complete list of default customer rules.", response = RuleDto.class)
	public List<RuleDto> throwSeriousException(@RequestHeader(value="X-CustomerId") String customerId) throws SeriousFoundException {
		
		MDC.put("customerId", customerId);
		
		throw new SeriousFoundException();
	}

	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "IOException occured")
	@ExceptionHandler(IOException.class)
	public void handleIOException() {
		// returning 404 error code
	}

	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Rule Not Found") // 404
	public class SeriousFoundException extends Exception {

		private static final long serialVersionUID = -1716471729124942385L;

		public SeriousFoundException() {
			super("Huge issue with something");
		}
	}

}
