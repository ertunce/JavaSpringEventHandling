package com.bilgeadam.JavaSpringEventHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class EventPublisherService {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void publishCustomEvent(String message) {
        CustomEvent customEvent = new CustomEvent(this, message);
        publisher.publishEvent(customEvent);
    }
}
