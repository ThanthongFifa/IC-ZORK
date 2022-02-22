package io.muzoo.ssc.zork.Item;

import io.muzoo.ssc.zork.Item.impl.Potion;
import io.muzoo.ssc.zork.command.Command;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemFactory {

    private static final List<Class<? extends Item>> ITEMS = Arrays.asList(
            Potion.class
    );

    private static final Map<String, Item> ITEM_MAP = new HashMap<>();

    static {{
        for (Class<? extends Item> itemClass: ITEMS){
            try {
                Item item = itemClass.getDeclaredConstructor().newInstance();
                ITEM_MAP.put(item.getName(), item);
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

    public static Item get(String item){
        return ITEM_MAP.get(item);
    }

    public static List<String> getAll(){
        return ITEM_MAP.keySet().stream().collect(Collectors.toList());
    }



}
