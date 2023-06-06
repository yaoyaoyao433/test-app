package com.meituan.android.legwork.monitor.report.channel.dao;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Keep;
import com.meituan.android.legwork.monitor.BaseMonitorManager;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ChannelDBHelper {
    private static final String DB_NAME = "monitor";
    private static final int DB_VERSION = 3;
    private static final String ES_DAO_TABLE_NAME = "monitor";
    private static volatile ChannelDBHelper INSTANCE;
    public static ChangeQuickRedirect changeQuickRedirect;
    private SQLiteOpenHelper helper;

    public static ChannelDBHelper getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95c3eaca52db695371ee9196fa8b04e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ChannelDBHelper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95c3eaca52db695371ee9196fa8b04e4");
        }
        if (INSTANCE == null) {
            synchronized (a.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ChannelDBHelper(BaseMonitorManager.getApplication());
                }
            }
        }
        return INSTANCE;
    }

    public ChannelDBHelper(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bc4fd40799c0d15ccabf9b960624361", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bc4fd40799c0d15ccabf9b960624361");
        } else {
            this.helper = new a(context, "monitor", 3);
        }
    }

    public SQLiteDatabase getWritableDatabase() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0a88373e0fb11beffa339cb68062bea", RobustBitConfig.DEFAULT_VALUE) ? (SQLiteDatabase) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0a88373e0fb11beffa339cb68062bea") : this.helper.getWritableDatabase();
    }

    public SQLiteDatabase getReadableDatabase() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88254c58e760cf6ab6fa95e906a529b9", RobustBitConfig.DEFAULT_VALUE) ? (SQLiteDatabase) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88254c58e760cf6ab6fa95e906a529b9") : this.helper.getReadableDatabase();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a extends SQLiteOpenHelper {
        public static ChangeQuickRedirect a;

        public a(Context context, String str, int i) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 3);
            Object[] objArr = {context, str, 3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c79609f8014ba85ef5444f8a85887eb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c79609f8014ba85ef5444f8a85887eb");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            Object[] objArr = {sQLiteDatabase};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95bcc47dd6df1912e2dde12111fb5133", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95bcc47dd6df1912e2dde12111fb5133");
                return;
            }
            DaBaiDao.createTable(sQLiteDatabase);
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS monitor");
            } catch (SQLException e) {
                x.e("drop es table", "exception msg:", e);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7abff2e684e93fabe12e6ffb6cee62a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7abff2e684e93fabe12e6ffb6cee62a7");
                return;
            }
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS da_bai_data");
            DaBaiDao.createTable(sQLiteDatabase);
        }
    }
}
