package com.vansuita.rxjava.operators.creating

import android.util.Log
import com.vansuita.rxjava.operators.Operator
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

class FromIterable : Operator() {

    override fun <T> with() = listOf("One", "Two", "Three")

    override fun sample(): Disposable {
        return Observable.fromIterable(this.with<List<String>>())
            .subscribe { Log.d(TAG, "onNext: $it") }
    }

    override fun detailedSample() {
        val observable = Observable.fromIterable(this.with<List<String>>())

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