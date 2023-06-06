package com.sankuai.waimai.foundation.location.v2;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.locatesdk.LocateSDK;
import com.sankuai.waimai.foundation.location.model.AdminInfo;
import com.sankuai.waimai.foundation.location.model.MtBackCityInfo;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2> b = new com.sankuai.waimai.foundation.utils.e<>("waimai_location_common_sp2");

    private static double a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adc0f64e61bfcd398051a09f5c6c0518", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adc0f64e61bfcd398051a09f5c6c0518")).doubleValue() : (d * 3.141592653589793d) / 180.0d;
    }

    private static void a(City city, LocationSPKeysV2 locationSPKeysV2) {
        Object[] objArr = {city, locationSPKeysV2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b19faa92455368635b355ec69d5db7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b19faa92455368635b355ec69d5db7d");
        } else if (city != null) {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) locationSPKeysV2, city.toString());
        }
    }

    private static City b(LocationSPKeysV2 locationSPKeysV2) {
        Object[] objArr = {locationSPKeysV2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b88df9bf1e046697eb383793ce60099", RobustBitConfig.DEFAULT_VALUE)) {
            return (City) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b88df9bf1e046697eb383793ce60099");
        }
        String b2 = b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) locationSPKeysV2, "");
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        return City.parse(b2);
    }

    public static void a(City city) {
        Object[] objArr = {city};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86ba5b235fc7651802bd605db2dbd036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86ba5b235fc7651802bd605db2dbd036");
        } else {
            a(city, LocationSPKeysV2.REAL_MEITUAN_CITY);
        }
    }

    public static City a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea9bbfd45be34609d8b3358d45ef0671", RobustBitConfig.DEFAULT_VALUE) ? (City) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea9bbfd45be34609d8b3358d45ef0671") : b(LocationSPKeysV2.REAL_MEITUAN_CITY);
    }

    public static void b(City city) {
        Object[] objArr = {city};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6eea5d16afe9d24c954152aaa073d345", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6eea5d16afe9d24c954152aaa073d345");
        } else {
            a(city, LocationSPKeysV2.POI_MEITUAN_CITY);
        }
    }

    public static City b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45b39e32566464214af15527a7bfb51a", RobustBitConfig.DEFAULT_VALUE) ? (City) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45b39e32566464214af15527a7bfb51a") : b(LocationSPKeysV2.POI_MEITUAN_CITY);
    }

    public static void c(City city) {
        Object[] objArr = {city};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7de45c2b6d8a7e0974c70321591dfa88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7de45c2b6d8a7e0974c70321591dfa88");
            return;
        }
        a(city, LocationSPKeysV2.POI_MAF_CITY);
        if (city == null || TextUtils.isEmpty(city.getCityCode())) {
            return;
        }
        com.sankuai.waimai.foundation.location.g.b(city.getCityCode());
        com.sankuai.waimai.foundation.location.g.c(city.getCityName());
    }

    public static City c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbc93660e52d12165ee4e52a87188ca8", RobustBitConfig.DEFAULT_VALUE) ? (City) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbc93660e52d12165ee4e52a87188ca8") : b(LocationSPKeysV2.POI_MAF_CITY);
    }

    public static void d(City city) {
        Object[] objArr = {city};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b68db294926b1471cc0778db83b958d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b68db294926b1471cc0778db83b958d7");
            return;
        }
        a(city, LocationSPKeysV2.REAL_MAF_CITY);
        if (city == null || TextUtils.isEmpty(city.getCityCode())) {
            return;
        }
        com.sankuai.waimai.foundation.location.g.e(city.getCityCode());
        com.sankuai.waimai.foundation.location.g.d(city.getCityName());
    }

    public static City d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d63a7499effcdb9cc12afe16543a1f39", RobustBitConfig.DEFAULT_VALUE) ? (City) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d63a7499effcdb9cc12afe16543a1f39") : b(LocationSPKeysV2.REAL_MAF_CITY);
    }

    private static void a(WmAddress wmAddress, LocationSPKeysV2 locationSPKeysV2) {
        Object[] objArr = {wmAddress, locationSPKeysV2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba4717d1db76a33a69f7cd659a610eb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba4717d1db76a33a69f7cd659a610eb2");
        } else if (wmAddress != null && wmAddress.hasAddress()) {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) locationSPKeysV2, wmAddress.toString());
        } else if (locationSPKeysV2 == LocationSPKeysV2.POI_ADDRESS) {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) locationSPKeysV2, "");
        }
    }

    private static WmAddress c(LocationSPKeysV2 locationSPKeysV2) {
        Object[] objArr = {locationSPKeysV2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c95e8c20906dcf45a2c03cafd24a1f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (WmAddress) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c95e8c20906dcf45a2c03cafd24a1f2");
        }
        String b2 = b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) locationSPKeysV2, "");
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        return WmAddress.parse(b2);
    }

    public static void a(WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c7ca77bbbee69771a794ad6c966b5a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c7ca77bbbee69771a794ad6c966b5a0");
        } else {
            a(wmAddress, LocationSPKeysV2.REAL_ADDRESS);
        }
    }

    public static WmAddress e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "277592d4a90c642bf49c6c2ed9a69b54", RobustBitConfig.DEFAULT_VALUE) ? (WmAddress) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "277592d4a90c642bf49c6c2ed9a69b54") : c(LocationSPKeysV2.REAL_ADDRESS);
    }

    public static void b(WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a7a09954df62f8be34b2bc66f8ba76e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a7a09954df62f8be34b2bc66f8ba76e");
        } else {
            a(wmAddress, LocationSPKeysV2.POI_ADDRESS);
        }
    }

    public static WmAddress f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9df639c7bca28e1c200f39a0cebd4fa5", RobustBitConfig.DEFAULT_VALUE) ? (WmAddress) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9df639c7bca28e1c200f39a0cebd4fa5") : c(LocationSPKeysV2.POI_ADDRESS);
    }

    private static void a(WMLocation wMLocation, LocationSPKeysV2 locationSPKeysV2) {
        Object[] objArr = {wMLocation, locationSPKeysV2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db9473acfbebcaa1bc753f0effd7fa6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db9473acfbebcaa1bc753f0effd7fa6d");
        } else if (wMLocation != null) {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) locationSPKeysV2, wMLocation.toString());
        } else if (locationSPKeysV2 == LocationSPKeysV2.POI_LOCATION) {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) locationSPKeysV2, "");
        }
    }

    private static WMLocation d(LocationSPKeysV2 locationSPKeysV2) {
        Object[] objArr = {locationSPKeysV2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3f0f9c915ceb1c54175aea17fb80512", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3f0f9c915ceb1c54175aea17fb80512");
        }
        String b2 = b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) locationSPKeysV2, "");
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        return WMLocation.parse(b2);
    }

    public static void a(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a81008e766bd4b08285a347bf7d91904", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a81008e766bd4b08285a347bf7d91904");
        } else if (wMLocation != null) {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.NEW_STRATEGY_ADDRESS_CACHE, wMLocation.toString());
        }
    }

    public static WMLocation g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be0cc47c2b47ad9c0bf524375b400de8", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be0cc47c2b47ad9c0bf524375b400de8");
        }
        String b2 = b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.NEW_STRATEGY_ADDRESS_CACHE, "");
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        return WMLocation.parse(b2);
    }

    public static void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cee52536e50b6db04ce1d4d0630c514e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cee52536e50b6db04ce1d4d0630c514e");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.NEW_STRATEGY_ADDRESS_CACHE_DURATION, j);
        }
    }

    public static long h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "390c4feca51f1d94186d5e06fe06821c", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "390c4feca51f1d94186d5e06fe06821c")).longValue() : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.NEW_STRATEGY_ADDRESS_CACHE_DURATION, 0L);
    }

    public static void b(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3474ee0f4e1453062fa0692cf41bff88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3474ee0f4e1453062fa0692cf41bff88");
            return;
        }
        if (wMLocation != null && !wMLocation.hasLocatedPermission) {
            wMLocation = new WMLocation("location has no permission");
            LocationResultCode locationResultCode = new LocationResultCode();
            wMLocation.setLocationSdk(LocateSDK.MT);
            wMLocation.hasLocatedPermission = false;
            locationResultCode.a = 1200;
            wMLocation.setLocationResultCode(locationResultCode);
            wMLocation.setLongitude(0.0d);
            wMLocation.setLongitude(0.0d);
        }
        a(wMLocation, LocationSPKeysV2.REAL_LOCATION);
        if (wMLocation != null) {
            com.sankuai.waimai.foundation.location.g.a(wMLocation.getLatitude(), wMLocation.getLongitude());
        }
    }

    public static WMLocation i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29f543608bf142201012af00b3ac837d", RobustBitConfig.DEFAULT_VALUE) ? (WMLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29f543608bf142201012af00b3ac837d") : d(LocationSPKeysV2.REAL_LOCATION);
    }

    public static void c(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5a865e8ca79f59bac945cae0eca6438", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5a865e8ca79f59bac945cae0eca6438");
            return;
        }
        a(wMLocation, LocationSPKeysV2.POI_LOCATION);
        Object[] objArr2 = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1802c4c019bffb32a82d9a9e525d1905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1802c4c019bffb32a82d9a9e525d1905");
        } else if (wMLocation != null) {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.CUSTOM_POI_LOCATION, wMLocation.toString());
        }
        if (wMLocation != null) {
            com.sankuai.waimai.foundation.location.e.c().a(wMLocation.getLatitude(), wMLocation.getLongitude());
        }
    }

    @Nullable
    public static WMLocation j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a6a5f6d9444bfa280de5f5e480b3193", RobustBitConfig.DEFAULT_VALUE) ? (WMLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a6a5f6d9444bfa280de5f5e480b3193") : d(LocationSPKeysV2.POI_LOCATION);
    }

    @Nullable
    public static WMLocation k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "385c5fb329483a0b46ec873deaa73f22", RobustBitConfig.DEFAULT_VALUE) ? (WMLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "385c5fb329483a0b46ec873deaa73f22") : d(LocationSPKeysV2.CUSTOM_POI_LOCATION);
    }

    public static void a(WmHistoryAddressList wmHistoryAddressList) {
        Object[] objArr = {wmHistoryAddressList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ac366a7046c6abb1e844d5c48dc77a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ac366a7046c6abb1e844d5c48dc77a6");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.ADDRESS_LIST, d.a().toJson(wmHistoryAddressList));
        }
    }

    public static WmHistoryAddressList l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c899970c402bb8b06850e8329e41ff49", RobustBitConfig.DEFAULT_VALUE)) {
            return (WmHistoryAddressList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c899970c402bb8b06850e8329e41ff49");
        }
        String b2 = b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.ADDRESS_LIST, "");
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        try {
            return (WmHistoryAddressList) d.a().fromJson(b2, (Class<Object>) WmHistoryAddressList.class);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    public static int m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f595f80aca3fc3b2d5ad334b699d5349", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f595f80aca3fc3b2d5ad334b699d5349")).intValue() : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.ADDR_CONFIG_DISTANCE, 0);
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1f0228ecd72694ae1a64363a4cbb0db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1f0228ecd72694ae1a64363a4cbb0db");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.ADDR_CONFIG_DISTANCE, i);
        }
    }

    public static boolean a(WMLocation wMLocation, WMLocation wMLocation2) {
        double round;
        Object[] objArr = {wMLocation, wMLocation2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0c7b7ffb85695e538a57c6614d4830f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0c7b7ffb85695e538a57c6614d4830f")).booleanValue();
        }
        if (wMLocation == null || wMLocation2 == null) {
            return false;
        }
        double latitude = wMLocation.getLatitude();
        double longitude = wMLocation.getLongitude();
        double latitude2 = wMLocation2.getLatitude();
        double longitude2 = wMLocation2.getLongitude();
        Object[] objArr2 = {Double.valueOf(latitude), Double.valueOf(longitude), Double.valueOf(latitude2), Double.valueOf(longitude2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "38d1d6c609bd7a4b343948267e11bbcc", RobustBitConfig.DEFAULT_VALUE)) {
            round = ((Double) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "38d1d6c609bd7a4b343948267e11bbcc")).doubleValue();
        } else {
            double a2 = a(latitude);
            double a3 = a(latitude2);
            round = Math.round(((Math.asin(Math.sqrt(Math.pow(Math.sin((a2 - a3) / 2.0d), 2.0d) + ((Math.cos(a2) * Math.cos(a3)) * Math.pow(Math.sin((a(longitude) - a(longitude2)) / 2.0d), 2.0d)))) * 2.0d) * 6378.137d) * 10000.0d) / 10;
        }
        return round > 400.0d;
    }

    @Deprecated
    public static String a(LocationSPKeysV2 locationSPKeysV2) {
        Object[] objArr = {locationSPKeysV2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "180cac95d01a96c16d531405db008e54", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "180cac95d01a96c16d531405db008e54") : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) locationSPKeysV2, "");
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4dbd4c283f046a3199e7255bd2b92fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4dbd4c283f046a3199e7255bd2b92fb");
        } else if (str != null) {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.GB_CITY_INFO, str);
        }
    }

    public static String n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc5456f1b0e10f491eacb3c30fd33d05", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc5456f1b0e10f491eacb3c30fd33d05") : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.GB_CITY_INFO, "");
    }

    public static List<AdminInfo> o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "634c18694718ca45a356ddcf719047ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "634c18694718ca45a356ddcf719047ac");
        }
        String b2 = b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.GB_CITY_INFO, "");
        if (!TextUtils.isEmpty(b2)) {
            try {
                return (List) d.a().fromJson(b2, new TypeToken<List<AdminInfo>>() { // from class: com.sankuai.waimai.foundation.location.v2.h.1
                }.getType());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "606e2bd1884497bbfc1282a0ad04c261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "606e2bd1884497bbfc1282a0ad04c261");
        } else if (str != null) {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.REAL_GB_CITY_INFO, str);
        }
    }

    public static String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72c6ab076f4633ac43503112816f28c3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72c6ab076f4633ac43503112816f28c3") : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.REAL_GB_CITY_INFO, "");
    }

    public static List<AdminInfo> q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7de4d705f2288774f9f391f806870410", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7de4d705f2288774f9f391f806870410");
        }
        String b2 = b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.REAL_GB_CITY_INFO, "");
        if (!TextUtils.isEmpty(b2)) {
            try {
                return (List) d.a().fromJson(b2, new TypeToken<List<AdminInfo>>() { // from class: com.sankuai.waimai.foundation.location.v2.h.2
                }.getType());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62957db114685b6e084c845e5ea836e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62957db114685b6e084c845e5ea836e4");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.REAL_BACKEND_MT_CITY, str);
        }
    }

    public static String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "410a70c5ff99f6032c554345060191c3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "410a70c5ff99f6032c554345060191c3") : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.REAL_BACKEND_MT_CITY, "");
    }

    public static List<MtBackCityInfo> s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "114fcaee08e0ccc6bbede9a489c1510b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "114fcaee08e0ccc6bbede9a489c1510b");
        }
        String b2 = b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.REAL_BACKEND_MT_CITY, "");
        if (!TextUtils.isEmpty(b2)) {
            try {
                return (List) d.a().fromJson(b2, new TypeToken<List<MtBackCityInfo>>() { // from class: com.sankuai.waimai.foundation.location.v2.h.3
                }.getType());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63877f5f5a72c444bf6bcb5ecc12e8f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63877f5f5a72c444bf6bcb5ecc12e8f7");
        } else {
            b.a((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.POI_BACKEND_MT_CITY, str);
        }
    }

    public static String t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f969f989581ec5c8bdbf5192e33a110", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f969f989581ec5c8bdbf5192e33a110") : b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.POI_BACKEND_MT_CITY, "");
    }

    public static List<MtBackCityInfo> u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25a4f6b53f6890aaf617b22d4405480a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25a4f6b53f6890aaf617b22d4405480a");
        }
        String b2 = b.b((com.sankuai.waimai.foundation.utils.e<LocationSPKeysV2>) LocationSPKeysV2.POI_BACKEND_MT_CITY, "");
        if (!TextUtils.isEmpty(b2)) {
            try {
                return (List) d.a().fromJson(b2, new TypeToken<List<MtBackCityInfo>>() { // from class: com.sankuai.waimai.foundation.location.v2.h.4
                }.getType());
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
