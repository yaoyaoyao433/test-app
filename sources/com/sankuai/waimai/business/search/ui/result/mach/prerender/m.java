package com.sankuai.waimai.business.search.ui.result.mach.prerender;

import android.app.Activity;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.CommonMachData;
import com.sankuai.waimai.business.search.datatype.RecommendCard;
import com.sankuai.waimai.business.search.model.OasisModule;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m implements h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.business.search.ui.result.mach.prerender.h
    public final CommonMachData a(OasisModule oasisModule, Serializable serializable, String str, String str2, SearchShareData searchShareData, Activity activity, int i) {
        Object[] objArr = {oasisModule, serializable, str, str2, searchShareData, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f620599a365b3c4784e0fca60f48bcee", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f620599a365b3c4784e0fca60f48bcee");
        }
        com.sankuai.waimai.mach.recycler.c a2 = com.sankuai.waimai.business.search.ui.result.mach.b.a(SearchShareData.s, "mach_waimai-search-queryrecommend-style-10", "mach_waimai-search-queryrecommend-style-10", activity, com.sankuai.waimai.mach.utils.b.a(str), str, i - (searchShareData.Z ? 0 : com.sankuai.waimai.foundation.utils.g.a(activity, 12.0f) * 2), 0, new com.sankuai.waimai.business.search.ui.result.rank.a(), null, a((RecommendCard) serializable));
        if (a2 != null) {
            a2.a("mach_extra_key_biz_data", serializable);
            CommonMachData commonMachData = new CommonMachData(a2);
            if (searchShareData.Z) {
                commonMachData.mNeedAdjustPadding = 6;
            } else {
                commonMachData.mNeedAdjustPadding = 3;
            }
            return commonMachData;
        }
        return null;
    }

    private Map<String, Object> a(RecommendCard recommendCard) {
        Object[] objArr = {recommendCard};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70e12f3c564ad767d110cbe94d63ff99", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70e12f3c564ad767d110cbe94d63ff99");
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (recommendCard.queries.size() <= 6) {
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (int i = 0; i < recommendCard.queries.size(); i++) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(SearchIntents.EXTRA_QUERY, recommendCard.queries.get(i).data);
                hashMap2.put("index", Integer.valueOf(recommendCard.queries.get(i).inner_index));
                arrayList2.add(hashMap2);
                if (arrayList2.size() >= 3 || i == recommendCard.queries.size() - 1) {
                    arrayList.add(arrayList2);
                    arrayList2 = new ArrayList<>();
                }
            }
        } else {
            a(recommendCard.queries, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (RecommendCard.Query query : recommendCard.queries) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put(SearchIntents.EXTRA_QUERY, query.data);
            hashMap3.put("index", Integer.valueOf(query.inner_index));
            arrayList3.add(hashMap3);
        }
        hashMap.put("queryrecommend_mach_data", arrayList);
        hashMap.put("query_item_info", arrayList3);
        return hashMap;
    }

    private void a(List<RecommendCard.Query> list, List<ArrayList<Map<String, Object>>> list2) {
        while (true) {
            int i = 0;
            Object[] objArr = {list, list2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a9ad5ce4db5a265f06a81b7f9f3b6b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a9ad5ce4db5a265f06a81b7f9f3b6b");
                return;
            }
            if (list.size() <= 3) {
                ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
                while (i < list.size()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(SearchIntents.EXTRA_QUERY, list.get(i).data);
                    hashMap.put("index", Integer.valueOf(list.get(i).inner_index));
                    arrayList.add(hashMap);
                    i++;
                }
                list2.add(arrayList);
                return;
            }
            boolean z = false;
            for (int i2 = 0; i2 < list.size(); i2++) {
                z = list.get(i2).data.length() >= 6;
                if (z || i2 >= 3) {
                    break;
                }
            }
            int i3 = z ? 3 : 4;
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            while (i < list.size()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(SearchIntents.EXTRA_QUERY, list.get(i).data);
                hashMap2.put("index", Integer.valueOf(list.get(i).inner_index));
                arrayList2.add(hashMap2);
                if (i >= i3 - 1) {
                    break;
                }
                i++;
            }
            list2.add(arrayList2);
            if (list.size() <= i3) {
                return;
            }
            list = list.subList(i3, list.size());
        }
    }
}
