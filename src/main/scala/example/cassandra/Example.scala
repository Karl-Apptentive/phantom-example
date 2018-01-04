package example.cassandra

import com.outworkers.phantom.dsl._

import entities.User
import tables.Database

import org.joda.time.LocalDate

object Example extends App {

  Database.createAsync()

  val users = List(
    User(1, "Smith", "Olivia", new LocalDate(1980, 4, 1)),
    User(2, "Evans", "Jam", new LocalDate(1987, 5, 15)),
    User(3, "Williams", "Christian", new LocalDate(1994, 8, 7))
  )

  users.map(user => Database.saveOrUpdateUser(user))
  Database.userModel.getUsers.map(user => println(s"* $user"))

  Database.shutdown()
}
