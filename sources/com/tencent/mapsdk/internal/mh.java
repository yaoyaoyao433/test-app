package com.tencent.mapsdk.internal;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class mh extends me {
    private static volatile mh b = null;
    private static final String c = "com.tencent.tencentmap.mapsdk.maps.offlinemap";

    public static mh a(Context context) {
        if (b == null) {
            synchronized (mh.class) {
                if (b == null) {
                    b = new mh(context);
                }
            }
        }
        return b;
    }

    private mh(Context context) {
        if (context == null) {
            return;
        }
        this.a = context.getSharedPreferences(c, 0);
        if (b != null) {
            a(new String[]{"taiwanClearCacheVersion", "taiwanStyle", "taiwanVersion", "mapPoiIcon", "worldTileCount", "rttConfigVersion", "rttConfigMd5", "closeRoadSytleNomalModeVersion", "closeRoadSytleNomalModeMd5", "closeRoadStyleTrafficModeVersion", "closeRoadStyleTrafficModeMd5", "offlineCityListVersion", "offlineCityListMd5"});
            String a = a("sdkVersion");
            if (a == null || gy.b("4.1.0", a) <= 0) {
                return;
            }
            a();
        }
    }

    private void b() {
        if (b == null) {
            return;
        }
        a(new String[]{"taiwanClearCacheVersion", "taiwanStyle", "taiwanVersion", "mapPoiIcon", "worldTileCount", "rttConfigVersion", "rttConfigMd5", "closeRoadSytleNomalModeVersion", "closeRoadSytleNomalModeMd5", "closeRoadStyleTrafficModeVersion", "closeRoadStyleTrafficModeMd5", "offlineCityListVersion", "offlineCityListMd5"});
        String a = a("sdkVersion");
        if (a != null && gy.b("4.1.0", a) > 0) {
            a();
        }
    }
}
