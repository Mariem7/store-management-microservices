package com.tn.gatewayservice.routeConfig;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StaticRoutesConfig {

    @Bean
    RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r->r.path("/customers/**").uri("http://localhost:8088/"))
                .route(r->r.path("/products/**").uri("http://localhost:8089/"))
                .build();
    }

}
