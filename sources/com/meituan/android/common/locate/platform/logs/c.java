package com.meituan.android.common.locate.platform.logs;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.provider.GpsInfo;
import com.meituan.android.common.locate.provider.s;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class c {
    private static final boolean a = com.meituan.android.common.locate.reporter.l.a().b;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(MtLocation mtLocation, String str, String str2) {
        Object[] objArr = {mtLocation, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "84e5583ba1e97f713f1cba62750baf08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "84e5583ba1e97f713f1cba62750baf08");
        } else {
            a(mtLocation, str, str2, 3);
        }
    }

    public static void a(MtLocation mtLocation, String str, String str2, int i) {
        Object[] objArr = {mtLocation, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bf2e3377444ce55dea8fc2784b9246b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bf2e3377444ce55dea8fc2784b9246b4");
            return;
        }
        Context a2 = com.meituan.android.common.locate.provider.g.a();
        if (a2 != null) {
            try {
                if (!com.meituan.android.common.locate.reporter.e.a(a2).c()) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        if (a(i, com.meituan.android.common.locate.reporter.f.b().getInt("logan_level", 3))) {
            return;
        }
        if (mtLocation == null) {
            a("null of point type=" + str + " strategy=" + str2, i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("locatesdk location:");
        if (str != null) {
            sb.append(" type:");
            sb.append(str);
        }
        if (!a) {
            sb.append(" latitude:");
            sb.append(mtLocation.getLatitude());
            sb.append(" longitude:");
            sb.append(mtLocation.getLongitude());
        }
        sb.append(" gettime:");
        sb.append(mtLocation.getTime());
        sb.append("cache time=s" + ((System.currentTimeMillis() - mtLocation.getTime()) / 1000));
        if (str2 != null) {
            sb.append(" strategy:");
            sb.append(str2);
        }
        sb.append(" provider:");
        sb.append(mtLocation.getProvider());
        sb.append(" acc=" + mtLocation.getAccuracy());
        sb.append(" speed=" + mtLocation.getSpeed());
        if ("mars".equals(mtLocation.getProvider())) {
            sb.append(" bearing=");
            sb.append(mtLocation.getBearing());
        }
        try {
            Bundle extras = mtLocation.getExtras();
            if (extras != null) {
                sb.append(" mMasterCache=");
                sb.append(extras.getInt("extra_from_master_cache"));
                sb.append(" wifiage=");
                sb.append(extras.getLong("extra_wifi_age"));
                sb.append(" checkwifitimes=");
                sb.append(extras.getInt("extra_check_wifi_times"));
                sb.append(" originFrom=");
                sb.append(extras.getString("from"));
                sb.append(" city=");
                sb.append(extras.getString("city"));
                sb.append(" mtCityId=");
                sb.append(extras.getLong(GearsLocator.MT_CITY_ID, -1L));
                sb.append(" dpCityId=");
                sb.append(extras.getLong(GearsLocator.DP_CITY_ID, -1L));
                sb.append(" dpCityName=");
                sb.append(extras.getString(GearsLocator.DP_NAME, ""));
                sb.append(" originrealTime=" + extras.getLong(GearsLocator.TIME_GOT_LOCATION));
                sb.append(" towncode=");
                sb.append(extras.getString(GearsLocator.TOWN_CODE));
                sb.append(" township=");
                sb.append(extras.getString(GearsLocator.TOWN_SHIP));
                GpsInfo gpsInfo = (GpsInfo) extras.getSerializable("gpsInfo");
                if (gpsInfo != null) {
                    if (!a) {
                        sb.append(" originlat=");
                        sb.append(gpsInfo.lat);
                        sb.append(" originlon=");
                        sb.append(gpsInfo.lng);
                    }
                    sb.append(" origintime=");
                    sb.append(gpsInfo.gpsTime);
                }
                sb.append(" cellage=" + extras.getLong("cellage"));
                sb.append(" gpsQulaity:" + extras.getInt("gpsQuality", 0));
                if (extras.getDouble(GearsLocator.INDOOR_SCORE, -1.0d) > -1.0d) {
                    sb.append(" indoorscore:" + extras.getDouble(GearsLocator.INDOOR_SCORE));
                    sb.append(" indoortype:" + extras.getInt(GearsLocator.INDOOR_TYPE));
                }
                String string = extras.getString("pos_drift");
                if (!TextUtils.isEmpty(string)) {
                    sb.append(" posDrift=" + string);
                }
            }
        } catch (Exception e) {
            LogUtils.a(e.getMessage());
        }
        if (a2 != null) {
            sb.append(StringUtil.SPACE);
            sb.append(s.a(a2).b());
        }
        sb.append(" local timestamp(ms): ");
        sb.append(System.currentTimeMillis());
        b(sb.toString());
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3d3c281d6229ecf83edf6d6c923312c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3d3c281d6229ecf83edf6d6c923312c");
        } else {
            a(str, 3);
        }
    }

    public static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6d1766296b776c9d8cd7cbc901fb3209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6d1766296b776c9d8cd7cbc901fb3209");
            return;
        }
        Context a2 = com.meituan.android.common.locate.provider.g.a();
        if (a2 == null || com.meituan.android.common.locate.reporter.e.a(a2).c()) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (a(i, com.meituan.android.common.locate.reporter.f.b().getInt("logan_level", 3))) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("LocateSDK:\t");
                sb.append(str);
                sb.append("\t");
                if (a2 != null) {
                    sb.append(s.a(a2).b());
                }
                sb.append("local timestamp(ms): ");
                sb.append(System.currentTimeMillis());
                sb.append("\t");
                com.dianping.networklog.c.a(sb.toString(), 3);
                LogUtils.a(sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(int i, int i2) {
        return i > i2;
    }

    private static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1f32d547d69921ecd5c869780fb941ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1f32d547d69921ecd5c869780fb941ce");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            com.dianping.networklog.c.a(str, 3);
            LogUtils.a(str);
        }
    }

    @Deprecated
    public static void b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab7873b6cfcfee7b77892e600ada7390", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab7873b6cfcfee7b77892e600ada7390");
            return;
        }
        Context a2 = com.meituan.android.common.locate.provider.g.a();
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (a(i, com.meituan.android.common.locate.reporter.f.b().getInt("logan_level", 3))) {
                return;
            }
            String str2 = "LocateSDK:" + str + StringUtil.SPACE;
            if (a2 != null) {
                str2 = str2 + s.a(a2).b();
            }
            com.dianping.networklog.c.a(str2, 3);
            LogUtils.a(str2);
        } catch (Exception unused) {
        }
    }
}
