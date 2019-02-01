libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0"

lazy val common = RootProject(file("../common/"))
lazy val proj_test = project.in(file(".")).dependsOn(common)