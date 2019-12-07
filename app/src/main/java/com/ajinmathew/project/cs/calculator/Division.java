package com.ajinmathew.project.cs.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Division extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1;
    float a,b,o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_division );
        ed1=(EditText)findViewById( R.id.first );
        ed2=(EditText)findViewById( R.id.second );
        b1=(Button)findViewById( R.id.out );
        b1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Float.parseFloat( ed1.getText().toString() );
                b=Float.parseFloat( ed2.getText().toString() );
                o=a/b;
                Toast.makeText( getApplicationContext(),String.valueOf( o ),Toast.LENGTH_LONG ).show();
            }
        } );
    }
}
