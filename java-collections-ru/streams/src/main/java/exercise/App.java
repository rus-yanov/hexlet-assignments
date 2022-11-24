package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static void main (String[] args) {
        String[] emails = {
                "info@gmail.com",
                "info@yandex.ru",
                "mk@host.com",
                "support@hexlet.io",
                "info@hotmail.com",
                "support.yandex.ru@host.com"
        };

        List<String> emailsList = Arrays.asList(emails);
        System.out.println(getCountOfFreeEmails(emailsList));
    }
    public static int getCountOfFreeEmails(List<String> emails) {
         long countOfNonFreeEmails = emails.stream()
                .filter(email -> !email.contains("@gmail.com"))
                .filter(email -> !email.contains("@yandex.ru"))
                .filter(email -> !email.contains("@hotmail.com"))
                .count();

        return emails.size() - (int) countOfNonFreeEmails;
    }
}
// END
