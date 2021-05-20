package net.technearts.quarkus.kotlin.start

import org.eclipse.microprofile.config.inject.ConfigProperty
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {
    @ConfigProperty(name = "greeting.message")
    lateinit var message: String
    fun greeting(name: String): String {
        return "$message $name"
    }
}