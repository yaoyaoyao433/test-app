package com.sankuai.eh.component.web.plugins.core;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.eh.component.web.module.h;
import com.sankuai.eh.component.web.plugins.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final Map<String, Class> b = new HashMap();
    private static WeakHashMap<Context, com.sankuai.eh.component.web.module.c> c = new WeakHashMap<>();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r1.equals("01") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.sankuai.eh.component.web.plugins.e r13, com.sankuai.eh.component.web.module.c r14) {
        /*
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            r10 = 1
            r8[r10] = r14
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.eh.component.web.plugins.core.b.a
            java.lang.String r12 = "70f5ee76cc32ff1a43e5511bf82a7cbb"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r13 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r10, r12)
            return
        L1f:
            r13.a(r14)
            boolean r1 = r13.g()
            if (r1 == 0) goto L85
            java.lang.String r1 = r13.a()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case 1536: goto L52;
                case 1537: goto L49;
                case 1567: goto L3f;
                case 1568: goto L35;
                default: goto L34;
            }
        L34:
            goto L5c
        L35:
            java.lang.String r0 = "11"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
            r0 = 0
            goto L5d
        L3f:
            java.lang.String r0 = "10"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
            r0 = 1
            goto L5d
        L49:
            java.lang.String r3 = "01"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5c
            goto L5d
        L52:
            java.lang.String r0 = "00"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
            r0 = 3
            goto L5d
        L5c:
            r0 = -1
        L5d:
            switch(r0) {
                case 0: goto L7f;
                case 1: goto L73;
                case 2: goto L6d;
                case 3: goto L61;
                default: goto L60;
            }
        L60:
            goto L85
        L61:
            com.sankuai.eh.component.web.module.h r0 = r14.f
            if (r0 == 0) goto L85
            com.sankuai.eh.component.web.module.h r14 = r14.f
            java.util.List<com.sankuai.eh.component.web.plugins.e> r14 = r14.g
            r14.add(r13)
            goto L85
        L6d:
            java.util.List<com.sankuai.eh.component.web.plugins.e> r14 = r14.d
            r14.add(r13)
            return
        L73:
            com.sankuai.eh.component.web.module.h r0 = r14.f
            if (r0 == 0) goto L85
            com.sankuai.eh.component.web.module.h r14 = r14.f
            java.util.List<com.sankuai.eh.component.web.plugins.e> r14 = r14.f
            r14.add(r13)
            return
        L7f:
            java.util.List<com.sankuai.eh.component.web.plugins.e> r14 = r14.c
            r14.add(r13)
            return
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.eh.component.web.plugins.core.b.a(com.sankuai.eh.component.web.plugins.e, com.sankuai.eh.component.web.module.c):void");
    }

    public static void a(JsonArray jsonArray, com.sankuai.eh.component.web.module.c cVar) {
        Object[] objArr = {jsonArray, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "234db80da3aab384d8839fed49741090", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "234db80da3aab384d8839fed49741090");
            return;
        }
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            String a2 = com.sankuai.eh.component.service.utils.b.a(it.next(), "name");
            Class cls = b.get(a2);
            if (!TextUtils.isEmpty(a2) && cls != null) {
                try {
                    a((e) cls.newInstance(), cVar);
                } catch (Exception e) {
                    com.sankuai.eh.component.service.tools.d.a(e);
                }
            }
        }
    }

    public static void a(Context context, com.sankuai.eh.component.web.module.c cVar) {
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6afccb24a2265c3c7264e1e7d9f7683", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6afccb24a2265c3c7264e1e7d9f7683");
        } else {
            c.put(context, cVar);
        }
    }

    public static com.sankuai.eh.component.web.module.c a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "815d5951aec203982de39e810a4b7d62", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.eh.component.web.module.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "815d5951aec203982de39e810a4b7d62") : c.get(context);
    }

    public static void a(String str, Class cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd14572d4302d35f291049935c31fe38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd14572d4302d35f291049935c31fe38");
        } else {
            b.put(str, cls);
        }
    }

    public static void a(com.sankuai.eh.component.web.plugins.api.a aVar, com.sankuai.eh.component.web.module.c cVar) {
        Object[] objArr = {aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15c1b384da83a9b28a27579a596bab6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15c1b384da83a9b28a27579a596bab6c");
        } else if (cVar == null) {
        } else {
            a(cVar.c, aVar);
            a(cVar.d, aVar);
            if (cVar.f != null) {
                a(cVar.f.f, aVar);
                a(cVar.f.g, aVar);
            }
            if (!"onKNBJSCall".equals(aVar.a()) || cVar.b == null) {
                return;
            }
            a(cVar.b.c, aVar);
            a(cVar.b.d, aVar);
            if (cVar.b.f != null) {
                a(cVar.b.f.f, aVar);
                a(cVar.b.f.g, aVar);
            }
        }
    }

    private static void a(List<e> list, com.sankuai.eh.component.web.plugins.api.a aVar) {
        Object[] objArr = {list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b814451247477cbc240ee6d6e3d53296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b814451247477cbc240ee6d6e3d53296");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            e eVar = list.get(i);
            if (f.a(eVar.c(), aVar.a())) {
                try {
                    eVar.a(aVar);
                } catch (Exception e) {
                    com.sankuai.eh.component.service.tools.d.a(e);
                }
            }
        }
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8455f167da7815b4c4a926650f2fc118", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8455f167da7815b4c4a926650f2fc118");
        } else if (context != null) {
            c.remove(context);
        }
    }

    public static void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e336211a267beed1e1a1a3d6292709e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e336211a267beed1e1a1a3d6292709e1");
        } else if (hVar != null) {
            a(hVar.f);
            a(hVar.g);
            hVar.f.clear();
            hVar.g.clear();
        }
    }

    private static void a(List<e> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0590e65e587f7a212347cf0588d6ca12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0590e65e587f7a212347cf0588d6ca12");
            return;
        }
        for (int i = 0; list != null && i < list.size(); i++) {
            list.get(i).f();
        }
    }
}
