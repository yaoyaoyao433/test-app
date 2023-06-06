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
public final class a implements h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.business.search.ui.result.mach.prerender.h
    public final CommonMachData a(OasisModule oasisModule, Serializable serializable, String str, String str2, SearchShareData searchShareData, Activity activity, int i) {
        Object[] objArr = {oasisModule, serializable, str, str2, searchShareData, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c71b01d23be6ab9d9b1c3a8fc2d904", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c71b01d23be6ab9d9b1c3a8fc2d904");
        }
        int a2 = com.sankuai.waimai.foundation.utils.g.a(activity, 12.0f);
        Map<String, Object> a3 = com.sankuai.waimai.mach.utils.b.a(str);
        a3.put(Constants.Environment.KEY_UNION_ID, str2);
        com.sankuai.waimai.mach.recycler.c a4 = com.sankuai.waimai.business.search.ui.result.mach.b.a(SearchShareData.s, "mach_waimai-search-business-direct-style-12", "mach_waimai-search-business-direct-style-12", activity, a3, str, i - (searchShareData.Z ? 0 : a2 * 2), 0, null, null, null);
        if (a4 == null || a4.b() == null) {
            return null;
        }
        a4.a("mach_extra_key_biz_data", serializable);
        CommonMachData commonMachData = new CommonMachData(a4, str2);
        if (searchShareData.Z) {
            commonMachData.mNeedAdjustPadding = 7;
        } else {
            commonMachData.mNeedAdjustPadding = 4;
        }
        return commonMachData;
    }
}
