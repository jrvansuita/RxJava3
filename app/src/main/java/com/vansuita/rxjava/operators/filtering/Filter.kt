package com.vansuita.rxjava.operators.filtering

import android.util.Log
import com.vansuita.rxjava.operators.Operator
import com.vansuita.rxjava.operators.model.User
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable

class Filter : Operator() {

    override fun <T> with(): List<User> {
        return listOf(
            User("Bernardo", 4),
            User("Matheus", 2),
            User("Paula", 27),
            User("Junior", 30)
        )
    }

    override fun sample(): Disposable {
        return Observable.fromIterable(listOf("Home", "Horse", "Castle", "Game"))
            .filter { it.startsWith("H") }
            .subscribe {
                Log.d(TAG, "onNext: $it")
            }
    }

    override fun detailedSample() {
        Observable.fromIterable(this.with<List<User>>())
            .filter { it.age < 10 }
            .subscribe({
                Log.d(TAG, "onNext: ${it.name} - ${it.age}")
            }, {
                Log.d(TAG, "onError $it")
            }, {
                Log.d(TAG, "onComplete")
            })
    }

}