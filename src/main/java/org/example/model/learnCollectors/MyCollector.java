package org.example.model.learnCollectors;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;


/*
* T is generic type of the items in the stream to be collected.
* A is type of accumulator, the object on which the partial result will be accumulated during the collection process
* R is the type of object typically, but not always the collection resulting from the collect operation.
*
* */
public interface MyCollector<T, A, R> {

    /*
    * Supplier method has to return supplier of an empty result.
    * A parameter less function that when invoked creates an instance of an empty accumulator used during the collection process.
    * */
    Supplier<A> supplier();

    /*
    * Accumulator method returns the function that performs the reduction operation.
    * During the traversal function is applied on 2 arguments, the accumulator being the result of the reduction.
    * This function returns void because accumulator is modified in place, i.e internal state is changed by the fun application to reflect the effect of the traversed element.
    * */
    BiConsumer<A, T> accumulator();
    Function<A, R> finisher();
    BinaryOperator<A> container();
    Set<Collector.Characteristics> characteristics();
}
