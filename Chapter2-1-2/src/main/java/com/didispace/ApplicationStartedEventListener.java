package com.didispace;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

import java.util.Arrays;

@Slf4j
public class ApplicationStartedEventListener
        implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        log.info("......Application Started Event......");
        log.info("Application Args: {}", Arrays.toString(event.getArgs()));
    }

}
