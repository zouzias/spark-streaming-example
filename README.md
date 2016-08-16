# spark-streaming-example

Simple example using Spark Streaming

To run this on your local machine, you need to first run a Netcat server
    
```
nc -lk 9999
```

and then run the example
   
```
$ sbt clean assembly
./spark-submit.sh localhost 9999
```


