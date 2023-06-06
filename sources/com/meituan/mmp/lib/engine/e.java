package com.meituan.mmp.lib.engine;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.dio.easy.DioFile;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.device.SystemInfoModule;
import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.lib.msi.h;
import com.meituan.mmp.lib.service.IServiceEngine;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.update.PackageManageUtil;
import com.meituan.mmp.lib.utils.ac;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements com.meituan.mmp.lib.interfaces.a, com.meituan.mmp.lib.interfaces.b, Thread.UncaughtExceptionHandler {
    public static ChangeQuickRedirect a;
    public final m b;
    public IServiceEngine c;
    com.meituan.mmp.lib.api.h d;
    public final List<String> e;
    final List<MMPPackageInfo> f;
    long g;
    public h.b h;
    private final Context i;
    private final com.meituan.mmp.lib.interfaces.c j;
    private volatile MMPPackageInfo k;
    private volatile boolean l;
    private com.meituan.mmp.lib.web.f m;
    private final List<Event> n;
    private final List<com.meituan.mmp.lib.preformance.c> o;
    private boolean p;

    public static /* synthetic */ void a(e eVar, long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "4f0f453675ce5119258f5f19bcf3a7dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "4f0f453675ce5119258f5f19bcf3a7dc");
        } else {
            eVar.o.add(new com.meituan.mmp.lib.preformance.c().a("script").a(j).b("evaluateScript").b(System.currentTimeMillis()));
        }
    }

    public e(m mVar, com.meituan.mmp.lib.interfaces.c cVar, com.meituan.mmp.lib.web.f fVar) {
        Object[] objArr = {mVar, cVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d486c082018d45ba217e8ffe09b4665", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d486c082018d45ba217e8ffe09b4665");
            return;
        }
        this.e = new CopyOnWriteArrayList();
        this.f = new CopyOnWriteArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.g = -1L;
        this.i = MMPEnvHelper.getContext();
        this.b = mVar;
        this.j = cVar;
        this.m = fVar;
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "819446ff7fe4475bcf4ab63f88019444", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "819446ff7fe4475bcf4ab63f88019444");
            } else {
                if (!MMPEnvHelper.getEnvInfo().isProdEnv()) {
                    DebugHelper.a();
                    if (DebugHelper.d()) {
                        MMPEnvHelper.setCustomServiceEngineClazz(com.meituan.mmp.lib.service.e.class);
                    }
                }
                this.c = MMPEnvHelper.getCustomServiceEngineClazz().newInstance();
            }
            this.c.setJsHandler(this);
            this.h = com.meituan.mmp.lib.msi.h.b();
            com.meituan.mmp.lib.msi.h.a(this.h, "inject");
            if (this.h != null) {
                this.c.setSupportMsiApis(this.h.a(), this.h.e());
            }
            this.c.setOnJsUncaughtErrorHandler(this);
            this.c.setOnEngineInitFailedListener(fVar);
            if (MMPEnvHelper.isInited() && !MMPEnvHelper.getEnvInfo().isProdEnv()) {
                com.meituan.mmp.lib.devtools.i b = com.meituan.mmp.lib.devtools.a.b();
                if (DebugHelper.b() && DebugHelper.e() && b != null && (this.c instanceof com.meituan.mmp.lib.devtools.d)) {
                    ((com.meituan.mmp.lib.devtools.d) this.c).a(b.a());
                }
            }
            this.c.setReporter(this.b.e);
            this.c.setMiniApp(mVar);
            this.c.launch(this.i);
            try {
                JSONObject jSONObject = new JSONObject();
                SystemInfoModule.b(jSONObject);
                a("__systemInfo", jSONObject.toString());
                com.meituan.mmp.lib.trace.b.a("AppService", "injectGlobalField", mVar.b, o.d(mVar.b));
                if (o.e(mVar.b)) {
                    a("__mtPreloadStrategy", CommonConstant.Symbol.SINGLE_QUOTES + o.d(mVar.b) + CommonConstant.Symbol.SINGLE_QUOTES);
                }
            } catch (JSONException e) {
                com.meituan.mmp.lib.trace.b.a("AppService", e);
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "db31e5b502798497655daf09660f9d66", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "db31e5b502798497655daf09660f9d66");
            } else if (com.meituan.mmp.lib.devtools.automator.a.a() != null) {
                new Object() { // from class: com.meituan.mmp.lib.engine.e.1
                };
            }
        } catch (Exception e2) {
            com.meituan.mmp.lib.trace.b.a("AppService", "AppService exception exit", e2);
        }
    }

    public final void a(final MMPPackageInfo mMPPackageInfo, final n nVar) {
        Object[] objArr = {mMPPackageInfo, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7750c3faaa5ca7d2fc09c38149495a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7750c3faaa5ca7d2fc09c38149495a7");
        } else if (this.e.contains(mMPPackageInfo.f)) {
            com.meituan.mmp.lib.trace.b.a("AppService#loadServicePackage already exist", mMPPackageInfo);
            if (nVar != null) {
                nVar.a(mMPPackageInfo, false);
            }
        } else {
            com.meituan.mmp.lib.trace.b.a("AppService#loadServicePackage", mMPPackageInfo);
            this.e.add(mMPPackageInfo.f);
            this.f.add(mMPPackageInfo);
            if (mMPPackageInfo.d()) {
                this.k = mMPPackageInfo;
                com.meituan.mmp.lib.w.a().e.a("service_runtime_load_begin");
            } else if (mMPPackageInfo.e()) {
                com.meituan.mmp.lib.w.a().e.a("service_mainpkg_load_begin");
            }
            DioFile g = mMPPackageInfo.g(this.i);
            if (g.c()) {
                String b = mMPPackageInfo.b(this.i);
                final String g2 = g.g();
                final String substring = g2.startsWith(b) ? g2.substring(b.length()) : g2;
                com.meituan.mmp.lib.trace.h hVar = this.b.e;
                hVar.a("loadPackage: " + substring);
                final long currentTimeMillis = System.currentTimeMillis();
                this.c.evaluateJsFile(g, new v() { // from class: com.meituan.mmp.lib.engine.e.2
                    public static ChangeQuickRedirect a;

                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(String str) {
                        Object[] objArr2 = {str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d55df5eadca00075baabfc90229b84c1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d55df5eadca00075baabfc90229b84c1");
                            return;
                        }
                        if (nVar != null) {
                            nVar.a(mMPPackageInfo, true);
                        }
                        com.meituan.mmp.lib.trace.h hVar2 = e.this.b.e;
                        hVar2.d("loadPackage: " + substring);
                        if (!mMPPackageInfo.d()) {
                            e.a(e.this, currentTimeMillis);
                        }
                        com.meituan.mmp.lib.trace.b.a("AppService#loadServicePackageSuccess", mMPPackageInfo);
                        PackageManageUtil.a(mMPPackageInfo);
                    }

                    @Override // com.meituan.mmp.lib.engine.v
                    public final void a(Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c884f6e1f0d50e52649859001fc405ea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c884f6e1f0d50e52649859001fc405ea");
                            return;
                        }
                        if (exc instanceof IOException) {
                            com.meituan.mmp.lib.utils.s.a(null, g2, exc, null, e.this.b.b);
                        }
                        if (nVar != null) {
                            nVar.a(mMPPackageInfo, exc);
                        }
                        com.meituan.mmp.lib.trace.h hVar2 = e.this.b.e;
                        hVar2.d("loadPackage: " + substring);
                        e.this.e.remove(mMPPackageInfo.f);
                        e.this.f.remove(mMPPackageInfo);
                        com.meituan.mmp.lib.trace.b.a("AppService#loadServicePackageError", exc, mMPPackageInfo);
                        MMPEnvHelper.getSniffer().a("MMPLoadPackageError", mMPPackageInfo.h, mMPPackageInfo.toString(), exc != null ? exc.getMessage() : null);
                    }
                });
                return;
            }
            com.meituan.mmp.lib.trace.b.a("AppService#loadServicePackage Error!", "serviceFile not exist!", mMPPackageInfo);
            mMPPackageInfo.e(this.i);
            if (nVar != null) {
                nVar.a(mMPPackageInfo, new RuntimeException("AppService#loadServicePackage serviceFile not exist" + mMPPackageInfo));
            }
        }
    }

    @Override // com.meituan.mmp.lib.interfaces.b
    public final void b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "686ebc939f2f6b1ca57f97ad6bdd00bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "686ebc939f2f6b1ca57f97ad6bdd00bc");
        } else if ("custom_event_serviceReady".equals(str)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32c8e9866fcad4789907f742264a539d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32c8e9866fcad4789907f742264a539d");
                return;
            }
            com.meituan.mmp.lib.w.a().c.d(this.b.b);
            this.l = true;
            this.b.f.c();
            b();
        } else if ("custom_event_runtimeLaunch".equals(str)) {
            com.meituan.mmp.lib.w.a().c.c(this.b.b);
        } else if ("custom_event_appDataChange".equals(str)) {
            d(str, str2, str3);
        } else if ("custom_event_H5_LOG_MSG".equals(str)) {
            com.meituan.mmp.lib.trace.b.c(str2);
        } else if (str.contains("custom_event_canvas")) {
            d(str, str2, str3);
        } else if ("custom_event_H5_ERROR_MSG".equals(str)) {
            Object[] objArr3 = {str2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "09ea82b718910ecf6c214b19ad108870", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "09ea82b718910ecf6c214b19ad108870");
            } else if (this.j != null) {
                this.j.a(str2, "service");
            }
        } else if (!str.equals("custom_event_first_screen")) {
            if (str.equals("custom_event_metrics")) {
                b(str2);
            } else {
                d(str, str2, str3);
            }
        } else {
            Object[] objArr4 = {str2, str3};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f1b0320395f0d8fd02104e12e35b91a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f1b0320395f0d8fd02104e12e35b91a7");
            } else if (this.j == null || str2 == null) {
            } else {
                try {
                    long optLong = new JSONObject(str2).optLong("fst");
                    if (optLong != 0) {
                        a aVar = this.b.f;
                        Object[] objArr5 = {new Long(optLong), str3};
                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "317d10d5ce69d7797468bbd4b5d459c2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "317d10d5ce69d7797468bbd4b5d459c2");
                        } else if (aVar.b.r == null) {
                            com.meituan.mmp.lib.trace.b.a("AppEngine", "onPageFirstScreen: currActivity is null.", Long.valueOf(optLong), str3);
                        } else {
                            com.meituan.mmp.lib.a aVar2 = aVar.b.r;
                            Object[] objArr6 = {new Long(optLong), str3};
                            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.mmp.lib.a.a;
                            if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "edc3abbb200dc45efa87249598af725a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "edc3abbb200dc45efa87249598af725a");
                            }
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.meituan.mmp.lib.interfaces.b
    public final String c(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec5a5b947a13d2ad5e4423e16a89e982", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec5a5b947a13d2ad5e4423e16a89e982");
        }
        Event event = new Event(str, str2, str3);
        if (this.d != null) {
            return this.d.a(event, this);
        }
        String str4 = "invoke " + str + " not allowed, Service not attached to an Activity";
        com.meituan.mmp.lib.trace.b.c("AppService", str4);
        com.meituan.mmp.lib.api.j a2 = com.meituan.mmp.lib.api.a.a(event, this);
        a2.onFail(AbsApi.codeJson(-2, str4));
        return a2.c;
    }

    @Override // com.meituan.mmp.lib.interfaces.b
    public final String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd919a6ca48a600c16bbcc86b6e6fad4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd919a6ca48a600c16bbcc86b6e6fad4");
        }
        if (this.d != null) {
            return this.d.a(str);
        }
        return null;
    }

    @Override // com.meituan.mmp.lib.interfaces.b
    public final String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5939b254b0adab18f16fea4a9d94529a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5939b254b0adab18f16fea4a9d94529a");
        }
        if (this.d != null) {
            return this.d.a(str, this);
        }
        return null;
    }

    @Override // com.meituan.mmp.lib.interfaces.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54a2c92337c7030291b278b7e5004f56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54a2c92337c7030291b278b7e5004f56");
            return;
        }
        IServiceEngine iServiceEngine = this.c;
        iServiceEngine.evaluateJavascript("msi_invokeCallback", "javascript:MMPBridge && MMPBridge.invokeBack && MMPBridge.invokeBack(" + str + CommonConstant.Symbol.BRACKET_RIGHT, null);
    }

    @Override // com.meituan.mmp.lib.interfaces.b
    public final String a(String[] strArr, String str) {
        Object[] objArr = {strArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd4ac65bc23f729de157bd8a11f71ae0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd4ac65bc23f729de157bd8a11f71ae0") : com.meituan.mmp.lib.service.d.a(strArr, str, this.b.d, this.c);
    }

    @Override // com.meituan.mmp.lib.interfaces.a
    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf4c88cd3e6b7a31cc4a953250ef01fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf4c88cd3e6b7a31cc4a953250ef01fb");
            return;
        }
        this.c.evaluateJavascript("callback: " + str, "javascript:ServiceJSBridge.invokeCallbackHandler('" + str2 + "'," + str3 + CommonConstant.Symbol.BRACKET_RIGHT, null);
    }

    private void d(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "689a3114bb484ba17666a8c98c434ec1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "689a3114bb484ba17666a8c98c434ec1");
            return;
        }
        if (!this.p) {
            this.p = true;
            com.meituan.mmp.lib.w.a().e.a("native_received_first_data_from_service");
        }
        if (this.j != null) {
            this.j.a(str, str2, ac.a(str3));
        }
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cd8f847ae3367b800efbb51af76d025", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cd8f847ae3367b800efbb51af76d025");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                com.meituan.mmp.lib.w.a().e.a(next, jSONObject.getLong(next));
            }
        } catch (JSONException e) {
            com.meituan.mmp.lib.trace.b.a(e);
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33efa9a1de8e5959f99c8328afe29476", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33efa9a1de8e5959f99c8328afe29476");
            return;
        }
        IServiceEngine iServiceEngine = this.c;
        iServiceEngine.evaluateJavascript("inject: " + str, String.format("%s=%s", str, str2), null);
    }

    public final void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f6a3409a7513bfed81e956d56646906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f6a3409a7513bfed81e956d56646906");
        } else if (!this.l) {
            synchronized (this.n) {
                this.n.add(new Event(str, str2, String.valueOf(i)));
            }
        } else {
            if (TextUtils.isEmpty(str2)) {
                str2 = "{}";
            }
            if (TextUtils.equals(str, "onPerformanceDataChange")) {
                str2 = e(str2);
            }
            String str3 = "javascript:ServiceJSBridge.subscribeHandler('" + str + "'," + str2 + ",[" + i + "])";
            this.c.evaluateJavascript("event: " + str, str3, null);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
        Object[] objArr = {thread, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec6eb8603d4da31508ae242630d966a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec6eb8603d4da31508ae242630d966a8");
            return;
        }
        th.printStackTrace();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        com.meituan.mmp.lib.trace.b.d("JSThread error", stringWriter2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", th.getMessage());
            jSONObject.put("nativeStack", stringWriter2);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        String str = "uncaught";
        if (!TextUtils.isEmpty(stringWriter2) && stringWriter2.contains("FatalError")) {
            str = "fatal";
            this.b.e.b("mmp.stability.fatal.error", (Map<String, Object>) com.meituan.mmp.lib.utils.v.a("message", stringWriter2));
        }
        if (this.j != null) {
            com.meituan.mmp.lib.interfaces.c cVar = this.j;
            if (jSONObject != null) {
                stringWriter2 = jSONObject.toString();
            }
            cVar.a(stringWriter2, str);
        } else if (str.equals("fatal")) {
            this.m.a(new Exception(stringWriter2));
            PackageManageUtil.a(this.b.c, this.b.b, null);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5beec46ee1f5e9bc442bbe125c3861d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5beec46ee1f5e9bc442bbe125c3861d");
            return;
        }
        synchronized (this.n) {
            if (!this.n.isEmpty()) {
                for (Event event : this.n) {
                    try {
                        a(event.b, event.c, Integer.parseInt(event.d));
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                this.n.clear();
            }
        }
    }

    private String e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49df0d763b39f7e5788d60275fdc3392", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49df0d763b39f7e5788d60275fdc3392");
        }
        try {
            if (this.o.size() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONArray optJSONArray = jSONObject.optJSONArray(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST);
                    if (optJSONArray != null) {
                        Iterator<com.meituan.mmp.lib.preformance.c> it = this.o.iterator();
                        while (it.hasNext()) {
                            optJSONArray.put(it.next());
                            it.remove();
                        }
                        jSONObject.put(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, optJSONArray);
                        return jSONObject.toString();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return str;
        } finally {
            this.o.clear();
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e066d33213bbcdcf39094f47e8b9a17c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e066d33213bbcdcf39094f47e8b9a17c")).booleanValue() : com.meituan.mmp.lib.msi.h.a(this.h);
    }
}
