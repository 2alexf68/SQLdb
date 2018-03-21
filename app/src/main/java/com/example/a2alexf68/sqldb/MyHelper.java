package com.example.a2alexf68.sqldb;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

public class MyHelper extends SQLiteOpenHelper {

    static final int VERSION = 1;
    static final String DATABASE_NAME = "TestDB";

    public MyHelper(Context ctx) {
        super(ctx, DATABASE_NAME, null, VERSION);
    }

    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE IF NOT EXISTS People (Id INTEGER PRIMARY KEY, Firstname VARCHAR(255), Lastname VARCHAR(255), Age INTEGER)");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS People");
        onCreate(db);
    }

    //insert a new statement; a new statement
    public long insertRecord()
    {
        SQLiteDatabase db = getWritableDatabase();
        SQLiteStatement stmt = db.compileStatement
                ("INSERT INTO people(Title,Artist,Year) VALUES (?, ?, ?)");
        stmt.bindString (1, "Tim");
        stmt.bindString (2, "Smith");
        stmt.bindLong (3, 53);
        long id = stmt.executeInsert();//it will return the id of the new record
        return id;
    }

}