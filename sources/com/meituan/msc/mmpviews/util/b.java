package com.meituan.msc.mmpviews.util;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "379294173a5bdd70ef6d9704e7d89d50", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "379294173a5bdd70ef6d9704e7d89d50")).booleanValue();
        }
        if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            return !TextUtils.isEmpty(asString) && Boolean.parseBoolean(asString);
        } else if (dynamic.getType() == ReadableType.Boolean) {
            return dynamic.asBoolean();
        } else {
            return false;
        }
    }

    public static double b(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71ec29cb77e58e0f6ba43bcd7bc7d812", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71ec29cb77e58e0f6ba43bcd7bc7d812")).doubleValue();
        }
        if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            if (TextUtils.isEmpty(asString)) {
                return -1.0d;
            }
            return Double.parseDouble(asString);
        } else if (dynamic.getType() == ReadableType.Number) {
            return dynamic.asDouble();
        } else {
            return -1.0d;
        }
    }

    public static double a(Dynamic dynamic, Context context) {
        Object[] objArr = {dynamic, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "751622fffb126a41b08973abb76bb03b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "751622fffb126a41b08973abb76bb03b")).doubleValue();
        }
        if (dynamic.getType() == ReadableType.String) {
            return com.meituan.msc.mmpviews.list.a.a(context, dynamic.asString());
        }
        if (dynamic.getType() == ReadableType.Number) {
            return dynamic.asDouble();
        }
        return -1.0d;
    }
}
