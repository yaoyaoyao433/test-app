package com.sankuai.waimai.platform.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.platform.db.dao.DaoMaster;
import com.sankuai.waimai.platform.db.dao.HistoryLocationInfoDao;
import com.sankuai.waimai.platform.db.dao.InshopSearchHistoryDao;
import com.sankuai.waimai.platform.db.dao.PoiSearchHistoryDao;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DBOpenHelper extends DaoMaster.OpenHelper {
    public static ChangeQuickRedirect changeQuickRedirect;

    public DBOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
        super(context, str, cursorFactory);
        Object[] objArr = {context, str, cursorFactory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "feeec9925d48013f8cbe32d487a8ce4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "feeec9925d48013f8cbe32d487a8ce4e");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8d0aa170252fd1cdf87187d6eb24a05", RobustBitConfig.DEFAULT_VALUE)) {
            return (SQLiteDatabase) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8d0aa170252fd1cdf87187d6eb24a05");
        }
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        if (writableDatabase != null) {
            writableDatabase.enableWriteAheadLogging();
        }
        return writableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1274d45488ad38bd19350b22262ab72b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1274d45488ad38bd19350b22262ab72b");
            return;
        }
        a.c("greenDAO", "Upgrading schema from version " + i + " to " + i2 + " by dropping all tables", new Object[0]);
        try {
            sQLiteDatabase.beginTransaction();
            switch (i) {
                case 9:
                    sQLiteDatabase.execSQL("ALTER TABLE 'ACCOUNT' ADD 'VALUE' REAL");
                case 10:
                    HistoryLocationInfoDao.createTable(sQLiteDatabase, true);
                case 11:
                    PoiSearchHistoryDao.createTable(sQLiteDatabase, true);
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ADDRESS_INFO'");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ORDER_CACHES'");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ORDER_CACHES_NEW'");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'POI_SORT'");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'POI_PREFERENCE'");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'POI_CATEGORY_FILTER'");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'DELETED_ADDRESS_INFO'");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'POI_GREEN'");
                case 12:
                    sQLiteDatabase.execSQL("ALTER TABLE 'ACCOUNT' ADD 'HAS_PAY_PASSWORD' INTEGER");
                    sQLiteDatabase.execSQL("ALTER TABLE 'ACCOUNT' ADD 'IS_BIND_BANK_CARD' INTEGER");
                case 13:
                    sQLiteDatabase.execSQL("UPDATE ACCOUNT SET PASSWORD = ''");
                    sQLiteDatabase.execSQL("ALTER TABLE 'ACCOUNT' ADD 'AVATAR_URL' TEXT");
                    sQLiteDatabase.execSQL("ALTER TABLE 'POI_SEARCH_HISTORY' ADD 'POI_ID' INTEGER");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'LOG_DATA'");
                    sQLiteDatabase.execSQL("CREATE TABLE LOG_DATA ('_id' INTEGER PRIMARY KEY AUTOINCREMENT, 'CODE' INTEGER, 'ACTION' TEXT, 'CATEGORY' TEXT, 'RESULT' TEXT, 'TIME' INTEGER, 'INFO' TEXT, 'APP_VERSION' TEXT, 'APP_CODE' TEXT)");
                    InshopSearchHistoryDao.createTable(sQLiteDatabase, true);
                    sQLiteDatabase.execSQL("ALTER TABLE 'POI_SEARCH_HISTORY' ADD 'BIZ_SOURCE' INTEGER");
                    sQLiteDatabase.execSQL("ALTER TABLE 'POI_SEARCH_HISTORY' ADD 'POI_ID_STR' TEXT");
                    break;
                default:
                    switch (i) {
                        case 251:
                            sQLiteDatabase.execSQL("ALTER TABLE 'ACCOUNT' ADD 'AVATAR_URL' TEXT");
                        case 252:
                        case 253:
                            sQLiteDatabase.execSQL("ALTER TABLE 'POI_SEARCH_HISTORY' ADD 'POI_ID' INTEGER");
                        case 254:
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'LOG_DATA'");
                            sQLiteDatabase.execSQL("CREATE TABLE LOG_DATA ('_id' INTEGER PRIMARY KEY AUTOINCREMENT, 'CODE' INTEGER, 'ACTION' TEXT, 'CATEGORY' TEXT, 'RESULT' TEXT, 'TIME' INTEGER, 'INFO' TEXT, 'APP_VERSION' TEXT, 'APP_CODE' TEXT)");
                        case 255:
                        case 256:
                        case 257:
                            InshopSearchHistoryDao.createTable(sQLiteDatabase, true);
                        case 258:
                            sQLiteDatabase.execSQL("ALTER TABLE 'POI_SEARCH_HISTORY' ADD 'BIZ_SOURCE' INTEGER");
                        case 259:
                            sQLiteDatabase.execSQL("ALTER TABLE 'POI_SEARCH_HISTORY' ADD 'POI_ID_STR' TEXT");
                            break;
                        default:
                            DaoMaster.dropAllTables(sQLiteDatabase, true);
                            onCreate(sQLiteDatabase);
                            break;
                    }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b724b06d63d9162f6fb909be5fc4016c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b724b06d63d9162f6fb909be5fc4016c");
            return;
        }
        a.c("greenDAO", "onDowngrade schema from version " + i + " to " + i2 + " by dropping all tables", new Object[0]);
        DaoMaster.dropAllTables(sQLiteDatabase, true);
        DaoMaster.createAllTables(sQLiteDatabase, false);
    }
}
