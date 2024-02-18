package ru.study.rediscommonservice

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class RedisCommonServiceApplicationTests {

    @Test
    fun contextLoads() {
        Assertions.assertThat("Контекст загружен").isNotNull
    }

}
