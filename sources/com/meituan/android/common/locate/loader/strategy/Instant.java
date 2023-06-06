package com.meituan.android.common.locate.loader.strategy;

import android.os.Bundle;
import android.os.SystemClock;
import com.meituan.android.common.locate.LocationInfo;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.common.locate.MtLocationInfo;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
@Deprecated
/* loaded from: classes2.dex */
public class Instant extends Normal {
    public static ChangeQuickRedirect changeQuickRedirect;

    public Instant() {
        super(LocationLoaderFactory.LoadStrategy.instant);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2960a8b9c56acd9cf76251445ba8158", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2960a8b9c56acd9cf76251445ba8158");
        } else {
            this.e = 0.0f;
        }
    }

    public Instant(LocationLoaderFactory.LoadStrategy loadStrategy) {
        super(loadStrategy);
        Object[] objArr = {loadStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "622a8a86e058ed1312a29859641aa725", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "622a8a86e058ed1312a29859641aa725");
        } else {
            this.e = 0.0f;
        }
    }

    @Override // com.meituan.android.common.locate.loader.strategy.Normal, com.meituan.android.common.locate.loader.LocationStrategy
    public boolean adopt(LocationInfo locationInfo) {
        Object[] objArr = {locationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7be0f79f09dabad2228f94752647f117", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7be0f79f09dabad2228f94752647f117")).booleanValue();
        }
        if (locationInfo.isCachedLocation) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            r0 = elapsedRealtime - locationInfo.locationGotTime < this.b;
            LogUtils.a("current time - locationGotTime: " + (elapsedRealtime - locationInfo.locationGotTime));
        }
        return r0;
    }

    @Override // com.meituan.android.common.locate.loader.strategy.Normal, com.meituan.android.common.locate.loader.LocationStrategy
    public boolean adopt(MtLocationInfo mtLocationInfo) {
        Bundle extras;
        Object[] objArr = {mtLocationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58b75b1663e373e4bfaaeca7687821f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58b75b1663e373e4bfaaeca7687821f9")).booleanValue();
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

    @Override // com.meituan.android.common.locate.loader.strategy.Normal, com.meituan.android.common.locate.loader.BaseLocationStrategy, com.meituan.android.common.locate.loader.LocationStrategy
    public String getName() {
        return "Instant";
    }
}
