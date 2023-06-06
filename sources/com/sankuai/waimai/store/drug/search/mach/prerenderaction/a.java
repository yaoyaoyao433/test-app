package com.sankuai.waimai.store.drug.search.mach.prerenderaction;

import android.app.Activity;
import android.text.TextUtils;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.SGActivityFilterEntity;
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
        SGActivityFilterEntity sGActivityFilterEntity;
        Object[] objArr = {serializable, str, str2, searchShareData, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd336d98bd5d3ef2f06556705174372c", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd336d98bd5d3ef2f06556705174372c");
        }
        if (serializable instanceof SGActivityFilterEntity) {
            sGActivityFilterEntity = (SGActivityFilterEntity) serializable;
            if (!TextUtils.isEmpty(sGActivityFilterEntity.code)) {
                searchShareData.W = sGActivityFilterEntity;
            } else {
                sGActivityFilterEntity = searchShareData.W;
            }
        } else {
            sGActivityFilterEntity = null;
        }
        if (sGActivityFilterEntity == null) {
            return null;
        }
        String json = new Gson().toJson(sGActivityFilterEntity);
        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(json);
        com.sankuai.waimai.mach.recycler.b bVar = searchShareData.t;
        HashMap hashMap = new HashMap();
        hashMap.put(DMKeys.KEY_SELECTED, Boolean.valueOf(sGActivityFilterEntity != null ? sGActivityFilterEntity.hasSelected : false));
        c a3 = com.sankuai.waimai.store.search.ui.result.mach.b.a(bVar, "drug-search-activity-quick-filter", "", activity, a2, json, i, 0, null, null, hashMap, searchShareData.L == null ? null : searchShareData.L.f);
        if (a3 == null || a3.b() == null) {
            return null;
        }
        a3.a("mach_extra_key_biz_data", serializable);
        return new CommonMachData(a3, str2, serializable);
    }
}
