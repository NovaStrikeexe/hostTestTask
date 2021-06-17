package ru.host.hostTestTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "ru.host.hostTestTask")
public class HostTestTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HostTestTaskApplication.class, args);
	}

}
