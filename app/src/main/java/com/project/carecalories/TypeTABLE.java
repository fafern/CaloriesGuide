package com.project.carecalories;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class TypeTABLE {

    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSQLite, readSQLite;

    public  TypeTABLE(Context context){
        objMyOpenHelper = new MyOpenHelper(context);
        writeSQLite = objMyOpenHelper.getWritableDatabase();
        readSQLite = objMyOpenHelper.getReadableDatabase();
    }

}
