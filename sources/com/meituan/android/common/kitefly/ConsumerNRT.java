package com.meituan.android.common.kitefly;

import android.content.Context;
import android.support.annotation.AnyThread;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import com.meituan.android.common.kitefly.Consumer;
import com.meituan.android.common.kitefly.Reporter;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ConsumerNRT extends Consumer {
    private static final int NRT_DB_REPORT_THRESHOLD = 20;
    public static long NRT_MERGE_INTERVAL_MS = 2000;
    private static final long NRT_MESSAGE_DELAY_MAX_MS = 2000;
    private static final int NRT_MESSAGE_INSERT_LENGTH = 20;
    private static final String TAG = "ConsumerNRT";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final LogCacher mCacher;
    private final CatchException mCatchNrtNetException;
    @NonNull
    private final Context mContext;
    private final Consumer.WatchDogRunnable mFetchUIMessageQueueAndSave2DBAction;
    private final ILogger mLogger;
    @GuardedBy("this")
    private LinkedList<Log> mNRTLogPool;
    private final Consumer.WatchDogRunnable mReadAndReportAction;
    private final AtomicBoolean mRelaySend;
    private final Reporter mReporter;
    private ScheduledFuture<?> mTimeOutFuture;
    private final Consumer.WatchDogRunnable mTimeoutAction;
    private final AtomicBoolean mWaitingNetComplete;
    private final AtomicBoolean mWaitingTimeout;

    public ConsumerNRT(@NonNull Context context) {
        super(KiteFlyConstants.NRT_NAME, context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d1765c09db7dbfb7ff79f6bedeada3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d1765c09db7dbfb7ff79f6bedeada3e");
            return;
        }
        this.mNRTLogPool = new FirstLinkedList();
        this.mWaitingTimeout = new AtomicBoolean(false);
        this.mWaitingNetComplete = new AtomicBoolean(false);
        this.mRelaySend = new AtomicBoolean(false);
        this.mCatchNrtNetException = new CatchException("ConsumerNRT-netException", 5, 1000L);
        this.mTimeoutAction = new Consumer.WatchDogRunnable("ConsumerNRT#TimeoutAction") { // from class: com.meituan.android.common.kitefly.ConsumerNRT.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.kitefly.Consumer.WatchDogRunnable
            public void watchAction() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "196dac554de6abe1656d4d52aea06d78", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "196dac554de6abe1656d4d52aea06d78");
                    return;
                }
                ConsumerNRT.this.mLogger.d(ConsumerNRT.TAG, "message timeout");
                ConsumerNRT.this.actionLogPool2DBAndReport();
                ConsumerNRT.this.mWaitingTimeout.set(false);
            }
        };
        this.mFetchUIMessageQueueAndSave2DBAction = new Consumer.WatchDogRunnable("ConsumerNRT#actionLogPool2DB") { // from class: com.meituan.android.common.kitefly.ConsumerNRT.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.kitefly.Consumer.WatchDogRunnable
            public void watchAction() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "05bfd7c61f088089351b30839f99e874", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "05bfd7c61f088089351b30839f99e874");
                    return;
                }
                TypeConfig.getsInstance().fetch();
                ConsumerNRT.this.fetchUIMessageQueue();
                ConsumerNRT.this.actionLogPool2DBAndReport();
            }
        };
        this.mReadAndReportAction = new Consumer.WatchDogRunnable("ConsumerNRT#readAndReport") { // from class: com.meituan.android.common.kitefly.ConsumerNRT.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.kitefly.Consumer.WatchDogRunnable
            public void watchAction() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "623c1873951488ab2f455022f92168c9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "623c1873951488ab2f455022f92168c9");
                } else {
                    ConsumerNRT.this.scheduleReadAndReport();
                }
            }
        };
        this.mLogger = Logger.getBabelLogger();
        this.mContext = context;
        this.mReporter = new Reporter(KiteFlyConstants.NRT_NAME);
        this.mCacher = new LogCacher(context, "kitefly.db", SnifferDBHelper.COLUMN_LOG);
    }

    @Override // com.meituan.android.common.kitefly.Consumer
    public void handleMessageInner(@NonNull LinkedList<Log> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cf36917e9adc08d1bf5c06579168fe3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cf36917e9adc08d1bf5c06579168fe3");
            return;
        }
        completeMessages(linkedList);
        if (ProcessUtils.isMainProcess(this.mContext)) {
            handleMainMessage(linkedList);
        } else {
            handleNoMainMessage(linkedList);
        }
    }

    private void handleNoMainMessage(@NonNull LinkedList<Log> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ed8dae0688247af84a87f94ff1e1bf2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ed8dae0688247af84a87f94ff1e1bf2");
        } else {
            saveMessage2ToDB(linkedList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void actionLogPool2DBAndReport() {
        LinkedList<Log> linkedList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cd74eff9e8f9e4a8f3c0ae17cecaf6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cd74eff9e8f9e4a8f3c0ae17cecaf6a");
            return;
        }
        synchronized (this) {
            linkedList = this.mNRTLogPool;
            this.mNRTLogPool = new LinkedList<>();
        }
        if (linkedList.size() > 0) {
            nrtSave2DB(linkedList);
        }
        cancelNRTInsertTimeOut();
        scheduleReadAndReport();
    }

    @AnyThread
    public void refreshLogPool() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a7f50855b621c2f5050957b6b19d7e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a7f50855b621c2f5050957b6b19d7e8");
        } else {
            scheduleConsumerThreadAction(this.mFetchUIMessageQueueAndSave2DBAction);
        }
    }

    public void saveMessage2ToDB(@NonNull LinkedList<Log> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1688121e28c275f617fb3a18d2c90336", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1688121e28c275f617fb3a18d2c90336");
            return;
        }
        if (!ProcessUtils.isMainProcess(this.mContext)) {
            Iterator<Log> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().innerProperty.isMainProcess = false;
            }
        }
        SLACounter.getInstance().onMessageSave2DB(linkedList);
        if (this.mCacher.insertLogs(linkedList)) {
            return;
        }
        SLACounter.getInstance().incrementInsertFailedMsg(linkedList.size());
    }

    private void nrtSave2DB(LinkedList<Log> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d17a3a0e4b82c933d564dc07e3002ec7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d17a3a0e4b82c933d564dc07e3002ec7");
            return;
        }
        saveMessage2ToDB(linkedList);
        SLACounter.getInstance().incrementMemoryMessageCount(1, -linkedList.size(), linkedList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleReadAndReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c585b61fecea80bf9913a5ef28ad7d12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c585b61fecea80bf9913a5ef28ad7d12");
        } else if (NetWorkUtils.isNetworkConnected(this.mContext) && ProcessUtils.isMainProcess(this.mContext)) {
            if (this.mWaitingNetComplete.compareAndSet(false, true)) {
                final LinkedList<Log> queryLogs = this.mCacher.queryLogs();
                synchronized (this) {
                    if (queryLogs.size() == 0) {
                        this.mWaitingNetComplete.set(false);
                        this.mRelaySend.set(false);
                        return;
                    }
                    this.mReporter.scheduleReportAction(new Runnable() { // from class: com.meituan.android.common.kitefly.ConsumerNRT.4
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f8ce9bd46a2f95de20965ca57d189389", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f8ce9bd46a2f95de20965ca57d189389");
                                return;
                            }
                            LinkedList<Log> linkedList = new LinkedList<>();
                            ConsumerNRT.this.pickLimitedLogs(queryLogs, linkedList);
                            ConsumerNRT.this.mReporter.executeReportSync(linkedList, new Reporter.SingleReportListener() { // from class: com.meituan.android.common.kitefly.ConsumerNRT.4.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.meituan.android.common.kitefly.Reporter.SingleReportListener
                                public void onReportSucceed(LinkedList<Log> linkedList2, int i) {
                                    Object[] objArr3 = {linkedList2, Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "3425427670bb1fbe8a4d18a858eca297", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "3425427670bb1fbe8a4d18a858eca297");
                                        return;
                                    }
                                    ConsumerNRT.this.mCacher.deleteUploadedLog(linkedList2);
                                    SLACounter.getInstance().onReportSuccess(linkedList2, false);
                                }

                                @Override // com.meituan.android.common.kitefly.Reporter.SingleReportListener
                                public void onReportFail(LinkedList<Log> linkedList2, int i) {
                                    Object[] objArr3 = {linkedList2, Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f77787c83596928dbb38bd35cc4cd7f5", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f77787c83596928dbb38bd35cc4cd7f5");
                                        return;
                                    }
                                    if (i == 413) {
                                        ConsumerNRT.this.mCacher.deleteUploadedLog(linkedList2);
                                        ConsumerNRT.this.mReporter.handleOversizeLog(linkedList2, i);
                                    }
                                }
                            });
                            if (queryLogs.size() > 0) {
                                ConsumerNRT.this.mReporter.scheduleReportAction(this, ConsumerNRT.NRT_MERGE_INTERVAL_MS);
                                return;
                            }
                            ConsumerNRT.this.mWaitingNetComplete.set(false);
                            if (ConsumerNRT.this.mRelaySend.get()) {
                                ConsumerNRT.this.mRelaySend.set(false);
                                ConsumerNRT.this.scheduleConsumerThreadAction(ConsumerNRT.this.mReadAndReportAction);
                            }
                        }
                    }, NRT_MERGE_INTERVAL_MS);
                    return;
                }
            }
            this.mRelaySend.set(true);
        }
    }

    private void cancelNRTInsertTimeOut() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "566e269e2e9bf521b66152cb35f6c00f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "566e269e2e9bf521b66152cb35f6c00f");
            return;
        }
        if (this.mTimeOutFuture != null) {
            this.mTimeOutFuture.cancel(false);
        }
        this.mWaitingTimeout.set(false);
    }

    private void handleMainMessage(@NonNull LinkedList<Log> linkedList) {
        boolean z;
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe0f99f8816f688ec8658f68c830672e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe0f99f8816f688ec8658f68c830672e");
            return;
        }
        synchronized (this) {
            this.mNRTLogPool.addAll(linkedList);
            SLACounter.getInstance().incrementMemoryMessageCount(1, linkedList.size(), linkedList);
            if (this.mNRTLogPool.size() > 20) {
                nrtSave2DB(this.mNRTLogPool);
                cancelNRTInsertTimeOut();
                this.mNRTLogPool = new LinkedList<>();
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            scheduleReadAndReport();
            return;
        }
        if (this.mWaitingTimeout.compareAndSet(false, true)) {
            this.mTimeOutFuture = scheduleConsumerThreadAction(this.mTimeoutAction, 2000L);
        }
        if (this.mCacher.queryCounts() > 20 || NetWorkUtils.isNetworkConnected(this.mContext)) {
            scheduleReadAndReport();
        }
    }
}
