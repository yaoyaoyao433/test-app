package com.sankuai.meituan.model.dao;

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
    public static final int SCHEMA_VERSION = 470;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // de.greenrobot.dao.AbstractDaoMaster
    public /* synthetic */ AbstractDaoSession newSession() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "417f3b251daf2ab848c145af6e67de38", RobustBitConfig.DEFAULT_VALUE) ? (DaoSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "417f3b251daf2ab848c145af6e67de38") : new DaoSession(this.db, IdentityScopeType.Session, this.daoConfigMap);
    }

    @Override // de.greenrobot.dao.AbstractDaoMaster
    public /* synthetic */ AbstractDaoSession newSession(IdentityScopeType identityScopeType) {
        Object[] objArr = {identityScopeType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2084bca050509e02608a840a781ce834", RobustBitConfig.DEFAULT_VALUE) ? (DaoSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2084bca050509e02608a840a781ce834") : new DaoSession(this.db, identityScopeType, this.daoConfigMap);
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c9847d539df17a37d86b1517c76de334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9847d539df17a37d86b1517c76de334");
            return;
        }
        PoiDao.a(sQLiteDatabase, false);
        PoiAlbumsDao.a(sQLiteDatabase, false);
        DealAlbumDao.a(sQLiteDatabase, false);
        DealDao.a(sQLiteDatabase, false);
        DealPitchHtmlDao.a(sQLiteDatabase, false);
        CityDao.a(sQLiteDatabase, false);
        PoiCommentStateDao.a(sQLiteDatabase, false);
        PoiFavoriteDao.a(sQLiteDatabase, false);
        OrderDao.a(sQLiteDatabase, false);
    }

    public static void b(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "10eb14ae76b362590c650264769edc19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "10eb14ae76b362590c650264769edc19");
            return;
        }
        PoiDao.b(sQLiteDatabase, true);
        PoiAlbumsDao.b(sQLiteDatabase, true);
        DealAlbumDao.b(sQLiteDatabase, true);
        DealDao.b(sQLiteDatabase, true);
        DealPitchHtmlDao.b(sQLiteDatabase, true);
        CityDao.b(sQLiteDatabase, true);
        PoiCommentStateDao.b(sQLiteDatabase, true);
        PoiFavoriteDao.b(sQLiteDatabase, true);
        OrderDao.b(sQLiteDatabase, true);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class OpenHelper extends SQLiteOpenHelper {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            Object[] objArr = {sQLiteDatabase};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "694718444ff91c72a584f1a8ea865d4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "694718444ff91c72a584f1a8ea865d4c");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9dffcf51f46b0ce201a3b1dbf376187", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9dffcf51f46b0ce201a3b1dbf376187");
                return;
            }
            DaoMaster.b(sQLiteDatabase, true);
            onCreate(sQLiteDatabase);
        }
    }
}
