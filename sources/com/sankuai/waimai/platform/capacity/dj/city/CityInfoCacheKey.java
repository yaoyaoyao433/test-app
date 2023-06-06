package com.sankuai.waimai.platform.capacity.dj.city;

import android.support.annotation.Keep;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CityInfoCacheKey {
    private static final String CITY_INFO_KEY_PREFIX = "CITY_INFO_KEY_PREFIX_";
    public static final int MAX_METER_DISTANCE_BETWEEN_POINTS = 100;
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String cipStoreKey;
    private int geoHash;
    public final double latitude;
    public final double longitude;

    public CityInfoCacheKey(double d, double d2) {
        String str;
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a54d1b1beb07d3cd70955bc7141645be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a54d1b1beb07d3cd70955bc7141645be");
            return;
        }
        this.latitude = d;
        this.longitude = d2;
        String str2 = CITY_INFO_KEY_PREFIX + this.latitude + CommonConstant.Symbol.UNDERLINE + this.longitude;
        try {
            str = c.a(d, d2, 7).a();
            try {
                this.geoHash = str.hashCode();
            } catch (Exception unused) {
                this.geoHash = Objects.hash(Double.valueOf(d), Double.valueOf(d2));
                this.cipStoreKey = CITY_INFO_KEY_PREFIX + str;
            }
        } catch (Exception unused2) {
            str = str2;
        }
        this.cipStoreKey = CITY_INFO_KEY_PREFIX + str;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "feefd250c21f4fb7c019fcd1a428864f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "feefd250c21f4fb7c019fcd1a428864f")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof CityInfoCacheKey) {
            CityInfoCacheKey cityInfoCacheKey = (CityInfoCacheKey) obj;
            return LocationUtils.meterDistanceBetweenPoints(cityInfoCacheKey.latitude, cityInfoCacheKey.longitude, this.latitude, this.longitude) <= 100.0d;
        }
        return false;
    }

    public int hashCode() {
        return this.geoHash;
    }
}
