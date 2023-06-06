package com.sankuai.waimai.ai.persona.poi;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.persona.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.alita.persona.a {
    public static ChangeQuickRedirect a;
    public String[] b;
    String c;
    String d;
    String e;
    String f;
    private e i;
    private boolean j;
    private List<JSONObject> k;

    @Override // com.sankuai.waimai.alita.persona.a
    public final String a() {
        return "persona_dynamic_poi_list";
    }

    @Override // com.sankuai.waimai.alita.persona.a
    @NonNull
    public final String b() {
        return "waimai";
    }

    @Override // com.sankuai.waimai.alita.persona.a
    @NonNull
    public final String c() {
        return "persona_dynamic_poi_list";
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f012868acc97242771d2998ce6953bb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f012868acc97242771d2998ce6953bb6");
            return;
        }
        this.b = new String[]{"k1", "k2", "k3", "k4", "k5", "k6", "richness_degree_threshold", "stay_time_threshold"};
        this.j = false;
    }

    @Override // com.sankuai.waimai.alita.persona.a
    public final void a(@Nullable e eVar) {
        this.i = eVar;
    }

    private List<JSONObject> a(Map<String, String> map) {
        JSONObject jSONObject;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "755200f682be71560427838cdf79d060", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "755200f682be71560427838cdf79d060");
        }
        try {
            jSONObject = new JSONObject();
            for (int i = 0; i < this.b.length; i++) {
                try {
                    if (map.get(this.b[i]) != null) {
                        jSONObject.put(this.b[i], map.get(this.b[i]));
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(jSONObject);
            return arrayList;
        }
        return null;
    }

    @Override // com.sankuai.waimai.alita.persona.a
    public final synchronized void d() {
    }

    @Override // com.sankuai.waimai.alita.persona.a
    public final synchronized void e() {
    }

    @Override // com.sankuai.waimai.alita.persona.a
    public final synchronized void f() {
    }

    @Override // com.sankuai.waimai.alita.persona.a
    public final synchronized void g() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
        if (android.text.TextUtils.isEmpty(r12.c) == false) goto L9;
     */
    @Override // com.sankuai.waimai.alita.persona.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(final com.sankuai.waimai.alita.persona.e r13) {
        /*
            r12 = this;
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.ai.persona.poi.a.a
            java.lang.String r11 = "4bc36cb91fc5178539b71ffae2ebc3cc"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r8
            r1 = r12
            r2 = r10
            r4 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            java.lang.String r0 = "WMAlitaPoiDynamicPs"
            java.lang.String r1 = "update perona produce"
            java.lang.Object[] r2 = new java.lang.Object[r9]
            com.sankuai.waimai.foundation.utils.log.a.d(r0, r1, r2)
            java.lang.Object[] r8 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.ai.persona.poi.a.a
            java.lang.String r11 = "8ba242ae14fbf844dead25bf54bd32f3"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r8
            r1 = r12
            r2 = r10
            r4 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            r1 = 0
            if (r0 == 0) goto L44
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            goto L7f
        L44:
            android.content.Context r0 = com.meituan.android.singleton.b.a
            com.sankuai.waimai.platform.capacity.abtest.ABTestManager r0 = com.sankuai.waimai.platform.capacity.abtest.ABTestManager.getInstance(r0)
            java.lang.String r2 = "poilist_dynamicPaging_exp"
            com.sankuai.waimai.foundation.core.service.abtest.ABStrategy r0 = r0.getStrategy(r2, r1)
            if (r0 == 0) goto L7e
            java.lang.String r2 = r0.expName
            r12.f = r2
            java.lang.String r2 = r0.groupName
            r12.e = r2
            java.lang.String r2 = r0.sceneName
            r12.d = r2
            java.util.Map r0 = r0.getParams()
            if (r0 == 0) goto L7e
            java.lang.String r2 = "bundleID"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r12.c = r2
            java.util.List r0 = r12.a(r0)
            r12.k = r0
            java.lang.String r0 = r12.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7e
            goto L7f
        L7e:
            r7 = 0
        L7f:
            if (r7 != 0) goto L91
            java.lang.String r0 = "WMAlitaPoiDynamicPs"
            java.lang.String r1 = "配置数据缺失，回调错误"
            java.lang.Object[] r2 = new java.lang.Object[r9]
            com.sankuai.waimai.foundation.utils.log.a.e(r0, r1, r2)
            if (r13 == 0) goto L90
            r13.a()
        L90:
            return
        L91:
            com.sankuai.waimai.ai.uat.feature.b r0 = com.sankuai.waimai.ai.uat.feature.b.b()
            com.sankuai.waimai.ai.uat.context.restaurant.WMUATRestaurantContext r0 = r0.b
            if (r0 != 0) goto L9f
            if (r13 == 0) goto L9e
            r13.a(r1)
        L9e:
            return
        L9f:
            com.sankuai.waimai.alita.d r0 = com.sankuai.waimai.alita.d.a()
            java.lang.String r1 = r12.c
            java.util.List<org.json.JSONObject> r2 = r12.k
            com.sankuai.waimai.ai.persona.poi.a$1 r3 = new com.sankuai.waimai.ai.persona.poi.a$1
            r3.<init>()
            r0.a(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.ai.persona.poi.a.b(com.sankuai.waimai.alita.persona.e):void");
    }
}
