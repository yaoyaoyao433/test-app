package com.meituan.passport.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class z {
    public static ChangeQuickRedirect a;
    private static z c;
    public Map<String, Object> b;

    public static synchronized z a() {
        synchronized (z.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dbded30b300763415f6afba371a7916", RobustBitConfig.DEFAULT_VALUE)) {
                return (z) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dbded30b300763415f6afba371a7916");
            }
            if (c == null) {
                c = new z();
            }
            return c;
        }
    }
}
