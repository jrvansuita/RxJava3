package com.vansuita.rxjava.operators.conditional

import android.util.Log
import com.vansuita.rxjava.operators.Operator
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable
import java.util.concurrent.TimeUnit

class TakeWhile : Operator() {

    override fun sample(): Disposable {
        return Observable
            .interval(1, TimeUnit.SECONDS)
            .takeWhile { it <= 3 }
            .subscribe {
                Log.d(TAG, "onNext: $it - Hit")
            }
    }

    override fun detailedSample() {
        //Funciona enquanto menor ou igual a 10 segundos
        Observable
            .interval(1, TimeUnit.SECONDS)
            .takeWhile { it <= 10 }
            .subscribe({
                Log.d(TAG, "onNext: $it")
            }, {
                Log.d(TAG, "onError $it")
            }, {
                Log.d(TAG, "onComplete")
            })
    }
}