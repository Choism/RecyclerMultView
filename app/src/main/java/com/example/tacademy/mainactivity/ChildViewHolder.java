package com.example.tacademy.mainactivity;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.tacademy.mainactivity.data.ChildItem;

/**
 * Created by Tacademy on 2016-07-18.
 */
public class ChildViewHolder extends RecyclerView.ViewHolder {

TextView titleView;
    public ChildViewHolder(View itemView){
        super(itemView);
        titleView = (TextView)itemView;
        titleView.setBackgroundColor(Color.GREEN);
    }

    public void setChild(ChildItem child){
      titleView.setText(child.childName);
    }

}
