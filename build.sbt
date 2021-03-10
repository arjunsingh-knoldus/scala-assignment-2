name := "ScalaAssignment2"

version := "0.1"

scalaVersion := "2.13.5"
parallelExecution in Test := false
libraryDependencies ++= Seq(
  // test dependencies
  "org.scalatest" %% "scalatest" % "3.2.5" % Test,
)
