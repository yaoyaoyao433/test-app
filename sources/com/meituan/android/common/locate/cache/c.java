package com.meituan.android.common.locate.cache;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.android.common.locate.provider.s;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class c extends SQLiteOpenHelper {
    public static ChangeQuickRedirect changeQuickRedirect;

    public c(Context context) {
        super(context, s.a(context).c() + "MTLocationDb.db", (SQLiteDatabase.CursorFactory) null, 6);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "764a994bf5fb831675f504e8abedcd88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "764a994bf5fb831675f504e8abedcd88");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3afa4426f89ee5e3e2cafa284af24892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3afa4426f89ee5e3e2cafa284af24892");
            return;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("CREATE TABLE IF NOT EXISTS [MTLocationTable] (");
            stringBuffer.append("[_id] INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, ");
            stringBuffer.append("[KEY] TEXT,");
            stringBuffer.append("[NB] TEXT,");
            stringBuffer.append("[LOC] TEXT,");
            stringBuffer.append("[TIME] TEXT)");
            sQLiteDatabase.execSQL(stringBuffer.toString());
            LogUtils.a("LocationDbHelper LocationDatabase is created");
        } catch (Exception e) {
            LogUtils.a("LocationDbHelper create LocationDatabase exception: " + e.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eda07e55ab3743466063b3c66f29ff7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eda07e55ab3743466063b3c66f29ff7b");
            return;
        }
        super.onOpen(sQLiteDatabase);
        LogUtils.a("LocationDbHelper LocationDatabase is Opened");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "514354dac0a101e7a881252f1ff0f3f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "514354dac0a101e7a881252f1ff0f3f1");
            return;
        }
        LogUtils.a("LocationDbHelper onUpgrade");
        if (i != 6) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS MTLocationTable");
                onCreate(sQLiteDatabase);
                LogUtils.a("LocationDbHelper upgrade LocationDatabase success");
            } catch (Throwable th) {
                LogUtils.a(th);
            }
        }
    }
}
