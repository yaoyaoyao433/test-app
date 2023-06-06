package com.sankuai.waimai.platform.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.platform.db.dao.DaoSession;
import com.sankuai.waimai.platform.db.dao.HistoryLocationInfoDao;
import com.sankuai.waimai.platform.db.dao.InshopSearchHistoryDao;
import com.sankuai.waimai.platform.db.dao.PoiSearchHistoryDao;
import de.greenrobot.dao.AbstractDao;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class Db {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static HistoryLocationInfoDao getHistoryLocationInfoDao() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd9996afc6dc1a332d4c8005bb6098eb", RobustBitConfig.DEFAULT_VALUE) ? (HistoryLocationInfoDao) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd9996afc6dc1a332d4c8005bb6098eb") : DBManager.getDbSession().getHistoryLocationInfoDao();
    }

    public static PoiSearchHistoryDao getPoiSearchHistoryDao() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b0c0f88bdef1f9af8d85a253dff76804", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiSearchHistoryDao) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b0c0f88bdef1f9af8d85a253dff76804");
        }
        DaoSession dbSession = DBManager.getDbSession();
        if (dbSession != null) {
            return dbSession.getPoiSearchHistoryDao();
        }
        return null;
    }

    public static InshopSearchHistoryDao getInshopSearchHistoryDao() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "152f7b82895da4ea57ced3fabb1afe1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (InshopSearchHistoryDao) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "152f7b82895da4ea57ced3fabb1afe1a");
        }
        DaoSession dbSession = DBManager.getDbSession();
        if (dbSession != null) {
            return dbSession.getInshopSearchHistoryDao();
        }
        return null;
    }

    public static boolean isDbSessionNull() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c4dbdaeeba65b6bbcafc7d1b6f71427", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c4dbdaeeba65b6bbcafc7d1b6f71427")).booleanValue() : DBManager.getDbSession() == null;
    }

    public static <T, K> long defaultInsert(AbstractDao<T, K> abstractDao, T t) {
        Object[] objArr = {abstractDao, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9c33b714b6ae95420f90834eff81377a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9c33b714b6ae95420f90834eff81377a")).longValue();
        }
        try {
            return abstractDao.insert(t);
        } catch (Exception e) {
            a.b("Db", e.getMessage(), new Object[0]);
            return 0L;
        }
    }
}
