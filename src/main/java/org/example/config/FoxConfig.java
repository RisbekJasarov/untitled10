package org.example.config;

import org.example.util.PropertyReader;

public class FoxConfig {
    public static final int WEIGHT;
    public static final int SPEED;
    public static final int MAX_STARVING;

    static {
        PropertyReader propertyReader = new PropertyReader("fox.properties");
        WEIGHT = propertyReader.getWeight();
        SPEED = propertyReader.getSpeed();
        MAX_STARVING = propertyReader.getMaxStarving();
    }
}
