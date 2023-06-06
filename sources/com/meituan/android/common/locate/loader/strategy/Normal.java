package com.meituan.android.common.locate.loader.strategy;

import android.os.Bundle;
import android.os.SystemClock;
import com.meituan.android.common.locate.LocationInfo;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.common.locate.MtLocationInfo;
import com.meituan.android.common.locate.loader.BaseLocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class Normal extends BaseLocationStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;

    public Normal() {
        super(LocationLoaderFactory.LoadStrategy.normal);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "884bced3c3cb554f2bf41c17b00bc42f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "884bced3c3cb554f2bf41c17b00bc42f");
        }
    }

    public Normal(LocationLoaderFactory.LoadStrategy loadStrategy) {
        super(loadStrategy);
        Object[] objArr = {loadStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f04dcb2d0a2431fdfd520a54f52289d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f04dcb2d0a2431fdfd520a54f52289d6");
        }
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public boolean adopt(LocationInfo locationInfo) {
        Bundle extras;
        Object[] objArr = {locationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c7f70aa2935dcab5aaf87d25d584228", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c7f70aa2935dcab5aaf87d25d584228")).booleanValue();
        }
        if (locationInfo.location == null || (extras = locationInfo.location.getExtras()) == null || !extras.getString("from").startsWith("offline")) {
            if (locationInfo.isCachedLocation) {
                if ("mark".equals(locationInfo.location.getProvider())) {
                    if (SystemClock.elapsedRealtime() - locationInfo.locationGotTime < this.c) {
                        return true;
                    }
                } else if (SystemClock.elapsedRealtime() - locationInfo.locationGotTime < this.b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public boolean adopt(MtLocationInfo mtLocationInfo) {
        Bundle extras;
        Object[] objArr = {mtLocationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8382a08e060f8fca615b4630184f5a63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8382a08e060f8fca615b4630184f5a63")).booleanValue();
        }
        if (mtLocationInfo.location == null || (extras = mtLocationInfo.location.getExtras()) == null || !"offline".equals(extras.getString("from"))) {
            if (mtLocationInfo.isCachedLocation) {
                if (mtLocationInfo.location == null || !"mark".equals(mtLocationInfo.location.getProvider())) {
                    if (SystemClock.elapsedRealtime() - mtLocationInfo.locationGotTime < this.b) {
                        return true;
                    }
                } else if (SystemClock.elapsedRealtime() - mtLocationInfo.locationGotTime < this.c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.meituan.android.common.locate.loader.BaseLocationStrategy, com.meituan.android.common.locate.loader.LocationStrategy
    public String getName() {
        return "normal";
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public boolean goodEnough(LocationInfo locationInfo) {
        Object[] objArr = {locationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36b8bd8e98b0a9ec10c1796d03ddf517", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36b8bd8e98b0a9ec10c1796d03ddf517")).booleanValue() : "mark".equals(locationInfo.location.getProvider());
    }

    @Override // com.meituan.android.common.locate.loader.LocationStrategy
    public boolean goodEnough(MtLocationInfo mtLocationInfo) {
        Object[] objArr = {mtLocationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d30a54328052dc4c517a4f0aa05a958", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d30a54328052dc4c517a4f0aa05a958")).booleanValue() : "mark".equals(mtLocationInfo.location.getProvider());
    }
}
