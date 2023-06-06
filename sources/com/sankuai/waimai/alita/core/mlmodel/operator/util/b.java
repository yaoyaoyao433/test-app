package com.sankuai.waimai.alita.core.mlmodel.operator.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(@Nullable Object obj, @Nullable Class cls, @Nullable List<Object> list, int i, @Nullable Class cls2) {
        Object[] objArr = {obj, cls, list, Integer.valueOf(i), cls2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "394594c524b5c9cde7f4591ca3c5f9ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "394594c524b5c9cde7f4591ca3c5f9ba")).booleanValue();
        }
        HashSet hashSet = new HashSet();
        hashSet.add(cls);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(cls2);
        return a(obj, hashSet, list, i, hashSet2);
    }

    public static boolean a(@Nullable Object obj, @Nullable Class cls, @Nullable List<Object> list, int i, @NonNull Set<Class> set) {
        Object[] objArr = {obj, cls, list, 1, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fa13d94adf3dfbb549eac258e96e497", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fa13d94adf3dfbb549eac258e96e497")).booleanValue();
        }
        HashSet hashSet = new HashSet();
        hashSet.add(cls);
        return a(obj, hashSet, list, 1, set);
    }

    public static boolean a(@Nullable Object obj, @NonNull Set<Class> set, @Nullable List<Object> list, int i, @NonNull Set<Class> set2) {
        boolean z;
        Object[] objArr = {obj, set, list, Integer.valueOf(i), set2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "931a6488a2a920c9719ee576aff93e41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "931a6488a2a920c9719ee576aff93e41")).booleanValue();
        }
        boolean a2 = a(obj, set);
        if (list != null) {
            if (i < 0) {
                z = list.isEmpty() ? true : a(list, List.class, set2);
            } else if (list.size() == i) {
                z = a(list, List.class, set2);
            }
            return a2 && z;
        }
        z = false;
        if (a2) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(@android.support.annotation.Nullable java.lang.Object r12, @android.support.annotation.Nullable java.lang.Class r13, @android.support.annotation.Nullable java.lang.Class r14, @android.support.annotation.Nullable java.lang.Class r15) {
        /*
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            r1 = 2
            r0[r1] = r14
            r1 = 3
            r0[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a
            java.lang.String r11 = "830113b4b559e9fc42ad478740ff21c5"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2c
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r9, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L2c:
            boolean r13 = a(r12, r13)
            if (r13 == 0) goto L58
            if (r12 == 0) goto L58
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            java.util.Iterator r13 = r12.keys()
        L3a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r12.opt(r0)
            boolean r0 = a(r0, r14)
            if (r0 == 0) goto L58
            boolean r0 = a(r1, r15)
            if (r0 != 0) goto L3a
            goto L58
        L57:
            r8 = 1
        L58:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(java.lang.Object, java.lang.Class, java.lang.Class, java.lang.Class):boolean");
    }

    public static boolean a(@Nullable Object obj, @Nullable Class cls, @Nullable Class cls2) {
        Object[] objArr = {obj, cls, cls2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aec647991b6c194658418792c304d94f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aec647991b6c194658418792c304d94f")).booleanValue();
        }
        if (a(obj, cls)) {
            for (Object obj2 : (List) obj) {
                if (!a(obj2, cls2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean a(@Nullable Object obj, @Nullable Class cls, @NonNull Set<Class> set) {
        Object[] objArr = {obj, cls, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e84c61df0310500f3fe1833e92881820", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e84c61df0310500f3fe1833e92881820")).booleanValue();
        }
        if (!a(obj, cls) || obj == null) {
            return false;
        }
        List list = (List) obj;
        for (int i = 0; i < list.size(); i++) {
            if (!a(list.get(i), set)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(@Nullable Object obj, @NonNull Set<Class> set) {
        Object[] objArr = {obj, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af1a46dde08bba63536d98df9edb114c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af1a46dde08bba63536d98df9edb114c")).booleanValue();
        }
        for (Class cls : set) {
            if (a(obj, cls)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(@Nullable Object obj, @Nullable Class cls) {
        Object[] objArr = {obj, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcf2ad59a8393b931b184d280a7652db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcf2ad59a8393b931b184d280a7652db")).booleanValue();
        }
        if (obj == null || cls == null) {
            return obj == null && cls == null;
        }
        return cls.isInstance(obj);
    }
}
