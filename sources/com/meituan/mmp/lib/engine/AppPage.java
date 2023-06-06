package com.meituan.mmp.lib.engine;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.ValueCallback;
import com.dianping.titans.utils.Constants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.dio.easy.DioFile;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.aa;
import com.meituan.mmp.lib.api.device.SystemInfoModule;
import com.meituan.mmp.lib.api.storage.RenderingCacheModule;
import com.meituan.mmp.lib.config.a;
import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.lib.msi.h;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.utils.ay;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.z;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.map.geolocation.internal.TencentExtraKeys;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class AppPage implements com.meituan.mmp.lib.interfaces.a, com.meituan.mmp.lib.interfaces.b, com.meituan.mmp.lib.web.f, com.meituan.mmp.lib.web.g {
    public static ChangeQuickRedirect a;
    final Context b;
    public final m c;
    public final com.meituan.mmp.lib.config.a d;
    Handler e;
    public com.meituan.mmp.lib.web.b f;
    public boolean g;
    @NonNull
    public d h;
    public volatile String i;
    com.meituan.mmp.lib.web.f j;
    public String k;
    public int l;
    public int m;
    public boolean n;
    final List<MMPPackageInfo> o;
    final Set<String> p;
    final Set<String> q;
    public com.meituan.mmp.lib.service.a r;
    private volatile c s;
    private DisplayMetrics t;
    private final Queue<Pair<String, ValueCallback<String>>> u;
    private final Queue<Pair<String, ValueCallback<String>>> v;
    private final Queue<Runnable> w;
    private int x;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TemplateType {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(@Nullable String str);

        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class d {
        public static ChangeQuickRedirect a;
        public long A;
        com.meituan.mmp.lib.interfaces.d b;
        public String c;
        String d;
        MMPPackageInfo e;
        public a f;
        public com.meituan.mmp.lib.trace.h g;
        com.meituan.mmp.lib.trace.h h;
        @NonNull
        public com.meituan.mmp.lib.trace.h i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;
        boolean n;
        String o;
        public String p;
        String q;
        boolean r;
        public boolean s;
        boolean t;
        boolean u;
        boolean v;
        b w;
        b x;
        public boolean y;
        public String z;

        public d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "826be3659e71b0c179f13f85be3fc9cf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "826be3659e71b0c179f13f85be3fc9cf");
                return;
            }
            this.p = null;
            this.t = false;
            this.u = false;
            this.v = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public String a;
        public Map<String, Object> b;

        public b() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c extends com.meituan.mmp.main.l {
        public static final c a = new c("INITIAL");
        public static final c b = new c("HTML_LOADED");
        public static final c c = new c("WEB_VIEW_PAGE_FINISHED");
        public static final c d = new c("PAGE_READY");
        public static final c e = new c("PAGE_START_SEND");
        public static final c f = new c("DOM_CONTENT_LOADED");

        private c(@NonNull String str) {
            super(str);
        }
    }

    void a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "0ac1b6b9a28fe6897615ce6781cfd08a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "0ac1b6b9a28fe6897615ce6781cfd08a");
            return;
        }
        com.meituan.mmp.lib.trace.b.a("AppPage " + Integer.toHexString(hashCode()) + "@" + j(), objArr);
    }

    private void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d3060c6ad996b61dff619afd48ce984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d3060c6ad996b61dff619afd48ce984");
            return;
        }
        a("raiseLoadStageTo", cVar);
        if (this.s.a(cVar)) {
            return;
        }
        this.s = cVar;
    }

    public AppPage(final Context context, m mVar, com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {context, mVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "232c8a76c8788033aecd70e7a7b24704", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "232c8a76c8788033aecd70e7a7b24704");
            return;
        }
        this.e = new Handler(Looper.getMainLooper());
        this.h = new d();
        this.l = -1;
        this.m = -1;
        this.o = new CopyOnWriteArrayList();
        this.p = new ConcurrentSkipListSet();
        this.q = new ConcurrentSkipListSet();
        this.s = c.a;
        this.u = new ConcurrentLinkedQueue();
        this.v = new ConcurrentLinkedQueue();
        this.w = new ConcurrentLinkedQueue();
        this.x = 0;
        com.meituan.mmp.lib.trace.b.b("AppPage " + Integer.toHexString(hashCode()), "new AppPage, viewId: " + j());
        this.b = context.getApplicationContext();
        this.c = mVar;
        this.d = aVar;
        com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.engine.AppPage.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "978edf8ed28435c9d647059b48c7085f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "978edf8ed28435c9d647059b48c7085f");
                } else {
                    AppPage.this.a(context);
                }
            }
        });
        a(context, this.d.c());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70b4d3a6e07b64e3837a0560866394c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70b4d3a6e07b64e3837a0560866394c4");
        } else if (com.meituan.mmp.lib.devtools.automator.a.a() != null) {
            new Object() { // from class: com.meituan.mmp.lib.engine.AppPage.9
            };
        }
    }

    private void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e9f174e426d8ddf7964f8184f053658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e9f174e426d8ddf7964f8184f053658");
        } else {
            this.h.i = new com.meituan.mmp.lib.trace.h(context, str);
        }
    }

    @UiThread
    public final com.meituan.mmp.lib.web.b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bcce0c476d2944868ddd8893a141004", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.web.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bcce0c476d2944868ddd8893a141004");
        }
        if (this.f == null) {
            com.meituan.mmp.lib.web.b bVar = new com.meituan.mmp.lib.web.b(context, this.c, 1);
            bVar.b = this;
            bVar.c = this;
            this.f = bVar;
            this.f.setOnPageFinishedListener(this);
            z.a(this.f, this.d.c());
        }
        return this.f;
    }

    String a() {
        JSONObject jSONObject;
        h.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b542103f610f5842177e6cdd02d95c76", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b542103f610f5842177e6cdd02d95c76");
        }
        Map<String, List<String>> map = null;
        if (this.c.h != null && (bVar = this.c.h.h) != null) {
            map = bVar.a();
        }
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = new JSONObject();
        }
        return jSONObject.toString();
    }

    String b() {
        JSONObject jSONObject;
        h.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31ff1d63aedebabff79c2502338d0022", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31ff1d63aedebabff79c2502338d0022");
        }
        Map<String, List<String>> map = null;
        if (this.c.h != null && (bVar = this.c.h.h) != null) {
            map = bVar.e();
        }
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = new JSONObject();
        }
        return jSONObject.toString();
    }

    public final com.meituan.mmp.lib.page.view.b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ba4f4cc2a7d656b84dcdd5ba81d662", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.page.view.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ba4f4cc2a7d656b84dcdd5ba81d662");
        }
        if (this.f == null) {
            return null;
        }
        return this.f.getIWebView();
    }

    public final AppPage a(com.meituan.mmp.lib.interfaces.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ade2a0a8f19486c0f570563856b9e52", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ade2a0a8f19486c0f570563856b9e52");
        }
        this.h.b = dVar;
        return this;
    }

    public final AppPage a(com.meituan.mmp.lib.trace.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f87e7eea7d9fbcc67a6ff28b842cdf74", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f87e7eea7d9fbcc67a6ff28b842cdf74");
        }
        this.h.h = hVar;
        return this;
    }

    public final AppPage a(com.meituan.mmp.lib.trace.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5cd010202e3914d26d3839d16357b09", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5cd010202e3914d26d3839d16357b09");
        }
        this.h.i.l = gVar;
        return this;
    }

    private boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de04ae32420cc660abd549b14669dc36", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de04ae32420cc660abd549b14669dc36")).booleanValue();
        }
        if (this.d.l == null || this.d.l.mmpSdk == null) {
            return false;
        }
        return this.d.l.mmpSdk.q;
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f494a82b3f6227374ded9fc436c89bbe", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f494a82b3f6227374ded9fc436c89bbe") : this.h.c;
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac285515b106764b64959839a0360ed6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac285515b106764b64959839a0360ed6")).booleanValue() : this.h.c != null;
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bc17deeb365995a140062fa696b9045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bc17deeb365995a140062fa696b9045");
        } else {
            this.h.l = true;
        }
    }

    public final void a(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac54e762e4d90344bf33ba9be276ef2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac54e762e4d90344bf33ba9be276ef2e");
            return;
        }
        Trace.beginSection("AppPage.loadPage");
        a(aaVar, false);
        Trace.endSection();
    }

    @WorkerThread
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b2e47aa43ecdafd6a9521295f3f53d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b2e47aa43ecdafd6a9521295f3f53d2");
        } else if (this.h.k) {
            com.meituan.mmp.lib.trace.b.b("AppPage", "canceled preloadPage because some page already loaded");
        } else if (this.h.l) {
            com.meituan.mmp.lib.trace.b.b("AppPage", "canceled preloadPage because page is reserved for launch");
        } else {
            com.meituan.mmp.lib.trace.b.b("AppPage", "preloadPage: " + str);
            aa aaVar = new aa(str, "appLaunch");
            Trace.beginSection("AppPage.preloadPage");
            a(aaVar, true);
            Trace.endSection();
        }
    }

    private void a(aa aaVar, boolean z) {
        String x;
        Object[] objArr = {aaVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fde47f3e3e99e44aa8ce7c1e0d9ba2e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fde47f3e3e99e44aa8ce7c1e0d9ba2e7");
            return;
        }
        this.d.h.b.b("page.load");
        this.d.h.b.b("page.load.to.initial.data");
        this.d.h.b.b("page.load.to.first.script");
        this.d.h.b.b("page.load.to.page.ready");
        this.d.h.b.b("page.load.to.dom.ready");
        this.d.h.b.b("page.load.to.page.start");
        this.d.h.b.b("page.load.to.first.render");
        boolean z2 = !z && this.h.n;
        String str = z2 ? "launch consume preload" : z ? LaunchMode.LAUNCH_MODE_PRELOAD : "launch without preload";
        com.meituan.mmp.lib.trace.b.b("AppPage " + Integer.toHexString(hashCode()), "loadPage: " + aaVar.b + ", " + str);
        if (E()) {
            this.h.g.c("loadPage: " + aaVar.b + ", " + str, (HashMap<String, Object>) null);
        }
        this.h.k = true;
        this.h.n = z;
        this.h.c = aaVar.b;
        this.h.d = aaVar.c;
        String p = com.meituan.mmp.lib.config.a.p(this.h.c);
        this.p.add(p);
        this.h.e = this.d.l.getPackageByPath(this.b, p);
        if (!z) {
            a("lastStatusEventWhenLaunch", (Object) this.k);
        }
        if (z2) {
            com.meituan.mmp.lib.trace.b.b("consumePreload", aaVar.b);
            x = this.h.o;
            this.h.o = null;
        } else {
            if (s()) {
                if (!u()) {
                    a(new v() { // from class: com.meituan.mmp.lib.engine.AppPage.10
                        public static ChangeQuickRedirect a;

                        @Override // android.webkit.ValueCallback
                        public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }

                        @Override // com.meituan.mmp.lib.engine.v
                        public final void a(Exception exc) {
                            Object[] objArr2 = {exc};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28372f7916c75277777d478db29bdd4b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28372f7916c75277777d478db29bdd4b");
                                return;
                            }
                            AppPage.this.a("onReceiveFailValue", exc);
                            AppPage.this.c.i.b(AppPage.this);
                            if (AppPage.this.h.b != null) {
                                com.meituan.mmp.lib.interfaces.d dVar = AppPage.this.h.b;
                                dVar.a("load basic packages failed " + AppPage.this.h.c, "fatal");
                            }
                        }
                    });
                }
            } else {
                a(c.b);
                Uri parse = Uri.parse("mmp://www.meituan.com/" + aaVar.b);
                if (!p.endsWith(".html")) {
                    p = p + ".html";
                }
                Uri fromFile = Uri.fromFile(new File(this.h.e.b(this.b), p));
                if (!TextUtils.isEmpty(parse.getEncodedQuery())) {
                    fromFile = fromFile.buildUpon().encodedQuery(parse.getEncodedQuery()).build();
                }
                final String uri = fromFile.toString();
                com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.engine.AppPage.11
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d5255f226ddda396c1c56709e9c63ea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d5255f226ddda396c1c56709e9c63ea");
                        } else {
                            AppPage.this.a(AppPage.this.b).a(uri);
                        }
                    }
                });
            }
            if (this.h.q != null) {
                x = RenderingCacheModule.a.a(this.h.q, this.d, this.h.c, j(), this.h.d);
                this.h.q = null;
            } else {
                x = x();
                g(x);
            }
        }
        if (!z) {
            if ("redirectTo".equals(aaVar.c)) {
                this.f.b();
            }
            if (this.h.f != null) {
                this.h.f.a();
            }
            a(aaVar, x);
            synchronized (this.w) {
                F();
                this.h.m = true;
            }
            a(String.format("if (typeof __mpInfo === 'undefined') {var __mpInfo = {};}; __mpInfo.appId='%s'; __mpInfo.url='%s';", this.d.c(), this.h.c), (ValueCallback<String>) null);
        } else {
            this.h.o = x;
        }
        G();
    }

    public final void a(@Nullable List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c83773418050c44af238e54d1b8d3cfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c83773418050c44af238e54d1b8d3cfe");
        } else if (!list.isEmpty()) {
            for (String str : list) {
                this.q.add(com.meituan.mmp.lib.config.a.p(str));
            }
            for (final String str2 : this.q) {
                MMPPackageInfo subPackageByPath = this.d.l.getSubPackageByPath(this.b, str2);
                if (subPackageByPath != null && !subPackageByPath.u) {
                    com.meituan.mmp.lib.trace.b.b("AppPage", "need download subPackage " + subPackageByPath.g + " to preload resource: " + str2);
                    com.meituan.mmp.lib.update.k.a().a(this.d.l, str2, new com.meituan.mmp.lib.update.i() { // from class: com.meituan.mmp.lib.engine.AppPage.12
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.mmp.lib.update.i
                        public final void a(MMPAppProp mMPAppProp) {
                        }

                        @Override // com.meituan.mmp.lib.update.i
                        public final void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
                        }

                        @Override // com.meituan.mmp.lib.update.i
                        public final void a(MMPAppProp mMPAppProp, List<MMPPackageInfo> list2) {
                            Object[] objArr2 = {mMPAppProp, list2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "118421af8ca581cad1a90fdca54fd4bf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "118421af8ca581cad1a90fdca54fd4bf");
                                return;
                            }
                            com.meituan.mmp.lib.trace.b.b("AppPage", "subPackage download success, continue preload resource: " + str2);
                            AppPage.this.t();
                        }

                        @Override // com.meituan.mmp.lib.update.i
                        public final void a(MMPAppProp mMPAppProp, String str3, Exception exc) {
                            Object[] objArr2 = {mMPAppProp, str3, exc};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13495a3554e5f4b407ed458905704150", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13495a3554e5f4b407ed458905704150");
                                return;
                            }
                            com.meituan.mmp.lib.trace.b.b("AppPage", "subPackage download failed, cancel resource preload: " + str2);
                        }
                    }, new com.meituan.mmp.lib.update.a(this.d.h));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a31b2cf0d8130795fd6545ee0878107d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a31b2cf0d8130795fd6545ee0878107d");
        } else if (this.s != c.d) {
            com.meituan.mmp.lib.trace.b.b("AppPage", "can not preload resource in current stage: " + this.s + ", will do it later");
        } else {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = this.q.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (this.p.contains(next)) {
                        it.remove();
                    } else {
                        MMPPackageInfo packageByPath = this.d.l.getPackageByPath(this.b, next);
                        if (packageByPath.u) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("pagePath", next);
                            jSONObject.put("packageName", packageByPath.g);
                            jSONArray.put(jSONObject);
                            it.remove();
                            this.p.add(next);
                            com.meituan.mmp.lib.trace.b.b("AppPage", "onPagePreload: " + next);
                        }
                    }
                }
                if (jSONArray.length() > 0) {
                    a("onPagePreload", jSONArray.toString());
                }
            } catch (JSONException e) {
                com.meituan.mmp.lib.trace.b.a(e);
            }
        }
    }

    private boolean u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49302f16ce44b16496c7fa940079dbcc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49302f16ce44b16496c7fa940079dbcc")).booleanValue();
        }
        if (s() && this.s == c.d) {
            v();
            return true;
        }
        return false;
    }

    private void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aadb1d1fe57a6fa6057951564a7eb7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aadb1d1fe57a6fa6057951564a7eb7d");
            return;
        }
        ab.a("onPageStart");
        this.d.h.b.a("page.load.to.page.start");
        a(c.e);
        this.f.b(j());
        String str = "{}";
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pagePath", this.h.c);
            jSONObject.put("packageName", this.h.e.g);
            str = jSONObject.toString();
        } catch (JSONException e) {
            com.meituan.mmp.lib.trace.b.a("AppPage#onPageStartError", e);
            e.printStackTrace();
        }
        com.meituan.mmp.lib.trace.b.a("AppPage", "onPageStart " + j(), str);
        c("onPageStart", str);
        if (this.h.b != null) {
            com.meituan.mmp.lib.interfaces.d dVar = this.h.b;
            String str2 = this.h.d;
            String str3 = this.h.c;
            StringBuilder sb = new StringBuilder();
            sb.append(j());
            dVar.a(str2, str3, sb.toString());
        }
        if (this.h.g != null) {
            this.h.g.a("mmp.launch.duration.page.start.first.render");
        }
        this.h.i.a("mmp.page.duration.page.start.first.render");
        ab.a();
    }

    public final void a(aa aaVar, String str) {
        Object[] objArr = {aaVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da5031ae55e5f59611827252de9fe38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da5031ae55e5f59611827252de9fe38");
            return;
        }
        String str2 = aaVar.c;
        this.h.d = aaVar.c;
        if (this.h.b != null) {
            com.meituan.mmp.lib.trace.b.b("AppPage", String.format("onAppRoute, openType=%s pagePath=%s viewId=%s hasRenderCache=%s", str2, this.h.c, Integer.valueOf(j()), Boolean.valueOf(!TextUtils.isEmpty(str))));
            aaVar.a("routeStartTime", Long.valueOf(n()));
            this.h.b.a(aaVar, j(), this.m, str);
            if (!TextUtils.isEmpty(str)) {
                this.h.p = str;
            }
        }
        this.h.i.a("routeType", (Object) str2);
        this.h.A = System.currentTimeMillis();
    }

    private boolean w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0269d411c789593a933ae5d9ef9006a7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0269d411c789593a933ae5d9ef9006a7")).booleanValue() : this.d.l(this.h.c) != a.EnumC0404a.NONE && com.meituan.mmp.lib.config.b.j();
    }

    private String x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de130416b6aec2a853f1653123df5508", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de130416b6aec2a853f1653123df5508");
        }
        if (w()) {
            return RenderingCacheModule.a.a(this.d, this.h.c, j(), this.h.d);
        }
        return null;
    }

    private boolean f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28651230b969a439c1ad1237fe773b47", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28651230b969a439c1ad1237fe773b47")).booleanValue();
        }
        if (w() && com.meituan.mmp.lib.config.b.k()) {
            com.meituan.mmp.lib.config.a aVar = this.d;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.config.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0d7b5dbcd9dc85bb6f6a24ad32d3f26d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0d7b5dbcd9dc85bb6f6a24ad32d3f26d")).booleanValue() : "true".equalsIgnoreCase(aVar.a(str, "initialRenderingSnapshot"))) {
                return true;
            }
        }
        return false;
    }

    private synchronized void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1025266dea02bac290a23becfd23ce1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1025266dea02bac290a23becfd23ce1");
        } else if (TextUtils.isEmpty(str)) {
            com.meituan.mmp.lib.trace.b.b("AppPage", "render cache data is empty, cancel sync");
        } else {
            this.h.y = true;
            com.meituan.mmp.lib.trace.b.b("AppPage", "use initial data, " + com.meituan.mmp.lib.utils.r.a(str));
            this.d.h.b.d("page.load.to.first.render");
            a("useInitialData", Boolean.TRUE);
            com.meituan.mmp.lib.w.a().e.a("native_send_initial_data_to_page");
            a("custom_event_initialData", str, false);
        }
    }

    private void b(@Nullable final v vVar) {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f497a016b19b6c49bf2a75411d905c2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f497a016b19b6c49bf2a75411d905c2f");
        } else if (this.s.a(c.b)) {
        } else {
            a("loadBasicPackagesByMerge");
            a(c.b);
            final String y = y();
            if (y == null && vVar != null) {
                vVar.a(new RuntimeException("load basic packages failed"));
            }
            com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.engine.AppPage.13
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fdf1b9c82cc560eb5f70b7bc15d5050d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fdf1b9c82cc560eb5f70b7bc15d5050d");
                        return;
                    }
                    AppPage.this.a(AppPage.this.b);
                    com.meituan.mmp.lib.web.b bVar = AppPage.this.f;
                    bVar.a("file://" + ay.a(AppPage.this.b, AppPage.this.d.c()), y, Constants.MIME_TYPE_HTML, "utf-8", null);
                    AppPage.this.f.b();
                    if (!AppPage.this.h.l) {
                        AppPage.this.f.e();
                    }
                    if (vVar != null) {
                        vVar.onReceiveValue("load basic packages successfully");
                    }
                }
            });
        }
    }

    private String y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f94d837f0ec9549bd551e1f14d07bc4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f94d837f0ec9549bd551e1f14d07bc4a");
        }
        if (s()) {
            a("getTemplateWithBasicPackages");
            ArrayList arrayList = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject();
                SystemInfoModule.b(jSONObject);
                arrayList.add("__systemInfo=" + jSONObject.toString());
                arrayList.add("allowList=" + a());
                arrayList.add("forbidList=" + b());
                a("getTemplateWithBasicPackages add __systemInfo");
                if (e()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("pagePath", this.h.c);
                    jSONObject2.put("packageName", this.h.e.g);
                    arrayList.add("__startPageParam=" + jSONObject2.toString());
                    a("getTemplateWithBasicPackages add __startPageParam");
                }
                arrayList.add(String.format("if (typeof __mpInfo === 'undefined') {var __mpInfo = {};}; __mpInfo.appId='%s'; __mpInfo.url='%s';", this.d.c(), this.h.c));
            } catch (JSONException e) {
                com.meituan.mmp.lib.trace.b.a(e);
            }
            if (!this.o.contains(this.d.l.mmpSdk)) {
                String a2 = a(this.d.l.mmpSdk);
                if (a2 == null) {
                    return null;
                }
                arrayList.add(a2);
                a("getTemplateWithBasicPackages add mmpSdk");
            }
            if (!this.o.contains(this.d.l.mainPackage)) {
                String a3 = a(this.d.l.mainPackage);
                if (a3 == null) {
                    return null;
                }
                arrayList.add(a3);
                a("getTemplateWithBasicPackages add mainPackage");
            }
            com.meituan.mmp.lib.trace.b.b("AppPage", "load template with package view@" + j());
            StringBuilder sb = new StringBuilder();
            sb.append("\n<!DOCTYPE html>\n<html lang=\"zh_CN\">\n<head>\n <meta charset=\"UTF-8\">\n <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, viewport-fit=cover\">\n <script>\n   window.__isPagePreloadMode = true\n </script>\n</head>\n<body>\n");
            for (int i = 0; i < arrayList.size(); i++) {
                sb.append("<script>\n");
                sb.append((String) arrayList.get(i));
                sb.append("\n</script>\n");
            }
            sb.append("\n</body>\n</html>");
            this.h.z = "snapshot_template_html_blank";
            arrayList.clear();
            return sb.toString();
        }
        return null;
    }

    private String a(MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eee1bc852590365d7745b2c84ae87719", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eee1bc852590365d7745b2c84ae87719");
        }
        if (mMPPackageInfo == null) {
            return null;
        }
        this.o.add(mMPPackageInfo);
        DioFile h = mMPPackageInfo.h(this.b);
        if (h.c()) {
            try {
                return com.meituan.mmp.lib.utils.s.a(h);
            } catch (IOException e) {
                com.meituan.mmp.lib.utils.s.a(this.d.h, h.g(), e, this.h.c, this.d.c());
                com.meituan.mmp.lib.trace.b.a(e);
                return null;
            }
        }
        a("readPackageBootStrap error bootStrapFile not exist", mMPPackageInfo);
        mMPPackageInfo.e(this.b);
        return null;
    }

    private String z() {
        String str;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7771a83a7208557e68c8e47abd4f3230", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7771a83a7208557e68c8e47abd4f3230");
        }
        if (s()) {
            String str2 = this.h.c;
            Object[] objArr2 = {str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9e4be9cced1e7b05ab14e711e5fb5b3", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9e4be9cced1e7b05ab14e711e5fb5b3");
            } else if (f(str2)) {
                com.meituan.mmp.lib.config.a aVar = this.d;
                Object[] objArr3 = {aVar, str2};
                ChangeQuickRedirect changeQuickRedirect3 = RenderingCacheModule.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "05ccf0c333b550c8711fc39bc4787c77", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "05ccf0c333b550c8711fc39bc4787c77");
                } else {
                    ab.a("obtainSnapshotTemplate");
                    String str3 = "";
                    String b2 = RenderingCacheModule.a.b(aVar, str2);
                    SharedPreferences a2 = RenderingCacheModule.a.a(aVar.c());
                    if (!a2.contains(b2)) {
                        com.meituan.mmp.lib.trace.b.b("RenderingCacheModule", "snapshot template cache not found for " + b2);
                    } else {
                        str3 = RenderingCacheModule.a.a(a2, b2, "");
                    }
                    ab.a();
                    com.meituan.mmp.lib.trace.b.b("RenderingCacheModule", "obtainSnapshotTemplate: return " + com.meituan.mmp.lib.utils.r.a(str3));
                    str = str3;
                }
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                com.meituan.mmp.lib.trace.b.b("AppPage", "load snapshot template view@" + j());
                this.h.z = "snapshot_template_html_runTime";
                a("useSnapshotTemplate", Boolean.TRUE);
                return str;
            }
            String str4 = this.h.c;
            Object[] objArr4 = {str4};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "06b759d7ec2c14531f4b943f6f4b8f87", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "06b759d7ec2c14531f4b943f6f4b8f87")).booleanValue();
            } else if (f(str4) && com.meituan.mmp.lib.config.b.l()) {
                z = true;
            }
            if (z) {
                DioFile dioFile = new DioFile(this.h.e.b(this.b), this.h.c + ".template.html");
                DioFile dioFile2 = new DioFile(this.h.e.b(this.b), this.h.c + ".data.json");
                if (dioFile.c() && dioFile2.c()) {
                    try {
                        ab.a("AppPage-readCompileTimeTemplate");
                        String a3 = com.meituan.mmp.lib.utils.s.a(dioFile);
                        String a4 = com.meituan.mmp.lib.utils.s.a(dioFile2);
                        ab.a();
                        if (a3 != null) {
                            ab.a("AppPage-CompileTimeTemplate replace");
                            a3 = i(a3);
                            ab.a();
                            com.meituan.mmp.lib.trace.b.b("AppPage", "load CompileTimeTemplate view@" + j() + StringUtil.SPACE + this.h.c);
                            this.h.q = a4;
                            this.h.z = "snapshot_template_html_compileTime";
                            a("useCompileTimeTemplate", Boolean.TRUE);
                        }
                        return a3;
                    } catch (IOException e) {
                        com.meituan.mmp.lib.utils.s.a(this.d.h, dioFile.g(), e, this.h.c, this.d.c());
                        com.meituan.mmp.lib.trace.b.a(e);
                        this.h.q = null;
                        return null;
                    } catch (Exception e2) {
                        com.meituan.mmp.lib.trace.b.a("CompileTimeTemplate", e2);
                        this.h.q = null;
                        return null;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void a(@Nullable v vVar) {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e85a0cf65280845352a5fd5ed520689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e85a0cf65280845352a5fd5ed520689");
        } else if (this.d.l != null) {
            a("AppPage#loadBasicPackages" + this.d.l);
            String z = z();
            if (z == null && MMPHornPreloadConfig.g() && this.o.isEmpty()) {
                b(vVar);
            } else {
                a(vVar, z);
            }
            G();
        }
    }

    private void a(@Nullable final v vVar, final String str) {
        Object[] objArr = {vVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be8375133536e8af5272b9fabbfd1811", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be8375133536e8af5272b9fabbfd1811");
        } else {
            a(this.d.l.mmpSdk, new v() { // from class: com.meituan.mmp.lib.engine.AppPage.14
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2858a6dc6f2a9ca199d40f0101f6f498", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2858a6dc6f2a9ca199d40f0101f6f498");
                    } else {
                        AppPage.this.a(AppPage.this.d.l.mainPackage, vVar, str);
                    }
                }

                @Override // com.meituan.mmp.lib.engine.v
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18abb27ed2b1181591df14bbd9a3c907", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18abb27ed2b1181591df14bbd9a3c907");
                    } else if (vVar != null) {
                        vVar.a(exc);
                    }
                }
            }, str);
        }
    }

    public final void a(MMPPackageInfo mMPPackageInfo, @Nullable v vVar) {
        Object[] objArr = {mMPPackageInfo, vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dd471fcd32d7f57a038daaabd8b2556", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dd471fcd32d7f57a038daaabd8b2556");
        } else {
            a(mMPPackageInfo, vVar, (String) null);
        }
    }

    void a(final MMPPackageInfo mMPPackageInfo, @Nullable final v vVar, String str) {
        Object[] objArr = {mMPPackageInfo, vVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da384357d3a144889861a8eec1884fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da384357d3a144889861a8eec1884fae");
        } else if (mMPPackageInfo == null) {
            com.meituan.mmp.lib.trace.b.d("AppPage#loadPagePackage", "empty package");
        } else if (s()) {
            h(str);
            if (!this.o.contains(mMPPackageInfo)) {
                com.meituan.mmp.lib.trace.b.a("AppPage#loadPagePackage view@" + j(), mMPPackageInfo);
                this.o.add(mMPPackageInfo);
                b(mMPPackageInfo, new v() { // from class: com.meituan.mmp.lib.engine.AppPage.15
                    public static ChangeQuickRedirect a;

                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(String str2) {
                        String str3 = str2;
                        Object[] objArr2 = {str3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf895e2b48f27a0cfed92d750b87548c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf895e2b48f27a0cfed92d750b87548c");
                            return;
                        }
                        if (vVar != null) {
                            vVar.onReceiveValue(str3);
                        }
                        com.meituan.mmp.lib.trace.b.a("AppPage", "loadPackageSuccess view@" + AppPage.this.j(), mMPPackageInfo.toString());
                    }

                    @Override // com.meituan.mmp.lib.engine.v
                    public final void a(Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed8007147a563a7787b1a86021008bac", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed8007147a563a7787b1a86021008bac");
                            return;
                        }
                        if (vVar != null) {
                            vVar.a(exc);
                        }
                        com.meituan.mmp.lib.trace.b.a("AppPage#loadPackageFailed view@" + AppPage.this.j(), exc);
                    }
                });
                return;
            }
            com.meituan.mmp.lib.trace.b.a("AppPage#loadPagePackage already exist view@" + j(), mMPPackageInfo);
            if (vVar != null) {
                vVar.onReceiveValue(null);
            }
        }
    }

    private boolean h(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0d92934def18ed884ddc190d618bc10", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0d92934def18ed884ddc190d618bc10")).booleanValue();
        }
        if (s()) {
            synchronized (this) {
                if (this.s.a(c.b)) {
                    return true;
                }
                a(c.b);
                if (str == null) {
                    str = z();
                }
                if (str == null) {
                    com.meituan.mmp.lib.trace.b.b("AppPage", "load blank template view@" + j());
                    str = "\n<!DOCTYPE html>\n<html lang=\"zh_CN\">\n<head>\n <meta charset=\"UTF-8\">\n <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, viewport-fit=cover\">\n <script>\n   window.__isPagePreloadMode = true\n </script>\n</head>\n<body>\n\n</body>\n</html>";
                    this.h.z = "snapshot_template_html_blank";
                }
                com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.engine.AppPage.16
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be9aba8a317458aaf5ea1c44cf66db89", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be9aba8a317458aaf5ea1c44cf66db89");
                            return;
                        }
                        AppPage.this.a(AppPage.this.b);
                        com.meituan.mmp.lib.web.b bVar = AppPage.this.f;
                        bVar.a("file://" + ay.a(AppPage.this.b, AppPage.this.d.c()), str, Constants.MIME_TYPE_HTML, "utf-8", null);
                        AppPage.this.f.b();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            SystemInfoModule.b(jSONObject);
                            com.meituan.mmp.lib.web.b bVar2 = AppPage.this.f;
                            bVar2.a("__systemInfo=" + jSONObject.toString(), (ValueCallback<String>) null);
                            AppPage appPage = AppPage.this;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = AppPage.a;
                            if (PatchProxy.isSupport(objArr3, appPage, changeQuickRedirect3, false, "f8e45b62543539836887d758ca680ee4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, appPage, changeQuickRedirect3, false, "f8e45b62543539836887d758ca680ee4");
                            } else {
                                appPage.a("allowList=" + appPage.a(), (ValueCallback<String>) null);
                                appPage.a("forbidList=" + appPage.b(), (ValueCallback<String>) null);
                            }
                        } catch (JSONException e) {
                            com.meituan.mmp.lib.trace.b.a(e);
                        }
                        if (AppPage.this.h.l) {
                            return;
                        }
                        AppPage.this.f.e();
                    }
                });
                return true;
            }
        }
        return false;
    }

    private String i(String str) throws NumberFormatException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d93ebc79cfab345cd07ec9835001a82c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d93ebc79cfab345cd07ec9835001a82c");
        }
        Matcher matcher = Pattern.compile("<\\$.*?\\$>").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group();
            String trim = group.substring(2, group.length() - 2).trim();
            Object[] objArr2 = {trim};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            double d2 = 0.0d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aacb1270260f4ae886841cf25077110d", RobustBitConfig.DEFAULT_VALUE)) {
                d2 = ((Double) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aacb1270260f4ae886841cf25077110d")).doubleValue();
            } else {
                double parseDouble = Double.parseDouble(trim);
                if (parseDouble != 0.0d) {
                    if (this.t == null) {
                        this.t = MMPEnvHelper.getContext().getResources().getDisplayMetrics();
                    }
                    double d3 = (parseDouble / 375.0d) * (this.t.widthPixels / this.t.density);
                    double floor = d3 >= 0.0d ? Math.floor(d3 + 1.0E-4d) : Math.ceil(d3 - 1.0E-4d);
                    d2 = floor == 0.0d ? 1.0d : floor;
                }
            }
            matcher.appendReplacement(stringBuffer, String.valueOf(d2));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private void b(MMPPackageInfo mMPPackageInfo, v vVar) {
        Object[] objArr = {mMPPackageInfo, vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab78bd482ee7f994d787df7f908be6f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab78bd482ee7f994d787df7f908be6f3");
            return;
        }
        DioFile h = mMPPackageInfo.h(this.b);
        if (h.c()) {
            a(h, vVar);
            return;
        }
        vVar.a(new RuntimeException("AppPage#loadServicePackage bootStrapFile not exist, " + mMPPackageInfo + ", file: " + h.g()));
        mMPPackageInfo.e(this.b);
    }

    private void a(DioFile dioFile, v vVar) {
        Object[] objArr = {dioFile, vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "604ccfe0d4c487e52d9b0a82b807cf9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "604ccfe0d4c487e52d9b0a82b807cf9b");
        } else if (dioFile == null || !dioFile.c()) {
        } else {
            try {
                String a2 = com.meituan.mmp.lib.utils.s.a(dioFile);
                com.meituan.mmp.lib.trace.b.b("AppPage", "evaluateJsFile: " + dioFile.e());
                a(a2, (ValueCallback<String>) vVar);
            } catch (IOException e) {
                com.meituan.mmp.lib.utils.s.a(this.d.h, dioFile.g(), e, this.h.c, this.d.c());
                com.meituan.mmp.lib.trace.b.a(e);
                if (vVar != null) {
                    vVar.a(new IOException("AppPage#evaluateJsFile readContent failed" + dioFile, e));
                }
            }
        }
    }

    @Override // com.meituan.mmp.lib.interfaces.a
    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "934a7d0f511efdf7e076c3fbe84ad2b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "934a7d0f511efdf7e076c3fbe84ad2b4");
            return;
        }
        if (!this.s.a(c.d)) {
            com.meituan.mmp.lib.trace.b.a(new IllegalStateException("evaluateJavascript while page not ready" + str + str2 + str3));
        }
        b("javascript:HeraJSBridge.invokeCallbackHandler('" + str2 + "'," + str3 + CommonConstant.Symbol.BRACKET_RIGHT, (ValueCallback<String>) null);
    }

    @Override // com.meituan.mmp.lib.interfaces.b
    public final String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84de05b2573b52e8f6442d1ca604a510", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84de05b2573b52e8f6442d1ca604a510");
        }
        if (this.c.l != null) {
            return this.c.l.a(str);
        }
        return null;
    }

    @Override // com.meituan.mmp.lib.interfaces.b
    public final String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a80856ee0b3743db5a83eeb94d91be35", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a80856ee0b3743db5a83eeb94d91be35");
        }
        if (this.c.l != null) {
            return this.c.l.a(str, this);
        }
        return null;
    }

    @Override // com.meituan.mmp.lib.interfaces.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33026b4a12b18a653d89fc7c60e32bb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33026b4a12b18a653d89fc7c60e32bb3");
            return;
        }
        com.meituan.mmp.lib.web.b bVar = this.f;
        bVar.a("HeraJSBridge.msiInvokeBackHandler(" + str + CommonConstant.Symbol.BRACKET_RIGHT, (ValueCallback<String>) null);
    }

    public final void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88c3b2974c79ee510adfbbfb0b79fdc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88c3b2974c79ee510adfbbfb0b79fdc5");
        } else if (this.h.b != null) {
            this.h.b.a(str, str2, i);
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0932b9db8c052bda720087bac91f92a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0932b9db8c052bda720087bac91f92a9");
            return;
        }
        this.h.r = true;
        D();
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c6bb111ea6cb0a686675c189026134f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c6bb111ea6cb0a686675c189026134f");
        } else {
            this.h.r = false;
        }
    }

    private synchronized void A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4587e7f2e524186a96035c06f14c40e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4587e7f2e524186a96035c06f14c40e5");
            return;
        }
        a(c.f);
        D();
    }

    @Override // com.meituan.mmp.lib.web.g
    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ff5a684b6e655d535e213f76d20f7d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ff5a684b6e655d535e213f76d20f7d2");
            return;
        }
        com.meituan.mmp.lib.trace.b.a("AppPage", "onPageFinished view@" + j(), this.h.c, str);
        a(c.c);
        C();
    }

    private boolean B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b993bde5a71035f65aba5c4ad5316db0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b993bde5a71035f65aba5c4ad5316db0")).booleanValue() : this.h.n && !this.h.s;
    }

    public final synchronized void a(String str, @Nullable ValueCallback<String> valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2b056099a0f41590d9fe8f9cb1a3b2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2b056099a0f41590d9fe8f9cb1a3b2b");
        } else if (this.s.a(c.c)) {
            this.f.a(str, valueCallback);
        } else {
            this.v.add(new Pair<>(str, valueCallback));
        }
    }

    private synchronized void C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "526d8681d54c07455e70e7c4eea2d0ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "526d8681d54c07455e70e7c4eea2d0ec");
            return;
        }
        if (this.v.size() > 0) {
            for (Pair<String, ValueCallback<String>> pair : this.v) {
                a(pair.first, pair.second);
            }
            this.v.clear();
        }
    }

    private synchronized void b(String str, @Nullable ValueCallback<String> valueCallback) {
        Pair<String, ValueCallback<String>> poll;
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7375c084345d7d8661de4d21e3f4c8f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7375c084345d7d8661de4d21e3f4c8f8");
            return;
        }
        if (this.s.a(c.f)) {
            if (!this.h.r && !B() && !this.n) {
                if (this.u.size() >= 20 && (poll = this.u.poll()) != null) {
                    a(poll.first, poll.second);
                }
            }
            if (D()) {
                com.meituan.mmp.lib.trace.b.d("AppPage", "pending events for domLoaded not evaluated when domLoaded publish");
            }
            a(str, (ValueCallback<String>) null);
            return;
        }
        this.u.add(new Pair<>(str, null));
    }

    private synchronized boolean D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e439a87955b08edac9125021c7326a9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e439a87955b08edac9125021c7326a9e")).booleanValue();
        } else if (!this.u.isEmpty() && this.s.a(c.f) && (this.h.r || B() || this.n)) {
            com.meituan.mmp.lib.trace.b.a("AppPage", "evaluate pending JS when dom loaded: " + this.u.size());
            for (Pair<String, ValueCallback<String>> pair : this.u) {
                a(pair.first, pair.second);
            }
            this.u.clear();
            return true;
        } else {
            return false;
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd1c8059ebc0c66b07bdcd4f754a45c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd1c8059ebc0c66b07bdcd4f754a45c1");
        } else {
            a(str, str2, true);
        }
    }

    private void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad6fbb2698ffed9841fbace5d64eca7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad6fbb2698ffed9841fbace5d64eca7");
            return;
        }
        boolean equals = "custom_event_initialData".equals(str);
        if (equals && z) {
            j(str2);
        }
        if (equals || "custom_event_appDataChange".equals(str)) {
            this.d.h.b.a("page.load.to.initial.data");
            if (!this.h.j) {
                this.h.j = true;
                k(str);
                if (z) {
                    a("1st initialRenderData from service, send first data to page: " + str);
                } else {
                    a("1st initialRenderData from renderCache, send first data to page");
                }
                if (E()) {
                    com.meituan.mmp.lib.w.a().e.a("native_send_first_data_to_page");
                }
            } else if (equals) {
                a("initial render more than once!");
                a(" not 1st initialRenderData", str + str2);
            }
        }
        b(b(str, str2), (ValueCallback<String>) null);
    }

    private void j(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242e9e0bbc0121bed986d72d098c0636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242e9e0bbc0121bed986d72d098c0636");
        } else if (this.d.l(this.h.c) == a.EnumC0404a.NONE || !com.meituan.mmp.lib.config.b.j()) {
        } else {
            com.meituan.mmp.lib.trace.b.b("AppPage", "saving initialData");
            com.meituan.mmp.lib.executor.a.b.submit(new Runnable() { // from class: com.meituan.mmp.lib.engine.AppPage.17
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d97d650f6105723d368c1a27565a856", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d97d650f6105723d368c1a27565a856");
                    } else {
                        RenderingCacheModule.a(AppPage.this.d, AppPage.this.h.c, str);
                    }
                }
            });
        }
    }

    private String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92a1aa36809dc8446f99d36692af2adc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92a1aa36809dc8446f99d36692af2adc");
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "{}";
        }
        return "javascript:HeraJSBridge.subscribeHandler('" + str + "'," + str2 + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    private void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15912b843818a40798a23e34f2287002", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15912b843818a40798a23e34f2287002");
            return;
        }
        a(b(str, str2), (ValueCallback<String>) null);
        if (this.s.a(c.d)) {
            return;
        }
        com.meituan.mmp.lib.trace.b.a(new IllegalStateException("evaluateJavascript while page not ready" + str + str2));
    }

    private boolean E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41629c099343726f46c10fdf8e59a03e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41629c099343726f46c10fdf8e59a03e")).booleanValue() : this.h.g != null;
    }

    private void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7f485a083082437569a737ed52f236c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7f485a083082437569a737ed52f236c");
            return;
        }
        this.h.i.a(str, obj);
        if (this.h.h != null) {
            this.h.h.a(str, obj);
        }
        if (E()) {
            this.h.g.a(str, obj);
        }
    }

    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f18c7f2ba207cb2959c55d1ee5548d9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f18c7f2ba207cb2959c55d1ee5548d9")).booleanValue() : this.h.s;
    }

    @Override // com.meituan.mmp.lib.interfaces.b
    public final void b(final String str, final String str2, String str3) {
        boolean contains;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "824d6b44cf2ab92ace9650e5a3b61efe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "824d6b44cf2ab92ace9650e5a3b61efe");
            return;
        }
        if (!this.h.s) {
            com.meituan.mmp.lib.trace.b.b("AppPage", "publish() view@" + j() + ", event=" + str + ", params=" + str2 + ", viewIds=" + str3);
        }
        if (this.n && !"custom_event_DOMContentLoaded".equals(str)) {
            com.meituan.mmp.lib.trace.b.c("AppPage", "recycled AppPage @" + j() + ", ignore event from last page @" + str3 + ": " + str);
            return;
        }
        this.n = false;
        final HashMap<String, Object> hashMap = new HashMap<>();
        if ("custom_event_H5_FIRST_SCRIPT".equals(str)) {
            this.d.h.b.a("page.load.to.first.script");
            ab.c("firstScript->onPageReady");
            k(str);
            if (E()) {
                this.h.g.a("mmp.launch.duration.page.load.dom").a("mmp.launch.duration.page.request.html", hashMap).a("mmp.launch.point.h5.first.script", (Map<String, Object>) hashMap);
            }
            this.h.i.a("mmp.page.load.point.native.init", (Map<String, Object>) hashMap).a("mmp.page.load.native", (Map<String, Object>) hashMap).a("mmp.page.load.js").a("mmp.page.duration.first.script.to.ready").c("mmp.page.load.point.first.script");
        } else if ("custom_event_page_ready".equals(str)) {
            ab.d("firstScript->onPageReady");
            if (this.h.y || this.h.l) {
                ab.c("onPageReady->onDomLoaded");
            }
            if (E()) {
                this.h.g.a("mmp.launch.point.page.ready", (Map<String, Object>) hashMap);
            } else if (this.h.h != null) {
                this.h.h.b("mmp.preload.point.page.ready", hashMap);
            }
            this.h.i.b("mmp.page.duration.first.script.to.ready");
            this.d.h.b.a("page.load.to.page.ready");
            k(str);
            com.meituan.mmp.lib.trace.b.b("AppPage", "onPageReady view@" + j());
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "616ccf7541a9f1a6f5e200a554cdfcaf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "616ccf7541a9f1a6f5e200a554cdfcaf");
                return;
            }
            a(c.d);
            int j = j();
            com.meituan.mmp.lib.engine.d dVar = this.c.i;
            Object[] objArr3 = {Integer.valueOf(j)};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.engine.d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "a72b9841219885325dd0db3d598fa594", RobustBitConfig.DEFAULT_VALUE)) {
                contains = ((Boolean) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "a72b9841219885325dd0db3d598fa594")).booleanValue();
            } else {
                q c2 = o.c(dVar.b.b);
                contains = (c2 == null || !c2.a()) ? false : dVar.h.contains(Integer.valueOf(j));
            }
            if (contains) {
                com.meituan.mmp.lib.engine.d dVar2 = this.c.i;
                Object[] objArr4 = {Integer.valueOf(j)};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.mmp.lib.engine.d.a;
                if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "134b78dcfeeab3fcb2a1b664f808bd0a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "134b78dcfeeab3fcb2a1b664f808bd0a");
                } else {
                    dVar2.h.remove(Integer.valueOf(j));
                }
                String str4 = this.c.b;
                com.meituan.mmp.lib.trace.a.b(str4, "preloadPage-" + j);
            }
            if (this.h.k) {
                u();
            } else {
                t();
            }
        } else if ("custom_event_DOMContentLoaded".equals(str)) {
            ab.d("onPageReady->onDomLoaded");
            this.d.h.b.a("page.load.to.dom.ready");
            com.meituan.mmp.lib.trace.b.b("AppPage", "domContentLoaded view@" + j());
            k(str);
            A();
            if (E()) {
                this.h.g.a("mmp.launch.duration.page.load.dom", hashMap).a("mmp.launch.duration.page.first.render").a("mmp.launch.point.dom.loaded", (Map<String, Object>) hashMap);
            }
        } else if ("custom_event_H5_FIRST_RENDER".equals(str)) {
            ab.a("handle H5_FIRST_RENDER");
            this.d.h.b.a("page.load.to.first.render");
            this.d.h.b.a("page.load");
            this.h.s = true;
            k(str);
            if (E()) {
                this.h.g.a("mmp.launch.duration.page.first.render", hashMap).a("mmp.launch.duration.page.start.first.render", hashMap);
            }
            if (this.h.h != null && this.h.n) {
                this.h.h.b("mmp.preload.point.first.render", hashMap);
            }
            this.h.i.a("mmp.page.load.js", hashMap).a("mmp.page.duration.page.start.first.render", hashMap).a("mmp.page.duration.first.render.to.interactive");
            hashMap.put("firstRenderTime", Long.valueOf(SystemClock.elapsedRealtime()));
            a("success", hashMap);
            b("success", hashMap);
            a(new Runnable() { // from class: com.meituan.mmp.lib.engine.AppPage.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    char c3;
                    long j2;
                    JSONObject jSONObject;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3a15cfdbdc0e51f456036182feaf5bf5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3a15cfdbdc0e51f456036182feaf5bf5");
                        return;
                    }
                    AppPage.this.p();
                    AppPage.this.q();
                    if (AppPage.this.h.f != null) {
                        AppPage.this.h.f.b();
                    }
                    hashMap.put("usedRenderCache", Boolean.valueOf(AppPage.this.h.y));
                    hashMap.put("snapshotTemplateType", AppPage.this.h.z);
                    AppPage.this.h.b.a(AppPage.this.h.c, hashMap);
                    AppPage appPage = AppPage.this;
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = AppPage.a;
                    if (PatchProxy.isSupport(objArr6, appPage, changeQuickRedirect6, false, "03fb2bda0995431e9c8488b5e99fec69", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, appPage, changeQuickRedirect6, false, "03fb2bda0995431e9c8488b5e99fec69");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    e eVar = appPage.c != null ? appPage.c.h : null;
                    long j3 = -1;
                    if (eVar != null) {
                        long j4 = eVar.g;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        Object[] objArr7 = {new Long(currentTimeMillis2)};
                        ChangeQuickRedirect changeQuickRedirect7 = e.a;
                        if (PatchProxy.isSupport(objArr7, eVar, changeQuickRedirect7, false, "1101605a013f3bcb537a15c9ae379009", RobustBitConfig.DEFAULT_VALUE)) {
                            c3 = 0;
                            PatchProxy.accessDispatch(objArr7, eVar, changeQuickRedirect7, false, "1101605a013f3bcb537a15c9ae379009");
                        } else {
                            c3 = 0;
                            eVar.g = currentTimeMillis2;
                        }
                        j3 = j4;
                    } else {
                        c3 = 0;
                    }
                    JSONArray jSONArray = new JSONArray();
                    Object[] objArr8 = new Object[1];
                    objArr8[c3] = new Long(currentTimeMillis);
                    ChangeQuickRedirect changeQuickRedirect8 = AppPage.a;
                    if (PatchProxy.isSupport(objArr8, appPage, changeQuickRedirect8, false, "8538b81c57317cb127a27bcc79666ffb", RobustBitConfig.DEFAULT_VALUE)) {
                        jSONObject = (JSONObject) PatchProxy.accessDispatch(objArr8, appPage, changeQuickRedirect8, false, "8538b81c57317cb127a27bcc79666ffb");
                    } else {
                        if (appPage.h.g != null) {
                            j2 = appPage.h.g.j;
                        } else {
                            j2 = appPage.h.i.j;
                        }
                        com.meituan.mmp.lib.preformance.c b2 = new com.meituan.mmp.lib.preformance.c().a("navigation").b(appPage.h.g != null ? "appLaunch" : TencentExtraKeys.LOCATION_KEY_ROUTE).c(appPage.h.d).d(appPage.h.c).a(j2).b(currentTimeMillis);
                        jSONObject = b2;
                        if (appPage.h.g == null) {
                            b2.c(appPage.h.A);
                            jSONObject = b2;
                        }
                    }
                    jSONArray.put(jSONObject);
                    Object[] objArr9 = {new Long(currentTimeMillis)};
                    ChangeQuickRedirect changeQuickRedirect9 = AppPage.a;
                    jSONArray.put(PatchProxy.isSupport(objArr9, appPage, changeQuickRedirect9, false, "b8bde14cf54e557e8363f4236ca72546", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr9, appPage, changeQuickRedirect9, false, "b8bde14cf54e557e8363f4236ca72546") : new com.meituan.mmp.lib.preformance.c().a("render").b("firstRender").d(appPage.h.c).a(appPage.h.A).b(currentTimeMillis));
                    appPage.a(jSONArray, j3);
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, jSONArray);
                        appPage.a("onPerformanceDataChange", jSONObject2.toString(), appPage.l);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
            ab.a();
        } else if ("custom_event_H5_FIRST_INTERACTIVE_RENDER".equals(str)) {
            this.h.i.a("mmp.page.duration.first.render.to.interactive", hashMap);
        } else if ("custom_event_H5_LOG_MSG".equals(str)) {
            com.meituan.mmp.lib.trace.b.c(str2);
        } else if ("custom_event_H5_ERROR_MSG".equals(str)) {
            k(str);
            Object[] objArr5 = {str2};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e96e0af8d876f675711c664f410a51e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e96e0af8d876f675711c664f410a51e9");
            } else if (this.h.b != null) {
                if (!TextUtils.isEmpty(str2) && str2.contains("FatalError")) {
                    this.h.b.a(str2, "fatal");
                } else {
                    this.h.b.a(str2, "page");
                }
            }
            a("fail", hashMap);
            b("fail", hashMap);
            a(new Runnable() { // from class: com.meituan.mmp.lib.engine.AppPage.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4ae12e1a9db74a8206402d64494eaa74", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4ae12e1a9db74a8206402d64494eaa74");
                        return;
                    }
                    AppPage.this.p();
                    AppPage.this.q();
                }
            });
        } else if (!"sink_mode_hot_zone".equals(str)) {
            a(new Runnable() { // from class: com.meituan.mmp.lib.engine.AppPage.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "37303e5359996c22495cb17017756b4f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "37303e5359996c22495cb17017756b4f");
                    } else {
                        AppPage.this.a(str, str2, AppPage.this.j());
                    }
                }
            });
        } else if (this.h.f != null) {
            this.h.f.a(str2);
        } else {
            this.i = str2;
        }
    }

    private void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f49641b64269807a8c0b135cb6a42840", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f49641b64269807a8c0b135cb6a42840");
            return;
        }
        synchronized (this.w) {
            if (this.h.m) {
                runnable.run();
            } else {
                this.w.add(runnable);
            }
        }
    }

    private void F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e754374feb2a6d5efbcab49b696d91b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e754374feb2a6d5efbcab49b696d91b9");
            return;
        }
        while (true) {
            Runnable poll = this.w.poll();
            if (poll == null) {
                return;
            }
            poll.run();
        }
    }

    private void k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bf55e22c247c75dd833a57b66006b59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bf55e22c247c75dd833a57b66006b59");
            return;
        }
        this.k = str;
        a("lastStatusEvent", (Object) this.k);
    }

    public final int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "946ed0c64fe618b3acb494c57c8e81cf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "946ed0c64fe618b3acb494c57c8e81cf")).intValue() : this.l != -1 ? this.l : hashCode() + this.x;
    }

    @Override // com.meituan.mmp.lib.interfaces.b
    public final String c(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "172c8dffe174475b92145bc329bf7314", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "172c8dffe174475b92145bc329bf7314");
        }
        if (TextUtils.equals("getWebViewWidth", str)) {
            return String.valueOf(com.meituan.mmp.lib.utils.p.b(this.f.getWidth()));
        }
        try {
            str2 = new JSONObject(str2).put("pageId", j()).toString();
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.a("AppPage#invoke", e);
            e.printStackTrace();
        }
        return this.c.l.a(new Event(str, str2, str3), this);
    }

    @Override // com.meituan.mmp.lib.interfaces.b
    public final String a(String[] strArr, String str) {
        Object[] objArr = {strArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e16325e3ffcd271be4ac9e5ef15cdf5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e16325e3ffcd271be4ac9e5ef15cdf5");
        }
        if (this.r == null) {
            this.r = new com.meituan.mmp.lib.service.a() { // from class: com.meituan.mmp.lib.engine.AppPage.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.service.a
                public final void a(final Collection<DioFile> collection, String str2, @Nullable final ValueCallback<String> valueCallback) {
                    Object[] objArr2 = {collection, str2, valueCallback};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54739d92490c2eab7c441100997e9804", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54739d92490c2eab7c441100997e9804");
                        return;
                    }
                    final AppPage appPage = AppPage.this;
                    Object[] objArr3 = {collection, valueCallback};
                    ChangeQuickRedirect changeQuickRedirect3 = AppPage.a;
                    if (PatchProxy.isSupport(objArr3, appPage, changeQuickRedirect3, false, "ca0fa8685c900bf512ccc8e8bb779508", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, appPage, changeQuickRedirect3, false, "ca0fa8685c900bf512ccc8e8bb779508");
                    } else if (collection != null) {
                        if (DebugHelper.d) {
                            appPage.e.post(new Runnable() { // from class: com.meituan.mmp.lib.engine.AppPage.6
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "df3173de53c4c7522153b538c8c1728d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "df3173de53c4c7522153b538c8c1728d");
                                        return;
                                    }
                                    Iterator it = collection.iterator();
                                    while (it.hasNext()) {
                                        com.meituan.mmp.lib.web.b bVar = AppPage.this.f;
                                        bVar.a(String.format("var a = document.createElement('script');\na.src = '%s'; a.async = %s;document.body.appendChild(a);", "mtlocalfile://" + ((DioFile) it.next()).h(), Boolean.FALSE), valueCallback);
                                    }
                                }
                            });
                            return;
                        }
                        final String a2 = com.meituan.mmp.lib.service.d.a(collection, valueCallback);
                        appPage.e.post(new Runnable() { // from class: com.meituan.mmp.lib.engine.AppPage.7
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d423ac675f6b7a178e64cdca1c76b098", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d423ac675f6b7a178e64cdca1c76b098");
                                } else {
                                    AppPage.this.f.a(a2, valueCallback);
                                }
                            }
                        });
                    }
                }
            };
        }
        return com.meituan.mmp.lib.service.d.a(strArr, str, this.d, this.r);
    }

    public final void k() {
        boolean z;
        boolean z2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c26f67b81bfbfc7533d5c6ddb9680802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c26f67b81bfbfc7533d5c6ddb9680802");
            return;
        }
        com.meituan.mmp.lib.engine.d dVar = this.c.i;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.engine.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "bc96fa0a52d64468fd27efb622b12a94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "bc96fa0a52d64468fd27efb622b12a94");
        } else if (dVar.f) {
            com.meituan.mmp.lib.trace.b.b("AppPageManager", "released, destroy webView");
            l();
        } else {
            com.meituan.mmp.lib.config.a aVar = dVar.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.config.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "482015a4e332b9f1d76fe469e2db16ff", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "482015a4e332b9f1d76fe469e2db16ff")).booleanValue();
            } else {
                z = com.meituan.mmp.lib.config.b.x() && aVar.e != null && aVar.e.optBoolean("enableWebViewRecycle", false);
            }
            if (!z) {
                com.meituan.mmp.lib.trace.b.b("AppPageManager", "webView recycle not enabled");
                l();
            } else if (this.g) {
                com.meituan.mmp.lib.trace.b.b("AppPageManager", "webView reder process gone, should destroy");
                l();
            } else {
                String p = com.meituan.mmp.lib.config.a.p(d());
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4396e00dbb88a77ee727b44a4fdd6160", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4396e00dbb88a77ee727b44a4fdd6160")).booleanValue();
                } else if (!this.s.a(c.f)) {
                    com.meituan.mmp.lib.trace.b.c("AppPage", "cannot recycle AppPage in state " + this.s);
                    z2 = false;
                } else {
                    int j = j();
                    com.meituan.mmp.lib.trace.b.b("AppPage", "recycle AppPage that was @" + j + ", " + this.h.c);
                    this.f.a("__startPageParam=undefined", (ValueCallback<String>) null);
                    this.f.a(String.format("__widgetBackgroundColor = '%s'", ""), (ValueCallback<String>) null);
                    this.f.e();
                    if (c() != null) {
                        c().setOnRenderProcessGoneListener(null);
                    }
                    this.h = new d();
                    a(MMPEnvHelper.getContext(), this.d.c());
                    this.l = -1;
                    this.x++;
                    this.w.clear();
                    this.u.clear();
                    this.v.clear();
                    this.n = true;
                    a("onPageRecycle", (String) null);
                    this.s = c.d;
                    t();
                    this.i = null;
                    com.meituan.mmp.lib.trace.b.b("AppPage", "AppPage recycled, @" + j + " -> @" + j());
                    z2 = true;
                }
                if (z2) {
                    dVar.a(this);
                    bb.b("AppPage进入复用池：" + dVar.g.size() + "个, " + p, new Object[0]);
                    dVar.b();
                    return;
                }
                bb.b("AppPage无法复用，销毁：" + p, new Object[0]);
                l();
            }
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "794b934588c6e08f7af45665285a6431", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "794b934588c6e08f7af45665285a6431");
        } else if (this.f != null) {
            this.f.a();
        }
    }

    public final void a(String str, long j, long j2, boolean z, boolean z2) {
        Object[] objArr = {str, new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab971c2b39702fd254289864884d45bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab971c2b39702fd254289864884d45bf");
        } else if (this.h.t) {
        } else {
            this.h.t = true;
            try {
                this.h.i.a(j).b(j2);
                this.h.i.a("widget", Boolean.valueOf(z2));
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fd24966efefba8f39ff9ca00860463d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fd24966efefba8f39ff9ca00860463d");
                } else {
                    this.e.post(new Runnable() { // from class: com.meituan.mmp.lib.engine.AppPage.8
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "14c29e74fb332a62517e29b70fbce6f6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "14c29e74fb332a62517e29b70fbce6f6");
                                return;
                            }
                            long n = AppPage.this.n();
                            AppPage appPage = AppPage.this;
                            Object[] objArr4 = new Object[3];
                            objArr4[0] = AppPage.this.h.g != null ? Long.valueOf(AppPage.this.h.g.j) : com.meituan.android.common.statistics.Constants.UNDEFINED;
                            objArr4[1] = AppPage.this.h.i != null ? Long.valueOf(AppPage.this.h.i.j) : com.meituan.android.common.statistics.Constants.UNDEFINED;
                            objArr4[2] = n >= 0 ? Long.valueOf(n) : com.meituan.android.common.statistics.Constants.UNDEFINED;
                            appPage.a(String.format("__appLaunchStartTime = %s;__pageNavigationStartTime = %s;__routeStartTime = %s", objArr4), (ValueCallback<String>) null);
                        }
                    });
                }
                this.h.i.a("foundationVersion", (Object) this.d.l.mmpSdk.d).a("mmpVersion", (Object) this.d.l.getPublishId()).a("page.path", (Object) str).a("packageName", (Object) this.d.l.getPackageByPath(this.b, str).g).a("cache", Boolean.valueOf(z)).b("mmp.page.load.start", (Map<String, Object>) null);
            } catch (Exception unused) {
            }
        }
    }

    public final boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dad015e70c869e1ec48b9130de763fd2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dad015e70c869e1ec48b9130de763fd2")).booleanValue() : this.h.t;
    }

    public final long n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea777e229f8d2946a863b4a14b49ad89", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea777e229f8d2946a863b4a14b49ad89")).longValue();
        }
        if (this.h.g != null) {
            return this.h.g.j;
        }
        if (this.h.i != null) {
            return this.h.i.j;
        }
        return -1L;
    }

    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c1ca83c590cbf2514e843a8b980a8e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c1ca83c590cbf2514e843a8b980a8e7");
            return;
        }
        k("cancel");
        Object[] objArr2 = {"cancel", null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5bd72e3d83eb217592d0f4de8e5b6a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5bd72e3d83eb217592d0f4de8e5b6a6");
        } else if (this.h.x == null) {
            a("cancel", (HashMap<String, Object>) null);
            p();
        }
        Object[] objArr3 = {"cancel", null};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da4044c24ac1d393cd3bdd7ba1c4a32d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da4044c24ac1d393cd3bdd7ba1c4a32d");
        } else if (this.h.w == null) {
            a("cancel", (HashMap<String, Object>) null);
            p();
        }
    }

    private void a(String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0466a77aa77665a3961389ed68ea285f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0466a77aa77665a3961389ed68ea285f");
        } else if (this.h.w == null) {
            b bVar = new b();
            bVar.a = str;
            bVar.b = hashMap;
            this.h.w = bVar;
        }
    }

    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8802f8a83120260715d06141d76b13f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8802f8a83120260715d06141d76b13f9");
        } else if (this.h.w == null || this.h.v || !this.h.t) {
        } else {
            this.h.v = true;
            this.h.i.a("mmp.page.load.point.first.render", com.meituan.mmp.lib.utils.v.a((Map) com.meituan.mmp.lib.utils.v.a("state", this.h.w.a), (Map) this.h.w.b));
        }
    }

    private void b(String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3884ca5e8381bbef721556be67e76806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3884ca5e8381bbef721556be67e76806");
        } else if (this.h.x == null) {
            b bVar = new b();
            bVar.a = str;
            bVar.b = hashMap;
            this.h.x = bVar;
        }
    }

    public final void q() {
        com.meituan.mmp.lib.trace.h hVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1278597183d41619c5fd5d38fe8787c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1278597183d41619c5fd5d38fe8787c");
        } else if (this.h.x == null || this.h.u || !this.h.t) {
        } else {
            this.h.u = true;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2e3f49ea35d546c9399116a88bb860a", RobustBitConfig.DEFAULT_VALUE)) {
                hVar = (com.meituan.mmp.lib.trace.h) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2e3f49ea35d546c9399116a88bb860a");
            } else if (this.h.g == null) {
                hVar = this.h.i;
            } else {
                hVar = this.h.g;
            }
            hVar.a("mmp.page.load.end", com.meituan.mmp.lib.utils.v.a((Map) com.meituan.mmp.lib.utils.v.a("load.status", this.h.x.a), (Map) this.h.x.b));
        }
    }

    @Override // com.meituan.mmp.lib.web.f
    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69969a7c1b888f89c330c27648f31096", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69969a7c1b888f89c330c27648f31096");
        } else if (this.j != null) {
            this.j.a(exc);
        }
    }

    void a(JSONArray jSONArray, long j) {
        Object[] objArr = {jSONArray, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be8909bfd6c317cf64bf8090925da673", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be8909bfd6c317cf64bf8090925da673");
            return;
        }
        e eVar = this.c != null ? this.c.h : null;
        if (eVar != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            for (MMPPackageInfo mMPPackageInfo : PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "883c3a99b3145300d4d1a9463e7f0ea0", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "883c3a99b3145300d4d1a9463e7f0ea0") : Collections.unmodifiableList(eVar.f)) {
                if (mMPPackageInfo != null && mMPPackageInfo.k > 0 && mMPPackageInfo.l > 0 && (j <= 0 || mMPPackageInfo.l + mMPPackageInfo.k >= j)) {
                    com.meituan.mmp.lib.preformance.c b2 = new com.meituan.mmp.lib.preformance.c().a("loadPackage").b("downloadPackage").a(mMPPackageInfo.k).b(mMPPackageInfo.l + mMPPackageInfo.k);
                    try {
                        b2.put("packageName", mMPPackageInfo.g);
                        b2.put("packageSize", mMPPackageInfo.m);
                    } catch (JSONException e) {
                        com.meituan.mmp.lib.trace.b.a(e);
                    }
                    jSONArray.put(b2);
                }
            }
        }
    }

    public final com.meituan.mmp.lib.trace.h r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e2ac3f9c3d4715dbfc52260d4f83d61", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.trace.h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e2ac3f9c3d4715dbfc52260d4f83d61");
        }
        com.meituan.mmp.lib.trace.h hVar = null;
        if (this.h != null && this.h.i != null) {
            hVar = this.h.i;
        }
        return hVar == null ? new com.meituan.mmp.lib.trace.h(this.b, "unknown") : hVar;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58642655a76641a86dfdfd63b212ea52", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58642655a76641a86dfdfd63b212ea52");
        }
        return "AppPage{@" + Integer.toHexString(hashCode()) + ", appId: " + this.d.c() + ", path: " + d() + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }

    private void G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90b3d1a23f7b259ae6ee0dd7a07c39cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90b3d1a23f7b259ae6ee0dd7a07c39cb");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("AppPage", "SetWidgetBackgroundColor");
        com.meituan.mmp.lib.a b2 = this.c.b(j());
        if (b2 != null) {
            a(String.format("__widgetBackgroundColor = '%s'", b2.F()), (ValueCallback<String>) null);
        } else {
            com.meituan.mmp.lib.trace.b.b("AppPage", "SetWidgetBackgroundColor containerController is null");
        }
    }
}
