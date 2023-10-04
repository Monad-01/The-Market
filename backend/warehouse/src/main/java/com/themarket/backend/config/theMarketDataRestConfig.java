package com.themarket.backend.config;

import com.themarket.backend.entity.Product;
import com.themarket.backend.entity.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class theMarketDataRestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);

        HttpMethod[] restrictedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};

        // Disables HTTP methods for Product: PUT, POST, and DELETE
        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(restrictedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(restrictedActions));

        // Disables HTTP methods for ProductCategory: PUT, POST, and DELETE
        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(restrictedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(restrictedActions));
    }
}
