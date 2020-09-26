package com.general.model;

public class CacheStats {
    private String size;
    private long hits;
    private long missCount;
    private long cacheMissExpiredCount;
    private long expiredCount;
    private long localHeapSizeInBytes;
    private double cacheHitRatio;
    private long cacheMissNotFoundCount;
    private long cachePutCount;
    private long cacheEvictedCount;
    private String associatedCacheName;
    private long maxTimeToLive;
    private long maxTimeToIdle;
    private long localHeapRemoveCount;
    private int totalCachedElements;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public long getHits() {
        return hits;
    }

    public void setHits(long hits) {
        this.hits = hits;
    }

    public long getMissCount() {
        return missCount;
    }

    public void setMissCount(long missCount) {
        this.missCount = missCount;
    }

    public long getCacheMissExpiredCount() {
        return cacheMissExpiredCount;
    }

    public void setCacheMissExpiredCount(long cacheMissExpiredCount) {
        this.cacheMissExpiredCount = cacheMissExpiredCount;
    }

    public long getExpiredCount() {
        return expiredCount;
    }

    public void setExpiredCount(long expiredCount) {
        this.expiredCount = expiredCount;
    }

    public long getLocalHeapSizeInBytes() {
        return localHeapSizeInBytes;
    }

    public void setLocalHeapSizeInBytes(long localHeapSizeInBytes) {
        this.localHeapSizeInBytes = localHeapSizeInBytes;
    }

    public double getCacheHitRatio() {
        return cacheHitRatio;
    }

    public void setCacheHitRatio(double cacheHitRatio) {
        this.cacheHitRatio = cacheHitRatio;
    }

    public long getCacheMissNotFoundCount() {
        return cacheMissNotFoundCount;
    }

    public void setCacheMissNotFoundCount(long cacheMissNotFoundCount) {
        this.cacheMissNotFoundCount = cacheMissNotFoundCount;
    }

    public long getCachePutCount() {
        return cachePutCount;
    }

    public void setCachePutCount(long cachePutCount) {
        this.cachePutCount = cachePutCount;
    }

    public long getCacheEvictedCount() {
        return cacheEvictedCount;
    }

    public void setCacheEvictedCount(long cacheEvictedCount) {
        this.cacheEvictedCount = cacheEvictedCount;
    }

    public String getAssociatedCacheName() {
        return associatedCacheName;
    }

    public void setAssociatedCacheName(String associatedCacheName) {
        this.associatedCacheName = associatedCacheName;
    }

    public long getMaxTimeToLive() {
        return maxTimeToLive;
    }

    public void setMaxTimeToLive(long maxTimeToLive) {
        this.maxTimeToLive = maxTimeToLive;
    }

    public long getMaxTimeToIdle() {
        return maxTimeToIdle;
    }

    public void setMaxTimeToIdle(long maxTimeToIdle) {
        this.maxTimeToIdle = maxTimeToIdle;
    }

    public long getLocalHeapRemoveCount() {
        return localHeapRemoveCount;
    }

    public void setLocalHeapRemoveCount(long localHeapRemoveCount) {
        this.localHeapRemoveCount = localHeapRemoveCount;
    }

    public int getTotalCachedElements() {
        return totalCachedElements;
    }

    public void setTotalCachedElements(int totalCachedElements) {
        this.totalCachedElements = totalCachedElements;
    }

    @Override
    public String toString() {
        return "CacheStats{" +
                "size='" + size + '\'' +
                ", hits=" + hits +
                ", missCount=" + missCount +
                ", cacheMissExpiredCount=" + cacheMissExpiredCount +
                ", expiredCount=" + expiredCount +
                ", localHeapSizeInBytes=" + localHeapSizeInBytes +
                ", cacheHitRatio=" + cacheHitRatio +
                ", cacheMissNotFoundCount=" + cacheMissNotFoundCount +
                ", cachePutCount=" + cachePutCount +
                ", cacheEvictedCount=" + cacheEvictedCount +
                ", associatedCacheName='" + associatedCacheName + '\'' +
                ", maxTimeToLive=" + maxTimeToLive +
                ", maxTimeToIdle=" + maxTimeToIdle +
                ", localHeapRemoveCount=" + localHeapRemoveCount +
                ", totalCachedElements=" + totalCachedElements +
                '}';
    }
}
