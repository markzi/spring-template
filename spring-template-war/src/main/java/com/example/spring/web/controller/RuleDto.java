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

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

public class RuleDto implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = -5225702102222964095L;

    /** The rule id. */
    private int ruleId;

    /** The context. */
    @Length(max = 4)
    private String context;

    /** The rule name. */
    @Length(max = 50)
    private String ruleName;

    /** The rule value. */
    @Length(max = 800)
    private String ruleValue;

    /** The rule type. */
    @Length(max = 4)
    private String valueType;

    /**
     * Instantiates a new rule dto.
     *
     * @param ruleId the rule id
     * @param context the context
     * @param ruleName the rule name
     * @param ruleValue the rule value
     * @param ruleType the rule type
     */
    public RuleDto(int ruleId, String context, String ruleName, String ruleValue, String valueType)
    {
        super();
        this.ruleId = ruleId;
        this.context = context;
        this.ruleName = ruleName;
        this.ruleValue = ruleValue;
        this.valueType = valueType;
    }

    /**
     * Instantiates a new rule dto.
     */
    public RuleDto()
    {
        super();
    }

    /**
     * Gets the rule id.
     *
     * @return the rule id
     */
    public int getRuleId()
    {
        return ruleId;
    }

    /**
     * Gets the context.
     *
     * @return the context
     */
    public String getContext()
    {
        return context;
    }

    /**
     * Gets the rule name.
     *
     * @return the rule name
     */
    public String getRuleName()
    {
        return ruleName;
    }

    /**
     * Gets the rule value.
     *
     * @return the rule value
     */
    public String getRuleValue()
    {
        return ruleValue;
    }

    /**
     * Sets the rule id.
     *
     * @param ruleId the new rule id
     */
    public void setRuleId(int ruleId)
    {
        this.ruleId = ruleId;
    }

    /**
     * Sets the context.
     *
     * @param context the new context
     */
    public void setContext(String context)
    {
        this.context = context;
    }

    /**
     * Sets the rule name.
     *
     * @param ruleName the new rule name
     */
    public void setRuleName(String ruleName)
    {
        this.ruleName = ruleName;
    }

    /**
     * Sets the rule value.
     *
     * @param ruleValue the new rule value
     */
    public void setRuleValue(String ruleValue)
    {
        this.ruleValue = ruleValue;
    }

    /**
     * Gets the value type.
     *
     * @return the value type
     */
    public String getValueType()
    {
        return valueType;
    }

    /**
     * Sets the rule type.
     *
     * @param valueType the new value type
     */
    public void setValueType(String valueType)
    {
        this.valueType = valueType;
    }
}
