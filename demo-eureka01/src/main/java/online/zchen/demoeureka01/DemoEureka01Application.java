package online.zchen.demoeureka01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启 EurekaServer
public class DemoEureka01Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoEureka01Application.class, args);
    }

}
