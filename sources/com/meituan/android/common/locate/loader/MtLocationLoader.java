package com.meituan.android.common.locate.loader;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.meituan.android.common.locate.LocationMode;
import com.meituan.android.common.locate.MasterLocator;
import com.meituan.android.common.locate.MasterLocatorImpl;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.MtLocationInfo;
import com.meituan.android.common.locate.loader.strategy.Instant;
import com.meituan.android.common.locate.loader.strategy.Newest;
import com.meituan.android.common.locate.loader.strategy.Timer;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.platform.logs.h;
import com.meituan.android.common.locate.platform.logs.j;
import com.meituan.android.common.locate.platform.logs.k;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.provider.d;
import com.meituan.android.common.locate.provider.p;
import com.meituan.android.common.locate.provider.r;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.FakeMainThread;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.g;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class MtLocationLoader extends com.meituan.android.common.locate.loader.a<MtLocation> implements MtLocationInfo.MtLocationInfoListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long A;
    private long B;
    private boolean C;
    private j D;
    private a E;
    private MasterLocator e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private MtLocation j;
    private MtLocation k;
    private MtLocation l;
    private Handler m;
    private Handler n;
    private Handler o;
    private boolean p;
    private String q;
    private boolean r;
    private boolean s;
    private long t;
    private Context u;
    private boolean v;
    private boolean w;
    private long x;
    private k y;
    private long z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private MtLocationInfo b;
        private boolean c;

        public a() {
            Object[] objArr = {MtLocationLoader.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e5f03fba1bf81f238b363ec4d02944e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e5f03fba1bf81f238b363ec4d02944e");
            }
        }

        public void a(MtLocationInfo mtLocationInfo) {
            this.b = mtLocationInfo;
            this.c = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11ed71f9f7625075c39a87de5ded0317", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11ed71f9f7625075c39a87de5ded0317");
                return;
            }
            MtLocationLoader.this.a(this.b);
            this.c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        public b(Looper looper) {
            super(looper);
            Object[] objArr = {MtLocationLoader.this, looper};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6ffd524a7d4b0c70ac400e08b3bb0c3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6ffd524a7d4b0c70ac400e08b3bb0c3");
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle extras;
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88a06965d0a871ac3b029464da573d84", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88a06965d0a871ac3b029464da573d84");
                return;
            }
            switch (message.what) {
                case 2:
                    com.meituan.android.common.locate.platform.logs.c.a("MtLocationLoader::timeout", 3);
                    MtLocation mtLocation = MtLocationLoader.this.j == null ? null : new MtLocation(MtLocationLoader.this.j);
                    if (mtLocation == null) {
                        mtLocation = new MtLocation("", com.meituan.android.common.locate.util.c.a(MtLocationLoader.this.u) ? 11 : 12);
                    } else {
                        Bundle extras2 = mtLocation.getExtras();
                        if (extras2 == null) {
                            extras2 = new Bundle();
                            mtLocation.setExtras(extras2);
                        }
                        extras2.putString("from", "cache");
                        mtLocation.setTime(System.currentTimeMillis());
                    }
                    Bundle extras3 = mtLocation.getExtras();
                    if (extras3 == null) {
                        extras3 = new Bundle();
                    }
                    if (GearsLocator.is2FirstRequest) {
                        extras3.putString("gearsRequest", "failed");
                        LogUtils.a("MtLocationLoader gearsRequestsss " + extras3.getString("gearsRequest"));
                    }
                    int statusCode = MasterLocatorImpl.realstatusCode == 0 ? mtLocation.getStatusCode() : MasterLocatorImpl.realstatusCode;
                    MasterLocatorImpl.realstatusCode = statusCode;
                    if (statusCode == 0) {
                        MasterLocatorImpl.realstatusCode = 11;
                    }
                    extras3.putBoolean("is_can_callback", true);
                    mtLocation.setExtras(extras3);
                    MtLocationLoader.this.a(MtLocationLoader.this.j, mtLocation);
                    if (MtLocationLoader.this.b instanceof Instant) {
                        return;
                    }
                    MtLocationLoader.this.n.post(new Runnable() { // from class: com.meituan.android.common.locate.loader.MtLocationLoader.b.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f458de578d95b9a6692289f55d7ece3b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f458de578d95b9a6692289f55d7ece3b");
                            } else {
                                MtLocationLoader.this.stopLoading();
                            }
                        }
                    });
                    return;
                case 3:
                    LogUtils.a("MSG_INTERVAL_DELIVER");
                    LogUtils.a("MtLocationLoader adopter.getDeliverInterval() is " + MtLocationLoader.this.b.getDeliverInterval());
                    sendEmptyMessageDelayed(3, MtLocationLoader.this.b.getDeliverInterval());
                    MtLocation c = MtLocationLoader.this.c();
                    if (c == null) {
                        c = MtLocationLoader.this.j;
                        if (MtLocationLoader.this.j != null && "mars".equals(MtLocationLoader.this.j.getProvider()) && MtLocationLoader.this.j.getExtras() != null) {
                            if (SystemClock.elapsedRealtime() - MtLocationLoader.this.j.getTime() >= MetricsAnrManager.ANR_THRESHOLD) {
                                MtLocationLoader.this.j.setSpeed(0.0f);
                            }
                            if (d.a().a != null && (extras = d.a().a.getExtras()) != null) {
                                MtLocationLoader.this.j.getExtras().putInt("gpsQuality", extras.getInt("gpsQuality"));
                            }
                        }
                    }
                    if (c != null) {
                        MtLocationLoader.this.a(c, new MtLocation(c));
                    }
                    if (MtLocationLoader.this.d(c)) {
                        MtLocationLoader.this.z = System.currentTimeMillis();
                        MtLocationLoader.this.e.forceRequest();
                        com.meituan.android.common.locate.platform.logs.c.a("MtLocationloader::forceRequest:" + MtLocationLoader.this.a, 3);
                        return;
                    }
                    return;
                case 4:
                    LogUtils.a("MSG_GPS_FIX_FIRST_TIME");
                    if (LocationUtils.a(MtLocationLoader.this.j)) {
                        MtLocationLoader.this.a(MtLocationLoader.this.j, new MtLocation(MtLocationLoader.this.j));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public MtLocationLoader(final Context context, final MasterLocator masterLocator, final LocationStrategy locationStrategy) {
        super(context);
        Object[] objArr = {context, masterLocator, locationStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b59f5915f58a4eb7d9b5af16e50e189", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b59f5915f58a4eb7d9b5af16e50e189");
            return;
        }
        this.f = 1;
        this.g = 2;
        this.h = 3;
        this.i = 4;
        this.p = true;
        this.r = false;
        this.s = false;
        this.v = true;
        this.w = true;
        this.x = 0L;
        this.y = new k();
        this.z = 0L;
        this.A = 6000L;
        this.B = 24000L;
        this.C = false;
        this.D = new j();
        this.E = new a();
        a(context, locationStrategy);
        FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.loader.MtLocationLoader.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2b381369b3e3531eea4e4c29d01438e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2b381369b3e3531eea4e4c29d01438e4");
                } else {
                    MtLocationLoader.this.a(context, masterLocator, locationStrategy);
                }
            }
        });
    }

    public MtLocationLoader(final Context context, final MasterLocator masterLocator, final LocationStrategy locationStrategy, Looper looper) {
        super(context);
        Object[] objArr = {context, masterLocator, locationStrategy, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "155c1dd47581808e80bd8574fe315543", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "155c1dd47581808e80bd8574fe315543");
            return;
        }
        this.f = 1;
        this.g = 2;
        this.h = 3;
        this.i = 4;
        this.p = true;
        this.r = false;
        this.s = false;
        this.v = true;
        this.w = true;
        this.x = 0L;
        this.y = new k();
        this.z = 0L;
        this.A = 6000L;
        this.B = 24000L;
        this.C = false;
        this.D = new j();
        this.E = new a();
        if (looper != null) {
            this.o = new Handler(looper);
        }
        a(context, locationStrategy);
        FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.loader.MtLocationLoader.7
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ea4ab426fd7f6da503bdd162a8557350", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ea4ab426fd7f6da503bdd162a8557350");
                } else {
                    MtLocationLoader.this.a(context, masterLocator, locationStrategy);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a0927257488c5fd42eeb753e3b1a7c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a0927257488c5fd42eeb753e3b1a7c9")).doubleValue();
        }
        try {
            return new BigDecimal(d).setScale(7, 4).doubleValue();
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("format :" + e.getMessage());
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, MasterLocator masterLocator, LocationStrategy locationStrategy) {
        this.e = masterLocator;
    }

    private void a(Context context, LocationStrategy locationStrategy) {
        Object[] objArr = {context, locationStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f21d0ac8ac0ca67187bab2f98452a920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f21d0ac8ac0ca67187bab2f98452a920");
            return;
        }
        this.u = context;
        a(locationStrategy);
        try {
            if (locationStrategy instanceof BaseLocationStrategy) {
                this.a = ((BaseLocationStrategy) locationStrategy).getBusinessId();
            }
            this.m = new b(FakeMainThread.getInstance().getLooper());
            this.n = new Handler(context.getMainLooper());
            if (locationStrategy instanceof BaseLocationStrategy) {
                this.p = ((BaseLocationStrategy) locationStrategy).j;
                this.q = locationStrategy.getLocationMode();
            }
        } catch (Throwable th) {
            LogUtils.a(th);
        }
        try {
            this.s = ((BaseLocationStrategy) locationStrategy).l;
            LogUtils.a("MtLocationLoader adopter.getDeliverInterval()" + locationStrategy.getDeliverInterval());
        } catch (Throwable th2) {
            LogUtils.a(th2);
        }
        try {
            this.C = ((BaseLocationStrategy) locationStrategy).m;
            LogUtils.a("MtLocationLoader adopter.getDeliverInterval()" + locationStrategy.getDeliverInterval());
        } catch (Throwable th3) {
            LogUtils.a(th3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.meituan.android.common.locate.MtLocation r16, com.meituan.android.common.locate.MtLocation r17) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.loader.MtLocationLoader.a(com.meituan.android.common.locate.MtLocation, com.meituan.android.common.locate.MtLocation):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MtLocationInfo mtLocationInfo) {
        String str;
        Object[] objArr = {mtLocationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebd4cd80708c95b8126d92a68b631e3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebd4cd80708c95b8126d92a68b631e3b");
            return;
        }
        Pair<Integer, Double> a2 = com.meituan.android.common.locate.controller.d.a().a(mtLocationInfo.location);
        if (a2 != null && mtLocationInfo.location != null) {
            Bundle extras = mtLocationInfo.location.getExtras();
            if (extras == null) {
                mtLocationInfo.location.setExtras(new Bundle());
                extras = mtLocationInfo.location.getExtras();
            }
            extras.putInt(GearsLocator.INDOOR_TYPE, ((Integer) a2.first).intValue());
            extras.putDouble(GearsLocator.INDOOR_SCORE, ((Double) a2.second).doubleValue());
        }
        if (this.b instanceof Timer) {
            if (this.k == null) {
                LogUtils.a("no wait first time accurate success");
                a(mtLocationInfo.location, mtLocationInfo.location);
                d();
            }
            if (c(mtLocationInfo.location)) {
                a(mtLocationInfo.location, mtLocationInfo.location);
            }
            this.j = mtLocationInfo.location;
            return;
        }
        this.j = mtLocationInfo.location;
        if (mtLocationInfo.location != null && "mars".equals(mtLocationInfo.location.getProvider())) {
            this.t = mtLocationInfo.locationGotTime;
        }
        if (LocationUtils.isValidLatLon(mtLocationInfo.location)) {
            StringBuilder sb = new StringBuilder("MtLocationLoader ");
            if (mtLocationInfo.location.getExtras() == null) {
                str = null;
            } else {
                str = " --- locationInfo.location " + mtLocationInfo.location.getLongitude() + StringUtil.SPACE + mtLocationInfo.location.getLongitude() + " from " + mtLocationInfo.location.getExtras().get("from");
            }
            sb.append(str);
            LogUtils.a(sb.toString());
            LogUtils.a("MtLocationLoader no wait");
            a(mtLocationInfo.location, mtLocationInfo.location);
        }
    }

    private boolean b(MtLocationInfo mtLocationInfo) {
        Object[] objArr = {mtLocationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "314f4cd2c159078c085d1bde5a215404", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "314f4cd2c159078c085d1bde5a215404")).booleanValue();
        }
        if (!LocationUtils.isValidLatLon(mtLocationInfo.location)) {
            if (!(this.b instanceof Timer)) {
                LogUtils.a("MtLocationLoader onLocationGot update error");
                MtLocation mtLocation = mtLocationInfo.location;
                a(mtLocation, mtLocation);
            }
            return true;
        }
        if (!(this.b instanceof Timer)) {
            long gpsFixFirstWait = this.b.getGpsFixFirstWait();
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            StringBuilder sb = new StringBuilder("MtLocationLoader loc info: ");
            sb.append(this.t);
            sb.append(StringUtil.SPACE);
            sb.append(mtLocationInfo.location == null ? null : mtLocationInfo.location.getProvider());
            sb.append(StringUtil.SPACE);
            sb.append(currentTimeMillis);
            sb.append(StringUtil.SPACE);
            sb.append(mtLocationInfo.isCachedLocation);
            sb.append(StringUtil.SPACE);
            sb.append(mtLocationInfo.locationGotTime);
            LogUtils.a(sb.toString());
            if (currentTimeMillis < gpsFixFirstWait && (this.t == mtLocationInfo.locationGotTime || (mtLocationInfo.location != null && !"mars".equals(mtLocationInfo.location.getProvider())))) {
                LogUtils.a("wait for first gps fix");
                return true;
            }
        } else if (c(mtLocationInfo)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MtLocation c() {
        return null;
    }

    private boolean c(MtLocationInfo mtLocationInfo) {
        Object[] objArr = {mtLocationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fa2273d453d3249c70dc138f2d37001", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fa2273d453d3249c70dc138f2d37001")).booleanValue();
        }
        if (mtLocationInfo == null || mtLocationInfo.location == null) {
            return false;
        }
        if ("mars".equals(mtLocationInfo.location.getProvider()) && LocationMode.Battery_Sensors.equals(getLocationMode())) {
            return true;
        }
        return GearsLocator.GEARS_PROVIDER.equals(mtLocationInfo.location.getProvider()) && LocationMode.Device_Sensors.equals(getLocationMode());
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f363f660c394d30affa90efc2c756cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f363f660c394d30affa90efc2c756cc4");
        } else if (this.m != null) {
            if (this.m.hasMessages(3)) {
                this.m.removeMessages(3);
            }
            this.m.sendEmptyMessageDelayed(3, this.b.getDeliverInterval());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cec4fde5cfa12cc9af63d193c0f5850f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cec4fde5cfa12cc9af63d193c0f5850f")).booleanValue();
        }
        if (LocationUtils.k(this.u)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (mtLocation != null) {
            if (currentTimeMillis - mtLocation.getTime() > this.B && currentTimeMillis - this.z > this.A) {
                return true;
            }
        } else if (currentTimeMillis - this.z > this.A) {
            return true;
        }
        return false;
    }

    private void e(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63cf611e6d6ee78a8c4a07885a509955", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63cf611e6d6ee78a8c4a07885a509955");
        } else if (mtLocation == null) {
            com.meituan.android.common.locate.platform.logs.c.a("MTLocationLoader location is null", 1);
        } else if (this.b == null) {
            com.meituan.android.common.locate.platform.logs.c.a("MTLocationLoader adopter is null", 1);
        } else {
            com.meituan.android.common.locate.platform.logs.c.a(mtLocation, "mtLocationLoader: " + String.valueOf(System.identityHashCode(this)) + "; bizName: " + this.a + "; StatusCode: " + mtLocation.getStatusCode(), this.b.getName(), 1);
        }
    }

    private void f(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07b4672170754f5fa5e0e5c87fd0f242", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07b4672170754f5fa5e0e5c87fd0f242");
            return;
        }
        try {
            Bundle extras = mtLocation.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putBoolean("hasPermission", this.v);
            extras.putString("businessId", this.a);
            extras.putLong("timeout", this.b == null ? LocationStrategy.LOCATION_TIMEOUT : this.b.getLocationTimeout());
            extras.putString("adopt", this.b == null ? "" : this.b.getName());
            if (!GearsLocator.isHasSendStarted && GearsLocator.gearsStartTime > 0) {
                GearsLocator.isHasSendStarted = true;
                extras.putLong("startGearsTime", GearsLocator.gearsStartTime);
            }
            extras.putLong("startLoadingTime", this.c);
            mtLocation.setExtras(extras);
        } catch (Throwable unused) {
            LogUtils.a("MtLocationLoader  set isHasPermission failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(MtLocation mtLocation) {
        Bundle extras;
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d11ee5a64a908f86b258ae8819d11ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d11ee5a64a908f86b258ae8819d11ca")).booleanValue();
        }
        if (!this.b.isForceSingleCallback() || (this.b instanceof Instant) || LocationUtils.a(mtLocation)) {
            return true;
        }
        return (mtLocation == null || (extras = mtLocation.getExtras()) == null || !extras.getBoolean("is_can_callback", false)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e5573758efb7a4bd0b55a5277cbff95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e5573758efb7a4bd0b55a5277cbff95");
            return;
        }
        try {
            if ((this.b instanceof Instant) || !LocationUtils.a(mtLocation)) {
                return;
            }
            LogUtils.a("Enter onStop");
            this.n.post(new Runnable() { // from class: com.meituan.android.common.locate.loader.MtLocationLoader.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "51a9396e61e2cfc2464d0baa0f518262", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "51a9396e61e2cfc2464d0baa0f518262");
                    } else {
                        MtLocationLoader.this.stopLoading();
                    }
                }
            });
        } catch (Throwable th) {
            LogUtils.a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "377f196085efd098ef7bbb292cf0cd81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "377f196085efd098ef7bbb292cf0cd81");
        } else {
            com.meituan.android.common.locate.platform.sniffer.c.a(mtLocation, this.b);
        }
    }

    @Override // com.meituan.android.common.locate.loader.a
    public void a() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0edc7ad0d597f1e9f1b8ac60aeacda23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0edc7ad0d597f1e9f1b8ac60aeacda23");
            return;
        }
        StringBuilder sb = new StringBuilder("startLoading: ");
        sb.append(String.valueOf(System.identityHashCode(this)));
        sb.append("; strategy: ");
        sb.append(this.b == null ? StringUtil.NULL : this.b.getClass().getSimpleName());
        com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 1);
        this.c = System.currentTimeMillis();
        super.a();
        com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("_sniffer_module_loader_biz", this.a + "_type_mt_loader_start"));
        LogUtils.a("MtLocationLoader  Starting");
        this.w = true;
        try {
        } catch (Throwable th) {
            LogUtils.a(th);
        }
        if (f.b().getBoolean("enable_permcheck_inload", true)) {
            final int b2 = com.meituan.android.common.locate.util.c.b(this.u);
            if (b2 != 0 && b2 != 4) {
                com.meituan.android.common.locate.platform.logs.c.a("locatesdk no permision of or service code:" + b2, 3);
                this.v = false;
                com.meituan.android.common.locate.platform.sniffer.a.a("location service close no perm", 1);
                g.a().a(new Runnable() { // from class: com.meituan.android.common.locate.loader.MtLocationLoader.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "971f391b3152ace25ddae786be817238", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "971f391b3152ace25ddae786be817238");
                            return;
                        }
                        MtLocation mtLocation = new MtLocation("", com.meituan.android.common.locate.util.c.a(b2));
                        Bundle extras = mtLocation.getExtras();
                        if (extras == null) {
                            extras = new Bundle();
                        }
                        extras.putBoolean("is_can_callback", true);
                        mtLocation.setExtras(extras);
                        MasterLocatorImpl.realstatusCode = mtLocation.getStatusCode();
                        MtLocationLoader.this.a(mtLocation, mtLocation);
                        MtLocationLoader.this.i((MtLocation) null);
                        LocationUtils.a((JSONObject) null);
                        if (MtLocationLoader.this.b instanceof Instant) {
                            return;
                        }
                        MtLocationLoader.this.n.postDelayed(new Runnable() { // from class: com.meituan.android.common.locate.loader.MtLocationLoader.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1897269ec85be16ed3579b07161cefb0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1897269ec85be16ed3579b07161cefb0");
                                } else {
                                    MtLocationLoader.this.stopLoading();
                                }
                            }
                        }, 20L);
                    }
                });
                LogUtils.a("MtLocationLoader Location service close no perm");
                if (!(this.b instanceof Instant)) {
                    return;
                }
                FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.loader.MtLocationLoader.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "241bfb518910f0f2a259f2162346f7f5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "241bfb518910f0f2a259f2162346f7f5");
                        } else if (MtLocationLoader.this.r) {
                        } else {
                            MtLocationLoader.this.r = true;
                            if (p.a() != null) {
                                MtLocationLoader.this.l = p.a().getOfflineStartLocation();
                                LogUtils.a("MtLocationLoader onStartLoading（）---> offlineSeek！=null");
                                LogUtils.a("MtLocationLoader onStartLoading() -> offlineStartLocation = " + MtLocationLoader.this.l);
                            } else {
                                LogUtils.a("MtLocationLoader onStartLoading（）--> offlineSeek =null");
                                MtLocationLoader.this.l = null;
                            }
                            StringBuilder sb2 = new StringBuilder("MtLocationLoader Locate Strategy ");
                            sb2.append(MtLocationLoader.this.b == null ? StringUtil.NULL : MtLocationLoader.this.b.getClass().getSimpleName());
                            LogUtils.a(sb2.toString());
                            if (MtLocationLoader.this.b instanceof Instant) {
                                MtLocationLoader.this.m.sendEmptyMessage(1);
                            } else if (MtLocationLoader.this.b instanceof Newest) {
                                ((Newest) MtLocationLoader.this.b).updateLoadTime();
                            }
                            if (MtLocationLoader.this.b != null && MtLocationLoader.this.b.isGpsMinDataTakeEffect()) {
                                com.meituan.android.common.locate.strategy.b.a().a(MtLocationLoader.this, MtLocationLoader.this.b.getGpsTimeGap(), MtLocationLoader.this.b.getGpsDistanceGap());
                                LogUtils.a("gpsTimeGap = " + MtLocationLoader.this.b.getGpsTimeGap() + " gpsDistanceGap = " + MtLocationLoader.this.b.getGpsDistanceGap());
                            }
                            boolean z = MtLocationLoader.this.b instanceof BaseLocationStrategy ? ((BaseLocationStrategy) MtLocationLoader.this.b).j : true;
                            h.a().a(System.currentTimeMillis(), MtLocationLoader.this.a);
                            MtLocationLoader.this.D.a(System.currentTimeMillis(), MtLocationLoader.this.a);
                            if (MtLocationLoader.this.s) {
                                com.meituan.android.common.locate.provider.j.d().e();
                            }
                            if (MtLocationLoader.this.C && com.meituan.android.common.locate.reporter.p.a(MtLocationLoader.this.u).a(MtLocationLoader.this.a)) {
                                r.d().a(MtLocationLoader.this);
                            }
                            MtLocationLoader.this.e.addListener((MtLocationInfo.MtLocationInfoListener) MtLocationLoader.this, false, z);
                            MtLocationLoader.this.e.forceRequest();
                            MtLocationLoader.this.z = System.currentTimeMillis();
                            com.meituan.android.common.locate.platform.logs.c.a("MTLocationLoader::onStartLoading adopter=" + MtLocationLoader.this.b.getName() + " forRequest:" + MtLocationLoader.this.a, 3);
                            if (MtLocationLoader.this.b instanceof Timer) {
                                if (!MtLocationLoader.this.m.hasMessages(3)) {
                                    MtLocationLoader.this.m.sendEmptyMessage(3);
                                }
                            } else if (!MtLocationLoader.this.m.hasMessages(2)) {
                                LogUtils.a("MtLocationLoader startLoading and send Message " + MtLocationLoader.this.m.toString());
                                StringBuilder sb3 = new StringBuilder("adopter LocationTimeout :");
                                LocationStrategy locationStrategy = MtLocationLoader.this.b;
                                long j = LocationStrategy.LOCATION_TIMEOUT;
                                sb3.append(locationStrategy == null ? 60000L : MtLocationLoader.this.b.getLocationTimeout());
                                LogUtils.a(sb3.toString());
                                Handler handler = MtLocationLoader.this.m;
                                if (MtLocationLoader.this.b != null) {
                                    j = MtLocationLoader.this.b.getLocationTimeout();
                                }
                                handler.sendEmptyMessageDelayed(2, j);
                            }
                            long gpsFixFirstWait = MtLocationLoader.this.b != null ? MtLocationLoader.this.b.getGpsFixFirstWait() : 0L;
                            if (MtLocationLoader.this.m.hasMessages(4) || gpsFixFirstWait == 0) {
                                return;
                            }
                            LogUtils.a("MtLocationLoader gps fix first time: " + gpsFixFirstWait);
                            MtLocationLoader.this.m.sendEmptyMessageDelayed(4, gpsFixFirstWait);
                        }
                    }
                });
            }
            this.v = true;
            str = "MTLocationLoader::isHasPermission";
        } else {
            str = "MTLocationLoader::onStartLoading:!enablePermCheck";
        }
        com.meituan.android.common.locate.platform.logs.c.a(str, 3);
        FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.loader.MtLocationLoader.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "241bfb518910f0f2a259f2162346f7f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "241bfb518910f0f2a259f2162346f7f5");
                } else if (MtLocationLoader.this.r) {
                } else {
                    MtLocationLoader.this.r = true;
                    if (p.a() != null) {
                        MtLocationLoader.this.l = p.a().getOfflineStartLocation();
                        LogUtils.a("MtLocationLoader onStartLoading（）---> offlineSeek！=null");
                        LogUtils.a("MtLocationLoader onStartLoading() -> offlineStartLocation = " + MtLocationLoader.this.l);
                    } else {
                        LogUtils.a("MtLocationLoader onStartLoading（）--> offlineSeek =null");
                        MtLocationLoader.this.l = null;
                    }
                    StringBuilder sb2 = new StringBuilder("MtLocationLoader Locate Strategy ");
                    sb2.append(MtLocationLoader.this.b == null ? StringUtil.NULL : MtLocationLoader.this.b.getClass().getSimpleName());
                    LogUtils.a(sb2.toString());
                    if (MtLocationLoader.this.b instanceof Instant) {
                        MtLocationLoader.this.m.sendEmptyMessage(1);
                    } else if (MtLocationLoader.this.b instanceof Newest) {
                        ((Newest) MtLocationLoader.this.b).updateLoadTime();
                    }
                    if (MtLocationLoader.this.b != null && MtLocationLoader.this.b.isGpsMinDataTakeEffect()) {
                        com.meituan.android.common.locate.strategy.b.a().a(MtLocationLoader.this, MtLocationLoader.this.b.getGpsTimeGap(), MtLocationLoader.this.b.getGpsDistanceGap());
                        LogUtils.a("gpsTimeGap = " + MtLocationLoader.this.b.getGpsTimeGap() + " gpsDistanceGap = " + MtLocationLoader.this.b.getGpsDistanceGap());
                    }
                    boolean z = MtLocationLoader.this.b instanceof BaseLocationStrategy ? ((BaseLocationStrategy) MtLocationLoader.this.b).j : true;
                    h.a().a(System.currentTimeMillis(), MtLocationLoader.this.a);
                    MtLocationLoader.this.D.a(System.currentTimeMillis(), MtLocationLoader.this.a);
                    if (MtLocationLoader.this.s) {
                        com.meituan.android.common.locate.provider.j.d().e();
                    }
                    if (MtLocationLoader.this.C && com.meituan.android.common.locate.reporter.p.a(MtLocationLoader.this.u).a(MtLocationLoader.this.a)) {
                        r.d().a(MtLocationLoader.this);
                    }
                    MtLocationLoader.this.e.addListener((MtLocationInfo.MtLocationInfoListener) MtLocationLoader.this, false, z);
                    MtLocationLoader.this.e.forceRequest();
                    MtLocationLoader.this.z = System.currentTimeMillis();
                    com.meituan.android.common.locate.platform.logs.c.a("MTLocationLoader::onStartLoading adopter=" + MtLocationLoader.this.b.getName() + " forRequest:" + MtLocationLoader.this.a, 3);
                    if (MtLocationLoader.this.b instanceof Timer) {
                        if (!MtLocationLoader.this.m.hasMessages(3)) {
                            MtLocationLoader.this.m.sendEmptyMessage(3);
                        }
                    } else if (!MtLocationLoader.this.m.hasMessages(2)) {
                        LogUtils.a("MtLocationLoader startLoading and send Message " + MtLocationLoader.this.m.toString());
                        StringBuilder sb3 = new StringBuilder("adopter LocationTimeout :");
                        LocationStrategy locationStrategy = MtLocationLoader.this.b;
                        long j = LocationStrategy.LOCATION_TIMEOUT;
                        sb3.append(locationStrategy == null ? 60000L : MtLocationLoader.this.b.getLocationTimeout());
                        LogUtils.a(sb3.toString());
                        Handler handler = MtLocationLoader.this.m;
                        if (MtLocationLoader.this.b != null) {
                            j = MtLocationLoader.this.b.getLocationTimeout();
                        }
                        handler.sendEmptyMessageDelayed(2, j);
                    }
                    long gpsFixFirstWait = MtLocationLoader.this.b != null ? MtLocationLoader.this.b.getGpsFixFirstWait() : 0L;
                    if (MtLocationLoader.this.m.hasMessages(4) || gpsFixFirstWait == 0) {
                        return;
                    }
                    LogUtils.a("MtLocationLoader gps fix first time: " + gpsFixFirstWait);
                    MtLocationLoader.this.m.sendEmptyMessageDelayed(4, gpsFixFirstWait);
                }
            }
        });
    }

    @Override // com.meituan.android.common.locate.loader.a
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c53c630fccf23658ac72f2ef5913291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c53c630fccf23658ac72f2ef5913291");
            return;
        }
        StringBuilder sb = new StringBuilder("stopLoading: ");
        sb.append(String.valueOf(System.identityHashCode(this)));
        sb.append("; strategy: ");
        sb.append(this.b == null ? StringUtil.NULL : this.b.getClass().getSimpleName());
        com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 1);
        super.b();
        FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.loader.MtLocationLoader.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                h a2;
                String str;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "43f9834b1d55336b1000fa1612b93378", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "43f9834b1d55336b1000fa1612b93378");
                } else if (MtLocationLoader.this.r) {
                    MtLocationLoader.this.r = false;
                    if (MtLocationLoader.this.w) {
                        MtLocation mtLocation = new MtLocation("usercancel", 15);
                        MtLocationLoader.this.w = false;
                        MtLocationLoader.this.y.a(mtLocation, System.currentTimeMillis() - MtLocationLoader.this.c);
                        LogUtils.a("MtLocationLoader  user cancel before location sendout");
                    }
                    LogUtils.a("onStopLoading");
                    com.meituan.android.common.locate.platform.logs.c.a("LocationLoader::onStopLoading::adopter=" + MtLocationLoader.this.b.getName(), 3);
                    MtLocationLoader.this.e.removeListener(MtLocationLoader.this);
                    MtLocationLoader.this.m.removeMessages(2);
                    if (MtLocationLoader.this.b instanceof Instant) {
                        MtLocationLoader.this.m.removeMessages(1);
                    }
                    long deliverInterval = MtLocationLoader.this.b instanceof Timer ? MtLocationLoader.this.b.getDeliverInterval() : 0L;
                    if (MtLocationLoader.this.j != null) {
                        if ("mars".equals(MtLocationLoader.this.j.getProvider())) {
                            a2 = h.a();
                            str = "loader_stopped_cached_gps";
                        } else if (GearsLocator.GEARS_PROVIDER.equals(MtLocationLoader.this.j.getProvider())) {
                            a2 = h.a();
                            str = "loader_stopped_cached_gears";
                        }
                        a2.a(str, MtLocationLoader.this.a, MtLocationLoader.this.j, deliverInterval);
                    }
                    if (MtLocationLoader.this.b instanceof Timer) {
                        MtLocationLoader.this.j = null;
                        MtLocationLoader.this.m.removeMessages(3);
                    }
                    if (MtLocationLoader.this.b.getGpsFixFirstWait() != 0) {
                        MtLocationLoader.this.m.removeMessages(4);
                    }
                    if (MtLocationLoader.this.s) {
                        com.meituan.android.common.locate.provider.j.d().g();
                    }
                    if (MtLocationLoader.this.C && com.meituan.android.common.locate.reporter.p.a(MtLocationLoader.this.u).a(MtLocationLoader.this.a)) {
                        r.d().b(MtLocationLoader.this);
                    }
                    com.meituan.android.common.locate.strategy.b.a().a(MtLocationLoader.this);
                    MtLocationLoader.this.x = 0L;
                    MtLocationLoader.this.y.a();
                    MtLocationLoader.this.D.c();
                }
            }
        });
        this.o = null;
        this.c = 0L;
    }

    @Override // android.support.v4.content.Loader
    public void deliverResult(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e8d04178d099320862467117ec23316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e8d04178d099320862467117ec23316");
        } else if (isStarted()) {
            try {
                LogUtils.a("MtLocationLoader deliver result: ", mtLocation, this.u);
                super.deliverResult((MtLocationLoader) mtLocation);
                e(mtLocation);
            } catch (Throwable th) {
                LogUtils.a(getClass(), th);
                com.meituan.android.common.locate.platform.sniffer.b.b(new c.a("MODULE_DELIVER_RESULT", this.a + "_error"));
            }
        }
    }

    public LocationStrategy getAdopter() {
        return this.b;
    }

    public float getCurrentHeading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c02902366515b2704f7a74b5f81a6b6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c02902366515b2704f7a74b5f81a6b6c")).floatValue();
        }
        if (this.s) {
            return com.meituan.android.common.locate.provider.j.d().f();
        }
        return 0.0f;
    }

    public String getLocationMode() {
        return this.q;
    }

    public boolean isUseGps() {
        return this.p;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    @Override // com.meituan.android.common.locate.MtLocationInfo.MtLocationInfoListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onLocationGot(com.meituan.android.common.locate.MtLocationInfo r20) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.loader.MtLocationLoader.onLocationGot(com.meituan.android.common.locate.MtLocationInfo):boolean");
    }
}
