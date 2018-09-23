package com.example.damio.imaginarycityguide;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class TabPagerAdapter extends FragmentStatePagerAdapter{

    private List<Page> fragments;

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = fragments.get(position).getFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return fragments == null ? 0 : fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragments.get(position).getTitle();
    }

    public void setFragments(List<Page> fragments) {
        this.fragments = fragments;
    }

    @Override
    public Parcelable saveState() {
        return null;
    }


}
