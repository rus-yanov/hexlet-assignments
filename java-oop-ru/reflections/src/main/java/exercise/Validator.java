package exercise;

import java.lang.reflect.Field;
// BEGIN
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

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

    public static Map<String, List<String>> advancedValidate(Address address) {

        Map<String, List<String>> result = new HashMap<>();
        List<String> errors = new ArrayList<>();

        for (Field f : address.getClass().getDeclaredFields()) {
            errors.clear();

            NotNull notNull = f.getAnnotation(NotNull.class);
            if (notNull != null) {
                try {
                    f.setAccessible(true);
                    if (f.get(address) == null) errors.add("field can not be null!");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            MinLength minLength = f.getAnnotation(MinLength.class);
            if(MinLength != null) {
                try {
                    f.setAccessible(true);
                    if ((f.get(address) == null) || ((String) f.get(address)).length() < minLength.minLength()) {
                        errors.add("length less than " + minLength.minLength());
                    }
                } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (!errors.isEmpty()) result.put(f.getName(), new ArrayList<>(errors));
        }
        return result;
    }
}
// END
