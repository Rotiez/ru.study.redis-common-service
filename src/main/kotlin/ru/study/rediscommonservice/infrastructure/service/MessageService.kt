package ru.study.rediscommonservice.infrastructure.service

import jakarta.transaction.Transactional
import org.slf4j.LoggerFactory
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import ru.study.rediscommonservice.infrastructure.repository.MessageRepository
import ru.study.rediscommonservice.model.Message

/**
 * Сервис для работы с сообщениями
 */
@Service
class MessageService(
    private val repository: MessageRepository,
) {

    companion object {
        private const val LOG_SAVE_SUCCESS_MESSAGE = "Successfully saved message"
        private const val LOG_SAVE_FAILED_MESSAGE = "Failed to save message"
        private const val LOG_GET_SUCCESS_MESSAGE = "Successfully retrieved message"
        private const val LOG_GET_FAILED_MESSAGE = "Failed to get message"
    }

    private val log = LoggerFactory.getLogger(MessageService::class.java)


    @Transactional
    fun saveMessage(message: Message) =
        try {
            repository.save(message)
            log.info("$LOG_SAVE_SUCCESS_MESSAGE: $message")
        } catch (ex: Exception) {
            log.error("$LOG_SAVE_FAILED_MESSAGE: $message", ex)
            throw ex
        }


    @Cacheable("message")
    fun getMessage(id: Long): Message =
        try {
            val result = repository.findById(id)
                .orElseThrow { Exception("Failed to get message with id: $id") }
            log.info("$LOG_GET_SUCCESS_MESSAGE: id = $id")
            result
        } catch (ex: Exception) {
            log.error("$LOG_GET_FAILED_MESSAGE: id = $id", ex)
            throw ex
        }



}