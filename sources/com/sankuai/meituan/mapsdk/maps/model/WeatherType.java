package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes4.dex */
public enum WeatherType {
    HOT(0),
    HOT_DISTORTION(1),
    HOT_SUN(2),
    RAIN_MEDIUM(3),
    RAIN_LARGE(4),
    RAIN_STORM(5),
    SNOW_MEDIUM(6),
    SNOW_LARGE(7),
    SNOW_STORM(8),
    DUST(9);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int a;

    public static WeatherType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64825132d49e957de5806e1f0e70e34b", RobustBitConfig.DEFAULT_VALUE) ? (WeatherType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64825132d49e957de5806e1f0e70e34b") : (WeatherType) Enum.valueOf(WeatherType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static WeatherType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9da0ca3ef487e2be81a4e86246f76c4", RobustBitConfig.DEFAULT_VALUE) ? (WeatherType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9da0ca3ef487e2be81a4e86246f76c4") : (WeatherType[]) values().clone();
    }

    WeatherType(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "784a44a25e1c159ea08277f03fd4fcfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "784a44a25e1c159ea08277f03fd4fcfc");
        } else {
            this.a = i;
        }
    }

    public final int getValue() {
        return this.a;
    }
}
