package com.example.yinpengcheng.motioneventdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val tag:String = "aaa"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view.setOnTouchListener { v, event ->
            when(event.action){
                MotionEvent.ACTION_DOWN-> Log.d(tag,"ACTION_DOWN")
                MotionEvent.ACTION_UP -> Log.d(tag,"ACTION_UP")
//                MotionEvent.ACTION_MOVE -> Log.d(tag,"ACTION_MOVE")
                MotionEvent.ACTION_CANCEL->{
                    Log.d(tag,"ACTION_CANCEL")
                    event.actionIndex
                }
                MotionEvent.ACTION_OUTSIDE -> Log.d(tag,"ACTION_OUTSIDE")
                MotionEvent.ACTION_POINTER_UP -> Log.d(tag,"ACTION_POINTER_UP")
                MotionEvent.ACTION_POINTER_DOWN ->Log.d(tag,"ACTION_POINTER_DOWN")
            }
            false
        }
    }
}
