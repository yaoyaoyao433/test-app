package com.meituan.android.common.kitefly;

import android.content.Context;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.kitefly.Consumer;
import com.meituan.android.common.kitefly.Reporter;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.NetWorkUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ConsumerRT extends Consumer {
    public static long RT_MERGE_INTERVAL_MS = 1000;
    private static final int RT_MESSAGE_ALERT_LENGTH = 200;
    private static final String TAG = "ConsumerRT";
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile boolean isBackground;
    @Nullable
    private TimeOutWatchDogAction mBgAction;
    private final Context mContext;
    private final Consumer.WatchDogRunnable mForceSaveAction;
    private final ConsumerNRT mNRT;
    private final CatchException mOtherException;
    @GuardedBy("this")
    private LinkedList<Log> mRTLogPool;
    private final CatchException mRTMessageLengthException;
    private final AtomicBoolean mRelaySend;
    private final Reporter mReporter;
    @GuardedBy("this")
    private LinkedList<Log> mReportingLogPool;
    private final Consumer.WatchDogRunnable mToggleRtReportAction;
    private final AtomicBoolean mWaitingNetComplete;
    private final AtomicBoolean mWaitingOneSecond;

    public ConsumerRT(@NonNull ConsumerNRT consumerNRT, @NonNull Context context) {
        super(KiteFlyConstants.RT_NAME, context);
        Object[] objArr = {consumerNRT, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6827f497c4106c3ed3611c82b217acc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6827f497c4106c3ed3611c82b217acc");
            return;
        }
        this.isBackground = true;
        this.mRTLogPool = new FirstLinkedList();
        this.mReportingLogPool = new LinkedList<>();
        this.mWaitingNetComplete = new AtomicBoolean(false);
        this.mWaitingOneSecond = new AtomicBoolean(false);
        this.mRelaySend = new AtomicBoolean(false);
        this.mToggleRtReportAction = new Consumer.WatchDogRunnable("ConsumerRT#MaxDelayAction") { // from class: com.meituan.android.common.kitefly.ConsumerRT.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.kitefly.Consumer.WatchDogRunnable
            public void watchAction() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bab19b7d989ad4493487aac73fbfbe81", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bab19b7d989ad4493487aac73fbfbe81");
                } else {
                    ConsumerRT.this.toggleRtReport();
                }
            }
        };
        this.mForceSaveAction = new Consumer.WatchDogRunnable("ConsumerRT#OnStop") { // from class: com.meituan.android.common.kitefly.ConsumerRT.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.kitefly.Consumer.WatchDogRunnable
            public void watchAction() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fd416e51688cf65690012d0f3d4600d6", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fd416e51688cf65690012d0f3d4600d6");
                    return;
                }
                ConsumerRT.this.checkLogPool(true);
                ConsumerRT.this.mNRT.refreshLogPool();
            }
        };
        this.mContext = context;
        this.mRTMessageLengthException = new CatchException("ConsumerRTRTLogPool too long", 1, LocationStrategy.LOCATION_TIMEOUT);
        this.mOtherException = new CatchException("ConsumerRTother", 5, 10L);
        this.mNRT = consumerNRT;
        this.mReporter = new Reporter(KiteFlyConstants.RT_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleRtReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a85090f9c12823597e57611f33afb739", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a85090f9c12823597e57611f33afb739");
            return;
        }
        this.mWaitingOneSecond.set(false);
        synchronized (this) {
            if (this.mRTLogPool.size() == 0) {
                return;
            }
            if (NetWorkUtils.isNetworkConnected(this.mContext)) {
                if (this.mWaitingNetComplete.compareAndSet(false, true)) {
                    synchronized (this) {
                        this.mReportingLogPool = this.mRTLogPool;
                        this.mRTLogPool = new LinkedList<>();
                    }
                    this.mReporter.scheduleReportAction(new Runnable() { // from class: com.meituan.android.common.kitefly.ConsumerRT.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a97ec2e5001e1d2e110b62a19f356af9", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a97ec2e5001e1d2e110b62a19f356af9");
                                return;
                            }
                            try {
                                ConsumerRT.this.reportInNetThread();
                                synchronized (this) {
                                    if (ConsumerRT.this.mReportingLogPool.size() > 0) {
                                        ConsumerRT.this.mReporter.scheduleReportAction(this, ConsumerRT.RT_MERGE_INTERVAL_MS);
                                    } else {
                                        ConsumerRT.this.mWaitingNetComplete.set(false);
                                        if (ConsumerRT.this.mRelaySend.get()) {
                                            ConsumerRT.this.scheduleConsumerThreadAction(ConsumerRT.this.mToggleRtReportAction, ConsumerRT.RT_MERGE_INTERVAL_MS);
                                            ConsumerRT.this.mRelaySend.set(false);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    ConsumerRT.this.mOtherException.reportException(th);
                                    synchronized (this) {
                                        if (ConsumerRT.this.mReportingLogPool.size() > 0) {
                                            ConsumerRT.this.mReporter.scheduleReportAction(this, ConsumerRT.RT_MERGE_INTERVAL_MS);
                                        } else {
                                            ConsumerRT.this.mWaitingNetComplete.set(false);
                                            if (ConsumerRT.this.mRelaySend.get()) {
                                                ConsumerRT.this.scheduleConsumerThreadAction(ConsumerRT.this.mToggleRtReportAction, ConsumerRT.RT_MERGE_INTERVAL_MS);
                                                ConsumerRT.this.mRelaySend.set(false);
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    synchronized (this) {
                                        if (ConsumerRT.this.mReportingLogPool.size() <= 0) {
                                            ConsumerRT.this.mWaitingNetComplete.set(false);
                                            if (ConsumerRT.this.mRelaySend.get()) {
                                                ConsumerRT.this.scheduleConsumerThreadAction(ConsumerRT.this.mToggleRtReportAction, ConsumerRT.RT_MERGE_INTERVAL_MS);
                                                ConsumerRT.this.mRelaySend.set(false);
                                            }
                                        } else {
                                            ConsumerRT.this.mReporter.scheduleReportAction(this, ConsumerRT.RT_MERGE_INTERVAL_MS);
                                        }
                                        throw th2;
                                    }
                                }
                            }
                        }
                    });
                } else {
                    this.mRelaySend.set(true);
                }
            } else {
                synchronized (this) {
                    if (this.mRTLogPool.size() == 0) {
                        return;
                    }
                    LinkedList<Log> linkedList = this.mRTLogPool;
                    this.mRTLogPool = new LinkedList<>();
                    this.mLogger.d(TAG, "no net connected, save2database");
                    rtMessageSave2DB(linkedList);
                }
            }
            checkLogPool(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportInNetThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8074dd0ff2a6082a61a18a9e438b8d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8074dd0ff2a6082a61a18a9e438b8d3");
            return;
        }
        this.mLogger.d(TAG, "report wakeup in net thread");
        LinkedList<Log> linkedList = new LinkedList<>();
        synchronized (this) {
            if (this.mReportingLogPool.size() == 0) {
                this.mLogger.d(TAG, "report, but mRtLogPool is empty, return");
                return;
            }
            pickLimitedLogs(this.mReportingLogPool, linkedList);
            SLACounter.getInstance().onRTMessageToReporter(linkedList);
            this.mReporter.executeReportSync(linkedList, new Reporter.SingleReportListener() { // from class: com.meituan.android.common.kitefly.ConsumerRT.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.kitefly.Reporter.SingleReportListener
                public void onReportSucceed(LinkedList<Log> linkedList2, int i) {
                    Object[] objArr2 = {linkedList2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fb81ceb36beb7e88eb6e679b75d24b5d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fb81ceb36beb7e88eb6e679b75d24b5d");
                        return;
                    }
                    SLACounter.getInstance().onRTNetSuccess(linkedList2);
                    SLACounter.getInstance().onReportSuccess(linkedList2, true);
                    SLACounter.getInstance().incrementMemoryMessageCount(0, -linkedList2.size(), linkedList2);
                }

                @Override // com.meituan.android.common.kitefly.Reporter.SingleReportListener
                public void onReportFail(LinkedList<Log> linkedList2, int i) {
                    Object[] objArr2 = {linkedList2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7d56b5e903e2dc9d0e9f01b5ef910437", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7d56b5e903e2dc9d0e9f01b5ef910437");
                        return;
                    }
                    if (i == 413) {
                        ConsumerRT.this.mReporter.handleOversizeLog(linkedList2, i);
                        SLACounter.getInstance().incrementMemoryMessageCount(0, -linkedList2.size(), linkedList2);
                        return;
                    }
                    ConsumerRT.this.rtMessageSave2DB(linkedList2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkLogPool(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40d9129279f60255c9f8145a9785eef5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40d9129279f60255c9f8145a9785eef5");
            return;
        }
        LinkedList<Log> linkedList = null;
        synchronized (this) {
            int size = this.mRTLogPool.size() + this.mReportingLogPool.size();
            if (size > 200) {
                if (!(this.mRTLogPool instanceof FirstLinkedList)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logPoolSize", String.valueOf(size));
                    hashMap.put("maxType", Consumer.largeType(this.mRTLogPool, this.mReportingLogPool));
                    hashMap.put("session_id", Session.getInstance().getSessionId());
                    this.mRTMessageLengthException.reportException(hashMap);
                }
                z = true;
            }
            if (z) {
                linkedList = this.mRTLogPool;
                linkedList.addAll(this.mReportingLogPool);
                this.mRTLogPool = new LinkedList<>();
                this.mReportingLogPool = new LinkedList<>();
            }
        }
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        rtMessageSave2DB(linkedList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rtMessageSave2DB(@NonNull LinkedList<Log> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baa11e69f18fb4d5d4c405e8a9fa6bf1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baa11e69f18fb4d5d4c405e8a9fa6bf1");
            return;
        }
        SLACounter.getInstance().incrementMemoryMessageCount(0, -linkedList.size(), linkedList);
        SLACounter.getInstance().onRTMessageSaveToDB(linkedList);
        this.mNRT.saveMessage2ToDB(linkedList);
    }

    @Override // com.meituan.android.common.kitefly.Consumer
    public void handleMessageInner(@NonNull LinkedList<Log> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e51e48be1cd19c2cbc2f60ab4f63443", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e51e48be1cd19c2cbc2f60ab4f63443");
            return;
        }
        completeMessages(linkedList);
        if (this.isBackground) {
            this.mNRT.saveMessage2ToDB(linkedList);
            SLACounter.getInstance().onRTMessageSaveToDB(linkedList);
            return;
        }
        synchronized (this) {
            this.mRTLogPool.addAll(linkedList);
        }
        SLACounter.getInstance().incrementMemoryMessageCount(0, linkedList.size(), linkedList);
        checkLogPool(false);
        if (this.mWaitingOneSecond.compareAndSet(false, true)) {
            scheduleConsumerThreadAction(this.mToggleRtReportAction, RT_MERGE_INTERVAL_MS);
        }
    }

    public void fetchUIMsgOnStopped() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e4142b1c6dcf8d810b860792a28e2c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e4142b1c6dcf8d810b860792a28e2c8");
        } else {
            scheduleFetchUIMessageQueue();
        }
    }

    public void forceSaveOnBg() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8bd8a10284fcce99d4b8132a0b67012", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8bd8a10284fcce99d4b8132a0b67012");
            return;
        }
        this.isBackground = true;
        this.mBgAction = new TimeOutWatchDogAction(this.mForceSaveAction, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
    }

    public void cancelSaveOnFg() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "121cd19c45c65f4df1e6a4799ac0326f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "121cd19c45c65f4df1e6a4799ac0326f");
            return;
        }
        this.isBackground = false;
        if (this.mBgAction != null) {
            this.mBgAction.cancel();
        }
    }
}
