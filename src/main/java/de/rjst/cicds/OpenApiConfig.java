package de.rjst.cicds;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .addServersItem(new Server().url("https://cicd.rjst.de"))
            .info(new Info()
                .title("Customer Service API")
                .version("v1")
                .description("Provides customer data and operations.")
            );
    }
}
