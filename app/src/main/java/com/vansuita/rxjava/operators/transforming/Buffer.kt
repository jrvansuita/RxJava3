package com.vansuita.rxjava.operators.transforming

import android.util.Log
import com.vansuita.rxjava.operators.Operator
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable

class Buffer : Operator() {


    override fun <T> with(): List<String> {
        return listOf("Blue", "Red", "Green", "White")
    }

    override fun sample(): Disposable {
        return Observable.just("Mother", "Father", "Daughter", "Son")
            .buffer(2)
            .subscribe {
                Log.d(TAG, "onNext: $it")
            }
    }

    override fun detailedSample() {
        Observable.fromIterable(this.with<List<String>>())
            .buffer(2)
            .subscribe({
                Log.d(TAG, "onNext: ${it.toTypedArray().contentToString()}")
            }, {
                Log.d(TAG, "onError $it")
            })
    }
}