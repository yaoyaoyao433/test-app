package com.sankuai.waimai.store.search.mach.paotui;

import android.app.Activity;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.V732PaotuiEntranceData;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.store.search.ui.result.mach.prerender.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.ui.result.mach.prerender.a
    public final CommonMachData a(Serializable serializable, String str, String str2, SearchShareData searchShareData, Activity activity, int i) {
        Map hashMap;
        Object[] objArr = {serializable, str, str2, searchShareData, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7cbfecf46adfdadb265489be8d61803", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7cbfecf46adfdadb265489be8d61803");
        }
        String json = new Gson().toJson(serializable);
        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(json);
        com.sankuai.waimai.mach.recycler.b bVar = searchShareData.t;
        int a3 = i - (g.a(activity, 12.0f) * 2);
        Map<String, Object> map = searchShareData.L == null ? null : searchShareData.L.f;
        V732PaotuiEntranceData v732PaotuiEntranceData = (V732PaotuiEntranceData) serializable;
        Object[] objArr2 = {v732PaotuiEntranceData, searchShareData};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "194e4686d962fd34de2351007bf5fa52", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "194e4686d962fd34de2351007bf5fa52");
        } else {
            hashMap = new HashMap();
            WmAddress k = com.sankuai.waimai.foundation.location.v2.g.a().k();
            hashMap.put("query_type", Integer.valueOf(searchShareData.n));
            hashMap.put("sub_category_type", Integer.valueOf(searchShareData.B));
            hashMap.put("entrace_id", Long.valueOf(searchShareData.y));
            if (k != null && !TextUtils.isEmpty(k.getAddress())) {
                hashMap.put("location_address", k.getAddress());
            }
            String str3 = v732PaotuiEntranceData.paotuiContext;
            if (!TextUtils.isEmpty(searchShareData.h) && !TextUtils.isEmpty(str3)) {
                if (str3.indexOf(searchShareData.h) != -1) {
                    int indexOf = str3.indexOf(searchShareData.h) + searchShareData.h.length();
                    String substring = str3.substring(0, indexOf);
                    String substring2 = str3.substring(indexOf);
                    hashMap.put("paotui_first_str_tip", substring);
                    hashMap.put("paotui_second_str_tip", substring2);
                } else {
                    hashMap.put("paotui_first_str_tip", "");
                    hashMap.put("paotui_second_str_tip", str3);
                }
            }
        }
        c a4 = com.sankuai.waimai.store.search.ui.result.mach.b.a(bVar, "supermarket-search-paotui-poi", "", activity, a2, json, a3, 0, null, null, hashMap, map);
        if (a4 == null || a4.b() == null) {
            return null;
        }
        a4.a("mach_extra_key_biz_data", serializable);
        CommonMachData commonMachData = new CommonMachData(a4, str2, serializable);
        commonMachData.mNeedAdjustPadding = 3;
        return commonMachData;
    }
}
