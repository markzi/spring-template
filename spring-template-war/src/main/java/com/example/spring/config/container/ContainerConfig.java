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

package com.example.spring.config.container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableWebMvc
@EnableSwagger2
@Configuration
public class ContainerConfig extends WebMvcConfigurerAdapter
{
//    @Bean
//    public JdbcTemplate myJjdbcTemplate(DataSource jndiDataSource)
//    {
//        return new JdbcTemplate(jndiDataSource);
//    }

    @Bean
//    public DataSource jndiDataSource() throws IllegalArgumentException, NamingException
//    {
//        JndiDataSourceLookup jndiDataSourceLookup = new JndiDataSourceLookup();
//        jndiDataSourceLookup.setResourceRef(true);
//        return jndiDataSourceLookup.getDataSource("jdbc/rulesservice/trade04DS");
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
