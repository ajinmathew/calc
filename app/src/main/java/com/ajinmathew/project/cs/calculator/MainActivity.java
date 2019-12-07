package com.ajinmathew.project.cs.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btnSub,btnAdd,btnDiv,btnMul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        btnAdd=(Button) findViewById( R.id.add );
        btnSub=(Button) findViewById( R.id.sub );
        btnDiv=(Button) findViewById( R.id.div );
        btnMul=(Button) findViewById( R.id.mul );
        btnAdd.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(),Addition.class ) );
            }
        } );
        btnSub.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(),Substration.class ) );
            }
        } );
        btnDiv.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(),Division.class ) );
            }
        } );
        btnMul.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(),Multiplication.class ) );
            }
        } );


    }
}
