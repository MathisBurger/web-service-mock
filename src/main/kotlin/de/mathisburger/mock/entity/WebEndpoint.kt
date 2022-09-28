package de.mathisburger.mock.entity

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "web_endpoints")
class WebEndpoint : BaseEntity() {

}