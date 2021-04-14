package com.viet.exerciseui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btn1.setOnClickListener {
            frameLayout1.visibility = View.VISIBLE
        }
        btn2.setOnClickListener {
            frameLayout2.visibility = View.VISIBLE
        }
        btn3.setOnClickListener {
            frameLayout3.visibility = View.VISIBLE
        }

        btn11.setOnClickListener {
            frameLayout1.visibility = View.INVISIBLE
        }
        btn22.setOnClickListener {
            frameLayout2.visibility = View.INVISIBLE
        }
        btn33.setOnClickListener {
            frameLayout3.visibility = View.INVISIBLE
        }

    }
}
