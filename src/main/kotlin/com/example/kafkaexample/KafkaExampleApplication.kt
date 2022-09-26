package com.example.kafkaexample

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.core.KafkaTemplate

@SpringBootApplication
class KafkaExampleApplication {
    // @Bean
    fun run(kafkaTemplate: KafkaTemplate<String, String>): CommandLineRunner {
        return CommandLineRunner {
            (1..100).forEach {
                kafkaTemplate.send("local-kafka-topic", "Hello Kafka! $it")
            }
        }
    }
}

fun main(args: Array<String>) {
    runApplication<KafkaExampleApplication>(*args)
}