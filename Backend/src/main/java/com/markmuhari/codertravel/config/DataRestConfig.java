package com.markmuhari.codertravel.config;

import com.markmuhari.codertravel.domain.Destination;
import com.markmuhari.codertravel.domain.Location;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};

        /* Disable HTTP methods for Destination: Put, Post, Delete until security isn't done */
        config.getExposureConfiguration()
                .forDomainType(Destination.class)
                .withItemExposure((metdata, httpMethode) -> httpMethode.disable(theUnsupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));

        /* Disable HTTP methods for Location: Put, Post, Delete until security isn't done */
        config.getExposureConfiguration()
                .forDomainType(Location.class)
                .withItemExposure((metdata, httpMethode) -> httpMethode.disable(theUnsupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
    }
}
