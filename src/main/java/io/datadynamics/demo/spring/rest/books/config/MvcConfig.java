package io.datadynamics.demo.spring.rest.books.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.datadynamics.demo.spring.rest.books.events.AuthorEventHandler;
import io.datadynamics.demo.spring.rest.books.events.BookEventHandler;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

    public MvcConfig() {
        super();
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    AuthorEventHandler authorEventHandler() {
        return new AuthorEventHandler();
    }

    @Bean
    BookEventHandler bookEventHandler() {
        return new BookEventHandler();
    }

}
