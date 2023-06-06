package com.sankuai.waimai.platform.db.logic;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.b;
import com.sankuai.waimai.platform.db.Db;
import com.sankuai.waimai.platform.db.dao.InshopSearchHistory;
import com.sankuai.waimai.platform.db.dao.InshopSearchHistoryDao;
import de.greenrobot.dao.WhereCondition;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class InshopSearchHistoryLogic {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void saveDistinctObject(InshopSearchHistory inshopSearchHistory) {
        Object[] objArr = {inshopSearchHistory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76068b6ea7a00f94e6f92066f610b4f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76068b6ea7a00f94e6f92066f610b4f5");
            return;
        }
        InshopSearchHistoryDao inshopSearchHistoryDao = Db.getInshopSearchHistoryDao();
        if (inshopSearchHistoryDao != null) {
            String content = inshopSearchHistory.getContent();
            InshopSearchHistory unique = inshopSearchHistoryDao.queryBuilder().where(InshopSearchHistoryDao.Properties.PoiId.eq(Long.valueOf(inshopSearchHistory.getPoiId().longValue())), new WhereCondition[0]).where(InshopSearchHistoryDao.Properties.Content.eq(content), new WhereCondition[0]).unique();
            if (unique == null) {
                Db.defaultInsert(inshopSearchHistoryDao, inshopSearchHistory);
                return;
            }
            unique.setContent(content);
            unique.setUpdateTime(inshopSearchHistory.getUpdateTime());
            unique.setPoiId(inshopSearchHistory.getPoiId());
            inshopSearchHistoryDao.update(unique);
        }
    }

    private static List<InshopSearchHistory> getAll(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37710dc4ef3057919e28bacbae29e3de", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37710dc4ef3057919e28bacbae29e3de");
        }
        InshopSearchHistoryDao inshopSearchHistoryDao = Db.getInshopSearchHistoryDao();
        if (inshopSearchHistoryDao != null) {
            return inshopSearchHistoryDao.queryBuilder().where(InshopSearchHistoryDao.Properties.PoiId.eq(Long.valueOf(j)), new WhereCondition[0]).orderDesc(InshopSearchHistoryDao.Properties.UpdateTime).list();
        }
        return null;
    }

    public static List<String> getHistoryList(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ArrayList arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95ee7ed1640e13722b13ff6e111a0475", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95ee7ed1640e13722b13ff6e111a0475");
        }
        List<InshopSearchHistory> all = getAll(j);
        if (all != null && !all.isEmpty()) {
            arrayList = new ArrayList();
            for (InshopSearchHistory inshopSearchHistory : all) {
                arrayList.add(inshopSearchHistory.getContent());
            }
        }
        return arrayList;
    }

    public static void clearHistoryByPoiId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "870e5eb653033f272bfcc3d3af4368dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "870e5eb653033f272bfcc3d3af4368dc");
            return;
        }
        InshopSearchHistoryDao inshopSearchHistoryDao = Db.getInshopSearchHistoryDao();
        List<InshopSearchHistory> all = getAll(j);
        if (inshopSearchHistoryDao == null || b.b(all)) {
            return;
        }
        inshopSearchHistoryDao.deleteInTx(all);
    }
}
