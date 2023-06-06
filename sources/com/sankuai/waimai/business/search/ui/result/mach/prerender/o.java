package com.sankuai.waimai.business.search.ui.result.mach.prerender;

import android.app.Activity;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.CommonMachData;
import com.sankuai.waimai.business.search.model.OasisModule;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class o extends p {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.business.search.ui.result.mach.prerender.h
    public final CommonMachData a(OasisModule oasisModule, Serializable serializable, String str, String str2, SearchShareData searchShareData, Activity activity, int i) {
        Object[] objArr = {oasisModule, serializable, str, str2, searchShareData, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c3b11f8c6f59e9788d38b1cec71f981", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c3b11f8c6f59e9788d38b1cec71f981");
        }
        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(str);
        com.sankuai.waimai.mach.recycler.b bVar = SearchShareData.s;
        int a3 = com.sankuai.waimai.foundation.utils.g.a(activity, 12.0f);
        com.sankuai.waimai.business.search.ui.result.food.a aVar = new com.sankuai.waimai.business.search.ui.result.food.a(searchShareData);
        a2.put("user_prefer_type", searchShareData.ae);
        a2.put(Constants.Environment.KEY_UNION_ID, str2);
        com.sankuai.waimai.mach.recycler.c a4 = com.sankuai.waimai.business.search.ui.result.mach.b.a(bVar, "waimai-search-supermarket-feed-1", "waimai-search-supermarket-feed-1", activity, a2, str, i - (a3 * 2), 0, null, aVar, null);
        aVar.b = a4;
        if (a4 == null || a4.b() == null) {
            return null;
        }
        a4.a("mach_extra_key_biz_data", serializable);
        CommonMachData commonMachData = new CommonMachData(a4, str2);
        commonMachData.mNeedAdjustPadding = 3;
        return commonMachData;
    }
}
