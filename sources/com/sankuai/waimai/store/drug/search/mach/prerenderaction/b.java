package com.sankuai.waimai.store.drug.search.mach.prerenderaction;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.store.search.ui.result.mach.prerender.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.ui.result.mach.prerender.a
    public final CommonMachData a(Serializable serializable, String str, String str2, @NonNull SearchShareData searchShareData, Activity activity, int i) {
        Object[] objArr = {serializable, str, str2, searchShareData, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ea383f0eba23f58bee5800bd2a9f7ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ea383f0eba23f58bee5800bd2a9f7ed");
        }
        String a2 = i.a(serializable);
        Map<String, Object> a3 = com.sankuai.waimai.mach.utils.b.a(a2);
        a3.put(Constants.Environment.KEY_UNION_ID, str2);
        com.sankuai.waimai.mach.recycler.b bVar = searchShareData.t;
        Map<String, Object> map = searchShareData.L == null ? null : searchShareData.L.f;
        int a4 = g.a(activity, 8.0f);
        c a5 = com.sankuai.waimai.store.search.ui.result.mach.b.a(bVar, "supermarket-drug-search-result-two-column", "", activity, a3, a2, ((i - (g.a(activity, 12.0f) * 2)) - a4) / 2, 0, null, null, null, map);
        if (a5 == null || a5.b() == null) {
            return null;
        }
        a5.a("mach_extra_key_biz_data", serializable);
        CommonMachData commonMachData = new CommonMachData(a5, str2, serializable);
        commonMachData.bottomMargin = a4;
        return commonMachData;
    }
}
