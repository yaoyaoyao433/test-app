package com.meituan.android.common.locate.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.android.common.locate.provider.s;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class b extends SQLiteOpenHelper {
    public static ChangeQuickRedirect changeQuickRedirect;

    public b(Context context) {
        super(context, s.a(context).c() + "MTAddressDb.db", (SQLiteDatabase.CursorFactory) null, 9);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "529b4f08f17fe4a8612578a07000787a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "529b4f08f17fe4a8612578a07000787a");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8810e2f6f96198f24c879cfc5fc6a190", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8810e2f6f96198f24c879cfc5fc6a190");
            return;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("CREATE TABLE IF NOT EXISTS [MTAddressTable] (");
            stringBuffer.append("[_id] INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, ");
            stringBuffer.append("[GEOHASH] TEXT,");
            stringBuffer.append("[ADDRESS] TEXT,");
            stringBuffer.append("[COUNTRY] TEXT,");
            stringBuffer.append("[PROVINCE] TEXT,");
            stringBuffer.append("[CITY] TEXT,");
            stringBuffer.append("[DISTRICT] TEXT,");
            stringBuffer.append("[DETAIL] TEXT,");
            stringBuffer.append("[ADCODE] TEXT,");
            stringBuffer.append("[CITYID_MT] INTEGER,");
            stringBuffer.append("[CITYID_DP] INTEGER,");
            stringBuffer.append("[TOWN_CODE] TEXT,");
            stringBuffer.append("[TOWN_SHIP] TEXT,");
            stringBuffer.append("[DP_NAME] TEXT,");
            stringBuffer.append("[OPEN_CITY] TEXT)");
            sQLiteDatabase.execSQL(stringBuffer.toString());
            LogUtils.a("GeohashDbHelper GeohashDatabase is created");
        } catch (Exception e) {
            LogUtils.a("GeohashDbHelper create GeohashDatabase exception: " + e.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29ff5f83f3e04c07ac8ba89b67163a5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29ff5f83f3e04c07ac8ba89b67163a5f");
        } else if (i2 < i) {
            try {
                LogUtils.a("GeohashDbHelper data base not enable downgrade");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS MTAddressTable");
                onCreate(sQLiteDatabase);
            } catch (Exception e) {
                LogUtils.a("GeohashDbHelper downgrade GeohashDatabase exception: " + e.getMessage());
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d773e70619f672824da2b75b33e2535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d773e70619f672824da2b75b33e2535");
            return;
        }
        super.onOpen(sQLiteDatabase);
        LogUtils.a("GeohashDbHelper GeohashDatabase is Opened");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea6a42e2e4ee005114ba6ed8765c1856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea6a42e2e4ee005114ba6ed8765c1856");
        } else if (i2 != i) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS MTAddressTable");
                onCreate(sQLiteDatabase);
                LogUtils.a("GeohashDbHelper upgrade GeohashDatabase success");
            } catch (Exception e) {
                LogUtils.a("GeohashDbHelper upgrade GeohashDatabase exception: " + e.getMessage());
            }
        }
    }
}
