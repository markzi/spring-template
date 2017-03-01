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

package com.example.spring.config.bootstrap.container;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


// @ActuatorMetricWriter
// @EnableAutoConfiguration
// @ComponentScan(basePackages = { "com.example", "uk.co.hpi.web" }, excludeFilters =
// @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "com.example.config.noncontainer.*"))
@Configuration
@ComponentScan({ "com.example.spring.config.container", "com.example.spring.config.web" })
public class ContainerBootstrap extends WebMvcConfigurerAdapter
{
}
