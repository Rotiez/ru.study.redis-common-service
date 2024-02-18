package ru.study.rediscommonservice.infrastructure.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.study.rediscommonservice.model.Message

/**
 * Репозиторий сообщений
 */
@Repository
interface MessageRepository: JpaRepository<Message, Long>