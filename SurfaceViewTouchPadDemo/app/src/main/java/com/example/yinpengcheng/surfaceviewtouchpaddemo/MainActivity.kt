package com.example.yinpengcheng.surfaceviewtouchpaddemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var surfaceView :SurfaceViewTemplate = surface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onPause() {
        super.onPause()

    }

    override fun onResume() {
        super.onResume()
        surfaceView = SurfaceViewTemplate(this)
    }
}
