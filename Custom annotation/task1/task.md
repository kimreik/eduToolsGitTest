Custom annotation, which allows you to execute a thread a specific amount of times in a row.

1. Create your own annotation "Repeat" with an integer number param.
2. Extend the ThreadPoolExecutor and override method execute: if a class that implements Runnable has annotation Repeat,
   then method run is executed a number of times, that was specified in a Repeat param.