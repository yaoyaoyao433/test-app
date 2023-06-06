package com.sankuai.waimai.business.search.ui.result.mach.prerender;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.search.datatype.CommonMachData;
import com.sankuai.waimai.business.search.datatype.RecommendCard;
import com.sankuai.waimai.business.search.model.OasisModule;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class n implements h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.business.search.ui.result.mach.prerender.h
    public final CommonMachData a(OasisModule oasisModule, Serializable serializable, String str, String str2, SearchShareData searchShareData, Activity activity, int i) {
        Object[] objArr = {oasisModule, serializable, str, str2, searchShareData, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc01b2db5963034eb437042ff8b5f60b", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc01b2db5963034eb437042ff8b5f60b");
        }
        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(str);
        com.sankuai.waimai.mach.recycler.b bVar = SearchShareData.s;
        com.sankuai.waimai.business.search.ui.result.rank.b bVar2 = new com.sankuai.waimai.business.search.ui.result.rank.b();
        com.sankuai.waimai.mach.recycler.c a3 = com.sankuai.waimai.business.search.ui.result.mach.b.a(bVar, "mach_waimai-search-labelrank-style-8", "mach_waimai-search-labelrank-style-8", activity, a2, str, i - (searchShareData.Z ? 0 : com.sankuai.waimai.foundation.utils.g.a(activity, 12.0f) * 2), 0, null, bVar2, a((RecommendCard) serializable));
        bVar2.c = a3;
        if (a3 != null) {
            a3.a("mach_extra_key_biz_data", serializable);
            CommonMachData commonMachData = new CommonMachData(a3);
            if (searchShareData.Z) {
                commonMachData.mNeedAdjustPadding = 5;
            } else {
                commonMachData.mNeedAdjustPadding = 2;
            }
            return commonMachData;
        }
        return null;
    }

    private Map<String, Object> a(RecommendCard recommendCard) {
        Object[] objArr = {recommendCard};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77573f53afc880f4aaff3be598b1b154", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77573f53afc880f4aaff3be598b1b154");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < recommendCard.rankLabelCardVo.labels.size(); i++) {
            RecommendCard.RankCardLabel rankCardLabel = recommendCard.rankLabelCardVo.labels.get(i);
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", Long.valueOf(rankCardLabel.poiId));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, rankCardLabel.poiIdStr);
            hashMap.put("index", Integer.valueOf(i));
            arrayList.add(hashMap);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("label_rank_item_info", arrayList);
        return hashMap2;
    }
}
