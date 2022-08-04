val scala3Version = "3.1.3"

githubOwner := "metabookmarks"
githubRepository := "testlib"

lazy val root = project
  .in(file("."))
  .settings(
    name := "testlib",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
