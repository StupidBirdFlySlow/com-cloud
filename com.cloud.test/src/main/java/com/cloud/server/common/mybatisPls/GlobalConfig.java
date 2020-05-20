package com.cloud.server.common.mybatisPls;

import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.parser.ISqlParser;
import com.baomidou.mybatisplus.plugins.parser.tenant.TenantSqlParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class GlobalConfig {

    @Bean
    public GlobalConfiguration globalConfiguration (){
        GlobalConfiguration globalConfiguration= new GlobalConfiguration();
        MyMetaObjectHandler myMetaObjectHandler=new MyMetaObjectHandler();
        globalConfiguration.setMetaObjectHandler(myMetaObjectHandler);
        return globalConfiguration;
    }
}
