package com.teachmeskills.hw17.task1.myfunc;

/**
 * Generalized Functional Interface.
 *
 * @param <T>
 */
@FunctionalInterface
public interface MyFunc<T> {
    T doSomething(T obj);
}
