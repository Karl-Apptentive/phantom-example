package example.cassandra
package tables

import com.outworkers.phantom.dsl._

object Database extends ExampleDatabase(connector.local)

class ExampleDatabase(override val connector: CassandraConnection)
    extends Database[ExampleDatabase](connector) {

  object userModel extends UserSchema with Connector

  def saveOrUpdateUser(user: entities.User) = userModel.store(user)
}
