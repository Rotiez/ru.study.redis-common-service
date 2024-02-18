# Redis common service
Учебный проект для подключения и работы с Redis.

Для работы сервиса потребуется `PostgreSQL` и `Redis`. Сервис сохраняет сообщения
в базу данных, а также кэширует ответ при запросе определенного сообщения.
Чтобы отследить работу кэширования, можно просмотреть логи сервиса при запросе сообщения.

По умолчанию сервис подключается к _PostgreSQL_ по адресу `localhost:5432` 
используя username и password `postgres:postgres`, а также базу данных `postgres`. 
При подключении к _Redis_ по умолчанию используется адрес `localhost:6379` и database `0`.
(При запуске в контейнере хосты для _Redis_ и _PostgreSQL_ по умолчанию указаны - `host.docker.internal`,
т.к. _PostgreSQL_ и _Redis_ локально запускались с помощью Docker).
> Для изменения стандартных настроек используйте переменные окружения, указанные в конце файла README.

С инструкциями как запустить _Redis_ и _PostgreSQL_ с помощью Docker можно ознакомиться
по ссылкам [redis-stack-docker](https://redis.io/docs/install/install-stack/docker/) и 
[postgres-docker](https://hub.docker.com/_/postgres).

---

Для конфигурации сервиса используйте следующие переменные окружения:
* `POSTGRES_HOST` (localhost) - хост PostgreSQL
* `POSTGRES_PORT` (5432) - порт PostgreSQL
* `POSTGRES_DATABASE` (postgres) - название базы данных PostgreSQL
* `POSTGRES_USERNAME` (postgres) - имя пользователя для подключения к PostgreSQL
* `POSTGRES_PASSWORD` (postgres) - пароль пользователя для подключения к PostgreSQL


* `REDIS_HOST` (localhost) - хост Redis
* `REDIS_PORT` (6379) - порт Redis
* `REDIS_DATABASE` (0) - база данных Redis
* `REDIS_USERNAME` - имя пользователя для подключения к Redis
* `REDIS_PASSWORD` - пароль пользователя для подключения к Redis
* `REDIS_ENTRY_TTL` (5) - время жизни кэша в Redis в минутах


* `DDL_MODE` (create-drop) - режим выполнения DDL
* `SHOW_SQL_ENABLE` (true) - включение отображения SQL-запросов




