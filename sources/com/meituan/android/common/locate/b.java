package com.meituan.android.common.locate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.meituan.android.common.locate.MtLocationInfo;
import com.meituan.android.common.locate.loader.MtLocationLoader;
import com.meituan.android.common.locate.loader.strategy.NaviInstant;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.platform.logs.h;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.FakeMainThread;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class b {
    private static long b;
    public static ChangeQuickRedirect changeQuickRedirect;
    public Handler a;
    private long c;
    private MtLocationInfo d;
    private MtLocationInfo e;
    private Context f;
    private long g;
    private HashSet<MtLocationInfo.MtLocationInfoListener> h;
    private HashSet<MtLocationInfo.MtLocationInfoListener> i;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7238a3a4ca39744201c5dd6247eb699a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7238a3a4ca39744201c5dd6247eb699a");
            return;
        }
        this.a = new Handler(Looper.getMainLooper());
        this.g = MetricsAnrManager.ANR_THRESHOLD;
        this.f = context;
    }

    private void a(MtLocationInfo mtLocationInfo) {
        Object[] objArr = {mtLocationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a63d5f154de8aab8cbdc1be2d48f0efc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a63d5f154de8aab8cbdc1be2d48f0efc");
            return;
        }
        LogUtils.a("MasterLocatorImpl notifyNaviInstant");
        Iterator it = new ArrayList(this.i).iterator();
        while (it.hasNext()) {
            MtLocationInfo.MtLocationInfoListener mtLocationInfoListener = (MtLocationInfo.MtLocationInfoListener) it.next();
            if ((mtLocationInfoListener instanceof MtLocationLoader) && (((MtLocationLoader) mtLocationInfoListener).getAdopter() instanceof NaviInstant)) {
                a(mtLocationInfoListener, mtLocationInfo);
            }
        }
        Iterator it2 = new ArrayList(this.h).iterator();
        while (it2.hasNext()) {
            MtLocationInfo.MtLocationInfoListener mtLocationInfoListener2 = (MtLocationInfo.MtLocationInfoListener) it2.next();
            if ((mtLocationInfoListener2 instanceof MtLocationLoader) && (((MtLocationLoader) mtLocationInfoListener2).getAdopter() instanceof NaviInstant)) {
                a(mtLocationInfoListener2, mtLocationInfo);
            }
        }
    }

    private boolean a(final MtLocationInfo.MtLocationInfoListener mtLocationInfoListener, final MtLocationInfo mtLocationInfo) {
        Object[] objArr = {mtLocationInfoListener, mtLocationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f654f99bea19ff71714ba7c3024df7cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f654f99bea19ff71714ba7c3024df7cc")).booleanValue();
        }
        if (mtLocationInfoListener instanceof MtLocationLoader) {
            LogUtils.a("MasterLocatorImpl postInfo2Listener");
            return mtLocationInfoListener.onLocationGot(mtLocationInfo);
        }
        this.a.post(new Runnable() { // from class: com.meituan.android.common.locate.b.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4729b1548221ef62461de0f917619eef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4729b1548221ef62461de0f917619eef");
                } else if (mtLocationInfoListener != null) {
                    mtLocationInfoListener.onLocationGot(mtLocationInfo);
                }
            }
        });
        return true;
    }

    private boolean a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0d7843373873467f5c45bd8589d2e19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0d7843373873467f5c45bd8589d2e19")).booleanValue();
        }
        if (obj instanceof com.meituan.android.common.locate.loader.a) {
            return ((com.meituan.android.common.locate.loader.a) obj).isNoUseCache();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MtLocationInfo mtLocationInfo) {
        Object[] objArr = {mtLocationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fc33e42a1f5df42f43e6f2c5bad558a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fc33e42a1f5df42f43e6f2c5bad558a");
            return;
        }
        LogUtils.a("MasterLocatorImpl notifyNewMtLocation");
        Iterator it = new ArrayList(this.i).iterator();
        while (it.hasNext()) {
            a((MtLocationInfo.MtLocationInfoListener) it.next(), mtLocationInfo);
        }
        Iterator it2 = new ArrayList(this.h).iterator();
        while (it2.hasNext()) {
            LogUtils.a("MasterLocatorImpl activeMtListeners got");
            a((MtLocationInfo.MtLocationInfoListener) it2.next(), mtLocationInfo);
        }
    }

    private long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a11aef8e41935d021c31d46bcbdbb48", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a11aef8e41935d021c31d46bcbdbb48")).longValue();
        }
        long b2 = f.b().getBoolean("is_use_new_change_strategy", true) ? com.meituan.android.common.locate.strategy.b.a().b() * 2 : this.g;
        LogUtils.a("pastTime =" + b2);
        return b2;
    }

    private void c(MtLocation mtLocation) {
        Bundle extras;
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fd60f00cab87ac2346e404dc55f51fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fd60f00cab87ac2346e404dc55f51fd");
        } else if (mtLocation == null || (extras = mtLocation.getExtras()) == null) {
        } else {
            extras.putInt("extra_from_master_cache", 1);
        }
    }

    private void c(MtLocationInfo mtLocationInfo) {
        final String str;
        final long j;
        final long j2;
        Object[] objArr = {mtLocationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf12ac83e2036215157858ce2173d8a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf12ac83e2036215157858ce2173d8a2");
        } else if (mtLocationInfo == null || mtLocationInfo.location == null) {
        } else {
            MtLocation mtLocation = mtLocationInfo.location;
            if (LocationUtils.isValidLatLon(mtLocation)) {
                final long time = mtLocation.getTime();
                final String valueOf = String.valueOf(mtLocation.getLatitude());
                final String valueOf2 = String.valueOf(mtLocation.getLongitude());
                final String valueOf3 = String.valueOf(mtLocation.getAccuracy());
                Bundle extras = mtLocation.getExtras();
                if (extras != null) {
                    long j3 = extras.getLong(GearsLocator.MT_CITY_ID, -1L);
                    long j4 = extras.getLong(GearsLocator.DP_CITY_ID, -1L);
                    str = extras.getString(GearsLocator.DP_NAME, "");
                    j = j4;
                    j2 = j3;
                } else {
                    str = "";
                    j = -1;
                    j2 = -1;
                }
                if (SystemClock.elapsedRealtime() - b > 30000) {
                    FakeMainThread.getInstance().postDelay(new Runnable() { // from class: com.meituan.android.common.locate.b.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fc7256f3a435cac13a2a29a666b4d80b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fc7256f3a435cac13a2a29a666b4d80b");
                            } else if (b.this.f != null) {
                                try {
                                    SharedPreferences.Editor c = f.c();
                                    c.putString("last_lat", valueOf);
                                    c.putString("last_lng", valueOf2);
                                    c.putLong("last_time", time);
                                    c.putLong("last_dpcity", j);
                                    c.putLong("last_mtcity", j2);
                                    c.putString("last_accu", valueOf3);
                                    c.putString("last_dpname", str);
                                    c.apply();
                                } catch (Exception e) {
                                    LogUtils.a(MasterLocatorImpl.class, e);
                                }
                            }
                        }
                    }, 1000L);
                    b = SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7a0675842396868fbbc214c2062ae9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7a0675842396868fbbc214c2062ae9f");
            return;
        }
        if (this.d != null && this.d.location != null && LocationUtils.isValidLatLon(this.d.location)) {
            this.d = new MtLocationInfo(this.d.location, true, this.d.locateStartTime, this.d.locationGotTime);
            if (LogUtils.a()) {
                LogUtils.a("stop isCacheMtLocation true");
            }
        }
        if (this.e != null) {
            this.e = new MtLocationInfo(this.e.location, true, this.e.locateStartTime, this.e.locationGotTime);
        }
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c36db2e0d58967ce263ca31ddd26523", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c36db2e0d58967ce263ca31ddd26523");
        } else if (j != this.g) {
            this.g = j;
        }
    }

    public void a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35575aeb0823c4d36fa686af28afb309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35575aeb0823c4d36fa686af28afb309");
        } else if (!LocationUtils.isValidLatLon(mtLocation)) {
            LogUtils.a("MasterLocatorImpl onLocationGot error");
            this.e = new MtLocationInfo(mtLocation, true, this.c, SystemClock.elapsedRealtime());
            b(this.e);
        } else {
            MtLocationInfo mtLocationInfo = this.d;
            MtLocationInfo mtLocationInfo2 = new MtLocationInfo(mtLocation, true, this.c, SystemClock.elapsedRealtime());
            LogUtils.a("onLocationGot isCacheMtLocation false");
            if (LocationUtils.a(this.f, mtLocationInfo2, mtLocationInfo, c())) {
                this.d = mtLocationInfo2;
                LogUtils.a("update Location isCacheMtLocation " + this.d.isCachedLocation);
                b(this.d);
            } else {
                LogUtils.a("MasterLocatorImpl is not better mtlocation");
                a(mtLocationInfo2);
            }
            c(this.d);
        }
    }

    public void a(HashSet<MtLocationInfo.MtLocationInfoListener> hashSet, HashSet<MtLocationInfo.MtLocationInfoListener> hashSet2) {
        this.h = hashSet;
        this.i = hashSet2;
    }

    public boolean a(MtLocationInfo.MtLocationInfoListener mtLocationInfoListener) {
        String str;
        String str2;
        h a;
        String str3;
        Object[] objArr = {mtLocationInfoListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eca28aaeb6dcbb813d81938de804f66f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eca28aaeb6dcbb813d81938de804f66f")).booleanValue();
        }
        if ((mtLocationInfoListener instanceof MtLocationLoader) && (((MtLocationLoader) mtLocationInfoListener).getAdopter() instanceof NaviInstant)) {
            return false;
        }
        if (this.d != null) {
            if (LogUtils.a()) {
                LogUtils.a("addListener isCacheMtLocation " + this.d.isCachedLocation);
            }
            com.meituan.android.common.locate.platform.logs.c.a(this.d.location, "MasterLocatorImpl", "cache_of_master_mt_locationLoader", 2);
            if (this.d.location != null) {
                if ("mars".equals(this.d.location.getProvider())) {
                    a = h.a();
                    str3 = "master_cache_gps";
                } else if (GearsLocator.GEARS_PROVIDER.equals(this.d.location.getProvider())) {
                    a = h.a();
                    str3 = "master_cache_gears";
                }
                a.a(str3, "", this.d.location, 0L);
            }
            if (!a((Object) mtLocationInfoListener)) {
                c(this.d.location);
                str2 = a(mtLocationInfoListener, this.d) ? "MasterLocatorImpl::isNoUseCache::false" : "MasterLocatorImpl::isNoUseCache::true";
                com.meituan.android.common.locate.platform.logs.c.a("MasterLocatorImpl::no start", 3);
                return true;
            }
            com.meituan.android.common.locate.platform.logs.c.a(str2, 3);
        }
        if (this.e != null) {
            if (!a((Object) mtLocationInfoListener)) {
                c(this.e.location);
                str = a(mtLocationInfoListener, this.e) ? "MasterLocatorImpl::isNoUseCache::false" : "MasterLocatorImpl::isNoUseCache::true";
                com.meituan.android.common.locate.platform.logs.c.a("MasterLocatorImpl::no start", 3);
                return true;
            }
            com.meituan.android.common.locate.platform.logs.c.a(str, 3);
        }
        return false;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba746dedc34c8c933765ec311696187c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba746dedc34c8c933765ec311696187c");
        } else {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public void b(final MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "493c397852bb97d67f26da34650ac456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "493c397852bb97d67f26da34650ac456");
        } else {
            FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.b.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6673b0a948c004ea0b2ba6c7b658e450", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6673b0a948c004ea0b2ba6c7b658e450");
                    } else if (LocationUtils.a(mtLocation)) {
                        LogUtils.a("MasterLocatorImpl setLocation " + mtLocation.getLatitude() + CommonConstant.Symbol.COMMA + mtLocation.getLongitude());
                        mtLocation.setProvider("mark");
                        b.this.d = new MtLocationInfo(mtLocation, b.this.h.isEmpty(), b.this.c, SystemClock.elapsedRealtime());
                        b.this.b(b.this.d);
                    }
                }
            });
        }
    }
}
