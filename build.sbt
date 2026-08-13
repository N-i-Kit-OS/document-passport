name := "document-passport"
version := "0.1.0"
scalaVersion := "2.13.14"
libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.5.0",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.5.0",
  "org.postgresql" % "postgresql" % "42.7.3",
  "org.flywaydb" % "flyway-core" % "9.22.3",
  "com.typesafe" % "config" % "1.4.2"
)