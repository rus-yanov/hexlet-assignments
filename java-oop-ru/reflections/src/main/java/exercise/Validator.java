package exercise;

import java.lang.reflect.Field;
// BEGIN
import java.util.List;
import java.util.ArrayList;

class Validator {
    public static List<String> validate(Address address) {
        List<String> result = new ArrayList<>();
        for (Field f : address.getClass().getDeclaredFields()) {
            NotNull notNull = f.getAnnotation(NotNull.class);
            if (notNull != null) {
                try {
                    f.setAccessible(true);
                    if (f.get(address) == null) result.add(f.getName());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
// END
