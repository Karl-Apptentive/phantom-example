package example.cassandra
package tables

import com.outworkers.phantom.dsl._

import scala.concurrent.Future

object Database extends ExampleDatabase(connector.local)

class ExampleDatabase(override val connector: CassandraConnection)
    extends Database[ExampleDatabase](connector) {

  object userModel extends UserSchema with Connector

  def saveOrUpdateUser(user: entities.User): Future[ResultSet] = userModel.store(user).future()
}
