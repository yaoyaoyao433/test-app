package com.meituan.msc.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class s {
    public static ChangeQuickRedirect a;

    public static float a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6939abcfe7e8f1fa08f7586b6648dfcd", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6939abcfe7e8f1fa08f7586b6648dfcd")).floatValue() : a((float) d);
    }

    public static float b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72abd6b8e48667413fe1954ed681a4f8", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72abd6b8e48667413fe1954ed681a4f8")).floatValue() : a(f, Float.NaN);
    }

    public static float b(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46a22d89e8e3a765f94b7ad0eb136049", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46a22d89e8e3a765f94b7ad0eb136049")).floatValue() : b((float) d);
    }

    public static float a(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af9933ea9ed7699e95e2399cc3117a19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af9933ea9ed7699e95e2399cc3117a19")).floatValue();
        }
        if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            if (asString.endsWith("px")) {
                return Float.parseFloat(asString.substring(0, asString.length() - 2));
            }
            return Float.parseFloat(asString);
        } else if (dynamic.getType() == ReadableType.Number) {
            return (float) dynamic.asDouble();
        } else {
            return 0.0f;
        }
    }

    public static float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "baa742cbc62ade5cc85999d3d38b0f57", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "baa742cbc62ade5cc85999d3d38b0f57")).floatValue() : TypedValue.applyDimension(1, f, c.b);
    }

    public static float a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce4bf5f8912da03f76c164e0166ba7f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce4bf5f8912da03f76c164e0166ba7f8")).floatValue();
        }
        DisplayMetrics displayMetrics = c.b;
        float f3 = displayMetrics.scaledDensity;
        float f4 = f3 / displayMetrics.density;
        if (f2 >= 1.0f && f2 < f4) {
            f3 = displayMetrics.density * f2;
        }
        return f * f3;
    }

    public static float c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6339f729267aecc0770cbe382d24f38a", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6339f729267aecc0770cbe382d24f38a")).floatValue() : f / c.b.density;
    }
}
