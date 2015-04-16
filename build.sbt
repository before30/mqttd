name := "kumquatt"

version := "1.0"

scalaVersion := "2.11.6"

resolvers += "Paho MQTT Client" at "https://repo.eclipse.org/content/repositories/paho-releases/"

libraryDependencies += "com.typesafe.akka" % "akka-testkit_2.11" % "2.3.9"

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.9"

libraryDependencies += "com.typesafe.akka" % "akka-remote_2.11" % "2.3.9"

//libraryDependencies += "com.github.scodec" % "scodec-bits_2.11.0-M8" % "1.0.0-M1"

libraryDependencies += "org.typelevel" % "scodec-core_2.11" % "1.6.0"

libraryDependencies += "org.eclipse.paho" % "org.eclipse.paho.client.mqttv3" % "1.0.2"
