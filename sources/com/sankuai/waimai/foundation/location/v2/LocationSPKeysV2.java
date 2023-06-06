package com.sankuai.waimai.foundation.location.v2;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public enum LocationSPKeysV2 {
    REAL_LOCATION,
    POI_LOCATION,
    CUSTOM_POI_LOCATION,
    REAL_ADDRESS,
    POI_ADDRESS,
    POI_MEITUAN_CITY,
    POI_MAF_CITY,
    REAL_MEITUAN_CITY,
    REAL_MAF_CITY,
    ADDRESS_LIST,
    NEW_STRATEGY_ADDRESS_CACHE,
    NEW_STRATEGY_ADDRESS_CACHE_DURATION,
    ADDR_CONFIG_DISTANCE,
    GB_CITY_INFO,
    REAL_GB_CITY_INFO,
    REAL_BACKEND_MT_CITY,
    POI_BACKEND_MT_CITY;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static LocationSPKeysV2 valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b5ee7d8a8163ce278f8155ad24b192a", RobustBitConfig.DEFAULT_VALUE) ? (LocationSPKeysV2) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b5ee7d8a8163ce278f8155ad24b192a") : (LocationSPKeysV2) Enum.valueOf(LocationSPKeysV2.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LocationSPKeysV2[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd33bcdc42b6e2ecbc5411512a8e0cac", RobustBitConfig.DEFAULT_VALUE) ? (LocationSPKeysV2[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd33bcdc42b6e2ecbc5411512a8e0cac") : (LocationSPKeysV2[]) values().clone();
    }

    LocationSPKeysV2() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1457fb20b714c9c2b1c864f9abe6502d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1457fb20b714c9c2b1c864f9abe6502d");
        }
    }
}
