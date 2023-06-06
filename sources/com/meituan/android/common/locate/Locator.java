package com.meituan.android.common.locate;

import android.location.Location;
/* loaded from: classes2.dex */
public interface Locator {

    /* loaded from: classes2.dex */
    public interface LocationListener {
        @Deprecated
        void onLocationGot(Location location);

        void onLocationGot(MtLocation mtLocation);
    }

    void forceRequest();

    boolean isIstantStrategy();

    void setGpsMinDistance(float f);

    void setGpsMinTime(long j);

    void setListener(LocationListener locationListener);

    void start();

    void stop();
}
