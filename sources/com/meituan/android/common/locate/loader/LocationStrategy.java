package com.meituan.android.common.locate.loader;

import com.meituan.android.common.locate.LocationInfo;
import com.meituan.android.common.locate.MtLocationInfo;
/* loaded from: classes2.dex */
public interface LocationStrategy {
    public static final long CACHE_VALIDITY = 30000;
    public static final long DELIVER_INTERVAL = 1000;
    public static final long LOCATION_TIMEOUT = 60000;
    public static final long MARK_VALIDITY = 1800000;

    boolean adopt(LocationInfo locationInfo);

    boolean adopt(MtLocationInfo mtLocationInfo);

    String getAssistMode();

    String getAssistType();

    long getDeliverInterval();

    float getGpsDistanceGap();

    long getGpsFixFirstWait();

    long getGpsTimeGap();

    String getLocationMode();

    String getLocationPurpose();

    long getLocationTimeout();

    String getName();

    boolean goodEnough(LocationInfo locationInfo);

    boolean goodEnough(MtLocationInfo mtLocationInfo);

    boolean isForceSingleCallback();

    boolean isGpsMinDataTakeEffect();
}
