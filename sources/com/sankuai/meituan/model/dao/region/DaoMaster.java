package com.sankuai.meituan.model.dao.region;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import de.greenrobot.dao.AbstractDaoMaster;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.IdentityScopeType;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // de.greenrobot.dao.AbstractDaoMaster
    public /* synthetic */ AbstractDaoSession newSession() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4869c734fe511bbf490c0332d21eda82", RobustBitConfig.DEFAULT_VALUE) ? (DaoSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4869c734fe511bbf490c0332d21eda82") : new DaoSession(this.db, IdentityScopeType.Session, this.daoConfigMap);
    }

    @Override // de.greenrobot.dao.AbstractDaoMaster
    public /* synthetic */ AbstractDaoSession newSession(IdentityScopeType identityScopeType) {
        Object[] objArr = {identityScopeType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bd79c49d5c75c39116cf19ef0731855", RobustBitConfig.DEFAULT_VALUE) ? (DaoSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bd79c49d5c75c39116cf19ef0731855") : new DaoSession(this.db, identityScopeType, this.daoConfigMap);
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f186d7194cd5586391b3fa9fdf07617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f186d7194cd5586391b3fa9fdf07617");
            return;
        }
        RegionDefDao.a(sQLiteDatabase, false);
        RegionLinkDao.a(sQLiteDatabase, false);
    }

    public static void b(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "889a138dcc0638696cdde60bab036813", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "889a138dcc0638696cdde60bab036813");
            return;
        }
        RegionDefDao.b(sQLiteDatabase, true);
        RegionLinkDao.b(sQLiteDatabase, true);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class OpenHelper extends SQLiteOpenHelper {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            Object[] objArr = {sQLiteDatabase};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6693a16894115f671118818628882daa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6693a16894115f671118818628882daa");
            } else {
                DaoMaster.a(sQLiteDatabase, false);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class DevOpenHelper extends OpenHelper {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            Object[] objArr = {sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d28e3e08703a0b091e3c6d5926da08a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d28e3e08703a0b091e3c6d5926da08a8");
                return;
            }
            DaoMaster.b(sQLiteDatabase, true);
            onCreate(sQLiteDatabase);
        }
    }
}
