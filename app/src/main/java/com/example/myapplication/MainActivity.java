package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Dialog dialog;
    public void onclick(View v){
        LayoutInflater inflater=LayoutInflater.from(this);
        View myview=inflater.inflate(R.layout.dialog,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(myview);
        dialog=builder.create();
        dialog.show();
        myview.findViewById(R.id.but).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this,"click leave",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void onclick2(View v){
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("studentname","felix");
        intent.putExtra("score","98");
        startActivity(intent);
    }
}
