package com.example.a2alexf68.sqldb;

import android.database.sqlite.SQLiteDatabase;
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
        Button b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        EditText et1 = (EditText)findViewById(R.id.editText1);
        EditText et2 = (EditText)findViewById(R.id.editText2);
        EditText et3 = (EditText)findViewById(R.id.editText3);
        EditText et4 = (EditText)findViewById(R.id.editText4);

        //double feet = Double.parseDouble(et1.getText().toString());
    }
}
