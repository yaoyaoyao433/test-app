package com.meituan.android.common.locate.loader.strategy;

import com.meituan.android.common.locate.LocationInfo;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class Timer extends Instant {
    public static ChangeQuickRedirect changeQuickRedirect;

    public Timer() {
        super(LocationLoaderFactory.LoadStrategy.timer);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fff4e207a885e0ff8a885611895d5660", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fff4e207a885e0ff8a885611895d5660");
        }
    }

    @Override // com.meituan.android.common.locate.loader.strategy.Instant, com.meituan.android.common.locate.loader.strategy.Normal, com.meituan.android.common.locate.loader.BaseLocationStrategy, com.meituan.android.common.locate.loader.LocationStrategy
    public String getName() {
        return "Timer";
    }

    @Override // com.meituan.android.common.locate.loader.strategy.Normal, com.meituan.android.common.locate.loader.LocationStrategy
    public boolean goodEnough(LocationInfo locationInfo) {
        Object[] objArr = {locationInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d2e9159a3a505303e4b0c4abd018678", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d2e9159a3a505303e4b0c4abd018678")).booleanValue();
        }
        if (locationInfo == null || locationInfo.location == null) {
            return false;
        }
        return "mars".equals(locationInfo.location.getProvider());
    }
}
