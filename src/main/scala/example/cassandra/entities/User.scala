package example.cassandra.entities

import org.joda.time.LocalDate

case class User(id: Int, firstName: String, lastName: String, dateOfBirth: LocalDate)
