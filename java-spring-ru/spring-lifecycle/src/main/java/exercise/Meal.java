package exercise;

import javax.annotation.PostConstruct;

// BEGIN
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
// END
public class Meal {
    public String getMealForDaytime(String daytime) {

        switch (daytime) {
            case "morning":
                return "breakfast";
            case "day":
                return "lunch";
            case "evening":
                return "dinner";
            default:
                return "nothing :)";
        }
    }

    // Для самостоятельной работы
    // BEGIN
    @PostConstruct
    public void init() {
        System.out.println("Init bean meal");
    }
    // END
}
