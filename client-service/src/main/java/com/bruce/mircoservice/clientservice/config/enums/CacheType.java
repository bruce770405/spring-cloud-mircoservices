package com.bruce.mircoservice.clientservice.config.enums;

public enum CacheType {

    /**
     * 5秒
     */
    getPersonById(5),

    /**
     * 10秒.
     */
    getSomething,

    /**
     * 5分鐘
     */
    getOtherthing(300, 1000);

    CacheType() {
    }

    CacheType(int ttl) {
        this.ttl = ttl;
    }

    CacheType(int ttl, int maxSize) {
        this.ttl = ttl;
        this.maxSize = maxSize;
    }

    private int maxSize = DEFAULT_MAXSIZE;    //最大數量
    private int ttl = DEFAULT_TTL;        //過期時間（秒）

    public int getMaxSize() {
        return maxSize;
    }

    public int getTtl() {
        return ttl;
    }

    public static final int DEFAULT_MAXSIZE = 50000;
    public static final int DEFAULT_TTL = 10;


}
