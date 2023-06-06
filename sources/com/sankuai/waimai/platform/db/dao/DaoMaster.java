package com.sankuai.waimai.platform.db.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import de.greenrobot.dao.AbstractDaoMaster;
import de.greenrobot.dao.IdentityScopeType;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 260;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void createAllTables(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f500edea00bee411f00ab286b20baad4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f500edea00bee411f00ab286b20baad4");
            return;
        }
        HistoryLocationInfoDao.createTable(sQLiteDatabase, z);
        PoiSearchHistoryDao.createTable(sQLiteDatabase, z);
        InshopSearchHistoryDao.createTable(sQLiteDatabase, z);
    }

    public static void dropAllTables(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e1feb28f73680426b49e7e4b7738c86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e1feb28f73680426b49e7e4b7738c86");
            return;
        }
        HistoryLocationInfoDao.dropTable(sQLiteDatabase, z);
        PoiSearchHistoryDao.dropTable(sQLiteDatabase, z);
        InshopSearchHistoryDao.dropTable(sQLiteDatabase, z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class OpenHelper extends SQLiteOpenHelper {
        public static ChangeQuickRedirect changeQuickRedirect;

        public OpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory, (int) DaoMaster.SCHEMA_VERSION);
            Object[] objArr = {context, str, cursorFactory};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea38695ccd2d3f956b9ad4eeb4235e67", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea38695ccd2d3f956b9ad4eeb4235e67");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            Object[] objArr = {sQLiteDatabase};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb5b9f0a5cd3086f01989eb41ae36fe8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb5b9f0a5cd3086f01989eb41ae36fe8");
                return;
            }
            a.c("greenDAO", "Creating tables for schema version 260", new Object[0]);
            DaoMaster.createAllTables(sQLiteDatabase, false);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class DevOpenHelper extends OpenHelper {
        public static ChangeQuickRedirect changeQuickRedirect;

        public DevOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory);
            Object[] objArr = {context, str, cursorFactory};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62577cf3a5bbae17cf286ba1f5f1adf1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62577cf3a5bbae17cf286ba1f5f1adf1");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9826920605f3bb2ef1a2ef9826974719", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9826920605f3bb2ef1a2ef9826974719");
                return;
            }
            a.c("greenDAO", "Upgrading schema from version " + i + " to " + i2 + " by dropping all tables", new Object[0]);
            DaoMaster.dropAllTables(sQLiteDatabase, true);
            onCreate(sQLiteDatabase);
        }
    }

    public DaoMaster(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase, SCHEMA_VERSION);
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83aebb662896ade106754c02aff1005c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83aebb662896ade106754c02aff1005c");
            return;
        }
        registerDaoClass(HistoryLocationInfoDao.class);
        registerDaoClass(PoiSearchHistoryDao.class);
        registerDaoClass(InshopSearchHistoryDao.class);
    }

    @Override // de.greenrobot.dao.AbstractDaoMaster
    public DaoSession newSession() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d033661431ab79359a9c502d4c94f281", RobustBitConfig.DEFAULT_VALUE) ? (DaoSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d033661431ab79359a9c502d4c94f281") : new DaoSession(this.db, IdentityScopeType.Session, this.daoConfigMap);
    }

    @Override // de.greenrobot.dao.AbstractDaoMaster
    public DaoSession newSession(IdentityScopeType identityScopeType) {
        Object[] objArr = {identityScopeType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe1650347bb418331574df9844b347f2", RobustBitConfig.DEFAULT_VALUE) ? (DaoSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe1650347bb418331574df9844b347f2") : new DaoSession(this.db, identityScopeType, this.daoConfigMap);
    }
}
