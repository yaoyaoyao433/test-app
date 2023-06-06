package com.meituan.metrics.traffic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.common.kitefly.CatchException;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.StoreUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.trace.MetricsTrafficListener;
import com.meituan.metrics.traffic.trace.URLException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.common.utils.ProcessUtils;
import java.io.File;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TrafficInterceptedManager {
    private static final String CH_INTERCEPTED_TRAFFIC = "metrics_intercept_traffic_";
    public static ChangeQuickRedirect changeQuickRedirect;
    private q todayRecordStorage;
    private final URLException urlException;
    private static volatile TrafficInterceptedManager sInstance = new TrafficInterceptedManager();
    private static final String TAG = "TrafficInterceptedManager";
    private static final CatchException catchException = new CatchException(TAG, 1, 300000);

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface ITrafficInterceptedListener extends MetricsTrafficListener {
        void onTrafficIntercepted(TrafficRecord trafficRecord, int i);
    }

    private String getDownSPKeyByType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c57b59e81f7850f608c09a4ed6b0851c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c57b59e81f7850f608c09a4ed6b0851c");
        }
        switch (i) {
            case 0:
                return Constants.TRAFFIC_DAILY_API_DOWNSTREAM;
            case 1:
                return Constants.TRAFFIC_DAILY_WEB_DOWNSTREAM;
            case 2:
                return Constants.TRAFFIC_DAILY_RES_DOWNSTREAM;
            case 3:
            default:
                return Constants.TRAFFIC_DAILY_OTHER_DOWNSTREAM;
            case 4:
                return Constants.TRAFFIC_DAILY_TOTAL_DOWNSTREAM;
            case 5:
                return Constants.TRAFFIC_DAILY_CUSTOM_DOWNSTREAM;
            case 6:
                return Constants.TRAFFIC_DAILY_NATIVE_DOWNSTREAM;
        }
    }

    private String getUpSPKeyByType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "747a01180515309e2f8b292b97633447", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "747a01180515309e2f8b292b97633447");
        }
        switch (i) {
            case 0:
                return Constants.TRAFFIC_DAILY_API_UPSTREAM;
            case 1:
                return Constants.TRAFFIC_DAILY_WEB_UPSTREAM;
            case 2:
                return Constants.TRAFFIC_DAILY_RES_UPSTREAM;
            case 3:
            default:
                return Constants.TRAFFIC_DAILY_OTHER_UPSTREAM;
            case 4:
                return Constants.TRAFFIC_DAILY_TOTAL_UPSTREAM;
            case 5:
                return Constants.TRAFFIC_DAILY_CUSTOM_UPSTREAM;
            case 6:
                return Constants.TRAFFIC_DAILY_NATIVE_UPSTREAM;
        }
    }

    public TrafficInterceptedManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c7e6ea487a49f62bc66ac469217af47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c7e6ea487a49f62bc66ac469217af47");
        } else {
            this.urlException = new URLException();
        }
    }

    public static TrafficInterceptedManager getInstance() {
        return sInstance;
    }

    public void handleNewRecord(@NonNull Context context, TrafficRecord trafficRecord, int i) {
        Object[] objArr = {context, trafficRecord, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abd69133e05fa4a703c82f04ececd766", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abd69133e05fa4a703c82f04ececd766");
        } else if (TextUtils.isEmpty(trafficRecord.url) || checkUrlValid(trafficRecord.url)) {
            String upSPKeyByType = getUpSPKeyByType(trafficRecord.type);
            String downSPKeyByType = getDownSPKeyByType(trafficRecord.type);
            this.todayRecordStorage = q.a(context, CH_INTERCEPTED_TRAFFIC + trafficRecord.date + CommonConstant.Symbol.UNDERLINE + ProcessUtils.getCurrentProcessName(context), 2);
            long b = this.todayRecordStorage.b(upSPKeyByType, 0L, u.e) + trafficRecord.txBytes;
            long b2 = this.todayRecordStorage.b(downSPKeyByType, 0L, u.e) + trafficRecord.rxBytes;
            this.todayRecordStorage.a(upSPKeyByType, b, u.e);
            this.todayRecordStorage.a(downSPKeyByType, b2, u.e);
            Logger.getMetricsLogger().it(TAG, "save record ", trafficRecord, " current:", upSPKeyByType, CommonConstant.Symbol.COLON, Long.valueOf(b), StringUtil.SPACE, downSPKeyByType, CommonConstant.Symbol.COLON, Long.valueOf(b2));
            try {
                for (ITrafficInterceptedListener iTrafficInterceptedListener : TrafficListenerProxy.getInstance().getITrafficInterceptedListeners()) {
                    iTrafficInterceptedListener.onTrafficIntercepted(trafficRecord, i);
                }
            } catch (Throwable th) {
                new HashMap().put("methodName", "handleNewRecord");
                catchException.reportException(th);
            }
            for (OnTrafficInterceptedListener onTrafficInterceptedListener : TrafficListenerProxy.getInstance().getTrafficInterceptedListeners()) {
                onTrafficInterceptedListener.onTrafficIntercepted(trafficRecord.url, trafficRecord.rxBytes, trafficRecord.txBytes, trafficRecord.requestHeaders, trafficRecord.responseHeaders);
            }
        }
    }

    public void detectUrlException(TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a38f3d0d909895cbe945579e27d798e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a38f3d0d909895cbe945579e27d798e");
        } else {
            this.urlException.detect(trafficRecord);
        }
    }

    public void fetchInterceptedTrafficForReport(String str, Map<String, Long> map, Context context) {
        File parentFile;
        File parentFile2;
        String[] list;
        Object[] objArr = {str, map, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04a9193b29d2655436e77c667308411b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04a9193b29d2655436e77c667308411b");
            return;
        }
        String str2 = CH_INTERCEPTED_TRAFFIC + str;
        File a = q.a(context, CH_INTERCEPTED_TRAFFIC + str + CommonConstant.Symbol.UNDERLINE + ProcessUtils.getCurrentProcessName(context), (String) null);
        if (a == null || (parentFile = a.getParentFile()) == null || !parentFile.exists() || (parentFile2 = parentFile.getParentFile()) == null || !parentFile2.exists() || !parentFile2.isDirectory() || (list = parentFile2.list()) == null) {
            return;
        }
        for (String str3 : list) {
            try {
                if (!TextUtils.isEmpty(str3) && str3.startsWith(str2)) {
                    q a2 = q.a(context, str3, 2);
                    for (Map.Entry<String, ?> entry : a2.a(u.e).entrySet()) {
                        long parseLong = NumberUtils.parseLong(String.valueOf(entry.getValue()), 0L);
                        if (map.containsKey(entry.getKey())) {
                            parseLong += map.get(entry.getKey()).longValue();
                        }
                        map.put(entry.getKey(), Long.valueOf(parseLong));
                    }
                    StoreUtils.removeCIPStorageObject(a2, context, str3);
                }
            } catch (Throwable th) {
                new HashMap().put("methodName", "fetchInterceptedTrafficForReport");
                Logger.getMetricxLogger().e("Error in reportRecord", th);
                catchException.reportException(th);
            }
        }
    }

    private boolean checkUrlValid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96906b1de394c019ca1516fe60d0b396", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96906b1de394c019ca1516fe60d0b396")).booleanValue();
        }
        try {
            String host = new URI(str).getHost();
            if (!TextUtils.equals(host, "localhost") && !TextUtils.equals(host, "127.0.0.1")) {
                if (!TextUtils.equals(host, "::1")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
