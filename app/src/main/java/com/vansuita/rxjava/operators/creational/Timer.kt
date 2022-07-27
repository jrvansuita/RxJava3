package com.vansuita.rxjava.operators.creational

import android.util.Log
import com.vansuita.rxjava.operators.Operator
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable
import java.util.concurrent.TimeUnit

class Timer : Operator() {

    override fun sample(): Disposable {
        return Observable.timer(2, TimeUnit.SECONDS)
            .subscribe {
                Log.d(TAG, "onNext: delayed by 2 seconds")
            }
    }

    override fun detailedSample() {
        Observable
            .timer(2, TimeUnit.SECONDS)
            .subscribe({
                Log.d(TAG, "onNext: $it")
            }, {
                Log.d(TAG, "onError $it")
            }, {
                Log.d(TAG, "onComplete")
            })
    }
}