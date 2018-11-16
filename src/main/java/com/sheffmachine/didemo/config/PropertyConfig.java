package com.sheffmachine.didemo.config;

import com.sheffmachine.didemo.examplebeans.FakeDataSource;
import com.sheffmachine.didemo.examplebeans.FakeJmsDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
public class PropertyConfig {
    @Value("${sheff.username}")
    String user;
    @Value("${sheff.password}")
    String password;
    @Value("${sheff.dburl}")
    String dburl;

    @Value("${sheff.jms.username}")
    String jmsUser;
    @Value("${sheff.jms.password}")
    String jmsPassword;
    @Value("${sheff.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource getFakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(dburl);
        return fakeDataSource;
    }

    @Bean
    FakeJmsDataService getFakeJmsBroker() {
        FakeJmsDataService fakeJmsDataService = new FakeJmsDataService();
        fakeJmsDataService.setJmsUser(jmsUser);
        fakeJmsDataService.setJmsPassword(jmsPassword);
        fakeJmsDataService.setJmsUrl(jmsUrl);
        return fakeJmsDataService;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
