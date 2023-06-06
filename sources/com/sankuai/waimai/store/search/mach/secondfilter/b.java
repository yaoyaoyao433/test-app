package com.sankuai.waimai.store.search.mach.secondfilter;

import android.app.Activity;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.search.common.view.d;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.model.SecondFilterCard;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.store.search.ui.result.mach.prerender.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.ui.result.mach.prerender.a
    public final CommonMachData a(Serializable serializable, String str, String str2, SearchShareData searchShareData, Activity activity, int i) {
        List<GuidedItem> list;
        SecondFilterCard secondFilterCard;
        int i2 = 0;
        Object[] objArr = {serializable, str, str2, searchShareData, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "165a984009c73a60876226753da0d2ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "165a984009c73a60876226753da0d2ca");
        }
        if (serializable instanceof SecondFilterCard) {
            SecondFilterCard secondFilterCard2 = (SecondFilterCard) serializable;
            if (com.sankuai.shangou.stone.util.a.b(secondFilterCard2.filterList)) {
                list = searchShareData.Y;
                i2 = searchShareData.aa;
                secondFilterCard = (SecondFilterCard) searchShareData.Z;
            } else {
                List<GuidedItem> list2 = secondFilterCard2.filterList;
                searchShareData.Y.addAll(secondFilterCard2.filterList);
                searchShareData.Z = serializable;
                secondFilterCard = secondFilterCard2;
                list = list2;
            }
        } else {
            list = null;
            secondFilterCard = null;
        }
        if (list == null) {
            return null;
        }
        d.a(activity, list);
        String json = new Gson().toJson(secondFilterCard);
        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(json);
        com.sankuai.waimai.mach.recycler.b bVar = searchShareData.t;
        HashMap hashMap = new HashMap();
        hashMap.put("density", Float.valueOf(activity.getResources().getDisplayMetrics().density));
        hashMap.put("currentPos", Integer.valueOf(i2));
        SecondFilterCard secondFilterCard3 = secondFilterCard;
        c a3 = com.sankuai.waimai.store.search.ui.result.mach.b.a(bVar, "supermarket-search-second-filter", "", activity, a2, json, i, 0, null, null, hashMap, searchShareData.L == null ? null : searchShareData.L.f);
        if (a3 == null || a3.b() == null) {
            return null;
        }
        a3.a("mach_extra_key_biz_data", secondFilterCard3);
        return new CommonMachData(a3, str2, secondFilterCard3);
    }
}
