package com.vansuita.rxjava

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Operators().just()
        //Operators().fromArray()
        //Operators().fromIterable()
        //Operators().range()
        //Operators().repeat()
        //Operators().interval()
        //Operators().intervalWithTakeWhile()
        //Operators().timer()
        //Operators().create()
        //Operators().filter()
        //Operators().last()
        //Operators().distinct()
        //Operators().skip()
        //Operators().buffer()
        Operators().map()
    }
}