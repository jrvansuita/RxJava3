package com.vansuita.rxjava

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Convert an object or an array of objects into an Observable
        //Just().sample()
        //Just().detailedSample()

        //Converts an array into an Observable that emits the items.
        //FromArray().sample()
        //FromArray().detailedSample()

        //Converts an collection into an Observable that emits the items as sequence.
        //FromIterable().sample()
        //FromIterable().detailedSample()


//        Operators().fromIterable()
//        Operators().range()
//        Operators().repeat()
//        Operators().interval()
//        Operators().intervalWithTakeWhile()
//        Operators().timer()
//        Operators().create()
//        Operators().filter()
//        Operators().last()
//        Operators().distinct()
//        Operators().skip()
//        Operators().buffer()
//        Operators().map()
    }
}