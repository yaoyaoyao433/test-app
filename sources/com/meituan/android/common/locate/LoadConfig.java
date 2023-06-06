package com.meituan.android.common.locate;
/* loaded from: classes2.dex */
public interface LoadConfig {
    public static final String ASSIST_LOC_MODE = "asssit_loc_mode";
    public static final String ASSIST_LOC_TYPE = "assist_loc_type";
    public static final String BUSINESS_ID = "business_id";
    public static final String CACHE_VALIDITY_TIME = "cacheValidTime";
    public static final String DELIVER_INTERVAL = "deliverInterval";
    public static final String FORCE_SINGLE_CALLBACK = "force_single_callback";
    public static final String GPS_FIX_FIRST_WAIT = "gpsFixFirstWait";
    public static final String GPS_MIN_DATA_TAKE_EFFECT = "gpsMinDataTakeEffect";
    public static final String GPS_MIN_DISTANCE = "gpsMinDistance";
    public static final String GPS_MIN_TIME = "gpsMinTime";
    public static final String IS_ALLOW_BACKGROUND_LOCATION = "is_allow_background_location";
    @Deprecated
    public static final String IS_GEARS_RESULT_NEED_BEARING_FORCE = "isGearsResultNeedBearingForce";
    public static final String IS_GEARS_RESULT_NEED_BEARING_WHEN_GPS_LOSING = "IsGearsResultNeedBearingWhenGpsLost";
    public static final String IS_IOT_MODEL = "isIOTModel";
    public static final String IS_NEED_GPS = "isNeedGps";
    public static final String IS_PREVENT_SHAKING_FORCE = "isPreventShakingForce";
    public static final String IS_TURN_ON_TENCENT_INDOOR_LOCATION = "is_turn_on_tencent_indoor_location";
    public static final String IS_TURN_ON_TENCENT_LOCATION = "is_turn_on_tencent_location";
    public static final String LOCATION_MODE = "location_mode";
    public static final String LOCATION_TIMEOUT = "locationTimeout";

    String get(String str);

    void set(String str, String str2);
}
