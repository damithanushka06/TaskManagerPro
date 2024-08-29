package com.example.taskmanagerpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskmanagerproApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(TaskmanagerproApplication.class, args);
		} catch (Exception exception) {
           exception.printStackTrace();
		}
	}
}
