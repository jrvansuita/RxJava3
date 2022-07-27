package com.vansuita.rxjava.operators

import io.reactivex.rxjava3.disposables.Disposable


abstract class Operator : Contract {

    companion object {
        const val TAG = "TAG"
    }

    override fun detailedSample() {
        TODO("Not implemented here")
    }
}

interface Contract {
    fun sample(): Disposable
    fun detailedSample()
}