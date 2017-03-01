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

public class RuleException extends Exception
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    /**
    *
    * @param message
    */
   public RuleException(String message)
   {
      super(message);
   }

   /**
    *
    * @param string
    * @param e
    */
   public RuleException(String message, Exception e)
   {
       super(message, e);
   }

}
