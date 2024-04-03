package locality.generators;

import java.util.ArrayList;

public class IDGenerator {
    private static final Integer max = 999999999;
    private static final Integer min = 100000000;
    private static ArrayList<Integer> IdList = new ArrayList<>();
    public IDGenerator() {
        IdList = new ArrayList<>();
    }
    public static Integer generateId() {
        Integer id = (int) Math.floor(Math.random() * (max - min + 1)) + min;
        while (IdList.contains(id)) {
            id = (int) Math.floor(Math.random() * (max - min + 1)) + min;
        }
        IdList.add(id);
        return id;
    }
    public static boolean idIsUnique(Integer id) {
        if (IdList.contains(id)) {
            return false;
        }
        return true;
    }

    public static void add(Integer id) {
        IdList.add(id);
    }
    public static void remove(Integer id) {
        IdList.remove(id);
    }
}
