package com.example.a2alexf68.sqldb;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//sqllite open helper object

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    MyHelper helper;// attribute of the activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        helper = new MyHelper(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        Button b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(this);

        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);

        Button b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);

        Button b4 = (Button)findViewById(R.id.button4);
        b4.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        //edit boxes
        //EditText et1 = (EditText)findViewById(R.id.editText1);
        EditText et2 = (EditText)findViewById(R.id.editText2);
        EditText et3 = (EditText)findViewById(R.id.editText3);
        EditText et4 = (EditText)findViewById(R.id.editText4);

        //get the values from the user
        String title = (et2.getText().toString());
        String artist = (et2.getText().toString());
        Long year = Long.parseLong((et2.getText().toString()));

    }
}
