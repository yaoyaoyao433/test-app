package com.meituan.android.common.locate.locator;

import android.location.Location;
import com.meituan.android.common.locate.Locator;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.provider.GpsInfo;
import com.meituan.android.common.locate.reporter.m;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class c extends com.meituan.android.common.locate.c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private m b;
    private boolean c;
    private Locator.LocationListener d;

    public c(m mVar, Locator.LocationListener locationListener) {
        Object[] objArr = {mVar, locationListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83bc870935a5add195de05c7b10b9340", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83bc870935a5add195de05c7b10b9340");
            return;
        }
        this.b = null;
        this.c = false;
        this.d = null;
        this.b = mVar;
        this.d = locationListener;
    }

    public void a() {
        this.c = false;
    }

    @Override // com.meituan.android.common.locate.c
    public void a(MtLocation mtLocation, int i) {
        this.c = true;
    }

    @Override // com.meituan.android.common.locate.c
    public void b(MtLocation mtLocation, int i) {
        Object[] objArr = {mtLocation, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96b1459f1d9714f046ac0df7df23403d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96b1459f1d9714f046ac0df7df23403d");
        } else if (this.c) {
            LogUtils.a("getNewLocation in type:" + i);
            if (this.d != null) {
                this.d.onLocationGot(mtLocation);
            } else {
                LogUtils.a("LocationMsgHandler locationListener is null");
            }
        }
    }

    @Override // com.meituan.android.common.locate.c
    public void c(MtLocation mtLocation, int i) {
        Object[] objArr = {mtLocation, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c77d51fcf0f1af917c6aab1637c2921", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c77d51fcf0f1af917c6aab1637c2921");
        } else {
            mtLocation.getExtras().getSerializable("gpsInfo");
        }
    }

    @Override // com.meituan.android.common.locate.c
    public void d(MtLocation mtLocation, int i) {
        Object[] objArr = {mtLocation, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7d8d4809179cd96c8246342e0ae823b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7d8d4809179cd96c8246342e0ae823b");
            return;
        }
        GpsInfo gpsInfo = (GpsInfo) mtLocation.getExtras().getSerializable("gpsInfo");
        LogUtils.a("LocationMsgHandler gps getGpsSatellites " + gpsInfo.available + " gpsInfo.view " + gpsInfo.view);
    }

    @Override // com.meituan.android.common.locate.c
    public void e(MtLocation mtLocation, int i) {
    }

    @Override // com.meituan.android.common.locate.c
    public void f(MtLocation mtLocation, int i) {
    }

    @Override // com.meituan.android.common.locate.c
    public void g(MtLocation mtLocation, int i) {
    }

    @Override // com.meituan.android.common.locate.Locator.LocationListener
    public void onLocationGot(Location location) {
    }
}
