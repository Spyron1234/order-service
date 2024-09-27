package com.os.app;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.data")
public record DataConfig(
	String name,
	String loc,
	Double price,
	List<String> sector) {}