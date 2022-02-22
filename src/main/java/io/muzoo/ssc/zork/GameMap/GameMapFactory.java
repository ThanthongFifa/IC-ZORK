package io.muzoo.ssc.zork.GameMap;

import io.muzoo.ssc.zork.GameMap.Maps.map1;
import io.muzoo.ssc.zork.GameMap.Maps.map2;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameMapFactory {

    private static final List<Class<? extends GameMap>> MAPS = Arrays.asList(
            map1.class,
            map2.class
    );

    private static final Map<String, GameMap> GAMEMAP_MAP = new HashMap<>();

    static {{
        for (Class<? extends GameMap> mapClass: MAPS){
            try {
                GameMap map = mapClass.getDeclaredConstructor().newInstance();
                GAMEMAP_MAP.put(map.name(), map);
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }}

    public static GameMap get(String map){
        return GAMEMAP_MAP.get(map);
    }


}
