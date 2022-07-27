package com.vansuita.rxjava

import android.util.Log
import com.vansuita.rxjava.operators.Operator.Companion.TAG
import io.reactivex.rxjava3.core.Observable


// ->  https://reactivex.io/documentation/operators.html

class Operators {


    fun filter() {
        class User(val name: String, val age: Int)

        val users =
            listOf(User("Bernardo", 4), User("Matheus", 2), User("Paula", 27), User("Junior", 30))

        Observable.fromIterable(users)
            .filter { it.age < 10 }
            .subscribe({
                Log.d(TAG, "onNext: ${it.name} - ${it.age}")
            }, {
                Log.d(TAG, "onError $it")
            }, {
                Log.d(TAG, "onComplete")
            })
    }

    fun last() {
        class User(val name: String, val age: Int)

        val users =
            listOf(User("Bernardo", 4), User("Matheus", 2), User("Paula", 27), User("Junior", 30))

        Observable.fromIterable(users)
            .filter { it.age > 10 }
            .lastElement()
            .subscribe({
                Log.d(TAG, "onNext: ${it.name} - ${it.age}")
            }, {
                Log.d(TAG, "onError $it")
            })
    }

    fun distinct() {

        class Fruit(val name: String)

        val fruits =
            listOf(Fruit("Apple"), Fruit("Apple"), Fruit("Grape"), Fruit("Banana"))

        Observable.fromIterable(fruits)
            .distinct { it.name }
            .subscribe({
                Log.d(TAG, "onNext: ${it.name}")
            }, {
                Log.d(TAG, "onError $it")
            })
    }

    fun skip() {

        class Fruit(val name: String)

        val fruits =
            listOf(Fruit("Orange"), Fruit("Apple"), Fruit("Grape"), Fruit("Banana"))

        Observable.fromIterable(fruits)
            .skip(1)
            .distinct()
            .skipLast(1)
            .subscribe({
                Log.d(TAG, "onNext: ${it.name}")
            }, {
                Log.d(TAG, "onError $it")
            })
    }

    fun buffer() {
        val colors = listOf("Blue", "Red", "Green", "White")

        Observable.fromIterable(colors)
            .buffer(2)
            .subscribe({
                Log.d(TAG, "onNext: ${it.toTypedArray().contentToString()}")
            }, {
                Log.d(TAG, "onError $it")
            })
    }

    fun map() {
        val repeats = listOf(1, 2, 3, 4)

        Observable.fromIterable(repeats)
            .map {
                "X".repeat(it)
            }
            .subscribe({
                Log.d(TAG, "onNext: $it")
            }, {
                Log.d(TAG, "onError $it")
            })
    }
}
