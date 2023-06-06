package com.sankuai.waimai.restaurant.shopcart.config;

import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public Drawable b;
    public Drawable c;
    public String d;
    public String e;

    public b() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        private static final b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3cd27f34e0f16122958ab6828c67de0", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3cd27f34e0f16122958ab6828c67de0") : a.a;
    }
}
