package ru.study.rediscommonservice.controller

import org.springframework.web.bind.annotation.*
import ru.study.rediscommonservice.infrastructure.service.MessageService
import ru.study.rediscommonservice.model.Message

/**
 * Контроллер сообщений
 */
@RestController
@RequestMapping("/message")
class MessageController(
    private val service: MessageService
) {

    @PostMapping("/")
    fun saveMessage(@RequestBody message: Message) =
        service.saveMessage(message)

    @GetMapping("/{id}")
    fun getMessage(@PathVariable id: Long): Message =
        service.getMessage(id)

}