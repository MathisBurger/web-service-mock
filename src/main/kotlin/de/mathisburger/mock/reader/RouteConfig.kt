package de.mathisburger.mock.reader

import de.mathisburger.mock.config.Response
import de.mathisburger.mock.config.Route
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource


@Configuration
@ConfigurationProperties(prefix = "mock")
@PropertySource(value = ["classpath:routes.yml"], factory = YamlPropertySourceFactory::class)
class RouteConfig {

    var routes: MutableList<Route> = mutableListOf();

    var responses: Map<String, Response> = mapOf();
}