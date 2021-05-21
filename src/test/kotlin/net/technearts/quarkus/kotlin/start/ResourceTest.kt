package net.technearts.quarkus.kotlin.start

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured
import org.hamcrest.CoreMatchers
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.time.Month
import javax.enterprise.inject.Default
import javax.inject.Inject
import javax.transaction.Transactional

@QuarkusTest
open class GreetingResourceTest {
    @Test
    fun testHelloEndpoint() {
        RestAssured.given()
            .`when`()["/greeting/Chuck"]
            .then()
            .statusCode(200)
            .body(CoreMatchers.`is`("Happy Birthday Chuck"))
    }
}

@QuarkusTest
open class PersonResourceTest {
    @Inject
    @field: Default
    lateinit var repository: PersonRepository

    @Test
    @Transactional
    fun testPersonEndpoint() {
        // creating a person
        val person = Person()
        person.id = 1L
        person.name = "Chuck"
        person.birth = LocalDate.of(1910, Month.FEBRUARY, 1)
        repository.persist(person)

        RestAssured.given()
            .`when`()["/person/Chuck"]
            .then()
            .statusCode(200)
            .log()
    }
}