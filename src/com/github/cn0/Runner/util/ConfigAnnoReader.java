package com.github.cn0.Runner.util;

import com.github.cn0.Runner.annotations.Path;
import org.bukkit.configuration.file.FileConfiguration;

import java.lang.reflect.Field;

/**
 * @author Zeno
 */
public class ConfigAnnoReader {

    /**
     * Fills a config class with values given from a config file
     * @param configClass Class to be filled
     * @param configuration Configuration which gives the values
     * @param <T>
     */
    public static <T> void initConfig(Class<T> configClass, FileConfiguration configuration) {
        try {
            T instance = configClass.newInstance();
            for(Field field : configClass.getFields()) {
                if(field.isAnnotationPresent(Path.class))
                    field.set(instance, configuration.get(field.getAnnotation(Path.class).value()));
            }
        } catch(InstantiationException e) {
            e.printStackTrace();
        } catch(IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
