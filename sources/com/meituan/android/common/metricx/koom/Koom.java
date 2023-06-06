package com.meituan.android.common.metricx.koom;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.SoLoadUtils;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.shadowsong.mss.e;
import com.sankuai.common.utils.ProcessUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class Koom {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean mSoLoaded = false;
    private boolean compressAndUploadEnable;
    private boolean forkDumpInitSuccess;
    private boolean isDebug;
    private boolean isVersionPermit;
    private boolean mEnable;
    private File mOOMHprofFile;
    private String mOOMHprofFileName;
    private boolean memoryThresholdDumpEnable;
    private final AtomicBoolean needInvoke;

    private native void createCppLogFile(String str);

    private native void exitProcess();

    private native boolean initForkDump();

    private static native void nClose();

    private static native void nOpen(String str);

    private native boolean resumeAndWait(int i);

    private native int trySuspendVMThenFork();

    public Koom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e423b8031f214d3f49456d76e39e322", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e423b8031f214d3f49456d76e39e322");
            return;
        }
        this.isVersionPermit = false;
        this.forkDumpInitSuccess = false;
        this.needInvoke = new AtomicBoolean(true);
        this.isDebug = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Inner_ {
        private static final Koom Instance = new Koom();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static Koom getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ce0f6c3543565249885c68d0071a6779", RobustBitConfig.DEFAULT_VALUE) ? (Koom) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ce0f6c3543565249885c68d0071a6779") : Inner_.Instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean ensureSoLoad() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a52356d87527815b9f82a5fae4f0b29", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a52356d87527815b9f82a5fae4f0b29")).booleanValue();
        }
        if (!mSoLoaded) {
            SoLoadUtils.loadLibrary("metricx_koom", new SoLoadUtils.LibLoadCallback() { // from class: com.meituan.android.common.metricx.koom.Koom.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.metricx.utils.SoLoadUtils.LibLoadCallback
                public void onLoadSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "28b43f7ff0db2b5885a6e8af1a99a9e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "28b43f7ff0db2b5885a6e8af1a99a9e9");
                        return;
                    }
                    boolean unused = Koom.mSoLoaded = true;
                    KoomDebugger.getInstance().updateKoomCIPS(KoomDebugger.IS_SO_LOADED, true);
                }

                @Override // com.meituan.android.common.metricx.utils.SoLoadUtils.LibLoadCallback
                public void onLoadFail(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b944d79c04baaa902b550a83730fd535", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b944d79c04baaa902b550a83730fd535");
                    } else {
                        Logger.getMetricsLogger().e(str);
                    }
                }
            });
        }
        return mSoLoaded;
    }

    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cebbfa48c6b7f2a9e47ee052b803ffaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cebbfa48c6b7f2a9e47ee052b803ffaa");
            return;
        }
        final Context context = Metrics.getInstance().getContext();
        KoomDebugger.getInstance().init(context);
        Horn.register("metricx_tailor", new HornCallback() { // from class: com.meituan.android.common.metricx.koom.Koom.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7cdfa15e40c2a41f58766827bfca89be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7cdfa15e40c2a41f58766827bfca89be");
                } else if (!z || TextUtils.isEmpty(str)) {
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        Koom.this.mEnable = jSONObject.optBoolean("enable", false);
                        Koom.this.compressAndUploadEnable = jSONObject.optBoolean("compress_and_upload_enable", false);
                        Koom.this.memoryThresholdDumpEnable = jSONObject.optBoolean("memory_threshold_dump_enable", false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    if (Koom.this.isDebug) {
                        Koom.this.mEnable = true;
                    }
                    if (Koom.this.mEnable) {
                        Koom.this.ensureSoLoad();
                    }
                    if (Koom.this.memoryThresholdDumpEnable) {
                        LowMemoryWatcher.getInstance().init(context);
                    }
                    if (Koom.this.compressAndUploadEnable && ProcessUtils.isMainProcess(context) && Koom.this.needInvoke.compareAndSet(true, false)) {
                        Koom.this.compressAndUpload();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void compressAndUpload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da4027c82bbe144fbe30c18ee4e5926c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da4027c82bbe144fbe30c18ee4e5926c");
        } else {
            KoomFileUploader.compressAndUploadZips(new e() { // from class: com.meituan.android.common.metricx.koom.Koom.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.shadowsong.mss.e
                public void onSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5ffa56bc5f9231a33aebb57ffb80b533", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5ffa56bc5f9231a33aebb57ffb80b533");
                    } else {
                        KoomDebugger.getInstance().reportKoomInMain(true);
                    }
                }

                @Override // com.meituan.shadowsong.mss.e
                public void onFailure() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "19521df8ed9dcfd376344d4601e19a7a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "19521df8ed9dcfd376344d4601e19a7a");
                    } else {
                        KoomDebugger.getInstance().reportKoomInMain(false);
                    }
                }
            });
        }
    }

    public synchronized boolean dumpHprofData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f657f333448e801c7ccff34412b8c15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f657f333448e801c7ccff34412b8c15")).booleanValue();
        }
        KoomDebugger.getInstance().updateKoomCIPS(KoomDebugger.IS_OUT_OF_MEMORY_ERROR, true);
        KoomDebugger.getInstance().updateKoomCIPS(KoomDebugger.IS_ENABLE, this.mEnable);
        KoomDebugger.getInstance().updateKoomCIPS("source", str);
        if (this.mEnable || this.memoryThresholdDumpEnable || KoomDebugger.DIAGNOSE.equals(str)) {
            this.isVersionPermit = isVersionPermit();
            KoomDebugger.getInstance().updateKoomCIPS(KoomDebugger.IS_SDK_VERSION_SUPPORTED, this.isVersionPermit);
            if (this.isVersionPermit) {
                if (ensureSoLoad()) {
                    File koomDir = KoomFileUploader.koomDir();
                    if (!koomDir.exists()) {
                        koomDir.mkdirs();
                    }
                    createCppLogFile(createFile(koomDir, "koom_cpp.log").getAbsolutePath());
                    this.forkDumpInitSuccess = initForkDump();
                    KoomDebugger.getInstance().updateKoomCIPS(KoomDebugger.IS_FORK_DUMP_INIT_SUCCESS, this.forkDumpInitSuccess);
                    if (this.forkDumpInitSuccess) {
                        if (this.mOOMHprofFileName == null) {
                            createHprofFileName();
                        }
                        KoomDebugger.getInstance().updateKoomCIPS(KoomDebugger.HPROF_NAME, this.mOOMHprofFileName);
                        this.mOOMHprofFile = createFile(koomDir, this.mOOMHprofFileName);
                        return dumpHeap(this.mOOMHprofFile.getAbsolutePath(), str);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private File createFile(File file, String str) {
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca17c9df78c17c7a8d47299a563fd82f", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca17c9df78c17c7a8d47299a563fd82f");
        }
        File file2 = new File(file, str);
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file2.setReadable(true);
        file2.setWritable(true);
        return file2;
    }

    private boolean dumpHeap(String str, String str2) {
        IOException e;
        boolean z = false;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cdc79c2be9e76344b4e3570cc0c7ea6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cdc79c2be9e76344b4e3570cc0c7ea6")).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            int trySuspendVMThenFork = trySuspendVMThenFork();
            if (trySuspendVMThenFork == 0) {
                nOpen(str);
                Debug.dumpHprofData(str);
                nClose();
                exitProcess();
            } else if (trySuspendVMThenFork > 0) {
                boolean resumeAndWait = resumeAndWait(trySuspendVMThenFork);
                try {
                    KoomDebugger koomDebugger = KoomDebugger.getInstance();
                    koomDebugger.updateKoomCIPS(KoomDebugger.RESUME_AND_WAIT, "pid " + trySuspendVMThenFork + ", dumpRes " + resumeAndWait);
                    KoomDebugger koomDebugger2 = KoomDebugger.getInstance();
                    koomDebugger2.updateKoomCIPS(KoomDebugger.UPLOAD_ZIPS_RECORD, "dump_success: " + this.mOOMHprofFile.getName() + ", size:" + (this.mOOMHprofFile.length() / 1048576) + "MB, time:" + ((System.currentTimeMillis() - currentTimeMillis) / 1000.0d) + "s");
                    if (resumeAndWait && (KoomDebugger.MEMORY_TOUCH_TOP.equals(str2) || KoomDebugger.DIAGNOSE.equals(str2))) {
                        compressAndUpload();
                    }
                    z = resumeAndWait;
                } catch (IOException e2) {
                    e = e2;
                    z = resumeAndWait;
                    e.printStackTrace();
                    return z;
                }
            }
        } catch (IOException e3) {
            e = e3;
        }
        return z;
    }

    public void createHprofFileName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ce72642cb7cd5347afdd909efe6a0fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ce72642cb7cd5347afdd909efe6a0fe");
            return;
        }
        this.mOOMHprofFileName = "koom_" + Internal.getAppEnvironment().getUuid() + CommonConstant.Symbol.UNDERLINE + Internal.getAppEnvironment().getAppVersion() + "_v2_" + System.currentTimeMillis() + ".hprof";
    }

    public String getHprofResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b9aad4bbfd73701cbf25fd977404c54", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b9aad4bbfd73701cbf25fd977404c54");
        }
        if (this.mOOMHprofFileName == null) {
            return !this.mEnable ? "null, Horn开关没开" : !this.isVersionPermit ? "null, API版本不支持" : !mSoLoaded ? "null, metricx_koom.so加载失败" : !this.forkDumpInitSuccess ? "null, Fork虚拟机子进程初始化失败" : "null, 其他原因导致未创建镜像文件";
        }
        return "https://s3plus.meituan.net/v1/mss_9bac99a330e2415d94ee9fa9bbfc83db/simple-perf/" + this.mOOMHprofFileName + MRNBundleManager.MRN_BUNDLE_SUFFIX;
    }

    private boolean isVersionPermit() {
        return Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 33;
    }

    public void setDebug(boolean z) {
        this.isDebug = z;
    }

    public boolean getEnable() {
        return this.mEnable;
    }
}
