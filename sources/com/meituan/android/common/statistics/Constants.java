package com.meituan.android.common.statistics;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Constants {
    public static final int CACHE_COUNT_TO_REPORT = 30;
    public static final String CACHE_DB_NAME = "mt-statistics-db-cache";
    public static final String CACHE_DB_TABLE_EVENT_NAME = "event";
    public static final String CHANNEL = "channel";
    public static final String CHANNEL_NAME = "META-INF/mtchannel";
    public static final int CONFIG_REFRESH_TIME = 3600000;
    public static final String CONFIG_URL = "http://api.mobile.meituan.com/";
    public static final int DEFAULT_TRY_COUNT_IF_FAIL = 3;
    public static final String GESTURE_DB_NAME = "mt-statistics-db-gesture";
    public static final String HIGH_REPORT_CONFIG_URL = "https://ocean.sankuai.com/delivery/api/configFile?";
    public static final String HIGH_REPORT_URL = "https://hlx.meituan.com";
    public static final int MAX_REPORT_COUNT = 50;
    public static final String PAGE_NAME = "pageName";
    public static final String PREFIX = "data_sdk_";
    public static final String PRIVACY_TOKEN = "com.meituan.android.common.analyse";
    public static final String REPORT_URL = "://lx0.meituan.com";
    public static final String SDK_INTERNAL_CHANNEL_NAME = "sdk_report";
    public static final String SDK_LOG_TAG = "statistics";
    public static final long SESSION_VALIDITY = 1800000;
    public static final String SHARE_UUID = "share_uuid";
    private static String TEST_REPORT_URL = "";
    public static final String UNDEFINED = "undefined";
    public static final int VAL_LAB_LENGTH = 10000;
    public static final String WHERE_FAILED = "autokey > ?";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class Business {
        @Deprecated
        public static final String CONTENT_INDEX = "c_index";
        public static final String KEY_AB_TEST = "abtest";
        public static final String KEY_ACTIVITY_ID = "activity_id";
        public static final String KEY_AD_ID = "ad_id";
        public static final String KEY_BOOK_ID = "book_id";
        public static final String KEY_BOOK_STATUS = "book_status";
        public static final String KEY_BUSINESS_ID = "biz_id";
        public static final String KEY_BU_ID = "bu_id";
        public static final String KEY_CAT_ID = "cat_id";
        public static final String KEY_CHECKIN_ID = "checkin_id";
        public static final String KEY_CINEMA_ID = "cinema_id";
        public static final String KEY_COUPON_ID = "coupon_id";
        public static final String KEY_CT_POI = "ct_poi";
        public static final String KEY_CUSTOM = "custom";
        public static final String KEY_DEAL_GROUP_ID = "dealgroup_id";
        public static final String KEY_DEAL_ID = "deal_id";
        public static final String KEY_EXPERT_ID = "expert_id";
        public static final String KEY_GOODS_ID = "goods_id";
        public static final String KEY_KEYWORD = "keyword";
        @Deprecated
        public static final String KEY_LOG_ID = "log_id";
        public static final String KEY_MATION_ID = "maiton_id";
        public static final String KEY_MEMBER_CARD_ID = "member_card_id";
        public static final String KEY_MOVIE_ID = "movie_id";
        public static final String KEY_ORDER_ID = "order_id";
        public static final String KEY_POI_ID = "poi_id";
        public static final String KEY_PREPAY_INFO = "prepay_info";
        @Deprecated
        public static final String KEY_PROMOT_ID = "promo_id";
        public static final String KEY_QUERY_ID = "query_id";
        @Deprecated
        public static final String KEY_RECEIPT_ID = "receipt_id";
        public static final String KEY_REGION_ID = "region_id";
        @Deprecated
        public static final String KEY_REVIEW_ID = "review_id";
        @Deprecated
        public static final String KEY_SEARCH_ID = "search_id";
        public static final String KEY_SECTION_INDEX = "section_index";
        public static final String KEY_SELECT_ID = "select_id";
        public static final String KEY_SERVICE_ID = "service_id";
        public static final String KEY_SKU_ID = "sku_id";
        public static final String KEY_SORT_ID = "sort_id";
        public static final String KEY_STID = "stid";
        public static final String KEY_TARGET_USER_ID = "target_user_id";
        public static final String KEY_TITLE = "title";
        public static final String KEY_TOPIC_ID = "topic_id";
        public static final String KEY_TRACE_ID = "trace_id";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class Environment {
        public static final String KEY_ADVERTISING_ID = "adid";
        public static final String KEY_ANDROID_ID = "android_id";
        public static final String KEY_APN = "apn";
        public static final String KEY_APP = "app";
        public static final String KEY_APPNM = "appnm";
        public static final String KEY_APP_ARCH = "app_arch";
        public static final String KEY_APP_SESSION = "app_session";
        @Deprecated
        public static final String KEY_BIZLOGINID = "bizloginid";
        public static final String KEY_BRAND = "brand";
        public static final String KEY_BSSID = "bssid";
        public static final String KEY_BUILD_VERSION = "buildid";
        public static final String KEY_CANARY_RELEASE = "canary_release";
        public static final String KEY_CATEGORY = "category";
        public static final String KEY_CH = "ch";
        public static final String KEY_CITYID = "cityid";
        public static final String KEY_CONFIG_VERSION = "cnfver";
        public static final String KEY_CT = "ct";
        public static final String KEY_DID = "did";
        public static final String KEY_DM = "dm";
        public static final String KEY_DPID = "dpid";
        public static final String KEY_ICCID = "iccid";
        @Deprecated
        public static final String KEY_IDFA = "idfa";
        @Deprecated
        public static final String KEY_IDFV = "idfv";
        public static final String KEY_IMEI = "imei";
        public static final String KEY_IMEI2 = "imei2";
        public static final String KEY_IMSI = "imsi";
        public static final String KEY_LAT = "lat";
        public static final String KEY_LCH = "lch";
        public static final String KEY_LNG = "lng";
        public static final String KEY_LOCAL_SOURCE = "local_source";
        public static final String KEY_LOCATE_CITY_ID = "locate_city_id";
        public static final String KEY_LOCATE_TM = "locate_tm";
        public static final String KEY_LOGINTYPE = "logintype";
        public static final String KEY_LX_DICT = "lx_dict";
        public static final String KEY_MAC = "mac";
        public static final String KEY_MEID = "meid";
        public static final String KEY_MNO = "mno";
        public static final String KEY_MSID = "msid";
        public static final String KEY_NET = "net";
        public static final String KEY_OAID = "oaid";
        public static final String KEY_OAUID = "oauid";
        @Deprecated
        public static final String KEY_OLDDID = "olddid";
        public static final String KEY_OS = "os";
        public static final String KEY_OSN = "osn";
        public static final String KEY_OTHER_APP_USER_ID = "oauid";
        public static final String KEY_PHYSICAL_MEMORY = "physical_memory";
        public static final String KEY_PN = "pn";
        public static final String KEY_PROCESSOR_COUNT = "processor_count";
        public static final String KEY_PS = "ps";
        public static final String KEY_PUSHID = "pushid";
        public static final String KEY_PUSH_EXT = "push_ext";
        public static final String KEY_SC = "sc";
        public static final String KEY_SDK_VER = "sdk_ver";
        public static final String KEY_SERIAL_NUMBER = "sn";
        public static final String KEY_SLXCUID = "slxcuid";
        @Deprecated
        public static final String KEY_SPS = "sps";
        @Deprecated
        public static final String KEY_SUBCID = "subcid";
        public static final String KEY_SUNION_ID = "sunion_id";
        public static final String KEY_TC = "tc";
        public static final String KEY_TN = "tn";
        public static final String KEY_UA = "ua";
        @Deprecated
        public static final String KEY_UDID = "udid";
        public static final String KEY_UID = "uid";
        public static final String KEY_UNION_ID = "union_id";
        public static final String KEY_UTM = "utm";
        public static final String KEY_UTM_CAMPAIGN = "utm_campaign";
        public static final String KEY_UTM_CONTENT = "utm_content";
        public static final String KEY_UTM_MEDIUM = "utm_medium";
        public static final String KEY_UTM_SOURCE = "utm_source";
        public static final String KEY_UTM_TERM = "utm_term";
        public static final String KEY_UUID = "uuid";
        public static final String KEY_VAL_BID = "val_bid";
        public static final String KEY_VAL_CID = "val_cid";
        @Deprecated
        public static final String KEY_VENDERID = "vendorid";
        public static final String KEY_VERSION_CODE = "version_code";
        public static final String KEY_WIFI = "wifi";
        @Deprecated
        public static final String LCH_PUSH = "push";
        public static final String MK_TRACK_ID = "mk_trackid";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class EventInfoConsts {
        public static final String KEY_BID_BLACK_LIST = "bid_blacklist";
        public static final String KEY_CACHE_CONTROL = "isLocal";
        public static final String KEY_CID_QUALITY = "cid_quality";
        public static final String KEY_CUSTOM = "custom";
        public static final String KEY_DURATION = "duration";
        public static final String KEY_DURATION_GAP_LIST = "mduration_gaplist";
        public static final String KEY_DURATION_LIST = "mduration_list";
        public static final String KEY_ELEMENT_ID = "element_id";
        public static final String KEY_EVENT_EXTRA_DATA = "lx_val_lab";
        public static final String KEY_EVENT_NAME = "nm";
        public static final String KEY_EVENT_SERVER_TIME_STAMP = "stm";
        public static final String KEY_EVENT_TIME_STAMP = "tm";
        public static final String KEY_EVENT_TYPE = "event_type";
        public static final String KEY_INDEX = "index";
        public static final String KEY_IS_AUTO = "isauto";
        public static final String KEY_LATITUDE = "lat";
        public static final String KEY_LOCATE_TM = "locate_tm";
        public static final String KEY_LONGITUDE = "lng";
        public static final String KEY_LX_INNER_DATA = "lx_inner_data";
        public static final String KEY_LX_INNER_DATAS_LIST = "list";
        public static final String KEY_LX_LAUNCH = "lx_launch";
        public static final String KEY_MDURATION_CNT = "mduration_cnt";
        public static final String KEY_MDURATION_TOTAL = "mduration_total";
        public static final String KEY_MMP_CATEGORY = "category";
        public static final String KEY_MREQ_ID = "mreq_id";
        public static final String KEY_MV_BEGIN_TIME = "mv_begin_time";
        public static final String KEY_MV_LIST = "mv_list";
        public static final String KEY_NATIVE = "nt";
        public static final String KEY_PAGE_CREATE_FIRST_VIEW = "page_create_first_pv";
        public static final String KEY_PROC = "proc";
        public static final String KEY_REFER_REQ_ID = "refer_req_id";
        public static final String KEY_REQ_ID = "req_id";
        public static final String KEY_SEQUENCE = "seq";
        public static final String KEY_SF = "sf";
        public static final String KEY_SFROM = "s_from";
        public static final String KEY_TAG = "tag";
        public static final String KEY_TAG_NAME = "tagName";
        public static final String KEY_VAL_ACT = "val_act";
        public static final String KEY_VAL_BID = "val_bid";
        public static final String KEY_VAL_CID = "val_cid";
        public static final String KEY_VAL_LAB = "val_lab";
        public static final String KEY_VAL_REF = "val_ref";
        @Deprecated
        public static final String KEY_VAL_VAL = "val_val";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class EventInfoInnerConstants {
        public static final String KEY_EVENT_LEVEL = "web_refer_cid";
        public static final String KEY_PAGE_INFO_KEY = "page_info_key";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class EventType {
        public static final String CLICK = "click";
        public static final String EDIT = "edit";
        public static final String ORDER = "order";
        public static final String PAY = "pay";
        public static final String QUIT = "quit";
        public static final String SLIDE = "slide";
        public static final String START = "start";
        public static final String VIEW = "view";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class GestureData {
        public static final String KEY_COLLECT_ID = "collect_id";
        public static final String KEY_END_TIME = "end_time";
        public static final String KEY_END_XY = "end_xy";
        public static final String KEY_LAT = "lat";
        public static final String KEY_LNG = "lng";
        public static final String KEY_PV_CID = "pv_cid";
        public static final String KEY_PV_REQID = "pv_reqid";
        public static final String KEY_PV_SESSION = "pv_session";
        public static final String KEY_REPORT_ID = "report_id";
        public static final String KEY_SCALE = "scale";
        public static final String KEY_SDK_VERSION = "sdk_version";
        public static final String KEY_SEQ = "seq";
        public static final String KEY_START_TIME = "start_time";
        public static final String KEY_START_XY = "start_xy";
        public static final String KEY_STM = "stm";
        public static final String KEY_TIME_GAP = "time_gap";
        public static final String KEY_TIME_INTERVAL = "time_interval";
        public static final String KEY_TM = "tm";
        public static final String KEY_TRAIL = "trail";
        public static final String KEY_XY_GAP = "xy_gap";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class GestureMoveEvent {
        public static final String KEY_P = "p";
        public static final String KEY_TIME = "time";
        public static final String KEY_X = "x";
        public static final String KEY_Y = "y";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class JSNative {
        public static final String DATA_CALLBACK = "cb";
        public static final String DATA_DATA = "data";
        public static final String DATA_IS_JUMP_BACK = "isJumpBack";
        public static final String DATA_METHOD = "mn";
        public static final String DATE_CHANNEL = "cn";
        public static final String DATE_CODE = "code";
        public static final String IS_QUICK_REPORT = "isQuickReport";
        public static final String JS_DATA = "data";
        public static final String JS_HOST = "_lx";
        public static final String JS_PATH = "/";
        public static final String JS_SCHEME = "statistics";
        public static final String NEED_CACHE_PD = "needCachePD";
        public static final String OPTIONS = "options";
        public static final String WEB_ENV = "web_env";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class PRIVACY {
        public static final String KEY_FUZZY_LAT = "_lat";
        public static final String KEY_FUZZY_LATITUDE = "_latitude";
        public static final String KEY_FUZZY_LNG = "_lng";
        public static final String KEY_FUZZY_LONGITUDE = "_longitude";
        public static final String KEY_LATITUDE = "latitude";
        public static final String KEY_LONGITUDE = "longitude";
        public static final String KEY_SSID = "ssid";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class QuickReport {
        public static final String KEY_FSEQ = "fseq";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class Reporter {
        public static final String KEY_PACKAGE_TM = "package_tm";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class SFrom {
        public static final String KEY_BID = "bid";
        public static final String KEY_CATEGORY = "category";
        public static final String KEY_CID = "cid";
        public static final String KEY_SEQ = "seq";
        public static final String KEY_VAL_LAB = "val_lab";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class Web {
        public static final String KEY_WEB_CID = "web_cid";
        public static final String KEY_WEB_REFER_CID = "web_refer_cid";
        public static final String KEY_WEB_REFER_REQ_ID = "web_refer_req_id";
        public static final String KEY_WEB_REQ_ID = "web_req_id";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static void setTestReportUrl(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7d167bae23d00d8ecbb068e90ffcbde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7d167bae23d00d8ecbb068e90ffcbde");
        } else if (context != null && "com.meituan.common.analyse.demo".equals(context.getPackageName())) {
            TEST_REPORT_URL = str;
        }
    }

    public static String getTestReportUrl() {
        return TEST_REPORT_URL;
    }
}
