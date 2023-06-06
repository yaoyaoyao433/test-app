package com.sankuai.waimai.business.page.home.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class p {
    public static ChangeQuickRedirect a;

    public static Map<String, String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd189cd574312d8011513c8dd1cd1d92", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd189cd574312d8011513c8dd1cd1d92") : com.sankuai.waimai.platform.net.e.b();
    }
}
