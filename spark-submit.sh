#!/usr/bin/env bash

CURRENT_DIR=`pwd`

# Assumes that spark is installed under home directory
HOME_DIR=`echo ~`
#export SPARK_LOCAL_IP=localhost
SPARK_HOME=${HOME_DIR}/spark-2.4.0-bin-hadoop2.7

# spark-lucenerdd assembly JAR
MAIN_JAR=${CURRENT_DIR}/target/scala-2.11/spark-streaming-example-assembly-0.0.1.jar

echo "Loading JAR: ${MAIN_JAR}"

# Run spark shell locally
${SPARK_HOME}/bin/spark-submit   --conf "spark.executor.memory=512m" \
				--conf "spark.driver.memory=512m" \
				--master local[2] \
				--class org.zouzias.spark.streaming.example.StatefulNetworkWordCount \
				--jars ${MAIN_JAR} \
                ${MAIN_JAR} $@
