package com.example.a2alexf68.sqldb;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import static com.example.a2alexf68.sqldb.R.string.id;

// dfti2018 belbin site
public class MyHelper extends SQLiteOpenHelper {

    //declaring the variables
    private String title,artist;
    private Long year;

    static final int VERSION = 1;
    static final String DATABASE_NAME = "TestDB";

    public MyHelper(Context ctx) {
        super(ctx, DATABASE_NAME, null, VERSION);
    }

    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE IF NOT EXISTS Artists (ID INTEGER PRIMARY KEY, Title VARCHAR(255), Artist VARCHAR(255), Year INTEGER)");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Artists");
        onCreate(db);
    }

    //insert a new statement; a new statement
    public long insertRecord(String artistIn, String titleIn, Long yearIn)
    {
        SQLiteDatabase db = getWritableDatabase();
        SQLiteStatement stmt = db.compileStatement
                ("INSERT INTO Artists(Title,Artist,Year) VALUES (?, ?, ?)");
        stmt.bindString (1, "Tim");
        stmt.bindString (2, "Smith");
        stmt.bindLong (3, 53);

        this.artist = artistIn;
        this.title = titleIn;
        this.year = yearIn;

        long id = stmt.executeInsert();//it will return the id of the new record
        return id;
    }

    //update
    public int updateRecord()
    {
        SQLiteDatabase db = getWritableDatabase();
        SQLiteStatement stmt = db.compileStatement
                ("UPDATE Artists SET Artist=? WHERE Artist=?");
        stmt.bindString (1, "Jones");
        stmt.bindString (2, "Smith");
        int nAffectedRows = stmt.executeUpdateDelete();
        return nAffectedRows;//the number of rows that was changed after the update
    }

    //delete
    public int deleteRecord()
    {
        SQLiteDatabase db = getWritableDatabase();
        SQLiteStatement stmt = db.compileStatement
                ("DELETE FROM Artists WHERE Artist=?");
        stmt.bindString (1, "Smith");
        int nAffectedRows = stmt.executeUpdateDelete();
        return nAffectedRows;
    }

    public void display()
    {
        System.out.println("ID" +id+ "Title: "+ this.title +"Artist: "+ this.artist+ "Year: "+ this.year);
    }

}