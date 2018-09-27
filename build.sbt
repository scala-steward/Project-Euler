crossScalaVersions := Seq("2.12.7")
scalaVersion := crossScalaVersions.value.head

libraryDependencies +=
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"

Compile / scalaSource := baseDirectory.value / "src" / "main"
Test / scalaSource := baseDirectory.value / "src" / "test"

scalacOptions ++= Seq(
  "-encoding", "us-ascii",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-Xlint",
  "-Ywarn-value-discard",
  "-Xfatal-warnings"
)

scalastyleFailOnWarning := true
scalastyleFailOnError := true
