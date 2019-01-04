organization := "org.zouzias"
name := "spark-streaming-example"
version := "0.0.1"
scalaVersion := "2.11.8"
val sparkV = "2.4.0"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % sparkV % "provided",
	"org.apache.spark" %% "spark-sql" % sparkV % "provided" ,
	"org.apache.spark" %% "spark-streaming" % sparkV % "provided" ,
	"com.holdenkarau"  %% "spark-testing-base" % s"2.3.1_0.10.0" % "test" intransitive(),
	"org.scala-lang"    % "scala-library" % scalaVersion.value % "compile"
)
