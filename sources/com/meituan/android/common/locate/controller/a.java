package com.meituan.android.common.locate.controller;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.model.Geohash;
import com.meituan.android.common.locate.model.MTAddress;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class a {
    private static HashMap<String, com.meituan.android.common.locate.model.a> a = new HashMap<>();
    public static ChangeQuickRedirect changeQuickRedirect;

    public static synchronized com.meituan.android.common.locate.model.a a(MtLocation mtLocation) {
        Geohash[] adjacent;
        com.meituan.android.common.locate.model.a a2;
        synchronized (a.class) {
            Object[] objArr = {mtLocation};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d9e94fa453d41ef341d5c6f5b9c7dda7", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.meituan.android.common.locate.model.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d9e94fa453d41ef341d5c6f5b9c7dda7");
            }
            if (LocationUtils.a(mtLocation)) {
                com.meituan.android.common.locate.model.a a3 = a(Geohash.from(mtLocation.getLatitude(), mtLocation.getLongitude(), 7).toBase32String());
                if (a3 != null) {
                    return a3;
                }
                String base32String = Geohash.from(mtLocation.getLatitude(), mtLocation.getLongitude(), 6).toBase32String();
                LogUtils.a("SystemLocator geoHashStr6: " + base32String + " lat:" + mtLocation.getLatitude() + "lng:" + mtLocation.getLongitude());
                com.meituan.android.common.locate.model.a a4 = a(base32String);
                if (a4 != null) {
                    return a4;
                }
                for (Geohash geohash : Geohash.from(base32String).getAdjacent()) {
                    if (geohash != null && (a2 = a(geohash.toBase32String())) != null) {
                        LogUtils.a(LocationUtils.class + "hit boundary geohash cache");
                        return a2;
                    }
                }
                return null;
            }
            return null;
        }
    }

    private static com.meituan.android.common.locate.model.a a(String str) {
        Object obj;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a049a124abb2d30b89a4b07f2e97fdbf", RobustBitConfig.DEFAULT_VALUE)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a049a124abb2d30b89a4b07f2e97fdbf");
        } else if (!a.containsKey(str)) {
            return null;
        } else {
            obj = a.get(str);
        }
        return (com.meituan.android.common.locate.model.a) obj;
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c55a39cfa4a21e112db7aa256103e37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c55a39cfa4a21e112db7aa256103e37");
                return;
            }
            c a2 = c.a(context);
            a2.a();
            a2.a(context, a);
            LogUtils.a("loadGeoHash size: " + a.size());
        }
    }

    public static synchronized void a(Context context, MtLocation mtLocation) {
        synchronized (a.class) {
            Object[] objArr = {context, mtLocation};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "844574bd410e551b87cb885e03e4343e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "844574bd410e551b87cb885e03e4343e");
                return;
            }
            String base32String = Geohash.from(mtLocation.getLatitude(), mtLocation.getLongitude(), 7).toBase32String();
            Bundle extras = mtLocation.getExtras();
            if (extras != null && extras.getString(GearsLocator.ADDRESS) != null) {
                com.meituan.android.common.locate.model.a aVar = new com.meituan.android.common.locate.model.a(extras.getString(GearsLocator.COUNTRY), extras.getString("province"), extras.getString("city"), extras.getString(GearsLocator.DISTRICT));
                MTAddress mTAddress = (MTAddress) extras.getParcelable("mtaddress");
                if (mTAddress != null) {
                    aVar.h(mTAddress.getTownCode());
                    aVar.i(mTAddress.getTownShip());
                }
                aVar.f(extras.getString(GearsLocator.DETAIL));
                aVar.g(extras.getString(GearsLocator.AD_CODE));
                aVar.a(extras.getLong(GearsLocator.MT_CITY_ID));
                aVar.b(extras.getLong(GearsLocator.DP_CITY_ID));
                aVar.j(extras.getString(GearsLocator.DP_NAME, ""));
                aVar.k(extras.getString("openCityStr", ""));
                a(base32String, aVar);
                a(context, base32String, aVar);
            }
        }
    }

    private static void a(Context context, String str, com.meituan.android.common.locate.model.a aVar) {
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7c8c6f25d65c11d64d7cfb5a13dddf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7c8c6f25d65c11d64d7cfb5a13dddf3");
        } else if (context == null || aVar == null || TextUtils.isEmpty(str)) {
        } else {
            c.a(context).a(str, aVar);
        }
    }

    public static void a(String str, com.meituan.android.common.locate.model.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2407fa755056de69a0c49df641873d4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2407fa755056de69a0c49df641873d4c");
        } else if (TextUtils.isEmpty(str) || str.length() != 7 || aVar == null) {
        } else {
            LogUtils.a("addGeoHashs2Mem " + str + StringUtil.SPACE + aVar.toString());
            String substring = str.substring(0, str.length() - 1);
            StringBuilder sb = new StringBuilder("GearsLocator add geoHashStr6: ");
            sb.append(substring);
            LogUtils.a(sb.toString());
            b(str, aVar);
            b(substring, aVar);
        }
    }

    private static void b(String str, com.meituan.android.common.locate.model.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "11da17a817c963da5b85948c5bd18bdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "11da17a817c963da5b85948c5bd18bdb");
        } else if (aVar == null || TextUtils.isEmpty(str)) {
        } else {
            try {
                if (a.get(str) != null) {
                    return;
                }
                a.put(str, aVar);
                LogUtils.a("addGeoHashInMemCache : " + a.size() + " geoHashStr:" + aVar.toString());
            } catch (Exception e) {
                LogUtils.a("addGeoHashInMemCache exception: " + e.getMessage());
            }
        }
    }
}
