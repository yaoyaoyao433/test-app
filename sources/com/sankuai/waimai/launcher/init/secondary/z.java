package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import com.meituan.android.common.statistics.dispatcher.EventManager;
import com.meituan.android.common.statistics.dispatcher.FilterConfig;
import com.meituan.android.common.statistics.dispatcher.IEventCallback;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.mach.AdMPModule;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.pouch.b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class z extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "WMADInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Map<String, String> hashMap;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26459a1e21e558e84381bcef10552aa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26459a1e21e558e84381bcef10552aa5");
            return;
        }
        Object[] objArr2 = {application};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ad.d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "29fac0dcfb836279e53f5d2e24dbcd9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "29fac0dcfb836279e53f5d2e24dbcd9b");
            return;
        }
        com.sankuai.waimai.ad.gray.b.a(application);
        com.sankuai.waimai.ad.mads.a.a(application);
        b.a aVar = new b.a();
        aVar.b = !com.sankuai.waimai.foundation.core.a.c();
        aVar.d = DeviceUtil.getDeviceLevel(application).getValue();
        Object[] objArr3 = {application};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.pouch.util.d.a;
        aVar.c = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3609dcb8104a894ffc183697513adc86", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3609dcb8104a894ffc183697513adc86")).booleanValue() : com.sankuai.waimai.pouch.util.d.a(application, "waimai_takeout", "show_pouch_label", false);
        Object[] objArr4 = {application};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.pouch.util.d.a;
        aVar.e = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "c86b03038405cf34274798c4ad660b6a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "c86b03038405cf34274798c4ad660b6a")).booleanValue() : com.sankuai.waimai.pouch.util.d.a(application, "waimai_takeout", "pouch_force_pre_render_fail", false);
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = b.a.a;
        com.sankuai.waimai.pouch.b bVar = PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "c52f9b61567a6f9903b3c1fffd7907b3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.pouch.b) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "c52f9b61567a6f9903b3c1fffd7907b3") : new com.sankuai.waimai.pouch.b(aVar);
        int d = com.sankuai.waimai.config.a.a().d();
        String c = com.sankuai.waimai.platform.b.A().c();
        String i = com.sankuai.waimai.platform.b.A().i();
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.ad.d.a;
        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "47ff8fd768cbf9477b1414e62c8bfe59", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "47ff8fd768cbf9477b1414e62c8bfe59");
        } else {
            hashMap = new HashMap<>();
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.sankuai.waimai.platform.b.A().i());
            hashMap.put("platform", "android");
        }
        Object[] objArr7 = {application, bVar, Integer.valueOf(d), c, i, hashMap};
        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.pouch.c.a;
        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "41031f6e40f067dd7b7f15e5610d05c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "41031f6e40f067dd7b7f15e5610d05c4");
        } else {
            com.sankuai.waimai.pouch.c.b = bVar;
            com.sankuai.waimai.pouch.monitor.c.b = d;
            com.sankuai.waimai.pouch.monitor.c.c = c;
            com.sankuai.waimai.pouch.monitor.c.d = i;
            if (hashMap != null) {
                com.sankuai.waimai.pouch.monitor.c.e = hashMap;
            }
        }
        com.sankuai.waimai.landing.b.b();
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.ad.report.a.a;
        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "56e9f7f7155d7bc2d5b38a64012b403c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "56e9f7f7155d7bc2d5b38a64012b403c");
        } else if (!com.sankuai.waimai.foundation.core.a.c()) {
            EventManager.getInstance().subscribeData(new FilterConfig(null, new HashSet(Arrays.asList(QuickReportConstants.PV_CONFIG, "MV", "MC")), null, null, null, null, null), new IEventCallback() { // from class: com.sankuai.waimai.ad.report.a.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:61:0x0089 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:62:0x008a  */
                @Override // com.meituan.android.common.statistics.dispatcher.IEventCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onEvent(org.json.JSONObject r19) {
                    /*
                        r18 = this;
                        r0 = r19
                        r1 = 1
                        java.lang.Object[] r9 = new java.lang.Object[r1]
                        r10 = 0
                        r9[r10] = r0
                        com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.ad.report.a.AnonymousClass1.a
                        java.lang.String r12 = "f9183ed67bf6b0425669ddd7576101af"
                        r5 = 0
                        r7 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r2 = r9
                        r3 = r18
                        r4 = r11
                        r6 = r12
                        boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
                        if (r2 == 0) goto L20
                        r2 = r18
                        com.meituan.robust.PatchProxy.accessDispatch(r9, r2, r11, r10, r12)
                        return
                    L20:
                        r2 = r18
                        if (r0 == 0) goto Lda
                        java.lang.String r3 = "evs"
                        org.json.JSONObject r0 = r0.optJSONObject(r3)
                        if (r0 == 0) goto Lda
                        java.lang.String r3 = "nm"
                        java.lang.String r3 = r0.optString(r3)
                        java.lang.String r4 = "val_cid"
                        java.lang.String r4 = r0.optString(r4)
                        java.lang.String r5 = "val_bid"
                        java.lang.String r5 = r0.optString(r5)
                        java.lang.String r6 = "val_lab"
                        org.json.JSONObject r0 = r0.optJSONObject(r6)
                        r6 = 0
                        if (r0 == 0) goto L5d
                        com.google.gson.Gson r7 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L5d
                        r7.<init>()     // Catch: java.lang.Exception -> L5d
                        java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L5d
                        java.lang.Class<java.util.HashMap> r8 = java.util.HashMap.class
                        java.lang.Object r0 = r7.fromJson(r0, r8)     // Catch: java.lang.Exception -> L5d
                        java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> L5d
                        goto L5e
                    L5d:
                        r0 = r6
                    L5e:
                        java.lang.String r7 = "LxMario"
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                        java.lang.String r9 = "============ callback nm: "
                        r8.<init>(r9)
                        r8.append(r3)
                        java.lang.String r9 = ", cid: "
                        r8.append(r9)
                        r8.append(r4)
                        java.lang.String r9 = ", bid: "
                        r8.append(r9)
                        r8.append(r5)
                        java.lang.String r8 = r8.toString()
                        java.lang.Object[] r9 = new java.lang.Object[r10]
                        com.sankuai.waimai.foundation.utils.log.a.b(r7, r8, r9)
                        boolean r7 = android.text.TextUtils.isEmpty(r3)
                        if (r7 == 0) goto L8a
                        return
                    L8a:
                        java.lang.String r7 = "MC"
                        boolean r7 = r3.equals(r7)
                        if (r7 == 0) goto L97
                        com.meituan.android.common.statistics.entity.EventInfo r0 = com.meituan.android.common.statistics.entity.EventInfo.obtainMcEvent(r4, r5, r0)
                        goto Lb2
                    L97:
                        java.lang.String r7 = "MV"
                        boolean r7 = r3.equals(r7)
                        if (r7 == 0) goto La4
                        com.meituan.android.common.statistics.entity.EventInfo r0 = com.meituan.android.common.statistics.entity.EventInfo.obtainMvEvent(r4, r5, r0)
                        goto Lb2
                    La4:
                        java.lang.String r5 = "PV"
                        boolean r3 = r3.equals(r5)
                        if (r3 == 0) goto Lb1
                        com.meituan.android.common.statistics.entity.EventInfo r0 = com.meituan.android.common.statistics.entity.EventInfo.obtainPvEvent(r4, r0)
                        goto Lb2
                    Lb1:
                        r0 = r6
                    Lb2:
                        if (r0 == 0) goto Lda
                        java.lang.Object[] r3 = new java.lang.Object[r1]
                        r3[r10] = r0
                        com.meituan.robust.ChangeQuickRedirect r0 = com.sankuai.waimai.log.judas.JudasManualManager.a
                        java.lang.String r4 = "71825dd14886448d9f4201e8f1619bf9"
                        r12 = 0
                        r14 = 1
                        r16 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r11 = r3
                        r13 = r0
                        r15 = r4
                        boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16)
                        if (r5 == 0) goto Lcd
                        com.meituan.robust.PatchProxy.accessDispatch(r3, r6, r0, r1, r4)
                        return
                    Lcd:
                        boolean r0 = com.sankuai.waimai.foundation.core.a.c()
                        if (r0 != 0) goto Lda
                        java.lang.Class<com.sankuai.waimai.foundation.core.service.ad.c> r0 = com.sankuai.waimai.foundation.core.service.ad.c.class
                        java.lang.String r1 = "IAdMarioReportService"
                        com.sankuai.waimai.router.a.a(r0, r1)
                    Lda:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.ad.report.a.AnonymousClass1.onEvent(org.json.JSONObject):void");
                }
            });
        }
        Object[] objArr9 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.ad.d.a;
        if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "efe42c0748ffe4e9b4a6237626dda583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "efe42c0748ffe4e9b4a6237626dda583");
        } else {
            com.sankuai.waimai.machpro.f.a().a("AdModule", AdMPModule.class);
        }
    }
}
