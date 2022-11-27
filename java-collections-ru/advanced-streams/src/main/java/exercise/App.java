package exercise;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

// BEGIN
class App {
    public static void main (String[] args) {
        String content = """
                [program:prepare]
                command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make prepare'
                autorestart=false
                environment="X_FORWARDED_MAIL=tirion@google.com,X_FORWARDED_HOME=/home/tirion,language=en"

                [program:http_server]
                command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make environment'
                environment="key5=value5,X_FORWARDED_var3=value,key6=value6\"""";
        String result = getForwardedVariables(content);
        System.out.println(result);
    }
    public static String getForwardedVariables(String content) {

        String[] sort = Stream.of(content)
                .map(x -> x.split("\n"))
                .flatMap((Function<String[], Stream<String>>) strings -> Arrays.stream(strings)
                        .filter(x -> x.startsWith("environment"))
                        .filter(s -> s.contains("X_FORWARDED_"))
                        .map(s -> s.replaceAll("\"", "")))
                .toArray(String[]::new);

        String result = "";
        for (String s: sort) {
            while (s.contains("X_FORWARDED_")) {
                int i = s.indexOf("X_FORWARDED_");
                s = s.substring(i).replaceFirst("X_FORWARDED_", "");
                if (s.contains(",")) {
                    i = s.indexOf(",");
                    result = result.concat(s.substring(0, i)).concat(",");
                    s = s.substring(i);
                } else {
                    result = result.concat(s).concat(",");
                }
            }
        }
        if (result.endsWith(",")) {
            result = result.substring(0, result.length() - 1);
        }
        return result;

    }
}
//END
