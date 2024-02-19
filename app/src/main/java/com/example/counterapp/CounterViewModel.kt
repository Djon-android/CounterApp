package com.example.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel(): ViewModel() {

    private val repository = CounterRepository()

    private val _count = mutableIntStateOf(repository.getCounter().count)
    val count: MutableState<Int> = _count

    fun increment() {
        repository.incrementCounter()
        _count.intValue = repository.getCounter().count
    }

    fun decrement() {
        repository.decrementCounter()
        _count.intValue = repository.getCounter().count
    }
}