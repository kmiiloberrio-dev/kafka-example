package com.example.kafkaexample.kafka.listeners

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class HelloKafkaListener {

    @KafkaListener(
        topics = ["local-kafka-topic"],
        groupId = "com.example.kafkaexample.kafka.HelloKafkaListener"
    )
    fun listener(data: String) {
        println("Listener received $data \uD83C\uDF89")
    }
}