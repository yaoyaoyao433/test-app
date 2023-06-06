package com.meituan.metrics.traffic;

import android.annotation.SuppressLint;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import com.google.gson.Gson;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.kitefly.CatchException;
import com.meituan.android.common.metricx.helpers.SysDateAlarm;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import java.util.HashMap;
import java.util.LinkedList;
/* compiled from: ProGuard */
@RequiresApi(api = 28)
/* loaded from: classes3.dex */
public class SystemTrafficProviderV28Plus extends SystemTrafficProvider implements SysDateAlarm.Alarm {
    public static final String CHANNEL_FAIL_COUNT_PREFIX = "metrics_systraffic26_fail_";
    public static final String KEY_LAST_MOBILE_FAIL = "last_mobile_fail";
    public static final String KEY_LAST_WIFI_FAIL = "last_wifi_fail";
    public static final String KEY_MOBILE_FAIL_COUNT = "mobile_fail_count";
    public static final String KEY_MOBILE_TOTAl_COUNT = "mobile_total_count";
    public static final String KEY_WIFI_FAIL_COUNT = "wifi_fail_count";
    public static final String KEY_WIFI_TOTAl_COUNT = "wifi_total_count";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int A_DAY_MILLS;
    private final long SYSTEM_VOLATILITY_THRESHOLD;
    private final int TIMEOUT_THRESHOLD_MS;
    private final CatchException beginTsErrorException;
    private volatile int cacheNetwork;
    private final CatchException exception;
    private final Gson gson;
    private volatile boolean isInit;
    private final NetworkStatsManager manager;
    private final CatchException privacyException;
    private long sessionStartTime;
    private volatile long todayBeginTs;
    private final CatchException trafficDecreaseException;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum QUERY_STATE {
        UNKNOWN(-1),
        PRIVACY_FAIL(0),
        BEGIN_TS_FAIL(1),
        EXCEPTION_FAIL(2),
        SUCCESS(3);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int value;

        public static QUERY_STATE valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c8efa370874ae7469c08a4c4c089363", RobustBitConfig.DEFAULT_VALUE) ? (QUERY_STATE) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c8efa370874ae7469c08a4c4c089363") : (QUERY_STATE) Enum.valueOf(QUERY_STATE.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static QUERY_STATE[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c9b51d7a522a72a48482fa51a539fe2b", RobustBitConfig.DEFAULT_VALUE) ? (QUERY_STATE[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9b51d7a522a72a48482fa51a539fe2b") : (QUERY_STATE[]) values().clone();
        }

