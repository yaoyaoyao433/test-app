package com.meituan.android.common.locate.offline;

import android.content.Context;
import android.location.Location;
import android.net.wifi.ScanResult;
import com.meituan.android.common.locate.MtLocation;
import java.util.List;
@Deprecated
/* loaded from: classes2.dex */
public interface IOfflineSeek {
    Location getOfflineResult(Context context, Object obj, List<ScanResult> list, double d, double d2);

    MtLocation getOfflineStartLocation();

    MtLocation getOfflineUserResult(Context context, Object obj, List<ScanResult> list);

    boolean isUserOfflineSeeking();

    void updateOfflineStartLocation(Location location);
}
