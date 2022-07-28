package com.vansuita.rxjava

import android.util.Log
import com.vansuita.rxjava.operators.Operator.Companion.TAG
import io.reactivex.rxjava3.core.Observable


// ->  https://reactivex.io/documentation/operators.html

class Operators {


    fun buffer() {

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
