package com.vansuita.rxjava.operators

import android.util.Log
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable

class Range : Operator() {
    override fun sample(): Disposable {
        Observable.range(5, 3).subscribe { Log.d(TAG, "onNext: $it") }

        return Observable.range(5, 3)
            .subscribe({
                Log.d(TAG, "onNext: $it")
            }, {
                Log.d(TAG, "onError $it")
            }, {
                Log.d(TAG, "onComplete")
            })
    }
}