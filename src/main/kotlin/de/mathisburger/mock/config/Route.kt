package de.mathisburger.mock.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "mock.routes")
class Route {

    var path: String? = null;

    var method: String? = null;

    var response: String? = null;
}