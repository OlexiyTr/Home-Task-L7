package com.example.class_work_l8

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger

var counter = AtomicInteger(0)

fun main(){
    val increaseCounter = Runnable {
        counter.incrementAndGet()
    }

    val printCounter = Runnable {
        println(counter)
    }

    val executor = Executors.newScheduledThreadPool(5)
    
    executor.scheduleAtFixedRate(increaseCounter, 1, 10, TimeUnit.MILLISECONDS)
    executor.scheduleAtFixedRate(increaseCounter, 1, 10, TimeUnit.MILLISECONDS)
    executor.scheduleAtFixedRate(increaseCounter, 1, 10, TimeUnit.MILLISECONDS)
    executor.scheduleAtFixedRate(increaseCounter, 1, 10, TimeUnit.MILLISECONDS)
    executor.scheduleAtFixedRate(printCounter, 1, 1000, TimeUnit.MILLISECONDS)
}