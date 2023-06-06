package com.meituan.metrics.traffic.trace;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.config.MetricXConfigBean;
import com.meituan.android.common.metricx.config.MetricXConfigManager;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Trace;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.net.report.MetricsReportManager;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.URL;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class URLException extends Trace implements MetricXConfigManager.ConfigChangedListener {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int lengthLimit = 12288;
    private static int reportLimit = 1;
    private HashMap<String, Integer> urlReportCounter;

    public URLException() {
        super(Constants.TRACE_LONG_URL);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a90b274bb0cdd98c109470d5a20d4aae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a90b274bb0cdd98c109470d5a20d4aae");
            return;
        }
        this.urlReportCounter = new HashMap<>();
        MetricXConfigManager.getInstance().register(this);
    }

    private void report(TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4eae8a332e634243fd3b275b043d68a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4eae8a332e634243fd3b275b043d68a8");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", trafficRecord.getUrl().substring(0, lengthLimit));
        hashMap.put("requestHeaderSize", Long.valueOf(trafficRecord.getRequestHeaderSize()));
        hashMap.put("requestBodySize", Long.valueOf(trafficRecord.getRequestBodySize()));
        Babel.logRT(new Log.Builder("").lv4LocalStatus(true).reportChannel(MetricsReportManager.getInstance().getCategory()).tag(Constants.TRAFFIC_TYPE_EXCEPTION).optional(hashMap).value(trafficRecord.getUrl().length()).build());
    }

    public void detect(TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40fd57550c3455990c028e292293d4e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40fd57550c3455990c028e292293d4e7");
        } else if (TextUtils.equals(trafficRecord.getMethod(), "GET")) {
            String url = trafficRecord.getUrl();
            if (!TextUtils.isEmpty(url) && url.length() >= lengthLimit) {
                try {
                    URL url2 = new URL(url);
                    String str = url2.getHost() + "/" + url2.getPath();
                    if (this.urlReportCounter.containsKey(str)) {
                        int intValue = this.urlReportCounter.get(str).intValue();
                        if (intValue >= reportLimit) {
                            Logger.getMetricxLogger().e("OverLengthUrl " + trafficRecord.getUrl());
                            return;
                        }
                        report(trafficRecord);
                        this.urlReportCounter.put(str, Integer.valueOf(intValue + 1));
                        return;
                    }
                    report(trafficRecord);
                    this.urlReportCounter.put(str, 1);
                } catch (Throwable th) {
                    Logger.getMetricxLogger().e(th.getLocalizedMessage());
                }
            }
        }
    }

    @Override // com.meituan.android.common.metricx.config.MetricXConfigManager.ConfigChangedListener
    public void onConfigChanged(@NonNull MetricXConfigBean metricXConfigBean) {
        lengthLimit = metricXConfigBean.url_overlength_limit;
        reportLimit = metricXConfigBean.url_overlength_report_limit;
    }
}
