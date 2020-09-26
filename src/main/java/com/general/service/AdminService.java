package com.general.service;

import com.general.model.CacheStats;

import java.util.List;

public interface AdminService {

    String performCacheCleanup();

    List<CacheStats> getCacheStats();
}
