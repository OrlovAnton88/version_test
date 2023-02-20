package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VersionController(private val versionConfig: VersionConfig) {

    @GetMapping("/version")
    fun versioon(): VersionConfig {

        return versionConfig
    }
}
