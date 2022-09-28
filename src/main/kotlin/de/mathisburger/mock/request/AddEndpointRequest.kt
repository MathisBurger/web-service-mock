package de.mathisburger.mock.request

data class AddEndpointRequest(
    var path: String,
    var method: String
)
