package com.vansuita.rxjava.operators.just

import android.util.Log
import com.vansuita.rxjava.operators.Operator
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable

class FromArray : Operator() {

    override fun sample(): Disposable {
        return Observable.fromArray("First", "Second", "Third")
            .subscribe { Log.d(TAG, "onNext : $it") }
    }
}