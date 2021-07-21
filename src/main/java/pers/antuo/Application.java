package pers.antuo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
@MapperScan(basePackages = "pers.antuo.mapper.mapper1", sqlSessionTemplateRef  = "primarySqlSessionTemplate")
@MapperScan(basePackages = "pers.antuo.mapper.mapper2", sqlSessionTemplateRef  = "secondarySqlSessionTemplate")
public class Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
