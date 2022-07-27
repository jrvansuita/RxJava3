package com.vansuita.rxjava.operators

import android.util.Log
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import java.util.*

class Just : Operator() {

    override fun sample(): Disposable {
        return Observable.just(1, "Two", false, Date()).subscribe { Log.d(TAG, "onNext: $it") }
    }

    override fun detailedSample() {
        val observable = Observable.just(1, "Two", false, Date())

        val observer = object : Observer<Any> {
            override fun onSubscribe(d: Disposable) {
                Log.d(TAG, "onSubscribe")
            }

            override fun onNext(t: Any) {
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