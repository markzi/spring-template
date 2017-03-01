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

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class RulesServiceJdbc implements RulesService {

	private static final Logger LOGGER = LoggerFactory.getLogger(RulesServiceJdbc.class);

	// @Autowired
	// private JdbcTemplate jdbcTemplate;

	private static List<RuleDto> rules = new ArrayList<RuleDto>();

	static {
		rules.add(new RuleDto(1, "context1", "ruleName1", "value1", "valueType1"));
		rules.add(new RuleDto(1, "context2", "ruleName2", "value2", "valueType2"));
	}

	@Override
	public List<RuleDto> getAllDefaultRules() {
		
		LOGGER.info("found default rules");
		return rules;
	}
}
