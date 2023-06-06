package com.sankuai.meituan.kernel.net.base;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static Application b;
    public static b c;
    public static a d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        boolean a();
    }

    public static b a() {
        return c != null ? c : b.a;
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5067d5ef369d3b169fcd721a80ebe63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5067d5ef369d3b169fcd721a80ebe63")).booleanValue();
        }
        if (d == null) {
            return false;
        }
        return d.a();
    }
}
