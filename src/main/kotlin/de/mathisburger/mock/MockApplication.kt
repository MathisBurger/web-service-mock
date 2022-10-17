package de.mathisburger.mock

import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@AutoConfiguration
class MockApplication

fun main(args: Array<String>) {
	runApplication<MockApplication>(*args)
}
