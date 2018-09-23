package com.example.damio.imaginarycityguide.fragments;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.damio.imaginarycityguide.Page;
import com.example.damio.imaginarycityguide.R;
import com.example.damio.imaginarycityguide.TabPagerAdapter;

import java.util.ArrayList;

public class MotherFragment extends Fragment {

    private TabPagerAdapter tabPagerAdapter;
    TabLayout tabLayout;
    ViewPager viewPager;
    ArrayList<Page> pages = new ArrayList<>();

    public MotherFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_mother, container, false);

        tabLayout = root.findViewById(R.id.tabs);

        viewPager = root.findViewById(R.id.pager);

        seTabAdapter();

        return root;
    }

    private void seTabAdapter() {
        final LibraryFragment libraryfragment = new LibraryFragment();
        final OceanFragment oceanfragment = new OceanFragment();
        final ParkFragment parkfragment = new ParkFragment();
        final ResturantFragment resturantfragment = new ResturantFragment();

        if (pages.size() <= 0) {

            pages.add(new Page(libraryfragment, getResources().getString(R.string.library)));
            pages.add(new Page(oceanfragment, getResources().getString(R.string.ocean)));
            pages.add(new Page(parkfragment, getResources().getString(R.string.park)));
            pages.add(new Page(resturantfragment, getResources().getString(R.string.restaurant)));

        }

        tabPagerAdapter = new TabPagerAdapter(getChildFragmentManager());
        tabPagerAdapter.setFragments(pages);
        viewPager.setAdapter(tabPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
