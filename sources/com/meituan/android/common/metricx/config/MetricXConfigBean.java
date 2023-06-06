package com.meituan.android.common.metricx.config;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MetricXConfigBean {
    public static int NET_SAMPLE_RATE_DEFAULT = 100;
    public static final int NET_SAMPLE_RATE_MAX = 10000;
    public static final long TRACE_DETAIL_BYTE_LIMIT = 1048576;
    public static final int TRACE_DETAIL_COUNT_LIMIT = 200;
    public static final int TRACE_PAGE_COUNT_LIMIT = 300;
    public static final int TRACE_PAGE_INTENT_LENGTH_LIMIT = 2048;
    public static final int URL_EXP_LENGTH_LIMIT = 12288;
    public static final int URL_EXP_REPORT_LIMIT = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("net_detail_logan")
    public boolean net_detail_logan;
    @SerializedName("traffic_collect_threshold")
    public long traffic_collect_threshold;
    @SerializedName("traffic_p0_alarm_threshold")
    public long traffic_p0_alarm_threshold;
    @SerializedName("traffic_p1_alarm_threshold")
    public long traffic_p1_alarm_threshold;
    @SerializedName("net_detail_report")
    public boolean net_detail_report = true;
    @SerializedName("net_detail_sample_rate")
    public int net_detail_sample_rate = NET_SAMPLE_RATE_DEFAULT;
    @SerializedName("track_mode")
    public int track_mode = 0;
    @SerializedName("url_overlength_limit")
    public int url_overlength_limit = URL_EXP_LENGTH_LIMIT;
    @SerializedName("url_overlength_report_limit")
    public int url_overlength_report_limit = 1;
    @SerializedName("trace_detail_byte_limit")
    public long trace_detail_byte_limit = 1048576;
    @SerializedName("trace_detail_count_limit")
    public int trace_detail_count_limit = 200;
    @SerializedName("trace_page_count_limit")
    public int trace_page_count_limit = 300;
    @SerializedName("intent_length_limit")
    public int trace_page_intent_length_limit = 2048;
    @SerializedName("trace_whitelist_activity")
    public CopyOnWriteArrayList<String> trace_whitelist_activity = new CopyOnWriteArrayList<>();
    @SerializedName("isUsingFrameMetrics")
    public boolean isUsingFrameMetrics = false;

    public MetricXConfigBean() {
        this.traffic_collect_threshold = -1L;
        this.traffic_p1_alarm_threshold = -1L;
        this.traffic_p0_alarm_threshold = -1L;
        this.traffic_collect_threshold = -1L;
        this.traffic_p0_alarm_threshold = -1L;
        this.traffic_p1_alarm_threshold = -1L;
    }
}
