package com.example.damio.imaginarycityguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CustomClass> {

    public CustomAdapter(Activity context, ArrayList<CustomClass> customdata) {

        super(context, 0, customdata);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.customlist, parent, false);
        }

        CustomClass currentdata = getItem(position);

        TextView contentTextView = (TextView) listItemView.findViewById(R.id.content);
        contentTextView.setText(currentdata.getContent());

        ImageView picture = (ImageView) listItemView.findViewById(R.id.picture);
        picture.setImageResource(currentdata.getPicture());

        return listItemView;
    }
}

