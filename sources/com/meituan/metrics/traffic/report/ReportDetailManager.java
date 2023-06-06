package com.meituan.metrics.traffic.report;

import android.net.Uri;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.KiteFly;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.config.MetricXConfigBean;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReportDetailManager {
    private static String BABEL_IOH_HOST = "dreport.meituan.net";
    private static String BABEL_IOH_HOST_NEW = "d.meituan.net";
    private static String BABEL_IOT_HOST = "dreport.zservey.com";
    private static String BABEL_IOT_HOST_NEW = "d.zservey.com";
    private static final String CATEGORY_DEFAULT = "p14";
    private static String MOCK_HOST = "appmock.sankuai.com";
    private static final String TAG = "ReportDetailManager";
    private static final String TYPE_COMMON = "net_group_common";
    private static final String TYPE_ERROR = "net_group_error";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int sRequestNum;
    private BusinessInfoListener businessInfoListener;
    private volatile boolean enable;
    private volatile boolean enableLogan;
    private volatile boolean isDebug;
    private final Random random;
    private List<RequestListener> requestListeners;
    private volatile int sampleRate;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface BusinessInfoListener {
        void onReceive(BusinessInfo businessInfo);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface RequestListener {
        void onRequest(TrafficRecord trafficRecord);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Holder {
        private static final ReportDetailManager INSTANCE = new ReportDetailManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public ReportDetailManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c80843fc26c5f25662077020822d74e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c80843fc26c5f25662077020822d74e0");
            return;
        }
        this.enable = true;
        this.enableLogan = true;
        this.isDebug = false;
        this.sampleRate = MetricXConfigBean.NET_SAMPLE_RATE_DEFAULT;
        this.random = new Random();
        this.requestListeners = new ArrayList();
    }

    public void setDebug(boolean z) {
        this.isDebug = z;
    }

    public static ReportDetailManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "629209fa3c1804b93d613f684897dc8e", RobustBitConfig.DEFAULT_VALUE) ? (ReportDetailManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "629209fa3c1804b93d613f684897dc8e") : Holder.INSTANCE;
    }

    public void setConfig(MetricXConfigBean metricXConfigBean) {
        Object[] objArr = {metricXConfigBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e86461d66c910835b8389973950f639e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e86461d66c910835b8389973950f639e");
        } else if (metricXConfigBean == null) {
        } else {
            this.enable = metricXConfigBean.net_detail_report;
            this.enableLogan = metricXConfigBean.net_detail_logan;
            if (metricXConfigBean.net_detail_sample_rate > 0) {
                this.sampleRate = metricXConfigBean.net_detail_sample_rate;
            }
        }
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void send(TrafficRecord trafficRecord) {
        Uri parse;
        String host;
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83e694d7d9784320e4710dff8da7df41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83e694d7d9784320e4710dff8da7df41");
        } else if (this.enable) {
            notifyRequestListeners(trafficRecord);
            if (trafficRecord == null || trafficRecord.getUrl() == null || (parse = Uri.parse(trafficRecord.getUrl())) == null || (host = parse.getHost()) == null || host.equals(StringUtil.NULL) || host.equals("localhost") || host.equals("127.0.0.1")) {
                return;
            }
            if (host.endsWith(BABEL_IOH_HOST) || host.endsWith(BABEL_IOT_HOST) || host.endsWith(BABEL_IOT_HOST_NEW) || host.endsWith(BABEL_IOH_HOST_NEW) || (KiteFly.isMock() && host.endsWith(MOCK_HOST))) {
                Logger.getMetricxLogger().d("禁止循环请求,url=%s", trafficRecord.getUrl());
                return;
            }
            BusinessInfo prepareBusinessInfo = DataUtils.prepareBusinessInfo(trafficRecord);
            if (this.businessInfoListener != null) {
                this.businessInfoListener.onReceive(prepareBusinessInfo);
            }
            if (this.isDebug) {
                this.sampleRate = 10000;
            }
            boolean isSuccessful = DataUtils.isSuccessful(trafficRecord);
            boolean needReport = needReport();
            DataUtils.init(trafficRecord);
            Map<String, Object> tags = DataUtils.getTags(parse, prepareBusinessInfo, isSuccessful);
            JSONObject detail = DataUtils.getDetail(trafficRecord, isSuccessful);
            if (this.enableLogan) {
                NetLogManager.writeToLogan(tags, detail);
            }
            if (!isSuccessful || needReport) {
                if (needReport) {
                    if (tags != null) {
                        tags.put("sample_rate", Float.valueOf(this.sampleRate / 10000.0f));
                        if (NetLogManager.getNetProbeMap() != null && !NetLogManager.getNetProbeMap().isEmpty()) {
                            tags.put(NetLogConstants.Environment.PROBE_INFO, NetLogManager.getNetProbeMap());
                        }
                    }
                    report(TYPE_COMMON, tags, detail);
                }
                if (isSuccessful) {
                    return;
                }
                if (tags != null) {
                    tags.put("sample_rate", Double.valueOf(1.0d));
                    if (NetLogManager.getNetProbeMap() != null && !NetLogManager.getNetProbeMap().isEmpty()) {
                        tags.put(NetLogConstants.Environment.PROBE_INFO, NetLogManager.getNetProbeMap());
                    }
                }
                report(TYPE_ERROR, tags, detail);
            }
        }
    }

    public boolean needReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60f0dbf5536da8856b3322d2bfe28ead", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60f0dbf5536da8856b3322d2bfe28ead")).booleanValue() : this.random.nextInt(10000) < this.sampleRate;
    }

    private void report(String str, Map<String, Object> map, JSONObject jSONObject) {
        Object[] objArr = {str, map, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb3da573a7e6cbd5b0fab98fe528083e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb3da573a7e6cbd5b0fab98fe528083e");
            return;
        }
        Log.Builder builder = new Log.Builder("");
        builder.reportChannel(CATEGORY_DEFAULT);
        builder.tag(str);
        builder.lv4LocalStatus(true);
        if (map != null) {
            builder.optional(map);
        }
        if (jSONObject != null) {
            builder.details(jSONObject.toString());
        }
        Babel.logRT(builder.build());
        if (this.isDebug) {
            Gson create = new GsonBuilder().setPrettyPrinting().create();
            String currentProcessName = ProcessUtils.getCurrentProcessName();
            StringBuilder sb = new StringBuilder("url:");
            sb.append(map.get(NetLogConstants.Details.SCHEME) + "://" + map.get("host") + map.get("path"));
            sb.append("\nprocessName");
            sb.append(currentProcessName);
            sb.append(" 主进程:");
            sb.append(ProcessUtils.isMainProcess(Metrics.getInstance().getContext()));
            sb.append(" RequestNum:");
            int i = sRequestNum + 1;
            sRequestNum = i;
            sb.append(i);
            sb.append("\ntype:");
            sb.append(str);
            sb.append("\ntags:");
            sb.append(create.toJson(map));
            sb.append("\ndetail:");
            sb.append(jSONObject);
            android.util.Log.e(TAG, sb.toString());
        }
    }

    public void setBusinessInfoListener(BusinessInfoListener businessInfoListener) {
        this.businessInfoListener = businessInfoListener;
    }

    public void addRequestListener(RequestListener requestListener) {
        Object[] objArr = {requestListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d79b474badf504fc01a759cd91d0f66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d79b474badf504fc01a759cd91d0f66");
            return;
        }
        synchronized (this.requestListeners) {
            this.requestListeners.add(requestListener);
        }
    }

    public void removeRequestListener(RequestListener requestListener) {
        Object[] objArr = {requestListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27b817b6aeb977fe484f84a10cbf1459", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27b817b6aeb977fe484f84a10cbf1459");
            return;
        }
        synchronized (this.requestListeners) {
            this.requestListeners.remove(requestListener);
        }
    }

    private void notifyRequestListeners(TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd2150e07b6c9e29037996ee9fdc8a4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd2150e07b6c9e29037996ee9fdc8a4d");
            return;
        }
        synchronized (this.requestListeners) {
            for (RequestListener requestListener : this.requestListeners) {
                requestListener.onRequest(trafficRecord);
            }
        }
    }
}
