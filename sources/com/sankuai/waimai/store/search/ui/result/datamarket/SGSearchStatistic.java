package com.sankuai.waimai.store.search.ui.result.datamarket;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGSearchStatistic implements IMonitor {
    SearchLogId,
    CatId,
    Stid,
    Keyword,
    SearchSource,
    SearchGlobalId,
    Index,
    TemplateType,
    RankType,
    FilterType,
    IsLbs,
    InShopGlobalId,
    InShopLogId,
    InShopStid,
    InShopPoiId,
    InShopKeyword,
    InShopIndex,
    InShopSpuId,
    InShopSkuId,
    InShopPositionIndex,
    Custom,
    Horn;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
        return null;
    }

    SGSearchStatistic() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7afc9882feec5a91f5b7781040b9c2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7afc9882feec5a91f5b7781040b9c2f");
        }
    }

    public static SGSearchStatistic valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63c5da5f4cfa7c7686c47398bb0ad055", RobustBitConfig.DEFAULT_VALUE) ? (SGSearchStatistic) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63c5da5f4cfa7c7686c47398bb0ad055") : (SGSearchStatistic) Enum.valueOf(SGSearchStatistic.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGSearchStatistic[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "634b3ca9bbf1a184a740b83e07356bce", RobustBitConfig.DEFAULT_VALUE) ? (SGSearchStatistic[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "634b3ca9bbf1a184a740b83e07356bce") : (SGSearchStatistic[]) values().clone();
    }
}
