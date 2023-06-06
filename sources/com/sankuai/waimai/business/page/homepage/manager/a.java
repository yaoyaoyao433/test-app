package com.sankuai.waimai.business.page.homepage.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static com.sankuai.waimai.business.page.homepage.listener.b b;

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3d40ea5822ab2be92be41df0000f3a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3d40ea5822ab2be92be41df0000f3a4");
        } else if (b != null) {
            b.a(i);
        }
    }
}
