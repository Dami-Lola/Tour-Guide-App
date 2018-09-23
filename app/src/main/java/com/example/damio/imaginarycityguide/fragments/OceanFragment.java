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

public class OceanFragment extends Fragment {

    public OceanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_ocean, container, false);

        ArrayList<CustomClass> customdata = new ArrayList<CustomClass>();
        customdata.add(new CustomClass(getResources().getString(R.string.larnaca),R.drawable.larnaca));
        customdata.add(new CustomClass(getResources().getString(R.string.ayia),R.drawable.ayianapa));
        customdata.add(new CustomClass(getResources().getString(R.string.limassol),R.drawable.limassol));
        customdata.add(new CustomClass(getResources().getString(R.string.paphos),R.drawable.paphos));

        CustomAdapter adapter = new CustomAdapter(getActivity(),customdata);
        ListView listView = (ListView) root.findViewById(R.id.oceanlist);
        listView.setAdapter(adapter);

        return root;
    }

}
