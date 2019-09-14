package com.padcmyanmar.padc9.ted_talk.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.padc9.ted_talk.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMostViewed extends Fragment {


    public FragmentMostViewed() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_most_viewed, container, false);
    }

}
