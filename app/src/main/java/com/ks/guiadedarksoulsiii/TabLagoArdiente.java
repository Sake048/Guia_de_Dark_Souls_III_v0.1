package com.ks.guiadedarksoulsiii;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TabLagoArdiente#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TabLagoArdiente extends Fragment {


    public TabLagoArdiente() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_tab_lago_ardiente, container, false);
    }
}