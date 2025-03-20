package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FirstActivity extends AppCompatActivity {
    EditText length, breadth;
    TextView area, perimeter;
Button areabtn, perimeterbtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

setContentView(R.layout.first_activity);

length=findViewById(R.id.line1);
breadth=findViewById(R.id.line2);

int l=Integer.parseInt(length.toString());
int b=Integer.parseInt(breadth.toString());
areabtn=findViewById(R.id.btnFirst);
perimeterbtn=findViewById(R.id.btnSecond);
areabtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
      int a=l*b;

      Fragment1 f1=new Fragment1();
      Bundle  b1=new Bundle();
      b1.putInt("area",a);

      f1.setArguments(b1);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment1,f1).addToBackStack(null).commit();


    }
});


        perimeterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int peremeter=2*(l+b);

                Fragment2 f2=new Fragment2();
                Bundle  b1=new Bundle();
                b1.putInt("area",peremeter);

                f2.setArguments(b1);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment2,f2).addToBackStack(null).commit();
            }
        });

    }
}
