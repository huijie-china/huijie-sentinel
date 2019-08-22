package com.alibaba.csp.sentinel.dashboard.rule.gateway;

/**
 * @author : Haifeng.Pang.
 * @version 0.1 : DynamicGatewayRuleProvider v0.1 2019-08-06 17:19 By Kevin.
 * @description :
 */
public interface DynamicGatewayRuleProvider<T> {

    T getRules(String appName, String ip, String port) throws Exception;
}