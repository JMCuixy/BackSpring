package com.spring.back.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

/**
 * Created by XiuYin.Cui on 2018/1/8.
 */
@Configuration
@ComponentScan(basePackages = "com.spring.back")
public class Config {

    @Bean(name = "dataSourceOfJNDI2")
    public JndiObjectFactoryBean dataSource(){
        JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
        jndiObjectFactoryBean.setJndiName("jdbc/mysql");
        jndiObjectFactoryBean.setResourceRef(true);
        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
        return jndiObjectFactoryBean;
    }

    @Bean(name = "dataSourceOfJDBC2")
    public DataSource dataSource4(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://gr3ac44b.summersoft.ali-sh-s1.goodrain.net:20628/yycx_uat?useUnicode=true&amp;characterEncoding=utf-8&amp;allowMultiQueries=true&amp;zeroDateTimeBehavior=convertToNull");
        driverManagerDataSource.setUsername("admin");
        driverManagerDataSource.setPassword("be4cc15e");
        return driverManagerDataSource;
    }

    @Bean(name = "jdbcTemplate2")
    public JdbcTemplate getJdbcTemplate(DataSource dataSourceOfJNDI2){
        return new JdbcTemplate(dataSourceOfJNDI2);
    }
}
