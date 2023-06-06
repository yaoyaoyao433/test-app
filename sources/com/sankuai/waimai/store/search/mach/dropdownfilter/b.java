package com.sankuai.waimai.store.search.mach.dropdownfilter;

import android.app.Activity;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.search.common.view.d;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.model.QuickFilterCard;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.store.search.ui.result.mach.prerender.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.ui.result.mach.prerender.a
    public final CommonMachData a(Serializable serializable, String str, String str2, SearchShareData searchShareData, Activity activity, int i) {
        Object[] objArr = {serializable, str, str2, searchShareData, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c02ffd9e7b3b37eaba4fc64beeb41791", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c02ffd9e7b3b37eaba4fc64beeb41791");
        }
        if (serializable instanceof QuickFilterCard) {
            if (com.sankuai.shangou.stone.util.a.b(searchShareData.aq)) {
                searchShareData.aq.addAll(((QuickFilterCard) serializable).filterList);
            }
            int i2 = searchShareData.ab;
            for (GuidedItem guidedItem : searchShareData.aq) {
                if (com.sankuai.shangou.stone.util.a.b(guidedItem.mDropDownItems)) {
                    a.a(guidedItem, searchShareData);
                } else {
                    a.b(guidedItem, searchShareData);
                }
                guidedItem.itemWidth = com.sankuai.waimai.store.search.util.a.a(activity, TextUtils.isEmpty(guidedItem.selectedCodeStr) ? guidedItem.text : guidedItem.selectedCodeStr, "PingFangSC-Regular", false, 78, 12);
            }
            QuickFilterCard quickFilterCard = (QuickFilterCard) serializable;
            quickFilterCard.filterList = searchShareData.aq;
            d.a(activity, quickFilterCard.filterList);
            String json = new Gson().toJson(serializable);
            Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(json);
            com.sankuai.waimai.mach.recycler.b bVar = searchShareData.t;
            HashMap hashMap = new HashMap();
            hashMap.put("density", Float.valueOf(activity.getResources().getDisplayMetrics().density));
            hashMap.put("currentPos", Integer.valueOf(i2));
            c a3 = com.sankuai.waimai.store.search.ui.result.mach.b.a(bVar, "supermarket-search-drop-down-filter", "", activity, a2, json, i, 0, null, null, hashMap, searchShareData.L == null ? null : searchShareData.L.f);
            if (a3 == null || a3.b() == null) {
                return null;
            }
            a3.a("mach_extra_key_biz_data", serializable);
            return new CommonMachData(a3, str2, serializable);
        }
        return null;
    }
}
