package com.cloud.server;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration // 让Spring来加载该类配置
@EnableSwagger2 // 启用Swagger2
public class Swagger2Config {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo("测试")).select()
				// 扫描指定包中的swagger注解
				// .apis(RequestHandlerSelectors.basePackage("com.xia.controller"))
				// 扫描所有有注解的api，用这种方式更灵活
				.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).paths(PathSelectors.any())
				.build().groupName("all全部接口");
	}

	private ApiInfo apiInfo(String title) {
		return new ApiInfoBuilder().title(title).contact("测试").version("1.0.0").build();
	}
}
