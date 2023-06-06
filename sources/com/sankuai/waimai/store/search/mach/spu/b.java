package com.sankuai.waimai.store.search.mach.spu;

import android.app.Activity;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.store.search.ui.result.mach.prerender.a {
    public static ChangeQuickRedirect a;
    private String b;

    public b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "132b538e9ea7d457b9bde0789a3a4e2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "132b538e9ea7d457b9bde0789a3a4e2c");
        } else {
            this.b = str;
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.mach.prerender.a
    public final CommonMachData a(Serializable serializable, String str, String str2, SearchShareData searchShareData, Activity activity, int i) {
        Object[] objArr = {serializable, str, str2, searchShareData, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c825ef2a09cc8144950b8735dccb101", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c825ef2a09cc8144950b8735dccb101");
        }
        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(str);
        com.sankuai.waimai.mach.recycler.b bVar = searchShareData.t;
        Map<String, Object> map = searchShareData.L == null ? null : searchShareData.L.f;
        a aVar = new a(1, "c_nfqbfvw", AppUtil.generatePageInfoKey(activity));
        c a3 = com.sankuai.waimai.store.search.ui.result.mach.b.a(bVar, this.b, "", activity, a2, str, i, 0, null, aVar, null, map);
        aVar.b = a3;
        if (a3 == null || a3.b() == null) {
            return null;
        }
        a3.a("mach_extra_key_biz_data", serializable);
        return new CommonMachData(a3, str2, serializable);
    }
}
