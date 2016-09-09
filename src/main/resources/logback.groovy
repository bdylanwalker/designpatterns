import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.INFO

appender("stdout", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{5} - %msg%n"
    }
}
root(INFO, ["stdout"])