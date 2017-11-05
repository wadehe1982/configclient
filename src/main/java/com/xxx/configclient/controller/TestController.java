package com.xxx.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

	@Value("${name}")
	private String name;

	@Autowired
	private Environment environment;

	@RequestMapping(value = "name")
	public String showName() {
		return environment.getProperty("name", "undefined");
		// return this.name;
	}

}
