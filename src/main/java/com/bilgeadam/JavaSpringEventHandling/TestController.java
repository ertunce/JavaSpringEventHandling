package com.bilgeadam.JavaSpringEventHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private EventPublisherService eventPublisherService;

    @GetMapping("/trigger-event")
    public String triggerEvent() {
        eventPublisherService.publishCustomEvent("Hello from the event!");
        return "Event triggered";
    }
}
