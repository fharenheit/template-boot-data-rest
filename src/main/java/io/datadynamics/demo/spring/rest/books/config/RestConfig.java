package io.datadynamics.demo.spring.rest.books.config;

import io.datadynamics.demo.spring.rest.books.projections.CustomBook;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.ExposureConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration) {
        repositoryRestConfiguration.getProjectionConfiguration().addProjection(CustomBook.class);
        ExposureConfiguration config = repositoryRestConfiguration.getExposureConfiguration();
        //config.forDomainType(WebsiteUser.class).withItemExposure((metadata, httpMethods) -> httpMethods.disable(HttpMethod.PATCH));
    }
}
