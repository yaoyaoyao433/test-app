package com.meituan.android.msc.yoga;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static boolean a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c513d9500aaed0e36f696f8e7c65c0b8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c513d9500aaed0e36f696f8e7c65c0b8")).booleanValue() : Float.compare(f, Float.NaN) == 0;
    }

    public static int b(float f) {
        float f2;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "969162cb55bbe16a9104df173de88b17", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "969162cb55bbe16a9104df173de88b17")).intValue();
        }
        Object[] objArr2 = {Float.valueOf(f), Float.valueOf(-1.0f)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8bbf04bc7d5c21a2a8a345d6ce5b38f8", RobustBitConfig.DEFAULT_VALUE)) {
            f2 = ((Float) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8bbf04bc7d5c21a2a8a345d6ce5b38f8")).floatValue();
        } else {
            f2 = a(f) ? -1.0f : f;
        }
        return Math.round(f2);
    }
}
