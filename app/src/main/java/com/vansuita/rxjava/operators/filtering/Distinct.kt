package com.vansuita.rxjava.operators.filtering

import android.util.Log
import com.vansuita.rxjava.operators.Operator
import com.vansuita.rxjava.operators.model.Fruit
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.Disposable

class Distinct : Operator() {

    override fun <T> with(): List<Fruit> {
        return listOf(
            Fruit("Apple"),
            Fruit("Apple"),
            Fruit("Grape"),
            Fruit("Banana"),
            Fruit("Apple"),
            Fruit("Banana"),
        )
    }

    override fun sample(): Disposable {
        return Observable.fromArray("Yellow", "Blue", "Green", "Black", "Yellow", "Blue")
            .distinct()
            .subscribe {
                Log.d(TAG, "onNext: $it")
            }
    }

    override fun detailedSample() {
        Observable.fromIterable(this.with<List<Fruit>>())
            .distinct { it.name }
            .subscribe({
                Log.d(TAG, "onNext: ${it.name}")
            }, {
                Log.d(TAG, "onError $it")
            })
    }
}