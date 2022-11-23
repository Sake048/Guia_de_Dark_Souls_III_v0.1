package com.ks.guiadedarksoulsiii;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TabAsentamientoNM#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TabAsentamientoNM extends Fragment {



    public TabAsentamientoNM() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_tab_asentamiento_n_m, container, false);
    }
}