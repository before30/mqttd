name := "kumquatt"

version := "1.0"

scalaVersion := "2.11.7"

resolvers ++= {
  Seq(
    "repo" at "http://repo.typesafe.com/typesafe/releases/",
    "Paho MQTT Client" at "https://repo.eclipse.org/content/repositories/paho-releases/"
  )
}

libraryDependencies ++= {
  val akkaVersion = "2.3.9"

  Seq(
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-remote" % akkaVersion,
    "com.typesafe.akka" %% "akka-contrib" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
    "junit" % "junit" % "4.10",
    "org.typelevel" % "scodec-core_2.11" % "1.6.0",
    "org.eclipse.paho" % "org.eclipse.paho.client.mqttv3" % "1.0.2",
    "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
    "ch.qos.logback" % "logback-classic" % "1.1.2"
  )
}

