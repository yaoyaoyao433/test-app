package com.meituan.android.common.badge.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.android.common.badge.BadgeEngine;
import com.meituan.android.common.badge.BadgeException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "badge.db";
    private static final int DB_VERSION = 1;
    private static final String TAG = "badge_dbh";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile DBHelper instance;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public static DBHelper instance() {
        return instance;
    }

    public static void create(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7204ce16b3e1eb743f16f00ab607c2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7204ce16b3e1eb743f16f00ab607c2c");
        } else if (instance == null) {
            synchronized (DBHelper.class) {
                if (instance == null) {
                    instance = new DBHelper(context.getApplicationContext());
                }
            }
        }
    }

    public DBHelper(Context context) {
        super(context, DB_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe105d030bf0c76c232f8b186f82a050", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe105d030bf0c76c232f8b186f82a050");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8909b88b45ed8dce535ab0b16e3f138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8909b88b45ed8dce535ab0b16e3f138");
            return;
        }
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL(Data.CREATE_CACHE_TB_SQL);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Throwable th) {
            try {
                if (BadgeEngine.shouldLog(3)) {
                    BadgeEngine.error(TAG, new BadgeException(th));
                }
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
    }
}
