package com.project.carecalories;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UserTABLE {

    private MyOpenHelper objMyOpenHelper ;
    private SQLiteDatabase writeSQLite, readSQLite;

    public UserTABLE(Context context){

        objMyOpenHelper = new MyOpenHelper(context);
        writeSQLite = objMyOpenHelper.getWritableDatabase();
        readSQLite = objMyOpenHelper.getReadableDatabase();
    }

}
