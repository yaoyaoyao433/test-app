package com.meituan.android.aurora;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import com.meituan.android.cipstorage.q;
import com.meituan.metrics.looper_logging.LooperLoggingManager;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.launcher.util.aop.b;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class AuroraMainLooper {
    private static final String TAG = "AuroraMainLooper";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean isRecordRunning = false;

    public static void start(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0a3da44e63fdee2d4dffa2397a000450", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0a3da44e63fdee2d4dffa2397a000450");
        } else if (!isRecordRunning && ProcessUtils.isMainProcess(context)) {
            if (AuroraAnchorsRuntime.debuggable() || q.a(context, AuroraConfig.CHANNEL, 0).b(AuroraConfig.MAIN_LOOPER_KEY, false)) {
                isRecordRunning = true;
                recordStart();
            }
        }
    }

    private static void recordStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "14314d80f6e9466efb3f1a5d977294b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "14314d80f6e9466efb3f1a5d977294b4");
            return;
        }
        if (AuroraMainLooperRecorder.recordMap != null) {
            AuroraMainLooperRecorder.recordMap.clear();
        }
        if (AuroraMainLooperRecorder.timeMap != null) {
            AuroraMainLooperRecorder.timeMap.clear();
        }
        LooperLoggingManager.getInstance().registerMainLooperLogging(AuroraMainLooperRecorder.getInstance());
    }

    public static void recordFinish() {
        ConcurrentHashMap concurrentHashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aa50565e9617261147f727fa356e08b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aa50565e9617261147f727fa356e08b2");
        } else if (isRecordRunning) {
            isRecordRunning = false;
            LooperLoggingManager.getInstance().unRegisterMainLooperLogging(AuroraMainLooperRecorder.getInstance());
            if (!AuroraReporter.sAbandon && (concurrentHashMap = AuroraMainLooperRecorder.recordMap) != null) {
                for (AuroraMainLooperRecord auroraMainLooperRecord : concurrentHashMap.values()) {
                    AuroraReporter.collectMainLooperData(auroraMainLooperRecord);
                }
            }
            AuroraMainLooperRecorder.destroy();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class AuroraMainLooperRecorder implements Printer {
        private static final int ENTER_TYPE_FINISH = 2;
        private static final int ENTER_TYPE_START = 1;
        private static final char LOOP_START_TAG = '>';
        public static ChangeQuickRedirect changeQuickRedirect;
        private static volatile String currentKey;
        private static volatile int currentMessageWhat;
        private static volatile AuroraMainLooperRecorder instance;
        private static ConcurrentHashMap<String, Long> timeMap = new ConcurrentHashMap<>();
        private static ConcurrentHashMap<String, AuroraMainLooperRecord> recordMap = new ConcurrentHashMap<>(128);

        public static AuroraMainLooperRecorder getInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6cc5e7d0e4a87c7165fee441b34184fd", RobustBitConfig.DEFAULT_VALUE)) {
                return (AuroraMainLooperRecorder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6cc5e7d0e4a87c7165fee441b34184fd");
            }
            if (instance == null) {
                synchronized (AuroraMainLooperRecorder.class) {
                    if (instance == null) {
                        instance = new AuroraMainLooperRecorder();
                    }
                }
            }
            return instance;
        }

        @Override // android.util.Printer
        public void println(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d83646b9730fc1f69997569d7cf7ba4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d83646b9730fc1f69997569d7cf7ba4");
            } else if (TextUtils.isEmpty(str) || !AuroraMainLooper.isRecordRunning) {
            } else {
                b.a(AuroraAnchorsRuntime.getSingleThreadPool(), AuroraMainLooper$AuroraMainLooperRecorder$$Lambda$1.lambdaFactory$(str));
            }
        }

        public static /* synthetic */ void lambda$println$0(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae1026a32e48df185189ea24609f34ae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae1026a32e48df185189ea24609f34ae");
            } else if (str.charAt(0) == '>') {
                String replace = str.replace(">>>>> Dispatching to ", "");
                try {
                    String[] split = replace.split(": ");
                    record(split[0], split[1], 1);
                    currentKey = split[0];
                } catch (Exception e) {
                    if (AuroraAnchorsRuntime.debuggable()) {
                        e.printStackTrace();
                        Log.e(AuroraMainLooper.TAG, "Unresolved log string: " + str);
                    }
                    currentKey = replace;
                    record(replace, null, 1);
                }
            } else if (TextUtils.isEmpty(currentKey)) {
            } else {
                record(currentKey, null, 2);
                currentKey = null;
            }
        }

        private static void record(String str, String str2, int i) {
            String str3;
            AuroraMainLooperRecord auroraMainLooperRecord;
            Object[] objArr = {str, str2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "81edd62e13d9c152a2ef75604515736d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "81edd62e13d9c152a2ef75604515736d");
            } else if (TextUtils.isEmpty(str)) {
            } else {
                String[] split = str.split(StringUtil.SPACE);
                if (i == 1) {
                    try {
                        if (TextUtils.equals(split[1], "(android.app.ActivityThread$H)")) {
                            currentMessageWhat = Integer.parseInt(str2);
                        }
                    } catch (Exception e) {
                        if (AuroraAnchorsRuntime.debuggable()) {
                            e.printStackTrace();
                            Log.e(AuroraMainLooper.TAG, "Unresolved log string key: " + str);
                        }
                    }
                    timeMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                } else if (i == 2) {
                    Long remove = timeMap.remove(str);
                    long elapsedRealtime = remove != null ? SystemClock.elapsedRealtime() - remove.longValue() : 0L;
                    int startupSection = Aurora.getStartupSection();
                    try {
                        if (!split[1].contains("sankuai") && !split[1].contains(AbsApiFactory.PASSPORT_ONLINE_URL) && !TextUtils.equals(split[3], StringUtil.NULL)) {
                            str3 = split[3].substring(0, split[3].lastIndexOf(64));
                        } else if (TextUtils.equals(split[1], "(android.app.ActivityThread$H)")) {
                            str3 = split[1] + currentMessageWhat;
                        } else {
                            str3 = split[1];
                        }
                    } catch (Exception e2) {
                        if (AuroraAnchorsRuntime.debuggable()) {
                            e2.printStackTrace();
                            Log.e(AuroraMainLooper.TAG, "Unresolved log string key: " + str);
                        }
                        str3 = str;
                    }
                    String str4 = str3 + startupSection;
                    if (recordMap.containsKey(str4)) {
                        auroraMainLooperRecord = recordMap.get(str4);
                    } else {
                        auroraMainLooperRecord = new AuroraMainLooperRecord();
                        recordMap.put(str4, auroraMainLooperRecord);
                    }
                    if (auroraMainLooperRecord == null) {
                        auroraMainLooperRecord = new AuroraMainLooperRecord();
                        recordMap.put(str4, auroraMainLooperRecord);
                    }
                    if (auroraMainLooperRecord.startTime == 0) {
                        if (remove != null) {
                            auroraMainLooperRecord.startTime = remove.longValue();
                        } else {
                            auroraMainLooperRecord.startTime = SystemClock.elapsedRealtime();
                        }
                    }
                    auroraMainLooperRecord.count++;
                    auroraMainLooperRecord.time += elapsedRealtime;
                    auroraMainLooperRecord.key = str3;
                    auroraMainLooperRecord.section = startupSection;
                }
            }
        }

        public static void destroy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bedd3b875b6c99154c5f5339ec9c2439", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bedd3b875b6c99154c5f5339ec9c2439");
                return;
            }
            timeMap.clear();
            recordMap.clear();
            instance = null;
        }
    }
}
