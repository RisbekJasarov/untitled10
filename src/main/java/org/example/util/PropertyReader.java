package org.example.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    private final String propertiesName;
    private Properties properties = new Properties();

    public PropertyReader(String propertiesName) {
        this.propertiesName = propertiesName;
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(propertiesName)){
            if(inputStream!=null){
                properties.load(inputStream);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public int getWeight(){
        return Integer.valueOf(properties.getProperty("weight"));
    }

    public int getSpeed(){
        return Integer.valueOf(properties.getProperty("speed"));
    }

    public int getMaxStarving(){
        return Integer.valueOf(properties.getProperty("maxStarving"));
    }

}
