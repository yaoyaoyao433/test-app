package com.sankuai.waimai.business.page.home.init;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.meituan.retrofit2.exception.c;
import com.sankuai.waimai.business.page.common.config.a;
import com.sankuai.waimai.business.page.common.util.PageSP;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.monitor.b;
import com.sankuai.waimai.monitor.d;
import com.sankuai.waimai.monitor.model.CommonParamsInfo;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.reactnative.WmRNActivity;
import java.io.IOException;
import java.net.ProtocolException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PageInit extends AbsInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "PageInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "916a7718d0127e5c0512ce2a5c31d4a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "916a7718d0127e5c0512ce2a5c31d4a6");
            return;
        }
        initWmPageGlobalConfig();
        Object[] objArr2 = {application};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "b356bcf20de171e9fe781c869d9dad94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "b356bcf20de171e9fe781c869d9dad94");
        } else {
            b.a(application, new d() { // from class: com.sankuai.waimai.business.page.home.init.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.monitor.d
                public final String f() {
                    return "waimai";
                }

                @Override // com.sankuai.waimai.monitor.d
                public final String g() {
                    return "com.sankuai.wmcustomfront.mrn";
                }

                @Override // com.sankuai.waimai.monitor.d
                public final String b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "41e370a164c4ce563d365654902181a1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "41e370a164c4ce563d365654902181a1") : com.sankuai.waimai.platform.b.A().i();
                }

                @Override // com.sankuai.waimai.monitor.d
                public final String c() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "107667d8f6669723270ec21407167788", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "107667d8f6669723270ec21407167788") : String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
                }

                @Override // com.sankuai.waimai.monitor.d
                public final String e() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f77af27f081113719107cf1f3bad9a73", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f77af27f081113719107cf1f3bad9a73") : com.sankuai.waimai.platform.b.A().c();
                }

                @Override // com.sankuai.waimai.monitor.d
                public final String a(Context context) {
                    String str;
                    Object[] objArr3 = {context};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a8c2ebcbb14841ed612787571021b9ec", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a8c2ebcbb14841ed612787571021b9ec");
                    }
                    if (context != null) {
                        String name = context.getClass().getPackage().getName();
                        if (TextUtils.isEmpty(name)) {
                            return "10472";
                        }
                        Object[] objArr4 = {context, name};
                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "0c035ae3d158c3653ffc38e5bf5a6ef0", RobustBitConfig.DEFAULT_VALUE)) {
                            str = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "0c035ae3d158c3653ffc38e5bf5a6ef0");
                        } else {
                            if (!TextUtils.isEmpty(name)) {
                                if (name.contains("page")) {
                                    str = "10324";
                                } else if (name.contains("search")) {
                                    str = "10329";
                                } else if (name.contains("order")) {
                                    str = "10325";
                                } else if (name.contains("restaurant")) {
                                    str = "10330";
                                } else if ((context instanceof WmRNActivity) || name.contains("reactnative")) {
                                    str = "10332";
                                } else if (name.contains("knb")) {
                                    str = "10326";
                                }
                            }
                            str = "10472";
                        }
                        return !TextUtils.isEmpty(str) ? str : "10472";
                    }
                    return "10472";
                }

                /* JADX WARN: Code restructure failed: missing block: B:45:0x004f, code lost:
                    if ("wm".equals("mt") == false) goto L20;
                 */
                @Override // com.sankuai.waimai.monitor.d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.String a() {
                    /*
                        r11 = this;
                        r0 = 0
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.business.page.home.init.a.AnonymousClass1.a
                        java.lang.String r10 = "70499900bc618981fae07a97b97d0d35"
                        r4 = 0
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r8
                        r2 = r11
                        r3 = r9
                        r5 = r10
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L1b
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                        java.lang.String r0 = (java.lang.String) r0
                        return r0
                    L1b:
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.business.page.home.init.a.a
                        java.lang.String r10 = "862159924df1bf448db315d716a84e51"
                        r2 = 0
                        r4 = 1
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r8
                        r3 = r9
                        r5 = r10
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        r2 = 1
                        if (r1 == 0) goto L37
                        r0 = 0
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r0, r9, r2, r10)
                        java.lang.String r0 = (java.lang.String) r0
                        return r0
                    L37:
                        java.lang.String r1 = "wm"
                        r3 = -1
                        int r4 = r1.hashCode()
                        r5 = 3212(0xc8c, float:4.501E-42)
                        if (r4 == r5) goto L52
                        r2 = 3495(0xda7, float:4.898E-42)
                        if (r4 == r2) goto L48
                        goto L5c
                    L48:
                        java.lang.String r2 = "mt"
                        boolean r1 = r1.equals(r2)
                        if (r1 == 0) goto L5c
                        goto L5d
                    L52:
                        java.lang.String r0 = "dp"
                        boolean r0 = r1.equals(r0)
                        if (r0 == 0) goto L5c
                        r0 = 1
                        goto L5d
                    L5c:
                        r0 = -1
                    L5d:
                        switch(r0) {
                            case 0: goto L67;
                            case 1: goto L64;
                            default: goto L60;
                        }
                    L60:
                        java.lang.String r0 = "waimai"
                        return r0
                    L64:
                        java.lang.String r0 = "dianping"
                        return r0
                    L67:
                        java.lang.String r0 = "meituan"
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.init.a.AnonymousClass1.a():java.lang.String");
                }

                @Override // com.sankuai.waimai.monitor.d
                public final String d() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d2392200125ec38d8d63441667c321a2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d2392200125ec38d8d63441667c321a2") : OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId();
                }

                @Override // com.sankuai.waimai.monitor.d
                public final ErrorCode a(Throwable th) {
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a23beca53a89085f7c65f2718870ded0", RobustBitConfig.DEFAULT_VALUE)) {
                        return (ErrorCode) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a23beca53a89085f7c65f2718870ded0");
                    }
                    Object[] objArr4 = {th};
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "0353ffae222e8772b6543fcc622ab4a4", RobustBitConfig.DEFAULT_VALUE)) {
                        return (ErrorCode) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "0353ffae222e8772b6543fcc622ab4a4");
                    }
                    ErrorCode errorCode = new ErrorCode(ErrorCode.ERROR_TYPE_B, "-1");
                    if (!NetWorkUtils.isNetworkConnected(com.meituan.android.singleton.b.a)) {
                        errorCode.setTypeAndCode(ErrorCode.ERROR_TYPE_N, "10000");
                    } else if (th instanceof c) {
                        errorCode.setTypeAndCode(ErrorCode.ERROR_TYPE_H, String.valueOf(((c) th).a()));
                    } else {
                        boolean z = th instanceof com.sankuai.waimai.platform.modular.network.error.a;
                        if (z) {
                            com.sankuai.waimai.platform.modular.network.error.a aVar = (com.sankuai.waimai.platform.modular.network.error.a) th;
                            if (aVar.d() instanceof c) {
                                errorCode.setTypeAndCode(ErrorCode.ERROR_TYPE_H, String.valueOf(((c) aVar.d()).a()));
                            }
                        }
                        if (z) {
                            com.sankuai.waimai.platform.modular.network.error.a aVar2 = (com.sankuai.waimai.platform.modular.network.error.a) th;
                            if (aVar2.b() != 0) {
                                errorCode.setTypeAndCode(ErrorCode.ERROR_TYPE_B, String.valueOf(aVar2.b()));
                            }
                        }
                        if ((th instanceof com.sankuai.meituan.retrofit2.exception.b) || ((th != null && (th.getCause() instanceof JsonSyntaxException)) || (th != null && (th.getCause() instanceof JSONException)))) {
                            errorCode.setTypeAndCode(ErrorCode.ERROR_TYPE_B, ErrorCode.ERROR_CODE_JSON_PARSE);
                        } else if ((th instanceof IOException) && (th.getCause() instanceof com.sankuai.waimai.platform.modular.network.error.a)) {
                            errorCode.setTypeAndCode(ErrorCode.ERROR_TYPE_B, String.valueOf(((com.sankuai.waimai.platform.modular.network.error.a) th.getCause()).b()));
                        } else if (th != null && th.getMessage() != null && th.getMessage().matches("^BlockedServerException.*")) {
                            errorCode.setTypeAndCode(ErrorCode.ERROR_TYPE_H, ErrorCode.ERROR_CODE_OKHTTP_EXCEPTION);
                        } else if (th instanceof ProtocolException) {
                            errorCode.setTypeAndCode(ErrorCode.ERROR_TYPE_H, "1000");
                        }
                    }
                    return errorCode;
                }

                @Override // com.sankuai.waimai.monitor.d
                public final CommonParamsInfo b(Context context) {
                    Object[] objArr3 = {context};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "8f58dd2861e7139f0d6a18901aaa1b25", RobustBitConfig.DEFAULT_VALUE) ? (CommonParamsInfo) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "8f58dd2861e7139f0d6a18901aaa1b25") : a.a(context);
                }
            });
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e358f26cfeeb5612179e294418a83e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e358f26cfeeb5612179e294418a83e0");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.preload.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "ee6828aca534f668883f1d7c432e1b85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "ee6828aca534f668883f1d7c432e1b85");
            return;
        }
        Horn.debug(com.meituan.android.singleton.b.a, "wm_location_timeout_alert", com.sankuai.waimai.foundation.core.a.b());
        Horn.register("wm_location_timeout_alert", new HornCallback() { // from class: com.sankuai.waimai.business.page.home.preload.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5fc999423a2e46d17ead6fba1f6e6d22", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5fc999423a2e46d17ead6fba1f6e6d22");
                    return;
                }
                a aVar = new a();
                if (!z || TextUtils.isEmpty(str)) {
                    aVar.b = MetricsAnrManager.ANR_THRESHOLD;
                    aVar.a = false;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str).getJSONObject("wm_location_timeout_alert");
                        aVar.a = jSONObject.optBoolean("wm_location_timeout_alert_switch", false);
                        aVar.b = jSONObject.optLong("wm_location_timeout_alert_threshold", MetricsAnrManager.ANR_THRESHOLD);
                    } catch (Exception e) {
                        com.dianping.judas.util.a.a(e);
                    }
                }
                PageSP.a(aVar);
            }
        });
        Horn.debug(com.meituan.android.singleton.b.a, "wm_prelocation_params", com.sankuai.waimai.foundation.core.a.b());
        Horn.register("wm_prelocation_params", new HornCallback() { // from class: com.sankuai.waimai.business.page.home.preload.b.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "280bf0d147882f69a4492f5061b21101", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "280bf0d147882f69a4492f5061b21101");
                } else if (z) {
                    q.a(com.meituan.android.singleton.b.a, "waimai").a("wm_prelocation_params", str);
                } else {
                    q.a(com.meituan.android.singleton.b.a, "waimai").b("wm_prelocation_params");
                }
            }
        });
    }

    private static void initWmPageGlobalConfig() {
        com.sankuai.waimai.business.page.common.config.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ed1a3369e54ed5ee77f4034824b8e76d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ed1a3369e54ed5ee77f4034824b8e76d");
            return;
        }
        a.InterfaceC0758a interfaceC0758a = new a.InterfaceC0758a() { // from class: com.sankuai.waimai.business.page.home.init.PageInit.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.common.config.a.InterfaceC0758a
            public final long a(Activity activity) {
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d442be23c6d33c1c10c637450e962e97", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d442be23c6d33c1c10c637450e962e97")).longValue() : com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "poi_list_refresh_duration", Long.MAX_VALUE);
            }
        };
        Object[] objArr2 = {interfaceC0758a};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.common.config.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "3f4b3340be065881d052a86516df54d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "3f4b3340be065881d052a86516df54d4");
            return;
        }
        aVar = a.b.a;
        aVar.b = interfaceC0758a;
    }
}
