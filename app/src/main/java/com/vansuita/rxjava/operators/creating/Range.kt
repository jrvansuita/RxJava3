package com.vansuita.rxjava.operators.creating

import android.util.Log
import com.vansuita.rxjava.operators.Operator
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable

class Range : Operator() {

    override fun sample(): Disposable {
        return Observable.range(5, 3).subscribe { Log.d(TAG, "onNext: $it") }
    }

    override fun detailedSample() {
        Observable.range(5, 5)
            .subscribe({
                Log.d(TAG, "onNext: $it")
            }, {
                Log.d(TAG, "onError $it")
            }, {
                Log.d(TAG, "onComplete")
            })
    }

}