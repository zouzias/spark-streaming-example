organization := "org.zouzias"
name := "spark-streaming-example"
version := "0.0.1"
scalaVersion := "2.11.8"
val sparkV = "1.6.3"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % sparkV % "provided",
	"org.apache.spark" %% "spark-sql" % sparkV % "provided" ,
	"org.apache.spark" %% "spark-streaming" % sparkV % "provided" ,
	"com.holdenkarau"  %% "spark-testing-base" % s"${sparkV}_0.6.0" % "test" intransitive(),
	"org.scala-lang"    % "scala-library" % scalaVersion.value % "compile"
)
