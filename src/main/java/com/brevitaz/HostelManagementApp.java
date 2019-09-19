/**
 * ===========================================================================
 * Copyright 2019, Allego Corporation, MA USA
 *
 * This file and its contents are proprietary and confidential to and the sole
 * intellectual property of Allego Corporation.  Any use, reproduction,
 * redistribution or modification of this file is prohibited except as
 * explicitly defined by written license agreement with Allego Corporation.
 * ===========================================================================
 *
 */
package com.brevitaz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.brevitaz")
public class HostelManagementApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(HostelManagementApp.class, args);
    }
}
