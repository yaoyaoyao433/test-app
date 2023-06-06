package com.sankuai.xm.base.systemdb;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.i;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends SQLiteOpenHelper {
    public static ChangeQuickRedirect a;
    private i b;
    private String c;

    public a(String str, Context context, String str2, int i, i iVar, DatabaseErrorHandler databaseErrorHandler) {
        super(context, str2, null, i, databaseErrorHandler);
        Object[] objArr = {str, context, str2, Integer.valueOf(i), iVar, databaseErrorHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0294edf1875a4e1224c33a276071ee09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0294edf1875a4e1224c33a276071ee09");
            return;
        }
        this.c = "";
        this.b = iVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c = str;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f8c17d442504a669bdf2bb8170179ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f8c17d442504a669bdf2bb8170179ef");
        } else if (this.b != null) {
            SysDBDatabase sysDBDatabase = new SysDBDatabase();
            sysDBDatabase.b = sQLiteDatabase;
            this.b.a(sysDBDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58f19bdc4d73d25d5be38101cb097c2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58f19bdc4d73d25d5be38101cb097c2b");
        } else if (this.b != null) {
            SysDBDatabase sysDBDatabase = new SysDBDatabase();
            sysDBDatabase.b = sQLiteDatabase;
            this.b.a(sysDBDatabase, i, i2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffd2b9a9e8c0d5345752993ca8005f95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffd2b9a9e8c0d5345752993ca8005f95");
        } else if (this.b != null) {
            SysDBDatabase sysDBDatabase = new SysDBDatabase();
            sysDBDatabase.b = sQLiteDatabase;
            this.b.b(sysDBDatabase, i, i2);
        }
    }
}
