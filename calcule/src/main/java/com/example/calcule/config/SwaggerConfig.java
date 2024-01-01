package com.example.calcule.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition( info = @Info(
        title = "${calcule.name}",
        version = "${calcule.version}"
))
public class SwaggerConfig {
}
