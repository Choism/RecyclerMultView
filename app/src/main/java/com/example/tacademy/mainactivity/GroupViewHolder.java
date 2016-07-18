package com.example.tacademy.mainactivity;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.tacademy.mainactivity.data.GroupItem;

/**
 * Created by Tacademy on 2016-07-18.
 */
public class GroupViewHolder extends RecyclerView.ViewHolder{
    TextView titleView;
    public GroupViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView)itemView;
        titleView.setBackgroundColor(Color.YELLOW);
    }
    public void setGroup(GroupItem groupItem){
        titleView.setText(groupItem.groupName);
    }
}
