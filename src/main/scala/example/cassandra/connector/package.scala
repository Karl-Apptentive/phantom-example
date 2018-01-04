package example.cassandra

import com.outworkers.phantom.connectors.ContactPoint

package object connector {
  private val keyspaceName = "phantom_example"
  lazy val local = ContactPoint.local.keySpace(keyspaceName)
}
