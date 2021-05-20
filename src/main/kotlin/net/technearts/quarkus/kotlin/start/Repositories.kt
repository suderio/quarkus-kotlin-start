package net.technearts.quarkus.kotlin.start

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class PersonRepository: PanacheRepository<Person> {
    fun findByName(name: String) = find("name", name).firstResult()
}
