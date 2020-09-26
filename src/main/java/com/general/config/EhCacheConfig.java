package com.general.config;

import net.sf.ehcache.config.CacheConfiguration;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class EhCacheConfig extends CachingConfigurerSupport {


    public net.sf.ehcache.CacheManager ehCacheManger() {
        CacheConfiguration cache = new CacheConfiguration();
        cache.setName("testCache");
        cache.setMemoryStoreEvictionPolicy("LRU");
        cache.setMaxEntriesLocalHeap(100);
        cache.setTimeToLiveSeconds(100);
        cache.setTimeToIdleSeconds(600);

        net.sf.ehcache.config.Configuration config = new  net.sf.ehcache.config.Configuration();
        config.addCache(cache);
        return net.sf.ehcache.CacheManager.newInstance(String.valueOf(config));
    }

    public CacheManager cacheManger() {
        return new EhCacheCacheManager(ehCacheManger());
    }
}
