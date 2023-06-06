package com.sankuai.waimai.store.view.banner.bizinfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e434d0a55efec0adc1823991a996c11", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e434d0a55efec0adc1823991a996c11") : com.sankuai.waimai.foundation.core.service.bizInfo.a.a().getPoiAdIconUrl();
    }
}
