package com.example.yinpengcheng.surfaceviewtouchpaddemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.Log
import android.view.MotionEvent
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.View
import java.util.jar.Attributes

/**
 * Created by yinpengcheng on 2018/1/18.
 */
class SurfaceViewTemplate(context: Context): SurfaceView(context), SurfaceHolder.Callback,Runnable {
    var mHolder : SurfaceHolder
    var mCanvas : Canvas
    var mIsDrawing : Boolean = true
    var mPath : Path = Path()
    var mPaint : Paint = Paint()


    init{
        mHolder = holder
        Log.d("gg",""+ when(holder.lockCanvas()){
            null ->"null"
            else ->"hehe"
        })
        mCanvas = holder.lockCanvas()
        mHolder.addCallback(this)
//        focusable = View.FOCUSABLE
        isFocusableInTouchMode = true
        keepScreenOn = true
    }

    override fun surfaceCreated(holder: SurfaceHolder?) {
        mIsDrawing = true
        var thread: Thread = Thread(this)
        thread.start()
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun surfaceChanged(holder: SurfaceHolder?, format: Int, width: Int, height: Int) {

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun surfaceDestroyed(holder: SurfaceHolder?) {
        mIsDrawing = false
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun run() {
        var start : Long = System.currentTimeMillis()
        while (mIsDrawing){
            draw()
        }
        var end : Long = System.currentTimeMillis()
        if (end - start < 100){
            try {
                Thread.sleep(100 - (end - start))
            }catch (e: InterruptedException){
                e.printStackTrace()
            }
        }
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun draw(){
        try {
            //drawsomething
            mCanvas.drawColor(Color.WHITE)
            mCanvas.drawPath(mPath, mPaint)



        }catch (e: Exception){

        }finally {
            if (mCanvas != null){
                mHolder.unlockCanvasAndPost(mCanvas)
            }
        }

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var x : Float? = event?.x as? Float
        var y : Float? = event?.y as? Float
        when(event?.action){
            MotionEvent.ACTION_DOWN -> mPath.moveTo(x!!, y!!)
            MotionEvent.ACTION_MOVE -> mPath.lineTo(x!!, y!!)
        }


        return super.onTouchEvent(event)
    }
}