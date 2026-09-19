package ru.rbpo.task1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InfoController {

    @Value("${greeting.text:Hello Spring!}")
    private String greetingText;

    @GetMapping("/api/greeting")
    public String greeting() {
        return greetingText;
    }

    @GetMapping("/api/fibonacci")
    public List<Long> fibonacci(@RequestParam(defaultValue = "10") int count) {
        List<Long> result = new ArrayList<>();
        long a = 0;
        long b = 1;
        for (int i = 0; i < count; i++) {
            result.add(a);
            long next = a + b;
            a = b;
            b = next;
        }
        return result;
    }

}
