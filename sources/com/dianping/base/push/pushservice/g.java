package com.dianping.base.push.pushservice;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {
    public static ChangeQuickRedirect a;

    public g(Context context) {
        super(context, "dppush.db", (SQLiteDatabase.CursorFactory) null, 1);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed79dd66a61a247d8e912d73c856aed5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed79dd66a61a247d8e912d73c856aed5");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0295a85d1c37a844c93ef7d696a2d8ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0295a85d1c37a844c93ef7d696a2d8ba");
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS statistics(id INTEGER PRIMARY KEY, log TEXT)");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adbdafda55dabfb7299ee9e2a1d5214c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adbdafda55dabfb7299ee9e2a1d5214c");
            return;
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS statistics");
        onCreate(sQLiteDatabase);
    }
}
