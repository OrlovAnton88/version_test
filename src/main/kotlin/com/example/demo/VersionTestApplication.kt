package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@EnableConfigurationProperties
@ConfigurationPropertiesScan("com.example.demo")
@SpringBootApplication
class VersionTestApplication{

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			SpringApplication.run(VersionTestApplication::class.java, *args)
		}
	}
}
