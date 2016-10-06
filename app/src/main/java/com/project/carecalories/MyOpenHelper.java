package com.project.carecalories;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyOpenHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Calories.db" ;
    private static final String USER_TABLE = "create table userTABLE (id INTEGER PRIMARY KEY, " +
            "Username TEXT, Password TEXT, Gender TEXT, Dob TEXT, Weight TEXT, Height TEXT);";
    private static final String SHOP_TABLE = "create table shopTABLE (id INTEGER PRIMARY KEY, " + "Shop TEXT);";
    private static final String MENU_TABLE = "create table menuTABLE (id INTEGER PRIMARY KEY, " + "Menu TEXT, Cal TEXT);";
    private static final String TYPE_TABLE = "create table typeTABLE (id INTEGER PRIMARY KEY, " + "Type TEXT);";

    public MyOpenHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(USER_TABLE);
        db.execSQL(SHOP_TABLE);
        db.execSQL(MENU_TABLE);
        db.execSQL(TYPE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

