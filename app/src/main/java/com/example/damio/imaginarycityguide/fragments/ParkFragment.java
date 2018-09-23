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

public class ParkFragment extends Fragment {
    public ParkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_park, container, false);

        ArrayList<CustomClass> customdata = new ArrayList<CustomClass>();
        customdata.add(new CustomClass(getResources().getString(R.string.aquatica),R.drawable.aquatica));
        customdata.add(new CustomClass(getResources().getString(R.string.aquaventure),R.drawable.aquaventure));
        customdata.add(new CustomClass(getResources().getString(R.string.area),R.drawable.area));
        customdata.add(new CustomClass(getResources().getString(R.string.tropical),R.drawable.tropicalislands));

        CustomAdapter adapter = new CustomAdapter(getActivity(),customdata);
        ListView listView = (ListView) root.findViewById(R.id.parklist);
        listView.setAdapter(adapter);

        return root;
    }
}
