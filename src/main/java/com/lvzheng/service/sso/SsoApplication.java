package com.lvzheng.service.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath*:spring/motan.xml"})
public class SsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsoApplication.class, args);
	}
}
