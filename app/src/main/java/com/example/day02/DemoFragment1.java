package com.example.day02;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DemoFragment1 extends Fragment {

    public DemoFragment1() {
        // Required empty public constructor
    }

    public static DemoFragment1 newInstance(String param1, String param2) {
        DemoFragment1 fragment = new DemoFragment1();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_demo1, container, false);
    }
}