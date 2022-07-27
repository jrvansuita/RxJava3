package com.vansuita.rxjava.operators

import android.util.Log
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

class FromIterable : Operator() {

    override fun sample(): Disposable {
        return Observable.fromIterable(listOf("One", "Two", "Three"))
            .subscribe { Log.d(TAG, "onNext: $it") }
    }

    override fun detailedSample() {
        val list = mutableListOf("One", "Two", "Three")

        val observable = Observable.fromIterable(list)

        val observer = object : Observer<String> {
            override fun onSubscribe(d: Disposable) {
                Log.d(TAG, "onSubscribe")
            }

            override fun onNext(t: String) {
                Log.d(TAG, "onNext: $t")
            }

            override fun onError(e: Throwable) {
                Log.d(TAG, "onError $e")
            }

            override fun onComplete() {
                Log.d(TAG, "onComplete")
            }
        }

        observable.subscribe(observer)
    }
}