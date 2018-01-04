name := "phantom-example"

version := "0.1"

scalaVersion := "2.12.4"

val phantomVersion = "2.18.0"

resolvers += Resolver.bintrayIvyRepo("outworkers", "oss-releases")

libraryDependencies ++= Seq(
  "com.outworkers" %% "phantom-dsl" % phantomVersion,
  "com.outworkers" %% "phantom-jdk8" % phantomVersion,
  "org.slf4j" % "slf4j-api" % "1.7.5", "org.slf4j" % "slf4j-simple" % "1.7.5"
)
