package com.rhidayat.pamanmhs;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "biodatadiri.db";
    private static final int DATA_VERSION = 1;
    public DataHelper(Context context){
        super (context, DATABASE_NAME,null,DATA_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        String sql = "create table biodata (nim integer primary key, nama text null, alamat text null, " +
                "nopol varchar null, merk varchar null);";
        Log.d("Data","onCreate; "+ sql);
        db.execSQL(sql);
    }

    @Override
    public  void onUpgrade (SQLiteDatabase arg0, int arg1, int arg2) {

    }

}
