package de.mathisburger.mock.controller

import de.mathisburger.mock.entity.WebEndpoint
import de.mathisburger.mock.repository.WebEndpointRepository
import de.mathisburger.mock.request.AddEndpointRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class WebEndpointController {

    @Autowired
    lateinit var endpointRepository: WebEndpointRepository;

    @PostMapping( "/webservice-mock/addEndpoint")
    fun addWebEndpoint(@RequestBody req: AddEndpointRequest): WebEndpoint {
        val endpoint = WebEndpoint();
        endpoint.setPath(req.path);
        endpoint.setMethod(req.method);
        endpointRepository.save(endpoint);
        endpointRepository.flush();
        return endpoint;
    }
}