package de.mathisburger.mock.repository

import de.mathisburger.mock.entity.WebEndpoint
import org.springframework.data.jpa.repository.JpaRepository

interface WebEndpointRepository : JpaRepository<WebEndpoint, Int> {
}