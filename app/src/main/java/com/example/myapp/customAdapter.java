package com.example.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class customAdapter extends BaseAdapter {

    public customAdapter(Context context, String[] title, int[] images) {
        this.context = context;
        this.title = title;
        this.images = images;
    }

    Context context;
    String [] title;
    int []images;
    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View newView = LayoutInflater.from(context).inflate(R.layout.item_list,viewGroup,false);
        ImageView imageView=newView.findViewById(R.id.image_item);
        TextView textView=newView.findViewById(R.id.title_item);

       /* if (imageSet<0 && titleSet=" "){
            Toast.makeText(context,"Data not found",Toast.LENGTH_LONG).show();
        }*/
        imageView.setImageResource(images[i]);
        textView.setText(title[i]);
        return  newView;
    }
}
