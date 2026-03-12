package org.example.model.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenericTypes {

    public void wildCardExtends() {

        List<Number> n = new ArrayList<Number>();
        n.add(4);
        n.add(55);
        List<? extends Number> ints = n;

        ints.get(0); // Is ok because getting elements out from the structure.
        // ints.add(44); // Not ok because as `? extends E` do not allowed putting elements into the structure.
    }

    public static <T> void copy(List<? super T> dst, List<? extends T> src) {
        // ? super T = any type which is super type of T
        // ? extends T = any type which is subtype of T
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }

    }

}
