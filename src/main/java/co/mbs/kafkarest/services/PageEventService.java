package co.mbs.kafkarest.services;

import co.mbs.kafkarest.entities.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class PageEventService {
    @Bean
    public Consumer<PageEvent> pageEventConsumer (){
        return (input) -> {
            System.out.println("------------------------");
            System.out.println(input.toString());
            System.out.println("------------------------");
        };
    }
}
