package com.meituan.msc.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(Class<?> cls, Object obj, String str, Object obj2) throws Exception {
        Object[] objArr = {cls, obj, str, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35555d8145fc14578bc2bd0dde45f0b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35555d8145fc14578bc2bd0dde45f0b8");
            return;
        }
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }

    public static <T> T a(Object obj, String str) throws Exception {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "844bfc210444081109f92f23f69a24a9", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "844bfc210444081109f92f23f69a24a9") : (T) a(null, obj, str);
    }

    private static <T> T a(Class<?> cls, Object obj, String str) throws Exception {
        Object[] objArr = {null, obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4804be57c937f1fa72de4360300826af", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4804be57c937f1fa72de4360300826af");
        }
        if (obj != null) {
            cls = obj.getClass();
        }
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return (T) declaredField.get(obj);
    }
}
