package com.meituan.android.common.locate.posdrift;

import android.os.Bundle;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;
    public e a;
    public MtLocation b;
    private h c;
    private f d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private double i;
    private long j;
    private long k;
    private final double l;
    private boolean m;

    public c(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e929abf14745ce2d6bc197b00b08bdd8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e929abf14745ce2d6bc197b00b08bdd8");
            return;
        }
        this.a = null;
        this.b = null;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = -1L;
        this.i = 1.0d;
        this.j = LocationStrategy.LOCATION_TIMEOUT;
        this.k = 30000L;
        this.l = 50.0d;
        this.m = false;
        a(d);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "068e106a5810b3c3ba591fce51cdf44e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "068e106a5810b3c3ba591fce51cdf44e");
            return;
        }
        this.c.a();
        this.d.a();
        this.e = true;
        this.f = true;
        this.g = true;
        this.b = null;
        this.a = null;
    }

    private void a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d3d91763ea101d08aac64a5dd2b0af5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d3d91763ea101d08aac64a5dd2b0af5");
            return;
        }
        this.c = new h(d);
        this.d = new f();
        this.e = true;
        this.f = true;
        this.g = true;
        this.b = null;
        this.a = null;
    }

    private MtLocation b(MtLocation mtLocation) {
        Bundle extras;
        String str;
        String str2;
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df16f3b941d69dbaba23c66af77769c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df16f3b941d69dbaba23c66af77769c7");
        }
        this.h = mtLocation.getTime();
        this.m = this.c.b();
        this.a = this.d.a(this.m, mtLocation);
        MtLocation b = this.a.b();
        if (!this.c.b()) {
            LogUtils.a("shaking_zjd: motion");
            this.b = mtLocation;
            mtLocation.getExtras().putString("pos_drift", "motion");
            return mtLocation;
        }
        if (this.e) {
            LogUtils.a("shaking_zjd: first mars");
            this.e = false;
            this.b = b;
            extras = b.getExtras();
            str = "pos_drift";
            str2 = "converge: first mars";
        } else if (this.f && mtLocation.getAccuracy() < 10.0f) {
            LogUtils.a("shaking_zjd: mars:10m");
            this.f = false;
            this.b = b;
            extras = b.getExtras();
            str = "pos_drift";
            str2 = "converge: acc<10m";
        } else if (this.a.a() <= this.i) {
            LogUtils.a("shaking_zjd:discard mars, weight=" + this.a.a());
            this.b.getExtras().putString("pos_drift", "last_loc:" + this.a.a());
            this.b.setTime(mtLocation.getTime());
            return this.b;
        } else {
            LogUtils.a("shaking_zjd: weight>1.0:" + this.a.a());
            b.setSpeed(0.0f);
            this.b = b;
            extras = b.getExtras();
            str = "pos_drift";
            str2 = "converge:" + this.a.a();
        }
        extras.putString(str, str2);
        return b;
    }

    public MtLocation a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ce15df3fea652c17c493077783b9fd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ce15df3fea652c17c493077783b9fd0");
        }
        if (mtLocation == null) {
            if (this.b != null) {
                this.b.getExtras().putString("pos_drift", "last_loc");
            }
            return this.b;
        } else if (!mtLocation.getProvider().equals(GearsLocator.GEARS_PROVIDER)) {
            if (this.d == null || this.c == null) {
                LogUtils.a("shaking_zjd:no init");
                this.b = mtLocation;
                mtLocation.getExtras().putString("pos_drift", "no_init");
                return mtLocation;
            } else if (this.h <= 0 || mtLocation.getTime() - this.h <= this.j) {
                return b(mtLocation);
            } else {
                LogUtils.a("shaking_zjd:reinit");
                a();
                this.h = mtLocation.getTime();
                this.b = mtLocation;
                mtLocation.getExtras().putString("pos_drift", "reinit");
                return mtLocation;
            }
        } else {
            if (this.h < 0 || mtLocation.getTime() - this.h > this.k) {
                if (this.g) {
                    LogUtils.a("shaking_zjd:first gears");
                    this.g = false;
                    this.h = mtLocation.getTime();
                    this.b = mtLocation;
                    mtLocation.getExtras().putString("pos_drift", "first_gears");
                    return mtLocation;
                }
            } else if (this.b.getProvider().equals(GearsLocator.GEARS_PROVIDER)) {
                double a = com.meituan.android.common.locate.util.d.a(this.b.getLatitude(), this.b.getLongitude(), mtLocation.getLatitude(), mtLocation.getLongitude());
                if (a > 50.0d) {
                    this.b = mtLocation;
                    LogUtils.a("shaking_zjd: gears > distance threshold");
                    Bundle extras = mtLocation.getExtras();
                    extras.putString("pos_drift", "gears > distance:" + a);
                    return mtLocation;
                }
            }
            LogUtils.a("shaking_zjd:discard gears");
            this.b.getExtras().putString("pos_drift", "last_loc");
            this.b.setTime(mtLocation.getTime());
            return this.b;
        }
    }

    public void a(int i, long j, float[] fArr) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c992a6a79079456773452ac159de616d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c992a6a79079456773452ac159de616d");
        } else if (this.c == null) {
        } else {
            if (i == g.a) {
                this.c.a(j, fArr);
            } else if (i == g.c) {
                this.c.b(j, fArr);
            }
        }
    }
}
