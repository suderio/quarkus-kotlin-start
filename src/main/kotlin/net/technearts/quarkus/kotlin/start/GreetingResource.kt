package net.technearts.quarkus.kotlin.start

import org.eclipse.microprofile.config.inject.ConfigProperty
import org.jboss.resteasy.annotations.jaxrs.PathParam
import javax.enterprise.inject.Default
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class GreetingResource {
    @Inject
    @field: Default
    lateinit var service: GreetingService

    @ConfigProperty(name = "greeting.message")
    lateinit var message: String

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    fun greeting(@PathParam name: String): String {
        return service.greeting(name)
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {
        return message
    }
}