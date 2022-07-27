package com.vansuita.rxjava.operators.creational

import android.util.Log
import com.vansuita.rxjava.operators.Operator
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable
import java.util.concurrent.TimeUnit

class Interval : Operator() {
    override fun sample(): Disposable {
        return Observable.interval(1, TimeUnit.SECONDS).subscribe {
            Log.d(TAG, "onNext: Hit")
        }
    }

    override fun detailedSample() {
        //Funciona pra sempre, até com o app em background
        Observable
            .interval(1, TimeUnit.SECONDS)
            .subscribe({
                Log.d(TAG, "onNext: $it")
            }, {
                Log.d(TAG, "onError $it")
            }, {
                Log.d(TAG, "onComplete")
            })
    }


}