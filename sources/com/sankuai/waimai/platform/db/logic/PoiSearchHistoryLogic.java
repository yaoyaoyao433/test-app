package com.sankuai.waimai.platform.db.logic;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.platform.db.DBManager;
import com.sankuai.waimai.platform.db.Db;
import com.sankuai.waimai.platform.db.dao.DaoSession;
import com.sankuai.waimai.platform.db.dao.PoiSearchHistory;
import com.sankuai.waimai.platform.db.dao.PoiSearchHistoryDao;
import de.greenrobot.dao.WhereCondition;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiSearchHistoryLogic {
    public static final String SEARCH_HISTORY_STR_SPLIT_CHAR = "_@-#_";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void saveHistoryList(final List<PoiSearchHistory> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0af646c25e0593b37fd902c104c80d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0af646c25e0593b37fd902c104c80d9");
            return;
        }
        final DaoSession dbSession = DBManager.getDbSession();
        if (dbSession == null || list == null || list.isEmpty()) {
            return;
        }
        dbSession.runInTx(new Runnable() { // from class: com.sankuai.waimai.platform.db.logic.PoiSearchHistoryLogic.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d14e1806d88931ab6ddeb261203aa445", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d14e1806d88931ab6ddeb261203aa445");
                    return;
                }
                PoiSearchHistoryDao poiSearchHistoryDao = DaoSession.this.getPoiSearchHistoryDao();
                for (int i = 0; i < list.size(); i++) {
                    PoiSearchHistory poiSearchHistory = (PoiSearchHistory) list.get(i);
                    if (poiSearchHistory != null) {
                        try {
                            PoiSearchHistoryLogic.insertOrUpdate(poiSearchHistoryDao, poiSearchHistory);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void insertOrUpdate(PoiSearchHistoryDao poiSearchHistoryDao, PoiSearchHistory poiSearchHistory) {
        Object[] objArr = {poiSearchHistoryDao, poiSearchHistory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7aaf5e89eca1d7d1280a86dad3ae29d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7aaf5e89eca1d7d1280a86dad3ae29d");
            return;
        }
        String content = poiSearchHistory.getContent();
        PoiSearchHistory unique = poiSearchHistoryDao.queryBuilder().where(PoiSearchHistoryDao.Properties.Content.eq(content), new WhereCondition[0]).unique();
        if (unique == null) {
            poiSearchHistoryDao.insert(poiSearchHistory);
            return;
        }
        unique.setContent(content);
        unique.setPoiId(poiSearchHistory.getPoiId());
        unique.setUpdateTime(poiSearchHistory.getUpdateTime());
        if (poiSearchHistory.getBizSource() != null && poiSearchHistory.getBizSource().longValue() > 0) {
            unique.setBizSource(poiSearchHistory.getBizSource());
        }
        if (poiSearchHistory.getPoiIdStr() != null) {
            unique.setPoiIdStr(poiSearchHistory.getPoiIdStr());
        }
        poiSearchHistoryDao.update(unique);
    }

    public static void saveDistinctObject(PoiSearchHistory poiSearchHistory) {
        Object[] objArr = {poiSearchHistory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eedf764a38e17592df06d2c90862f6c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eedf764a38e17592df06d2c90862f6c8");
            return;
        }
        try {
            insertOrUpdate(Db.getPoiSearchHistoryDao(), poiSearchHistory);
        } catch (Exception e) {
            a.a(e);
            a.e("PoiSearchHistoryLogic", e.getMessage(), new Object[0]);
            a.b("PoiSearchHistoryLogic", e.getMessage(), e);
        }
    }

    public static List<PoiSearchHistory> getAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "413fdd73f71a08f6b9ceb9fab0ee5d09", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "413fdd73f71a08f6b9ceb9fab0ee5d09");
        }
        try {
            return Db.getPoiSearchHistoryDao().queryBuilder().orderDesc(PoiSearchHistoryDao.Properties.UpdateTime).list();
        } catch (Exception e) {
            a.a(e);
            a.e("PoiSearchHistoryLogic", e.getMessage(), new Object[0]);
            a.b("PoiSearchHistoryLogic", e.getMessage(), e);
            return null;
        }
    }

    public static List<String> getHistoryList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ArrayList arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9ecbe7446304cda8f3a0573580b32c76", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9ecbe7446304cda8f3a0573580b32c76");
        }
        List<PoiSearchHistory> all = getAll();
        if (all != null && !all.isEmpty()) {
            arrayList = new ArrayList();
            for (PoiSearchHistory poiSearchHistory : all) {
                arrayList.add(poiSearchHistory.getPoiId() + SEARCH_HISTORY_STR_SPLIT_CHAR + poiSearchHistory.getContent() + SEARCH_HISTORY_STR_SPLIT_CHAR + poiSearchHistory.getBizSource() + SEARCH_HISTORY_STR_SPLIT_CHAR + poiSearchHistory.getPoiIdStr());
            }
        }
        return arrayList;
    }

    public static void clearHistory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ec5daa3595f75ab5531a730a8773842d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ec5daa3595f75ab5531a730a8773842d");
        } else {
            Db.getPoiSearchHistoryDao().deleteAll();
        }
    }
}
