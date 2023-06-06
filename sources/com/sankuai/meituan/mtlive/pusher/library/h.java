package com.sankuai.meituan.mtlive.pusher.library;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static b a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b54dc73e1bdc67b46894932b955421f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b54dc73e1bdc67b46894932b955421f2");
        }
        int i2 = k.a().f;
        Object[] objArr2 = {context, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "897dd98968adbcb6ac19ca12c736cb34", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "897dd98968adbcb6ac19ca12c736cb34");
        }
        if (a(i, i2)) {
            Object a2 = g.e().a(context, i, g.e().a(i));
            if (a2 instanceof b) {
                return (b) a2;
            }
        }
        return null;
    }

    public static f a(int i) {
        String str;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac7ff6b74f4a065ab33f963a492e2f69", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac7ff6b74f4a065ab33f963a492e2f69");
        }
        int i2 = k.a().f;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ceb81466215c1a10c82379f5fc6fe617", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ceb81466215c1a10c82379f5fc6fe617");
        }
        if (a(i, i2)) {
            g e = g.e();
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = g.h;
            if (PatchProxy.isSupport(objArr3, e, changeQuickRedirect3, false, "16e8cd1d42c91ef6a63d27c3fb1140a4", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr3, e, changeQuickRedirect3, false, "16e8cd1d42c91ef6a63d27c3fb1140a4");
            } else {
                int c = e.c(i);
                str = c != -1 ? e.i.get(Integer.valueOf(c)) : null;
            }
            Object a2 = g.e().a(str);
            if (a2 instanceof f) {
                return (f) a2;
            }
            return null;
        }
        return null;
    }

    public static boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d7f2cff09b575b70a76106b0a62f38e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d7f2cff09b575b70a76106b0a62f38e")).booleanValue() : a(i, k.a().f);
    }

    private static boolean a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "804ae964cddb22fee3128af0e39b650d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "804ae964cddb22fee3128af0e39b650d")).booleanValue() : g.e().a(i, i2);
    }

    public static void a(int i, k.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1203e260765c7cc77ea2fde7aef7b643", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1203e260765c7cc77ea2fde7aef7b643");
        } else {
            g.e().a(i, k.a().f, aVar);
        }
    }
}
