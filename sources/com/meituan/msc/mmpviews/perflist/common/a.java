package com.meituan.msc.mmpviews.perflist.common;

import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import com.meituan.msc.mmpviews.perflist.node.b;
import com.meituan.msc.mmpviews.perflist.view.PerfListView;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.rlist.c;
import com.meituan.msc.uimanager.rlist.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Pair<NativeViewHierarchyManager, JSONArray> a(PerfListView perfListView, int i, String str) {
        Object[] objArr = {perfListView, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "344277c96cd22cab552d1cec5bc485d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "344277c96cd22cab552d1cec5bc485d9");
        }
        if (perfListView == null || TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i2 = 0; i2 < perfListView.getChildCount(); i2++) {
            ViewGroup viewGroup = (ViewGroup) perfListView.getChildAt(i2);
            if (perfListView.getLayoutManager().getPosition(viewGroup) == i && (viewGroup.getTag(R.id.native_item_tag) instanceof PerfListView.a)) {
                PerfListView.a aVar = (PerfListView.a) viewGroup.getTag(R.id.native_item_tag);
                if (aVar == null || aVar.d == null || aVar.c == null || aVar.c.h() == null) {
                    return null;
                }
                d dVar = (d) aVar.c.h();
                int hashCode = viewGroup.hashCode();
                Object[] objArr2 = {Integer.valueOf(hashCode)};
                ChangeQuickRedirect changeQuickRedirect2 = d.h;
                NativeViewHierarchyManager nativeViewHierarchyManager = PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "e957a748d0cc0ad2e54c5aedccba4f86", RobustBitConfig.DEFAULT_VALUE) ? (NativeViewHierarchyManager) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "e957a748d0cc0ad2e54c5aedccba4f86") : dVar.j.get(Integer.valueOf(hashCode));
                if (nativeViewHierarchyManager instanceof c) {
                    b.a aVar2 = aVar.d;
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<Integer, com.meituan.msc.mmpviews.perflist.node.a> entry : aVar2.e.entrySet()) {
                        com.meituan.msc.mmpviews.perflist.node.a value = entry.getValue();
                        String optString = value.h == null ? null : value.h.optString(CommonConstant.File.CLASS);
                        if (TextUtils.isEmpty(optString)) {
                            optString = value.f == null ? null : value.f.optString(CommonConstant.File.CLASS);
                        }
                        if (str.equals(optString)) {
                            jSONArray.put(value.c);
                        }
                    }
                    return new Pair<>(nativeViewHierarchyManager, jSONArray);
                }
                return null;
            }
        }
        return null;
    }

    public static aa a(com.meituan.msc.uimanager.rlist.b bVar, com.meituan.msc.mmpviews.perflist.node.a aVar, int i) {
        String optString;
        Object[] objArr = {bVar, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e071c0934ce2f9a913198014c742d36e", RobustBitConfig.DEFAULT_VALUE)) {
            return (aa) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e071c0934ce2f9a913198014c742d36e");
        }
        if (bVar == null || aVar == null) {
            return null;
        }
        aa b = bVar.b(i);
        if (b != null) {
            return b;
        }
        Object[] objArr2 = {bVar, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "754f4b7ac41658738e2591a886118649", RobustBitConfig.DEFAULT_VALUE)) {
            return (aa) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "754f4b7ac41658738e2591a886118649");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(aVar.c), new C0449a(aVar, aVar.c, -1, 0));
        a(aVar, hashMap);
        aa a2 = a(bVar, hashMap, i);
        if (a2 == null) {
            return null;
        }
        com.meituan.msc.mmpviews.perflist.node.a aVar2 = ((C0449a) hashMap.get(Integer.valueOf(i))).a;
        if (aVar2.h == null || !aVar2.h.has("id")) {
            optString = aVar2.f == null ? null : aVar2.f.optString("id");
        } else {
            optString = aVar2.h.optString("id");
        }
        aa a3 = TextUtils.isEmpty(optString) ? null : a(a2, optString);
        return a3 == null ? a(a2, hashMap, i) : a3;
    }

    private static aa a(UIImplementation uIImplementation, Map<Integer, C0449a> map, int i) {
        Object[] objArr = {uIImplementation, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "584bfbf4d7ca6d61aab390c9a33fab4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (aa) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "584bfbf4d7ca6d61aab390c9a33fab4f");
        }
        C0449a c0449a = map.get(Integer.valueOf(i));
        if (c0449a == null) {
            return null;
        }
        while (c0449a != null && uIImplementation.b(c0449a.b) == null) {
            c0449a = map.get(Integer.valueOf(c0449a.c));
        }
        if (c0449a == null || uIImplementation.b(c0449a.b) == null) {
            return null;
        }
        return uIImplementation.b(c0449a.a.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.meituan.msc.uimanager.aa a(com.meituan.msc.uimanager.aa r12, java.util.Map<java.lang.Integer, com.meituan.msc.mmpviews.perflist.common.a.C0449a> r13, int r14) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r2 = 2
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.mmpviews.perflist.common.a.a
            java.lang.String r11 = "0bb0bd08e7db6c4791f52cea3c9795b2"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L28
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r10, r9, r11)
            com.meituan.msc.uimanager.aa r12 = (com.meituan.msc.uimanager.aa) r12
            return r12
        L28:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r14 = r13.get(r14)
            com.meituan.msc.mmpviews.perflist.common.a$a r14 = (com.meituan.msc.mmpviews.perflist.common.a.C0449a) r14
            if (r14 != 0) goto L3a
            return r2
        L3a:
            if (r14 == 0) goto L63
            int r1 = r14.b
            int r3 = r12.p()
            if (r1 == r3) goto L63
            android.util.Pair r1 = new android.util.Pair
            com.meituan.msc.mmpviews.perflist.node.a r3 = r14.a
            java.lang.String r3 = r3.e
            int r4 = r14.d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.<init>(r3, r4)
            r0.add(r8, r1)
            int r14 = r14.c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r14 = r13.get(r14)
            com.meituan.msc.mmpviews.perflist.common.a$a r14 = (com.meituan.msc.mmpviews.perflist.common.a.C0449a) r14
            goto L3a
        L63:
            java.util.Iterator r13 = r0.iterator()
        L67:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L9a
            java.lang.Object r14 = r13.next()
            android.util.Pair r14 = (android.util.Pair) r14
            java.lang.Object r0 = r14.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L9b
            int r1 = r12.m()
            if (r0 >= r1) goto L9b
            com.meituan.msc.uimanager.aa r12 = r12.e(r0)
            java.lang.Object r0 = r14.first
            if (r0 == 0) goto L9b
            java.lang.Object r14 = r14.first
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r0 = r12.i()
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L67
            goto L9b
        L9a:
            r2 = r12
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.perflist.common.a.a(com.meituan.msc.uimanager.aa, java.util.Map, int):com.meituan.msc.uimanager.aa");
    }

    private static aa a(aa aaVar, String str) {
        boolean equals;
        Object[] objArr = {aaVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8612acf6ac1c91c66d7bc4eaabce92bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (aa) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8612acf6ac1c91c66d7bc4eaabce92bf");
        }
        Object[] objArr2 = {aaVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c2e3e4cb255eb3d8a57e13653d607fb1", RobustBitConfig.DEFAULT_VALUE)) {
            equals = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c2e3e4cb255eb3d8a57e13653d607fb1")).booleanValue();
        } else {
            equals = (!"MSCImage".equals(aaVar.i()) || TextUtils.isEmpty(aaVar.g())) ? false : aaVar.g().equals(str);
        }
        if (equals) {
            return aaVar;
        }
        if (aaVar.m() > 0) {
            for (int i = 0; i < aaVar.m(); i++) {
                aa a2 = a(aaVar.e(i), str);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    private static void a(com.meituan.msc.mmpviews.perflist.node.a aVar, Map<Integer, C0449a> map) {
        Object[] objArr = {aVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d3b40707f88111e0a29ae2f74e5979f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d3b40707f88111e0a29ae2f74e5979f");
        } else if (aVar.n != null && aVar.n.size() != 0) {
            for (int i = 0; i < aVar.n.size(); i++) {
                com.meituan.msc.mmpviews.perflist.node.a aVar2 = aVar.n.get(i);
                map.put(Integer.valueOf(aVar2.c), new C0449a(aVar2, aVar2.c, aVar.c, i));
                a(aVar2, map);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.mmpviews.perflist.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0449a {
        public com.meituan.msc.mmpviews.perflist.node.a a;
        public int b;
        public int c;
        public int d;

        public C0449a(com.meituan.msc.mmpviews.perflist.node.a aVar, int i, int i2, int i3) {
            this.b = i;
            this.a = aVar;
            this.c = i2;
            this.d = i3;
        }
    }
}
