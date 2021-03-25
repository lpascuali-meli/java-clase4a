package meli.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MiFactory {
    public static Object getInstance(String objName) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();
        properties.load(new FileReader("/Users/lpascuali/Documents/Clase6-Java/java-clase4a/src/meli/java/MiFactory.properties"));
        String className = properties.getProperty("sorter");
        System.out.println(className);
        return Class.forName(className).getConstructor().newInstance();
    }
}
