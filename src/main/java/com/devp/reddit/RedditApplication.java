package com.devp.reddit;

import com.devp.reddit.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Import(SwaggerConfiguration.class)
@SpringBootApplication
public class RedditApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

}
