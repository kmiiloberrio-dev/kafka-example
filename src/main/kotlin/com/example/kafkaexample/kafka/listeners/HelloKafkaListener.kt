package com.example.kafkaexample.kafka.listeners

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.annotation.PartitionOffset
import org.springframework.kafka.annotation.TopicPartition
import org.springframework.stereotype.Component

@Component
class HelloKafkaListener {

    @KafkaListener(
        id = "receiver-api",
        topicPartitions = [TopicPartition(
            topic = "local-kafka-topic",
            partitionOffsets = [PartitionOffset(partition = "0", initialOffset = "0")]
        )]
    )
    fun listener(data: String) {
        println("Listener received $data \uD83C\uDF89")
    }
}