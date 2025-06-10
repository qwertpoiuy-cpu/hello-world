package com.example.day02;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DemoFragment3 extends Fragment {


    public DemoFragment3() {
        // Required empty public constructor
    }

    public static DemoFragment3 newInstance(String param1, String param2) {
        DemoFragment3 fragment = new DemoFragment3();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_demo3, container, false);
    }
}