package com.example.demo

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.bind.ConstructorBinding


@ConfigurationProperties("application")
data class VersionConfig @ConstructorBinding constructor(val version: String)
