package com.sankuai.waimai.store.search.mach.paotui;

import android.app.Activity;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
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
public final class b implements com.sankuai.waimai.store.search.ui.result.mach.prerender.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.ui.result.mach.prerender.a
    public final CommonMachData a(Serializable serializable, String str, String str2, SearchShareData searchShareData, Activity activity, int i) {
        Map hashMap;
        Object[] objArr = {serializable, str, str2, searchShareData, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07de5b64ccd232b3b69896765de6d343", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07de5b64ccd232b3b69896765de6d343");
        }
        String json = new Gson().toJson(serializable);
        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(json);
        com.sankuai.waimai.mach.recycler.b bVar = searchShareData.t;
        int a3 = i - (g.a(activity, 12.0f) * 2);
        Map<String, Object> map = searchShareData.L == null ? null : searchShareData.L.f;
        V732PaotuiEntranceData v732PaotuiEntranceData = (V732PaotuiEntranceData) serializable;
        String str3 = searchShareData.h;
        Object[] objArr2 = {v732PaotuiEntranceData, str3};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c4185de156fedf6d2ab02d02d2b2504", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c4185de156fedf6d2ab02d02d2b2504");
        } else {
            hashMap = new HashMap();
            String str4 = "";
            String str5 = "";
            if (!TextUtils.isEmpty(v732PaotuiEntranceData.paotuiContext) && !TextUtils.isEmpty(str3)) {
                int indexOf = v732PaotuiEntranceData.paotuiContext.indexOf(str3);
                if (indexOf >= 0) {
                    str4 = v732PaotuiEntranceData.paotuiContext.substring(0, str3.length() + indexOf);
                    str5 = v732PaotuiEntranceData.paotuiContext.substring(indexOf + str3.length());
                } else {
                    str5 = v732PaotuiEntranceData.paotuiContext;
                }
            }
            hashMap.put("paotui_first_str_tip", str4);
            hashMap.put("paotui_second_str_tip", str5);
        }
        c a4 = com.sankuai.waimai.store.search.ui.result.mach.b.a(bVar, "supermarket-search-paotui-common", "", activity, a2, json, a3, 0, null, null, hashMap, map);
        if (a4 == null || a4.b() == null) {
            return null;
        }
        a4.a("mach_extra_key_biz_data", serializable);
        CommonMachData commonMachData = new CommonMachData(a4, str2, serializable);
        commonMachData.mNeedAdjustPadding = 3;
        return commonMachData;
    }
}
