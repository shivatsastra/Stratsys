package com.stratsys.test;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "io.swagger", "io.swagger.api", "io.swagger.configuration", "com.ikea.ptag" })
public class AppTest {

}
