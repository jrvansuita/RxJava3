package com.vansuita.rxjava.operators.transforming

import android.util.Log
import com.vansuita.rxjava.operators.Operator
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable

class Map : Operator() {

    override fun sample(): Disposable {
        return Observable.fromArray(2, 4, 2)
            .map { "#".repeat(it) }
            .subscribe {
                Log.d(TAG, "onNext: $it")
            }
    }

    override fun detailedSample() {
        Observable.fromArray(1, 2, 3, 4)
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