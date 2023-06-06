package com.sankuai.mesh.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static HashMap<String, ArrayList<String>> b = new HashMap<>();
    private static HashMap<String, Class<? extends c>> c = new HashMap<>();
    private static HashMap<String, String> d = new HashMap<>();

    public static <T extends c> void a(String str, Class<T> cls) {
        Method[] declaredMethods;
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6930837b0ca2a571af1264331ca9bd46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6930837b0ca2a571af1264331ca9bd46");
            return;
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MeshMethod.class)) {
                ArrayList<String> arrayList = b.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    b.put(str, arrayList);
                }
                c.put(str, cls);
                String value = ((MeshMethod) method.getAnnotation(MeshMethod.class)).value();
                arrayList.add(value);
                d.put(value, method.getName());
            }
        }
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "093b60cea31bfa4e9be560edee6379aa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "093b60cea31bfa4e9be560edee6379aa") : b.toString();
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be93a0758058c343ecd9120dd2c8fca7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be93a0758058c343ecd9120dd2c8fca7")).booleanValue() : b.containsKey(str);
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58c0e7c0fce01364d7a76d72a88434f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58c0e7c0fce01364d7a76d72a88434f4")).booleanValue() : b.get(str).contains(str2);
    }

    public static Class<? extends c> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3208f0a7e0c9a0ab3af0c2e0f60b6320", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3208f0a7e0c9a0ab3af0c2e0f60b6320") : c.get(str);
    }

    public static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7019ca840210ade45f9e0cbe236c17b8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7019ca840210ade45f9e0cbe236c17b8") : d.get(str);
    }
}
