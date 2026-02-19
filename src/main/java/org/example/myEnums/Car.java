package org.example.myEnums;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public enum Car {

    MYCARS(List.of("Innova", "Franty", "Zen", "OneThousand")),
    BIKES(List.of("Duke", "Pulsar", "Hayabusa", "R15"));

    List<String> names;

    Car(List<String> str) {
        this.names = str;
    }

}
