package org.example.model.general;

import java.util.stream.IntStream;

public class TypeTest {

    public static boolean isPrime(int candidate) {
        return IntStream.range(2, candidate).noneMatch(i -> candidate % i == 0);
    }

    public static void main(String[] args) {

        boolean p = isPrime(2);

        System.out.println(p);
    }
}
