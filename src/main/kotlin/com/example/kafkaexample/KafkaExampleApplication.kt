package com.example.kafkaexample

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.kafka.core.KafkaTemplate

@SpringBootApplication
class KafkaExampleApplication{
    @Bean
    fun run(kafkaTemplate: KafkaTemplate<String, String>): CommandLineRunner {
        return CommandLineRunner {
            kafkaTemplate.send("local-kafka-topic", "Hello Kafka!")
        }
    }
}

fun main(args: Array<String>) {
    runApplication<KafkaExampleApplication>(*args)
}