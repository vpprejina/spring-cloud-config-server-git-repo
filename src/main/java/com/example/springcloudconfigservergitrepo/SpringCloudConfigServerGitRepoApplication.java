package com.example.springcloudconfigservergitrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigServer
public class SpringCloudConfigServerGitRepoApplication {


	
	@GetMapping("/test")
	public String test() {
		return "Application Deployed by rejina";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerGitRepoApplication.class, args);
	}
}
