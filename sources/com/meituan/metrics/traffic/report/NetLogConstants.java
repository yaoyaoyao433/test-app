package com.meituan.metrics.traffic.report;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface NetLogConstants {
    public static final String DETAILS = "details";
    public static final String ENV = "env";
    public static final String OS = "Android";
    public static final String TAGS = "tags";

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface Details {
        public static final String CACHED = "cached";
        public static final String COMPRESS_ALGORITHM = "compress_algorithm";
        public static final String CONNECT_FAILED_NUM = "connectFailedNum";
        public static final String CONNECT_TRY_NUM = "connectTryNum";
        public static final String CONTENT_TYPE = "content_type";
        public static final String CRONET_EXTRA = "cronet_extra";
        public static final String DNS_EVENT = "dnsEvent";
        public static final String DNS_TYPE = "dns_type";
        public static final String ERROR_MSG = "error_msg";
        public static final String HOST = "host";
        public static final String IP_LIST = "ipList";
        public static final String IS_IP_V6 = "isIPv6";
        public static final String LOCAL_IP = "local_ip";
        public static final String METHOD = "method";
        public static final String NET_CONN_TIME = "net_conn_time";
        public static final String NET_DNS_TIME = "net_dns_time";
        public static final String NET_ELAPSED_TIME = "net_elapsed_time";
        public static final String NET_FRAME_POST_TIME = "net_frame_post_time";
        public static final String NET_FRAME_PRE_TIME = "net_frame_pre_time";
        public static final String NET_LIB_POST_TIME = "net_lib_post_time";
        public static final String NET_LIB_PRE_TIME = "net_lib_pre_time";
        public static final String NET_REQUEST_BODY_SIZE = "net_request_body_size";
        public static final String NET_REQUEST_HEADER_SIZE = "net_request_header_size";
        public static final String NET_REQUEST_SIZE = "net_request_size";
        public static final String NET_REQUEST_TIME = "net_request_time";
        public static final String NET_RESPONSE_BODY_SIZE = "net_response_body_size";
        public static final String NET_RESPONSE_CODE = "net_response_code";
        public static final String NET_RESPONSE_HEADER_SIZE = "net_response_header_size";
        public static final String NET_RESPONSE_SIZE = "net_response_size";
        public static final String NET_RESPONSE_TIME = "net_response_time";
        public static final String NET_TLS_TIME = "net_tls_time";
        public static final String NET_TTFB_TIME = "net_ttfb_time";
        public static final String PATH = "path";
        public static final String PROTOCOL = "protocol";
        public static final String PROXY = "proxy";
        public static final String REDIRECT = "redirect";
        public static final String REQUEST_END_TIME = "request_end_time";
        public static final String REQUEST_REUSE = "requestReuse";
        public static final String REQUEST_START_TIME = "request_start_time";
        public static final String RF_T = "rf_t";
        public static final String SCHEME = "scheme";
        public static final String SERVER_IP = "server_ip";
        public static final String SHARK_EXTRA = "shark_extra";
        public static final String TLS_VERSION = "tls_version";
        public static final String URL = "url";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface Environment {
        public static final String APP = "app";
        public static final String APP_VERSION = "appVersion";
        public static final String BUILD_VERSION = "buildVersion";
        public static final String CITY = "city";
        public static final String CLIENT_IP = "clientIP";
        public static final String DEVICE_PROVIDER = "deviceProvider";
        public static final String DEVICE_TYPE = "deviceType";
        public static final String IS_WEAK_NET = "isWeakNet";
        public static final String MCC_MNC = "mccmnc";
        public static final String NET_IP_STACK = "netIPStack";
        public static final String NET_QUALITY = "netQuality";
        public static final String OS = "os";
        public static final String OS_VERSION = "osVersion";
        public static final String PROBE_INFO = "probeInfo";
        public static final String PROVINCE = "province";
        public static final String UUID = "uuid";
        public static final String VPN = "vpn";
        public static final String WIFI_NAME = "wifiName";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface Tags {
        public static final String CITY = "city";
        public static final String FOREGROUND = "foreground";
        public static final String FROM = "from";
        public static final String LOCAL_TS = "localTs";
        public static final String NETWORK_LIB = "network_lib";
        public static final String NETWORK_LIB_VERSION = "network_lib_version";
        public static final String NETWORK_TUNNEL = "network_tunnel";
        public static final String NETWORK_TYPE = "network_type";
        public static final String PAGE = "page";
        public static final String PROCESS_NAME = "processName";
        public static final String REQUEST_NETWORK_TYPE = "requestNetworkType";
        public static final String REQ_ID = "reqId";
        public static final String SAMPLE_RATE = "sample_rate";
        public static final String SNTP_TS = "sntpTs";
        public static final String TRACE_ID = "traceId";
        public static final String TUNNEL_SOURCE = "tunnel_source";
        public static final String USER_ID = "user_id";
        public static final String X_CDN_REQUEST_ID = "x_cdn_request_id";
    }
}
