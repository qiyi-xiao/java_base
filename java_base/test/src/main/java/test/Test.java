package test;

/**
 * @description:
 * @author: junmo
 * @create: 2021-07-16 10:23
 **/

public class Test {

    public static void main(String[] args) {
        String s = "123";
        changeStr(s);
        System.out.println(s);
    }

    public static void changeStr(String s){
        s = "234";
    }
}

spring:
        cloud:
        sentinel:
        transport:
        dashboard: 172.19.0.17:8890
        port: 8890
        eager: true
        gateway:
        discovery:
        locator:
        enabled: true
        lower-case-service-id: true
        routes:
        # 用户服务
        - id: mico-provider-wallet
        uri: lb://mico-provider-wallet
        predicates:
        - Path=/api/wallet/**
 filters:
 - StripPrefix=2
 # 翻译服务
 - id: mico-provider-translate
 uri: lb://mico-provider-translate
 predicates:
 - Path=/api/translate/**
 filters:
 - StripPrefix=2
 # 授权服务
 - id: mico-oauth
 uri: lb://mico-oauth
 predicates:
 - Path=/api/oauth/**
 filters:
 - StripPrefix=1
 # 短信服务
 - id: mico-provider-sms
 uri: lb://mico-provider-sms
 predicates:
 - Path=/api/sms/**
 filters:
 - StripPrefix=2
 # 用户服务
 - id: mico-provider-user
 uri: lb://mico-provider-user
 predicates:
 - Path=/api/users/**
 filters:
 - StripPrefix=2
 # 文本检测
 - id: mico-provider-content
 uri: lb://mico-provider-content
 predicates:
 - Path=/api/content/**
 filters:
 - StripPrefix=2
 - id: mico-provider-cashout
 uri: lb://mico-provider-cashout
 predicates:
 - Path=/api/cashout/**
 filters:
 - StripPrefix=2
 - id: mico-provider-config
 uri: lb://mico-provider-config
 predicates:
 - Path=/api/config/**
 filters:
 - StripPrefix=2
 - id: golang-test
 uri: lb://go-test
 predicates:
 - Path=/api/golang/**
 filters:
 - StripPrefix=0
 security:
 oauth2:
 resourceserver:
 jwt:
 public-key-location: classpath:public-key-prod.txt
 secure:
 ignore:
 urls: #配置白名单路径
 - "/api/ab_test/config"
 - "/collect/client"
 - "/api/config"
 - "/api/oauth/token"
 - "/api/wallet/pay/callback/airwallex/notify"
 - "/api/wallet/pay/callback/payoneer/notify"
 - "/gateway"
 - "/api"
 - "/flow"
 - "/doc.html"
 - "/swagger-resources/**"
 - "/swagger/**"
 - "/api/*/api-docs"
        - "/*/*.js"
        - "/*/*.css"
        - "/*/*.png"
        - "/*/*.ico"
        - "/webjars/**"
        - "/webjars/springfox-swagger-ui/**"
        - "/actuator/**"
        - "/api/*/v2/api-docs"
        ip:
        whitelist:
        - "129.226.191.39"
        - "101.32.176.159"
        - "128.1.137.32"
        - "52.198.233.66"
        blacklist:
        - "x.x.x.x"

        log:
        config:
        openResponseLog: true
