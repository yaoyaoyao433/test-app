package com.dianping.monitor;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVHttpCon;
import dianping.com.nvlinker.NVLinker;
import dianping.com.nvlinker.stub.IHorn;
import dianping.com.nvlinker.stub.IHornCallback;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static boolean b = true;
    private static boolean c = false;
    private static boolean d = false;
    private static long e = 800;
    private static volatile boolean y;
    private static final AtomicBoolean f = new AtomicBoolean(false);
    private static int g = 1;
    private static boolean h = true;
    private static boolean i = true;
    private static int j = 15;
    private static long k = 15000;
    private static int l = 15;
    private static long m = 15000;
    private static int n = 100;
    private static int o = 30;
    private static long p = 30000;
    private static int q = 15;
    private static long r = 15000;
    private static boolean s = false;
    private static boolean t = false;
    private static boolean u = false;
    private static float v = 0.0f;
    private static float w = 1.0f;
    private static boolean x = false;
    private static volatile List<String> z = new CopyOnWriteArrayList();

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "763a64b3dc5b813bd60b9ea88929032e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "763a64b3dc5b813bd60b9ea88929032e");
        } else if (!f.get() && f.compareAndSet(false, true)) {
            IHorn horn = NVLinker.getHorn();
            if (horn == null) {
                boolean z2 = com.dianping.monitor.impl.a.DEBUG;
                f.set(false);
                return;
            }
            horn.register("NVMonitorConfig", new IHornCallback() { // from class: com.dianping.monitor.b.1
                public static ChangeQuickRedirect a;

                @Override // dianping.com.nvlinker.stub.IHornCallback
                public final void onChanged(boolean z3, String str) {
                    Object[] objArr2 = {Byte.valueOf(z3 ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4cb5e603803a9abc9b055db8619710d3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4cb5e603803a9abc9b055db8619710d3");
                        return;
                    }
                    if (com.dianping.monitor.impl.a.DEBUG) {
                        new StringBuilder("onChange-> NVMonitorConfig enable:").append(z3);
                    }
                    if (z3) {
                        b.c(str);
                    }
                }
            });
            c(horn.accessCache("NVMonitorConfig"));
            u = NVLinker.checkRequestMethodExist("isForceHttpTunnel");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ec39a53e9ad0d3890ef3d6a6ee7915f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ec39a53e9ad0d3890ef3d6a6ee7915f");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                if (com.dianping.monitor.impl.a.DEBUG) {
                    new StringBuilder("updateConfig-> ").append(str);
                }
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.length() == 0) {
                    return;
                }
                b = jSONObject.optBoolean("backgroundCommandBatchEnable", true);
                e = jSONObject.optLong("networkTypeCacheTime", 800L);
                g = jSONObject.optInt("commandBatchSamplingRate", 1);
                c = jSONObject.optBoolean("childProcessCommandEnable", false);
                d = jSONObject.optBoolean("idleSyncUploadEnable", false);
                h = jSONObject.optBoolean("metricNewProtocolEnable", true);
                i = jSONObject.optBoolean("mrnMetricNewProtocolEnable", true);
                j = jSONObject.optInt("metricCumulativeCount", 15);
                k = jSONObject.optLong("metricUploadInterval", 15000L);
                l = jSONObject.optInt("metricMrnCumulativeCount", 15);
                m = jSONObject.optLong("metricMrnUploadInterval", 15000L);
                n = jSONObject.optInt("commandUploadMaxCount", 100);
                o = jSONObject.optInt("commandCumulativeCount", 30);
                p = jSONObject.optLong("commandCumulativeInterval", 30L) * 1000;
                q = jSONObject.optInt("backgroundCumulativeCount", 15);
                r = jSONObject.optLong("backgroundCumulativeInterval", 15L) * 1000;
                s = jSONObject.optBoolean("http2Enabled", s);
                t = jSONObject.optBoolean("uploadTunnelOverShark", false);
                v = (float) jSONObject.optDouble("selfMetricSamplingRate", 0.0d);
                x = jSONObject.optBoolean("checkPrivacyData", false);
                w = (float) jSONObject.optDouble("privacyMetricSamplingRate", 1.0d);
                if (n < o) {
                    n = o;
                }
                if (jSONObject.has("multiDomainEnabled")) {
                    y = jSONObject.optBoolean("multiDomainEnabled", false);
                }
                if (y && jSONObject.has("productMultiDomains")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("productMultiDomains");
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        String optString = optJSONArray.optString(i2);
                        if (optString != null) {
                            copyOnWriteArrayList.add(optString);
                        }
                    }
                    z = copyOnWriteArrayList;
                }
            } catch (Throwable th) {
                a.a(th);
            }
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c44511577d17551282f855b2f3d9a3af", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c44511577d17551282f855b2f3d9a3af")).booleanValue();
        }
        a();
        return b;
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fd4216891fefd2708cab71f08d6524c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fd4216891fefd2708cab71f08d6524c")).booleanValue();
        }
        a();
        return c;
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0cf0b8afbd35db8b465802bd947368e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0cf0b8afbd35db8b465802bd947368e")).booleanValue();
        }
        a();
        return d;
    }

    public static long e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b9a62c1d2dcf561a6dd93815cd0bd10", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b9a62c1d2dcf561a6dd93815cd0bd10")).longValue();
        }
        a();
        return e;
    }

    public static int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aee830837966bef9263e45cbc76563dd", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aee830837966bef9263e45cbc76563dd")).intValue();
        }
        a();
        return g;
    }

    public static boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd4e70ac05b25474b874cd9e48834c2c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd4e70ac05b25474b874cd9e48834c2c")).booleanValue();
        }
        a();
        return h;
    }

    public static boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "258eb2d65b593e62337b44e0c582e884", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "258eb2d65b593e62337b44e0c582e884")).booleanValue();
        }
        a();
        return t && u;
    }

    public static boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65198ca44c5ff804edba16adf797fae4", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65198ca44c5ff804edba16adf797fae4")).booleanValue();
        }
        a();
        return s;
    }

    public static float j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70d5c8e8cfee13616dd844a5be6f2467", 6917529027641081856L)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70d5c8e8cfee13616dd844a5be6f2467")).floatValue();
        }
        a();
        return v;
    }

    public static HttpURLConnection a(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2201a922532e2f6d6efad4d58b4e1a89", 6917529027641081856L) ? (HttpURLConnection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2201a922532e2f6d6efad4d58b4e1a89") : a(str, false);
    }

    public static HttpURLConnection a(String str, boolean z2) throws IOException {
        Object[] objArr = {str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ecefdb17a5550599be9285496e6f5b0", 6917529027641081856L)) {
            return (HttpURLConnection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ecefdb17a5550599be9285496e6f5b0");
        }
        if (!z2 && h()) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(NVLinker.obtainURL(str).openConnection());
            httpURLConnection.addRequestProperty(NVHttpCon.KEY_DISABLE_CAT, "true");
            httpURLConnection.addRequestProperty(NVHttpCon.KEY_FORCE_HTTP_TUNNEL, "true");
            httpURLConnection.addRequestProperty("X-Shark-supportProtocols", "h2");
            httpURLConnection.addRequestProperty(NVHttpCon.KEY_DISABLE_INTERCEPTOR, "1");
            return httpURLConnection;
        }
        HttpURLConnection httpURLConnection2 = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
        a(httpURLConnection2);
        return httpURLConnection2;
    }

    public static int a(boolean z2) {
        Object[] objArr = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85633b5117eab8fbd47446ddf07c0516", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85633b5117eab8fbd47446ddf07c0516")).intValue();
        }
        a();
        if (NVLinker.isAppBackground()) {
            return q;
        }
        if (z2) {
            return l;
        }
        return j;
    }

    public static long b(boolean z2) {
        Object[] objArr = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fb5d941bd3603234d4c42b9cf8957af", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fb5d941bd3603234d4c42b9cf8957af")).longValue();
        }
        a();
        if (NVLinker.isAppBackground()) {
            return r;
        }
        if (z2) {
            return m;
        }
        return k;
    }

    public static int k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfa159b03acb5d45d36b4c3487824068", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfa159b03acb5d45d36b4c3487824068")).intValue();
        }
        a();
        if (NVLinker.isAppBackground()) {
            return q;
        }
        return o;
    }

    public static long l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0cd0720b4bad1248798def081a41b06", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0cd0720b4bad1248798def081a41b06")).longValue();
        }
        a();
        if (NVLinker.isAppBackground()) {
            return r;
        }
        return p;
    }

    public static int m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab00f560a8d19b8359023505da4d1c92", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab00f560a8d19b8359023505da4d1c92")).intValue();
        }
        a();
        return n;
    }

    public static void a(HttpURLConnection httpURLConnection) {
        Object[] objArr = {httpURLConnection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6154e7e36b84ce475ffbe8ab87770944", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6154e7e36b84ce475ffbe8ab87770944");
            return;
        }
        a();
        if (!s || Build.VERSION.SDK_INT <= 22) {
            return;
        }
        httpURLConnection.addRequestProperty("X-Android-Protocols", "h2");
    }

    public static boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ad92317dd92e4d1f292b2bb37572268", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ad92317dd92e4d1f292b2bb37572268")).booleanValue();
        }
        a();
        return x;
    }

    public static float o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c90257004aecc2e88bd355c693a4d5b", 6917529027641081856L)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c90257004aecc2e88bd355c693a4d5b")).floatValue();
        }
        a();
        return w;
    }

    public static List<String> p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64ecb101a31d0cd39f36c3ccbf9985e0", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64ecb101a31d0cd39f36c3ccbf9985e0");
        }
        a();
        return z;
    }
}
