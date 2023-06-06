package com.sankuai.waimai.router.utils;

import android.support.annotation.NonNull;
import android.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final LruCache<String, Class> b = new LruCache<>(100);
    private static final Class c = a.class;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
    }

    @NonNull
    private static Class a(@NonNull String str) {
        Class cls;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48767ff7f544ff48eeb19d469b3e04eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48767ff7f544ff48eeb19d469b3e04eb");
        }
        Class cls2 = b.get(str);
        if (cls2 != null) {
            return cls2;
        }
        synchronized (b) {
            cls = b.get(str);
            if (cls == null) {
                cls = b(str);
                b.put(str, cls);
            }
        }
        return cls;
    }

    @NonNull
    private static Class b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "024c70a3402b1cfd09bf12915b3c5fc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "024c70a3402b1cfd09bf12915b3c5fc5");
        }
        try {
            com.sankuai.waimai.router.core.d.a("[ClassPool] >>> get class with reflection: %s", str);
            Class<?> cls = Class.forName(str);
            if (cls != null) {
                return cls;
            }
            com.sankuai.waimai.router.core.d.d("[ClassPool] 没找到Class '%s'", str);
            return c;
        } catch (ClassNotFoundException e) {
            com.sankuai.waimai.router.core.d.b(e);
            return c;
        }
    }

    public static <T extends Class> T a(com.sankuai.waimai.router.service.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc64f69e1f4f674ab0e6fb6d655a7d2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc64f69e1f4f674ab0e6fb6d655a7d2f");
        }
        if (dVar == null) {
            return null;
        }
        T t = (T) dVar.d;
        if (t != null) {
            return t;
        }
        String str = dVar.c;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0073f5bb62f8bb52b9475ef32bbc2ac5", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0073f5bb62f8bb52b9475ef32bbc2ac5");
        }
        if (str == null) {
            return null;
        }
        T t2 = (T) a(str);
        if (t2 == c) {
            com.sankuai.waimai.router.core.d.c("[ClassPool] get class failed: %s", str);
            return null;
        }
        com.sankuai.waimai.router.core.d.a("[ClassPool] get class success: %s", str);
        return t2;
    }
}
