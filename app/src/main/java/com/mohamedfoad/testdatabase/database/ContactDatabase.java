package com.mohamedfoad.testdatabase.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by PC-SMART on 1/2/2018.
 */

public class ContactDatabase extends SQLiteOpenHelper {

    private String DBName = "name.sqlite";
    private int DBVersion = 1;
    public ContactDatabase(Context context) {
        super(context, DBName, null, DBVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
