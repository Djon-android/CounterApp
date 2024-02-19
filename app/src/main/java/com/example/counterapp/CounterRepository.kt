package com.example.counterapp

class CounterRepository {
    private var counter = CounterModel(0)

    fun getCounter() = counter

    fun incrementCounter() {
        counter.count++
    }

    fun decrementCounter() {
        counter.count--
    }
}