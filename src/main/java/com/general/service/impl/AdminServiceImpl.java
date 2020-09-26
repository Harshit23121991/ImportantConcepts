package com.general.service.impl;

import com.general.model.CacheStats;
import com.general.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private CacheManager cacheManager;

    @Override
    public String performCacheCleanup() {
        cacheManager.getCacheNames().parallelStream().forEach(name -> cacheManager.getCache(name).clear());
        return "SUCCESS";
    }

    @Override
    public List<CacheStats> getCacheStats() {
        return cacheManager.getCacheNames().parallelStream().map(name ->{
            Cache cache= cacheManager.getCache(name);
            Object nativeCache = cache.getNativeCache();
            CacheStats stats = null;
            if (nativeCache instanceof net.sf.ehcache.Ehcache) {
                net.sf.ehcache.Ehcache ehcache = (net.sf.ehcache.Ehcache)nativeCache;
                stats = new CacheStats();
                stats.setAssociatedCacheName(ehcache.getStatistics().getAssociatedCacheName());
                stats.setExpiredCount(ehcache.getStatistics().cacheExpiredCount());
                stats.setHits(ehcache.getStatistics().cacheHitCount());
                stats.setCacheMissExpiredCount(ehcache.getStatistics().cacheMissExpiredCount());
                stats.setMissCount(ehcache.getStatistics().cacheMissCount());
                stats.setLocalHeapSizeInBytes(ehcache.getStatistics().getLocalHeapSizeInBytes());
                stats.setCacheHitRatio(ehcache.getStatistics().cacheHitRatio());
                stats.setCacheMissNotFoundCount(ehcache.getStatistics().cacheMissNotFoundCount());
                stats.setCachePutCount(ehcache.getStatistics().cachePutCount());
                stats.setCacheEvictedCount(ehcache.getStatistics().cacheEvictedCount());
                stats.setMaxTimeToIdle(ehcache.getCacheConfiguration().getTimeToIdleSeconds());
                stats.setMaxTimeToLive(ehcache.getCacheConfiguration().getTimeToLiveSeconds());
                stats.setLocalHeapRemoveCount(ehcache.getStatistics().localHeapRemoveCount());
                stats.setTotalCachedElements(ehcache.getKeysWithExpiryCheck().size());
            }
            return stats;
        }).collect(Collectors.toList());
    }
}
