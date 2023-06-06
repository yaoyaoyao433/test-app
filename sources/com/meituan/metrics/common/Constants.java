package com.meituan.metrics.common;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface Constants {
    public static final String ANDROIRD = "Android";
    public static final String ANR = "anr";
    public static final String BIG_IMAGE = "mobile.large.image";
    public static final String CATCH_EXCEPTION_NAME = "safeRun";
    public static final String COLD_LAUNCH_METER = "mobile.view.load.homepage";
    public static final String CPU = "cpu";
    public static final String CPU_AVG = "mobile.cpu.avg";
    public static final String CPU_MAX = "mobile.cpu.max";
    public static final String CPU_MAX_V2 = "cpuMax";
    public static final String CPU_PROCESS = "mobile.process.cpu";
    public static final String CPU_V2 = "mobile.cpu.v2";
    public static final String CUSTOM_METER_ID = "key";
    public static final String CUSTOM_SPEED_METER = "mobile.view.load.custom";
    public static final char ENTER = '\n';
    public static final String EXIT_INFO_TYPE = "mobile.exit.info";
    public static final String FILE = "mobile.file.upload";
    public static final String FPS_CUSTOM = "fps_custom";
    public static final String FPS_CUSTOM_AVG = "mobile.fps.custom.avg.v2";
    public static final String FPS_CUSTOM_MIN = "mobile.fps.custom.min.v2";
    public static final String FPS_PAGE = "fps_page";
    public static final String FPS_PAGE_AVG = "mobile.fps.page.avg.v2";
    public static final String FPS_PAGE_MIN = "mobile.fps.page.min.v2";
    public static final String FPS_SCROLL = "fps_scroll";
    public static final String FPS_SCROLL_AVG = "mobile.fps.scroll.avg.v2";
    public static final String FPS_SCROLL_AVG_N = "mobile.fps.scroll.avg.v2.n";
    public static final String FPS_SCROLL_MIN = "mobile.fps.scroll.min.v2";
    public static final String FPS_TYPE_CUSTOM = "custom";
    public static final String FPS_TYPE_PAGE = "page";
    public static final String FPS_TYPE_SCROLL = "scroll";
    public static final String FPS_TYPE_SCROLL_N = "scroll-N";
    public static final String FSP = "FSP";
    public static final String IMAGE_URL = "url";
    public static final String KEY_BACKGROUND = "background";
    public static final String KEY_FOREGROUND = "foreground";
    public static final String KEY_MOBILE = "mobile";
    public static final String KEY_RX = "rx";
    public static final String KEY_TOTAl = "total";
    public static final String KEY_TX = "tx";
    public static final String KEY_WIFI = "wifi";
    public static final String LAG_EVENT_TYPE = "event_type";
    public static final String LAG_LOG = "lag_log";
    public static final String LAG_THRESHOLD = "threshold";
    public static final String MEMORY = "memory";
    public static final String MEMORY_AVG = "mobile.memory.avg";
    public static final String MEMORY_MAX = "mobile.memory.max";
    public static final String MEMORY_PROCESS = "mobile.process.memory";
    public static final String MEMORY_V2 = "mobile.memory.v2";
    public static final String METRICS = "metrics";
    public static final String PAGE_LOAD_AUTO = "mobile.view.load.page.auto";
    public static final String PAGE_LOAD_METER = "mobile.view.load.page";
    public static final String PAGE_NAME = "pageName";
    public static final String PROCESS_NAME = "processName";
    public static final String REACH_BOTTOM_FSP = "ReachBottomFSP";
    public static final char SPACE = ' ';
    public static final String SPEED_METER_STEP = "step";
    public static final String SPLITTER = "\n--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n";
    public static final String TAGS = "tags";
    public static final String TOTAL_TIME = "total";
    public static final String TRACE_CRONET = "cronetSummary";
    public static final String TRACE_DAXIANG = "daxiangSummary";
    public static final String TRACE_DOWNLOADMANAGER = "downloadManager";
    public static final String TRACE_LONG_URL = "overLengthUrl";
    public static final String TRACE_MTLIVE = "mtliveSummary";
    public static final String TRACE_MTWEBVIEW = "mtwebviewSummary";
    public static final String TRACE_NATIVE = "nativeHostDetail";
    public static final String TRACE_PAGE = "pageDetail";
    public static final String TRACE_PIKE = "pikeSummary";
    public static final String TRACE_SHARK = "sharkSummary";
    public static final String TRACE_SYS = "sysSummary";
    public static final String TRACE_TYPE_COLLECT = "Collect";
    public static final String TRACE_TYPE_P0 = "P0";
    public static final String TRACE_TYPE_P1 = "P1";
    public static final String TRACE_TYPE_P2 = "P2";
    public static final String TRACE_TYPE_TOTAL = "Total";
    public static final String TRACE_URI = "URIDetail";
    public static final String TRAFFIC_BACKGROUND = "backgroundTotal";
    public static final String TRAFFIC_BACKGROUND_TOTAL = "mobile.traffic.background.total";
    public static final String TRAFFIC_COUNT = "count";
    public static final String TRAFFIC_DAILY_API_DOWNSTREAM = "mobile.traffic.daily.api.downstream";
    public static final String TRAFFIC_DAILY_API_UPSTREAM = "mobile.traffic.daily.api.upstream";
    public static final String TRAFFIC_DAILY_CUSTOM_DOWNSTREAM = "mobile.traffic.daily.custom.downstream";
    public static final String TRAFFIC_DAILY_CUSTOM_UPSTREAM = "mobile.traffic.daily.custom.upstream";
    public static final String TRAFFIC_DAILY_NATIVE_DOWNSTREAM = "mobile.traffic.daily.native.downstream";
    public static final String TRAFFIC_DAILY_NATIVE_UPSTREAM = "mobile.traffic.daily.native.upstream";
    public static final String TRAFFIC_DAILY_OTHER_DOWNSTREAM = "mobile.traffic.daily.other.downstream";
    public static final String TRAFFIC_DAILY_OTHER_UPSTREAM = "mobile.traffic.daily.other.upstream";
    public static final String TRAFFIC_DAILY_RES_DOWNSTREAM = "mobile.traffic.daily.res.downstream";
    public static final String TRAFFIC_DAILY_RES_UPSTREAM = "mobile.traffic.daily.res.upstream";
    public static final String TRAFFIC_DAILY_TOTAL_DOWNSTREAM = "mobile.traffic.daily.total.downstream";
    public static final String TRAFFIC_DAILY_TOTAL_STREAM = "mobile.traffic.daily.total";
    public static final String TRAFFIC_DAILY_TOTAL_UPSTREAM = "mobile.traffic.daily.total.upstream";
    public static final String TRAFFIC_DAILY_WEB_DOWNSTREAM = "mobile.traffic.daily.web.downstream";
    public static final String TRAFFIC_DAILY_WEB_UPSTREAM = "mobile.traffic.daily.web.upstream";
    public static final String TRAFFIC_DOWN = "downTotal";
    public static final String TRAFFIC_FOREGROUND = "foregroundTotal";
    public static final String TRAFFIC_FOREGROUND_TOTAL = "mobile.traffic.foreground.total";
    public static final String TRAFFIC_HOST = "host";
    public static final String TRAFFIC_INTENT = "intent";
    public static final String TRAFFIC_MOBILE = "mobileTotal";
    public static final String TRAFFIC_MOBILE_TOTAL = "mobile.traffic.mobile.total";
    public static final String TRAFFIC_PAGE = "page";
    public static final String TRAFFIC_REFERER = "referer";
    public static final String TRAFFIC_TAG_DATE = "date";
    public static final String TRAFFIC_TOTAL = "total";
    public static final int TRAFFIC_TYPE_API = 0;
    public static final int TRAFFIC_TYPE_CUSTOM = 5;
    public static final String TRAFFIC_TYPE_EXCEPTION = "mobile.traffic.exception";
    public static final int TRAFFIC_TYPE_NATIVE = 6;
    public static final int TRAFFIC_TYPE_OTHER = 3;
    public static final int TRAFFIC_TYPE_RES = 2;
    public static final int TRAFFIC_TYPE_TOTAL = 4;
    public static final String TRAFFIC_TYPE_TRACE = "mobile.traffic.trace.";
    public static final int TRAFFIC_TYPE_UNKNOWN = -1;
    public static final int TRAFFIC_TYPE_WEB = 1;
    public static final String TRAFFIC_UP = "upTotal";
    public static final String TRAFFIC_URI = "uri";
    public static final String TRAFFIC_WIFI = "wifiTotal";
    public static final String TRAFFIC_WIFI_TOTAL = "mobile.traffic.wifi.total";
    public static final int TRAFFIC_WRAPPER_MAX_FAILED_COUNT = 3;
    public static final String TYPE_DEFAULT = "default";
    public static final String TYPE_LAG = "lag_log";
}
