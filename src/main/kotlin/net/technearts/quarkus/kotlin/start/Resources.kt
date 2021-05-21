package net.technearts.quarkus.kotlin.start

import org.jboss.resteasy.annotations.jaxrs.PathParam
import javax.enterprise.inject.Default
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/greeting")
class GreetingResource {
    @Inject
    @field: Default
    lateinit var service: BirthdayService

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    fun greeting(@PathParam("name") name: String): String {
        return service.greeting(name)
    }

}

@Path("/person")
class PersonResource {
    @Inject
    @field: Default
    lateinit var service: PersonRepository

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    fun greeting(@PathParam("name") name: String): String {
        return service.findByName(name)?.toString() ?: ""
    }

}