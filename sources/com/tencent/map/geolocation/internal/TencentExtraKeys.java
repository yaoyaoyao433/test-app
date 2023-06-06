package com.tencent.map.geolocation.internal;

import android.content.Context;
import android.location.Location;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationRequest;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TencentExtraKeys {
    public static final boolean ALLOW_NLP_LOCATION = true;
    public static final String LOCATION_KEY_ADMIN_LEVEL1 = "admin_level_1";
    public static final String LOCATION_KEY_ADMIN_LEVEL2 = "admin_level_2";
    public static final String LOCATION_KEY_ADMIN_LEVEL3 = "admin_level_3";
    public static final String LOCATION_KEY_LOCALITY = "locality";
    public static final String LOCATION_KEY_NATION = "nation";
    public static final String LOCATION_KEY_ROUTE = "route";
    public static final String LOCATION_KEY_SUBLOCALITY = "sublocality";
    public static final String LOCATION_SOURCE_CELL = "cell";
    public static final String LOCATION_SOURCE_GPS = "gps";
    public static final String LOCATION_SOURCE_WIFI = "wifi";
    public static boolean MOCK_LOCATION_FILTER = true;
    public static final String RAW_DATA = "raw_data";
    public static final String REQUEST_RAW_DATA = "request_raw_data";
    public static final boolean STRICT_CELL_FILTER = true;
    private static final String TAG = "TencentExtraKeys";
    public static final boolean TENCENT_INTERNAL = false;
    private static Context mContext;

    public static String getLocationSource(TencentLocation tencentLocation) {
        return "";
    }

    public static byte[] getRawData(TencentLocation tencentLocation) throws Exception {
        return null;
    }

    public static Location getRawGps(TencentLocation tencentLocation) throws Exception {
        return null;
    }

    public static String getRawQuery(TencentLocation tencentLocation) throws Exception {
        return null;
    }

    public static boolean isAllowedLevel(int i) throws Exception {
        switch (i) {
            case 0:
            case 1:
            case 3:
            case 4:
                return true;
            case 2:
            default:
                return false;
        }
    }

    public static boolean isRequestRawData(TencentLocationRequest tencentLocationRequest) throws Exception {
        return false;
    }

    public static boolean isTencentExtraKeysTENCENT_INTERNAL() throws Exception {
        return false;
    }

    public static TencentLocation setRawData(TencentLocation tencentLocation, byte[] bArr) throws Exception {
        return tencentLocation;
    }

    public static void setRawGps(TencentLocation tencentLocation, Location location) throws Exception {
    }

    public static void setRawQuery(TencentLocation tencentLocation, String str) throws Exception {
    }

    public static TencentLocationRequest setRequestRawData(TencentLocationRequest tencentLocationRequest, boolean z) throws Exception {
        return tencentLocationRequest;
    }

    public static void setContext(Context context) {
        mContext = context;
    }

    public static void enableMockLocationFilter(boolean z) throws Exception {
        MOCK_LOCATION_FILTER = z;
    }

    public static void loadLibrary(String str) throws Exception {
        System.load(str);
    }
}
