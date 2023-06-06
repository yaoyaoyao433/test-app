package com.meituan.android.common.fingerprint.info;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LocationInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private double latitude;
    private double longitude;

    public LocationInfo(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c97f9fd4533efb4d0ed851629508d67f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c97f9fd4533efb4d0ed851629508d67f");
            return;
        }
        this.latitude = d;
        this.longitude = d2;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "283ba92a7cd63fb340957b4b2282f7cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "283ba92a7cd63fb340957b4b2282f7cd");
        } else {
            this.latitude = d;
        }
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c950b184359278e3a6e15c582a51b0f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c950b184359278e3a6e15c582a51b0f3");
        } else {
            this.longitude = d;
        }
    }
}
