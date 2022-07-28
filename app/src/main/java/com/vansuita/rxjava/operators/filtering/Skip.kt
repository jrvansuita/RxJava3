package com.vansuita.rxjava.operators.filtering

import android.util.Log
import com.vansuita.rxjava.operators.Operator
import com.vansuita.rxjava.operators.model.Fruit
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable

class Skip : Operator() {

    override fun <T> with(): List<Fruit> {
        return listOf(
            Fruit("Orange"),
            Fruit("Apple"),
            Fruit("Grape"),
            Fruit("Banana")
        )
    }

    override fun sample(): Disposable {
        return Observable.just(1, 2, 3, 4, 5, 6, 7)
            .skip(5)
            .subscribe {
                Log.d(TAG, "onNext: $it")
            }
    }

    override fun detailedSample() {
        Observable.fromIterable(this.with<List<Fruit>>())
            .skip(2)
            .subscribe({
                Log.d(TAG, "onNext: ${it.name}")
            }, {
                Log.d(TAG, "onError $it")
            })
    }
}