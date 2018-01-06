package com.example.yinpengcheng.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        textView.setText("helloworld!")
        this.textView.text = "hehe";
        var list = listOf("1","2","3")
        var adapter = ListAdapter(this, list)
        listview.adapter = adapter

    }
}
