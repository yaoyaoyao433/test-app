package com.sankuai.eh.component.web.plugins;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.meituan.android.pike.bean.proto.ProtoConstant;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.database.b;
import com.sankuai.eh.component.service.database.d;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.takeoutnew.util.aop.h;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c extends b {
    public static ChangeQuickRedirect a = null;
    public static String b = "dynamicUpdate";

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement Y_() {
        return null;
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "11";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return b;
    }

    @Override // com.sankuai.eh.component.web.plugins.b, com.sankuai.eh.component.web.plugins.e
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b627a7b2a6689ecc8340b2663758eddf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b627a7b2a6689ecc8340b2663758eddf")).booleanValue();
        }
        if (d() != null) {
            return com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(d(), "enabled"), true).booleanValue();
        }
        return false;
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc0499e1ef31675a16433dd879c05618", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc0499e1ef31675a16433dd879c05618") : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.database.d.c(), "global", b);
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f804bde91fc823478fd3b9c59b08fef3", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f804bde91fc823478fd3b9c59b08fef3") : new String[]{"onComponentClose"};
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        boolean z = true;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8066227ac9680f3c4f52a52b40558345", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8066227ac9680f3c4f52a52b40558345");
        } else if (g()) {
            String a2 = aVar.a();
            char c = 65535;
            if (a2.hashCode() == 2129465018 && a2.equals("onComponentClose")) {
                c = 0;
            }
            if (c != 0) {
                return;
            }
            final com.sankuai.eh.plugins.dynamic.a aVar2 = new com.sankuai.eh.plugins.dynamic.a(d(), new a());
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.plugins.dynamic.a.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "c72e22b8f355160fede07a432c7f72c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "c72e22b8f355160fede07a432c7f72c4");
                return;
            }
            com.sankuai.eh.component.service.tools.d.b("------准备动态更新");
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.eh.plugins.dynamic.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "7c25d547dade75bc82dcd67396e9b24f", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "7c25d547dade75bc82dcd67396e9b24f")).booleanValue();
            } else if (System.currentTimeMillis() - com.sankuai.eh.plugins.dynamic.a.b <= com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(aVar2.c, "interval"), 10000)) {
                z = false;
            }
            if (!z) {
                com.sankuai.eh.component.service.tools.d.b("------未超出最小间隔");
                return;
            }
            com.sankuai.eh.plugins.dynamic.a.b = System.currentTimeMillis();
            String a3 = com.sankuai.eh.component.service.utils.b.a(aVar2.c, "detection");
            final MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("ehc_dynamic");
            com.sankuai.eh.component.service.network.a.a(false).callDynamic(a3, aVar2.a()).a(new b.a() { // from class: com.sankuai.eh.plugins.dynamic.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.eh.component.service.database.b.a
                public final void a(String str) {
                    Object[] objArr4 = {str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cc2b76240fcfb4fb069142049ab7480c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cc2b76240fcfb4fb069142049ab7480c");
                        return;
                    }
                    createCustomSpeedMeterTask.recordStep("ehc_dynamic_detection");
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JsonElement a4 = com.sankuai.eh.component.service.utils.b.a(str);
                    final String a5 = com.sankuai.eh.component.service.utils.b.a(a4, "tag");
                    String b2 = d.b("last_commit");
                    if (!TextUtils.isEmpty(a5) && !a5.equals(b2)) {
                        com.sankuai.eh.component.service.tools.d.b("检测到动态更新: last-" + b2 + ", new-" + a5);
                        if (aVar2.d != null) {
                            aVar2.d.a(null);
                        }
                        a.a(aVar2, com.sankuai.eh.component.service.utils.b.a(aVar2.c, "get"), new b.a() { // from class: com.sankuai.eh.plugins.dynamic.a.1.1
                            public static ChangeQuickRedirect a;

                            {
                                AnonymousClass1.this = this;
                            }

                            @Override // com.sankuai.eh.component.service.database.b.a
                            public final void a(String str2) {
                                Object[] objArr5 = {str2};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8c4cabb158b12bdae02b859593c0762b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8c4cabb158b12bdae02b859593c0762b");
                                    return;
                                }
                                createCustomSpeedMeterTask.recordStep("ehc_dynamic_get");
                                h.a(createCustomSpeedMeterTask);
                                if (TextUtils.isEmpty(str2)) {
                                    return;
                                }
                                d.c(str2, "horn");
                                d.d("last_commit", a5);
                                if (aVar2.d != null) {
                                    aVar2.d.b(null);
                                }
                            }

                            @Override // com.sankuai.eh.component.service.database.b.a, com.sankuai.meituan.retrofit2.f
                            public final void onFailure(Call<ap> call, Throwable th) {
                                Object[] objArr5 = {call, th};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6d10f8ed6a87afbadea8691d09d3d551", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6d10f8ed6a87afbadea8691d09d3d551");
                                    return;
                                }
                                super.onFailure(call, th);
                                if (aVar2.d != null) {
                                    aVar2.d.c(null);
                                }
                            }
                        });
                    } else {
                        h.a(createCustomSpeedMeterTask);
                        com.sankuai.eh.component.service.tools.d.b("------无需动态更新");
                    }
                    JsonElement a6 = com.sankuai.eh.component.service.utils.b.a(a4, ProtoConstant.COMMAND, "downgrade");
                    if (a6 != null && com.sankuai.eh.component.service.utils.b.a(a6, false).booleanValue()) {
                        com.sankuai.eh.component.service.tools.d.b("检测到动态配置降级");
                        com.sankuai.eh.component.service.a.e = -2;
                    } else if (com.sankuai.eh.component.service.a.e != -2 || com.sankuai.eh.component.service.utils.b.a(a6, false).booleanValue()) {
                    } else {
                        com.sankuai.eh.component.service.tools.d.b("动态配置降级恢复");
                        com.sankuai.eh.component.service.a.e = 1;
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements com.sankuai.eh.plugins.a {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.sankuai.eh.plugins.a
        public final void a(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e94d38618fd00e45f7c54cbae6640f3a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e94d38618fd00e45f7c54cbae6640f3a");
            } else {
                c.this.h();
            }
        }

        @Override // com.sankuai.eh.plugins.a
        public final void b(Object obj) {
            Object[] objArr = {null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df83dd8960c022d3faec2fe81e01a885", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df83dd8960c022d3faec2fe81e01a885");
            } else {
                c.this.a(true);
            }
        }

        @Override // com.sankuai.eh.plugins.a
        public final void c(Object obj) {
            Object[] objArr = {null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0a68df00b950f76dfb50b21c1d9480", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0a68df00b950f76dfb50b21c1d9480");
            } else {
                c.this.a(false);
            }
        }
    }
}
