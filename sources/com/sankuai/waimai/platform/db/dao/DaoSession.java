package com.sankuai.waimai.platform.db.dao;

import android.database.sqlite.SQLiteDatabase;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.IdentityScopeType;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DaoSession extends AbstractDaoSession {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final HistoryLocationInfoDao historyLocationInfoDao;
    private final DaoConfig historyLocationInfoDaoConfig;
    private final InshopSearchHistoryDao inshopSearchHistoryDao;
    private final DaoConfig inshopSearchHistoryDaoConfig;
    private final PoiSearchHistoryDao poiSearchHistoryDao;
    private final DaoConfig poiSearchHistoryDaoConfig;

    public DaoSession(SQLiteDatabase sQLiteDatabase, IdentityScopeType identityScopeType, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> map) {
        super(sQLiteDatabase);
        Object[] objArr = {sQLiteDatabase, identityScopeType, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1923de41374618d1b9bf06ceb4a434d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1923de41374618d1b9bf06ceb4a434d");
            return;
        }
        this.historyLocationInfoDaoConfig = map.get(HistoryLocationInfoDao.class).m38clone();
        this.historyLocationInfoDaoConfig.initIdentityScope(identityScopeType);
        this.poiSearchHistoryDaoConfig = map.get(PoiSearchHistoryDao.class).m38clone();
        this.poiSearchHistoryDaoConfig.initIdentityScope(identityScopeType);
        this.inshopSearchHistoryDaoConfig = map.get(InshopSearchHistoryDao.class).m38clone();
        this.inshopSearchHistoryDaoConfig.initIdentityScope(identityScopeType);
        this.historyLocationInfoDao = new HistoryLocationInfoDao(this.historyLocationInfoDaoConfig, this);
        this.poiSearchHistoryDao = new PoiSearchHistoryDao(this.poiSearchHistoryDaoConfig, this);
        this.inshopSearchHistoryDao = new InshopSearchHistoryDao(this.inshopSearchHistoryDaoConfig, this);
        registerDao(HistoryLocationInfo.class, this.historyLocationInfoDao);
        registerDao(PoiSearchHistory.class, this.poiSearchHistoryDao);
        registerDao(InshopSearchHistory.class, this.inshopSearchHistoryDao);
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e5d5bccf43834446a650b9c75aa1a14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e5d5bccf43834446a650b9c75aa1a14");
            return;
        }
        this.historyLocationInfoDaoConfig.getIdentityScope().clear();
        this.poiSearchHistoryDaoConfig.getIdentityScope().clear();
        this.inshopSearchHistoryDaoConfig.getIdentityScope().clear();
    }

    public HistoryLocationInfoDao getHistoryLocationInfoDao() {
        return this.historyLocationInfoDao;
    }

    public PoiSearchHistoryDao getPoiSearchHistoryDao() {
        return this.poiSearchHistoryDao;
    }

    public InshopSearchHistoryDao getInshopSearchHistoryDao() {
        return this.inshopSearchHistoryDao;
    }
}
