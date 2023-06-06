package com.meituan.android.privacy.aop;

import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationManager;
import android.support.annotation.Nullable;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile u b;

    public static Location a(LocationManager locationManager, String str) {
        Object[] objArr = {locationManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba8687d783a5682d36fbdd300f6509c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Location) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba8687d783a5682d36fbdd300f6509c1");
        }
        if (a() == null) {
            return null;
        }
        return a().a(str);
    }

    public static GpsStatus a(LocationManager locationManager, @Nullable GpsStatus gpsStatus) {
        Object[] objArr = {locationManager, gpsStatus};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "815b804109422082c8bcf18e5441355f", RobustBitConfig.DEFAULT_VALUE)) {
            return (GpsStatus) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "815b804109422082c8bcf18e5441355f");
        }
        if (a() == null) {
            return null;
        }
        return a().a(gpsStatus);
    }

    private static u a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20348468d7c2fc9cf0fe755115f26f04", RobustBitConfig.DEFAULT_VALUE)) {
            return (u) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20348468d7c2fc9cf0fe755115f26f04");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    if (com.meituan.android.privacy.impl.d.a() == null) {
                        return null;
                    }
                    b = Privacy.createLocationManager(com.meituan.android.privacy.impl.d.a(), "privacy-hook");
                }
            }
        }
        return b;
    }
}
