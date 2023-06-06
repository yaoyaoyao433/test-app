package com.sankuai.waimai.ad.gray;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.platform.capacity.abtest.a {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b3d175a0510c54f0a459cecb057445e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b3d175a0510c54f0a459cecb057445e")).booleanValue();
        }
        String str = "search_ad_prerender";
        if (com.sankuai.waimai.foundation.core.a.e()) {
            str = "search_ad_prerender_mt";
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            str = "search_ad_prerender_dp";
        }
        ABStrategy a2 = a(str, null);
        return a2 != null && TextUtils.equals("A", a2.expName);
    }
}
