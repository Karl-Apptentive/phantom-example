package example.cassandra
package tables

import com.outworkers.phantom.dsl._

abstract class UserSchema extends Table[UserSchema, entities.User] {
  override def tableName: String = "users"

  object id extends IntColumn with PartitionKey
  object firstName extends StringColumn
  object lastName extends StringColumn
  object dateOfBirth extends LocalDateColumn

  def getUsers = select.fetch()
  def getUser(id: Int) = select.where(_.id eqs id).future()

}
