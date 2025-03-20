package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


            View view=inflater.inflate(R.layout.fragment1,container,false);

        TextView v=view.findViewById(R.id.area);
        if(getArguments()!=null){
            int a=getArguments().getInt("area",0);
            v.setText(a);
        }
            return view;
    }
}
