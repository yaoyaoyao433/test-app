package com.meituan.android.common.locate.locator;

import android.os.Bundle;
import com.meituan.android.common.locate.Locator;
import com.meituan.android.common.locate.MasterLocatorImpl;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes2.dex */
public abstract class AbstractLocator implements Locator {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final HashSet<Locator.LocationListener> a;
    private int b;
    protected MasterLocatorImpl masterLocator;

    public AbstractLocator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f7523a0bcb752b7c4b20c248769ff09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f7523a0bcb752b7c4b20c248769ff09");
            return;
        }
        this.a = new HashSet<>();
        this.b = -1;
    }

    @Override // com.meituan.android.common.locate.Locator
    public boolean isIstantStrategy() {
        return false;
    }

    public void notifyLocatorMsg(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2fadca38d63fd5019d4c1d3dc8af198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2fadca38d63fd5019d4c1d3dc8af198");
        } else if (this.a == null || mtLocation == null) {
        } else {
            try {
                LogUtils.a("notifyLocatorMsg: " + mtLocation.getProvider());
                Iterator<Locator.LocationListener> it = this.a.iterator();
                while (it.hasNext()) {
                    it.next().onLocationGot(mtLocation);
                }
            } catch (Exception e) {
                LogUtils.a(getClass(), e);
            }
        }
    }

    public abstract int onStart();

    public abstract void onStop();

    @Override // com.meituan.android.common.locate.Locator
    @Deprecated
    public void setGpsMinDistance(float f) {
    }

    @Override // com.meituan.android.common.locate.Locator
    public void setGpsMinTime(long j) {
    }

    @Override // com.meituan.android.common.locate.Locator
    public void setListener(Locator.LocationListener locationListener) {
        Object[] objArr = {locationListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "710ea35b3197da1798b42571a075cdd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "710ea35b3197da1798b42571a075cdd7");
        } else if (locationListener == null || this.a == null) {
        } else {
            this.a.add(locationListener);
        }
    }

    public void setMasterLocator(MasterLocatorImpl masterLocatorImpl) {
        this.masterLocator = masterLocatorImpl;
    }

    @Override // com.meituan.android.common.locate.Locator
    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f59a3ec3d8129b2822db665f48d7fcf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f59a3ec3d8129b2822db665f48d7fcf0");
            return;
        }
        this.b = onStart();
        MtLocation mtLocation = new MtLocation("AbstractLocator start ");
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.SPEED_METER_STEP, 0);
        bundle.putInt("type", this.b);
        mtLocation.setExtras(bundle);
        notifyLocatorMsg(mtLocation);
    }

    @Override // com.meituan.android.common.locate.Locator
    public void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "263fb08acbb5126ddb98158dd24c86e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "263fb08acbb5126ddb98158dd24c86e9");
            return;
        }
        MtLocation mtLocation = new MtLocation("AbstractLocator stop");
        Bundle bundle = new Bundle();
        bundle.putInt("type", this.b);
        bundle.putInt(Constants.SPEED_METER_STEP, 4);
        mtLocation.setExtras(bundle);
        notifyLocatorMsg(mtLocation);
        onStop();
    }
}
