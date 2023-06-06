package com.meituan.crashreporter;

import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.kitefly.CatchException;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.helpers.UrlFactory;
import com.meituan.android.common.metricx.task.ThreadManager;
import com.meituan.android.common.metricx.utils.CompressUtil;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.m;
import com.meituan.snare.s;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e {
    public static ChangeQuickRedirect a = null;
    private static e d = null;
    private static volatile boolean f = false;
    private static volatile String i;
    boolean b;
    com.meituan.crashreporter.crash.b c;
    private final UrlFactory.MetricxUrl e;
    private HashMap<String, Boolean> g;
    private CatchException h;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static /* synthetic */ void b(com.meituan.crashreporter.e r49) {
        /*
            Method dump skipped, instructions count: 2214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.crashreporter.e.b(com.meituan.crashreporter.e):void");
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00ebcf1afc1b0f17690afc3ea760b4e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00ebcf1afc1b0f17690afc3ea760b4e4");
            return;
        }
        this.g = new HashMap<>();
        this.h = new CatchException("crashReportManager", 1, LocationStrategy.LOCATION_TIMEOUT);
        this.e = UrlFactory.getInstance().createUrl("c1.d.zservey.com/perf/crash/", "c1.d.meituan.net/perf/crash/");
        AppBus.getInstance().register(new AppBus.OnBackgroundListener() { // from class: com.meituan.crashreporter.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
            public final void onBackground() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03913b5ee0e2a08e161dc765716c98ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03913b5ee0e2a08e161dc765716c98ee");
                } else {
                    e.this.b();
                }
            }
        }, false);
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1dc16bed8186bb9987ac238196b2868", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1dc16bed8186bb9987ac238196b2868");
        }
        if (d == null) {
            synchronized (e.class) {
                if (d == null) {
                    d = new e();
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e8a898ea14522a3032505e7a6c17f2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e8a898ea14522a3032505e7a6c17f2c");
        } else {
            ThreadManager.getInstance().postNet(new com.meituan.crashreporter.thread.a() { // from class: com.meituan.crashreporter.e.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.crashreporter.thread.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1bf6fcd0cb4928d4f88fcf07053c116f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1bf6fcd0cb4928d4f88fcf07053c116f");
                    } else {
                        e.b(e.this);
                    }
                }
            });
        }
    }

    private void a(JSONObject jSONObject, String str, Object obj) {
        Object[] objArr = {jSONObject, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f31bfe3a4255aee84df8aea393331c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f31bfe3a4255aee84df8aea393331c3");
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (Throwable th) {
            this.h.reportException(th);
        }
    }

    private String a(s sVar) {
        Map<String, String> map;
        String[] split;
        String[] split2;
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d925f3d16516077dbaa78d10451d9d19", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d925f3d16516077dbaa78d10451d9d19");
        }
        StringBuilder sb = new StringBuilder();
        String b = sVar.b();
        if (TextUtils.isEmpty(b)) {
            sb.append(sVar.d());
            sb.append("\n");
        }
        sb.append(b);
        sb.append("\n");
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = s.a;
            if (PatchProxy.isSupport(objArr2, sVar, changeQuickRedirect2, false, "88d4374127c2917c824a71ec1b97f376", RobustBitConfig.DEFAULT_VALUE)) {
                map = (Map) PatchProxy.accessDispatch(objArr2, sVar, changeQuickRedirect2, false, "88d4374127c2917c824a71ec1b97f376");
            } else {
                sVar.f();
                map = sVar.d;
            }
            if (map != null) {
                String str = map.get("Java stacktrace");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append("\n");
                } else {
                    String str2 = map.get("Java stacktrace from native");
                    if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2.trim(), "(no managed stack frames)")) {
                        sb.append(str2);
                        sb.append("\n");
                    }
                }
                sb.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                sb.append("Other Info:\n");
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String value = entry.getValue();
                    if (value.contains("\n")) {
                        sb.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                        sb.append(entry.getKey());
                        sb.append(":\n");
                        for (String str3 : value.split("\n")) {
                            sb.append("\t");
                            sb.append(str3);
                            sb.append("\n");
                        }
                    } else {
                        sb.append("\t");
                        sb.append(entry.getKey());
                        sb.append(CommonConstant.Symbol.COLON);
                        sb.append(value);
                        sb.append("\n");
                    }
                }
            }
            JSONObject c = sVar.c();
            if (c != null) {
                sb.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                sb.append("User extra:\n");
                Iterator<String> keys = c.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = c.optString(next, "unknown");
                    if (optString.contains("\n")) {
                        sb.append("\n");
                        sb.append(next);
                        sb.append(":\n");
                        for (String str4 : optString.split("\n")) {
                            sb.append("\t");
                            sb.append(str4);
                            sb.append("\n");
                        }
                    } else {
                        sb.append("\t");
                        sb.append(next);
                        sb.append(CommonConstant.Symbol.COLON);
                        sb.append(optString);
                        sb.append("\n");
                    }
                }
            }
        } catch (Throwable th) {
            this.h.reportException(th);
        }
        return sb.toString();
    }

    private void a(JSONObject jSONObject, String str, s sVar) {
        Object[] objArr = {jSONObject, str, sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "507523c9adc87d8e15a4b6eecb538711", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "507523c9adc87d8e15a4b6eecb538711");
            return;
        }
        g.a().a("crashParseCount", sVar, str);
        if (jSONObject == null) {
            return;
        }
        String jSONObject2 = jSONObject.toString();
        if (TextUtils.isEmpty(jSONObject2)) {
            g.a().a("internalErrorCount", sVar, str);
        } else if (str != null && this.g.get(str) != null) {
            g.a().a("crashRepeatCount", sVar, str);
            m.a().a(sVar);
        } else {
            OutputStream outputStream = null;
            b d2 = c.d();
            try {
                StringBuilder sb = new StringBuilder();
                if (c.b) {
                    sb.append(AbsApiFactory.HTTP);
                } else {
                    sb.append(AbsApiFactory.HTTPS);
                }
                sb.append(this.e.getUrl());
                HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(sb.toString()).openConnection());
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON);
                httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    CompressUtil.stringToGzipData(jSONObject2, outputStream2);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        if (str != null) {
                            PrintStream printStream = System.out;
                            printStream.println("Crash report success: " + str);
                            this.g.put(str, Boolean.TRUE);
                        }
                        g.a().a("crashReportCount", sVar, str);
                        if (d2 != null) {
                            d2.a(jSONObject);
                        }
                        m.a().a(sVar);
                    } else if (responseCode == 413) {
                        g.a().a("net413Count", sVar, str, jSONObject2.substring(0, Math.min(10000, jSONObject2.length())));
                    } else {
                        g.a().a("netErrorCount", sVar, str);
                    }
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    try {
                        Logger.getMetricsLogger().d("Crash report failed: ", th);
                        g.a().a("netErrorCount", sVar, str);
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                    } catch (Throwable th2) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0efdbb6dd15056dc2e6b6e0d74ad70c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0efdbb6dd15056dc2e6b6e0d74ad70c");
        } else if (f) {
        } else {
            q a2 = q.a(ContextProvider.getInstance().getContext(), "metrics_crashreporter_dfpId", 2);
            c.c().a();
            if (!TextUtils.isEmpty("")) {
                i = "";
                f = true;
                a2.a("metrics_crashreporter_dfpId", "");
            } else if (TextUtils.isEmpty(i)) {
                i = a2.b("metrics_crashreporter_dfpId", "");
            }
        }
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb14e0827f56e3cd7ffd54c55d2515e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb14e0827f56e3cd7ffd54c55d2515e4");
        }
        if (!f) {
            d();
        }
        return i;
    }
}
