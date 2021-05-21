package net.technearts.quarkus.kotlin.start

import java.time.LocalDate
import javax.persistence.*

@Entity
class Person {
    @Id
    var id: Long? = null
    lateinit var name: String
    lateinit var birth: LocalDate
}
