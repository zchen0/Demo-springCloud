package online.zchen.demoeureka02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启 EurekaServer
public class DemoEureka02Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoEureka02Application.class, args);
    }

}
