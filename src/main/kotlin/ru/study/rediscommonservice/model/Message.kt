package ru.study.rediscommonservice.model

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*

/**
 * Сущность сообщения
 */
@Entity
data class Message(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    val id: Long,

    @JsonProperty("title")
    val title: String,

    @JsonProperty("text")
    val text: String,
)