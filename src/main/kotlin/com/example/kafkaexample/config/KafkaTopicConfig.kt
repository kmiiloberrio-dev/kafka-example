package com.example.kafkaexample.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaTopicConfig {

    @Bean
    fun kafkaTopic(): NewTopic {
        return TopicBuilder.name("local-kafka-topic").build()
    }
}