package manager;

import exceptions.NoElementException;
import locality.City;
import locality.generators.IDGenerator;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashMap;
@Getter
@Setter
public class CollectionManager {
    private static LinkedHashMap<String, City> hashmap = new LinkedHashMap<>();
    private static LocalDate date;
    public CollectionManager() {
        hashmap = new LinkedHashMap<>();
        date = LocalDate.now();
        new IDGenerator();
    }
    public static void add(String key, City city) {
        if (hashmap == null) {
            hashmap = new LinkedHashMap<>();
        }
        hashmap.put(key, city);
        IDGenerator.add(city.getId());
    }
    public static void remove(String key) throws NoElementException {
        if (hashmap == null || !CollectionManager.hashmap.containsKey(key)) {
            throw new NoElementException(key);
        } else {
            IDGenerator.remove(CollectionManager.hashmap.get(key).getId());
            hashmap.remove(key);
        }
    }


}
