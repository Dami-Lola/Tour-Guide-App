package com.example.damio.imaginarycityguide.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.damio.imaginarycityguide.CustomAdapter;
import com.example.damio.imaginarycityguide.CustomClass;
import com.example.damio.imaginarycityguide.R;

import java.util.ArrayList;

public class ResturantFragment extends Fragment {

    public ResturantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                            @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_resturant, container, false);

        ArrayList<CustomClass> customdata = new ArrayList<CustomClass>();
        customdata.add(new CustomClass(getResources().getString(R.string.labeille),R.drawable.labeille));
        customdata.add(new CustomClass(getResources().getString(R.string.pierre),R.drawable.pierregagnaire));
        customdata.add(new CustomClass(getResources().getString(R.string.la),R.drawable.latruffiere));
        customdata.add(new CustomClass(getResources().getString(R.string.les),R.drawable.lespapilles));

        CustomAdapter adapter = new CustomAdapter(getActivity(),customdata);
        ListView listView = (ListView) root.findViewById(R.id.restaurantlist);
        listView.setAdapter(adapter);

        return root;
    }

}
