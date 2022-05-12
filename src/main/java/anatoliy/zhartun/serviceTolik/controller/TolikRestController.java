package anatoliy.zhartun.serviceTolik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/messages")
public class TolikRestController {
    private List<String> messages = Stream.of("Tolik1", "Tolik2", "Tolik3").collect(Collectors.toList());

    @GetMapping
    public List<String> getAllMessages() {
        return messages;
    }
}
