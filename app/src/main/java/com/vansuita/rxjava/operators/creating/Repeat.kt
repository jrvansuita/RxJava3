package com.vansuita.rxjava.operators.creating

import android.util.Log
import com.vansuita.rxjava.operators.Operator
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable

class Repeat : Operator() {
    override fun sample(): Disposable {
        return Observable.just("My Text").repeat(2).subscribe {
            Log.d(TAG, "onNext: $it")
        }
    }

    override fun detailedSample() {
        Observable.range(40, 5)
            .repeat(3)
            .subscribe({
                Log.d(TAG, "onNext: $it")
            }, {
                Log.d(TAG, "onError $it")
            }, {
                Log.d(TAG, "onComplete")
            })
    }
}