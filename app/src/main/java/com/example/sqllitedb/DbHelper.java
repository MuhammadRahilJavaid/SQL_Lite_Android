package com.example.sqllitedb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private String query = "";
    public DbHelper(@Nullable Context context) {
        super(context, "MyDb", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        query = "CREATE TABLE Students (name varchar, rollNo varchar Primary Key, isEnroll bool)";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void InsertStudent(){
        SQLiteDatabase dbWriter = this.getWritableDatabase();
//        ContentValues cv = new ContentValues();
//        cv.put();
//        dbWriter.insert();
        query = "Insert into Students values('HuziPuzi', 'BITF19A007', 1)";
        dbWriter.execSQL(query);
        dbWriter.close();
    }
    public void ReadStudent(){
        SQLiteDatabase dbWriter = this.getReadableDatabase();
//        ContentValues cv = new ContentValues();
//        cv.put();
//        dbWriter.insert();
        Cursor cursorCourses = dbWriter.rawQuery("select * from Students",null);
        if(cursorCourses.moveToFirst()){
            do {
                cursorCourses.getString(1);
                cursorCourses.getInt(2);
                cursorCourses.getInt(3);
            }while(cursorCourses.moveToFirst());
        }
        query = "Insert into Students values('HuziPuzi', 'BITF19A007', 1)";
        dbWriter.execSQL(query);
        dbWriter.close();
    }
}
