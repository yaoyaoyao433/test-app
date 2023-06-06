package com.sankuai.waimai.foundation.location;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
@Deprecated
/* loaded from: classes4.dex */
public enum LocationSPKeys {
    CITY_CODE,
    CITY_NAME,
    A_CITY_ID,
    A_CITY_NAME,
    REAL_CITY_NAME,
    REAL_CITY_CODE,
    POI_LOCATION,
    REAL_LOCATION,
    REAL_LOCATION_ACCURACY,
    HORN_LOCATION_CONFIG,
    REAL_LAT_WITH_PERMISSION,
    REAL_LNG_WITH_PERMISSION,
    WM_ADDRESS_RECOMMEND_SWITCH,
    WM_MATCH_FAILED,
    WM_MATCH_SUCCESS,
    WM_ORDER_MATCH_FAILED,
    WM_ORDER_MATCH_SUCCESS,
    WM_VALID_DAY,
    WM_RECORD_COUNT;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static LocationSPKeys valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "885f46ff53cd77e01e5a0f97fcc2e152", RobustBitConfig.DEFAULT_VALUE) ? (LocationSPKeys) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "885f46ff53cd77e01e5a0f97fcc2e152") : (LocationSPKeys) Enum.valueOf(LocationSPKeys.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LocationSPKeys[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "59472b7bb3605e9e2d42c99c2291c178", RobustBitConfig.DEFAULT_VALUE) ? (LocationSPKeys[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "59472b7bb3605e9e2d42c99c2291c178") : (LocationSPKeys[]) values().clone();
    }

    LocationSPKeys() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47662feecf4ed6c30031d60b033a5c8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47662feecf4ed6c30031d60b033a5c8f");
        }
    }
}
