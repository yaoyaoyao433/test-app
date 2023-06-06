package com.meituan.msc.modules.page.render.webview;

import android.arch.lifecycle.d;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.meituan.metrics.common.Constants;
import com.meituan.msc.common.config.MSCRenderConfig;
import com.meituan.msc.common.process.c;
import com.meituan.msc.common.utils.t;
import com.meituan.msc.extern.IEnvInfo;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.container.a;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.reporter.MSCReporter;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o {
    public static ChangeQuickRedirect a;
    c b;
    public boolean c;
    private final com.meituan.msc.modules.engine.h d;
    private boolean e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum b {
        CHROME,
        MT_WEB_VIEW,
        X5;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "677b8618d350ccf038551c2837375fcb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "677b8618d350ccf038551c2837375fcb");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef7dc9545bfc0ee3290ea7bc4fbfef71", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef7dc9545bfc0ee3290ea7bc4fbfef71") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5be616b70f031f3f7aeedaf76e9444b", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5be616b70f031f3f7aeedaf76e9444b") : (b[]) values().clone();
        }
    }

    public o(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55fdd677f394ef5cff538b03a9f48db4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55fdd677f394ef5cff538b03a9f48db4");
        } else {
            this.d = hVar;
        }
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3e34b92530f155dd8779a44a3416814", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3e34b92530f155dd8779a44a3416814")).booleanValue() : !com.meituan.msc.common.process.a.f() && com.meituan.msc.common.config.b.b(str);
    }

    public final boolean a() {
        Boolean c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48703cd63be072e25b2756f9a02c48ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48703cd63be072e25b2756f9a02c48ac")).booleanValue();
        }
        if (DebugHelper.a() && (c = DebugHelper.c()) != null) {
            return c.booleanValue();
        }
        return a(this.d.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c a(Context context) throws Exception {
        boolean z;
        boolean z2;
        b bVar;
        c cVar;
        String str;
        String str2;
        String str3;
        int indexOf;
        String sb;
        String str4;
        HashMap hashMap;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d5ac0506e92a6cd47f6832a4ce792b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d5ac0506e92a6cd47f6832a4ce792b1");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.c) {
            com.meituan.msc.common.framework.c.a().e.a("native_webview_init_begin");
            Object[] objArr2 = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.common.process.c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8deb67582d35598dd219ccb63711ff27", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8deb67582d35598dd219ccb63711ff27");
            } else {
                try {
                    com.meituan.msc.common.process.a e = com.meituan.msc.common.process.a.e();
                    if (e == null) {
                        com.meituan.msc.modules.reporter.g.a("WebViewDirectoryFixer", "currentProcess is null");
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        switch (c.AnonymousClass1.a[e.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                if (TextUtils.isEmpty(com.meituan.msc.common.process.a.d())) {
                                    String.valueOf(Process.myPid());
                                    break;
                                }
                                break;
                        }
                    }
                } catch (Throwable th) {
                    com.meituan.msc.modules.reporter.g.a("WebViewDirectoryFixer", th.toString());
                }
            }
        }
        com.meituan.msc.modules.engine.h hVar = this.d;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.engine.h.a;
        if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "67c966275cbe0464cb7ff9d40ce83a31", RobustBitConfig.DEFAULT_VALUE)) {
            com.meituan.msc.modules.engine.e eVar = (com.meituan.msc.modules.engine.e) PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "67c966275cbe0464cb7ff9d40ce83a31");
        } else if (hVar.d == null) {
            throw new com.meituan.msc.modules.manager.p("msc app not started");
        } else {
            com.meituan.msc.modules.engine.e eVar2 = hVar.d;
        }
        try {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fcbfcc79a7bce5eceae7ebceb992e03c", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fcbfcc79a7bce5eceae7ebceb992e03c")).booleanValue();
            } else {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3402bab439e09c03b20fcad646fc091c", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3402bab439e09c03b20fcad646fc091c")).booleanValue();
                } else {
                    if (!this.e) {
                        if (com.meituan.msc.common.config.b.p()) {
                            this.e = com.meituan.mtwebkit.internal.l.g();
                        } else {
                            this.e = true;
                        }
                    }
                    z = this.e;
                }
                z2 = z && (a() || Build.VERSION.SDK_INT < 21 || MSCRenderConfig.h());
            }
            if (z2) {
                bVar = b.MT_WEB_VIEW;
                cVar = new com.meituan.msc.modules.page.render.webview.impl.b(context, this.d);
            } else {
                com.meituan.msc.modules.page.render.webview.a.a(context);
                bVar = b.CHROME;
                cVar = new com.meituan.msc.modules.page.render.webview.impl.c(context, this.d);
            }
            c cVar2 = cVar;
            if (DebugHelper.b()) {
                if (bVar == b.MT_WEB_VIEW) {
                    MTWebView.setWebContentsDebuggingEnabled(true);
                } else if (bVar == b.CHROME) {
                    WebView.setWebContentsDebuggingEnabled(true);
                }
            }
            if (this.c) {
                str = null;
            } else {
                com.meituan.msc.common.framework.c.a().e.a("native_webview_init_end");
                com.meituan.msc.common.process.a e2 = com.meituan.msc.common.process.a.e();
                com.meituan.msc.common.report.d b2 = new a().b("msc.launch.duration.webview.init");
                if (e2 == null) {
                    str4 = "";
                } else {
                    str4 = e2.g == null ? "main" : e2.g;
                }
                String str5 = str4;
                String bVar2 = bVar.toString();
                Boolean valueOf = Boolean.valueOf(this.e);
                a.c cVar3 = com.meituan.msc.modules.container.a.c;
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a.c.b;
                Boolean valueOf2 = Boolean.valueOf(!(PatchProxy.isSupport(objArr6, cVar3, changeQuickRedirect6, false, "fd886cf50a3433ecd1834f90dc396947", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr6, cVar3, changeQuickRedirect6, false, "fd886cf50a3433ecd1834f90dc396947")).booleanValue() : cVar3.e.a(d.b.CREATED)));
                Object[] objArr7 = {"process", str5, "webViewType", bVar2, "isMtWebViewReady", valueOf, "isPreload", valueOf2};
                ChangeQuickRedirect changeQuickRedirect7 = t.a;
                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "c82a2ce847178125a76143d8f7cf83bc", RobustBitConfig.DEFAULT_VALUE)) {
                    str = null;
                    hashMap = (HashMap) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "c82a2ce847178125a76143d8f7cf83bc");
                } else {
                    str = null;
                    HashMap a2 = t.a("process", str5, "webViewType", bVar2, "isMtWebViewReady", valueOf);
                    a2.put("isPreload", valueOf2);
                    hashMap = a2;
                }
                b2.a(hashMap).a(SystemClock.elapsedRealtime() - elapsedRealtime).b();
            }
            this.c = true;
            if (TextUtils.isEmpty(com.meituan.msc.modules.update.f.e)) {
                String userAgentString = cVar2.getUserAgentString();
                Object[] objArr8 = {userAgentString};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                str2 = str;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "d0852919fd0f22f348ddc5e9bd670cf5", RobustBitConfig.DEFAULT_VALUE)) {
                    sb = (String) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "d0852919fd0f22f348ddc5e9bd670cf5");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(userAgentString);
                    sb2.append(" MicroMessenger/6.5.7  miniprogram");
                    sb2.append(" MSC/1.0");
                    sb2.append(".1.18.23.2");
                    IEnvInfo envInfo = MSCEnvHelper.getEnvInfo();
                    sb2.append(Constants.SPACE);
                    sb2.append(envInfo.getAppCode());
                    sb2.append('/');
                    sb2.append(envInfo.getAppVersionName());
                    Pair<String, String> customUA = MSCEnvHelper.getCustomUA();
                    if (customUA != null) {
                        sb2.append(StringUtil.SPACE);
                        sb2.append((String) customUA.first);
                        sb2.append("/");
                        sb2.append((String) customUA.second);
                    }
                    sb = sb2.toString();
                }
                com.meituan.msc.modules.update.f.e = sb;
            } else {
                str2 = str;
            }
            if (TextUtils.isEmpty(com.meituan.msc.modules.update.f.b)) {
                String userAgentString2 = cVar2.getUserAgentString();
                Object[] objArr9 = {userAgentString2, bVar};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "e4facb56431ff9fa558bda3e3e73a25a", RobustBitConfig.DEFAULT_VALUE)) {
                    str3 = (String) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "e4facb56431ff9fa558bda3e3e73a25a");
                } else {
                    Object[] objArr10 = {userAgentString2, "chrome"};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "68893eb0e016e2da0c31b8b2b95572c7", RobustBitConfig.DEFAULT_VALUE)) {
                        str3 = (String) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "68893eb0e016e2da0c31b8b2b95572c7");
                    } else {
                        if (!TextUtils.isEmpty(userAgentString2) && (indexOf = userAgentString2.toLowerCase().indexOf("chrome")) != -1) {
                            String substring = userAgentString2.substring(indexOf);
                            int indexOf2 = substring.indexOf(32);
                            if (indexOf2 == -1) {
                                indexOf2 = substring.length();
                            }
                            String[] split = substring.substring(0, indexOf2).split("/");
                            if (split.length >= 2) {
                                str3 = split[1];
                            }
                        }
                        str3 = str2;
                    }
                }
                com.meituan.msc.modules.update.f.b = str3;
            }
            if (com.meituan.msc.modules.update.f.c == null) {
                com.meituan.msc.modules.update.f.c = bVar;
            }
            cVar2.setUserAgentString(com.meituan.msc.modules.update.f.e);
            return cVar2;
        } catch (Exception e3) {
            com.meituan.msc.modules.engine.l.a(context);
            com.meituan.msc.modules.reporter.g.a(e3);
            throw e3;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98e1f606745e73f1fd5cfe6d3dc6c2e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98e1f606745e73f1fd5cfe6d3dc6c2e5");
        } else if (this.b != null) {
            com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.modules.page.render.webview.o.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "218c4377e062d842422b2a401738aef0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "218c4377e062d842422b2a401738aef0");
                    } else if (o.this.b != null) {
                        o.this.b.k();
                        o.this.b = null;
                    }
                }
            });
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e2b50cfdc9583134ce1aeb8c6dfbec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e2b50cfdc9583134ce1aeb8c6dfbec");
        } else if (a(this.b, view)) {
            this.b = null;
        }
    }

    public static boolean a(c cVar, View view) {
        Object[] objArr = {cVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "824c16a9d9cb59e4ed7cff13cf2f6838", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "824c16a9d9cb59e4ed7cff13cf2f6838")).booleanValue();
        }
        if (cVar == null || cVar.getWebView() != view) {
            return false;
        }
        cVar.k();
        com.meituan.msc.modules.reporter.g.b((String) null, "releaseIWebViewIfWebViewCrashed iWebView:", cVar, ", view: ", view);
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends MSCReporter {
        public a() {
            a("sdkVersion", "1.18.23.2");
        }
    }
}
