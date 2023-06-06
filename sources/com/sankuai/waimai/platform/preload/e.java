package com.sankuai.waimai.platform.preload;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.h;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.preload.f;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.router.core.j;
import java.util.ConcurrentModificationException;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final String[] d = {"WM_RPM"};
    private static final Executor e = com.sankuai.android.jarvis.c.a("WM_RPM_LOG");
    private static final Executor f = com.sankuai.android.jarvis.c.a("WM_RPM_TASK");
    public Set<String> b;
    private final f c;
    private final AtomicInteger g;
    private final SparseArray<f<?>> h;
    private final int i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static e a = new e();
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a395ef03ddc90fd61ee401526c3ce9d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a395ef03ddc90fd61ee401526c3ce9d0");
            return;
        }
        this.c = new f(0L);
        this.g = new AtomicInteger(1000);
        this.h = new SparseArray<>();
        this.i = Process.myPid();
    }

    public static e a() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "5f8cf726e936b81fcec6f3b3a9d66189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "5f8cf726e936b81fcec6f3b3a9d66189");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("PreloadManager", str, objArr);
        c(str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "51acd1966bc12acc192a70d6e5a2a4fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "51acd1966bc12acc192a70d6e5a2a4fc");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.d("PreloadManager", str, objArr);
        c(str, objArr);
    }

    private void c(final String str, final Object[] objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "819080dbdc21ff331b6b06a43e2a91b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "819080dbdc21ff331b6b06a43e2a91b2");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(e, new Runnable() { // from class: com.sankuai.waimai.platform.preload.e.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "7f0000f7ef8ce0d8d105588f5cc5f660", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "7f0000f7ef8ce0d8d105588f5cc5f660");
                    } else {
                        com.dianping.networklog.c.a(String.format(str, objArr), 3, e.d);
                    }
                }
            });
        }
    }

    public final int a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77ce778c4789e8030f14a2a806c17dd3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77ce778c4789e8030f14a2a806c17dd3")).intValue() : a(jVar, true);
    }

    private synchronized void a(j jVar, int i) {
        Object[] objArr = {jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3598e4dd11f10b34665726c20d4d5ca0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3598e4dd11f10b34665726c20d4d5ca0");
            return;
        }
        Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra", null);
        if (bundle == null) {
            bundle = new Bundle();
            jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle);
        }
        bundle.putInt("_wm_preload_page_id_", i);
        bundle.putInt("_wm_preload_pid_", this.i);
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca8c950853defe192198143ca3f1bffb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca8c950853defe192198143ca3f1bffb")).booleanValue() : this.b != null && this.b.contains(str);
    }

    @MainThread
    public final <T> void a(Activity activity, @NonNull c<T> cVar) {
        f<?> fVar;
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "903f473dc42e735d22fa5c167651ce3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "903f473dc42e735d22fa5c167651ce3f");
        } else if (com.sankuai.waimai.foundation.utils.f.a(activity)) {
            b("get preload result for dead page: %s", String.valueOf(activity));
        } else {
            int a2 = a(activity);
            if (a2 < 1000) {
                cVar.a(this.c);
                b("get preload result fail, invalid pageId: %d, page: %s", Integer.valueOf(a2), String.valueOf(activity));
                return;
            }
            synchronized (this.h) {
                fVar = this.h.get(a2);
                if (fVar != null) {
                    this.h.remove(a2);
                }
            }
            if (fVar == null) {
                cVar.a(this.c);
                b("get preload result empty, pageId: %d, page: %s", Integer.valueOf(a2), String.valueOf(activity));
                return;
            }
            fVar.a(cVar, activity);
            a("register preload callback, pageId: %d, page: %s", Integer.valueOf(a2), String.valueOf(activity));
        }
    }

    private int a(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d67ed83f4d3c6b0b616f6f00326f31d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d67ed83f4d3c6b0b616f6f00326f31d")).intValue();
        }
        Intent intent = activity.getIntent();
        if (intent == null) {
            return 0;
        }
        int a2 = a(intent, "_wm_preload_pid_", -1);
        if (a2 == this.i) {
            int a3 = a(intent, "_wm_preload_page_id_overridable_", 0);
            return a3 != 0 ? a3 : a(intent, "_wm_preload_page_id_", 0);
        }
        if (a2 != -1) {
            a.AbstractC1040a b2 = new h().a("PreloadManager").b("preload_pid_mismatch");
            i.d(b2.c("current:" + this.i + "!=" + a2).b());
        }
        return 0;
    }

    private int a(Intent intent, String str, int i) {
        Object[] objArr = {intent, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5117b40da4680b73c162530307d85d33", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5117b40da4680b73c162530307d85d33")).intValue();
        }
        int a2 = com.sankuai.waimai.platform.utils.f.a(intent, str, i);
        if (a2 != i) {
            try {
                intent.removeExtra(str);
            } catch (ConcurrentModificationException unused) {
            }
        }
        return a2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b implements d<Object> {
        public static ChangeQuickRedirect a;
        final Uri b;
        final int c;
        final f<Object> d;
        private final MetricsSpeedMeterTask f;

        public b(Uri uri, int i, f<Object> fVar, MetricsSpeedMeterTask metricsSpeedMeterTask) {
            Object[] objArr = {e.this, uri, Integer.valueOf(i), fVar, metricsSpeedMeterTask};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c23d153edaf177e69ca402b3677cdc5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c23d153edaf177e69ca402b3677cdc5");
                return;
            }
            this.b = uri;
            this.c = i;
            this.d = fVar;
            this.f = metricsSpeedMeterTask;
        }

        @Override // com.sankuai.waimai.platform.preload.d
        public final void a(final Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f43c66728cade444f756b2e44c7d753d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f43c66728cade444f756b2e44c7d753d");
                return;
            }
            e.this.a("preload request success for %s, id:%d", this.b.getPath(), Integer.valueOf(this.c));
            ad.a(new Runnable() { // from class: com.sankuai.waimai.platform.preload.e.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13f0d187fd587810fa6eec40d3952fe3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13f0d187fd587810fa6eec40d3952fe3");
                    } else {
                        b.this.d.a(f.a.SUCCESS, obj, true);
                    }
                }
            });
            synchronized (e.this.h) {
                if (e.this.h.get(this.c) != null) {
                    l.a(new Runnable() { // from class: com.sankuai.waimai.platform.preload.e.b.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0e5a2371c4364925bfe5ea6bc7ca7ef", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0e5a2371c4364925bfe5ea6bc7ca7ef");
                                return;
                            }
                            synchronized (e.this.h) {
                                if (e.this.h.get(b.this.c) != null) {
                                    e.this.h.remove(b.this.c);
                                    e.this.b("result expired after 15s, id:%d", Integer.valueOf(b.this.c));
                                    i.d(new h().a("PreloadManager").b("result_expired").c(b.this.b.getPath()).b());
                                }
                            }
                        }
                    }, 15000, (String) null);
                }
            }
            com.sankuai.meituan.takeoutnew.util.aop.h.a(this.f.recordStep(this.b.getPath()));
        }

        @Override // com.sankuai.waimai.platform.preload.d
        public final void b(final Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "969328624cb6d12ae3399777c1d0ac6e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "969328624cb6d12ae3399777c1d0ac6e");
                return;
            }
            e.this.a("update partial data for %s, id:%d", this.b.getPath(), Integer.valueOf(this.c));
            ad.a(new Runnable() { // from class: com.sankuai.waimai.platform.preload.e.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70d66e6797cf346561c067a761ec43fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70d66e6797cf346561c067a761ec43fb");
                    } else {
                        b.this.d.a(f.a.SUCCESS, obj, false);
                    }
                }
            });
        }

        @Override // com.sankuai.waimai.platform.preload.d
        public final void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "723c58dd4a6302680b0f84f200c86edb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "723c58dd4a6302680b0f84f200c86edb");
                return;
            }
            e.this.a("cancel request for %s, id:%d", this.b.getPath(), Integer.valueOf(this.c));
            ad.a(new Runnable() { // from class: com.sankuai.waimai.platform.preload.e.b.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1da692d42a5ea6d3afeb9da9c5c9775", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1da692d42a5ea6d3afeb9da9c5c9775");
                    } else {
                        b.this.d.a(f.a.UNKNOWN, e.this.c, true);
                    }
                }
            });
            synchronized (e.this.h) {
                e.this.h.remove(this.c);
            }
        }
    }

    private int a(j jVar, boolean z) {
        Object[] objArr = {jVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c87587262de388557ec10c5def1a46a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c87587262de388557ec10c5def1a46a")).intValue();
        }
        final Uri uri = jVar.d;
        if (a(uri.getPath())) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            final int intValue = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20074476aa2a923b1731e05601a268e0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20074476aa2a923b1731e05601a268e0")).intValue() : this.g.addAndGet(1);
            a(jVar, intValue);
            a("create preload for %s, id:%d", uri.getPath(), Integer.valueOf(intValue));
            final PreloadRunnable preloadRunnable = (PreloadRunnable) com.sankuai.waimai.router.a.a(PreloadRunnable.class, uri.getPath());
            if (preloadRunnable == null) {
                b("get preload service failed for %s, id:%d", uri.getPath(), Integer.valueOf(intValue));
                i.d(new h().a("PreloadManager").b("service_load_failed").c(uri.getPath()).b());
                return intValue;
            }
            final f<?> fVar = new f<>(SystemClock.elapsedRealtime());
            fVar.a(f.a.LOADING, null, false);
            synchronized (this.h) {
                this.h.put(intValue, fVar);
            }
            final Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
            final Uri uri2 = jVar.d;
            com.sankuai.waimai.launcher.util.aop.b.a(f, new Runnable() { // from class: com.sankuai.waimai.platform.preload.e.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fa24a0315f6bfb0631fe5cb4816bcfab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fa24a0315f6bfb0631fe5cb4816bcfab");
                        return;
                    }
                    e.this.a("start preload for %s, id:%d", uri.getPath(), Integer.valueOf(intValue));
                    preloadRunnable.run(bundle, uri2, new b(uri, intValue, fVar, MetricsSpeedMeterTask.createCustomSpeedMeterTask("takeout/preload/tasks")));
                }
            });
            return intValue;
        }
        return 0;
    }
}
