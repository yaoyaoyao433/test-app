package com.meituan.android.common.sniffer.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SnifferDBHelper extends SQLiteOpenHelper {
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_KEY = "key";
    public static final String COLUMN_LOG = "log";
    private static final String DATABASE_NAME = "sniffer.db";
    private static final int DATABASE_VERSION = 4;
    public static final String TABLE_NAME = "sniffer_log";

    public SnifferDBHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 4);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        createTable(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        dropTable(sQLiteDatabase);
        createTable(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        dropTable(sQLiteDatabase);
        createTable(sQLiteDatabase);
    }

    private void createTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sniffer_log ( id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,key TEXT,log TEXT ) ");
        createIndex(sQLiteDatabase);
    }

    private void createIndex(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS key_index ON sniffer_log(key);");
    }

    private void dropTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sniffer_log");
    }
}
