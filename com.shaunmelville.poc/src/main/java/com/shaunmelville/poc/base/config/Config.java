package com.shaunmelville.poc.base.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Config {
	
	@Bean
	public CommonsRequestLoggingFilter requestLoggingFilter() {
		CommonsRequestLoggingFilter filter
        = new CommonsRequestLoggingFilter();
      filter.setIncludeQueryString(true);
      filter.setIncludePayload(true);
      filter.setMaxPayloadLength(10000);
      filter.setIncludeHeaders(true);
      filter.setAfterMessagePrefix("REQUEST DATA : ");
      return filter;
	}
	
	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2);
    }

	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}

}