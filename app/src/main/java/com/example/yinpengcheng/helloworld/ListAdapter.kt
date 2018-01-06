package com.example.yinpengcheng.helloworld

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item.view.*

/**
 * Created by yinpengcheng on 2018/1/7.
 */
class ListAdapter (val context: Context, val list: List<String>): BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var viewHolder : ViewHolder
        var v : View
        if (convertView == null){
            v = View.inflate(context, R.layout.item, null)
            viewHolder = ViewHolder(v)
            v.tag = viewHolder
        }else{
            v = convertView
            viewHolder = v.tag as ViewHolder
        }
        viewHolder.textView.text = list[position]
        return v
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(position: Int): Any? {
        return list[position]
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return list.size
    }
    class ViewHolder(rootView: View){
        var textView = rootView.textView
    }
}