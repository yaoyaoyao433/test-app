package com.meituan.android.common.locate;

import android.location.Location;
import com.meituan.robust.ChangeQuickRedirect;
@Deprecated
/* loaded from: classes2.dex */
public class LocationInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final boolean isCachedLocation;
    public final long locateStartTime;
    public final Location location;
    public final long locationGotTime;

    @Deprecated
    /* loaded from: classes2.dex */
    public interface LocationInfoListener {
        boolean onLocationGot(LocationInfo locationInfo);
    }

    public LocationInfo(Location location, boolean z, long j, long j2) {
        this.location = location;
        this.isCachedLocation = z;
        this.locateStartTime = j;
        this.locationGotTime = j2;
    }
}
