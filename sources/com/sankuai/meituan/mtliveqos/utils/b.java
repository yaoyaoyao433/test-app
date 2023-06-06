package com.sankuai.meituan.mtliveqos.utils;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static com.sankuai.meituan.mtliveqos.utils.cpu.a b;

    static {
        com.sankuai.meituan.mtliveqos.utils.cpu.a cVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = com.sankuai.meituan.mtliveqos.utils.cpu.d.a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef6ebc751e3fa77990b99575a7993567", RobustBitConfig.DEFAULT_VALUE)) {
            cVar = (com.sankuai.meituan.mtliveqos.utils.cpu.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef6ebc751e3fa77990b99575a7993567");
        } else if (Build.VERSION.SDK_INT < 26) {
            cVar = new com.sankuai.meituan.mtliveqos.utils.cpu.b();
        } else {
            cVar = new com.sankuai.meituan.mtliveqos.utils.cpu.c();
        }
        b = cVar;
    }

    public static float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe5c7fbdbc8c1ac9db5286b6ece2d567", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe5c7fbdbc8c1ac9db5286b6ece2d567")).floatValue() : d.a(b.a());
    }

    public static float b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bf324e6e023143996523e15a67a4dac", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bf324e6e023143996523e15a67a4dac")).floatValue() : d.a(b.b());
    }
}
