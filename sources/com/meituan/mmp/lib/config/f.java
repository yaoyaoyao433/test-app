package com.meituan.mmp.lib.config;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.meituan.metrics.common.Constants;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.engine.MMPHornPreloadConfig;
import com.meituan.mmp.lib.engine.m;
import com.meituan.mmp.lib.engine.s;
import com.meituan.mmp.lib.mp.c;
import com.meituan.mmp.lib.page.view.h;
import com.meituan.mmp.lib.page.view.i;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.v;
import com.meituan.mmp.lib.w;
import com.meituan.mmp.lib.web.IX5Provider;
import com.meituan.mmp.lib.web.j;
import com.meituan.mmp.main.IEnvInfo;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.mtwebkit.internal.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public static boolean c = false;
    private static final HashMap<a, Boolean> i = v.a(a.CHROME, Boolean.FALSE, a.MT_WEB_VIEW, Boolean.FALSE, a.X5, Boolean.FALSE);
    public com.meituan.mmp.lib.page.view.b d;
    public IX5Provider e;
    private final m f;
    private boolean g;
    private final HashMap<a, Boolean> h;
    private boolean j;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        CHROME,
        MT_WEB_VIEW,
        X5;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82662cab1bf389cdc55693539178832b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82662cab1bf389cdc55693539178832b");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9f3831f15ee37a92a304d9f11821b2b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9f3831f15ee37a92a304d9f11821b2b") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0109e6d3b7bdfd6574a1f0960b4f0c12", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0109e6d3b7bdfd6574a1f0960b4f0c12") : (a[]) values().clone();
        }
    }

    public f(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e08f3d6252d890b79cdfc5f7211ef7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e08f3d6252d890b79cdfc5f7211ef7f");
            return;
        }
        this.h = v.a(a.CHROME, Boolean.FALSE, a.MT_WEB_VIEW, Boolean.FALSE, a.X5, Boolean.FALSE);
        this.f = mVar;
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a139b501e0bd6d513058675dc19c130", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a139b501e0bd6d513058675dc19c130")).booleanValue();
        }
        if (c) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || b || MMPHornPreloadConfig.f();
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "411eb43b85474240e62b4944bfe926dd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "411eb43b85474240e62b4944bfe926dd")).booleanValue() : !com.meituan.mmp.lib.mp.a.f() && b.q();
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8cae19b901cf137af066793ccac2c999", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8cae19b901cf137af066793ccac2c999")).booleanValue() : !com.meituan.mmp.lib.mp.a.f() && b.d(str);
    }

    public final boolean c() {
        Boolean g;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce448c298a752f0e4b139375457b47b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce448c298a752f0e4b139375457b47b1")).booleanValue();
        }
        if (DebugHelper.b() && (g = DebugHelper.g()) != null) {
            return g.booleanValue();
        }
        return a(this.f.b);
    }

    public final com.meituan.mmp.lib.page.view.b a(Context context, String str) {
        com.meituan.mmp.lib.page.view.b iVar;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13127c92bf7a67b63ef910154762372", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.view.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13127c92bf7a67b63ef910154762372");
        }
        ab.a("new Simple WebView");
        if (c()) {
            iVar = new h(context, str);
            if (DebugHelper.c()) {
                MTWebView.setWebContentsDebuggingEnabled(true);
            }
        } else {
            com.meituan.mmp.lib.web.a.a(context);
            iVar = new i(context);
            if (DebugHelper.c()) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
        ab.a();
        return iVar;
    }

    public com.meituan.mmp.lib.page.view.b a(Context context) throws Exception {
        a aVar;
        com.meituan.mmp.lib.page.view.b bVar;
        com.meituan.mmp.lib.page.view.b bVar2;
        a aVar2;
        String str;
        int indexOf;
        String sb;
        HashMap hashMap;
        IX5Provider a2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "732aa96b84ccddd3116a1f442ee3c226", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.view.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "732aa96b84ccddd3116a1f442ee3c226");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.g) {
            w.a().e.a("native_webview_init_begin");
            Object[] objArr2 = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.mp.c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "142fb9e8eca49fa3344273facc0b4962", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "142fb9e8eca49fa3344273facc0b4962");
            } else {
                try {
                    com.meituan.mmp.lib.mp.a e = com.meituan.mmp.lib.mp.a.e();
                    if (e == null) {
                        com.meituan.mmp.lib.trace.b.d("WebViewDirectoryFixer", "currentProcess is null");
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        switch (c.AnonymousClass1.a[e.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                String d = com.meituan.mmp.lib.mp.a.d();
                                if (TextUtils.isEmpty(d)) {
                                    d = String.valueOf(Process.myPid());
                                }
                                if (!c && (a2 = j.a()) != null) {
                                    a2.a().a(d);
                                    break;
                                }
                                break;
                        }
                    }
                } catch (Throwable th) {
                    com.meituan.mmp.lib.trace.b.d("WebViewDirectoryFixer", th.toString());
                }
            }
        }
        ab.a("new WebView");
        this.f.e.b.b("page.webview.init");
        try {
            if (c() && d()) {
                aVar = a.MT_WEB_VIEW;
                bVar = new com.meituan.mmp.lib.page.view.c(context, this.f.d, this.f.o);
            } else {
                if (a()) {
                    this.e = j.a();
                    if (this.e != null) {
                        com.meituan.mmp.lib.web.c a3 = this.e.a();
                        if (a3 != null) {
                            aVar2 = a.X5;
                            bVar2 = a3.a(context, this.f.d, this.f.o);
                        } else {
                            bVar2 = null;
                            aVar2 = null;
                        }
                        a aVar3 = aVar2;
                        bVar = bVar2;
                        aVar = aVar3;
                    } else if (d()) {
                        aVar = a.MT_WEB_VIEW;
                        bVar = new com.meituan.mmp.lib.page.view.c(context, this.f.d, this.f.o);
                    }
                }
                aVar = null;
                bVar = null;
            }
            if (bVar == null) {
                com.meituan.mmp.lib.web.a.a(context);
                aVar = a.CHROME;
                bVar = new com.meituan.mmp.lib.page.view.d(context, this.f.d, this.f.o);
            }
            com.meituan.mmp.lib.page.view.b bVar3 = bVar;
            this.f.e.b.a("page.webview.init");
            ab.a();
            if (DebugHelper.c()) {
                if (aVar == a.MT_WEB_VIEW) {
                    MTWebView.setWebContentsDebuggingEnabled(true);
                } else if (aVar == a.CHROME) {
                    WebView.setWebContentsDebuggingEnabled(true);
                }
            }
            if (!this.g) {
                w.a().e.a("native_webview_init_end");
            }
            if (!this.h.get(aVar).booleanValue()) {
                com.meituan.mmp.lib.mp.a e2 = com.meituan.mmp.lib.mp.a.e();
                com.meituan.mmp.lib.trace.h hVar = this.f.e;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                String b2 = e2 == null ? "" : e2.b();
                String aVar4 = aVar.toString();
                Long valueOf = Long.valueOf(bVar3 == null ? -1L : bVar3.getWebViewInitializationDuration());
                Boolean valueOf2 = Boolean.valueOf(this.j);
                Boolean valueOf3 = Boolean.valueOf(!com.meituan.mmp.a.d.c());
                Boolean valueOf4 = Boolean.valueOf(com.meituan.mmp.a.b.a());
                Boolean valueOf5 = Boolean.valueOf(!i.get(aVar).booleanValue());
                Boolean valueOf6 = Boolean.valueOf(!this.g);
                Object[] objArr3 = {"process", b2, "webViewType", aVar4, "realInitDuration", valueOf, "isMtWebViewReady", valueOf2, "isPreload", valueOf3, "appForeground", valueOf4, "firstInit", valueOf5, "isFirstWebViewCreated", valueOf6};
                ChangeQuickRedirect changeQuickRedirect3 = v.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ad815755fc3c864371325d02b1895c59", RobustBitConfig.DEFAULT_VALUE)) {
                    hashMap = (HashMap) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ad815755fc3c864371325d02b1895c59");
                } else {
                    HashMap a4 = v.a("process", b2, "webViewType", aVar4, "realInitDuration", valueOf, "isMtWebViewReady", valueOf2, "isPreload", valueOf3, "appForeground", valueOf4, "firstInit", valueOf5);
                    a4.put("isFirstWebViewCreated", valueOf6);
                    hashMap = a4;
                }
                hVar.a("mmp.launch.duration.webview.init", elapsedRealtime2, hashMap);
            }
            this.g = true;
            this.h.put(aVar, Boolean.TRUE);
            i.put(aVar, Boolean.TRUE);
            if (TextUtils.isEmpty(com.meituan.mmp.lib.config.a.b)) {
                String userAgentString = bVar3.getUserAgentString();
                Object[] objArr4 = {userAgentString};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8c37a2d7ea3b073b38b35a36c5467be5", RobustBitConfig.DEFAULT_VALUE)) {
                    sb = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8c37a2d7ea3b073b38b35a36c5467be5");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(userAgentString);
                    sb2.append(" MicroMessenger/6.5.7  miniprogram");
                    sb2.append(" MMP/1.24");
                    sb2.append(".0.4.231.7-wm");
                    IEnvInfo envInfo = MMPEnvHelper.getEnvInfo();
                    sb2.append(Constants.SPACE);
                    sb2.append(envInfo.getAppCode());
                    sb2.append('/');
                    sb2.append(envInfo.getAppVersionName());
                    Pair<String, String> customUA = MMPEnvHelper.getCustomUA();
                    if (customUA != null) {
                        sb2.append(StringUtil.SPACE);
                        sb2.append((String) customUA.first);
                        sb2.append("/");
                        sb2.append((String) customUA.second);
                    }
                    sb = sb2.toString();
                }
                com.meituan.mmp.lib.config.a.b = sb;
            }
            if (TextUtils.isEmpty(com.meituan.mmp.lib.config.a.d)) {
                String userAgentString2 = bVar3.getUserAgentString();
                Object[] objArr5 = {userAgentString2, aVar};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "390fcc1a3d2cf2957b18fc8ff478fd46", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "390fcc1a3d2cf2957b18fc8ff478fd46");
                } else if (aVar != a.X5 || this.e == null) {
                    Object[] objArr6 = {userAgentString2, "chrome"};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8845e69d3e34bb2bb6615ac6dc302328", RobustBitConfig.DEFAULT_VALUE)) {
                        str = (String) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8845e69d3e34bb2bb6615ac6dc302328");
                    } else {
                        if (!TextUtils.isEmpty(userAgentString2) && (indexOf = userAgentString2.toLowerCase().indexOf("chrome")) != -1) {
                            String substring = userAgentString2.substring(indexOf);
                            int indexOf2 = substring.indexOf(32);
                            if (indexOf2 == -1) {
                                indexOf2 = substring.length();
                            }
                            String[] split = substring.substring(0, indexOf2).split("/");
                            if (split.length >= 2) {
                                str = split[1];
                            }
                        }
                        str = null;
                    }
                } else {
                    str = this.e.a().a(MMPEnvHelper.getContext());
                }
                com.meituan.mmp.lib.config.a.d = str;
            }
            if (com.meituan.mmp.lib.config.a.c != null) {
                com.meituan.mmp.lib.config.a.c = aVar;
            }
            bVar3.setUserAgentString(com.meituan.mmp.lib.config.a.b);
            return bVar3;
        } catch (Throwable th2) {
            MMPEnvHelper.getSniffer().a("WebViewInitError", th2.getMessage(), com.meituan.mmp.lib.trace.b.b(th2), null);
            Object[] objArr7 = {context};
            ChangeQuickRedirect changeQuickRedirect7 = s.a;
            if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "04322c6678bfc26d0520bdcd958a318b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "04322c6678bfc26d0520bdcd958a318b");
            } else {
                MMPEnvHelper.getSharedPreferences(context.getApplicationContext(), "mmp_recent_app").edit().putBoolean("mmp_webview_init_error", true).apply();
            }
            com.meituan.mmp.lib.trace.b.a(th2);
            throw th2;
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2eecba1a17013606963f478490455cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2eecba1a17013606963f478490455cc")).booleanValue();
        }
        if (!this.j) {
            if (b.C()) {
                this.j = l.g();
            } else {
                this.j = true;
            }
        }
        return this.j;
    }

    public final void b(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1afc91f91c7eb4cc738447101760c0db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1afc91f91c7eb4cc738447101760c0db");
        } else if (this.g) {
        } else {
            com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.config.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57abe368090cd6686705ed315112e1ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57abe368090cd6686705ed315112e1ad");
                    } else if (!f.this.g && f.this.d == null) {
                        ab.a("cacheOneWebView");
                        try {
                            f.this.d = f.this.a(context);
                        } catch (Exception unused) {
                        }
                        ab.a();
                    }
                }
            });
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86fec7e22582ab311adcb66b70be0e9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86fec7e22582ab311adcb66b70be0e9a");
        } else if (a(this.d, view)) {
            this.d = null;
        }
    }

    public static boolean a(com.meituan.mmp.lib.page.view.b bVar, View view) {
        Object[] objArr = {bVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b059a32f71d526c7b60f1db5cef2f6be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b059a32f71d526c7b60f1db5cef2f6be")).booleanValue();
        }
        if (bVar == null || bVar.getWebView() != view) {
            return false;
        }
        bVar.a();
        b.a.a("releaseIWebViewIfWebViewCrashed iWebView: " + bVar + ", view: " + view);
        return true;
    }
}
