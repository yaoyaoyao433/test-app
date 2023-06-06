package com.meituan.metrics;

import android.support.annotation.NonNull;
import com.meituan.android.common.metricx.Config;
import com.meituan.android.common.metricx.ILibLoader;
import com.meituan.android.common.metricx.NativeTools;
import com.meituan.android.common.metricx.bytehook.ByteHookConfig;
import com.meituan.android.common.metricx.sliver.Sliver;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.SoLoadUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NativeToolsHandler {
    private static volatile String TAG = "NativeToolsHandler";
    private static final long WAIT_SO_TIMEOUT_MS = 5000;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean init = false;
    private static volatile NativeToolsHandler sInstance;
    private volatile int status;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class LoadSoStatus {
        public static final int FAIL = 1;
        public static final int NOT_LOAD = 0;
        public static final int SUCCEED = 2;
        public static ChangeQuickRedirect changeQuickRedirect;
        public int status;

        public LoadSoStatus() {
            this.status = 0;
        }
    }

    public NativeToolsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa737067849624eea336718f12c9ef0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa737067849624eea336718f12c9ef0d");
        } else {
            this.status = 1000;
        }
    }

    public static NativeToolsHandler getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ceceeb1e10303f080b61f0f039cf6e58", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeToolsHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ceceeb1e10303f080b61f0f039cf6e58");
        }
        if (sInstance == null) {
            synchronized (NativeToolsHandler.class) {
                sInstance = new NativeToolsHandler();
            }
        }
        return sInstance;
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d43f20583a33b914dab8d4eddb8a838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d43f20583a33b914dab8d4eddb8a838");
        } else if (init) {
        } else {
            init = true;
            this.status = NativeTools.init(new Config() { // from class: com.meituan.metrics.NativeToolsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.metricx.Config
                @NonNull
                public ByteHookConfig getByteHookConfig() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fc3e231e33c680e61c08833decb884ad", RobustBitConfig.DEFAULT_VALUE) ? (ByteHookConfig) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fc3e231e33c680e61c08833decb884ad") : new ByteHookConfig.Builder().setMode(ByteHookConfig.Mode.AUTOMATIC).build();
                }
            }, new ILibLoader() { // from class: com.meituan.metrics.NativeToolsHandler.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.metricx.ILibLoader
                public boolean loadLibrary(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "df39afc4b066f3a18aec9fa5007df2f6", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "df39afc4b066f3a18aec9fa5007df2f6")).booleanValue();
                    }
                    final LoadSoStatus loadSoStatus = new LoadSoStatus();
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    SoLoadUtils.loadLibrary(str, new SoLoadUtils.LibLoadCallback() { // from class: com.meituan.metrics.NativeToolsHandler.2.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.metricx.utils.SoLoadUtils.LibLoadCallback
                        public void onLoadSuccess() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "de9bc9530782778a13b87c0553767e71", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "de9bc9530782778a13b87c0553767e71");
                                return;
                            }
                            countDownLatch.countDown();
                            loadSoStatus.status = 2;
                        }

                        @Override // com.meituan.android.common.metricx.utils.SoLoadUtils.LibLoadCallback
                        public void onLoadFail(String str2) {
                            Object[] objArr3 = {str2};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b45a22a394d617c179857b67e633759d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b45a22a394d617c179857b67e633759d");
                                return;
                            }
                            loadSoStatus.status = 1;
                            countDownLatch.countDown();
                            Logger.getMetricxLogger().d(NativeToolsHandler.TAG, str2);
                        }
                    });
                    try {
                        if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                            loadSoStatus.status = 1;
                        }
                    } catch (Throwable unused) {
                        loadSoStatus.status = 1;
                    }
                    return loadSoStatus.status == 2;
                }
            });
            if (this.status == 1001) {
                onInitFinish();
            }
        }
    }

    private void onInitFinish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8177fa9fc438b40bdb2328b4b5c88af2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8177fa9fc438b40bdb2328b4b5c88af2");
        } else {
            Sliver.getInstance().prepareSo(new Sliver.SoLoadCallback() { // from class: com.meituan.metrics.NativeToolsHandler.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.metricx.sliver.Sliver.SoLoadCallback
                public void soLoadFail(String str) {
                }

                @Override // com.meituan.android.common.metricx.sliver.Sliver.SoLoadCallback
                public void soLoadSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1cbe9d355eba4607b14f40443925513f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1cbe9d355eba4607b14f40443925513f");
                    } else {
                        Sliver.getInstance().startANRTrace();
                    }
                }
            });
        }
    }
}
