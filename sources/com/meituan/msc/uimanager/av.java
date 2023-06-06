package com.meituan.msc.uimanager;

import android.support.annotation.Nullable;
import com.meituan.msc.jse.bridge.ReactMarker;
import com.meituan.msc.jse.bridge.ReactMarkerConstants;
import com.meituan.msc.uimanager.UIManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class av {
    public static ChangeQuickRedirect a;
    public final Map<String, Object> b;
    private final Map<String, as> c;
    @Nullable
    private final UIManagerModule.a d;
    private final Map<String, Object> e;

    public av(List<as> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "204f8de097e3dc87ba6e36556cb93ddc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "204f8de097e3dc87ba6e36556cb93ddc");
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (as asVar : list) {
            concurrentHashMap.put(asVar.a(), asVar);
        }
        this.c = concurrentHashMap;
        this.d = null;
        this.e = com.meituan.msc.jse.common.a.a();
        this.b = a(list, null, this.e);
    }

    private static Map<String, Object> a(List<as> list, @Nullable Map<String, Object> map, @Nullable Map<String, Object> map2) {
        Object[] objArr = {list, null, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d3f10278e9319928a7fa21672c59d19", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d3f10278e9319928a7fa21672c59d19");
        }
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        com.meituan.msc.systrace.b.a(0L, "CreateUIManagerConstants");
        Boolean bool = Boolean.FALSE;
        try {
            return ap.a(list, null, map2);
        } finally {
            com.meituan.msc.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public final as a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fab55f2568cec00ebcdaf6d80dd2279", RobustBitConfig.DEFAULT_VALUE)) {
            return (as) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fab55f2568cec00ebcdaf6d80dd2279");
        }
        as asVar = this.c.get(str);
        if (asVar != null) {
            return asVar;
        }
        if (this.d != null) {
            as c = c(str);
            if (c != null) {
                return c;
            }
            throw new g("ViewManagerResolver returned null for " + str);
        }
        throw new g("No ViewManager found for class " + str);
    }

    @Nullable
    private as c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e06c926be9bfbecf0d2c5119ea49b79", RobustBitConfig.DEFAULT_VALUE)) {
            return (as) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e06c926be9bfbecf0d2c5119ea49b79");
        }
        as a2 = this.d.a(str);
        if (a2 != null) {
            this.c.put(str, a2);
        }
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.msc.jse.bridge.WritableMap b(@android.support.annotation.Nullable java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.uimanager.av.a
            java.lang.String r11 = "592b6293d889b4316ff1eee22101c80a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            com.meituan.msc.jse.bridge.WritableMap r13 = (com.meituan.msc.jse.bridge.WritableMap) r13
            return r13
        L1e:
            r1 = 0
            if (r13 == 0) goto L52
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.uimanager.av.a
            java.lang.String r11 = "ee09703866413acf9d1f26030535bc3e"
            r5 = 0
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r0
            r3 = r12
            r4 = r10
            r6 = r11
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L3d
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r9, r11)
            com.meituan.msc.uimanager.as r13 = (com.meituan.msc.uimanager.as) r13
            goto L53
        L3d:
            java.util.Map<java.lang.String, com.meituan.msc.uimanager.as> r0 = r12.c
            java.lang.Object r0 = r0.get(r13)
            com.meituan.msc.uimanager.as r0 = (com.meituan.msc.uimanager.as) r0
            if (r0 == 0) goto L49
            r13 = r0
            goto L53
        L49:
            com.meituan.msc.uimanager.UIManagerModule$a r0 = r12.d
            if (r0 == 0) goto L52
            com.meituan.msc.uimanager.as r13 = r12.c(r13)
            goto L53
        L52:
            r13 = r1
        L53:
            if (r13 != 0) goto L56
            return r1
        L56:
            java.lang.String r0 = "UIManagerModule.getConstantsForViewManager"
            r2 = 0
            com.meituan.msc.systrace.b.a(r2, r0)
            r13.a()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.util.Map<java.lang.String, java.lang.Object> r0 = r12.e     // Catch: java.lang.Throwable -> L76
            java.util.Map r13 = com.meituan.msc.uimanager.ap.a(r13, r1, r1, r1, r0)     // Catch: java.lang.Throwable -> L76
            if (r13 == 0) goto L72
            com.meituan.msc.jse.bridge.MSCWritableMap r13 = com.meituan.msc.jse.bridge.Arguments.makeNativeMap(r13)     // Catch: java.lang.Throwable -> L76
            com.meituan.msc.systrace.b.a(r2)
            return r13
        L72:
            com.meituan.msc.systrace.b.a(r2)
            return r1
        L76:
            r13 = move-exception
            com.meituan.msc.systrace.b.a(r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.av.b(java.lang.String):com.meituan.msc.jse.bridge.WritableMap");
    }

    public static List<as> a(List<com.meituan.msc.e> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6676f95383d69435f5cd98f754ed5744", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6676f95383d69435f5cd98f754ed5744");
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (com.meituan.msc.e eVar : list) {
            List<as> a2 = eVar.a();
            for (as asVar : a2) {
                if (hashSet.contains(asVar.a())) {
                    throw new IllegalStateException("ViewManager has already contained for " + asVar.a() + " of " + eVar.getClass().toString());
                }
                hashSet.add(asVar.a());
            }
            arrayList.addAll(a2);
        }
        return arrayList;
    }
}
