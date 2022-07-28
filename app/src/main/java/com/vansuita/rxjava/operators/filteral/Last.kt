package com.vansuita.rxjava.operators.filteral

import android.util.Log
import com.vansuita.rxjava.operators.Operator
import com.vansuita.rxjava.operators.model.User
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable

class Last : Operator() {

    override fun <T> with(): List<User> {
        return listOf(
            User("Bernardo", 4),
            User("Matheus", 2),
            User("Paula", 27),
            User("Junior", 30)
        )
    }

    override fun sample(): Disposable {
        return Observable.fromArray("Yellow", "Blue", "Green", "Black")
            .lastElement()
            .subscribe {
                Log.d(TAG, "onNext: $it")
            }
    }

    override fun detailedSample() {
        Observable.fromIterable(this.with<List<User>>())
            .lastOrError()
            .subscribe({
                Log.d(TAG, "onNext: ${it.name} - ${it.age}")
            }, {
                Log.d(TAG, "onError $it")
            })
    }
}