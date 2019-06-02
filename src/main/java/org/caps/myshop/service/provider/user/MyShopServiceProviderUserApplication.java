package org.caps.myshop.service.provider.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author caps
 */
@SpringBootApplication(scanBasePackages = "org.caps.myshop")
@EnableDiscoveryClient
@MapperScan(basePackages = "org.caps.myshop.commons.mapper")
@EnableSwagger2
public class MyShopServiceProviderUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceProviderUserApplication.class, args);
    }
}
