package com.meituan.android.common.kitefly;

import android.content.Context;
import android.support.annotation.AnyThread;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.babel.IDesensitizer;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.android.jarvis.c;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class Consumer {
    private static final int MESSAGE_QUEUE_ALERT_LONG = 100;
    private static final long REPORT_SIZE_LIMIT = 819200;
    private static final long SUPPLY_LOG_SIZE = 150;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final CatchException mActionTimeOutDog;
    private final CatchException mCatchExceptionDoWork;
    private final CatchException mCatchExceptionHandleMessage;
    private final String mConsumerName;
    @GuardedBy("mUILock")
    private volatile boolean mConsumerRunning;
    @NonNull
    private final Context mContext;
    private final WatchDogRunnable mDoWorkRunnable;
    private final CatchException mLogSizeTooLargeException;
    protected final ILogger mLogger;
    private final CatchException mMsgQueueTooLong;
    private final CatchException mQueueOverFlow;
    @GuardedBy("mUILock")
    private ScheduledExecutorService mThreadService;
    private final Object mUILock;
    @GuardedBy("mUILock")
    private volatile LinkedList<Log> mUIMessageQueue;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public @interface ConsumerName {
    }

    /* compiled from: ProGuard */
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ConsumerThread {
    }

    /* compiled from: ProGuard */
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface HasWorkerLock {
    }

    public abstract void handleMessageInner(@NonNull LinkedList<Log> linkedList);

    public Consumer(@ConsumerName String str, @NonNull Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d58679bf386d3166bfbfa5612456a00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d58679bf386d3166bfbfa5612456a00");
            return;
        }
        this.mConsumerRunning = false;
        this.mLogger = Logger.getBabelLogger();
        this.mUILock = new Object();
        this.mDoWorkRunnable = new WatchDogRunnable("Consumer#doWork") { // from class: com.meituan.android.common.kitefly.Consumer.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.kitefly.Consumer.WatchDogRunnable
            public void watchAction() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "46f74561de56866f98724bd75d0927b2", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "46f74561de56866f98724bd75d0927b2");
                    return;
                }
                try {
                    Consumer.this.doWork();
                    synchronized (Consumer.this.mUILock) {
                        Consumer.this.mConsumerRunning = false;
                        if (Consumer.this.mUIMessageQueue.size() > 0) {
                            Consumer.this.mConsumerRunning = true;
                            Consumer.this.scheduleConsumerThreadAction(Consumer.this.mDoWorkRunnable);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        Consumer.this.mCatchExceptionDoWork.reportException(th);
                        synchronized (Consumer.this.mUILock) {
                            Consumer.this.mConsumerRunning = false;
                            if (Consumer.this.mUIMessageQueue.size() > 0) {
                                Consumer.this.mConsumerRunning = true;
                                Consumer.this.scheduleConsumerThreadAction(Consumer.this.mDoWorkRunnable);
                            }
                        }
                    } catch (Throwable th2) {
                        synchronized (Consumer.this.mUILock) {
                            Consumer.this.mConsumerRunning = false;
                            if (Consumer.this.mUIMessageQueue.size() > 0) {
                                Consumer.this.mConsumerRunning = true;
                                Consumer.this.scheduleConsumerThreadAction(Consumer.this.mDoWorkRunnable);
                            }
                            throw th2;
                        }
                    }
                }
            }
        };
        this.mConsumerName = str;
        this.mContext = context;
        String str2 = "consumer(" + this.mConsumerName;
        if (this instanceof ConsumerVIP) {
            this.mUIMessageQueue = new LinkedList<>();
        } else {
            this.mUIMessageQueue = new FirstLinkedList();
        }
        this.mCatchExceptionHandleMessage = new CatchException(str2 + ")-handleMessage", 5, 50L);
        this.mCatchExceptionDoWork = new CatchException(str2 + ")-doWork", 20, 0L);
        this.mMsgQueueTooLong = new CatchException(str2 + ")-addLogQueueTooLong", 5, 1000L);
        this.mQueueOverFlow = new CatchException(str2 + ")-queueOverFLow", 2, 100000L);
        this.mActionTimeOutDog = new CatchException(str2 + ")-timeout", 3, 30000L);
        this.mLogSizeTooLargeException = new CatchException(str2 + ")-logTooLarge", 5, 10000L);
    }

    @AnyThread
    public void addLog(@NonNull Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "debeea25667f8e8435d31c3527d0123b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "debeea25667f8e8435d31c3527d0123b");
            return;
        }
        synchronized (this.mUILock) {
            if (this.mUIMessageQueue.size() > 2000) {
                reportQueueSize(this.mQueueOverFlow);
                return;
            }
            this.mUIMessageQueue.add(log);
            if (!(this.mUIMessageQueue instanceof FirstLinkedList)) {
                if (!this.mConsumerRunning) {
                    this.mConsumerRunning = true;
                    scheduleConsumerThreadAction(this.mDoWorkRunnable);
                }
                if (this.mUIMessageQueue.size() > 100) {
                    reportQueueSize(this.mMsgQueueTooLong);
                    scheduleConsumerThreadAction(this.mDoWorkRunnable);
                }
            }
        }
    }

    private void reportQueueSize(CatchException catchException) {
        Object[] objArr = {catchException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae9386d565ddf687cf9f936355b41648", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae9386d565ddf687cf9f936355b41648");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("queueSize", String.valueOf(this.mUIMessageQueue.size()));
        hashMap.put("maxType", largeType(this.mUIMessageQueue, Collections.emptyList()));
        hashMap.put("session_id", Session.getInstance().getSessionId());
        catchException.reportException(hashMap);
    }

    public static String largeType(@NonNull LinkedList<Log> linkedList, @NonNull List<Log> list) {
        int i = 0;
        Object[] objArr = {linkedList, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c5f2f7dae0543b53f513448945b981c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c5f2f7dae0543b53f513448945b981c");
        }
        HashMap hashMap = new HashMap();
        for (List<Log> list2 : Arrays.asList(linkedList, list)) {
            for (Log log : list2) {
                String str2 = log.tag;
                Integer num = (Integer) hashMap.get(str2);
                int intValue = num != null ? num.intValue() + 1 : 1;
                hashMap.put(str2, Integer.valueOf(intValue));
                if (intValue > i) {
                    str = str2;
                    i = intValue;
                }
            }
        }
        if (TypeConfig.getsInstance().dynamicBlacklistEnable() && i / linkedList.size() > 0.8d) {
            LogFilter.getInstance().addDynamicBlackList(str);
        }
        return i + " of " + str;
    }

    public static int logSize(Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1cdb096c8b7be2bcdeef1a9cc43d68b2", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1cdb096c8b7be2bcdeef1a9cc43d68b2")).intValue();
        }
        if (log == null) {
            return 0;
        }
        int length = TextUtils.isEmpty(log.log) ? 0 : 0 + log.log.getBytes().length;
        if (!TextUtils.isEmpty(log.details)) {
            length += log.details.getBytes().length;
        }
        if (!TextUtils.isEmpty(log.raw)) {
            length += log.raw.getBytes().length;
        }
        if (log.option != null) {
            length += calMapSize(log.option);
        }
        log.innerProperty.trunkSize = length;
        return log.envMaps != null ? length + calMapSize(log.envMaps) : length;
    }

    public static int calMapSize(Map<String, Object> map) {
        int i = 0;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e180ecb80eef94c1266dcbd067090df8", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e180ecb80eef94c1266dcbd067090df8")).intValue();
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                i += key.getBytes().length;
            }
            if (entry.getValue() != null) {
                String valueOf = String.valueOf(entry.getValue());
                if (!TextUtils.isEmpty(valueOf)) {
                    i += valueOf.getBytes().length;
                }
            }
        }
        return i;
    }

    public void fetchUIMessageQueue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2df9b2ac659989854d093dfb1d34de0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2df9b2ac659989854d093dfb1d34de0");
        } else {
            this.mDoWorkRunnable.run();
        }
    }

    @AnyThread
    public void scheduleFetchUIMessageQueue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6a544098e9c16b41846dc476a2c5d3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6a544098e9c16b41846dc476a2c5d3c");
        } else {
            scheduleConsumerThreadAction(this.mDoWorkRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doWork() {
        LinkedList<Log> linkedList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0342b7b60d1de29521bc4b30936dde44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0342b7b60d1de29521bc4b30936dde44");
            return;
        }
        synchronized (this.mUILock) {
            this.mConsumerRunning = true;
            linkedList = this.mUIMessageQueue;
            this.mUIMessageQueue = new LinkedList<>();
        }
        if (linkedList.size() == 0) {
            this.mLogger.d("consumer thread wakeup with empty message queue, pass");
            return;
        }
        try {
            handleMessage(linkedList);
        } catch (Throwable th) {
            this.mCatchExceptionHandleMessage.reportException(th);
        }
    }

    public void handleMessage(LinkedList<Log> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "115a27c10ea1bc7e858e97e15501a9ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "115a27c10ea1bc7e858e97e15501a9ac");
            return;
        }
        TypeConfig.getsInstance().fetch();
        SLACounter.getInstance().onConsumerReceiveMessages(linkedList);
        Iterator<Log> it = linkedList.iterator();
        IDesensitizer desensitizer = Babel.getBabelConfig().desensitizer();
        while (it.hasNext()) {
            Log next = it.next();
            if (desensitizer != null) {
                desensitizer.desensitize(next);
            }
            if (logSize(next) > KiteFly.MAX_LOG_SIZE) {
                SLACounter.getInstance().incrementLogTooLargeCount(next.status, 1, next.tag);
                CatchException catchException = this.mLogSizeTooLargeException;
                catchException.reportException(new RuntimeException("log too large: " + next.tag));
                it.remove();
            }
        }
        if (linkedList.size() == 0) {
            return;
        }
        handleMessageInner(linkedList);
    }

    public void completeMessages(@NonNull LinkedList<Log> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fef428a3a1acafdc9a8cfda6de173406", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fef428a3a1acafdc9a8cfda6de173406");
            return;
        }
        Iterator<Log> it = linkedList.iterator();
        while (it.hasNext()) {
            LogConvertor.addInfoOnLogCreate(this.mContext, it.next());
        }
    }

    private void ensureThreadService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be8f13f28905230ac8a752ddde32e87f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be8f13f28905230ac8a752ddde32e87f");
        } else if (this.mThreadService == null) {
            synchronized (this.mUILock) {
                if (this.mThreadService == null) {
                    this.mThreadService = c.b("consumer:" + this.mConsumerName, 2);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public abstract class WatchDogRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NonNull
        private final String mName;

        public abstract void watchAction();

        public WatchDogRunnable(@NonNull String str) {
            Object[] objArr = {Consumer.this, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91d6b3880b0f3b0e28a3ac5a469f0604", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91d6b3880b0f3b0e28a3ac5a469f0604");
            } else {
                this.mName = str;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca52663e7f6be762b92e5bc7a974965d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca52663e7f6be762b92e5bc7a974965d");
                return;
            }
            TimeOutWatchDogException timeOutWatchDogException = new TimeOutWatchDogException("consumer(" + Consumer.this.mConsumerName + ")-timeout(" + this.mName + CommonConstant.Symbol.BRACKET_RIGHT, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, Consumer.this.mActionTimeOutDog);
            try {
                watchAction();
            } finally {
                timeOutWatchDogException.cancel();
            }
        }
    }

    @AnyThread
    public void scheduleConsumerThreadAction(@NonNull WatchDogRunnable watchDogRunnable) {
        Object[] objArr = {watchDogRunnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a5e9af3e46bd7854fee7ccefe32818b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a5e9af3e46bd7854fee7ccefe32818b");
            return;
        }
        ensureThreadService();
        this.mThreadService.execute(watchDogRunnable);
    }

    @AnyThread
    public ScheduledFuture<?> scheduleConsumerThreadAction(@NonNull WatchDogRunnable watchDogRunnable, long j) {
        Object[] objArr = {watchDogRunnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9949035e2cb71a6629ea825e6e96356f", 6917529027641081856L)) {
            return (ScheduledFuture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9949035e2cb71a6629ea825e6e96356f");
        }
        ensureThreadService();
        return this.mThreadService.schedule(watchDogRunnable, j, TimeUnit.MILLISECONDS);
    }

    public void pickLimitedLogs(LinkedList<Log> linkedList, LinkedList<Log> linkedList2) {
        Object[] objArr = {linkedList, linkedList2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01eaffedd1a74b34312b32aec0076042", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01eaffedd1a74b34312b32aec0076042");
            return;
        }
        try {
            Log log = linkedList.get(0);
            LogMergedKey logMergedKey = new LogMergedKey(log.reportChannel, log.token, log.innerProperty);
            LogConvertor.addInfoOnLogReport(this.mContext, log);
            linkedList.remove(0);
            linkedList2.add(log);
            Iterator<Log> it = linkedList.iterator();
            long j = 0;
            while (it.hasNext()) {
                Log next = it.next();
                if (logMergedKey.equals(new LogMergedKey(next.reportChannel, next.token, next.innerProperty))) {
                    if (next.innerProperty.trunkSize + j + SUPPLY_LOG_SIZE >= REPORT_SIZE_LIMIT) {
                        return;
                    }
                    LogConvertor.addInfoOnLogReport(this.mContext, next);
                    linkedList2.add(next);
                    it.remove();
                    j += next.innerProperty.trunkSize;
                }
            }
        } catch (Throwable th) {
            this.mLogger.e(this.mConsumerName, th);
            this.mCatchExceptionHandleMessage.reportException(th);
        }
    }

    public int getUIMessageCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af864ca80b0a885c0ace63f520257de4", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af864ca80b0a885c0ace63f520257de4")).intValue() : this.mUIMessageQueue.size();
    }
}
