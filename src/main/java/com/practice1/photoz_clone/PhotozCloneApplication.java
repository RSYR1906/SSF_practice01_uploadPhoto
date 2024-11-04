package com.practice1.photoz_clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.practice1.photoz_clone.repository") // Specify the package for repositories
public class PhotozCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotozCloneApplication.class, args);
	}

}
