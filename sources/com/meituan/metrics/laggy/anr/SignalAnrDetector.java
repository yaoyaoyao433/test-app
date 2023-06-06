package com.meituan.metrics.laggy.anr;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.MetricsFrameCallbackManager;
import com.meituan.metrics.laggy.ThreadStackEntity;
import com.meituan.metrics.laggy.anr.AnrCallback;
import com.meituan.metrics.util.ThreadStackUtils;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.metrics.util.thread.ThreadManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.NativeCrashHandler;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.ProcessUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SignalAnrDetector {
    private static final long ANR_DUMP_TIMEOUT = 20000;
    private static final long BACKGROUND_MSG_THRESHOLD = 10000;
    private static final long FOREGROUND_MSG_THRESHOLD = 2000;
    private static final long MS_TO_NS = 1000000;
    private static final String TAG = "SignalAnrDetector";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ILogger logger = Logger.getMetricxLogger();
    private static volatile SignalAnrDetector sInstance;
    private AnrCallback anrCallback;
    private long lastAnrTime;
    private final ScheduledExecutorService signalAnrService;

    public SignalAnrDetector() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e77536cd043dc8f3186b58327844c97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e77536cd043dc8f3186b58327844c97");
            return;
        }
        this.signalAnrService = c.c("metricx-sigAnr");
        this.lastAnrTime = 0L;
    }

    public static SignalAnrDetector getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bac06c62a08e6466515466db0e35c832", RobustBitConfig.DEFAULT_VALUE)) {
            return (SignalAnrDetector) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bac06c62a08e6466515466db0e35c832");
        }
        if (sInstance == null) {
            synchronized (SignalAnrDetector.class) {
                if (sInstance == null) {
                    sInstance = new SignalAnrDetector();
                }
            }
        }
        return sInstance;
    }

    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "087b51626332d8cfe524ada035950c92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "087b51626332d8cfe524ada035950c92");
            return;
        }
        this.anrCallback = MetricsAnrManager.getInstance();
        initSignalAnrHandlerMain();
    }

    private void initSignalAnrHandlerMain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90c0e9a94caa4beb7316e8a23f7d24e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90c0e9a94caa4beb7316e8a23f7d24e5");
        } else {
            ThreadManager.getInstance().runOnUiThread(new Callable<Void>() { // from class: com.meituan.metrics.laggy.anr.SignalAnrDetector.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.Callable
                public Void call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "01443453e58bc2a5e9ef64feb645de35", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "01443453e58bc2a5e9ef64feb645de35");
                    }
                    if (NativeCrashHandler.initSignalAnrHandler()) {
                        AnrSLA.getInstance().updateAnrCIPS(AnrSLA.CIPS_KEY_MONITOR_AVAILABLE_COUNT);
                        return null;
                    }
                    return null;
                }
            });
        }
    }

    private void onAnrDetect(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ba53cc7a5ef2c206b9b53c17f10f69e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ba53cc7a5ef2c206b9b53c17f10f69e");
            return;
        }
        long currentTimeMillisSNTP = TimeUtil.currentTimeMillisSNTP();
        if (this.lastAnrTime > 0 && currentTimeMillisSNTP - this.lastAnrTime <= ANR_DUMP_TIMEOUT) {
            logger.e(TAG, "ANR threshold is shorter than 20000");
            return;
        }
        this.lastAnrTime = currentTimeMillisSNTP;
        AnrSLA.getInstance().updateAnrCIPS(AnrSLA.CIPS_KEY_ANR_RECORD_COUNT);
        checkRealAnrAndReport(i, currentTimeMillisSNTP);
    }

    private void checkRealAnrAndReport(final int i, final long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d1082621a12ee8823adb658672e74b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d1082621a12ee8823adb658672e74b9");
            return;
        }
        final boolean checkMainThreadBlocked = checkMainThreadBlocked();
        final List<ThreadStackEntity> stack = getStack(Looper.getMainLooper().getThread());
        logger.e(TAG, "Catch ANR signal", Integer.valueOf(i), "isMainThreadBlock", Boolean.valueOf(checkMainThreadBlocked), ProcessUtils.getCurrentProcessName());
        this.signalAnrService.execute(new Runnable() { // from class: com.meituan.metrics.laggy.anr.SignalAnrDetector.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6196de7ed5afa2abe2080fdadf48d48d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6196de7ed5afa2abe2080fdadf48d48d");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(AnrConstants.SIGNAL_MAIN_THREAD_BLOCK, checkMainThreadBlocked);
                    jSONObject.put(AnrConstants.SIGNAL_CODE, i);
                } catch (Throwable unused) {
                }
                SignalAnrDetector.this.anrCallback.onAnrEvent(j, null, stack, AnrCallback.ANR_DETECT_TYPE.SIGNAL, jSONObject);
            }
        });
    }

    private List<ThreadStackEntity> getStack(Thread thread) {
        Object[] objArr = {thread};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91774fe373c65e75cb5eb6672e306055", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91774fe373c65e75cb5eb6672e306055");
        }
        ArrayList arrayList = new ArrayList();
        try {
            long currentTimeMillisSNTP = TimeUtil.currentTimeMillisSNTP();
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace != null && stackTrace.length > 0) {
                logger.d(TAG, "LaggyMonitor getStack: \n", ThreadStackUtils.getStack(stackTrace));
                arrayList.add(new ThreadStackEntity(currentTimeMillisSNTP, stackTrace));
            }
            return arrayList;
        } catch (Throwable unused) {
            return arrayList;
        }
    }

    private boolean checkMainThreadBlocked() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfa1b17bff4e339d4a26a156c1bd6367", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfa1b17bff4e339d4a26a156c1bd6367")).booleanValue();
        }
        boolean isForeground = AppBus.getInstance().isForeground();
        long lastCallbackNs = MetricsFrameCallbackManager.getLastCallbackNs();
        if (AppBus.getInstance().isForeground() && lastCallbackNs > 0) {
            return System.nanoTime() - lastCallbackNs >= 2000000000;
        }
        try {
            Looper mainLooper = Looper.getMainLooper();
            Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
            declaredField.setAccessible(true);
            MessageQueue messageQueue = (MessageQueue) declaredField.get(mainLooper);
            Field declaredField2 = messageQueue.getClass().getDeclaredField("mMessages");
            declaredField2.setAccessible(true);
            Message message = (Message) declaredField2.get(messageQueue);
            if (message != null) {
                long when = message.getWhen();
                if (when == 0) {
                    return false;
                }
                return SystemClock.uptimeMillis() - when >= (isForeground ? 2000L : 10000L);
            }
            return false;
        } catch (Exception e) {
            logger.e(TAG, e);
            return false;
        }
    }
}
