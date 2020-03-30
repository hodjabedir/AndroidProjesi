package com.example.snavadogru.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.snavadogru.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";


    public static Fragment newInstance(int index) {
        if (index==1) return  new Fragment_konu_takip_tyt();
        if (index==2) return  new Fragment_konu_takip_ayt();
        return new Fragment_konu_takip_tyt();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_fragment_example, container, false);
        return root;
    }
}