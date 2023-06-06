package com.meituan.android.common.kitefly;

import android.content.Context;
import android.os.Build;
import android.support.annotation.AnyThread;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.metricx.helpers.UrlFactory;
import com.meituan.android.common.metricx.utils.ApkUtil;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.LogcatLogger;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.common.utils.ProcessUtils;
import com.squareup.okhttp.u;
import com.squareup.okhttp.x;
import com.squareup.okhttp.y;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SLACounter {
    private static final String TAG = "SLA";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile SLA sEmpty;
    private static volatile SLA sMain;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface SLA {
        @AnyThread
        void incrementApiCount(int i, int i2, String str);

        @WorkerThread
        void incrementDBError(int i);

        void incrementInsertFailedMsg(int i);

        void incrementLogTooLargeCount(int i, int i2, String str);

        void incrementMemoryMessageCount(int i, int i2, @NonNull LinkedList<Log> linkedList);

        void incrementMetricsCount(int i);

        void onConsumerReceiveMessages(@NonNull LinkedList<Log> linkedList);

        void onMessageSave2DB(@NonNull LinkedList<Log> linkedList);

        @WorkerThread
        void onRTMessageSaveToDB(@NonNull LinkedList<Log> linkedList);

        @WorkerThread
        void onRTMessageToReporter(@NonNull LinkedList<Log> linkedList);

        @WorkerThread
        void onRTNetSuccess(@NonNull LinkedList<Log> linkedList);

        void onReportSuccess(@NonNull LinkedList<Log> linkedList, boolean z);

        @WorkerThread
        void report();
    }

    private static SLA emptySLA() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "404d31e5be44bc9384e54101a38f612e", 6917529027641081856L)) {
            return (SLA) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "404d31e5be44bc9384e54101a38f612e");
        }
        if (sEmpty == null) {
            synchronized (SLACounter.class) {
                if (sEmpty == null) {
                    sEmpty = (SLA) Proxy.newProxyInstance(SLACounter.class.getClassLoader(), new Class[]{SLA.class}, new InvocationHandler() { // from class: com.meituan.android.common.kitefly.SLACounter.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.reflect.InvocationHandler
                        public final Object invoke(Object obj, Method method, Object[] objArr2) throws Throwable {
                            return null;
                        }
                    });
                }
            }
        }
        return sEmpty;
    }

    private static SLA mainSLA(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17df297a04ab399698d4ea4a56298645", 6917529027641081856L)) {
            return (SLA) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17df297a04ab399698d4ea4a56298645");
        }
        if (sMain == null) {
            synchronized (SLACounter.class) {
                if (sMain == null) {
                    sMain = new MainSLA(context);
                }
            }
        }
        return sMain;
    }

    public static SLA getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e48292c09af8fdad79f9920995fcc139", 6917529027641081856L)) {
            return (SLA) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e48292c09af8fdad79f9920995fcc139");
        }
        if (KiteFly.getContext() == null) {
            return emptySLA();
        }
        if (ProcessUtils.isMainProcess(KiteFly.getContext())) {
            return mainSLA(KiteFly.getContext());
        }
        return emptySLA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class MainSLA implements SLA {
        private static final String KEY_ARN_ENTER_COUNT = "anrEnterCount";
        private static final String KEY_ARN_REPORT_COUNT = "anrReportCount";
        private static final String KEY_DB_ERROR = "dbInsertErrorCount";
        private static final String KEY_DB_INSERT_FAILED_COUNT = "insertDBFailedCount";
        private static final String KEY_IS_FIRST = "is_first";
        private static final String KEY_MEMORY_LOSE_NRT_COUNT = "loseNRTCount";
        private static final String KEY_MEMORY_LOSE_RT_COUNT = "loseRTCount";
        private static final String KEY_MEMORY_LOSE_SNIFFER_COUNT = "loseSnifferCount";
        private static final String KEY_MEMORY_LOSE_SNIFFER_FAIL_COUNT = "loseSnifferFailCount";
        private static final String KEY_MEMORY_LOSE_SNIFFER_SUCCESS_COUNT = "loseSnifferSuccessCount";
        private static final String KEY_MEMORY_LOSE_VIP_COUNT = "loseVIPCount";
        private static final String KEY_METRICS = "metrics_count";
        private static final String KEY_NRT_CONSUMER_RECEIVE = "nrtConsumerReceive";
        private static final String KEY_NRT_ENTER_COUNT = "nrtEnterCount";
        private static final String KEY_NRT_LOG_TOO_LARGE = "nrtLogTooLarge";
        private static final String KEY_NRT_REPORT_COUNT = "nrtReportCount";
        private static final String KEY_RT_2DB_COUNT = "rt2DBCount";
        private static final String KEY_RT_CONSUMER_RECEIVE = "rtConsumerReceive";
        private static final String KEY_RT_ENTER_COUNT = "rtEnterCount";
        private static final String KEY_RT_LOG_TOO_LARGE = "rtLogTooLarge";
        private static final String KEY_RT_NET_THREAD_SUCCESS_COUNT = "rtNetThreadSuccess";
        private static final String KEY_RT_REPORT_COUNT = "rtReportCount";
        private static final String KEY_RT_TO_REPORTER = "rtToReporter";
        private static final String KEY_SAVE2_DB = "save2DBCount";
        private static final String KEY_SDK_VERSION = "sdkVersion";
        private static final String KEY_SNIFFER_CONSUMER_RECEIVE = "snifferConsumerReceive";
        private static final String KEY_SNIFFER_ENTER_COUNT = "snifferEnterCount";
        private static final String KEY_SNIFFER_FAIL_CONSUMER_RECEIVE = "snifferFailConsumerReceive";
        private static final String KEY_SNIFFER_FAIL_ENTER_COUNT = "snifferFailEnterCount";
        private static final String KEY_SNIFFER_FAIL_REPORT_COUNT = "snifferFailReportCount";
        private static final String KEY_SNIFFER_REPORT_COUNT = "snifferReportCount";
        private static final String KEY_SNIFFER_SUCCESS_CONSUMER_RECEIVE = "snifferSuccessConsumerReceive";
        private static final String KEY_SNIFFER_SUCCESS_ENTER_COUNT = "snifferSuccessEnterCount";
        private static final String KEY_SNIFFER_SUCCESS_REPORT_COUNT = "snifferSuccessReportCount";
        private static final String KEY_VIP_CONSUMER_RECEIVE = "vipConsumerReceive";
        private static final String KEY_VIP_ENTER_COUNT = "vipEnterCount";
        private static final String KEY_VIP_REPORT_COUNT = "vipReportCount";
        private static final String KEY_VIP_SAVE2_DB = "vip2DBCount";
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final ArrayList<String> snifferTypes = new ArrayList<>();
        private final CatchException mCatchException;
        @NonNull
        private final Context mContext;
        private final ExecutorService mExecutor;
        private JsonObject mFirstSLAInfo;
        private final ILogger mLogger;
        private final AtomicBoolean mReporting;
        @GuardedBy("this")
        private volatile q mTotalSLA;
        private final UrlFactory.MetricxUrl slaUrl;

        public MainSLA(@NonNull Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26b6463c0aa78ba77ba6ca5c0764d4a6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26b6463c0aa78ba77ba6ca5c0764d4a6");
                return;
            }
            this.mReporting = new AtomicBoolean(false);
            this.mContext = context;
            this.mLogger = new LogcatLogger("babel-sla");
            this.mLogger.setLogLevel(5);
            this.mExecutor = c.a("babel-sla");
            this.mCatchException = new CatchException("sla-report", 3, 500L);
            this.slaUrl = UrlFactory.getInstance().createUrl("https://babel-statistics-android.dreport.zservey.com/perf/catchexception", "https://babel-statistics-android.dreport.meituan.net/perf/catchexception");
            snifferTypes.add(KiteFlyConstants.SNIFFER);
            snifferTypes.add(KiteFlyConstants.SNIFFER_FAIL_METRICS);
            snifferTypes.add(KiteFlyConstants.SNIFFER_SUCCESS_METRICS);
            this.mExecutor.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.SLACounter.MainSLA.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "726fe3ee134fef640aebf84bbf19d6c2", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "726fe3ee134fef640aebf84bbf19d6c2");
                        return;
                    }
                    MainSLA.this.mLogger.d("start load sla info");
                    MainSLA.this.ensureSLA();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void ensureSLA() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee29df3bcdc7f3c0764bba66d41d7c3a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee29df3bcdc7f3c0764bba66d41d7c3a");
                return;
            }
            if (this.mTotalSLA == null) {
                q a = q.a(this.mContext, "babel-total-sla", 1);
                if ("4.7.24.2-waimai".equals(a.b("sdkVersion", ""))) {
                    String[] strArr = {KEY_RT_ENTER_COUNT, KEY_NRT_ENTER_COUNT, KEY_VIP_ENTER_COUNT, KEY_RT_REPORT_COUNT, KEY_NRT_REPORT_COUNT, KEY_VIP_REPORT_COUNT, KEY_RT_CONSUMER_RECEIVE, KEY_NRT_CONSUMER_RECEIVE, KEY_VIP_CONSUMER_RECEIVE, KEY_RT_2DB_COUNT, KEY_RT_NET_THREAD_SUCCESS_COUNT, KEY_RT_TO_REPORTER, KEY_SAVE2_DB, KEY_VIP_SAVE2_DB, KEY_DB_ERROR, KEY_ARN_ENTER_COUNT, "anrReportCount", KEY_RT_LOG_TOO_LARGE, KEY_NRT_LOG_TOO_LARGE, KEY_DB_INSERT_FAILED_COUNT, KEY_MEMORY_LOSE_NRT_COUNT, KEY_MEMORY_LOSE_RT_COUNT, KEY_MEMORY_LOSE_VIP_COUNT, KEY_METRICS, KEY_SNIFFER_ENTER_COUNT, KEY_SNIFFER_FAIL_ENTER_COUNT, KEY_SNIFFER_SUCCESS_ENTER_COUNT, KEY_SNIFFER_REPORT_COUNT, KEY_SNIFFER_FAIL_REPORT_COUNT, KEY_SNIFFER_SUCCESS_REPORT_COUNT, KEY_SNIFFER_CONSUMER_RECEIVE, KEY_SNIFFER_FAIL_CONSUMER_RECEIVE, KEY_SNIFFER_SUCCESS_CONSUMER_RECEIVE, KEY_MEMORY_LOSE_SNIFFER_COUNT, KEY_MEMORY_LOSE_SNIFFER_FAIL_COUNT, KEY_MEMORY_LOSE_SNIFFER_SUCCESS_COUNT};
                    JsonObject jsonObject = new JsonObject();
                    synchronized (this) {
                        int i = 0;
                        for (int i2 = 0; i2 < 36; i2++) {
                            String str = strArr[i2];
                            int b = a.b(str, 0);
                            i += b;
                            jsonObject.addProperty(str, Integer.valueOf(b));
                        }
                        if (i != 0) {
                            this.mFirstSLAInfo = jsonObject;
                            this.mFirstSLAInfo.addProperty("is_first", (Number) 1);
                        }
                    }
                } else {
                    a.c();
                    a.a("sdkVersion", "4.7.24.2-waimai");
                }
                this.mTotalSLA = a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void _incrementApiCount(int i, int i2, String str) {
            String str2;
            if (i != 100) {
                switch (i) {
                    case 0:
                        str2 = KEY_RT_ENTER_COUNT;
                        break;
                    case 1:
                        str2 = KEY_NRT_ENTER_COUNT;
                        break;
                    default:
                        str2 = "None";
                        break;
                }
            } else {
                str2 = KEY_VIP_ENTER_COUNT;
            }
            if (snifferTypes.contains(str)) {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -2061942821) {
                    if (hashCode != 306737446) {
                        if (hashCode == 1374905797 && str.equals(KiteFlyConstants.SNIFFER_SUCCESS_METRICS)) {
                            c = 2;
                        }
                    } else if (str.equals(KiteFlyConstants.SNIFFER_FAIL_METRICS)) {
                        c = 1;
                    }
                } else if (str.equals(KiteFlyConstants.SNIFFER)) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        updateCount(KEY_SNIFFER_ENTER_COUNT, i2);
                        break;
                    case 1:
                        updateCount(KEY_SNIFFER_FAIL_ENTER_COUNT, i2);
                        break;
                    case 2:
                        updateCount(KEY_SNIFFER_SUCCESS_ENTER_COUNT, i2);
                        break;
                }
            }
            updateCount(str2, i2);
            if ("anr".equals(str)) {
                updateCount(KEY_ARN_ENTER_COUNT, 1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void updateCount(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c819a537b2debf90261800f97222cbc1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c819a537b2debf90261800f97222cbc1");
            } else {
                this.mTotalSLA.a(str, this.mTotalSLA.b(str, 0) + i);
            }
        }

        @Override // com.meituan.android.common.kitefly.SLACounter.SLA
        public void incrementApiCount(final int i, final int i2, final String str) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4793413cb757f5b4fa458fb9da6d4d2f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4793413cb757f5b4fa458fb9da6d4d2f");
            } else if (this.mTotalSLA != null) {
                _incrementApiCount(i, i2, str);
            } else {
                this.mExecutor.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.SLACounter.MainSLA.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9100361e96c575fb86df5244f71d0344", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9100361e96c575fb86df5244f71d0344");
                        } else {
                            MainSLA.this._incrementApiCount(i, i2, str);
                        }
                    }
                });
            }
        }

        @Override // com.meituan.android.common.kitefly.SLACounter.SLA
        public void onReportSuccess(@NonNull LinkedList<Log> linkedList, boolean z) {
            Map<String, Object> map;
            Object[] objArr = {linkedList, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ef17d7476f0f5bb6befdcfd6e5daf0e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ef17d7476f0f5bb6befdcfd6e5daf0e");
                return;
            }
            this.mLogger.d("onReportSuccess: ", Integer.valueOf(linkedList.size()));
            Iterator<Log> it = linkedList.iterator();
            while (it.hasNext()) {
                Log next = it.next();
                if (next.innerProperty.isMainProcess && ((map = next.envMaps) == null || !map.containsKey("sdkVersion") || "4.7.24.2-waimai".equals(map.get("sdkVersion")))) {
                    incrementReportCount(next.status, 1, next.tag);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void _incrementReportCount(int i, int i2, String str) {
            String str2;
            if (i != 100) {
                switch (i) {
                    case 0:
                        str2 = KEY_RT_REPORT_COUNT;
                        break;
                    case 1:
                        str2 = KEY_NRT_REPORT_COUNT;
                        break;
                    default:
                        str2 = "None";
                        break;
                }
            } else {
                str2 = KEY_VIP_REPORT_COUNT;
            }
            if (snifferTypes.contains(str)) {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -2061942821) {
                    if (hashCode != 306737446) {
                        if (hashCode == 1374905797 && str.equals(KiteFlyConstants.SNIFFER_SUCCESS_METRICS)) {
                            c = 2;
                        }
                    } else if (str.equals(KiteFlyConstants.SNIFFER_FAIL_METRICS)) {
                        c = 1;
                    }
                } else if (str.equals(KiteFlyConstants.SNIFFER)) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        updateCount(KEY_SNIFFER_REPORT_COUNT, i2);
                        break;
                    case 1:
                        updateCount(KEY_SNIFFER_FAIL_REPORT_COUNT, i2);
                        break;
                    case 2:
                        updateCount(KEY_SNIFFER_SUCCESS_REPORT_COUNT, i2);
                        break;
                }
            }
            updateCount(str2, i2);
            if ("anr".equals(str)) {
                updateCount("anrReportCount", 1);
            }
        }

        public void incrementReportCount(final int i, final int i2, final String str) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df6484569eeb2e15f3792d88fee8abfa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df6484569eeb2e15f3792d88fee8abfa");
            } else if (this.mTotalSLA != null) {
                _incrementReportCount(i, i2, str);
            } else {
                this.mExecutor.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.SLACounter.MainSLA.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b01b0c3d6e415505d71f6df9b8490ebf", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b01b0c3d6e415505d71f6df9b8490ebf");
                        } else {
                            MainSLA.this._incrementReportCount(i, i2, str);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void _incrementLogTooLargeCount(int i, int i2, String str) {
            updateCount(i == 0 ? KEY_RT_LOG_TOO_LARGE : KEY_NRT_LOG_TOO_LARGE, i2);
        }

        @Override // com.meituan.android.common.kitefly.SLACounter.SLA
        public void incrementLogTooLargeCount(final int i, final int i2, final String str) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5501814f20235feaa0efe96ecd2b638d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5501814f20235feaa0efe96ecd2b638d");
            } else if (this.mTotalSLA != null) {
                _incrementLogTooLargeCount(i, i2, str);
            } else {
                this.mExecutor.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.SLACounter.MainSLA.4
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dba65102055d70e4571c4b67881d4164", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dba65102055d70e4571c4b67881d4164");
                        } else {
                            MainSLA.this._incrementLogTooLargeCount(i, i2, str);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void _incrementDBError(int i) {
            updateCount(KEY_DB_ERROR, i);
        }

        @Override // com.meituan.android.common.kitefly.SLACounter.SLA
        public void incrementDBError(final int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dc2e1be78a99fa6b331d216317a7132", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dc2e1be78a99fa6b331d216317a7132");
            } else if (this.mTotalSLA != null) {
                _incrementDBError(i);
            } else {
                this.mExecutor.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.SLACounter.MainSLA.5
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "df1372d97cd8ae59899750bc6ead5767", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "df1372d97cd8ae59899750bc6ead5767");
                        } else {
                            MainSLA.this._incrementDBError(i);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void _incrementInsertFailedMsg(int i) {
            updateCount(KEY_DB_INSERT_FAILED_COUNT, i);
        }

        @Override // com.meituan.android.common.kitefly.SLACounter.SLA
        public void incrementInsertFailedMsg(final int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c93f283560f0977533ad87d3832960e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c93f283560f0977533ad87d3832960e");
            } else if (this.mTotalSLA != null) {
                _incrementInsertFailedMsg(i);
            } else {
                this.mExecutor.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.SLACounter.MainSLA.6
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bad8cdf26cb674d769b691127132d6b5", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bad8cdf26cb674d769b691127132d6b5");
                        } else {
                            MainSLA.this._incrementInsertFailedMsg(i);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0068 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x006b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x006e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x001d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void _incrementConsumerReceiveMessage(int r9, int r10, @android.support.annotation.NonNull java.util.LinkedList<com.meituan.android.common.kitefly.Log> r11) {
            /*
                r8 = this;
                r0 = 100
                if (r9 == r0) goto L12
                switch(r9) {
                    case 0: goto Le;
                    case 1: goto La;
                    default: goto L7;
                }
            L7:
                java.lang.String r9 = "None"
                goto L15
            La:
                java.lang.String r9 = "nrtConsumerReceive"
                goto L15
            Le:
                java.lang.String r9 = "rtConsumerReceive"
                goto L15
            L12:
                java.lang.String r9 = "vipConsumerReceive"
            L15:
                java.util.Iterator r11 = r11.iterator()
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
            L1d:
                boolean r4 = r11.hasNext()
                if (r4 == 0) goto L71
                java.lang.Object r4 = r11.next()
                com.meituan.android.common.kitefly.Log r4 = (com.meituan.android.common.kitefly.Log) r4
                if (r4 == 0) goto L1d
                java.lang.String r4 = r4.tag
                r5 = -1
                int r6 = r4.hashCode()
                r7 = -2061942821(0xffffffff85193fdb, float:-7.205754E-36)
                if (r6 == r7) goto L58
                r7 = 306737446(0x12487126, float:6.324834E-28)
                if (r6 == r7) goto L4d
                r7 = 1374905797(0x51f365c5, float:1.30673058E11)
                if (r6 == r7) goto L42
                goto L63
            L42:
                java.lang.String r6 = "sniffer.success.metrics"
                boolean r4 = r4.equals(r6)
                if (r4 == 0) goto L63
                r4 = 2
                goto L64
            L4d:
                java.lang.String r6 = "sniffer.fail.metrics"
                boolean r4 = r4.equals(r6)
                if (r4 == 0) goto L63
                r4 = 1
                goto L64
            L58:
                java.lang.String r6 = "sniffer"
                boolean r4 = r4.equals(r6)
                if (r4 == 0) goto L63
                r4 = 0
                goto L64
            L63:
                r4 = -1
            L64:
                switch(r4) {
                    case 0: goto L6e;
                    case 1: goto L6b;
                    case 2: goto L68;
                    default: goto L67;
                }
            L67:
                goto L1d
            L68:
                int r3 = r3 + 1
                goto L1d
            L6b:
                int r2 = r2 + 1
                goto L1d
            L6e:
                int r1 = r1 + 1
                goto L1d
            L71:
                if (r1 == 0) goto L79
                java.lang.String r11 = "snifferConsumerReceive"
                r8.updateCount(r11, r1)
            L79:
                if (r2 == 0) goto L81
                java.lang.String r11 = "snifferFailConsumerReceive"
                r8.updateCount(r11, r2)
            L81:
                if (r3 == 0) goto L89
                java.lang.String r11 = "snifferSuccessConsumerReceive"
                r8.updateCount(r11, r3)
            L89:
                r8.updateCount(r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.kitefly.SLACounter.MainSLA._incrementConsumerReceiveMessage(int, int, java.util.LinkedList):void");
        }

        @Override // com.meituan.android.common.kitefly.SLACounter.SLA
        public void onConsumerReceiveMessages(@NonNull final LinkedList<Log> linkedList) {
            Object[] objArr = {linkedList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b95be5698a555400685906a989871619", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b95be5698a555400685906a989871619");
                return;
            }
            final int i = linkedList.get(0).status;
            final int size = linkedList.size();
            ILogger iLogger = this.mLogger;
            Object[] objArr2 = new Object[2];
            objArr2[0] = Boolean.valueOf(i == 0);
            objArr2[1] = Integer.valueOf(size);
            iLogger.d("onConsumerReceiveMessage: ", objArr2);
            if (this.mTotalSLA != null) {
                _incrementConsumerReceiveMessage(i, size, linkedList);
            } else {
                this.mExecutor.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.SLACounter.MainSLA.7
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6bcbedb9e9ca9cd36e470a1f57731b10", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6bcbedb9e9ca9cd36e470a1f57731b10");
                        } else {
                            MainSLA.this._incrementConsumerReceiveMessage(i, size, linkedList);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void _incrementSave2DB(int i, int i2) {
            updateCount(i == 100 ? KEY_VIP_SAVE2_DB : KEY_SAVE2_DB, i2);
        }

        @Override // com.meituan.android.common.kitefly.SLACounter.SLA
        public void onMessageSave2DB(@NonNull LinkedList<Log> linkedList) {
            Object[] objArr = {linkedList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ddd67d6d6b274606b28c94a4bc53e6b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ddd67d6d6b274606b28c94a4bc53e6b");
                return;
            }
            final int size = linkedList.size();
            if (size == 0) {
                return;
            }
            final int i = linkedList.get(0).status;
            if (this.mTotalSLA != null) {
                _incrementSave2DB(i, size);
            } else {
                this.mExecutor.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.SLACounter.MainSLA.8
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "46b957a11f5d2ff90ed57bfea9773d60", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "46b957a11f5d2ff90ed57bfea9773d60");
                        } else {
                            MainSLA.this._incrementSave2DB(i, size);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void _incrementRT2DB(int i) {
            updateCount(KEY_RT_2DB_COUNT, i);
        }

        @Override // com.meituan.android.common.kitefly.SLACounter.SLA
        public void onRTMessageSaveToDB(@NonNull LinkedList<Log> linkedList) {
            Object[] objArr = {linkedList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "431a01e655a37653a8dd7340708ea382", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "431a01e655a37653a8dd7340708ea382");
                return;
            }
            final int size = linkedList.size();
            if (this.mTotalSLA != null) {
                _incrementRT2DB(size);
            } else {
                this.mExecutor.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.SLACounter.MainSLA.9
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "54377e00d92b743871dd47e50dc812be", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "54377e00d92b743871dd47e50dc812be");
                        } else {
                            MainSLA.this._incrementRT2DB(size);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void _incrementRTMsgToReporter(int i) {
            updateCount(KEY_RT_TO_REPORTER, i);
        }

        @Override // com.meituan.android.common.kitefly.SLACounter.SLA
        public void onRTMessageToReporter(@NonNull LinkedList<Log> linkedList) {
            Object[] objArr = {linkedList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5caf753c31b068977f8dee64a40ec643", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5caf753c31b068977f8dee64a40ec643");
                return;
            }
            final int size = linkedList.size();
            if (this.mTotalSLA != null) {
                _incrementRTMsgToReporter(size);
            } else {
                this.mExecutor.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.SLACounter.MainSLA.10
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "21eb35b2a1d9c51d4fd21a1f87bfe274", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "21eb35b2a1d9c51d4fd21a1f87bfe274");
                        } else {
                            MainSLA.this._incrementRTMsgToReporter(size);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:50:0x006e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0070 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0072 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0024 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void _incrementMemoryMessageCount(int r11, int r12, @android.support.annotation.NonNull java.util.LinkedList<com.meituan.android.common.kitefly.Log> r13) {
            /*
                r10 = this;
                r0 = 100
                if (r11 == r0) goto L12
                switch(r11) {
                    case 0: goto Le;
                    case 1: goto La;
                    default: goto L7;
                }
            L7:
                java.lang.String r11 = "None"
                goto L15
            La:
                java.lang.String r11 = "loseNRTCount"
                goto L15
            Le:
                java.lang.String r11 = "loseRTCount"
                goto L15
            L12:
                java.lang.String r11 = "loseVIPCount"
            L15:
                r0 = -1
                r1 = 1
                if (r12 <= 0) goto L1b
                r2 = 1
                goto L1c
            L1b:
                r2 = -1
            L1c:
                java.util.Iterator r13 = r13.iterator()
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
            L24:
                boolean r7 = r13.hasNext()
                if (r7 == 0) goto L74
                java.lang.Object r7 = r13.next()
                com.meituan.android.common.kitefly.Log r7 = (com.meituan.android.common.kitefly.Log) r7
                if (r7 == 0) goto L24
                java.lang.String r7 = r7.tag
                int r8 = r7.hashCode()
                r9 = -2061942821(0xffffffff85193fdb, float:-7.205754E-36)
                if (r8 == r9) goto L5e
                r9 = 306737446(0x12487126, float:6.324834E-28)
                if (r8 == r9) goto L53
                r9 = 1374905797(0x51f365c5, float:1.30673058E11)
                if (r8 == r9) goto L48
                goto L69
            L48:
                java.lang.String r8 = "sniffer.success.metrics"
                boolean r7 = r7.equals(r8)
                if (r7 == 0) goto L69
                r7 = 2
                goto L6a
            L53:
                java.lang.String r8 = "sniffer.fail.metrics"
                boolean r7 = r7.equals(r8)
                if (r7 == 0) goto L69
                r7 = 1
                goto L6a
            L5e:
                java.lang.String r8 = "sniffer"
                boolean r7 = r7.equals(r8)
                if (r7 == 0) goto L69
                r7 = 0
                goto L6a
            L69:
                r7 = -1
            L6a:
                switch(r7) {
                    case 0: goto L72;
                    case 1: goto L70;
                    case 2: goto L6e;
                    default: goto L6d;
                }
            L6d:
                goto L24
            L6e:
                int r6 = r6 + r2
                goto L24
            L70:
                int r5 = r5 + r2
                goto L24
            L72:
                int r4 = r4 + r2
                goto L24
            L74:
                if (r4 == 0) goto L7c
                java.lang.String r13 = "loseSnifferCount"
                r10.updateCount(r13, r4)
            L7c:
                if (r5 == 0) goto L84
                java.lang.String r13 = "loseSnifferFailCount"
                r10.updateCount(r13, r5)
            L84:
                if (r6 == 0) goto L8c
                java.lang.String r13 = "loseSnifferSuccessCount"
                r10.updateCount(r13, r6)
            L8c:
                r10.updateCount(r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.kitefly.SLACounter.MainSLA._incrementMemoryMessageCount(int, int, java.util.LinkedList):void");
        }

        @Override // com.meituan.android.common.kitefly.SLACounter.SLA
        public void incrementMemoryMessageCount(final int i, final int i2, @NonNull final LinkedList<Log> linkedList) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), linkedList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b08ff61723d1083edf38ba362a3812d8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b08ff61723d1083edf38ba362a3812d8");
            } else if (this.mTotalSLA != null) {
                _incrementMemoryMessageCount(i, i2, linkedList);
            } else {
                this.mExecutor.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.SLACounter.MainSLA.11
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e9679f4e91f82b3a819d665cb6f8bf73", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e9679f4e91f82b3a819d665cb6f8bf73");
                        } else {
                            MainSLA.this._incrementMemoryMessageCount(i, i2, linkedList);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void _incrementRTNetThreadCount(int i) {
            updateCount(KEY_RT_NET_THREAD_SUCCESS_COUNT, i);
        }

        @Override // com.meituan.android.common.kitefly.SLACounter.SLA
        public void onRTNetSuccess(@NonNull LinkedList<Log> linkedList) {
            Object[] objArr = {linkedList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6134e5829c01a9c1ac38b0e076bc9116", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6134e5829c01a9c1ac38b0e076bc9116");
                return;
            }
            final int size = linkedList.size();
            if (this.mTotalSLA != null) {
                _incrementRTNetThreadCount(size);
            } else {
                this.mExecutor.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.SLACounter.MainSLA.12
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f4c3c7bca715c9188c1b1780a72b3509", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f4c3c7bca715c9188c1b1780a72b3509");
                        } else {
                            MainSLA.this._incrementRTNetThreadCount(size);
                        }
                    }
                });
            }
        }

        @Override // com.meituan.android.common.kitefly.SLACounter.SLA
        public void report() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d90d124c385bde662beebf6eab48421f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d90d124c385bde662beebf6eab48421f");
            } else if (this.mReporting.compareAndSet(false, true)) {
                try {
                    if (NetWorkUtils.isNetworkConnected(this.mContext)) {
                        reportTotalSLASync();
                    } else {
                        this.mLogger.i("should upload sla info, but no internet connected. return");
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        @Override // com.meituan.android.common.kitefly.SLACounter.SLA
        public void incrementMetricsCount(final int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bbb4ae6670fe541d5a8dbc8c7da6ee4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bbb4ae6670fe541d5a8dbc8c7da6ee4");
            } else if (this.mTotalSLA != null) {
                updateCount(KEY_METRICS, i);
            } else {
                this.mExecutor.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.SLACounter.MainSLA.13
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8e342edf4d2a3866b8b63621469ce9b3", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8e342edf4d2a3866b8b63621469ce9b3");
                        } else {
                            MainSLA.this.updateCount(MainSLA.KEY_METRICS, i);
                        }
                    }
                });
            }
        }

        private void reportTotalSLASync() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67793f5721ddae98e29a34daf44ff4cc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67793f5721ddae98e29a34daf44ff4cc");
                return;
            }
            ensureSLA();
            JsonObject jsonObject = new JsonObject();
            synchronized (this) {
                if (this.mFirstSLAInfo == null) {
                    return;
                }
                jsonObject.addProperty("raw", this.mFirstSLAInfo.toString());
                jsonObject.addProperty("logUUId", KiteFly.getUUID32());
                JsonArray jsonArray = new JsonArray();
                jsonArray.add(jsonObject);
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.add("events", jsonArray);
                jsonObject2.addProperty("category", "babel-statistics-android");
                jsonObject2.addProperty("category_type", "fe_perf");
                jsonObject2.addProperty("os", "Android");
                jsonObject2.addProperty("osVersion", Build.VERSION.RELEASE);
                jsonObject2.addProperty("sdkVersion", "4.7.24.2-waimai");
                jsonObject2.addProperty("appVersion", Babel.getBabelConfig().getAppVersion());
                jsonObject2.addProperty(NetLogConstants.Environment.DEVICE_PROVIDER, Build.MANUFACTURER);
                jsonObject2.addProperty("deviceType", Build.MODEL);
                jsonObject2.addProperty("token", Babel.getBabelConfig().getToken());
                jsonObject2.addProperty("babelid", Babel.getBabelConfig().getUuid());
                jsonObject2.addProperty(NetLogConstants.Environment.MCC_MNC, com.meituan.android.common.metricx.utils.NetWorkUtils.getMccmnc(this.mContext));
                jsonObject2.addProperty("ts", Long.valueOf(TimeUtil.currentTimeMillisSNTP()));
                jsonObject2.addProperty("token", Babel.getBabelConfig().getToken());
                jsonObject2.addProperty(NetLogConstants.Environment.BUILD_VERSION, Babel.getBabelConfig().getBuildVersion());
                jsonObject2.addProperty("deviceLevel", DeviceUtil.getDeviceLevel(this.mContext).toString());
                String obtainPackageName = ApkUtil.obtainPackageName(this.mContext);
                if (!TextUtils.isEmpty(obtainPackageName) && !TextUtils.equals(obtainPackageName, StringUtil.NULL)) {
                    jsonObject2.addProperty("app", obtainPackageName);
                }
                try {
                    z a = Reporter.getOkHttpClient().a(new x.a().a(this.slaUrl.getUrl()).a("POST", y.create(u.a(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON), jsonObject2.toString())).a()).a();
                    if (Reporter.isOk(a)) {
                        this.mLogger.d("total sla info upload success, and reset sla total counter");
                        synchronized (this) {
                            for (String str : this.mFirstSLAInfo.keySet()) {
                                if (!"is_first".equals(str)) {
                                    this.mTotalSLA.a(str, Math.max(this.mTotalSLA.b(str, 0) - this.mFirstSLAInfo.get(str).getAsInt(), 0));
                                }
                            }
                            this.mFirstSLAInfo = null;
                        }
                    } else {
                        this.mLogger.e("total sla info upload failed: ", Integer.valueOf(a.c));
                    }
                    a.g.close();
                } catch (IOException e) {
                    this.mLogger.i("report total sla info, net error(should ignore): ", e);
                }
            }
        }
    }
}
