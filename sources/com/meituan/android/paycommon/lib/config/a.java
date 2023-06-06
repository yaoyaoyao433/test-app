package com.meituan.android.paycommon.lib.config;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.hybridcashier.bridge.result.NotifyHybridProcessResultJSHandler;
import com.meituan.android.hybridcashier.cashier.HybridCashierFragment;
import com.meituan.android.hybridcashier.config.bean.HybridCashierGlobalConfig;
import com.meituan.android.neohybrid.Neo;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.config.a;
import com.meituan.android.paybase.config.b;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ah;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paycommon.lib.IInitSDK;
import com.meituan.android.paycommon.lib.config.e;
import com.meituan.android.paycommon.lib.utils.n;
import com.meituan.android.paycommon.lib.utils.s;
import com.meituan.android.paycommon.lib.utils.t;
import com.meituan.android.paycommon.lib.webview.jshandler.ChangeFingerStatusJsHandler;
import com.meituan.android.paycommon.lib.webview.jshandler.GetFingerprintParamJsHandler;
import com.meituan.android.paycommon.lib.webview.jshandler.GotoSettingJsHandler;
import com.meituan.android.paycommon.lib.webview.jshandler.StartIdentifyJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.mesh.core.IMeshProvider;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static e b;
    private static f c = new C0340a();
    private static boolean d = false;
    @SuppressLint({"StaticFieldLeak"})
    private static Object e;

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9dfcb7a08315438111f5f360ff385dfc", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9dfcb7a08315438111f5f360ff385dfc");
        }
        if (b == null) {
            throw new IllegalStateException("must config MTProvider by MTPayConfig.config()");
        }
        return b;
    }

    public static f b() {
        return c;
    }

    public static void a(final Context context, e eVar) {
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "701989bb47f8f32f599671e1a13d51b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "701989bb47f8f32f599671e1a13d51b8");
            return;
        }
        b = eVar;
        eVar.a = context.getApplicationContext();
        com.meituan.android.paybase.metrics.a.b("paycommonConfig", "paycommonConfigStart");
        com.meituan.android.paybase.config.a.a(new com.meituan.android.paybase.config.b() { // from class: com.meituan.android.paycommon.lib.config.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paybase.config.b
            public final String q() {
                return "10.1.0";
            }

            @Override // com.meituan.android.paybase.config.b
            public final Context a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14008fa4fc269f1a9fd53ef293ec30ed", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14008fa4fc269f1a9fd53ef293ec30ed") : a.b.a;
            }

            @Override // com.meituan.android.paybase.config.b
            public final String b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fee8b73504747f115e77ebb16ab62cc8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fee8b73504747f115e77ebb16ab62cc8") : Neo.debugger().a("debug_pay_host", a.b.a());
            }

            @Override // com.meituan.android.paybase.config.b
            public final String c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eeebda9df6d2ea0027d6dc56d50b91b5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eeebda9df6d2ea0027d6dc56d50b91b5") : a.b.c();
            }

            @Override // com.meituan.android.paybase.config.b
            public final String d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14027bc68b7aa0e320ed5285150a1ff4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14027bc68b7aa0e320ed5285150a1ff4") : a.b.d();
            }

            @Override // com.meituan.android.paybase.config.b
            public final String e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3e32bd3b832a620b26f719fdfcb875e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3e32bd3b832a620b26f719fdfcb875e") : a.b.e();
            }

            @Override // com.meituan.android.paybase.config.b
            public final MtLocation f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "295f34dae4b7e5f3ce1a956ed7f1fbd9", RobustBitConfig.DEFAULT_VALUE) ? (MtLocation) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "295f34dae4b7e5f3ce1a956ed7f1fbd9") : a.b.f();
            }

            @Override // com.meituan.android.paybase.config.b
            public final String g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16e186c5345cd47f6fb16c16418edc46", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16e186c5345cd47f6fb16c16418edc46") : a.b.g();
            }

            @Override // com.meituan.android.paybase.config.b
            public final String h() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3911adaa366e22f3f21979e0e42d3c51", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3911adaa366e22f3f21979e0e42d3c51") : a.b.h();
            }

            @Override // com.meituan.android.paybase.config.b
            public final String i() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e92b63d68055eda2af183883fa212211", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e92b63d68055eda2af183883fa212211") : a.b.i();
            }

            @Override // com.meituan.android.paybase.config.b
            public final String j() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d045f82977ba35ce306c0ab95e7640c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d045f82977ba35ce306c0ab95e7640c") : a.b.j();
            }

            @Override // com.meituan.android.paybase.config.b
            public final String k() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65d6951d862bb09743a0acb1721cea15", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65d6951d862bb09743a0acb1721cea15") : a.b.k();
            }

            @Override // com.meituan.android.paybase.config.b
            public final String l() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05948d0e1f7180493c3084f3280483d0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05948d0e1f7180493c3084f3280483d0") : a.b.l();
            }

            @Override // com.meituan.android.paybase.config.b
            public final int m() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "830f67b7ec864e3db6c2954db9cc537d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "830f67b7ec864e3db6c2954db9cc537d")).intValue() : a.b.m();
            }

            @Override // com.meituan.android.paybase.config.b
            public final String n() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92d12c65a4bb73ac90dbe442c2164b41", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92d12c65a4bb73ac90dbe442c2164b41") : a.b.n();
            }

            @Override // com.meituan.android.paybase.config.b
            public final String o() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70aae8fc2e2cf859109a8ff8b5456778", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70aae8fc2e2cf859109a8ff8b5456778") : a.b.o();
            }

            @Override // com.meituan.android.paybase.config.b
            public final String p() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0a095f970624bdf9fa788e548dbb1ed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0a095f970624bdf9fa788e548dbb1ed") : a.b.q();
            }

            @Override // com.meituan.android.paybase.config.b
            public final com.meituan.android.paybase.imageloader.a r() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7446abefe5be065c036efdc54005b587", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.paybase.imageloader.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7446abefe5be065c036efdc54005b587") : a.b.r();
            }

            @Override // com.meituan.android.paybase.config.b
            public final boolean t() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef7aaafb96a6bf371623ef0a6a244bdc", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef7aaafb96a6bf371623ef0a6a244bdc")).booleanValue();
                }
                e unused = a.b;
                return false;
            }

            @Override // com.meituan.android.paybase.config.b
            public final boolean u() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "481a897bb65f24b9e8e338126412dcab", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "481a897bb65f24b9e8e338126412dcab")).booleanValue();
                }
                e unused = a.b;
                return false;
            }

            @Override // com.meituan.android.paybase.config.b
            public final String v() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "000f017f5981e47a7019a41f40bea38e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "000f017f5981e47a7019a41f40bea38e");
                }
                e unused = a.b;
                return "";
            }

            @Override // com.meituan.android.paybase.config.b
            public final void a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2) {
                Object[] objArr2 = {new Long(j), str, 0, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0ac7464ea1bc142ca1ef04f33b7b3d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0ac7464ea1bc142ca1ef04f33b7b3d6");
                } else {
                    a.b.a(j, str, 0, i2, i3, i4, i5, i6, str2);
                }
            }

            @Override // com.meituan.android.paybase.config.b
            public final Map<b.a, Integer> w() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e84fcf23f89256717e54f744360113f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e84fcf23f89256717e54f744360113f");
                }
                Map<e.a, Integer> b2 = a.b.b();
                if (b2 != null && b2.containsKey(e.a.THEME)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(b.a.THEME, b2.get(e.a.THEME));
                    return hashMap;
                }
                return null;
            }

            @Override // com.meituan.android.paybase.config.b
            public final com.meituan.android.paybase.login.a s() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24863b6d64b772a73f570156136083b3", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.paybase.login.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24863b6d64b772a73f570156136083b3") : a.b.s();
            }
        });
        if (com.meituan.android.paybase.config.a.a()) {
            com.meituan.android.paybase.asynctask.a.a();
        }
        com.meituan.android.paybase.metrics.a.c("paycommonConfig", "paycommonConfigStep1");
        com.meituan.android.paybase.config.a.a(b.a());
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        com.meituan.android.paybase.config.a.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d8a3516bd690d4585c3ce0dc82bbb511", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0330a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d8a3516bd690d4585c3ce0dc82bbb511") : new c(context));
        com.meituan.android.paybase.metrics.a.c("paycommonConfig", "paycommonConfigStep2");
        if (!com.meituan.android.paybase.config.a.a()) {
            new com.meituan.android.paybase.asynctask.a<String, String, String>() { // from class: com.meituan.android.paycommon.lib.config.a.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paybase.asynctask.b
                public final /* synthetic */ Object a(Object[] objArr3) {
                    Object[] objArr4 = {(String[]) objArr3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "eba9902c75fa51c55d8dc04d9f8c9a76", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "eba9902c75fa51c55d8dc04d9f8c9a76");
                    }
                    a.d(context.getApplicationContext());
                    a.e();
                    return null;
                }
            }.b(new String[0]);
            com.meituan.android.paybase.metrics.a.c("paycommonConfig", "paycommonConfigStep3");
        }
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a4607006da4d36c8077e7272dba2ffed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a4607006da4d36c8077e7272dba2ffed");
        } else if (!com.sankuai.meituan.serviceloader.b.a()) {
            com.sankuai.meituan.serviceloader.b.a(context, new b.a() { // from class: com.meituan.android.paycommon.lib.config.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.serviceloader.b.a
                public final void a(Throwable th) {
                    Object[] objArr4 = {th};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "93341897cb717116d186cb584c5e68cb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "93341897cb717116d186cb584c5e68cb");
                    } else {
                        com.meituan.android.paybase.common.analyse.a.a(th, "MTPayConfig_initServiceLoader", (Map<String, Object>) null);
                    }
                }
            });
        }
        com.meituan.android.paybase.metrics.a.c("paycommonConfig", "paycommonConfigStep4");
        com.meituan.android.paybase.metrics.a.b("paycommonConfig");
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "5b8b6b367c635fd9b31cfe014c60fc10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "5b8b6b367c635fd9b31cfe014c60fc10");
        } else if (!TextUtils.isEmpty(b.j())) {
            com.meituan.android.paybase.downgrading.a.a().a(b.a);
        }
        if (com.meituan.android.neohybrid.init.a.h()) {
            Object[] objArr5 = {context};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "7871ff11de0bc1f3a4c82150c22c6dcf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "7871ff11de0bc1f3a4c82150c22c6dcf");
            } else if (context == null) {
            } else {
                try {
                    e = new Object() { // from class: com.meituan.android.paycommon.lib.config.a.8
                    };
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static /* synthetic */ void a(Activity activity, int i, String str) {
        Object[] objArr = {activity, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee49754dacda47ae51f900efb434c129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee49754dacda47ae51f900efb434c129");
        } else if (c != null) {
            c.a(activity, i, str);
        }
    }

    public static /* synthetic */ void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10c6b6e15778266098d0590b7c1df7d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10c6b6e15778266098d0590b7c1df7d8");
        } else {
            a(context.getApplicationContext());
        }
    }

    public static void a(final Context context) {
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "370f198f80d8f3428faa887ff1e28449", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "370f198f80d8f3428faa887ff1e28449");
        } else if (!d) {
            d = true;
            com.meituan.android.paybase.metrics.a.b("paycommonInit", "paycommonInitStart");
            if (com.meituan.android.paybase.config.a.a()) {
                com.meituan.android.paybase.config.a.b();
                d(context.getApplicationContext());
                e();
            }
            com.meituan.android.neohybrid.init.a.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.hybridcashier.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4a3cb4028f430df8c9ad5597524739c3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4a3cb4028f430df8c9ad5597524739c3");
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.hybridcashier.hook.b.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "13a2606717b92ef9ed28d4e98216a2b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "13a2606717b92ef9ed28d4e98216a2b4");
                } else if (com.meituan.android.hybridcashier.config.a.b() instanceof Application) {
                    Application application = (Application) com.meituan.android.hybridcashier.config.a.b();
                    application.unregisterActivityLifecycleCallbacks(com.meituan.android.hybridcashier.hook.c.a());
                    application.registerActivityLifecycleCallbacks(com.meituan.android.hybridcashier.hook.c.a());
                }
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.hybridcashier.b.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "f723f02f0ad43d3646b3467f33a925e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "f723f02f0ad43d3646b3467f33a925e3");
                } else {
                    com.meituan.android.neohybrid.core.horn.a.a().a("hybrid_cashier_configurations_global_alone_android", HybridCashierGlobalConfig.class);
                    com.meituan.android.hybridcashier.config.horn.a.a();
                    com.meituan.android.paybase.login.a s = com.meituan.android.neohybrid.init.a.c().s();
                    if (s != null) {
                        s.a(com.meituan.android.hybridcashier.c.a());
                    }
                }
                com.meituan.android.neohybrid.neo.tunnel.a.a().a("app_hybrid_cashier_sdk_version", (Object) "0.1.33.1");
                com.meituan.android.neohybrid.container.a.a("hybrid_cashier", HybridCashierFragment.class);
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.hybridcashier.b.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "d89589b323ff6916acc7cf262988d8a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "d89589b323ff6916acc7cf262988d8a4");
                } else {
                    JsHandlerFactory.registerJsHandler("pay.notifyHybridProcessResult", "tGNQE8T/2KDqSxNOPHAiOaGDZvN/NneLnuM6CTb18cf6c7qVM6eYWZDW2k+IbEShzJQk1N9quhws3zKWuL/vRg==", NotifyHybridProcessResultJSHandler.class);
                }
            }
            Object[] objArr6 = {context};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "36b9c38a4b5fa65b32c16aa2bd3bbe29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "36b9c38a4b5fa65b32c16aa2bd3bbe29");
            } else {
                List<IInitSDK> a2 = com.sankuai.meituan.serviceloader.b.a(IInitSDK.class, "");
                if (!i.a((Collection) a2)) {
                    for (IInitSDK iInitSDK : a2) {
                        iInitSDK.a(context);
                    }
                }
            }
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "041d50f5b7641c6d237889a424f800b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "041d50f5b7641c6d237889a424f800b0");
            } else {
                com.meituan.android.paybase.metrics.a.b("paycommonRegisterJshandler", "paycommonRegisterJshandlerStart");
                com.meituan.android.paybase.metrics.a.c("paycommonRegisterJshandler", "paycommonRegisterJshandlerStep1");
                JsHandlerFactory.registerJsHandler("pay.getBiometricsInfo", "hrq8bopCxBewme7duBRWq8WAqqK1LwfgBJ2w3dZORy0lVrX2ru0aXM+JC8xD33U6HDtUSHjxgZaIz2AhWtc1Mw==", GetFingerprintParamJsHandler.class);
                JsHandlerFactory.registerJsHandler("pay.setFingerMeituanPay", "eQxoEiIbYZqQ/BHfpJkcuQ5iQhkrMEVVPRZ9DriGXHJBuWmEqghCp1mR2J/lTerO2w1SSRJ2uq/ptuQETETLCQ==", GotoSettingJsHandler.class);
                JsHandlerFactory.registerJsHandler("pay.changeFingerMeituanPay", "TonKQhk19n521yBFrJeBnSjVA4aPWykzYyKOHZLH+GbnYB7+cJv2brXgQ+SQY5mKvd0ifC6G8UqInITR4X1xFg==", ChangeFingerStatusJsHandler.class);
                JsHandlerFactory.registerJsHandler("pay.startIdentify", "LAsqsYR2X8bXpP2gJE/dG+Ywquo8y7/KS8ohiBcpHYRlKKvvvqUwso5fQyAvKxwHUQ/VF6UAjJ/scAPNr6UiBw==", StartIdentifyJSHandler.class);
                com.meituan.android.paybase.metrics.a.c("paycommonRegisterJshandler", "paycommonRegisterJshandlerStep2");
                List<FinanceJsHandler> a3 = com.sankuai.meituan.serviceloader.b.a(FinanceJsHandler.class, "");
                com.meituan.android.paybase.metrics.a.c("paycommonRegisterJshandler", "paycommonRegisterJshandlerStep3");
                com.meituan.android.paybase.metrics.a.b("paycommonRegisterJshandler");
                if (!i.a((Collection) a3)) {
                    try {
                        for (FinanceJsHandler financeJsHandler : a3) {
                            if (!TextUtils.isEmpty(financeJsHandler.getSignature())) {
                                JsHandlerFactory.registerJsHandler(financeJsHandler.getMethodName(), financeJsHandler.getSignature(), financeJsHandler.getHandlerClass());
                            } else {
                                JsHandlerFactory.registerJsHandler(financeJsHandler.getMethodName(), financeJsHandler.getHandlerClass());
                            }
                        }
                    } catch (Exception e2) {
                        com.meituan.android.paybase.common.analyse.a.a(e2, "MTPayConfig_registerPayJsHandler", (Map<String, Object>) null);
                        com.meituan.android.paybase.common.analyse.cat.a.a("registerKNBBridgeFail", "注册桥失败");
                    }
                }
            }
            com.meituan.android.paybase.metrics.a.c("paycommonInit", "paycommonInitStep1");
            com.meituan.android.paybase.metrics.a.c("paycommonInit", "paycommonInitStep2");
            com.sankuai.ehcore.b.a(context.getApplicationContext(), null);
            com.meituan.android.paybase.metrics.a.c("paycommonInit", "paycommonInitStep3");
            com.meituan.android.paybase.metrics.a.c("paycommonInit", "paycommonInitStep4");
            Object[] objArr8 = {context};
            ChangeQuickRedirect changeQuickRedirect8 = a;
            if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "d418f6523ad7b71f641ed16c5fd325ae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "d418f6523ad7b71f641ed16c5fd325ae");
            } else {
                com.meituan.android.paybase.config.a.d().s().a(d.a());
            }
            Object[] objArr9 = {context};
            ChangeQuickRedirect changeQuickRedirect9 = a;
            if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "db8c380cce52e2406c219c53cc0b8625", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "db8c380cce52e2406c219c53cc0b8625");
            } else if (context.getApplicationContext() instanceof Application) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new n(new n.a() { // from class: com.meituan.android.paycommon.lib.config.a.7
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.paycommon.lib.utils.n.a
                    public final void a() {
                        Object[] objArr10 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect10 = a;
                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "4cf94bc0d8f91ebab1f47d6dd88a3d45", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "4cf94bc0d8f91ebab1f47d6dd88a3d45");
                        } else {
                            s.a().b();
                        }
                    }
                }));
            }
            com.meituan.android.paybase.metrics.a.c("paycommonInit", "paycommonInitStep5");
            com.meituan.android.paybase.metrics.a.b("paycommonInit");
            Object[] objArr10 = {context};
            ChangeQuickRedirect changeQuickRedirect10 = a;
            if (PatchProxy.isSupport(objArr10, null, changeQuickRedirect10, true, "41cedcd4e5af318a1e8f4b715548c81c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, null, changeQuickRedirect10, true, "41cedcd4e5af318a1e8f4b715548c81c");
            } else {
                s a4 = s.a();
                Object[] objArr11 = {context};
                ChangeQuickRedirect changeQuickRedirect11 = s.a;
                if (PatchProxy.isSupport(objArr11, a4, changeQuickRedirect11, false, "4d4dc99dcc5d513b571bb03066cd1855", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, a4, changeQuickRedirect11, false, "4d4dc99dcc5d513b571bb03066cd1855");
                } else {
                    Horn.register("pay_network_userset_configure", t.a(a4), null);
                }
            }
            if (a().s() != null) {
                a().s().a(new com.meituan.android.paybase.login.b() { // from class: com.meituan.android.paycommon.lib.config.a.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.paybase.login.b
                    public final void a(boolean z2) {
                        Object[] objArr12 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect12 = a;
                        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "a3871c51645f65b5ceee741b3370867d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "a3871c51645f65b5ceee741b3370867d");
                        } else if (z2) {
                            com.meituan.android.paybase.downgrading.d.a().a(context);
                        }
                    }
                });
            }
            com.meituan.android.paybase.downgrading.d.a().a(context);
            Object[] objArr12 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect12 = com.meituan.android.paycommon.lib.settings.e.a;
            if (PatchProxy.isSupport(objArr12, null, changeQuickRedirect12, true, "343e21863235d1b44628d9345681f460", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, null, changeQuickRedirect12, true, "343e21863235d1b44628d9345681f460");
                return;
            }
            Object[] objArr13 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect13 = com.meituan.android.paycommon.lib.settings.e.a;
            if (PatchProxy.isSupport(objArr13, null, changeQuickRedirect13, true, "b538bfe6ad31e1262655a90578ae6f15", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr13, null, changeQuickRedirect13, true, "b538bfe6ad31e1262655a90578ae6f15")).booleanValue();
            } else {
                String c2 = a().c();
                String k = a().k();
                if (!ah.a(a().a) && ((!TextUtils.equals("group", k) || !TextUtils.equals("meituaninternaltest", c2)) && (!TextUtils.equals("dianping-nova", k) || !TextUtils.equals("meituaninternaltest", c2)))) {
                    z = false;
                }
            }
            if (z) {
                com.meituan.android.paycommon.lib.settings.d.j();
                com.meituan.android.paycommon.lib.settings.d.k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b57f48269553d6ed6e35e3e1dc545d45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b57f48269553d6ed6e35e3e1dc545d45");
            return;
        }
        try {
            com.sankuai.mesh.core.e.a(context, new IMeshProvider() { // from class: com.meituan.android.paycommon.lib.config.a.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.mesh.core.IMeshProvider
                public final String getAppName() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7b43ed85b9c5136f12d76468b568490", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7b43ed85b9c5136f12d76468b568490") : a.b.k();
                }

                @Override // com.sankuai.mesh.core.IMeshProvider
                public final String getAppVersion() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b2a9df25452e19941be2c72c93ac277", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b2a9df25452e19941be2c72c93ac277");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(a.b.m());
                    return sb.toString();
                }

                @Override // com.sankuai.mesh.core.IMeshProvider
                public final String getPayVersion() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "126911a059682edd7e1e79d931a2de3a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "126911a059682edd7e1e79d931a2de3a") : com.meituan.android.paybase.config.a.d().q();
                }
            });
        } catch (Exception unused) {
            com.meituan.android.paybase.common.analyse.cat.a.a("meshSdk", "mesh初始化失败");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "189996d2419be36d98c98fefc1844619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "189996d2419be36d98c98fefc1844619");
        } else {
            com.meituan.android.yoda.plugins.d.a().a(new com.meituan.android.yoda.plugins.a() { // from class: com.meituan.android.paycommon.lib.config.a.6
                @Override // com.meituan.android.yoda.plugins.a
                public final String a() {
                    return "";
                }
            });
        }
    }

    /* compiled from: ProGuard */
    @MTPaySuppressFBWarnings({"SIC_INNER_SHOULD_BE_STATIC_ANON"})
    /* renamed from: com.meituan.android.paycommon.lib.config.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0340a implements f {
        public static ChangeQuickRedirect a;

        public C0340a() {
        }

        @Override // com.meituan.android.paycommon.lib.config.f
        public final void a(final Activity activity, int i, String str) {
            Object[] objArr = {activity, Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85ec4405a1b42cb5fb5530afc1a9f397", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85ec4405a1b42cb5fb5530afc1a9f397");
            } else {
                new PayDialog.a(activity).c(str).b("知道了", new BasePayDialog.c() { // from class: com.meituan.android.paycommon.lib.config.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
                    public final void a(Dialog dialog) {
                        Object[] objArr2 = {dialog};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4b729d083828649947fd81457ee4388", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4b729d083828649947fd81457ee4388");
                        } else if (activity instanceof PayBaseActivity) {
                            PayBaseActivity payBaseActivity = (PayBaseActivity) activity;
                            if (payBaseActivity.a(payBaseActivity)) {
                                activity.finish();
                            }
                        }
                    }
                }).a().show();
            }
        }
    }

    public static /* synthetic */ void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbb9c1cdbfdace77166afe9761b81f67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbb9c1cdbfdace77166afe9761b81f67");
        } else if (z) {
            s.a().c();
            s.a().b();
        } else {
            s.a().c();
        }
    }
}
