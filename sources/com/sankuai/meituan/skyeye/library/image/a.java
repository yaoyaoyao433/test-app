package com.sankuai.meituan.skyeye.library.image;

import android.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static LruCache b = new LruCache(1024);
    private static long c = 300;

    public static void a(Long l) {
        Object[] objArr = {l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3af45c77ed697f5bea998603259258e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3af45c77ed697f5bea998603259258e4");
        } else {
            c = l.longValue();
        }
    }
}
