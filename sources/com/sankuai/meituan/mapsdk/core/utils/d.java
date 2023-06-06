package com.sankuai.meituan.mapsdk.core.utils;

import android.content.res.Resources;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "332ff2c37ac4e407be24d71f95280e20", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "332ff2c37ac4e407be24d71f95280e20")).floatValue() : f / Resources.getSystem().getDisplayMetrics().density;
    }

    public static int b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39b94b88f93aad4be41883169d80cff2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39b94b88f93aad4be41883169d80cff2")).intValue() : (int) (f * Resources.getSystem().getDisplayMetrics().density);
    }

    public static float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "549228400922fbb1fbe133669d929069", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "549228400922fbb1fbe133669d929069")).floatValue() : Resources.getSystem().getDisplayMetrics().density;
    }
}
