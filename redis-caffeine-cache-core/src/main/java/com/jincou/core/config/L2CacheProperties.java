package com.jincou.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;




@ConfigurationProperties(prefix = "l2cache")
public class L2CacheProperties {
    /**
     * 缓存配置
     */
    private L2CacheConfig config;

    public L2CacheConfig getConfig() {
        return config;
    }

    public void setConfig(L2CacheConfig config) {
        this.config = config;
    }
}
