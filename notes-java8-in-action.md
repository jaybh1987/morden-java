
Stream is based on this idea:
- Stream<T> is a sequence of items of type <T>. Think of it as fancy iterator for now. 
- Stream api has methods that can be chained to form a complex pipeline just like unix command with | . 
- It is higher level of abstraction where you think like convert `stream of this` to `stream of that` treating is as writing database query rather then one iteam as time. 
- Java 8 can transperently run your pipeline of Stream operations on several CPU Cores on disjoint parts of the inpute - this is parallelism **almost for free** replace hardwork of thread. 
- Ability to pass code to an API. 



Identity function - function doing nothing more then returning its input argument as is a transformation function. 