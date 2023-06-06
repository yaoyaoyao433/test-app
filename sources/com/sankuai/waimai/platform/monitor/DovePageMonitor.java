package com.sankuai.waimai.platform.monitor;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.MainThread;
import android.support.annotation.WorkerThread;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.mrn.router.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProActivityDelegate;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.log.c;
import com.sankuai.waimai.platform.machpro.container.WMMPActivity;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class DovePageMonitor {
    public static ChangeQuickRedirect a;
    private static final ConcurrentHashMap<Integer, a> b = new ConcurrentHashMap<>();
    private static final com.sankuai.waimai.platform.utils.lifecycle.a c = new b();

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface MonitorCodes {
    }

    public static /* synthetic */ void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f621dc2c082e961dda45b4699a3aaae9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f621dc2c082e961dda45b4699a3aaae9");
            return;
        }
        int d = d(activity);
        if (b.containsKey(Integer.valueOf(d))) {
            return;
        }
        b.put(Integer.valueOf(d), new a(d(activity), activity));
    }

    public static /* synthetic */ void c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31ea2f89130c1eac92d37c33d113dcaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31ea2f89130c1eac92d37c33d113dcaa");
        } else {
            a(activity, 20003);
        }
    }

    @MainThread
    public static void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3db0d52c54d2d94fce28cf0261bfab67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3db0d52c54d2d94fce28cf0261bfab67");
            return;
        }
        application.unregisterActivityLifecycleCallbacks(c);
        application.registerActivityLifecycleCallbacks(c);
    }

    @WorkerThread
    @MainThread
    public static void a(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5fed8cef1c56586ef9a54a17d5f3e99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5fed8cef1c56586ef9a54a17d5f3e99");
        } else if (activity == null) {
        } else {
            b(d(activity), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        public long b;
        public int c;
        public String d;
        private int e;
        private final WeakReference<Activity> f;

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a38bd55b53011ee82fe8e18f7df9022", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a38bd55b53011ee82fe8e18f7df9022");
                return;
            }
            Activity activity = this.f.get();
            if (activity == null || activity != com.sankuai.waimai.foundation.utils.activity.a.a().b() || !(activity instanceof com.sankuai.waimai.platform.monitor.b) || !((com.sankuai.waimai.platform.monitor.b) activity).g()) {
                DovePageMonitor.b(this.c, IjkMediaPlayer.FFP_PROP_INT64_AUDIO_DECODER);
            } else {
                ad.a(this, this.e);
            }
        }

        public a(int i, Activity activity) {
            Object[] objArr = {Integer.valueOf(i), activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e3068ab7ffc74565c3965d6fb9ed96a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e3068ab7ffc74565c3965d6fb9ed96a");
                return;
            }
            this.b = SystemClock.elapsedRealtime();
            this.c = i;
            this.d = Integer.toHexString(i);
            this.f = new WeakReference<>(activity);
            int x = com.sankuai.waimai.platform.utils.sharedpreference.a.x();
            if (x > 0) {
                this.e = x;
                ad.a(this, x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(Activity activity) {
        Uri data;
        String queryParameter;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4fcb1a05f0edd024547ba6cdb3ee4b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4fcb1a05f0edd024547ba6cdb3ee4b7")).intValue();
        }
        if (activity instanceof com.sankuai.waimai.platform.monitor.a) {
            return -574850954;
        }
        try {
            if (activity instanceof MRNBaseActivity) {
                Uri data2 = activity.getIntent().getData();
                if (data2 != null) {
                    return new d(data2).g().hashCode();
                }
            } else if ((activity instanceof WMMPActivity) && (data = activity.getIntent().getData()) != null && (queryParameter = data.getQueryParameter(WMMachProActivityDelegate.MP_ENTRY)) != null) {
                return queryParameter.hashCode();
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
        return activity.getClass().getName().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    @MainThread
    public static void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8babb4df0390ecd6e1db421bd90c45b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8babb4df0390ecd6e1db421bd90c45b9");
            return;
        }
        a aVar = b.get(Integer.valueOf(i));
        if (aVar != null) {
            ad.b(aVar);
            b.remove(Integer.valueOf(i));
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - aVar.b);
            c a2 = c.a();
            a2.a(i2, elapsedRealtime, "dovemon/pv/" + aVar.d);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends com.sankuai.waimai.platform.utils.lifecycle.a {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // com.sankuai.waimai.platform.utils.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] objArr = {activity, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7bc8155115f753bf54e7522cfb8704d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7bc8155115f753bf54e7522cfb8704d");
                return;
            }
            Set<String> y = com.sankuai.waimai.platform.utils.sharedpreference.a.y();
            if (y == null || y.isEmpty() || !y.contains(activity.getClass().getName())) {
                return;
            }
            DovePageMonitor.a(activity);
        }

        @Override // com.sankuai.waimai.platform.utils.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a72a020442e3e41f89407e9c1bbc2e38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a72a020442e3e41f89407e9c1bbc2e38");
            } else if (DovePageMonitor.b.containsKey(Integer.valueOf(DovePageMonitor.d(activity)))) {
                DovePageMonitor.c(activity);
            }
        }
    }
}
