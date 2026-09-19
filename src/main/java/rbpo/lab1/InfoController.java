// тут у нас это контроллер: в нём есть методы, которые должны отвечать на запросы браузера
// == содержимое моего веб-сервиса, ответы на запросы
package rbpo.lab1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //спринг находит этот класс при запуске и запоминает адреса из @GetMapping
public class InfoController {
    //берем текст из application.yml и сохраняем в переменную
    @Value("${greeting.text}")
    private String greetingText;

    @GetMapping("/api/greeting")
    public String greeting() {
        return greetingText;
    }

    @GetMapping("/api/fibonacci")
    public long[] fibonacci(@RequestParam int count) {
        long[] result = new long[count]; //long[]=массив целых чисел
        long first = 0; //long - тип для целых чисел, крупнее, чем int
        long second = 1;

        for (int i = 0; i < count; i++) {
            result[i] = first;

            long next = first + second;
            first = second;
            second = next;
        }

        return result;
    }

}
