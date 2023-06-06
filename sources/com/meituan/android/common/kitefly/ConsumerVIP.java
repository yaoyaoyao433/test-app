package com.meituan.android.common.kitefly;

import android.content.Context;
import android.support.annotation.AnyThread;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.kitefly.Consumer;
import com.meituan.android.common.kitefly.Reporter;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ConsumerVIP extends Consumer {
    private static final int DB_REPORT = 20;
    private static final String TAG = "ConsumerVIP";
    private static final int VIP_INSERT_LENGTH = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @NonNull
    private static Set<String> sVIPTypes;
    private final LogCacher mCacher;
    private final CatchException mCatchException;
    private final Context mContext;
    private final AtomicInteger mDBCount;
    private volatile boolean mIsForeground;
    private final Consumer.WatchDogRunnable mOnStopAction;
    private final AtomicBoolean mRelaySending;
    private final Reporter mReporter;
    private final Consumer.WatchDogRunnable mScheduleReportAction;
    private ScheduledFuture<?> mTimeOutFeature;
    private final Consumer.WatchDogRunnable mTimeoutAction;
    @GuardedBy("this")
    private LinkedList<Log> mVIPLogPool;
    private final AtomicBoolean mWaitingReporting;
    private final AtomicBoolean mWaitingTimeout;

    static {
        HashSet hashSet = new HashSet();
        sVIPTypes = hashSet;
        hashSet.add(Constants.COLD_LAUNCH_METER);
        sVIPTypes.add(Constants.CUSTOM_SPEED_METER);
        sVIPTypes.add(Constants.PAGE_LOAD_METER);
        sVIPTypes.add(Constants.FPS_SCROLL_AVG);
        sVIPTypes.add(Constants.FPS_CUSTOM_AVG);
        sVIPTypes.add(Constants.FPS_PAGE_AVG);
        sVIPTypes.add(Constants.MEMORY_V2);
        sVIPTypes.add(Constants.CPU_V2);
        sVIPTypes.add(Constants.CPU_PROCESS);
        sVIPTypes.add(Constants.MEMORY_PROCESS);
        sVIPTypes.add(Constants.TRAFFIC_DAILY_TOTAL_STREAM);
        sVIPTypes.add("env");
        sVIPTypes.add("anr");
        sVIPTypes.add("cold_startup");
        sVIPTypes.add("page_load_time");
        sVIPTypes.add(Constants.EXIT_INFO_TYPE);
        sVIPTypes.add("babel-vip-test");
    }

    @AnyThread
    public static boolean inVIP(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c01641e82ccd562cf409a4d3f9ddc1a0", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c01641e82ccd562cf409a4d3f9ddc1a0")).booleanValue() : sVIPTypes.contains(str);
    }

    public ConsumerVIP(@NonNull Context context) {
        super(KiteFlyConstants.VIP_NAME, context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43a93f460d58495fc620feeb626adc41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43a93f460d58495fc620feeb626adc41");
            return;
        }
        this.mIsForeground = true;
        this.mVIPLogPool = new LinkedList<>();
        this.mWaitingTimeout = new AtomicBoolean(false);
        this.mTimeOutFeature = null;
        this.mDBCount = new AtomicInteger();
        this.mWaitingReporting = new AtomicBoolean(false);
        this.mRelaySending = new AtomicBoolean(false);
        this.mCatchException = new CatchException("VIP-Error", 5, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        this.mTimeoutAction = new Consumer.WatchDogRunnable("ConsumerVIP#TimeOutAction") { // from class: com.meituan.android.common.kitefly.ConsumerVIP.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.kitefly.Consumer.WatchDogRunnable
            public void watchAction() {
                LinkedList linkedList;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "77834e02ee580250ac061702479ff694", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "77834e02ee580250ac061702479ff694");
                    return;
                }
                ConsumerVIP.this.cancelTimeout();
                ConsumerVIP.this.mWaitingTimeout.set(false);
                synchronized (ConsumerVIP.this) {
                    linkedList = ConsumerVIP.this.mVIPLogPool;
                    ConsumerVIP.this.mVIPLogPool = new LinkedList();
                }
                if (!linkedList.isEmpty()) {
                    ConsumerVIP.this.mainProcessSave2DB(linkedList);
                }
                ConsumerVIP.this.scheduleReport();
            }
        };
        this.mScheduleReportAction = new Consumer.WatchDogRunnable("ConsumerVIP#ScheduleReport") { // from class: com.meituan.android.common.kitefly.ConsumerVIP.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.kitefly.Consumer.WatchDogRunnable
            public void watchAction() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4d4e3018fbcdc0f0f752088d40c4774f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4d4e3018fbcdc0f0f752088d40c4774f");
                } else {
                    ConsumerVIP.this.scheduleReport();
                }
            }
        };
        this.mOnStopAction = new Consumer.WatchDogRunnable("ConsumerVIP#OnStop") { // from class: com.meituan.android.common.kitefly.ConsumerVIP.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.kitefly.Consumer.WatchDogRunnable
            public void watchAction() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e4f877d5141644767e655e9ddcde4778", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e4f877d5141644767e655e9ddcde4778");
                    return;
                }
                ConsumerVIP.this.fetchUIMessageQueue();
                ConsumerVIP.this.mTimeoutAction.run();
            }
        };
        this.mContext = context;
        this.mCacher = new LogCacher(context, "metrics.db", SnifferDBHelper.COLUMN_LOG);
        this.mReporter = new Reporter(KiteFlyConstants.VIP_NAME);
    }

    @Override // com.meituan.android.common.kitefly.Consumer
    public void addLog(@NonNull Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a01143ad6f64af09bf3564786c1789bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a01143ad6f64af09bf3564786c1789bb");
            return;
        }
        log.status = 100;
        super.addLog(log);
    }

    public void addVIPLog(@NonNull Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "450b4d0919d00220c502f31e53223871", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "450b4d0919d00220c502f31e53223871");
            return;
        }
        log.status = 100;
        handleVipMessage(log);
    }

    private void save2DB(@NonNull LinkedList<Log> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0dcf9e81cb83b500ba9a4e0803089bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0dcf9e81cb83b500ba9a4e0803089bd");
        } else if (this.mCacher.insertLogs(linkedList)) {
        } else {
            SLACounter.getInstance().incrementInsertFailedMsg(linkedList.size());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a43937afe22b7248240a47bda26ecc2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a43937afe22b7248240a47bda26ecc2d");
        } else if (this.mTimeOutFeature != null) {
            this.mTimeOutFeature.cancel(false);
        }
    }

    @Override // com.meituan.android.common.kitefly.Consumer
    public void handleMessageInner(@NonNull LinkedList<Log> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c7160470455b183f2ba29bda18dc667", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c7160470455b183f2ba29bda18dc667");
            return;
        }
        completeMessages(linkedList);
        if (ProcessUtils.isMainProcess(this.mContext)) {
            SLACounter.getInstance().incrementMemoryMessageCount(100, linkedList.size(), linkedList);
            handleMainMessage(linkedList);
            return;
        }
        save2DB(linkedList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mainProcessSave2DB(@NonNull LinkedList<Log> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cff1cc00c527204c2258a2df339c7f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cff1cc00c527204c2258a2df339c7f4");
            return;
        }
        save2DB(linkedList);
        SLACounter.getInstance().incrementMemoryMessageCount(100, -linkedList.size(), linkedList);
        SLACounter.getInstance().onMessageSave2DB(linkedList);
        this.mDBCount.addAndGet(linkedList.size());
    }

    private void handleMainMessage(@NonNull LinkedList<Log> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba8639820d3bd5fd89975f23fb647e77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba8639820d3bd5fd89975f23fb647e77");
            return;
        }
        synchronized (this) {
            this.mVIPLogPool.addAll(linkedList);
            if (this.mVIPLogPool.size() > 0) {
                mainProcessSave2DB(this.mVIPLogPool);
                this.mVIPLogPool = new LinkedList<>();
            } else if (!this.mIsForeground) {
                mainProcessSave2DB(this.mVIPLogPool);
                this.mVIPLogPool = new LinkedList<>();
            }
            if (this.mWaitingTimeout.compareAndSet(false, true)) {
                cancelTimeout();
                this.mTimeOutFeature = scheduleConsumerThreadAction(this.mTimeoutAction, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            }
        }
        if (this.mDBCount.get() > 20) {
            scheduleReport();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0418084ec4afe23e23113c4e890394eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0418084ec4afe23e23113c4e890394eb");
        } else if (ProcessUtils.isMainProcess(this.mContext) && NetWorkUtils.isNetworkConnected(this.mContext)) {
            if (this.mWaitingReporting.compareAndSet(false, true)) {
                this.mReporter.scheduleReportAction(new Runnable() { // from class: com.meituan.android.common.kitefly.ConsumerVIP.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2ad1d1d9151e96aa158a8378bc53aea4", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2ad1d1d9151e96aa158a8378bc53aea4");
                            return;
                        }
                        try {
                            ConsumerVIP.this.mRelaySending.set(false);
                            ConsumerVIP.this.reportInNetThread();
                        } catch (Throwable th) {
                            try {
                                ConsumerVIP.this.mCatchException.reportException(th);
                                ConsumerVIP.this.mWaitingReporting.set(false);
                                if (!ConsumerVIP.this.mRelaySending.get()) {
                                }
                            } finally {
                                ConsumerVIP.this.mWaitingReporting.set(false);
                                if (ConsumerVIP.this.mRelaySending.get()) {
                                    ConsumerVIP.this.scheduleConsumerThreadAction(ConsumerVIP.this.mScheduleReportAction);
                                }
                            }
                        }
                    }
                });
            } else {
                this.mRelaySending.set(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportInNetThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17443c44080b769189771da76952eb47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17443c44080b769189771da76952eb47");
            return;
        }
        this.mReporter.scheduleReport(this.mCacher.queryLogs(), this.mContext, new Reporter.SingleReportListener() { // from class: com.meituan.android.common.kitefly.ConsumerVIP.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.kitefly.Reporter.SingleReportListener
            public void onReportSucceed(LinkedList<Log> linkedList, int i) {
                Object[] objArr2 = {linkedList, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2109011ca7810d0870468ab2cdffcc49", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2109011ca7810d0870468ab2cdffcc49");
                    return;
                }
                ConsumerVIP.this.mCacher.deleteUploadedLog(linkedList);
                SLACounter.getInstance().onReportSuccess(linkedList, false);
                if (ConsumerVIP.this.mDBCount.addAndGet(-linkedList.size()) < 0) {
                    ConsumerVIP.this.mDBCount.set(0);
                }
            }

            @Override // com.meituan.android.common.kitefly.Reporter.SingleReportListener
            public void onReportFail(LinkedList<Log> linkedList, int i) {
                Object[] objArr2 = {linkedList, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "633c2a67f3cec3602457bf2d87e87a29", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "633c2a67f3cec3602457bf2d87e87a29");
                    return;
                }
                if (i == 413) {
                    ConsumerVIP.this.mCacher.deleteUploadedLog(linkedList);
                    ConsumerVIP.this.mCatchException.reportException(new RuntimeException("httpCode=" + i + " type: " + linkedList.get(0).tag));
                }
            }
        });
    }

    private void handleVipMessage(Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46fa3b07cfdb292593a81ee3867ebb6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46fa3b07cfdb292593a81ee3867ebb6d");
            return;
        }
        fetchUIMessageQueue();
        super.handleMessage(new LinkedList<>(Collections.singleton(log)));
    }

    @AnyThread
    public void refreshLog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d07692c659d01ce00c9bc108aa2b7ac8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d07692c659d01ce00c9bc108aa2b7ac8");
        } else {
            scheduleConsumerThreadAction(this.mOnStopAction);
        }
    }

    public void setForegroundStatus(boolean z) {
        this.mIsForeground = z;
    }

    public void triggerReportOnStopped() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "545ec7de2beba7202b56cfc93254f0b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "545ec7de2beba7202b56cfc93254f0b3");
        } else {
            scheduleConsumerThreadAction(this.mOnStopAction);
        }
    }
}
