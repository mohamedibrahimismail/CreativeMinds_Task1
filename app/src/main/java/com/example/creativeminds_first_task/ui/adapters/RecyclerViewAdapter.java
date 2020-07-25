package com.example.creativeminds_first_task.ui.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorSpace;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.creativeminds_first_task.Model;
import com.example.creativeminds_first_task.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";
    List<Model> list;

    public interface Communicator{
        public void handleLongClicked(String repo_url, String owner_url);
    }


    public RecyclerViewAdapter(List<Model> list) {
        this.list = list;


    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item_adapter, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{


        View itemView;
        ImageView imageView;
        TextView title;
        TextView time;
        TextView gender;
        TextView type;
        TextView number;
        View cancelled_btn;
        View point;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            imageView = (ImageView)itemView.findViewById(R.id.img);
            title  =(TextView)itemView.findViewById(R.id.title);
            time  =(TextView)itemView.findViewById(R.id.time);
            gender  =(TextView)itemView.findViewById(R.id.text2);
            type  =(TextView)itemView.findViewById(R.id.txt3);
            number  =(TextView)itemView.findViewById(R.id.txt4);
            cancelled_btn = (View)itemView.findViewById(R.id.cancel);
            point = (View)itemView.findViewById(R.id.point);

        }


        public void setData(Model model) {
            Picasso.get().load(model.getImg()).into(imageView);
            title.setText(model.getText());
//            time.setText(model.getTime());
            gender.setText(model.getGender());
            type.setText(model.getType());
            number.setText(model.getNumber());
            if(model.isIscancelled()){
                cancelled_btn.setVisibility(View.VISIBLE);
            }else {
                cancelled_btn.setVisibility(View.GONE);
            }
            if(model.getPoint()){
                point.setVisibility(View.VISIBLE);
            }else {
                point.setVisibility(View.GONE);
            }
        }



    }
}
