package com.meituan.msc.modules.engine.requestPrefetch;

import android.app.Activity;
import android.support.annotation.AnyThread;
import android.text.TextUtils;
import com.meituan.msc.common.executor.a;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.modules.api.network.FetchTokenResponse;
import com.meituan.msc.modules.engine.j;
import com.meituan.msc.modules.page.render.MSCHornPerfConfig;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static final ExecutorService l;
    long b;
    public h c;
    String d;
    final a e;
    public volatile boolean f;
    private final com.meituan.msc.modules.engine.h g;
    private volatile String h;
    private volatile FetchTokenResponse i;
    private final List<com.meituan.msc.common.framework.a<FetchTokenResponse>> j;
    private final e k;
    private volatile b m;

    static {
        if (MSCHornPerfConfig.d().g()) {
            l = a.c.a();
        } else {
            l = com.sankuai.android.jarvis.c.a("msc-data-prefetch");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum b {
        NOT_STARTED,
        PREPARING_DATA,
        REQUESTING,
        SUCCESS,
        FAIL,
        CANCELED;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2a858c481a94069c63bf7857f4d1f80", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2a858c481a94069c63bf7857f4d1f80");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c834494f1016d8a3b8da7ba007479b9c", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c834494f1016d8a3b8da7ba007479b9c") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0df3ec9d5a7a3d5aa16138ab019ef37", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0df3ec9d5a7a3d5aa16138ab019ef37") : (b[]) values().clone();
        }
    }

    public f(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32c783e96e1857a2ac2b70868e2acbd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32c783e96e1857a2ac2b70868e2acbd4");
            return;
        }
        this.j = new CopyOnWriteArrayList();
        this.b = -1L;
        this.e = new a();
        this.k = new e();
        this.f = false;
        this.m = b.NOT_STARTED;
        this.g = hVar;
    }

    public final synchronized void a(com.meituan.msc.common.framework.a<FetchTokenResponse> aVar) {
        String str;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce6819fc48c68aaaf5206037d323a4c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce6819fc48c68aaaf5206037d323a4c1");
            return;
        }
        PerfTrace.online().a("getBackgroundFetchData");
        if (this.m == b.NOT_STARTED) {
            PerfTrace.online().b("getBackgroundFetchData");
            aVar.a("fetch not started", null);
            str = "notStarted";
        } else if (this.m == b.SUCCESS) {
            this.i.__mtFinishTimeStamp = System.currentTimeMillis();
            aVar.a(this.i);
            str = "success";
            PerfTrace.online().b("getBackgroundFetchData");
        } else if (this.m == b.FAIL) {
            aVar.a(this.h, null);
            str = "fail";
            PerfTrace.online().b("getBackgroundFetchData");
        } else {
            this.j.add(aVar);
            str = "fetching";
        }
        this.e.a().b("msc.launch.point.request.prefetch.get").a("state", str).b();
    }

    public final boolean a() {
        return this.m != b.NOT_STARTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        return this.m == b.SUCCESS || this.m == b.FAIL || this.m == b.CANCELED;
    }

    @AnyThread
    public final void a(final Activity activity, final String str, final int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2359a9d58e04901d1f7dd1b8fc0f4d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2359a9d58e04901d1f7dd1b8fc0f4d64");
            return;
        }
        this.b = System.currentTimeMillis();
        this.c = h.PAGE_START;
        this.d = str;
        if (b()) {
            this.e.a().d("msc.duration.request.prefetch.total");
            PerfTrace.online().a("request_prefetch").a("targetPath", str);
            PerfTrace.online().a("request_prefetch_prepare");
            l.execute(new Runnable() { // from class: com.meituan.msc.modules.engine.requestPrefetch.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8bb52aabb1f1aa0bf4c8decf229688d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8bb52aabb1f1aa0bf4c8decf229688d8");
                        return;
                    }
                    f.this.a(activity, str, i, false);
                    aw.b("在PageStart时发起数据预拉取", new Object[0]);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final Activity activity, final String str, final int i, boolean z) {
        Object[] objArr = {activity, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2080b503315c32e7c6e9b1498ac457ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2080b503315c32e7c6e9b1498ac457ff");
            return;
        }
        final AppMetaInfoWrapper appMetaInfoWrapper = this.g.r.h;
        if (appMetaInfoWrapper == null) {
            PerfTrace.online().b("request_prefetch");
            return;
        }
        final String a2 = a(str, appMetaInfoWrapper);
        if (TextUtils.isEmpty(a2)) {
            a(appMetaInfoWrapper);
            PerfTrace.online().b("request_prefetch");
            return;
        }
        final PrefetchConfig prefetchConfig = appMetaInfoWrapper.getPrefetchConfig(a2);
        if (prefetchConfig == null || TextUtils.isEmpty(prefetchConfig.url)) {
            com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "requestPrefetchConfig is null or url is null!");
            PerfTrace.online().b("request_prefetch");
        } else if (z) {
            this.f = true;
            l.execute(new Runnable() { // from class: com.meituan.msc.modules.engine.requestPrefetch.f.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ae4f68e619d66fee680c207c066b4ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ae4f68e619d66fee680c207c066b4ca");
                    } else {
                        f.this.a(activity, str, a2, i, prefetchConfig, appMetaInfoWrapper);
                    }
                }
            });
        } else {
            a(activity, str, a2, i, prefetchConfig, appMetaInfoWrapper);
        }
    }

    private static String a(String str, AppMetaInfoWrapper appMetaInfoWrapper) {
        Object[] objArr = {str, appMetaInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c81114d2d6cd43c65d241a020e15661", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c81114d2d6cd43c65d241a020e15661");
        }
        String b2 = am.b(str);
        return TextUtils.isEmpty(b2) ? appMetaInfoWrapper.getMainPath() : b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, String str, String str2, int i, PrefetchConfig prefetchConfig, AppMetaInfoWrapper appMetaInfoWrapper) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i), prefetchConfig, appMetaInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff7e517a054bea2059ab70943c555b41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff7e517a054bea2059ab70943c555b41");
            return;
        }
        this.m = b.PREPARING_DATA;
        String a2 = this.g.a();
        com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "start RequestPrefetch: ", a2);
        d dVar = new d();
        dVar.b = prefetchConfig;
        dVar.c = appMetaInfoWrapper.getBuildId();
        dVar.d = str2;
        dVar.e = am.c(str);
        dVar.f = i;
        dVar.g = a2;
        dVar.h = this.g.r;
        a(str2, prefetchConfig.url, prefetchConfig.timeout, a2);
        c cVar = new c();
        if (c.a(prefetchConfig.locationConfig)) {
            cVar.a(activity, this.e, dVar, new g(this.k));
        } else {
            this.k.a(dVar, this.e, null);
        }
    }

    private void a(final String str, final String str2, final long j, final String str3) {
        Object[] objArr = {str, str2, new Long(j), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca6d8711a96bce14ee59a3e5f856d1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca6d8711a96bce14ee59a3e5f856d1d");
        } else if (j > 0) {
            com.meituan.msc.common.executor.a.b.schedule(new Runnable() { // from class: com.meituan.msc.modules.engine.requestPrefetch.f.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d17c30adb84215cbeafe8f0bc23be613", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d17c30adb84215cbeafe8f0bc23be613");
                    } else if (f.this.d()) {
                    } else {
                        com.meituan.msc.modules.reporter.g.d("request prefetch timeout:", Long.valueOf(j), "ms,", str3);
                        f.this.e.a("timeout", str, str2);
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114f8e70250fe3b2d9e6779dbeef1784", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114f8e70250fe3b2d9e6779dbeef1784")).booleanValue();
        }
        if (!com.meituan.msc.common.config.b.E()) {
            com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "close prefetch by horn!");
            return false;
        } else if (this.m != b.NOT_STARTED) {
            com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "prefetch already started, status:", this.m);
            return false;
        } else if (this.g == null) {
            com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "prefetch needs runtime");
            return false;
        } else {
            return true;
        }
    }

    public final synchronized void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8379873de7557d4f3a6cb755f6c83ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8379873de7557d4f3a6cb755f6c83ba");
        } else if (!d()) {
            PerfTrace.online().b("request_prefetch");
            this.m = b.CANCELED;
            this.h = "canceled";
            com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "request prefetch for", this.g.r.j(), " fail:", this.h);
            a(this.k.b, this.k.c, "cancel", false);
            if (!this.j.isEmpty()) {
                for (com.meituan.msc.common.framework.a<FetchTokenResponse> aVar : this.j) {
                    aVar.a(this.h, null);
                }
                this.j.clear();
                PerfTrace.online().b("getBackgroundFetchData");
            }
            this.k.cancel();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dc2a1c3db8fdbaae52aed068e4b2048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dc2a1c3db8fdbaae52aed068e4b2048");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "reset, status:", this.m);
        cancel();
        this.m = b.NOT_STARTED;
        this.b = -1L;
        this.c = null;
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, boolean z) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba0109c4ba747a736088bd1dd824269", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba0109c4ba747a736088bd1dd824269");
        } else {
            this.e.a().b("msc.launch.point.request.prefetch.rate").a("pagePath", str).a("url", str2).a("errorMessage", str3).a(z ? 1.0d : 0.0d).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {f.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1745a50edfa3619660b5e585c97290dc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1745a50edfa3619660b5e585c97290dc");
            }
        }

        public final j a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c79c52c2a0cff945b10315fe4b1f236", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c79c52c2a0cff945b10315fe4b1f236") : f.this.g.p;
        }

        public final synchronized void a(FetchTokenResponse fetchTokenResponse, d dVar) {
            Object[] objArr = {fetchTokenResponse, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c47cbb0422a49c2a65838f018ff41f81", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c47cbb0422a49c2a65838f018ff41f81");
            } else if (!f.this.d()) {
                PerfTrace.online().b("request_prefetch");
                f.this.m = b.SUCCESS;
                f.this.i = fetchTokenResponse;
                com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "request prefetch for", f.this.g.r.j(), "success");
                f.this.a(dVar.b.pagePath, dVar.b.url, (String) null, true);
                if (!f.this.j.isEmpty()) {
                    for (com.meituan.msc.common.framework.a aVar : f.this.j) {
                        fetchTokenResponse.__mtFinishTimeStamp = System.currentTimeMillis();
                        aVar.a(fetchTokenResponse);
                    }
                    com.meituan.msc.modules.reporter.preformance.c cVar = f.this.g.G;
                    String str = dVar.d;
                    long j = f.this.b;
                    Object[] objArr2 = {str, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.reporter.preformance.c.a;
                    if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "1b22b141a70aec58612ea96da32382a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "1b22b141a70aec58612ea96da32382a7");
                    } else {
                        cVar.a(new com.meituan.msc.modules.reporter.preformance.b().a("mt").b("dataPrefetch").d(str).a(j).b(System.currentTimeMillis()));
                    }
                    f.this.j.clear();
                    PerfTrace.online().b("getBackgroundFetchData");
                }
                f.this.e.a().b("msc.duration.request.prefetch.total").a("pagePath", dVar.b.pagePath).a("url", dVar.b.url).a().b();
            }
        }

        public final synchronized void a(String str, String str2, String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f06ba8ab7b52cbfbf259702e8363b446", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f06ba8ab7b52cbfbf259702e8363b446");
            } else if (!f.this.d()) {
                f.this.k.cancel();
                PerfTrace.online().b("request_prefetch");
                f.this.m = b.FAIL;
                f.this.h = str;
                com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "request prefetch for", f.this.g.r.j(), "fail:", str);
                f.this.a(str2, str3, str, false);
                if (!f.this.j.isEmpty()) {
                    for (com.meituan.msc.common.framework.a aVar : f.this.j) {
                        aVar.a(str, null);
                    }
                    f.this.j.clear();
                    PerfTrace.online().b("getBackgroundFetchData");
                }
            }
        }
    }

    private void a(AppMetaInfoWrapper appMetaInfoWrapper) {
        Object[] objArr = {appMetaInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a96c8a068a75abf53ff7a38dabdfa6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a96c8a068a75abf53ff7a38dabdfa6c");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "RequestPrefetch failed targetPath is null and metaInfo mainPath is null!");
        com.meituan.msc.modules.reporter.g.d("RequestPrefetchManager", "metaInfo:", appMetaInfoWrapper.getMetaInfoToString());
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae945ebe6323d8395d79d4029336a74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae945ebe6323d8395d79d4029336a74")).booleanValue();
        }
        if (this.c != h.PAGE_OUTSIDE) {
            return false;
        }
        Boolean bool = null;
        if (this.i != null) {
            bool = Boolean.valueOf(b(str));
            if (bool.booleanValue()) {
                return true;
            }
        }
        if (this.m != b.NOT_STARTED) {
            if (bool == null) {
                bool = Boolean.valueOf(b(str));
            }
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c6459b84ccb8f9819bb7ab92759c4a6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c6459b84ccb8f9819bb7ab92759c4a6")).booleanValue() : str != null && this.d != null && str.startsWith("/pages/store/index") && this.d.startsWith("/pages/store/index");
    }
}
