import play.sbt.PlayImport._
import sbt._

object AppDependencies {
  val bootStrapPlayVersion = "7.19.0"

  val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc"   %% "bootstrap-frontend-play-28" % bootStrapPlayVersion)

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"   %% "bootstrap-test-play-28"     % bootStrapPlayVersion % "test",
    "org.pegdown"   %  "pegdown"                    % "1.6.0"              % "test",
    "org.scalatest" %% "scalatest"                  % "3.0.8"              % "test")
}
