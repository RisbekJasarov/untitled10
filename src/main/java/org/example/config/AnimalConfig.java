package org.example.config;

import org.example.Animal;
import org.example.Fox;
import org.example.Wolf;

import java.util.*;

public class AnimalConfig {

//    public static final Map<Class<? extends Animal>, Map<Class<? extends Animal>, Integer>> eatingProbability;
    public static final Set<Class<? extends Animal>> animalClasses;

    static {
        animalClasses = Set.of(Fox.class, Wolf.class);
    }

}
