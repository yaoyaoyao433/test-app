package com.sankuai.titans.protocol.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WeakQuoteUtils {
    private static final WeakHashMap<Object, Object> caches = new WeakHashMap<>();
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void clearCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62ca9951dbbf7cb7cf24439b86b199fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62ca9951dbbf7cb7cf24439b86b199fd");
        } else {
            caches.clear();
        }
    }

    public static <T, F> T from(F f, Class<T> cls, IGet<T> iGet) {
        Object[] objArr = {f, cls, iGet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9443cc6a4849765c0275aab482dacf02", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9443cc6a4849765c0275aab482dacf02");
        }
        if (f == null || cls == null) {
            return null;
        }
        T t = (T) fromCache(f, cls);
        if (t != null) {
            return t;
        }
        if (iGet == null) {
            return null;
        }
        T t2 = iGet.get();
        cache(f, t2);
        return t2;
    }

    public static <T, F> T from(F f, Class<T> cls, Object... objArr) {
        Object[] objArr2 = {f, cls, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e79711496c0c83efde41eacc2eee2d22", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e79711496c0c83efde41eacc2eee2d22");
        }
        if (f == null || cls == null) {
            return null;
        }
        T t = (T) fromCache(f, cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) ReflectUtils.createInstance(cls.getClassLoader(), cls.getName(), objArr);
        if (t2 != null) {
            cache(f, t2);
        }
        return t2;
    }

    private static <T> T fromCache(Object obj, Class<T> cls) {
        Object[] objArr = {obj, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "66537bcefb26d8d36c6bd0205078b344", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "66537bcefb26d8d36c6bd0205078b344");
        }
        if (obj == null || cls == null) {
            return null;
        }
        try {
            synchronized (caches) {
                if (caches.containsKey(obj)) {
                    T t = (T) caches.get(obj);
                    if (t == null) {
                        return null;
                    }
                    return t;
                }
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void cache(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0639e139943ecbc656c52811c0dd2b56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0639e139943ecbc656c52811c0dd2b56");
        } else if (obj == null || obj2 == null) {
        } else {
            synchronized (caches) {
                caches.put(obj, obj2);
            }
        }
    }
}
