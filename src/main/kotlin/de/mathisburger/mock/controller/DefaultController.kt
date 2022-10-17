package de.mathisburger.mock.controller

import de.mathisburger.mock.config.Response
import de.mathisburger.mock.config.Route
import de.mathisburger.mock.reader.RouteConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.http.HttpResponse
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@RestController
class DefaultController {

    @Autowired
    private lateinit var config: RouteConfig;

    @Autowired
    private lateinit var request: HttpServletRequest;

    @RequestMapping("/**", produces = ["application/json", "text/html"])
    fun get(resp: HttpServletResponse): Any {
        var route: Route? = getRouteConfig(request.requestURI);
        if (route == null) {
            resp.status = 404;
            return "";
        }
        if (this.request.method != route.method) {
            resp.status = 405;
            return "";
        }
        if (route.response == null) {
            return "";
        }
        var response = getResponse(route.response!!);
        resp.status = response?.status!!;
        return response.response;
    }

    private fun getResponse(id: String): Response? {
        return config.responses[id];
    }

    private fun getRouteConfig(uri: String): Route? {
        config.routes.iterator().forEach {
            if (uri == it.path) {
                return it;
            }
        }
        return null;
    }
}