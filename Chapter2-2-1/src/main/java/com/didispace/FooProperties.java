package com.didispace;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "com.didispace.posts")
public class FooProperties {

    private String foo;
    private String databasePlatform;
}