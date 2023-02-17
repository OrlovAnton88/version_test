package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VersionTestApplication{

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			SpringApplication.run(VersionTestApplication::class.java, *args)
		}
	}
}
