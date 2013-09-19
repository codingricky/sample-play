import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "sample-play-with-phantomjs"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "com.github.detro.ghostdriver" % "phantomjsdriver" % "1.0.4" % "test"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
