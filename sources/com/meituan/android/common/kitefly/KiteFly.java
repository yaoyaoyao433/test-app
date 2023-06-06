package com.meituan.android.common.kitefly;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.babel.Subject;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class KiteFly implements AppBus.OnBackgroundListener, AppBus.OnForegroundListener, AppBus.OnStopListener {
    private static final String KITEFLY_DEBUG = "kitefly_debug";
    private static final String KITEFLY_MOCK = "kitefly_mock";
    public static final long MAX_LOG_SIZE = 1024000;
    private static final String SP_NAME = "KITEFLY_DEBUG";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static boolean isDebug = false;
    private static volatile boolean isInit = false;
    public static volatile boolean isLaunched = false;
    public static boolean isMock = false;
    public static Map<String, String> logTokens;
    private static q statistics;
    private Context mContext;
    private final ConsumerNRT mNrtConsumer;
    private final ConsumerRT mRtConsumer;
    private final ConsumerVIP mVIPConsumer;
    private static final byte[] debugLock = new byte[0];
    private static volatile KiteFly self = null;
    private static AtomicBoolean reportActivated = new AtomicBoolean(false);

    private void deployInner(String str) {
    }

    @Deprecated
    public static void flush() {
    }

    @Deprecated
    public static void flush(String str) {
    }

    @Deprecated
    private void flushInner() {
    }

    @Deprecated
    private void flushInner(String str) {
    }

    @Deprecated
    public static void flushToday() {
    }

    public static void logLocal(Log log) {
    }

    @Deprecated
    public static void logLocal(String str, String str2) {
    }

    @Deprecated
    public static void logLocal(String str, String str2, Map<String, Object> map) {
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        logTokens = concurrentHashMap;
        concurrentHashMap.put("KiteflyRatio", "59c22b512d427e194e806655");
    }

    @Deprecated
    public static void debug(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e8c07bb0a9020cee0491d8b76ebc6d4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e8c07bb0a9020cee0491d8b76ebc6d4f");
        } else if (context == null) {
        } else {
            try {
                isDebug = z;
                Logger.setDebug(z);
                configBooleanValue(context, KITEFLY_DEBUG, isDebug);
            } catch (Throwable th) {
                Logger.getBabelLogger().e("KiteFly debug method", th);
            }
        }
    }

    @Deprecated
    public static void mock(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1201cf94f635b9c308d65688c28846c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1201cf94f635b9c308d65688c28846c7");
        } else if (context == null) {
        } else {
            try {
                isMock = z;
                configBooleanValue(context, KITEFLY_MOCK, isMock);
            } catch (Throwable th) {
                Logger.getBabelLogger().e("KiteFly mock method", th);
            }
        }
    }

    public static Context getContext() {
        if (self != null) {
            return self.mContext;
        }
        return null;
    }

    @Deprecated
    public static boolean isMock() {
        return isMock;
    }

    private static void configBooleanValue(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9cd21994a76425c0599d6fb0affc1bcb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9cd21994a76425c0599d6fb0affc1bcb");
        } else if (context == null) {
        } else {
            try {
                synchronized (debugLock) {
                    if (statistics == null) {
                        statistics = q.a(context, SP_NAME, 2);
                    }
                    statistics.a(str, z);
                }
            } catch (Throwable th) {
                Logger.getBabelLogger().e("KiteFly configBooleanValue method", th);
            }
        }
    }

    private static void obtainBooleanValue(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a680f3d01eb2f7dd420d80396595954b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a680f3d01eb2f7dd420d80396595954b");
        } else if (context == null) {
        } else {
            try {
                synchronized (debugLock) {
                    if (statistics == null) {
                        statistics = q.a(context, SP_NAME, 2);
                    }
                    isDebug = statistics.b(KITEFLY_DEBUG, false);
                    isMock = statistics.b(KITEFLY_MOCK, false);
                    Logger.setDebug(isDebug);
                }
            } catch (Throwable th) {
                Logger.getBabelLogger().e("KiteFly obtainBooleanValue method", th);
            }
        }
    }

    public KiteFly(Builder builder) {
        Application application;
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bca0bf22a587337e822ec9ceef446003", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bca0bf22a587337e822ec9ceef446003");
            return;
        }
        this.mContext = builder.context;
        obtainBooleanValue(this.mContext);
        this.mNrtConsumer = new ConsumerNRT(this.mContext);
        this.mRtConsumer = new ConsumerRT(this.mNrtConsumer, this.mContext);
        this.mVIPConsumer = new ConsumerVIP(this.mContext);
        if (this.mContext instanceof Application) {
            application = (Application) this.mContext;
        } else {
            Context applicationContext = this.mContext.getApplicationContext();
            application = applicationContext instanceof Application ? (Application) applicationContext : null;
        }
        if (application != null) {
            AppBus.getInstance().init(application);
        }
        AppBus.getInstance().register((AppBus.OnBackgroundListener) this, false);
        AppBus.getInstance().register((AppBus.OnForegroundListener) this, false);
        AppBus.getInstance().register((AppBus.OnStopListener) this);
        new TimeOutWatchDogAction(new Runnable() { // from class: com.meituan.android.common.kitefly.KiteFly.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3600583c5e82572e4dbb22e55841af61", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3600583c5e82572e4dbb22e55841af61");
                    return;
                }
                SLACounter.getInstance().report();
                KiteFly.this.mVIPConsumer.refreshLog();
            }
        }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        new TimeOutWatchDogAction(new Runnable() { // from class: com.meituan.android.common.kitefly.KiteFly.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "49bc21145e52de04c0baef4464708a80", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "49bc21145e52de04c0baef4464708a80");
                } else {
                    KiteFly.this.activateReportOnce();
                }
            }
        }, Babel.getBabelConfig().getActivateDelayMils());
    }

    public static synchronized void init(Context context) {
        synchronized (KiteFly.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8416b1ec3e381a9eb8c13fd97a3151f9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8416b1ec3e381a9eb8c13fd97a3151f9");
            } else if (context == null) {
            } else {
                if (isInit) {
                    return;
                }
                synchronized (KiteFly.class) {
                    if (!isInit) {
                        self = new Builder(context).build();
                        TypeConfig.getsInstance().register();
                        isInit = true;
                    }
                }
            }
        }
    }

    public static void log(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cde4d5b0a6e4559d12fd2fc9d57211a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cde4d5b0a6e4559d12fd2fc9d57211a7");
        } else if (isInit && self != null) {
            self.logInner(new Log.Builder(str2).tag(str).build());
        }
    }

    public static void log(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1fb148782a31b6581c9a4ac64d76dc76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1fb148782a31b6581c9a4ac64d76dc76");
        } else if (isInit && self != null) {
            self.logInner(new Log.Builder(str2).tag(str).optional(map).build());
        }
    }

    public static void logRT(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1aad36994507ab439ebba8114581556f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1aad36994507ab439ebba8114581556f");
        } else if (isInit && self != null) {
            self.logRTInner(new Log.Builder(str2).tag(str).build());
        }
    }

    public static void logRT(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fc8ce4c35b5fbdb74304dd6cc26ce1bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fc8ce4c35b5fbdb74304dd6cc26ce1bb");
        } else if (isInit && self != null) {
            self.logRTInner(new Log.Builder(str2).tag(str).optional(map).build());
        }
    }

    private static void recodeLogTime(Log log) {
        boolean z = true;
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "29b84c50607fff64f5e9acb15fc1a8a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "29b84c50607fff64f5e9acb15fc1a8a3");
            return;
        }
        try {
            if (log.ts <= 0) {
                log.ts = TimeUtil.currentTimeMillisSNTP();
            }
            if (TextUtils.isEmpty(log.threadId)) {
                StringBuilder sb = new StringBuilder();
                sb.append(Thread.currentThread().getId());
                log.threadId = sb.toString();
            }
            if (TextUtils.isEmpty(log.threadName)) {
                log.threadName = Thread.currentThread().getName();
            }
            if (Looper.getMainLooper() != Looper.myLooper()) {
                z = false;
            }
            log.isMainThread = z;
            if (ProcessUtils.isMainProcess(self.mContext)) {
                log.option.put("session_id", Session.getInstance().getSessionId());
                log.option.put("seq_id", Integer.valueOf(Session.getInstance().addAndGet(log.tag)));
            }
        } catch (Throwable th) {
            Logger.getBabelLogger().e("KiteFly recodeLogTime method", th);
        }
    }

    public static String getUUID32() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d5cf3527b06dc32d565a6af1bdc91dad", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d5cf3527b06dc32d565a6af1bdc91dad") : UUID.randomUUID().toString().toLowerCase();
    }

    public static void log(Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4df5cb4b4d20dfc018d969177af12fa6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4df5cb4b4d20dfc018d969177af12fa6");
        } else if (isInit && self != null) {
            self.logInner(log);
        }
    }

    private void notifyObservers(Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aba9cd0dca3eb3f3e10bdb1f1bea9217", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aba9cd0dca3eb3f3e10bdb1f1bea9217");
        } else if (log != null && Subject.getInstance().hasObserver(log.tag)) {
            HashMap hashMap = new HashMap();
            hashMap.put("category", log.reportChannel);
            hashMap.put("token", log.token);
            hashMap.put("type", log.tag);
            hashMap.put("value", log.value);
            hashMap.put("details", log.details);
            hashMap.put("raw", log.raw);
            hashMap.put("option", log.option);
            Subject.getInstance().nodifyObservers(hashMap);
        }
    }

    public static void logRT(Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "270c15f520fa48d718236f8e09f995dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "270c15f520fa48d718236f8e09f995dc");
        } else if (isInit && self != null) {
            self.logRTInner(log);
        }
    }

    public static void logRT(List<Log> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a8109fae2d99214d229c00060bdb376", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a8109fae2d99214d229c00060bdb376");
        } else if (isInit && self != null) {
            self.logRTBatch(list);
        }
    }

    public static void logVIP(Log log, int i) {
        Object[] objArr = {log, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1ce4c0dbd004c712420cc5d11abe8d2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1ce4c0dbd004c712420cc5d11abe8d2f");
        } else if (isInit) {
            if (!ConsumerVIP.inVIP(log.tag) && isDebug) {
                throw new BabelException("DO NOT call this api for non-metrics data! Please call log(Log log) or logRT(Log log).");
            }
            if (self != null) {
                if (TextUtils.equals(log.tag, "anr")) {
                    self.mVIPConsumer.refreshLog();
                    self.mRtConsumer.fetchUIMsgOnStopped();
                    self.mNrtConsumer.refreshLogPool();
                }
                self.logVIPInner(log, i);
            }
        }
    }

    public static void logUrgent(Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d9ff6830f4a92f028561fc65a22dfc4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d9ff6830f4a92f028561fc65a22dfc4f");
        } else if (isInit && self != null) {
            self.logRTInner(log);
            self.mVIPConsumer.refreshLog();
            self.mRtConsumer.fetchUIMsgOnStopped();
            self.mNrtConsumer.refreshLogPool();
        }
    }

    public static synchronized void setDefaultToken(String str, String str2) {
        synchronized (KiteFly.class) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "34287ba07e897615e4232cff90c957c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "34287ba07e897615e4232cff90c957c9");
            } else if (isInit) {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    logTokens.put(str, str2);
                }
            }
        }
    }

    @Deprecated
    public static void deploy(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b0fddbaa9ff5bf8473f2d215effcd6ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b0fddbaa9ff5bf8473f2d215effcd6ec");
        } else if (isInit && self != null) {
            self.deployInner(str);
        }
    }

    private void logInner(Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05510a098e7da3aceaa5bfce01aa8129", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05510a098e7da3aceaa5bfce01aa8129");
        } else if (LogFilter.getInstance().filter(log)) {
        } else {
            recodeLogTime(log);
            Logger.getBabelLogger().d(log.tag, log.log);
            log.status = 1;
            addMark(log, 0);
            if (ConsumerVIP.inVIP(log.tag)) {
                SLACounter.getInstance().incrementApiCount(100, 1, log.tag);
                this.mVIPConsumer.addLog(log);
            } else {
                SLACounter.getInstance().incrementApiCount(1, 1, log.tag);
                this.mNrtConsumer.addLog(log);
                forceActivateReport();
            }
            self.notifyObservers(log);
        }
    }

    private void logRTBatch(List<Log> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d43216a86da77642539b9da31224992", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d43216a86da77642539b9da31224992");
        } else if (list != null) {
            ILogger babelLogger = Logger.getBabelLogger();
            for (Log log : list) {
                if (!LogFilter.getInstance().filter(log)) {
                    recodeLogTime(log);
                    addMark(log, 1);
                    babelLogger.d(log.tag, log.log);
                    log.status = 0;
                    SLACounter.getInstance().incrementApiCount(0, 1, log.tag);
                    this.mRtConsumer.addLog(log);
                    forceActivateReport();
                }
            }
        }
    }

    private void logRTInner(Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e052a9282ecba6305f53e4f91d2e2d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e052a9282ecba6305f53e4f91d2e2d1");
        } else if (LogFilter.getInstance().filter(log)) {
        } else {
            recodeLogTime(log);
            Logger.getBabelLogger().d(log.tag, log.log);
            log.status = 0;
            addMark(log, 1);
            if (ConsumerVIP.inVIP(log.tag)) {
                SLACounter.getInstance().incrementApiCount(100, 1, log.tag);
                this.mVIPConsumer.addLog(log);
            } else {
                SLACounter.getInstance().incrementApiCount(0, 1, log.tag);
                this.mRtConsumer.addLog(log);
                forceActivateReport();
            }
            self.notifyObservers(log);
        }
    }

    private void logVIPInner(Log log, int i) {
        Object[] objArr = {log, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7d175adf664a506aac3b81ce2a0711e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7d175adf664a506aac3b81ce2a0711e");
            return;
        }
        recodeLogTime(log);
        Logger.getBabelLogger().d(log.tag, log.log);
        addMark(log, i);
        SLACounter.getInstance().incrementApiCount(100, 1, log.tag);
        this.mVIPConsumer.addVIPLog(log);
        self.notifyObservers(log);
    }

    public final void addMark(Log log, int i) {
        Object[] objArr = {log, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e30f0d0534d1fe0b4711055cf805f17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e30f0d0534d1fe0b4711055cf805f17");
        } else if (log == null) {
        } else {
            log.logUUId = getUUID32();
            log.logSource = i;
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
    public final void onBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdb713290fe7b3933417557f6116aedf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdb713290fe7b3933417557f6116aedf");
        } else if (self == null) {
        } else {
            this.mRtConsumer.forceSaveOnBg();
            if (ProcessUtils.isMainProcess(this.mContext)) {
                this.mVIPConsumer.setForegroundStatus(false);
            }
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnForegroundListener
    public final void onForeground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be666c18adf849c680fcc3f8d5e00d0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be666c18adf849c680fcc3f8d5e00d0f");
        } else if (self == null) {
        } else {
            this.mRtConsumer.cancelSaveOnFg();
            if (ProcessUtils.isMainProcess(this.mContext)) {
                this.mVIPConsumer.setForegroundStatus(true);
            }
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnStopListener
    public final void onStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c27f1bd4c72fcdbd8ca5be565117be2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c27f1bd4c72fcdbd8ca5be565117be2");
        } else if (self == null) {
        } else {
            this.mRtConsumer.fetchUIMsgOnStopped();
            this.mNrtConsumer.refreshLogPool();
            if (ProcessUtils.isMainProcess(this.mContext)) {
                this.mVIPConsumer.triggerReportOnStopped();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Context context;

        public Builder(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e026e459e30a5d1088322a4b1b85bcb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e026e459e30a5d1088322a4b1b85bcb");
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.context = applicationContext != null ? applicationContext : context;
        }

        public final KiteFly build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff132e7481189e5d7898abf5cd25b6cc", 6917529027641081856L) ? (KiteFly) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff132e7481189e5d7898abf5cd25b6cc") : new KiteFly(this);
        }
    }

    @Nullable
    public static KiteFly getInstance() {
        return self;
    }

    public final void activateReportOnce() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d3f038bd6ff989f5cdd2f2e488f02ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d3f038bd6ff989f5cdd2f2e488f02ca");
        } else if (reportActivated.compareAndSet(false, true)) {
            Logger.getBabelLogger().d("KiteFly activate Report Once");
            long rTMergeInterval = TypeConfig.getsInstance().getRTMergeInterval();
            if (rTMergeInterval > 0) {
                ConsumerRT.RT_MERGE_INTERVAL_MS = rTMergeInterval;
            }
            this.mRtConsumer.scheduleFetchUIMessageQueue();
            long nRTMergeInterval = TypeConfig.getsInstance().getNRTMergeInterval();
            if (nRTMergeInterval > 0) {
                ConsumerNRT.NRT_MERGE_INTERVAL_MS = nRTMergeInterval;
            }
            this.mNrtConsumer.refreshLogPool();
        }
    }

    private void forceActivateReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69b50191d31ee1919bb25849084aeb1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69b50191d31ee1919bb25849084aeb1c");
        } else if (reportActivated.get() || this.mRtConsumer.getUIMessageCount() + this.mNrtConsumer.getUIMessageCount() <= 200) {
        } else {
            activateReportOnce();
        }
    }
}
