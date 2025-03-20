package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Dialouge  extends AppCompatActivity {

    public void showDialogue(){
        AlertDialog.Builder builder=new AlertDialog.Builder(Dialouge.this);

        builder.setTitle("Exit app").setMessage("Do you really want to exit?");


    }
    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
     button=findViewById(R.id.btnSecond);

     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             showDialogue();
         }
     });



        super.onCreate(savedInstanceState);

    }
}
