package com.sankuai.waimai.mach.expose;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.mach.jsv8.b;
import com.sankuai.waimai.mach.utils.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements a {
    public static ChangeQuickRedirect a;
    private Mach b;

    public c(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf1fc60d4d2ae64822710d4d4b9e3839", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf1fc60d4d2ae64822710d4d4b9e3839");
        } else {
            this.b = mach;
        }
    }

    @Override // com.sankuai.waimai.mach.expose.a
    public final void a(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daaff89cffe71151d50a57a7e0f6748d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daaff89cffe71151d50a57a7e0f6748d");
        } else if (aVar != null) {
            List<com.sankuai.waimai.mach.node.a> b = b(aVar);
            if (e.a(b)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar2 : b) {
                c(aVar2);
            }
        }
    }

    @Override // com.sankuai.waimai.mach.expose.a
    public final List<com.sankuai.waimai.mach.node.a> b(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41473dd78cdc741a6682002544df66dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41473dd78cdc741a6682002544df66dd");
        }
        ArrayList arrayList = new ArrayList();
        if (aVar != null) {
            a(aVar, arrayList);
        }
        return arrayList;
    }

    private void a(@NonNull com.sankuai.waimai.mach.node.a aVar, List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c653a7a35c3948c7a3aa61fba84917a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c653a7a35c3948c7a3aa61fba84917a");
            return;
        }
        if (aVar.k() || aVar.l() || aVar.m() || aVar.n()) {
            list.add(aVar);
        }
        if (aVar.j()) {
            for (int i = 0; i < aVar.b().size(); i++) {
                com.sankuai.waimai.mach.node.a aVar2 = aVar.b().get(i);
                if (aVar2 != null) {
                    a(aVar2, list);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.mach.expose.a
    public final void c(@NonNull final com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e9873202261b890a4d82fadcf5a2fbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e9873202261b890a4d82fadcf5a2fbc");
            return;
        }
        final d logReport = this.b.getLogReport();
        if (logReport == null) {
            return;
        }
        final String uuid = UUID.randomUUID().toString();
        if (aVar.k()) {
            logReport.a(uuid, "lx", 2, aVar.o(), aVar);
            a(aVar.o(), "lx", false);
        }
        if (aVar.m()) {
            logReport.a(uuid, "sh", 2, aVar.p(), aVar);
            a(aVar.p(), "sh", false);
        }
        if (logReport instanceof com.sankuai.waimai.mach.widget.a) {
            this.b.bindDataToJS("env", ((com.sankuai.waimai.mach.widget.a) logReport).a());
        }
        com.sankuai.waimai.mach.parser.d q = aVar.q();
        if (q != null) {
            this.b.asyncCallJSMethod(q.b, q.c, new b.InterfaceC1011b() { // from class: com.sankuai.waimai.mach.expose.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.jsv8.b.InterfaceC1011b
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1197b713cf306fe1e1966d3989c20fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1197b713cf306fe1e1966d3989c20fb");
                    } else if (obj instanceof Map) {
                        Map<String, Object> map = (Map) obj;
                        logReport.a(uuid, "lx", 2, map, aVar);
                        c.this.a(map, "lx", true);
                    }
                }
            });
        }
        com.sankuai.waimai.mach.parser.d r = aVar.r();
        if (r != null) {
            this.b.asyncCallJSMethod(r.b, r.c, new b.InterfaceC1011b() { // from class: com.sankuai.waimai.mach.expose.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.jsv8.b.InterfaceC1011b
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "064505cd96489c3955151aa2c3bde7d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "064505cd96489c3955151aa2c3bde7d6");
                    } else if (obj instanceof Map) {
                        Map<String, Object> map = (Map) obj;
                        logReport.a(uuid, "sh", 2, map, aVar);
                        c.this.a(map, "sh", true);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.mach.expose.a
    public final void a(@NonNull final com.sankuai.waimai.mach.node.a aVar, final d dVar) {
        Map<String, Object> o;
        boolean z = true;
        Object[] objArr = {aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a56dc8ed962a07839ea9ca45e13d3f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a56dc8ed962a07839ea9ca45e13d3f7");
        } else if (dVar == null) {
        } else {
            Object obj = aVar.h().get("@full-view-lx-report");
            if (obj instanceof com.sankuai.waimai.mach.parser.d) {
                com.sankuai.waimai.mach.parser.d dVar2 = (com.sankuai.waimai.mach.parser.d) obj;
                if (dVar instanceof com.sankuai.waimai.mach.widget.a) {
                    this.b.bindDataToJS("env", ((com.sankuai.waimai.mach.widget.a) dVar).a());
                }
                this.b.asyncCallJSMethod(dVar2.b, dVar2.c);
                return;
            }
            final String uuid = UUID.randomUUID().toString();
            if (aVar.k() && (o = aVar.o()) != null && !o.isEmpty()) {
                Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(com.sankuai.waimai.mach.utils.b.a().toJson(o));
                if ("b_CxJsX".equals(a2.get("bid"))) {
                    a2.put("bid", "b_waimai_yx_complete_pv_mv");
                } else if ("b_dmQmy".equals(a2.get("bid")) || "b_puc6clsp".equals(a2.get("bid"))) {
                    a2.put("bid", "b_waimai_bj_complete_pv_mv");
                } else {
                    z = false;
                }
                if (z) {
                    dVar.a(uuid, "lx", 2, a2, aVar);
                    a(a2, "lx", false);
                }
            }
            com.sankuai.waimai.mach.parser.d q = aVar.q();
            if (q != null) {
                this.b.asyncCallJSMethod(q.b, q.c, new b.InterfaceC1011b() { // from class: com.sankuai.waimai.mach.expose.c.3
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
                    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
                    @Override // com.sankuai.waimai.mach.jsv8.b.InterfaceC1011b
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a(java.lang.Object r13) {
                        /*
                            r12 = this;
                            r0 = 1
                            java.lang.Object[] r8 = new java.lang.Object[r0]
                            r9 = 0
                            r8[r9] = r13
                            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.expose.c.AnonymousClass3.a
                            java.lang.String r11 = "de5d5354d42a70c23d9b8844bd683a68"
                            r4 = 0
                            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                            r1 = r8
                            r2 = r12
                            r3 = r10
                            r5 = r11
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                            if (r1 == 0) goto L1b
                            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                            return
                        L1b:
                            boolean r1 = r13 instanceof java.util.Map
                            if (r1 == 0) goto L74
                            java.util.Map r13 = (java.util.Map) r13
                            java.lang.String r1 = "b_CxJsX"
                            java.lang.String r2 = "bid"
                            java.lang.Object r2 = r13.get(r2)
                            boolean r1 = r1.equals(r2)
                            if (r1 == 0) goto L38
                            java.lang.String r1 = "bid"
                            java.lang.String r2 = "b_waimai_yx_complete_pv_mv"
                            r13.put(r1, r2)
                        L36:
                            r9 = 1
                            goto L5c
                        L38:
                            java.lang.String r1 = "b_dmQmy"
                            java.lang.String r2 = "bid"
                            java.lang.Object r2 = r13.get(r2)
                            boolean r1 = r1.equals(r2)
                            if (r1 != 0) goto L54
                            java.lang.String r1 = "b_puc6clsp"
                            java.lang.String r2 = "bid"
                            java.lang.Object r2 = r13.get(r2)
                            boolean r1 = r1.equals(r2)
                            if (r1 == 0) goto L5c
                        L54:
                            java.lang.String r1 = "bid"
                            java.lang.String r2 = "b_waimai_bj_complete_pv_mv"
                            r13.put(r1, r2)
                            goto L36
                        L5c:
                            if (r9 == 0) goto L74
                            com.sankuai.waimai.mach.d r2 = r2
                            java.lang.String r3 = r3
                            java.lang.String r4 = "lx"
                            r5 = 2
                            com.sankuai.waimai.mach.node.a r7 = r4
                            r6 = r13
                            r2.a(r3, r4, r5, r6, r7)
                            com.sankuai.waimai.mach.expose.c r1 = com.sankuai.waimai.mach.expose.c.this
                            java.lang.String r2 = "lx"
                            r1.a(r13, r2, r0)
                        L74:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.expose.c.AnonymousClass3.a(java.lang.Object):void");
                    }
                });
            }
        }
    }

    void a(@NonNull Map<String, Object> map, String str, boolean z) {
        Object[] objArr = {map, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a5e4684e61fbe9d783f073e71ec3b77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a5e4684e61fbe9d783f073e71ec3b77");
        } else if (a()) {
            try {
                JSONObject jSONObject = new JSONObject(map);
                String optString = jSONObject.optString("bid");
                StringBuilder sb = new StringBuilder("templateId = ");
                sb.append(this.b.getTemplateId());
                sb.append(",bid=");
                sb.append(optString);
                sb.append(",type=");
                sb.append(str);
                sb.append(",handledByJs=");
                sb.append(z);
                sb.append(",json=");
                sb.append(jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2576a54ad0417438e0dd9d9760b3967", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2576a54ad0417438e0dd9d9760b3967")).booleanValue() : i.a().h();
    }
}
