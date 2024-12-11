package com.real_time_chat.Chatting_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChattingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChattingAppApplication.class, args);
		System.out.println("Server is running...");
	}

}
