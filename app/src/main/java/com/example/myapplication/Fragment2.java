package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {


    public View onCreateView(LayoutInflater inflater,  ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.fragmentt2,container,false);
        TextView t=view.findViewById(R.id.perimeter);

        if(getArguments() !=null){

            int parameter=getArguments().getInt("paramerter",0);
            t.setText(parameter);
        }
        return view;
    }
}
