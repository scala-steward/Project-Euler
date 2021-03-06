scalaVersion := "0.25.0-RC2"

libraryDependencies += "org.scalameta" %% "munit" % "0.7.10"
testFrameworks += new TestFramework("munit.Framework")

scalacOptions ++= Seq(
  "-encoding", "us-ascii",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-Xfatal-warnings",
  "-language:implicitConversions",  // TODO
)
