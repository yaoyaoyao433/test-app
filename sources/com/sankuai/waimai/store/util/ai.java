package com.sankuai.waimai.store.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ai {
    public static ChangeQuickRedirect a;

    public static boolean a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a30acc0d1e796f243136be51aa150a8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a30acc0d1e796f243136be51aa150a8")).booleanValue() : System.currentTimeMillis() - j > 900000;
    }
}
