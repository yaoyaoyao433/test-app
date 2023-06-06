package com.meituan.android.common.locate.locator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.model.b;
import com.meituan.android.common.locate.platform.logs.h;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.provider.GpsInfo;
import com.meituan.android.common.locate.provider.t;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.reporter.k;
import com.meituan.android.common.locate.reporter.n;
import com.meituan.android.common.locate.util.FakeMainThread;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.g;
import com.meituan.android.common.locate.util.i;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.u;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public class SystemLocator extends AbstractLocator implements GpsStatus.Listener, LocationListener {
    public static final String EXTRA_KEY_GPS_CONF = "gps_conf";
    public static final int GPS_ACCURACY_BAD = 1;
    public static final int GPS_ACCURACY_GOOD = 3;
    public static final int GPS_ACCURACY_MID = 2;
    private static SystemLocator a;
    private static ArrayList<b> b = new ArrayList<>();
    private static com.meituan.android.common.locate.geo.a c;
    public static ChangeQuickRedirect changeQuickRedirect;
    private e d;
    private final com.meituan.android.common.locate.posquality.a e;
    private com.meituan.android.common.locate.controller.e f;
    private u g;
    private String h;
    private Context i;
    private Location j;
    private GnssStatus.Callback k;
    private SharedPreferences l;
    private boolean m;
    private long n;
    private boolean o;
    private int p;
    private int q;
    private boolean r;
    private int s;
    private boolean t;
    private Thread u;
    private Handler v;

    public SystemLocator(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b06782f4254222a7b1026c1aebfa18b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b06782f4254222a7b1026c1aebfa18b");
            return;
        }
        this.j = b();
        this.m = false;
        this.n = 0L;
        this.o = true;
        this.p = 0;
        this.q = 0;
        this.r = false;
        this.s = 0;
        this.t = true;
        this.i = context;
        this.g = Privacy.createLocationManager(context, "pt-c140c5921e4d3392");
        this.h = str;
        this.f = com.meituan.android.common.locate.controller.e.a();
        this.l = f.b();
        if (this.l != null) {
            this.o = this.l.getBoolean("use_system_geo", true);
        }
        if (!LocationUtils.k(context)) {
            this.d = new e(this, context);
        }
        this.e = new com.meituan.android.common.locate.posquality.a();
        if (k.a().g) {
            if (this.u == null) {
                this.u = com.sankuai.android.jarvis.c.a("on_location_changed", new Runnable() { // from class: com.meituan.android.common.locate.locator.SystemLocator.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0580ebb79c825ed9fe9e4526c79fe183", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0580ebb79c825ed9fe9e4526c79fe183");
                            return;
                        }
                        Looper.prepare();
                        SystemLocator.this.v = new Handler();
                        Looper.loop();
                    }
                });
            }
            this.u.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, int i2) {
        if (i < 4) {
            return 1;
        }
        return i2 < 4 ? 2 : 3;
    }

    private String a(com.meituan.android.common.locate.model.b bVar, double d) {
        WifiInfo wifiInfo;
        List<ScanResult> list;
        Object[] objArr = {bVar, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfdad9b1f9b69719b7ad9b9380c8422b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfdad9b1f9b69719b7ad9b9380c8422b");
        }
        if (com.meituan.android.common.locate.controller.f.a().d()) {
            WifiInfo f = t.a(this.i).f();
            com.meituan.android.common.locate.platform.sniffer.report.e.a().g++;
            wifiInfo = f;
            list = f == null ? t.a(this.i).c() : null;
        } else {
            wifiInfo = null;
            list = null;
        }
        return t.a(wifiInfo, list, bVar, null, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Location location) {
        Object[] objArr = {location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31199e9d3addd1df63e69ff2d520f15e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31199e9d3addd1df63e69ff2d520f15e");
        } else if (this.f != null) {
            MtLocation mtLocation = new MtLocation(location);
            b.C0216b c0216b = new b.C0216b(mtLocation.getTime(), mtLocation.getLatitude(), mtLocation.getLongitude(), mtLocation.getAccuracy());
            if (n.a().f.booleanValue()) {
                c0216b.a(Math.round(mtLocation.getAltitude() * 10.0d) / 10);
            }
            if (com.meituan.android.common.locate.controller.f.a().d() || com.meituan.android.common.locate.controller.f.a().g()) {
                c0216b.g = a(c0216b, this.e.a(mtLocation));
                com.meituan.android.common.locate.fusionlocation.a.a().a(c0216b);
            }
            this.f.a(c0216b);
        }
    }

    private void a(final MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e9dfb824d5ef04861aec6bdc3ff7b35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e9dfb824d5ef04861aec6bdc3ff7b35");
        } else if (mtLocation == null || !n.a().c.booleanValue()) {
        } else {
            FakeMainThread.getInstance().postDelay(new Runnable() { // from class: com.meituan.android.common.locate.locator.SystemLocator.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dc6fcf02b45ee44dd0228f068f39a03f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dc6fcf02b45ee44dd0228f068f39a03f");
                    } else {
                        g.a().a(new Runnable() { // from class: com.meituan.android.common.locate.locator.SystemLocator.4.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c390acbdd67e09ec4948fffcf58e3c11", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c390acbdd67e09ec4948fffcf58e3c11");
                                    return;
                                }
                                try {
                                    com.meituan.android.common.locate.platform.logs.k.a(mtLocation);
                                } catch (Exception unused) {
                                    LogUtils.a("LogPointCloud report error");
                                }
                            }
                        });
                    }
                }
            }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MtLocation mtLocation, com.meituan.android.common.locate.model.a aVar) throws IOException {
        Object[] objArr = {mtLocation, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbd001385bae3989496b6dd0ba295de7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbd001385bae3989496b6dd0ba295de7");
            return;
        }
        List<Address> fromLocation = new Geocoder(this.i, Locale.getDefault()).getFromLocation(mtLocation.getLatitude(), mtLocation.getLongitude(), 3);
        LogUtils.a("SystemLocatorenter system GeoCoder");
        if (fromLocation == null || fromLocation.size() <= 0) {
            aVar.a(false);
            return;
        }
        LogUtils.a("SystemLocatoraddress list real size is: " + fromLocation.size());
        for (int i = 0; i < fromLocation.size(); i++) {
            Address address = fromLocation.get(i);
            if (address != null) {
                LogUtils.a("SystemLocator address info: country: " + address.getCountryName() + " adminArea: " + address.getAdminArea() + " locality: " + address.getLocality() + " thoroughfare: " + address.getThoroughfare());
                if (TextUtils.isEmpty(aVar.c())) {
                    aVar.b(TextUtils.isEmpty(address.getCountryName()) ? "" : address.getCountryName());
                }
                if (TextUtils.isEmpty(aVar.d())) {
                    aVar.c(TextUtils.isEmpty(address.getAdminArea()) ? "" : address.getAdminArea());
                }
                if (TextUtils.isEmpty(aVar.e())) {
                    aVar.d(TextUtils.isEmpty(address.getLocality()) ? "" : address.getLocality());
                }
                if (TextUtils.isEmpty(aVar.f())) {
                    aVar.e(TextUtils.isEmpty(address.getThoroughfare()) ? "" : address.getThoroughfare());
                }
                if (TextUtils.isEmpty(aVar.g())) {
                    aVar.f(TextUtils.isEmpty(address.getSubThoroughfare()) ? "" : address.getSubThoroughfare());
                }
                if (TextUtils.isEmpty(aVar.b())) {
                    int maxAddressLineIndex = address.getMaxAddressLineIndex();
                    int i2 = 0;
                    while (true) {
                        if (i2 > maxAddressLineIndex) {
                            break;
                        } else if (!TextUtils.isEmpty(address.getAddressLine(i2))) {
                            LogUtils.a("SystemLocator address line in use: " + address.getAddressLine(i2));
                            aVar.a(address.getAddressLine(i2));
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        aVar.a(true);
    }

    private Location b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e0f55a5d46cae73b442938ef8df25cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Location) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e0f55a5d46cae73b442938ef8df25cb");
        }
        Location location = new Location("");
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.SPEED_METER_STEP, 1);
        bundle.putInt("type", 0);
        location.setExtras(bundle);
        return location;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9128950bf83f1cfd0cc94d5707c69e66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9128950bf83f1cfd0cc94d5707c69e66");
            return;
        }
        this.p = 0;
        this.s = 0;
        this.q = 0;
        com.meituan.android.common.locate.provider.d.a(1);
    }

    private void d() {
        u uVar;
        String str;
        Looper looper;
        String str2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "771049f5a606c01b96a8e4383577e679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "771049f5a606c01b96a8e4383577e679");
            return;
        }
        com.meituan.android.common.locate.strategy.b.a().d();
        long b2 = com.meituan.android.common.locate.strategy.b.a().b();
        float c2 = com.meituan.android.common.locate.strategy.b.a().c();
        com.meituan.android.common.locate.fusionlocation.b.a().a(b2, c2);
        if (LocationUtils.k(this.i)) {
            if (this.g.c("network")) {
                try {
                    this.m = true;
                    com.meituan.android.common.locate.platform.logs.c.a(" onStart request ApproximateLocation  gpsMinTime=" + b2 + " gpsMinDistance=" + c2, 3);
                    if (this.u == null || this.v == null || !this.u.isAlive() || !k.a().g) {
                        this.g.a("network", b2, c2, this, FakeMainThread.getInstance().getLooper());
                        return;
                    } else {
                        this.g.a("network", b2, c2, this, this.v.getLooper());
                        return;
                    }
                } catch (Throwable th) {
                    com.meituan.android.common.locate.platform.logs.c.a(" SystemLocatorV3 ApproximateLocation onStart is exception = " + th.getMessage(), 3);
                    LogUtils.a(getClass(), th);
                    return;
                }
            }
            return;
        }
        boolean z = LocationUtils.j(this.i) || LocationUtils.a(this.i, i.a);
        try {
            LogUtils.a("gpsMinTime = " + b2 + " gpsMinDistance = " + c2);
            com.meituan.android.common.locate.platform.logs.c.a(" onStart request locationUpdates hasPermission = " + z + " gpsMinTime=" + b2 + " gpsMinDistance=" + c2, 3);
            if (z) {
                this.t = true;
                if (this.u == null || this.v == null || !this.u.isAlive() || !k.a().g) {
                    this.g.a("gps", b2, c2, this, FakeMainThread.getInstance().getLooper());
                    str2 = "SystemLocator启动FakemainThread  Looper";
                } else {
                    this.g.a("gps", b2, c2, this, this.v.getLooper());
                    str2 = "SystemLocator启动handlerThread  Looper";
                }
                LogUtils.a(str2);
                h.a().b(System.currentTimeMillis());
            }
        } catch (Throwable th2) {
            com.meituan.android.common.locate.platform.logs.c.a(" SystemLocatorV3 onStart is  exception =  " + th2.getMessage(), 3);
            LogUtils.a(getClass(), th2);
        }
        SharedPreferences b3 = f.b();
        this.m = false;
        if (b3.getBoolean("useSystemLocate", false) && this.g.c("network")) {
            try {
                this.m = true;
                com.meituan.android.common.locate.platform.logs.c.a(" onStart request locationUpdates NETWORK_PROVIDER hasPermission = " + z + " gpsMinTime=" + b2 + " gpsMinDistance=" + c2, 3);
                if (z) {
                    if (this.u == null || this.v == null || !this.u.isAlive() || !k.a().g) {
                        uVar = this.g;
                        str = "network";
                        looper = FakeMainThread.getInstance().getLooper();
                    } else {
                        uVar = this.g;
                        str = "network";
                        looper = this.v.getLooper();
                    }
                    uVar.a(str, b2, c2, this, looper);
                }
            } catch (Throwable th3) {
                com.meituan.android.common.locate.platform.logs.c.a(" SystemLocatorV3 onStart is exception = " + th3.getMessage(), 3);
                LogUtils.a(getClass(), th3);
            }
        }
        com.meituan.android.common.locate.platform.sniffer.report.b.a().b();
        com.meituan.android.common.locate.platform.sniffer.report.b.a().a(b2);
        com.meituan.android.common.locate.platform.sniffer.report.b.a().c++;
        startGnnsEventListen();
    }

    public static SystemLocator getInstance() {
        return a;
    }

    public static SystemLocator getInstance(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ad1b44183b5304766a8c0b07ecfe833", RobustBitConfig.DEFAULT_VALUE)) {
            return (SystemLocator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ad1b44183b5304766a8c0b07ecfe833");
        }
        if (a == null) {
            synchronized (SystemLocator.class) {
                if (a == null && context != null) {
                    a = new SystemLocator(context, str);
                }
            }
        }
        return a;
    }

    public static synchronized void registerGpsStateListener(b bVar) {
        synchronized (SystemLocator.class) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f286faa7fe0f5f148c1f5841a3b3215", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f286faa7fe0f5f148c1f5841a3b3215");
                return;
            }
            if (b != null) {
                b.add(bVar);
            }
        }
    }

    public static synchronized boolean removeGpsStateListener(b bVar) {
        synchronized (SystemLocator.class) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4e03ef95df93e419f303403002dc7fa1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4e03ef95df93e419f303403002dc7fa1")).booleanValue();
            } else if (bVar == null || b.size() <= 0) {
                return false;
            } else {
                return b.remove(bVar);
            }
        }
    }

    public static void setGeoListener(com.meituan.android.common.locate.geo.a aVar) {
        c = aVar;
    }

    @Override // com.meituan.android.common.locate.Locator
    public void forceRequest() {
    }

    public boolean isGpsRunning() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    @Override // android.location.GpsStatus.Listener
    @android.annotation.SuppressLint({"MissingPermission"})
    @android.annotation.TargetApi(3)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGpsStatusChanged(int r13) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.locator.SystemLocator.onGpsStatusChanged(int):void");
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d17697415f2d09c94470c7e455a145a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d17697415f2d09c94470c7e455a145a");
        } else if (!"gps".equals(str) || b == null || b.size() <= 0) {
        } else {
            c();
            Iterator<b> it = b.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30bd70001736a6b96a3eb31f49bdaba8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30bd70001736a6b96a3eb31f49bdaba8");
        } else if (!"gps".equals(str) || b == null || b.size() <= 0) {
        } else {
            Iterator<b> it = b.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    @Override // com.meituan.android.common.locate.locator.AbstractLocator
    @SuppressLint({"MissingPermission", "NewApi"})
    public int onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a68ebf477fcf57484cf11bcf45af588", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a68ebf477fcf57484cf11bcf45af588")).intValue();
        }
        com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_trigger_entrance", "SystemLocatorV3_onStart"));
        this.r = true;
        if (k.a().g && (this.u == null || this.v == null)) {
            this.u = com.sankuai.android.jarvis.c.a("on_location_changed", new Runnable() { // from class: com.meituan.android.common.locate.locator.SystemLocator.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "74fd9e11d612b2e63d2abbeb2aeea589", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "74fd9e11d612b2e63d2abbeb2aeea589");
                        return;
                    }
                    Looper.prepare();
                    SystemLocator.this.v = new Handler();
                    Looper.loop();
                }
            });
        }
        if (k.a().g && !this.u.isAlive()) {
            this.u.start();
        }
        LogUtils.a("SystemLocator Starting");
        if (this.d != null) {
            this.d.b();
        }
        this.n = System.currentTimeMillis();
        try {
            if (this.g == null) {
                this.g = Privacy.createLocationManager(this.i, "pt-c140c5921e4d3392");
            }
        } catch (Exception e) {
            LogUtils.a(getClass(), e);
        }
        com.meituan.android.common.locate.platform.logs.c.a(" SystemLocatorV3 onStart ", 3);
        d();
        com.meituan.android.common.locate.platform.logs.n.e().h();
        return 0;
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
        Object[] objArr = {str, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56ad137c99459167bdbd59de05ec0bbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56ad137c99459167bdbd59de05ec0bbd");
            return;
        }
        com.meituan.android.common.locate.platform.logs.c.a("systemlocatev3::onGpsStatusChanged provider=" + str, 3);
        switch (i) {
            case 0:
                LogUtils.a("SystemLocatorOUT_OF_SERVICE");
                c();
                return;
            case 1:
                LogUtils.a("SystemLocator TEMPORARILY_UNAVAILABLE");
                return;
            case 2:
                LogUtils.a("SystemLocator AVAILABLE");
                return;
            default:
                return;
        }
    }

    @Override // com.meituan.android.common.locate.locator.AbstractLocator
    @SuppressLint({"NewApi"})
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "813d79d8dc7f5d35e0f7b18333473b7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "813d79d8dc7f5d35e0f7b18333473b7f");
            return;
        }
        h.a().c();
        com.meituan.android.common.locate.platform.logs.n.e().c();
        com.meituan.android.common.locate.platform.logs.c.a("SystemLocator::onStop ", 3);
        try {
            this.r = false;
            if (k.a().g && this.u != null && this.u.isAlive()) {
                if (this.v != null) {
                    this.v.getLooper().quitSafely();
                    this.v = null;
                }
                this.u = null;
                LogUtils.a("SystemLocator清空handlerThread  Looper");
            }
            this.g.a((LocationListener) this);
        } catch (Throwable unused) {
        }
        if (this.d != null) {
            this.d.c();
        }
        com.meituan.android.common.locate.platform.sniffer.report.b.a().c();
        stopGnnsEventListen();
        LogUtils.a(getClass().getSimpleName() + "nmea work thread quit");
        this.g = null;
        com.meituan.android.common.locate.strategy.b.a().e();
    }

    @SuppressLint({"MissingPermission"})
    public void startGnnsEventListen() {
        boolean j;
        StringBuilder sb;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b657e8cd09a5c7fda2573b082a4f294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b657e8cd09a5c7fda2573b082a4f294");
            return;
        }
        boolean d = com.meituan.android.common.locate.controller.f.a().d();
        if (!d) {
            d = k.a().f && com.meituan.android.common.locate.statusmanager.a.a().b();
        }
        if (d && (j = LocationUtils.j(this.i))) {
            com.meituan.android.common.locate.platform.logs.c.a("SystemLocator:startGnnsEventListen::isMainLocationGpsStatus:" + d + "::hasPermission:" + j, 3);
            try {
                if (this.g == null) {
                    this.g = Privacy.createLocationManager(this.i, "pt-c140c5921e4d3392");
                }
            } catch (Exception e) {
                LogUtils.a(getClass(), e);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (this.k == null) {
                    this.k = new GnssStatus.Callback() { // from class: com.meituan.android.common.locate.locator.SystemLocator.6
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.location.GnssStatus.Callback
                        public void onFirstFix(int i) {
                            Object[] objArr2 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "71452f75826e6086212f5c0a7879e3be", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "71452f75826e6086212f5c0a7879e3be");
                            } else {
                                super.onFirstFix(i);
                            }
                        }

                        @Override // android.location.GnssStatus.Callback
                        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
                            Object[] objArr2 = {gnssStatus};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dbeb10b10feb208e033941b76a85d03f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dbeb10b10feb208e033941b76a85d03f");
                                return;
                            }
                            super.onSatelliteStatusChanged(gnssStatus);
                            com.meituan.android.common.locate.api.a.a("onSatelliteStatusChanged_sdk", 1);
                            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "onSatelliteStatusChanged"));
                            com.meituan.android.common.locate.platform.sniffer.report.c.a().h++;
                            Location location = new Location("satellites");
                            if (com.meituan.android.common.locate.controller.f.a().d()) {
                                SystemLocator.this.e.a(gnssStatus, System.currentTimeMillis());
                                com.meituan.android.common.locate.fusionlocation.a.a().a(new Pair<>(gnssStatus, Long.valueOf(System.currentTimeMillis())));
                            }
                            int satelliteCount = gnssStatus.getSatelliteCount();
                            int i = 0;
                            int i2 = 0;
                            int i3 = 0;
                            for (int i4 = 0; i4 < satelliteCount; i4++) {
                                if (gnssStatus.getConstellationType(i4) == 1) {
                                    i++;
                                    LogUtils.a("SystemLocatorCn0DbHz: " + gnssStatus.getCn0DbHz(i4));
                                    if (gnssStatus.usedInFix(i4)) {
                                        LogUtils.a("SystemLocatorusedInFix : " + i4);
                                        i2++;
                                        if (gnssStatus.getCn0DbHz(i4) > 25.0f) {
                                            i3++;
                                        }
                                    }
                                }
                            }
                            GpsInfo gpsInfo = new GpsInfo();
                            gpsInfo.view = i;
                            gpsInfo.available = i2;
                            SystemLocator.this.s = i;
                            SystemLocator.this.p = i2;
                            SystemLocator.this.q = i3;
                            LogUtils.a("SystemLocatorview satelites: " + i + " used satelites: " + i2);
                            Bundle bundle = new Bundle();
                            try {
                                bundle.putSerializable("gpsInfo", gpsInfo);
                                bundle.putInt(Constants.SPEED_METER_STEP, 3);
                                bundle.putInt("type", 0);
                                int a2 = SystemLocator.this.a(i2, i3);
                                bundle.putInt("gpsQuality", a2);
                                location.setExtras(bundle);
                                com.meituan.android.common.locate.provider.d.a(a2);
                            } catch (Throwable th) {
                                com.meituan.android.common.locate.platform.logs.c.a(" SystemLocatorV3 onStart dexception = " + th.getMessage(), 3);
                                LogUtils.a(getClass(), th);
                            }
                            if (SystemLocator.b == null || SystemLocator.b.size() <= 0) {
                                return;
                            }
                            Iterator it = SystemLocator.b.iterator();
                            while (it.hasNext()) {
                                ((b) it.next()).a(gpsInfo);
                            }
                        }

                        @Override // android.location.GnssStatus.Callback
                        public void onStarted() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a362446b8e0dde57f8423138611f371a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a362446b8e0dde57f8423138611f371a");
                            } else {
                                super.onStarted();
                            }
                        }

                        @Override // android.location.GnssStatus.Callback
                        public void onStopped() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ae9a7ed9030c704d0f8e6b9bfd157e36", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ae9a7ed9030c704d0f8e6b9bfd157e36");
                                return;
                            }
                            super.onStopped();
                            SystemLocator.this.c();
                        }
                    };
                }
                if (!j || !d) {
                    return;
                }
                try {
                    LogUtils.a("SystemLocator -> registerGnssStatusCallback");
                    this.g.a(this.k);
                    com.meituan.android.common.locate.platform.sniffer.report.c.a().b();
                    com.meituan.android.common.locate.platform.sniffer.report.c.a().f++;
                    com.meituan.android.common.locate.fusionlocation.controller.a.a().c();
                    return;
                } catch (Throwable th) {
                    th = th;
                    sb = new StringBuilder(" SystemLocatorV3 onStart is exception s= ");
                }
            } else if (!j || !d) {
                return;
            } else {
                try {
                    LogUtils.a("SystemLocator -> addGpsStatusListener");
                    this.g.a((GpsStatus.Listener) this);
                    com.meituan.android.common.locate.platform.sniffer.report.c.a().c();
                    com.meituan.android.common.locate.platform.sniffer.report.c.a().e++;
                    com.meituan.android.common.locate.fusionlocation.controller.a.a().c();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    sb = new StringBuilder(" SystemLocatorV3 onStart is exception d= ");
                }
            }
            sb.append(th.getMessage());
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        }
    }

    public void stopGnnsEventListen() {
        StringBuilder sb;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed5f4b9a1d4c326e422c1a8d90ca60c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed5f4b9a1d4c326e422c1a8d90ca60c9");
        } else if (this.g == null) {
        } else {
            com.meituan.android.common.locate.platform.logs.c.a("SystemLocator:stopGnnsEventListen", 3);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    this.g.b(this.k);
                    com.meituan.android.common.locate.fusionlocation.controller.a.a().b();
                    com.meituan.android.common.locate.platform.sniffer.report.c.a().d();
                    return;
                } catch (Throwable th) {
                    th = th;
                    sb = new StringBuilder("SystemLocatorV3::onstop::unregisterGnssStatusCallback ");
                }
            } else {
                try {
                    this.g.b(this);
                    com.meituan.android.common.locate.fusionlocation.controller.a.a().b();
                    com.meituan.android.common.locate.platform.sniffer.report.c.a().e();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    sb = new StringBuilder("SystemLocatorV3::onstop::removeGpsStatusListener ");
                }
            }
            sb.append(th.getMessage());
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x053f A[Catch: Throwable -> 0x0558, LOOP:0: B:102:0x0539->B:104:0x053f, LOOP_END, TryCatch #3 {Throwable -> 0x0558, blocks: (B:16:0x0083, B:18:0x00a2, B:20:0x00ab, B:22:0x00b1, B:24:0x00be, B:25:0x00c9, B:27:0x00e6, B:29:0x00e9, B:33:0x00fb, B:35:0x011c, B:36:0x012b, B:38:0x0131, B:40:0x013b, B:42:0x01cd, B:43:0x01db, B:45:0x01ee, B:47:0x0244, B:49:0x024f, B:51:0x02a5, B:76:0x04b4, B:78:0x04b8, B:84:0x04d0, B:85:0x04da, B:87:0x04e6, B:89:0x04ea, B:90:0x04f7, B:91:0x04fc, B:94:0x0515, B:96:0x051e, B:97:0x0521, B:99:0x052b, B:101:0x0533, B:102:0x0539, B:104:0x053f, B:106:0x054b, B:54:0x0374, B:56:0x0378, B:58:0x038f, B:60:0x03df, B:69:0x0405, B:71:0x040b, B:72:0x0487, B:65:0x03f2, B:93:0x0500, B:44:0x01df, B:39:0x0137), top: B:117:0x0083, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x054b A[Catch: Throwable -> 0x0558, TRY_LEAVE, TryCatch #3 {Throwable -> 0x0558, blocks: (B:16:0x0083, B:18:0x00a2, B:20:0x00ab, B:22:0x00b1, B:24:0x00be, B:25:0x00c9, B:27:0x00e6, B:29:0x00e9, B:33:0x00fb, B:35:0x011c, B:36:0x012b, B:38:0x0131, B:40:0x013b, B:42:0x01cd, B:43:0x01db, B:45:0x01ee, B:47:0x0244, B:49:0x024f, B:51:0x02a5, B:76:0x04b4, B:78:0x04b8, B:84:0x04d0, B:85:0x04da, B:87:0x04e6, B:89:0x04ea, B:90:0x04f7, B:91:0x04fc, B:94:0x0515, B:96:0x051e, B:97:0x0521, B:99:0x052b, B:101:0x0533, B:102:0x0539, B:104:0x053f, B:106:0x054b, B:54:0x0374, B:56:0x0378, B:58:0x038f, B:60:0x03df, B:69:0x0405, B:71:0x040b, B:72:0x0487, B:65:0x03f2, B:93:0x0500, B:44:0x01df, B:39:0x0137), top: B:117:0x0083, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04e6 A[Catch: Exception -> 0x0370, Throwable -> 0x0558, TryCatch #0 {Exception -> 0x0370, blocks: (B:51:0x02a5, B:84:0x04d0, B:85:0x04da, B:87:0x04e6, B:89:0x04ea, B:90:0x04f7, B:91:0x04fc, B:54:0x0374, B:56:0x0378, B:58:0x038f, B:60:0x03df, B:69:0x0405, B:71:0x040b, B:72:0x0487, B:65:0x03f2), top: B:111:0x02a3, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x051e A[Catch: Throwable -> 0x0558, TryCatch #3 {Throwable -> 0x0558, blocks: (B:16:0x0083, B:18:0x00a2, B:20:0x00ab, B:22:0x00b1, B:24:0x00be, B:25:0x00c9, B:27:0x00e6, B:29:0x00e9, B:33:0x00fb, B:35:0x011c, B:36:0x012b, B:38:0x0131, B:40:0x013b, B:42:0x01cd, B:43:0x01db, B:45:0x01ee, B:47:0x0244, B:49:0x024f, B:51:0x02a5, B:76:0x04b4, B:78:0x04b8, B:84:0x04d0, B:85:0x04da, B:87:0x04e6, B:89:0x04ea, B:90:0x04f7, B:91:0x04fc, B:94:0x0515, B:96:0x051e, B:97:0x0521, B:99:0x052b, B:101:0x0533, B:102:0x0539, B:104:0x053f, B:106:0x054b, B:54:0x0374, B:56:0x0378, B:58:0x038f, B:60:0x03df, B:69:0x0405, B:71:0x040b, B:72:0x0487, B:65:0x03f2, B:93:0x0500, B:44:0x01df, B:39:0x0137), top: B:117:0x0083, inners: #0 }] */
    @Override // android.location.LocationListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLocationChanged(final android.location.Location r27) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.locator.SystemLocator.onLocationChanged(android.location.Location):void");
    }
}
