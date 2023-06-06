package com.meituan.android.common.locate.loader;

import com.meituan.robust.ChangeQuickRedirect;
@Deprecated
/* loaded from: classes2.dex */
public abstract class LocationAdopter extends BaseLocationStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.locate.loader.BaseLocationStrategy, com.meituan.android.common.locate.loader.LocationStrategy
    public long getLocationTimeout() {
        return LocationStrategy.LOCATION_TIMEOUT;
    }
}
