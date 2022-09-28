package de.mathisburger.mock.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "web_endpoints")
class WebEndpoint : BaseEntity() {

    @Column(nullable = false)
    private var path: String? = null;

    @Column(nullable = false)
    private var method: String? = null;

    fun getPath(): String? {
        return this.path;
    }

    fun setPath(path: String) {
        this.path = path;
    }

    fun getMethod(): String? {
        return this.method;
    }

    fun setMethod(method: String) {
        this.method = method;
    }
}