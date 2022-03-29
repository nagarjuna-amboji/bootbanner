package com.abc;

import com.abc.bean.Bike;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootBannerApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder applicationBuilder =
                new SpringApplicationBuilder(BootBannerApplication.class);
        applicationBuilder.bannerMode(Banner.Mode.OFF);
        SpringApplication application = applicationBuilder.build();
        ApplicationContext context = application.run(args);
        Bike bike = context.getBean(Bike.class);
        bike.run();

    }


}
