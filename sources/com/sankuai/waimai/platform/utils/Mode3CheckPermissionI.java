package com.sankuai.waimai.platform.utils;

import android.app.Activity;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface Mode3CheckPermissionI {
    public static final String KEY = "Mode3CheckPermission";

    boolean isLocateFailed(WMLocation wMLocation);

    void openLocationPermission(Activity activity, com.meituan.android.privacy.interfaces.d dVar);

    void startLocateScheme(Activity activity);
}
