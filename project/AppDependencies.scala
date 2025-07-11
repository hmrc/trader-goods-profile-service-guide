import play.sbt.PlayImport.*
import sbt.*

object AppDependencies {
  val bootStrapPlayVersion = "9.16.0"

  val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-30" % bootStrapPlayVersion
  )

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"         %% "bootstrap-test-play-30" % bootStrapPlayVersion % "test",
    "com.vladsch.flexmark" % "flexmark-all"           % "0.64.0"             % "test",
    "org.scalatest"       %% "scalatest"              % "3.2.19"             % "test"
  )
}
