package com.vansuita.rxjava

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vansuita.rxjava.operators.conditional.TakeWhile

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

        //Returns an Observable that emits a sequence of Integers within a specified range.
        //Range().sample()
        //Range().detailedSample()

        //Returns an Observable that repeats the sequence of items emitted by the current Observable at most count times.
        //Repeat().sample()
        //Repeat().detailedSample()

        //Returns an Observable that emits a sequential number every specified interval of time.
        //Interval().sample()
        //Interval().detailedSample()

        //While the condition is satisfied, emits the items by the Observable
        TakeWhile().sample()
        //TakeWhile().detailedSample()


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