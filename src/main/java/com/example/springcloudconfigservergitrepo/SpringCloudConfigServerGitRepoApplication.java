package com.example.springcloudconfigservergitrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerGitRepoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerGitRepoApplication.class, args);
	}

}
