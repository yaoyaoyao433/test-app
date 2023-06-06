package com.meituan.android.common.locate;

import android.location.Location;
import com.meituan.android.common.locate.LocationInfo;
import com.meituan.android.common.locate.Locator;
import com.meituan.android.common.locate.MtLocationInfo;
/* loaded from: classes2.dex */
public interface MasterLocator extends Locator.LocationListener {
    public static final String MARK_PROVIDER = "mark";

    @Deprecated
    void activeListener(LocationInfo.LocationInfoListener locationInfoListener);

    void activeListener(MtLocationInfo.MtLocationInfoListener mtLocationInfoListener);

    @Deprecated
    void addListener(LocationInfo.LocationInfoListener locationInfoListener, boolean z);

    @Deprecated
    void addListener(LocationInfo.LocationInfoListener locationInfoListener, boolean z, boolean z2);

    void addListener(MtLocationInfo.MtLocationInfoListener mtLocationInfoListener, boolean z);

    void addListener(MtLocationInfo.MtLocationInfoListener mtLocationInfoListener, boolean z, boolean z2);

    void addLocator(Locator locator);

    @Deprecated
    void deactiveListener(LocationInfo.LocationInfoListener locationInfoListener);

    void deactiveListener(MtLocationInfo.MtLocationInfoListener mtLocationInfoListener);

    void forceRequest();

    @Deprecated
    Location getLastLocation();

    MtLocation getLastMtLocation();

    @Deprecated
    void removeListener(LocationInfo.LocationInfoListener locationInfoListener);

    void removeListener(MtLocationInfo.MtLocationInfoListener mtLocationInfoListener);

    @Deprecated
    void setEnable(boolean z);

    void setGpsInfo(long j, float f);

    void setLocation(Location location);

    void setMtLocation(MtLocation mtLocation);
}