        QUERY_STATE(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcd3f8f1add3c13554ade5ff708d0d43", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcd3f8f1add3c13554ade5ff708d0d43");
            } else {
                this.value = i;
            }
        }

        public final int getValue() {
            return this.value;
        }
    }

    @SuppressLint({"WrongConstant"})
    public SystemTrafficProviderV28Plus(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34474cd4a300f8d56488224524fedc87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34474cd4a300f8d56488224524fedc87");
            return;
        }
        this.TIMEOUT_THRESHOLD_MS = 5000;
        this.A_DAY_MILLS = 86400000;
        this.SYSTEM_VOLATILITY_THRESHOLD = 1048576L;
        this.exception = new CatchException("SystemTrafficV28Plus", 1, 300000L);
        this.privacyException = new CatchException("querySummaryException", 2, 600000L);
        this.trafficDecreaseException = new CatchException("trafficDecreaseException", 1, 300000L);
        this.beginTsErrorException = new CatchException("beginTsError", 2, 600000L);
        this.gson = new Gson();
        this.todayBeginTs = 0L;
        this.cacheNetwork = -1;
        this.sessionStartTime = 0L;
        this.manager = (NetworkStatsManager) context.getSystemService("netstats");
        this.todayBeginTs = TimeUtil.getDayStartMillis();
        this.cacheNetwork = updateNetworkType(context);
        this.sessionStartTime = TimeUtil.currentTimeMillis();
        SysDateAlarm.getInstance().registerListener(this);
        this.isInit = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01cf, code lost:
        if (r18 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d1, code lost:
        r18.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fc, code lost:
        if (r18 != null) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.meituan.metrics.traffic.SystemTrafficProviderV28Plus.QUERY_STATE querySummary(int r22, long r23, long r25, com.meituan.metrics.util.BasicTrafficUnit r27, java.util.List<com.meituan.metrics.traffic.TrafficBucket> r28) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.traffic.SystemTrafficProviderV28Plus.querySummary(int, long, long, com.meituan.metrics.util.BasicTrafficUnit, java.util.List):com.meituan.metrics.traffic.SystemTrafficProviderV28Plus$QUERY_STATE");
    }

    private int updateNetworkType(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56151aebafe72d3d2ccd5f47342421f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56151aebafe72d3d2ccd5f47342421f0")).intValue();
        }
        if (NetWorkUtils.isWifiConnected(context)) {
            return 1;
        }
        return NetWorkUtils.isMobileConnected(context) ? 0 : -1;
    }

    private void updatePrivacyMonitorInfo(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8ad42d58ffbbb47af5a07a35335623c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8ad42d58ffbbb47af5a07a35335623c");
            return;
        }
        Context context = Metrics.getInstance().getContext();
        q a = q.a(context, CHANNEL_FAIL_COUNT_PREFIX + TimeUtil.currentSysDate(), 2);
        if (i == 1) {
            a.a(KEY_WIFI_TOTAl_COUNT, a.b(KEY_WIFI_TOTAl_COUNT, 0) + 1);
            if (z) {
                a.a(KEY_WIFI_FAIL_COUNT, a.b(KEY_WIFI_FAIL_COUNT, 0) + 1);
            }
            a.a(KEY_LAST_WIFI_FAIL, z);
            return;
        }
        a.a(KEY_MOBILE_TOTAl_COUNT, a.b(KEY_MOBILE_TOTAl_COUNT, 0) + 1);
        if (z) {
            a.a(KEY_MOBILE_FAIL_COUNT, a.b(KEY_MOBILE_FAIL_COUNT, 0) + 1);
        }
        a.a(KEY_LAST_MOBILE_FAIL, z);
    }

    @Override // com.meituan.metrics.traffic.SystemTrafficProvider
    public void updateTotalTraffic(BasicTrafficUnit basicTrafficUnit) {
        Object[] objArr = {basicTrafficUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ae45f069d51f3eb7948e76b68ecd2f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ae45f069d51f3eb7948e76b68ecd2f6");
        } else if (this.isInit) {
            String str = CIPS_CH_SYS_TRAFFIC + TimeUtil.currentSysDate();
            long currentTimeMillis = TimeUtil.currentTimeMillis();
            Context context = Metrics.getInstance().getContext();
            this.cacheNetwork = updateNetworkType(context);
            HashMap hashMap = new HashMap();
            long j = this.todayBeginTs;
            LinkedList linkedList = new LinkedList();
            QUERY_STATE querySummary = querySummary(1, j, currentTimeMillis, basicTrafficUnit, linkedList);
            hashMap.put("wifi", linkedList);
            LinkedList linkedList2 = new LinkedList();
            QUERY_STATE querySummary2 = querySummary(0, j, currentTimeMillis, basicTrafficUnit, linkedList2);
            hashMap.put("mobile", linkedList2);
            BasicTrafficUnit basicTrafficUnit2 = new BasicTrafficUnit();
            BasicTrafficUnit.initFromCIP(str, basicTrafficUnit2);
            if (querySummary == QUERY_STATE.BEGIN_TS_FAIL || querySummary2 == QUERY_STATE.BEGIN_TS_FAIL) {
                this.todayBeginTs = TimeUtil.getDayStartMillis();
                basicTrafficUnit.copyValueFrom(basicTrafficUnit2);
            } else if (basicTrafficUnit2.total > basicTrafficUnit.total) {
                if (basicTrafficUnit2.total - basicTrafficUnit.total >= 1048576) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("lastUnitRx", String.valueOf(basicTrafficUnit2.rxBytes));
                    hashMap2.put("lastUnitTx", String.valueOf(basicTrafficUnit2.txBytes));
                    hashMap2.put("increaseUnitRx", String.valueOf(basicTrafficUnit.rxBytes));
                    hashMap2.put("increaseUnitTx", String.valueOf(basicTrafficUnit.txBytes));
                    hashMap2.put("wifiState", String.valueOf(querySummary));
                    hashMap2.put("mobileState", String.valueOf(querySummary2));
                    hashMap2.put("todayBeginTs", String.valueOf(this.todayBeginTs));
                    hashMap2.put("sessionStartTs", String.valueOf(this.sessionStartTime));
                    hashMap2.put("queryTs", String.valueOf(currentTimeMillis));
                    hashMap2.put("currentTs", String.valueOf(TimeUtil.currentTimeMillis()));
                    hashMap2.put("currentBucketMap", this.gson.toJson(hashMap));
                    q a = q.a(context, str, 1);
                    String b = a.b("systraffic_bucket", "");
                    long b2 = a.b("systraffic_beginTs", -1L);
                    hashMap2.put("lastBucketMap", b);
                    hashMap2.put("lastTodayBeginTs", String.valueOf(b2));
                    this.trafficDecreaseException.reportException(hashMap2);
                }
                basicTrafficUnit.copyValueFrom(basicTrafficUnit2);
            } else {
                BasicTrafficUnit.saveToCIP(str, basicTrafficUnit);
                q a2 = q.a(context, str, 1);
                a2.a("systraffic_bucket", this.gson.toJson(hashMap));
                a2.a("systraffic_beginTs", this.todayBeginTs);
            }
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.SysDateAlarm.Alarm
    public void onMainProcessNewDate(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d0c0e03bb114ef7f654f3ae130b5dd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d0c0e03bb114ef7f654f3ae130b5dd4");
        } else {
            this.todayBeginTs = TimeUtil.getDayStartMillis();
        }
    }
}
