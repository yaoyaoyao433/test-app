package com.meituan.android.common.kitefly;

import android.content.Context;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Consumer;
import com.meituan.android.common.kitefly.utils.DnsUtils;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.metricx.helpers.ScheduleRunnableDelegate;
import com.meituan.android.common.metricx.helpers.UrlFactory;
import com.meituan.android.common.metricx.utils.CompressUtil;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import com.squareup.okhttp.s;
import com.squareup.okhttp.u;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.y;
import com.squareup.okhttp.z;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Reporter {
    private static final String HTTPS = "https://";
    private static final String TAG = "Reporter";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final String defaultLv3Category = "o0";
    private static Map<String, String> lv3CategoryMap;
    private static volatile v sKiteFlyOkHttpClient;
    private static volatile v sOkHttpClient;
    private final UrlFactory.MetricxUrl LV3_HOST;
    private final UrlFactory.MetricxUrl LV4_HOST_SAFE;
    private final ILogger logger;
    @NonNull
    private final String mName;
    private final CatchException mNetRequestException;
    private final CatchException mNetThreadWatchException;
    private final ScheduledExecutorService mService;

    /* compiled from: ProGuard */
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ReporterThread {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface SingleReportListener {
        void onReportFail(LinkedList<Log> linkedList, int i);

        void onReportSucceed(LinkedList<Log> linkedList, int i);
    }

    static {
        HashMap hashMap = new HashMap();
        lv3CategoryMap = hashMap;
        hashMap.put("fe_knb_report", "o3");
        lv3CategoryMap.put(KiteFlyConstants.FE_LOG_REPORT, "o4");
        lv3CategoryMap.put("metrics_general", "m6");
    }

    public Reporter(@Consumer.ConsumerName @NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4f591984b3a6aca9111ec6506b277b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4f591984b3a6aca9111ec6506b277b5");
            return;
        }
        this.logger = Logger.getBabelLogger();
        this.mName = str;
        this.mService = c.c("BabelReporter(" + this.mName + CommonConstant.Symbol.BRACKET_RIGHT);
        this.mNetThreadWatchException = new CatchException("Reporter-ThreadWatch", 3, LocationStrategy.LOCATION_TIMEOUT);
        this.mNetRequestException = new CatchException("Reporter-NetRequest", 1, LocationStrategy.LOCATION_TIMEOUT);
        this.LV3_HOST = UrlFactory.getInstance().createUrl("dreport.zservey.com", "dreport.meituan.net");
        this.LV4_HOST_SAFE = UrlFactory.getInstance().createUrl("d.zservey.com", "d.meituan.net");
    }

    @NonNull
    @AnyThread
    public static v getOkHttpClient() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f598839b248ed67329b31dda3a9a2968", 6917529027641081856L)) {
            return (v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f598839b248ed67329b31dda3a9a2968");
        }
        if (sOkHttpClient == null) {
            synchronized (Reporter.class) {
                if (sOkHttpClient == null) {
                    v vVar = new v();
                    OkHttp2Wrapper.addInterceptorToClient(vVar);
                    v a = b.a(vVar);
                    a.a(5L, TimeUnit.SECONDS);
                    a.c(5L, TimeUnit.SECONDS);
                    a.b(5L, TimeUnit.SECONDS);
                    sOkHttpClient = a;
                }
            }
        }
        return sOkHttpClient;
    }

    private static v getKiteFlyOkHttpClient() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ff07b476d91ac239c2a7c7e33294a7cd", 6917529027641081856L)) {
            return (v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ff07b476d91ac239c2a7c7e33294a7cd");
        }
        if (sKiteFlyOkHttpClient == null) {
            synchronized (Reporter.class) {
                if (sKiteFlyOkHttpClient == null) {
                    v vVar = new v();
                    OkHttp2Wrapper.addInterceptorToClient(vVar);
                    v a = b.a(vVar);
                    sKiteFlyOkHttpClient = a;
                    a.a(5L, TimeUnit.SECONDS);
                    sKiteFlyOkHttpClient.c(5L, TimeUnit.SECONDS);
                    sKiteFlyOkHttpClient.b(5L, TimeUnit.SECONDS);
                    sKiteFlyOkHttpClient.v = false;
                }
            }
        }
        return sKiteFlyOkHttpClient;
    }

    @AnyThread
    public void scheduleReportAction(@NonNull Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36e58d51501b031baf11dadb4129bd51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36e58d51501b031baf11dadb4129bd51");
        } else {
            this.mService.execute(new ScheduleRunnableDelegate(runnable));
        }
    }

    @AnyThread
    public void scheduleReportAction(@NonNull Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d7dda7def41130a5102e2d21569224d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d7dda7def41130a5102e2d21569224d");
        } else {
            this.mService.schedule(new ScheduleRunnableDelegate(runnable), j, TimeUnit.MILLISECONDS);
        }
    }

    @NonNull
    @AnyThread
    public String getName() {
        return this.mName;
    }

    public void scheduleReport(LinkedList<Log> linkedList, Context context, SingleReportListener singleReportListener) {
        Object[] objArr = {linkedList, context, singleReportListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f455228fe7bed9e9ea97aabed9387e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f455228fe7bed9e9ea97aabed9387e0");
            return;
        }
        Iterator<Log> it = linkedList.iterator();
        while (it.hasNext()) {
            LogConvertor.addInfoOnLogReport(context, it.next());
        }
        Map<LogMergedKey, LinkedList<Log>> mergeLogs = LogConvertor.mergeLogs(context, linkedList);
        if (mergeLogs != null) {
            for (Map.Entry<LogMergedKey, LinkedList<Log>> entry : mergeLogs.entrySet()) {
                LinkedList<Log> value = entry.getValue();
                int size = value.size();
                int i = 0;
                while (i < size) {
                    LinkedList<Log> linkedList2 = new LinkedList<>();
                    int min = Math.min(i + 20, size);
                    while (i < min) {
                        linkedList2.add(value.get(i));
                        i++;
                    }
                    executeReportSync(linkedList2, singleReportListener);
                    i = min;
                }
            }
        }
    }

    public void executeReportSync(LinkedList<Log> linkedList, SingleReportListener singleReportListener) {
        Object[] objArr = {linkedList, singleReportListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fe389d8188f37affba82dc8c33b93c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fe389d8188f37affba82dc8c33b93c3");
            return;
        }
        TimeOutWatchDogException timeOutWatchDogException = new TimeOutWatchDogException("Reporter-toggleRtReportTimeout", 6000L, this.mNetThreadWatchException);
        int reportData = reportData(linkedList);
        if (reportData >= 200 && reportData < 300) {
            singleReportListener.onReportSucceed(linkedList, reportData);
        } else {
            singleReportListener.onReportFail(linkedList, reportData);
        }
        timeOutWatchDogException.cancel();
    }

    private int reportData(List<Log> list) {
        int i;
        String convert2NetData;
        Pair<x.a, Boolean> parseRequestBuilder;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2fefb4902b0363c5e006d0675137441", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2fefb4902b0363c5e006d0675137441")).intValue();
        }
        if (list == null || list.size() == 0) {
            return -1;
        }
        try {
            String str = list.get(0).reportChannel;
            boolean booleanValue = list.get(0).innerProperty.isLv4Local.booleanValue();
            if (!booleanValue) {
                booleanValue = judgeLv4ByConfig(str);
            }
            convert2NetData = LogConvertor.convert2NetData(list);
            parseRequestBuilder = parseRequestBuilder(list.get(0), booleanValue);
        } catch (Throwable th) {
            th = th;
            i = -1;
        }
        if (parseRequestBuilder != null && !TextUtils.isEmpty(convert2NetData)) {
            x.a aVar = (x.a) parseRequestBuilder.first;
            if (!((Boolean) parseRequestBuilder.second).booleanValue()) {
                convert2NetData = "[" + convert2NetData + ']';
            }
            z a = getKiteFlyOkHttpClient().a(aVar.a("POST", y.create(u.a("application/octet-stream"), CompressUtil.stringToGzipData(convert2NetData))).a()).a();
            i = a.c;
            try {
                a.g.close();
            } catch (Throwable th2) {
                th = th2;
                this.logger.e(TAG, th);
                Logger.getBabelLogger().d("reportData, code=", Integer.valueOf(i));
                return i;
            }
            Logger.getBabelLogger().d("reportData, code=", Integer.valueOf(i));
            return i;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1 A[Catch: Exception -> 0x0164, TryCatch #0 {Exception -> 0x0164, blocks: (B:7:0x0026, B:9:0x0045, B:11:0x0052, B:13:0x0061, B:17:0x006f, B:20:0x00b1, B:22:0x00c1, B:37:0x015a, B:23:0x00d9, B:25:0x00e1, B:27:0x00eb, B:29:0x00fb, B:31:0x011b, B:32:0x011e, B:34:0x0142, B:36:0x014e, B:28:0x00f9, B:18:0x0091, B:19:0x00a9, B:10:0x0050), top: B:42:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9 A[Catch: Exception -> 0x0164, TryCatch #0 {Exception -> 0x0164, blocks: (B:7:0x0026, B:9:0x0045, B:11:0x0052, B:13:0x0061, B:17:0x006f, B:20:0x00b1, B:22:0x00c1, B:37:0x015a, B:23:0x00d9, B:25:0x00e1, B:27:0x00eb, B:29:0x00fb, B:31:0x011b, B:32:0x011e, B:34:0x0142, B:36:0x014e, B:28:0x00f9, B:18:0x0091, B:19:0x00a9, B:10:0x0050), top: B:42:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair<com.squareup.okhttp.x.a, java.lang.Boolean> parseRequestBuilder(com.meituan.android.common.kitefly.Log r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.kitefly.Reporter.parseRequestBuilder(com.meituan.android.common.kitefly.Log, boolean):android.util.Pair");
    }

    private String getNewSafeUrl(Log log, boolean z) {
        Object[] objArr = {log, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7917c2bab8a82a9eb517da2d5f35260a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7917c2bab8a82a9eb517da2d5f35260a");
        }
        StringBuilder sb = new StringBuilder("https://");
        if (z) {
            String realReportChannel = TypeConfig.getsInstance().getRealReportChannel(log.reportChannel);
            sb.append(DnsUtils.getHostNameWithDnsCheck(realReportChannel + CommonConstant.Symbol.DOT + this.LV4_HOST_SAFE.getUrl(), realReportChannel + CommonConstant.Symbol.DOT + this.LV3_HOST.getUrl()));
        } else {
            sb.append((lv3CategoryMap.containsKey(log.reportChannel) ? lv3CategoryMap.get(log.reportChannel) : defaultLv3Category) + CommonConstant.Symbol.DOT + this.LV4_HOST_SAFE.getUrl());
        }
        return sb.toString();
    }

    private boolean judgeLv4ByConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7338cf1594e9e8d4c6e0bbd5d369f5e8", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7338cf1594e9e8d4c6e0bbd5d369f5e8")).booleanValue() : !TextUtils.equals(str, KiteFlyConstants.MET_BABEL_ANDROID) && TypeConfig.getsInstance().getLv4Config().contains(str);
    }

    private static void populateProxyHeaders(x.a aVar, URL url) {
        Object[] objArr = {aVar, url};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f59372a1697b3ce2678ec4564493555a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f59372a1697b3ce2678ec4564493555a");
            return;
        }
        aVar.b("MKOriginHost", url.getHost());
        aVar.b("MKOriginPort", "443");
        aVar.b("MKScheme", url.getProtocol());
        aVar.b("MKTunnelType", "https");
        aVar.b("MKAppID", "10");
        String uuid = Babel.getBabelConfig().getUuid();
        if (TextUtils.isEmpty(uuid)) {
            return;
        }
        aVar.b("mkunionid", uuid);
    }

    private void populatePath(s.a aVar, String str) {
        String[] split;
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46695ec898e2033cade3aa343433f40d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46695ec898e2033cade3aa343433f40d");
            return;
        }
        for (String str2 : str.split("/")) {
            if (!TextUtils.isEmpty(str2)) {
                if (str2 == null) {
                    throw new IllegalArgumentException("pathSegment == null");
                }
                aVar.a(str2, 0, str2.length(), false, false);
            }
        }
    }

    public void handleOversizeLog(LinkedList<Log> linkedList, int i) {
        Object[] objArr = {linkedList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "797a1160972c199d0441e6beefc541e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "797a1160972c199d0441e6beefc541e4");
            return;
        }
        StringBuilder sb = new StringBuilder("httpCode: ");
        sb.append(i);
        sb.append(", ");
        Iterator<Log> it = linkedList.iterator();
        while (it.hasNext()) {
            Log next = it.next();
            sb.append(next.tag);
            sb.append(": ");
            sb.append(next.innerProperty.trunkSize);
            sb.append(", ");
        }
        sb.append("envSize: ");
        sb.append(Consumer.calMapSize(linkedList.get(0).envMaps));
        this.mNetRequestException.reportException(new RuntimeException(sb.toString()));
    }

    public static boolean isOk(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae9fd238a302490198a369469e8dc33d", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae9fd238a302490198a369469e8dc33d")).booleanValue() : zVar.c >= 200 && zVar.c < 300;
    }
}
