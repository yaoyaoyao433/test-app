package com.sankuai.waimai.platform.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.platform.db.dao.DaoMaster;
import com.sankuai.waimai.platform.db.dao.DaoSession;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DBManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static DaoMaster daoMaster;
    private static DaoSession daoSession;
    private static SQLiteDatabase db;

    public static synchronized DaoSession getDbSession() {
        DBOpenHelper dBOpenHelper;
        synchronized (DBManager.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e743b83ebce9a7880ab78b82effb3d8b", RobustBitConfig.DEFAULT_VALUE)) {
                return (DaoSession) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e743b83ebce9a7880ab78b82effb3d8b");
            }
            try {
                try {
                    if (daoSession == null) {
                        if (daoMaster == null) {
                            dBOpenHelper = new DBOpenHelper(b.a, "mtwm.db", null);
                            try {
                                db = dBOpenHelper.getWritableDatabase();
                                daoMaster = new DaoMaster(db);
                            } catch (SQLiteException e) {
                                e = e;
                                if (dBOpenHelper == null) {
                                    try {
                                        dBOpenHelper = new DBOpenHelper(b.a, "mtwm.db", null);
                                    } catch (Exception unused) {
                                        if (dBOpenHelper != null) {
                                            try {
                                                dBOpenHelper.close();
                                            } catch (Exception unused2) {
                                                a.e("getDbSession", e.getLocalizedMessage(), new Object[0]);
                                            }
                                        }
                                    }
                                }
                                dBOpenHelper.close();
                                db = dBOpenHelper.getWritableDatabase();
                                DaoMaster daoMaster2 = new DaoMaster(db);
                                daoMaster = daoMaster2;
                                daoSession = daoMaster2.newSession();
                                return daoSession;
                            }
                        } else {
                            dBOpenHelper = null;
                        }
                        daoSession = daoMaster.newSession();
                    }
                } catch (Exception e2) {
                    a.e("getDbSession", e2.getLocalizedMessage(), new Object[0]);
                }
            } catch (SQLiteException e3) {
                e = e3;
                dBOpenHelper = null;
            }
            return daoSession;
        }
    }

    public static void initDao(Context context) {
        DBOpenHelper dBOpenHelper;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b3d046ec1cad0ad55b27ff85607c567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b3d046ec1cad0ad55b27ff85607c567");
            return;
        }
        try {
            try {
                dBOpenHelper = new DBOpenHelper(context, "mtwm.db", null);
                try {
                    db = dBOpenHelper.getWritableDatabase();
                    DaoMaster daoMaster2 = new DaoMaster(db);
                    daoMaster = daoMaster2;
                    daoSession = daoMaster2.newSession();
                } catch (SQLiteException e) {
                    e = e;
                    a.e("setDao", e.getLocalizedMessage(), new Object[0]);
                    if (dBOpenHelper == null) {
                        try {
                            dBOpenHelper = new DBOpenHelper(context, "mtwm.db", null);
                        } catch (Exception unused) {
                            if (dBOpenHelper != null) {
                                dBOpenHelper.close();
                                return;
                            }
                            return;
                        }
                    }
                    dBOpenHelper.close();
                    db = dBOpenHelper.getWritableDatabase();
                    DaoMaster daoMaster3 = new DaoMaster(db);
                    daoMaster = daoMaster3;
                    daoSession = daoMaster3.newSession();
                }
            } catch (SQLiteException e2) {
                e = e2;
                dBOpenHelper = null;
            }
        } catch (Exception e3) {
            a.e("setDao", e3.getLocalizedMessage(), new Object[0]);
        }
    }
}
