package com.facebook.react.modules.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends SQLiteOpenHelper {
    @Nullable
    private static c a;
    private Context b;
    @Nullable
    private SQLiteDatabase c;
    private long d;

    private c(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.d = 6291456L;
        this.b = context;
    }

    public static c a(Context context) {
        if (a == null) {
            a = new c(context.getApplicationContext());
        }
        return a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            e();
            onCreate(sQLiteDatabase);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean a() {
        if (this.c == null || !this.c.isOpen()) {
            SQLiteException e = null;
            for (int i = 0; i < 2; i++) {
                if (i > 0) {
                    try {
                        e();
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            Thread.sleep(30L);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                this.c = getWritableDatabase();
            }
            if (this.c == null) {
                throw e;
            }
            this.c.setMaximumSize(this.d);
            return true;
        }
        return true;
    }

    public final synchronized SQLiteDatabase b() {
        a();
        return this.c;
    }

    public final synchronized void c() throws RuntimeException {
        try {
            d();
            f();
            com.facebook.common.logging.a.a("ReactNative", "Cleaned RKStorage");
        } catch (Exception unused) {
            if (e()) {
                com.facebook.common.logging.a.a("ReactNative", "Deleted Local Database RKStorage");
                return;
            }
            throw new RuntimeException("Clearing and deleting database RKStorage failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        b().delete("catalystLocalStorage", null, null);
    }

    private synchronized boolean e() {
        f();
        return this.b.deleteDatabase("RKStorage");
    }

    private synchronized void f() {
        if (this.c != null && this.c.isOpen()) {
            this.c.close();
            this.c = null;
        }
    }
}
