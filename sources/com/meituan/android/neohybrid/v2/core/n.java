package com.meituan.android.neohybrid.v2.core;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.LinearLayout;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.ai;
import com.meituan.android.neohybrid.Neo;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.android.neohybrid.neo.tunnel.TunnelParamJSHandler;
import com.meituan.android.neohybrid.storage.MemoryStorage;
import com.meituan.android.neohybrid.v2.core.a;
import com.meituan.android.neohybrid.v2.neo.bridge.NeoBridge;
import com.meituan.android.neohybrid.v2.neo.bridge.NeoBridgeV2;
import com.meituan.android.neohybrid.v2.neo.bridge.NeoSessionStorageBridge;
import com.meituan.android.neohybrid.v2.neo.notification.a;
import com.meituan.android.neohybrid.v2.neo.nsf.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class n implements a.InterfaceC0315a, c.b {
    public static ChangeQuickRedirect a;
    protected a b;
    protected NeoConfig c;
    public com.meituan.android.neohybrid.framework.webcompat.b d;
    public Context e;
    public LinearLayout f;
    public View g;
    String h;
    com.meituan.android.neohybrid.base.a i;
    com.meituan.android.cipstorage.q j;
    volatile String k;
    com.meituan.android.neohybrid.v2.neo.adapter.a l;
    Map<String, com.meituan.android.neohybrid.v2.neo.bridge.handler.b> m;
    private StringBuilder n;
    private boolean o;
    private boolean p;
    private volatile String q;
    private String r;

    public n(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a90c8c2ae2658fedabe9ebddd240c6fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a90c8c2ae2658fedabe9ebddd240c6fd");
            return;
        }
        this.m = new HashMap();
        this.b = aVar;
        this.i = com.meituan.android.neohybrid.base.a.a(aVar);
        this.j = com.meituan.android.cipstorage.q.a(com.meituan.android.neohybrid.init.a.d(), "neo_storage_channel");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.v2.core.n.a(android.content.Context, android.os.Bundle):void");
    }

    public View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82777d48e8365f1910885fead68d67e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82777d48e8365f1910885fead68d67e2");
        }
        this.d.a(this.b);
        this.g = this.d.a(layoutInflater, (ViewGroup) null);
        this.f.addView(this.g, new LinearLayout.LayoutParams(-1, -1));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5033c24f7db8306e4d51a2e136e08eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5033c24f7db8306e4d51a2e136e08eb");
        } else if (j() != null) {
            com.meituan.android.neohybrid.protocol.kernel.d c = j().c();
            this.l = new com.meituan.android.neohybrid.v2.neo.adapter.a(this.b);
            c.a(this.l);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "238f25a2c41ae62fa1fabfac93d2014f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "238f25a2c41ae62fa1fabfac93d2014f");
        } else {
            j().c().a(new com.meituan.android.neohybrid.framework.webcompat.a() { // from class: com.meituan.android.neohybrid.v2.core.n.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.neohybrid.framework.webcompat.a, com.meituan.android.neohybrid.protocol.kernel.d
                public final void a(com.meituan.android.neohybrid.protocol.kernel.c cVar, String str, Bitmap bitmap) {
                    Object[] objArr4 = {cVar, str, bitmap};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a6a15a712814231a4c3b7fb544d27cbf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a6a15a712814231a4c3b7fb544d27cbf");
                        return;
                    }
                    com.meituan.android.neohybrid.v2.neo.report.a.a(n.this.b, com.meituan.android.neohybrid.neo.report.a.c("hybrid_current_url", str).b);
                    if (n.this.i.a("b_pay_hybrid_init_container_succ_mv")) {
                        com.meituan.android.neohybrid.v2.neo.report.a.a(n.this.b, "hybrid_init_container_succ");
                        com.meituan.android.neohybrid.v2.neo.report.a.a(n.this.b, "b_pay_hybrid_init_container_succ_mv", "c_pay_7c9fc4b4", null, null);
                    }
                }

                @Override // com.meituan.android.neohybrid.framework.webcompat.a, com.meituan.android.neohybrid.protocol.kernel.d
                public final void b(com.meituan.android.neohybrid.protocol.kernel.c cVar, String str) {
                    Object[] objArr4 = {cVar, str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "898f498490965f38f88e4aabd29d8b39", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "898f498490965f38f88e4aabd29d8b39");
                    } else {
                        super.b(cVar, str);
                    }
                }

                @Override // com.meituan.android.neohybrid.framework.webcompat.a, com.meituan.android.neohybrid.protocol.kernel.d
                public final void a(com.meituan.android.neohybrid.protocol.kernel.c cVar, int i, String str, String str2) {
                    Object[] objArr4 = {cVar, Integer.valueOf(i), str, str2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2d97f9b533d8227e9520844a384e53f4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2d97f9b533d8227e9520844a384e53f4");
                        return;
                    }
                    com.meituan.android.neohybrid.v2.neo.report.a.a(n.this.b, "b_pay_native_error_mv", "c_pay_7c9fc4b4", null, com.meituan.android.neohybrid.neo.report.a.c("code", 1120023).b);
                    com.meituan.android.neohybrid.v2.neo.report.a.c(n.this.b, "paybiz_dispatch_hybrid_cashier", com.meituan.android.neohybrid.neo.report.a.c(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(i)).a("error_message", str).b);
                }
            });
        }
        return this.f;
    }

    public final void a(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd43a62393459df6b6a7248e755b7696", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd43a62393459df6b6a7248e755b7696");
            return;
        }
        this.d.h().a(-1);
        String b = com.meituan.android.neohybrid.util.p.b(this.e);
        if (c(b)) {
            this.b.a("downgrade_illegal_chrome_version");
            return;
        }
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, "web_core_version", b);
        o();
        p();
    }

    private boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd549b540ce943c3462d737081a340fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd549b540ce943c3462d737081a340fe")).booleanValue();
        }
        List<List<String>> enableChromeVersion = this.c.downgradeConfig().getEnableChromeVersion();
        if (enableChromeVersion == null || enableChromeVersion.isEmpty()) {
            return false;
        }
        if (this.b == null || TextUtils.isEmpty(str) || str.equals("unknown") || StringUtil.NULL.equals(str)) {
            return true;
        }
        try {
            String[] split = str.split("\\.");
            if (split.length < 4) {
                return true;
            }
            for (List<String> list : enableChromeVersion) {
                String[] split2 = list.get(0).split("\\.");
                String[] split3 = list.get(1).split("\\.");
                if (split2.length >= 4 && split3.length >= 4) {
                    for (int i = 0; i < split.length; i++) {
                        try {
                            int parseInt = Integer.parseInt(split[i]);
                            if (!"*".equals(split2[i]) && parseInt < Integer.parseInt(split2[i])) {
                                return true;
                            }
                            if (!"*".equals(split3[i]) && parseInt > Integer.parseInt(split3[i])) {
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            return true;
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (Exception unused2) {
            return true;
        }
    }

    public void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a6918860861aec1bc5849f93ae78699", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a6918860861aec1bc5849f93ae78699");
            return;
        }
        this.d.a(bundle);
        n();
    }

    public final void a() {
        final String r;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b1969adda4dcd7bf64d1c54d6353235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b1969adda4dcd7bf64d1c54d6353235");
            return;
        }
        this.d.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47cc2c926e5bc460fc1b62f2163a10c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47cc2c926e5bc460fc1b62f2163a10c7");
        } else if (Build.VERSION.SDK_INT >= 19 && (r = r()) != null && r.length() != 0 && j() != null && j().j().getTag() != null) {
            j().a("javascript:window.neo_tag_page_finished", new ValueCallback<String>() { // from class: com.meituan.android.neohybrid.v2.core.n.6
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[Catch: Exception -> 0x00b9, TryCatch #0 {Exception -> 0x00b9, blocks: (B:11:0x0042, B:33:0x0096, B:35:0x009a, B:36:0x00a4, B:37:0x00ae, B:20:0x006c, B:23:0x0076, B:26:0x0080, B:29:0x008b), top: B:43:0x0042 }] */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00a4 A[Catch: Exception -> 0x00b9, TryCatch #0 {Exception -> 0x00b9, blocks: (B:11:0x0042, B:33:0x0096, B:35:0x009a, B:36:0x00a4, B:37:0x00ae, B:20:0x006c, B:23:0x0076, B:26:0x0080, B:29:0x008b), top: B:43:0x0042 }] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[Catch: Exception -> 0x00b9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b9, blocks: (B:11:0x0042, B:33:0x0096, B:35:0x009a, B:36:0x00a4, B:37:0x00ae, B:20:0x006c, B:23:0x0076, B:26:0x0080, B:29:0x008b), top: B:43:0x0042 }] */
                @Override // android.webkit.ValueCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ void onReceiveValue(java.lang.String r13) {
                    /*
                        r12 = this;
                        java.lang.String r13 = (java.lang.String) r13
                        r0 = 1
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        r9 = 0
                        r8[r9] = r13
                        com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.neohybrid.v2.core.n.AnonymousClass6.a
                        java.lang.String r11 = "49a03dcdb271624b8849594f9d408ba6"
                        r4 = 0
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r8
                        r2 = r12
                        r3 = r10
                        r5 = r11
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L1d
                        com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                        return
                    L1d:
                        boolean r1 = android.text.TextUtils.isEmpty(r13)
                        if (r1 != 0) goto L2c
                        java.lang.String r1 = "null"
                        boolean r13 = r13.equals(r1)
                        if (r13 == 0) goto Ld1
                    L2c:
                        java.lang.String r13 = "NeoCompatDelegate.onRecreateStart"
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "option="
                        r1.<init>(r2)
                        java.lang.String r2 = r2
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        com.meituan.android.neohybrid.neo.report.b.a(r13, r1)
                        com.meituan.android.neohybrid.v2.core.n r13 = com.meituan.android.neohybrid.v2.core.n.this     // Catch: java.lang.Exception -> Lb9
                        com.meituan.android.neohybrid.protocol.kernel.c r13 = r13.j()     // Catch: java.lang.Exception -> Lb9
                        android.view.View r13 = r13.j()     // Catch: java.lang.Exception -> Lb9
                        r1 = 0
                        r13.setTag(r1)     // Catch: java.lang.Exception -> Lb9
                        java.lang.String r13 = r2     // Catch: java.lang.Exception -> Lb9
                        r1 = -1
                        int r2 = r13.hashCode()     // Catch: java.lang.Exception -> Lb9
                        r3 = -934641255(0xffffffffc84a8199, float:-207366.39)
                        if (r2 == r3) goto L8b
                        r0 = -796853009(0xffffffffd080fcef, float:-1.73124792E10)
                        if (r2 == r0) goto L80
                        r0 = 94627080(0x5a3e508, float:1.5412579E-35)
                        if (r2 == r0) goto L76
                        r0 = 1308176501(0x4df93075, float:5.22587808E8)
                        if (r2 == r0) goto L6c
                        goto L95
                    L6c:
                        java.lang.String r0 = "downgrade"
                        boolean r13 = r13.equals(r0)     // Catch: java.lang.Exception -> Lb9
                        if (r13 == 0) goto L95
                        r0 = 2
                        goto L96
                    L76:
                        java.lang.String r0 = "check"
                        boolean r13 = r13.equals(r0)     // Catch: java.lang.Exception -> Lb9
                        if (r13 == 0) goto L95
                        r0 = 3
                        goto L96
                    L80:
                        java.lang.String r0 = "recreate"
                        boolean r13 = r13.equals(r0)     // Catch: java.lang.Exception -> Lb9
                        if (r13 == 0) goto L95
                        r0 = 0
                        goto L96
                    L8b:
                        java.lang.String r2 = "reload"
                        boolean r13 = r13.equals(r2)     // Catch: java.lang.Exception -> Lb9
                        if (r13 == 0) goto L95
                        goto L96
                    L95:
                        r0 = -1
                    L96:
                        switch(r0) {
                            case 0: goto Lae;
                            case 1: goto La4;
                            case 2: goto L9a;
                            default: goto L99;
                        }     // Catch: java.lang.Exception -> Lb9
                    L99:
                        goto Lb8
                    L9a:
                        com.meituan.android.neohybrid.v2.core.n r13 = com.meituan.android.neohybrid.v2.core.n.this     // Catch: java.lang.Exception -> Lb9
                        com.meituan.android.neohybrid.v2.core.a r13 = r13.b     // Catch: java.lang.Exception -> Lb9
                        java.lang.String r0 = "downgrade_recreate_failed"
                        r13.a(r0)     // Catch: java.lang.Exception -> Lb9
                        goto Lb8
                    La4:
                        com.meituan.android.neohybrid.v2.core.n r13 = com.meituan.android.neohybrid.v2.core.n.this     // Catch: java.lang.Exception -> Lb9
                        com.meituan.android.neohybrid.protocol.kernel.c r13 = r13.j()     // Catch: java.lang.Exception -> Lb9
                        r13.a()     // Catch: java.lang.Exception -> Lb9
                        goto Ld1
                    Lae:
                        com.meituan.android.neohybrid.v2.core.n r13 = com.meituan.android.neohybrid.v2.core.n.this     // Catch: java.lang.Exception -> Lb9
                        android.app.Activity r13 = r13.i()     // Catch: java.lang.Exception -> Lb9
                        r13.recreate()     // Catch: java.lang.Exception -> Lb9
                        goto Ld1
                    Lb8:
                        return
                    Lb9:
                        r13 = move-exception
                        java.lang.String r0 = "NeoCompatDelegate.onRecreateStart"
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "e="
                        r1.<init>(r2)
                        java.lang.String r13 = r13.toString()
                        r1.append(r13)
                        java.lang.String r13 = r1.toString()
                        com.meituan.android.neohybrid.neo.report.b.a(r0, r13)
                    Ld1:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.v2.core.n.AnonymousClass6.onReceiveValue(java.lang.Object):void");
                }
            });
        }
        com.meituan.android.neohybrid.v2.neo.report.a.b(this.b, "b_pay_neo_base_fragment_on_start_mv", com.meituan.android.neohybrid.neo.report.a.c("times", Integer.valueOf(this.i.b("Delegate_onStart"))).b);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "408ef0f8b96689d772228a56fb75bdb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "408ef0f8b96689d772228a56fb75bdb4");
            return;
        }
        this.d.b();
        com.meituan.android.neohybrid.v2.neo.report.a.b(this.b, "b_pay_neo_base_fragment_on_resume_mv", com.meituan.android.neohybrid.neo.report.a.c("times", Integer.valueOf(this.i.b("Delegate_onResume"))).b);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2324427630a63052b86b1cdeda9f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2324427630a63052b86b1cdeda9f30");
            return;
        }
        this.d.c();
        com.meituan.android.neohybrid.v2.neo.report.a.b(this.b, "b_pay_neo_base_fragment_on_pause_mv", com.meituan.android.neohybrid.neo.report.a.c("times", Integer.valueOf(this.i.b("Delegate_onPause"))).b);
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f79c4addb7d8b73ea7a216a1d12459a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f79c4addb7d8b73ea7a216a1d12459a");
            return;
        }
        this.d.d();
        com.meituan.android.neohybrid.v2.neo.report.a.b(this.b, "b_pay_neo_base_fragment_on_stop_mv", com.meituan.android.neohybrid.neo.report.a.c("times", Integer.valueOf(this.i.b("Delegate_onStop"))).b);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "038dd878ada0601c347d02d17f1929ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "038dd878ada0601c347d02d17f1929ef");
            return;
        }
        this.e = null;
        this.d.e();
        com.meituan.android.neohybrid.v2.neo.nsf.a.b(this.b);
        com.meituan.android.neohybrid.v2.neo.report.a.b(this.b, "b_pay_neo_base_fragment_on_destroy_mv", com.meituan.android.neohybrid.neo.report.a.c("times", Integer.valueOf(this.i.b("Delegate_onDestroy"))).b);
    }

    public final void b(Bundle bundle) {
        JSONObject a2;
        Map<String, Object> a3;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b04b49e667148e1e01ed629b17efd0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b04b49e667148e1e01ed629b17efd0e");
        } else if (bundle == null) {
        } else {
            com.meituan.android.neohybrid.util.i.a(bundle, NeoConfig.NEO_CONFIG, this.c);
            com.meituan.android.neohybrid.util.i.a(bundle, "business_params", com.meituan.android.neohybrid.v2.neo.tunnel.a.a().a(this.b));
            com.meituan.android.neohybrid.util.i.a(bundle, "global_params", com.meituan.android.neohybrid.v2.neo.tunnel.a.a().c());
            if (this.c.isNeoStorageBridge() && (a3 = MemoryStorage.a().a(this.b)) != null && !a3.isEmpty()) {
                this.k = "neo_storage_key_" + this.b.hashCode();
                bundle.putString("neo_storage_key", this.k);
                this.j.a(this.k, (String) a3, (ag<String>) new com.meituan.android.neohybrid.storage.a(), (ai<String>) new ai<Map<String, Object>>() { // from class: com.meituan.android.neohybrid.v2.core.n.1
                    @Override // com.meituan.android.cipstorage.ai
                    public final /* bridge */ /* synthetic */ void a(boolean z, String str, com.meituan.android.cipstorage.u uVar, String str2, Map<String, Object> map) {
                    }
                }, com.meituan.android.cipstorage.u.b);
            }
            if (!this.c.nsfConfig().isNsfSaved() || (a2 = com.meituan.android.neohybrid.v2.neo.nsf.a.a(this.b, this.c.nsfConfig().getNsf())) == null) {
                return;
            }
            this.q = "neo_nsf_saved_key_" + this.b.hashCode();
            bundle.putString("neo_nsf_saved_key", this.q);
            this.j.a(this.q, (String) a2, (ag<String>) new ag<JSONObject>() { // from class: com.meituan.android.neohybrid.v2.core.n.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.ag
                public final /* synthetic */ String serializeAsString(JSONObject jSONObject) {
                    JSONObject jSONObject2 = jSONObject;
                    Object[] objArr2 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bfad1f5ccd94d0be0c49f163b5db28e", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bfad1f5ccd94d0be0c49f163b5db28e");
                    }
                    if (jSONObject2 != null) {
                        return jSONObject2.toString();
                    }
                    return null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.cipstorage.ag
                /* renamed from: a */
                public JSONObject deserializeFromString(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c81d5481d89669587cf42c5931bf602", RobustBitConfig.DEFAULT_VALUE)) {
                        return (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c81d5481d89669587cf42c5931bf602");
                    }
                    try {
                        return new JSONObject(str);
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            }, (ai<String>) new ai<JSONObject>() { // from class: com.meituan.android.neohybrid.v2.core.n.3
                @Override // com.meituan.android.cipstorage.ai
                public final /* bridge */ /* synthetic */ void a(boolean z, String str, com.meituan.android.cipstorage.u uVar, String str2, JSONObject jSONObject) {
                }
            }, com.meituan.android.cipstorage.u.b);
        }
    }

    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e057687e45f4f6d6f8c52e06d5745912", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e057687e45f4f6d6f8c52e06d5745912");
        } else if (bundle == null) {
        } else {
            this.c = (NeoConfig) com.meituan.android.neohybrid.util.i.a(bundle, NeoConfig.NEO_CONFIG, (Type) NeoConfig.class);
            com.meituan.android.neohybrid.v2.neo.tunnel.a.a().a(this.b, com.meituan.android.neohybrid.util.i.a(bundle, "business_params"));
            com.meituan.android.neohybrid.v2.neo.tunnel.a.a().a(com.meituan.android.neohybrid.util.i.a(bundle, "global_params"));
            if (this.c.isNeoStorageBridge()) {
                this.k = bundle.getString("neo_storage_key", null);
                if (this.k != null) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    this.j.a(this.k, new com.meituan.android.neohybrid.storage.a(), new ai<Map<String, Object>>() { // from class: com.meituan.android.neohybrid.v2.core.n.4
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.cipstorage.ai
                        public final /* synthetic */ void a(boolean z, String str, com.meituan.android.cipstorage.u uVar, String str2, Map<String, Object> map) {
                            Map<String, Object> map2 = map;
                            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, uVar, str2, map2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd6ea1d1a4a5fd327446f115a02ce686", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd6ea1d1a4a5fd327446f115a02ce686");
                                return;
                            }
                            if (z && map2 != null && !map2.isEmpty()) {
                                MemoryStorage.a().a(n.this.k(), map2);
                                n.this.j.b(n.this.k);
                                n.this.k = null;
                                return;
                            }
                            com.meituan.android.neohybrid.neo.report.b.c("NeoCompatDelegate_onRestoreState", "getObjectAsync fail", new com.meituan.android.neohybrid.neo.report.a().a("success", Boolean.valueOf(z)).a("key", str2).a("value", map2 != null ? map2.keySet() : null).a("duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)).b);
                        }
                    }, com.meituan.android.cipstorage.u.b);
                }
            }
            if (this.c.nsfConfig().isNsfSaved()) {
                this.q = bundle.getString("neo_nsf_saved_key", null);
            }
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc5edf6a5865cb98b6310facf6f55246", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc5edf6a5865cb98b6310facf6f55246");
            return;
        }
        if (this.c.isNeoStorageBridge() && this.k != null) {
            this.j.b(this.k, com.meituan.android.cipstorage.u.b);
            this.k = null;
        }
        if (!this.c.nsfConfig().isNsfSaved() || this.q == null) {
            return;
        }
        this.j.b(this.q, com.meituan.android.cipstorage.u.b);
        this.q = null;
    }

    public final void g() {
        String r;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54520ae44d3ca1aec6a804f5ff0c937d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54520ae44d3ca1aec6a804f5ff0c937d");
            return;
        }
        h();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f3ecf2ac0d87be63e2359ade1046294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f3ecf2ac0d87be63e2359ade1046294");
        } else if (Build.VERSION.SDK_INT >= 19 && (r = r()) != null && r.length() != 0 && j() != null && !TextUtils.isEmpty(j().b())) {
            try {
                j().j().setTag(j().b());
                j().a("javascript:window.neo_tag_page_finished='true'", q.a());
                com.meituan.android.neohybrid.neo.report.b.a("NeoCompatDelegate.onRecreateInject", "option=" + r);
            } catch (Exception e) {
                com.meituan.android.neohybrid.neo.report.b.a("NeoCompatDelegate.onRecreateInject", "e=" + e.toString());
            }
        }
        if (this.p) {
            return;
        }
        this.p = true;
        long d = com.meituan.android.neohybrid.base.a.a(this.b.b).d("onCreate");
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, "b_pay_neo_general_native_tti_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("duration", Long.valueOf(d > 0 ? System.currentTimeMillis() - d : 0L)).b);
    }

    public void a(Context context) {
        this.e = context;
    }

    public void d(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74ac0ba83ea3c8b2b560fe48c627fb18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74ac0ba83ea3c8b2b560fe48c627fb18");
            return;
        }
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, NeoConfig.NEO_SCENE, this.c.getScene());
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, KernelConfig.KEY_CONTAINER_TYPE, this.b.f().kernelConfig().getContainerType());
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, KernelConfig.KEY_KERNEL_TYPE, this.b.f().kernelConfig().getKernelType());
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, KernelConfig.KEY_KERNEL_SOURCE, this.b.f().kernelConfig().getKernelSource());
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, "unique_id", this.i.a());
        HashMap hashMap = new HashMap();
        hashMap.put(NeoConfig.NEO_SCENE, this.c.getScene());
        hashMap.put("enable_data_loader", this.c.nsfConfig().isNSF() ? "1" : "0");
        hashMap.put("enable_modal_loading", this.c.loadingConfig().isLoadingEnabled() ? "1" : "0");
        com.meituan.android.neohybrid.v2.neo.tunnel.a.a().a(this.b, hashMap);
    }

    public static /* synthetic */ void a(n nVar, Throwable th) {
        Object[] objArr = {nVar, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f0057f793ab8773e9d4796411618c0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f0057f793ab8773e9d4796411618c0b");
            return;
        }
        com.meituan.android.neohybrid.v2.neo.report.a.a(nVar.b, "b_pay_native_error_mv", "c_pay_7c9fc4b4", null, com.meituan.android.neohybrid.neo.report.a.c("code", 1120022).b);
        com.meituan.android.neohybrid.v2.neo.report.a.c(nVar.b, "paybiz_dispatch_hybrid_cashier", com.meituan.android.neohybrid.neo.report.a.c("error_message", th.toString()).b);
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e9866422c8e8b50a2100123300aed76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e9866422c8e8b50a2100123300aed76");
        } else if (m()) {
            a(false);
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3942e604b5685e8d7a03ae2b4dbbda41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3942e604b5685e8d7a03ae2b4dbbda41");
            return;
        }
        Activity i = i();
        if (i == null) {
            return;
        }
        UIConfig uiConfig = this.c.uiConfig();
        com.meituan.android.neohybrid.util.j a2 = com.meituan.android.neohybrid.util.j.a(i);
        a2.b = z;
        Integer statusBarColorInt = uiConfig.getStatusBarColorInt();
        if (statusBarColorInt != null) {
            a2.a(statusBarColorInt.intValue()).a(true);
        }
        a2.b(uiConfig.isFullscreen()).c(uiConfig.isImmersion()).a();
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52282837cb22cd123f5bcd20965cb3f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52282837cb22cd123f5bcd20965cb3f4");
            return;
        }
        UIConfig uiConfig = this.c.uiConfig();
        com.meituan.android.neohybrid.framework.webcompat.element.a h = this.d.h();
        View a2 = h.a();
        if (uiConfig.isHideTitleBar()) {
            h.b();
            return;
        }
        h.c();
        if (uiConfig.isTitleBarTransparent()) {
            a2.setVisibility(4);
        } else {
            a2.setVisibility(0);
        }
        View findViewById = a2.findViewById(R.id.web_title_bar);
        if (findViewById != null && uiConfig.isTitleBarColorSet()) {
            findViewById.setBackgroundColor(uiConfig.getTitleBarColorInt());
        }
    }

    private void p() {
        Integer backgroundColorInt;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16edff14615f3f304a42052e4b3ee056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16edff14615f3f304a42052e4b3ee056");
        } else if (this.f == null || (backgroundColorInt = this.c.uiConfig().getBackgroundColorInt()) == null) {
        } else {
            this.f.setBackgroundColor(backgroundColorInt.intValue());
        }
    }

    public static /* synthetic */ void a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87ea74d83fd0ac164ed81325c881a264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87ea74d83fd0ac164ed81325c881a264");
            return;
        }
        nVar.a(true);
        nVar.o();
        nVar.p();
    }

    @Override // com.meituan.android.neohybrid.v2.neo.notification.a.InterfaceC0315a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b510f270f4d17af610f667050df28ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b510f270f4d17af610f667050df28ae5");
        } else if (TextUtils.isEmpty(str) || this.b.f || this.i.e(str) != null) {
        } else {
            a aVar = this.b;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "529df1ad78eed6aa1faec16b7cf4bae4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "529df1ad78eed6aa1faec16b7cf4bae4");
                return;
            }
            com.meituan.android.neohybrid.core.listener.a aVar2 = aVar.b;
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = l.a;
            if (aVar.a(aVar2, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f1c48575e8abe518dcace0f3ce39e16f", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0311a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f1c48575e8abe518dcace0f3ce39e16f") : new l(str))) {
                aVar.a(str);
            } else if (TunnelParamJSHandler.NAME.equals(str)) {
                aVar.a(str);
            }
        }
    }

    public final com.meituan.android.neohybrid.protocol.kernel.c j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ab20e494b4c1a28103d2e1b24df775", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.protocol.kernel.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ab20e494b4c1a28103d2e1b24df775") : this.d.g();
    }

    public final a k() {
        return this.b;
    }

    public final NeoConfig l() {
        return this.c;
    }

    public final boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea40c9bcc61797ffa1ba28ea9e73dbda", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea40c9bcc61797ffa1ba28ea9e73dbda")).booleanValue() : i() != null;
    }

    private void q() {
        com.meituan.android.neohybrid.protocol.kernel.c j;
        NeoBridge neoBridge;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0df42216a16d921fe4f3f69afcf10bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0df42216a16d921fe4f3f69afcf10bc");
            return;
        }
        HashMap<String, Object> hashMap = com.meituan.android.neohybrid.neo.report.a.c("hybrid_current_url", this.h).b;
        if (KernelConfig.KERNEL_TYPE_RECCE.equals(this.c.kernelConfig().getKernelType()) || com.meituan.android.neohybrid.v2.neo.offline.b.a(this.h)) {
            com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, "is_offline_package_exist", "1");
            com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, "b_pay_hybrid_offline_package_exist_mv", "c_pay_7c9fc4b4", null, hashMap);
            com.meituan.android.neohybrid.v2.neo.report.a.c(this.b, "hybrid_offline_package_exist", hashMap);
        } else {
            com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, "is_offline_package_exist", "0");
            com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, "b_pay_hybrid_offline_package_not_exist_mv", "c_pay_7c9fc4b4", null, hashMap);
            com.meituan.android.neohybrid.v2.neo.report.a.c(this.b, "hybrid_offline_package_not_exist", hashMap);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31e53f9ebbd12b9f76450d85e1cdf94e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31e53f9ebbd12b9f76450d85e1cdf94e");
        } else if (this.n != null && this.n.length() != 0 && (j = j()) != null) {
            com.meituan.android.neohybrid.protocol.kernel.b d = j.d();
            String a2 = d.a();
            d.a(a2 + this.n.toString());
            this.n = new StringBuilder();
        }
        if (!this.o) {
            this.o = true;
            com.meituan.android.neohybrid.v2.neo.offline.b.a(j(), this.b);
        }
        com.meituan.android.neohybrid.protocol.kernel.c j2 = j();
        Object[] objArr3 = {j2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bda5ccbf954c13c2161a5e010c837ea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bda5ccbf954c13c2161a5e010c837ea9");
        } else if (this.c == null || !this.c.isNeoBridge() || Neo.debugger().a("neo_bridge_inject_disabled") || j2 == null || this.b == null) {
        } else {
            if (KernelConfig.KERNEL_TYPE_RECCE.equals(this.c.kernelConfig().getKernelType())) {
                NeoBridgeV2 neoBridgeV2 = new NeoBridgeV2(this.b);
                neoBridgeV2.setNeoBridgeCustomizeHandlers(this.m);
                j2.a(neoBridgeV2, "NeoBridge");
                return;
            }
            if (this.c.isNeoStorageBridge()) {
                neoBridge = new NeoSessionStorageBridge(this.b);
            } else {
                neoBridge = new NeoBridge(this.b);
            }
            neoBridge.setNeoBridgeCustomizeHandlers(this.m);
            j2.a(neoBridge, "NeoBridge");
        }
    }

    public void n() {
        KernelConfig kernelConfig;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b223662f0ded3397b5042910628c7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b223662f0ded3397b5042910628c7d");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        String str = null;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33e9a8eae64326119fa23b31df51505b", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33e9a8eae64326119fa23b31df51505b");
        } else {
            NeoConfig neoConfig = this.c;
            if (neoConfig != null && (kernelConfig = neoConfig.kernelConfig()) != null) {
                str = kernelConfig.getKernelType();
            }
        }
        if (TextUtils.equals(str, KernelConfig.KERNEL_TYPE_RECCE)) {
            return;
        }
        String url = this.c.getUrl();
        if (TextUtils.isEmpty(url)) {
            return;
        }
        b(url);
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f097a8d8ac28186a6071b37a8e632bcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f097a8d8ac28186a6071b37a8e632bcf");
        } else if (TextUtils.isEmpty(str)) {
            com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, "b_pay_neo_web_view_load_error_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("code", 1120021).b);
        } else {
            this.h = str;
            q();
            if (TextUtils.isEmpty(this.h)) {
                return;
            }
            this.d.loadUrl(this.h);
            com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, "b_pay_neo_web_view_start_load_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c("url", this.h).b);
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.nsf.c.b
    public final boolean a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a876fb68f91907870cb0409894e84e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a876fb68f91907870cb0409894e84e1")).booleanValue();
        }
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, "b_pay_5b9me55y_sc", (Map<String, Object>) new com.meituan.android.neohybrid.neo.report.a().a(KnbConstants.PARAMS_SCENE, "normal").a("data_source", this.r).b);
        return this.b.b(str, jSONObject);
    }

    @Override // com.meituan.android.neohybrid.v2.neo.nsf.c.b
    public final boolean a(String str, int i, String str2) {
        Object[] objArr = {str, 3000, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c4acbb58060cae08755722b61a80725", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c4acbb58060cae08755722b61a80725")).booleanValue();
        }
        com.meituan.android.neohybrid.v2.neo.report.a.a(this.b, "b_pay_qardg8z8_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, 3000).a("error_message", str2).a(KnbConstants.PARAMS_SCENE, "normal").a("data_source", this.r).b);
        return this.b.a(str, 3000, str2);
    }

    @Nullable
    private String r() {
        NeoHornConfig neoHornConfig;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d23640441c6fe757df118b0a670e7768", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d23640441c6fe757df118b0a670e7768");
        }
        com.meituan.android.neohybrid.core.horn.a a2 = com.meituan.android.neohybrid.core.horn.a.a();
        if (a2 == null || (neoHornConfig = (NeoHornConfig) a2.a(NeoHornConfig.class)) == null) {
            return null;
        }
        return (this.c == null || this.c.kernelConfig() == null || !TextUtils.equals(KernelConfig.KERNEL_TYPE_RECCE, this.c.kernelConfig().getKernelType())) ? neoHornConfig.getReCreateOptions() : "";
    }

    public Activity i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a588ed6d4f22a49a7e5fa72ec7dd71d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a588ed6d4f22a49a7e5fa72ec7dd71d");
        }
        Context context = this.e;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }
}
