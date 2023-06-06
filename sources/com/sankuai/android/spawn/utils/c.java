package com.sankuai.android.spawn.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static double a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c627be5f920b1d7830e51355ffe63f03", 6917529027641081856L) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c627be5f920b1d7830e51355ffe63f03")).doubleValue() : (d * 3.141592653589793d) / 180.0d;
    }
}
