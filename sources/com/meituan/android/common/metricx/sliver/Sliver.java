package com.meituan.android.common.metricx.sliver;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Printer;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.kitefly.CatchException;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.utils.ApkUtil;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.SoLoadUtils;
import com.meituan.android.common.metricx.utils.StoreUtils;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.metrics.MetricsFrameCallbackManager;
import com.meituan.metrics.laggy.ThreadStackEntity;
import com.meituan.metrics.laggy.anr.AnrCallback;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.looper_logging.LooperLoggingManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.shadowsong.mss.e;
import com.meituan.shadowsong.mss.h;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.FileUtils;
import com.sankuai.common.utils.ProcessUtils;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Sliver {
    private static final int FROM_BACKGROUND = 3;
    private static final int FROM_FOREGROUND = 4;
    private static final int FROM_FRAME = 2;
    private static final int FROM_FRAME_LOOPER_END = 6;
    private static final int FROM_FRAME_LOOPER_START = 5;
    private static final int FROM_NORMAL = 0;
    private static final int FROM_NORMAL_OTHER = 1;
    private static final int FROM_OTHER_DEBUGGING = 7;
    private static final int FROM_OTHER_ERROR = 2000;
    private static final int FROM_SELF_ERROR = 1000;
    private static final String STATE_START = "State Start";
    private static final String STATE_TRACE = "State Trace";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Sliver sInstance = new Sliver();
    private final AtomicBoolean configFetched;
    private final CatchException exception;
    private long lastSampleFromOther;
    private final AtomicBoolean loadSoSuccess;
    private final AnrCallback mAnrCallback;
    private String mAnrUUID;
    private String mAnrUUIDPrefix;
    private SliverConfig mConfig;
    private long mLastCPUUpdate;
    private ScheduledExecutorService mThreadService;
    private final AtomicBoolean running;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface SoLoadCallback {
        void soLoadFail(String str);

        void soLoadSuccess();
    }

    public static Sliver getInstance() {
        return sInstance;
    }

    public Sliver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8aeb7229f65c71e3e8a2f24fb025d36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8aeb7229f65c71e3e8a2f24fb025d36");
            return;
        }
        this.exception = new CatchException("Sliver", 1, 300000L);
        this.running = new AtomicBoolean(false);
        this.lastSampleFromOther = 0L;
        this.mConfig = new SliverConfig(null);
        this.mThreadService = c.c("metricx-sliver");
        this.configFetched = new AtomicBoolean(false);
        this.loadSoSuccess = new AtomicBoolean(false);
        this.mAnrCallback = new AnrCallback() { // from class: com.meituan.android.common.metricx.sliver.Sliver.8
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.metrics.laggy.anr.AnrCallback
            public void onAnrEvent(long j, String str, List<ThreadStackEntity> list, AnrCallback.ANR_DETECT_TYPE anr_detect_type, JSONObject jSONObject) {
                Object[] objArr2 = {new Long(j), str, list, anr_detect_type, jSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b3b5794c6027b6c1e738f8df33bd6bae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b3b5794c6027b6c1e738f8df33bd6bae");
                } else if (Debug.isDebuggerConnected()) {
                } else {
                    Sliver.this.mThreadService.execute(new Runnable() { // from class: com.meituan.android.common.metricx.sliver.Sliver.8.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ca4a6d5294623f5447cc02f0ce256265", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ca4a6d5294623f5447cc02f0ce256265");
                            } else {
                                Sliver.this.onDetectAnr();
                            }
                        }
                    });
                }
            }
        };
    }

    public static void ensureSoLoad(final SoLoadCallback soLoadCallback) {
        Object[] objArr = {soLoadCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a6814ff9f8c8f7a0a94fac007b31c00a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a6814ff9f8c8f7a0a94fac007b31c00a");
        } else {
            SoLoadUtils.loadLibrary("sliver", new SoLoadUtils.LibLoadCallback() { // from class: com.meituan.android.common.metricx.sliver.Sliver.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.metricx.utils.SoLoadUtils.LibLoadCallback
                public final void onLoadSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5543fa5c75ab065da1b14c2f5effce89", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5543fa5c75ab065da1b14c2f5effce89");
                        return;
                    }
                    Sliver.sInstance.loadSoSuccess.set(true);
                    SoLoadCallback.this.soLoadSuccess();
                }

                @Override // com.meituan.android.common.metricx.utils.SoLoadUtils.LibLoadCallback
                public final void onLoadFail(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "145b3a39a6c6d232fea189691278c1f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "145b3a39a6c6d232fea189691278c1f1");
                        return;
                    }
                    Logger.getMetricsLogger().e(str);
                    SoLoadCallback.this.soLoadFail(str);
                }
            });
        }
    }

    public void prepareSo(@NonNull final SoLoadCallback soLoadCallback) {
        Object[] objArr = {soLoadCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0064d88526937df5ef9c02fb636e400a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0064d88526937df5ef9c02fb636e400a");
        } else if (!ProcessUtils.isMainProcess(ContextProvider.getInstance().getContext())) {
            soLoadCallback.soLoadFail("Not in main process.");
        } else if (Build.VERSION.SDK_INT < 27 || Build.VERSION.SDK_INT > 30) {
            soLoadCallback.soLoadFail("Only support Android 8.1, Android 9, Android 10 and Android 11.");
        } else if (this.configFetched.get() && !this.mConfig.enable) {
            soLoadCallback.soLoadFail("mConfig.enable == false");
        } else if (this.configFetched.get() && this.loadSoSuccess.get()) {
            soLoadCallback.soLoadSuccess();
        } else if (isDuoKai()) {
            soLoadCallback.soLoadFail("Device is multiboxing.");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("metricxVersion", "4.7.24.2-waimai");
            hashMap.put("sliverVersion", 4);
            Horn.register("metricx_sliver", new HornCallback() { // from class: com.meituan.android.common.metricx.sliver.Sliver.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e2e6e486bcb3bdb22eee9543e95d0dce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e2e6e486bcb3bdb22eee9543e95d0dce");
                    } else if (z && !TextUtils.isEmpty(str)) {
                        if (Sliver.this.configFetched.compareAndSet(false, true)) {
                            Sliver.this.onFetchConfig(str, soLoadCallback);
                        }
                    } else {
                        soLoadCallback.soLoadFail("Horn config is illegal.");
                    }
                }
            }, hashMap);
        }
    }

    public boolean start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03df1eba86ffb7420c69f2bef22c8664", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03df1eba86ffb7420c69f2bef22c8664")).booleanValue();
        }
        if (this.configFetched.get() && this.loadSoSuccess.get()) {
            return sInstance.triggerSampleOnce();
        }
        return false;
    }

    public void startANRTrace() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f084755c30be0ee686fbc80c1e3209b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f084755c30be0ee686fbc80c1e3209b9");
        } else if (this.mConfig != null && this.mConfig.anrTraceEnable && start()) {
            this.mAnrUUIDPrefix = Internal.getAppEnvironment().getUuid() + CommonConstant.Symbol.UNDERLINE + System.currentTimeMillis();
            MetricsAnrManager.getInstance().registerCallback(this.mAnrCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFetchConfig(String str, SoLoadCallback soLoadCallback) {
        Object[] objArr = {str, soLoadCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc39057968b4057b97ffe50ad60d1485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc39057968b4057b97ffe50ad60d1485");
            return;
        }
        this.mConfig = new SliverConfig(str);
        if (!this.mConfig.enable) {
            soLoadCallback.soLoadFail("mConfig.enable == false");
            return;
        }
        ensureSoLoad(soLoadCallback);
        uploadZips(STATE_START);
    }

    private boolean triggerSampleOnce() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e077f5897ec1b5a56ce73015e79ecc9b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e077f5897ec1b5a56ce73015e79ecc9b")).booleanValue();
        }
        if (this.running.compareAndSet(false, true)) {
            if (!SliverNative.checkThreadList()) {
                Logger.getMetricxLogger().d("checkThreadList failed");
                reportFailed(new RuntimeException("checkThreadListFailed"));
                return false;
            }
            Thread thread = Looper.getMainLooper().getThread();
            SliverProxy.thread = thread;
            SliverNative.sampleInit(thread);
            MetricsFrameCallbackManager.getInstance().register(new MetricsFrameCallbackManager.MetricsFrameCallback() { // from class: com.meituan.android.common.metricx.sliver.Sliver.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.metrics.MetricsFrameCallbackManager.MetricsFrameCallback
                public void doFrame(long j) {
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7a5ef5570ef3a0abd4f1bc9b12924b7f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7a5ef5570ef3a0abd4f1bc9b12924b7f");
                    } else if (Sliver.this.running.get()) {
                        SliverProxy.sampleInternal(2);
                    }
                }
            });
            AppBus.getInstance().register((AppBus.OnBackgroundListener) new AppBus.OnBackgroundUIListener() { // from class: com.meituan.android.common.metricx.sliver.Sliver.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
                public void onBackground() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a22714fd74038f43a2fa0be70889a0c3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a22714fd74038f43a2fa0be70889a0c3");
                    } else if (Sliver.this.running.get()) {
                        SliverProxy.sampleInternal(3);
                    }
                }
            }, false);
            AppBus.getInstance().register((AppBus.OnForegroundListener) new AppBus.OnForegroundUIListener() { // from class: com.meituan.android.common.metricx.sliver.Sliver.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.metricx.helpers.AppBus.OnForegroundListener
                public void onForeground() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "835c9e115d6a84eb79ee82932711d606", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "835c9e115d6a84eb79ee82932711d606");
                    } else if (Sliver.this.running.get()) {
                        SliverProxy.sampleInternal(4);
                    }
                }
            }, false);
            LooperLoggingManager.getInstance().registerMainLooperLogging(new Printer() { // from class: com.meituan.android.common.metricx.sliver.Sliver.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.util.Printer
                public void println(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "296c5ba5c50b0a195e0337440aecbe1f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "296c5ba5c50b0a195e0337440aecbe1f");
                    } else if (Sliver.this.running.get()) {
                        if (str != null && str.startsWith(">>>>> Dispatching to")) {
                            SliverProxy.sampleInternal(5);
                        } else {
                            SliverProxy.sampleInternal(6);
                        }
                    }
                }
            });
            c.a("Sliver", new Runnable() { // from class: com.meituan.android.common.metricx.sliver.Sliver.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7024a9424a896098af8959427c088238", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7024a9424a896098af8959427c088238");
                        return;
                    }
                    do {
                        SliverProxy.sampleNow = true;
                        if (!Debug.isDebuggerConnected()) {
                            Logger.getMetricxLogger().d("1s, sample From Other");
                            SliverProxy.sampleFromOther();
                        } else {
                            SliverProxy.sampleInternal(7);
                        }
                        try {
                            SliverNative.updateCpuUsage();
                            try {
                                Thread.sleep(Sliver.this.mConfig.sampleOtherThrehold);
                            } catch (InterruptedException unused) {
                            }
                        } catch (RuntimeException e) {
                            Logger.getMetricxLogger().e("updateCpuFailed", e);
                            Sliver.this.reportFailed(e);
                        }
                    } while (Sliver.this.running.get());
                    SliverProxy.thread = null;
                }
            }).start();
            return true;
        }
        return true;
    }

    private String getSliverTraceUrl(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13a547817a00e9209404ee3401b891b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13a547817a00e9209404ee3401b891b1");
        }
        return "https://s3plus.meituan.net/v1/mss_9bac99a330e2415d94ee9fa9bbfc83db/simple-perf/" + str + MRNBundleManager.MRN_BUNDLE_SUFFIX;
    }

    public String getAnrUUID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a282220fc95f3402f1d9aeff061fce0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a282220fc95f3402f1d9aeff061fce0");
        }
        if (this.mAnrUUID != null) {
            return "https://s3plus.meituan.net/v1/mss_9bac99a330e2415d94ee9fa9bbfc83db/simple-perf/" + this.mAnrUUID + MRNBundleManager.MRN_BUNDLE_SUFFIX;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportFailed(RuntimeException runtimeException) {
        Object[] objArr = {runtimeException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f0444e62e74d623fed206df60471759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f0444e62e74d623fed206df60471759");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("reason", runtimeException.getMessage());
        Babel.logRT(new Log.Builder("").tag("metricx_sliver_failed").generalChannelStatus(true).optional(hashMap).build());
    }

    private void uploadZips(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb82e5ce37335a57c1feac71e8d2da20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb82e5ce37335a57c1feac71e8d2da20");
            return;
        }
        final File file = StoreUtils.getFile(ContextProvider.getInstance().getContext(), "sliver");
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (final File file2 : listFiles) {
            if (file2.getName().endsWith(MRNBundleManager.MRN_BUNDLE_SUFFIX)) {
                h.a.a.a(file2, new e() { // from class: com.meituan.android.common.metricx.sliver.Sliver.9
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.shadowsong.mss.e
                    public void onSuccess() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b02a1a3f49a7d2a3cf52106aa4f05abd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b02a1a3f49a7d2a3cf52106aa4f05abd");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("zip", file2.getName());
                        hashMap.put("sliverVersion", 4);
                        hashMap.put("state", str);
                        Babel.logRT(new Log.Builder("").tag("metricx_sliver_anr").generalChannelStatus(true).optional(hashMap).build());
                        Logger.getMetricxLogger().e("ANR Trace Upload Success");
                        String absolutePath = file2.getAbsolutePath();
                        File file3 = file;
                        FileUtils.moveFile(absolutePath, new File(file3, file2.getName() + ".back").getAbsolutePath());
                    }

                    @Override // com.meituan.shadowsong.mss.e
                    public void onFailure() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0e38c4a7634cbd7c70e4dda626edcf8a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0e38c4a7634cbd7c70e4dda626edcf8a");
                            return;
                        }
                        Logger.getMetricxLogger().e("ANR Trace Upload Failed");
                        Sliver.this.exception.reportException(new Throwable("upload zip file failed"));
                    }
                });
            }
        }
    }

    public void onDetectAnr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae51fd6ac4f2507d79e4447214059ce9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae51fd6ac4f2507d79e4447214059ce9");
            return;
        }
        SliverProxy.sampleNow = false;
        this.mAnrUUID = this.mAnrUUIDPrefix + CommonConstant.Symbol.UNDERLINE + System.currentTimeMillis() + "_v4";
        executeSaveAndUpload(this.mAnrUUID);
    }

    private void writeToTrace(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdf78ed3318d7dc4a9411886a7b9a20e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdf78ed3318d7dc4a9411886a7b9a20e");
            return;
        }
        SliverProxy.sampleNow = false;
        SliverNative.writeToTrace(str, z);
    }

    private boolean isDuoKai() {
        File file;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52e9a2353b09ac9fbd23831dc380fa77", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52e9a2353b09ac9fbd23831dc380fa77")).booleanValue();
        }
        Context context = ContextProvider.getInstance().getContext();
        if (context == null || (file = StoreUtils.getFile(context, "")) == null) {
            return false;
        }
        String path = file.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        try {
            String obtainPackageName = ApkUtil.obtainPackageName(context);
            String[] split = path.split("/");
            if (path.startsWith("/data/data/")) {
                if (!TextUtils.equals(obtainPackageName, split[3])) {
                    reportDuoKai(path);
                    return true;
                }
            } else if (path.startsWith("/data/user/")) {
                if (!TextUtils.equals(obtainPackageName, split[4])) {
                    reportDuoKai(path);
                    return true;
                }
            } else {
                reportDuoKai(path);
            }
            return false;
        } catch (Throwable th) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            reportDuoKai(path + "\n" + stringWriter2);
            return false;
        }
    }

    private void reportDuoKai(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2add9b95ce833a4e6b436cbf22c413e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2add9b95ce833a4e6b436cbf22c413e");
        } else {
            Babel.log(new Log.Builder(str).tag("metricxDuoKai").generalChannelStatus(true).build());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public void executeSaveAndUpload(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.metricx.sliver.Sliver.executeSaveAndUpload(java.lang.String):void");
    }

    public String saveTraceAndUploadAsync(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36e1cdb1cc5592fe6ed374f79e9c49de", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36e1cdb1cc5592fe6ed374f79e9c49de");
        }
        this.mThreadService.execute(new Runnable() { // from class: com.meituan.android.common.metricx.sliver.Sliver.10
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "34b0e1e553d54cdb1ca67fe6c5e614fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "34b0e1e553d54cdb1ca67fe6c5e614fe");
                } else {
                    Sliver.this.executeSaveAndUpload(str);
                }
            }
        });
        return getSliverTraceUrl(str);
    }
}
