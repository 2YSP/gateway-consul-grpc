package cn.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayConsulApplication.class, args);
    }
}
