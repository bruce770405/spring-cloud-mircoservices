package com.bruce.mircoservice.clientservice.service.impl;

import com.bruce.mircoservice.clientservice.entity.BookEntity;
import com.bruce.mircoservice.clientservice.service.TimeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @Recover
 * 定義 Retryable捕捉的錯誤處理, 只能寫在同一個 Class 裡面,
 * 當重試次數超過 maxAttempts 時候會跳到對應的 Recover 來處理,
 * 如果原本的功能有 return 的話, Recover 也要有 return
 *
 *
 *
 *
 *
 */
@Slf4j
@Service(value = "TimeService")
public class TimeServiceImpl implements TimeService {

    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    @Cacheable(cacheNames = "getTime")
    public Date getTime() {
        return new Date();
    }

    @Override
    @Retryable(include = {NoResultException.class}, maxAttempts = 3, backoff = @Backoff(value = 2000))
    public BookEntity getBook() {
        int count = atomicInteger.incrementAndGet();
        log.info("count = " + count);
        if (count < 5) {
            throw new NoResultException();
        } else {
            return new BookEntity();
        }
    }

    @Override
    @Cacheable("currentTimeMillis")
    public Long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }


    @Recover
    public BookEntity recover(NoResultException e) {
        log.info("get NoResultException & return null");
        return null;
    }
}
