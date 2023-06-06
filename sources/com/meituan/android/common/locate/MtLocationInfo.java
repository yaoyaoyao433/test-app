package com.meituan.android.common.locate;

import com.meituan.robust.ChangeQuickRedirect;
/* loaded from: classes2.dex */
public class MtLocationInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final boolean isCachedLocation;
    public final long locateStartTime;
    public final MtLocation location;
    public final long locationGotTime;

    /* loaded from: classes2.dex */
    public interface MtLocationInfoListener {
        boolean onLocationGot(MtLocationInfo mtLocationInfo);
    }

    public MtLocationInfo(MtLocation mtLocation, boolean z, long j, long j2) {
        this.location = mtLocation;
        this.isCachedLocation = z;
        this.locateStartTime = j;
        this.locationGotTime = j2;
    }
}
