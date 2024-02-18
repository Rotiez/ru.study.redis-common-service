package ru.study.rediscommonservice.configuration

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Файл для загрузки свойств Redis
 */
@ConfigurationProperties(prefix = "redis.properties")
data class RedisProperties(
    val ttl: Long
)