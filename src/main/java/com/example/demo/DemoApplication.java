package com.example.demo;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.example.demo.mapper")
@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class DemoApplication {
	
	/**
	 * 主程序
	 * 2019-04-10 20:39
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
	 * spring boot应用启动后回调
	 * @param context
	 * @return
	 */
	@Bean
	public ApplicationRunner runner(WebServerApplicationContext context){
		return args -> {
			System.out.println("当前WebServer实现类为：" + context.getWebServer().getClass().getName());
		};
	}


	/**
	 * 启用fastJson，启用后就可以使用@JSONField了，原来的jackson失效
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJsonConfigure(){
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		//日期格式化
		fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
		converter.setFastJsonConfig(fastJsonConfig);
		return new HttpMessageConverters(converter);
	}
}
