package example.cassandra

import example.cassandra.entities.User
import example.cassandra.tables.Database

import org.joda.time.LocalDate

object Example extends App {

  val user = User(1, "unknown", "unknown", new LocalDate(1980, 4, 1))
  Database.saveOrUpdateUser(user)

}
