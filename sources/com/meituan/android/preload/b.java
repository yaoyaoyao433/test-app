package com.meituan.android.preload;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import com.meituan.android.preload.a;
import com.meituan.android.preload.c;
import com.meituan.android.preload.config.f;
import com.meituan.android.preload.util.d;
import com.meituan.android.preload.util.e;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.listener.OnWebClientListener;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b implements com.meituan.android.preload.config.c {
    public static ChangeQuickRedirect a;
    public static ConcurrentHashMap<String, MetricsSpeedMeterTask> e;
    private static volatile b f;
    boolean b;
    volatile int c;
    volatile String d;
    private List<a> g;
    private final Object h;
    private Handler i;
    private Runnable j;
    private int k;
    private Context l;
    private c.a m;
    private a.C0348a n;
    private String o;

    @Override // com.meituan.android.preload.config.c
    public final void a() {
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.b = true;
        return true;
    }

    public static /* synthetic */ void c(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "3f0be27c735a27b505a7de83635f6848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "3f0be27c735a27b505a7de83635f6848");
        } else if (!d.a(bVar.d)) {
            synchronized (bVar.h) {
                if (bVar.g != null && bVar.g.size() <= 0) {
                    for (int i = 0; i <= 0; i++) {
                        bVar.g.add(bVar.c());
                    }
                }
            }
        }
    }

    public static b a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "271ec916e23d0fee6213aa41dbe46ca0", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "271ec916e23d0fee6213aa41dbe46ca0");
        }
        if (f == null) {
            synchronized (b.class) {
                if (f == null) {
                    f = new b(context);
                }
            }
        }
        return f;
    }

    private b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13e4ef7115a39bd213ab46bafe6405cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13e4ef7115a39bd213ab46bafe6405cf");
            return;
        }
        this.g = new ArrayList();
        this.h = new Object();
        this.b = false;
        this.c = 1000;
        this.d = "";
        this.l = context.getApplicationContext();
        this.i = new Handler(Looper.getMainLooper());
        e = new ConcurrentHashMap<>();
    }

    public final synchronized void a(String str, int i, a.C0348a c0348a, int i2, c.a aVar, String str2, final f fVar) {
        Object[] objArr = {str, Integer.valueOf(i), c0348a, Integer.valueOf(i2), aVar, str2, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2ea05152dad2299ccb33ee71ac4cdf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2ea05152dad2299ccb33ee71ac4cdf8");
            return;
        }
        new StringBuilder("initWebViewPool, begin ").append(this.b);
        if (!this.b && !TextUtils.isEmpty(str)) {
            this.d = str;
            this.k = i;
            this.m = aVar;
            this.c = com.meituan.android.preload.config.b.c().c;
            this.n = c0348a;
            this.o = str2;
            this.i.postDelayed(new Runnable() { // from class: com.meituan.android.preload.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6d320e62ee41fa36f646cfd066277d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6d320e62ee41fa36f646cfd066277d0");
                        return;
                    }
                    Context context = b.this.l;
                    Object[] objArr3 = {context};
                    ChangeQuickRedirect changeQuickRedirect3 = e.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4a4bbe96121dc2fff5bf26f2aafd820d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4a4bbe96121dc2fff5bf26f2aafd820d");
                        return;
                    }
                    com.meituan.android.preload.config.e c = com.meituan.android.preload.config.b.c();
                    if (c.b && c.d && Build.VERSION.SDK_INT >= 17) {
                        try {
                            WebSettings.getDefaultUserAgent(context);
                            com.meituan.android.preload.util.a.a("Enlight/WebViewUtil", "WebSettings.getDefaultUserAgent end ");
                        } catch (Throwable unused) {
                            com.meituan.android.preload.util.a.b("Enlight/WebViewUtil", "WebSettings.getDefaultUserAgent fail ");
                        }
                    }
                }
            }, com.meituan.android.preload.config.b.c().e);
            this.i.postDelayed(new Runnable() { // from class: com.meituan.android.preload.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69301ad610c5760ce4e203864184c7ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69301ad610c5760ce4e203864184c7ef");
                    } else if (b.this.b) {
                    } else {
                        b.c(b.this);
                        b.a(b.this, true);
                        if (fVar == null || b.this.g.size() <= 0) {
                            return;
                        }
                        a aVar2 = (a) b.this.g.get(0);
                        if (aVar2.getKnbWebCompat() != null) {
                            aVar2.getKnbWebCompat().setOnWebViewClientListener(new OnWebClientListener() { // from class: com.meituan.android.preload.b.2.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                                public final void onReceivedError(int i3, String str3, String str4) {
                                }

                                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                                public final void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
                                }

                                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                                public final boolean shouldOverrideUrlLoading(String str3) {
                                    return false;
                                }

                                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                                public final void onPageStarted(String str3, Bitmap bitmap) {
                                    Object[] objArr3 = {str3, bitmap};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2ca7e0b72b8afb9d53e7623062052dd1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2ca7e0b72b8afb9d53e7623062052dd1");
                                    } else {
                                        str3.contains(b.this.d);
                                    }
                                }

                                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                                public final void onPageFinished(String str3) {
                                    Object[] objArr3 = {str3};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a22401c310c29fdd9176d8f3e109ea19", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a22401c310c29fdd9176d8f3e109ea19");
                                    } else {
                                        str3.contains(b.this.d);
                                    }
                                }
                            });
                        }
                    }
                }
            }, i2);
        }
    }

    public final a a(@NonNull Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e2501f1f5e36bc88ac83952bf6ea165", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e2501f1f5e36bc88ac83952bf6ea165");
        }
        synchronized (this.h) {
            if (this.g.size() > 0) {
                a aVar = this.g.get(0);
                this.g.remove(0);
                if (context instanceof Activity) {
                    ((MutableContextWrapper) aVar.getContext()).setBaseContext(context);
                }
                a(this.c);
                com.meituan.android.preload.util.c a2 = com.meituan.android.preload.util.c.a();
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.preload.util.c.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b79082ca73cf7428251aaaaee1f88bf6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b79082ca73cf7428251aaaaee1f88bf6");
                } else if (!StringUtil.NULL.equals(str2)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("enlight_get_container_first", 1);
                    Map<String, String> b = a2.b();
                    b.put("biz", str);
                    b.put("page", str2);
                    b.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, "0");
                    a2.a(hashMap, b);
                }
                return aVar;
            }
            com.meituan.android.preload.util.c a3 = com.meituan.android.preload.util.c.a();
            Object[] objArr3 = {str, str2, "30066"};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.preload.util.c.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "9742495c06a0511e017054cd36042ce1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "9742495c06a0511e017054cd36042ce1");
            } else if (!StringUtil.NULL.equals(str2)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("enlight_get_container_first", 0);
                Map<String, String> b2 = a3.b();
                b2.put("biz", str);
                b2.put("page", str2);
                b2.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, "30066");
                a3.a(hashMap2, b2);
            }
            com.meituan.android.preload.util.c.a().b("首次获取预加载容器失败");
            a c = c();
            if (context instanceof Activity) {
                ((MutableContextWrapper) c.getContext()).setBaseContext(context);
            }
            a(4000);
            return c;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3bfb90e415abadc5f136a7b48d20931", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3bfb90e415abadc5f136a7b48d20931");
            return;
        }
        if (this.i != null) {
            this.i.removeCallbacksAndMessages(null);
        }
        synchronized (this.h) {
            if (this.g != null) {
                for (int i = 0; i < this.g.size(); i++) {
                    a aVar = this.g.get(i);
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "3e3da85f73b12ec2460694e8e3bd61c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "3e3da85f73b12ec2460694e8e3bd61c2");
                    } else {
                        aVar.b.onDestroy();
                    }
                }
                this.g.clear();
            }
        }
    }

    private a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d3b7b65e8b051379491c4585cb36107", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d3b7b65e8b051379491c4585cb36107");
        }
        MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("Enlight_" + com.meituan.android.preload.config.b.b().d);
        createCustomSpeedMeterTask.recordStep("EnlightInitWebview");
        a aVar = new a(new MutableContextWrapper(this.l), this.k, this.n, this.m);
        createCustomSpeedMeterTask.recordStep("DidFinishInitWebview");
        e.put(aVar.getUniqueId(), createCustomSpeedMeterTask);
        createCustomSpeedMeterTask.recordStep("EnlightLoadMainDocument");
        aVar.destroyDrawingCache();
        aVar.a(a(this.d));
        com.meituan.android.preload.util.c.a().a(this.o);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73d8ead14d2e91c2a90b4b0fd2def5e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73d8ead14d2e91c2a90b4b0fd2def5e9");
        } else if (d.a(this.d)) {
        } else {
            if (this.j == null) {
                this.j = new Runnable() { // from class: com.meituan.android.preload.b.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "563bae7ac49b37d767206fe5ddace922", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "563bae7ac49b37d767206fe5ddace922");
                        } else {
                            b.c(b.this);
                        }
                    }
                };
            }
            this.i.postDelayed(this.j, i);
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f48a6108cd9603f5ab8637979464585", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f48a6108cd9603f5ab8637979464585");
        }
        if (this.n == null || this.n.e == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (Uri.EMPTY.equals(parse)) {
                return str;
            }
            Uri.Builder buildUpon = parse.buildUpon();
            for (Map.Entry<String, String> entry : this.n.e.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return buildUpon.toString();
        } catch (Exception unused) {
            return str;
        }
    }
}
