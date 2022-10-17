package de.mathisburger.mock.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import java.util.StringJoiner

@Component
@ConfigurationProperties(prefix = "mock.responses")
class Response {

    var status: Int = 0;

    var response: String = "";
}