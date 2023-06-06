package com.meituan.android.common.metricx.koom;

import android.support.annotation.Keep;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.utils.StoreUtils;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.shadowsong.mss.e;
import com.meituan.shadowsong.mss.h;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.IOUtils;
import com.sankuai.common.utils.NetWorkUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class KoomFileUploader {
    public static final long M = 1048576;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ExecutorService mKoomService = c.a("metrix_koom");
    public static int uploadCount = 0;

    public static File koomDir() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc2281f0b35b178c5c591a55fd5b2baf", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc2281f0b35b178c5c591a55fd5b2baf") : StoreUtils.getFile(ContextProvider.getInstance().getContext(), "koom");
    }

    public static void compressAndUploadZips(final e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd1cf58725d7684e42bd064671cf0a84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd1cf58725d7684e42bd064671cf0a84");
        } else {
            mKoomService.execute(new Runnable() { // from class: com.meituan.android.common.metricx.koom.KoomFileUploader.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    BufferedReader bufferedReader;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bb9da91a02aa09e7e3a8564f0c50b232", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bb9da91a02aa09e7e3a8564f0c50b232");
                        return;
                    }
                    File koomDir = KoomFileUploader.koomDir();
                    if (!koomDir.exists()) {
                        e.this.onFailure();
                        return;
                    }
                    File[] listFiles = koomDir.listFiles();
                    if (listFiles == null || listFiles.length == 0) {
                        e.this.onFailure();
                        return;
                    }
                    for (File file : listFiles) {
                        if (file.getName().endsWith(".hprof")) {
                            File file2 = new File(file.getAbsolutePath() + MRNBundleManager.MRN_BUNDLE_SUFFIX);
                            long currentTimeMillis = System.currentTimeMillis();
                            if (KoomFileUploader.compress(file.getAbsolutePath(), file2.getAbsolutePath())) {
                                KoomDebugger.getInstance().updateKoomCIPS(KoomDebugger.UPLOAD_ZIPS_RECORD, "compress_success: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())) + file.getName() + ", size:" + (file.length() / 1048576) + "MB, time:" + ((System.currentTimeMillis() - currentTimeMillis) / 1000.0d) + "s");
                                file.delete();
                                KoomFileUploader.uploadAccordingToFileSize(file2.length() / 1048576, file2, e.this);
                            } else {
                                KoomDebugger.getInstance().updateKoomCIPS(KoomDebugger.UPLOAD_ZIPS_RECORD, "compress_failed: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())) + file.getName() + ", size:" + (file.length() / 1048576) + "MB");
                                e.this.onFailure();
                            }
                        } else if (file.getName().endsWith(MRNBundleManager.MRN_BUNDLE_SUFFIX)) {
                            KoomDebugger.getInstance().updateKoomCIPS(KoomDebugger.UPLOAD_ZIPS_RECORD, "is_not_uploaded_zip: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())) + file.getName() + ", size:" + (file.length() / 1048576) + "MB");
                            KoomFileUploader.uploadAccordingToFileSize(file.length() / 1048576, file, e.this);
                        } else if (file.getName().endsWith(".log")) {
                            BufferedReader bufferedReader2 = null;
                            try {
                                try {
                                    bufferedReader = new BufferedReader(new FileReader(file.getAbsolutePath()));
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader = null;
                                }
                            } catch (IOException e) {
                                e = e;
                            }
                            try {
                                ArrayList<String> arrayList = new ArrayList<>();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    arrayList.add(readLine);
                                }
                                KoomDebugger.getInstance().updateKoomCIPS(KoomDebugger.C_LOG, arrayList);
                                file.delete();
                                IOUtils.close(bufferedReader);
                            } catch (IOException e2) {
                                e = e2;
                                bufferedReader2 = bufferedReader;
                                e.printStackTrace();
                                IOUtils.close(bufferedReader2);
                            } catch (Throwable th2) {
                                th = th2;
                                IOUtils.close(bufferedReader);
                                throw th;
                            }
                        } else if (file.getName().endsWith(".proxy")) {
                            file.delete();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void uploadAccordingToFileSize(long j, File file, e eVar) {
        Object[] objArr = {new Long(j), file, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f25ecc736bb6a5eec5d01d11cb607e93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f25ecc736bb6a5eec5d01d11cb607e93");
        } else if (j <= 20) {
            uploadZips(j, file, eVar);
        } else if (NetWorkUtils.isWifiConnected(Metrics.getInstance().getContext())) {
            uploadZips(j, file, eVar);
        } else {
            KoomDebugger koomDebugger = KoomDebugger.getInstance();
            koomDebugger.updateKoomCIPS(KoomDebugger.UPLOAD_ZIPS_RECORD, "zipFile_over_20M_and_no_wifi: " + file.getName() + ", size:" + j + "MB");
            eVar.onFailure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void uploadZips(final long j, final File file, final e eVar) {
        Object[] objArr = {new Long(j), file, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "272adb7352035db82c5ff9911b9b4ac6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "272adb7352035db82c5ff9911b9b4ac6");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        h.a.a.a(file, new e() { // from class: com.meituan.android.common.metricx.koom.KoomFileUploader.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.shadowsong.mss.e
            public final void onSuccess() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c2f984511b8e430ec5e3ae0161c54631", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c2f984511b8e430ec5e3ae0161c54631");
                    return;
                }
                KoomDebugger koomDebugger = KoomDebugger.getInstance();
                koomDebugger.updateKoomCIPS(KoomDebugger.UPLOAD_ZIPS_RECORD, "upload_success: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())) + file.getName() + ", size:" + j + "MB, time:" + ((System.currentTimeMillis() - currentTimeMillis) / 1000.0d) + "s");
                file.delete();
                eVar.onSuccess();
            }

            @Override // com.meituan.shadowsong.mss.e
            public final void onFailure() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "953be7b0d55df6f0f3f8d1c4bfcd7d99", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "953be7b0d55df6f0f3f8d1c4bfcd7d99");
                    return;
                }
                KoomDebugger.getInstance().updateKoomCIPS(KoomDebugger.UPLOAD_ZIPS_RECORD, "upload_failed: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())) + file.getName() + ", size:" + j + "MB");
                if (KoomFileUploader.uploadCount < 3) {
                    KoomFileUploader.uploadCount++;
                    KoomFileUploader.uploadZips(j, file, eVar);
                    return;
                }
                eVar.onFailure();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean compress(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.metricx.koom.KoomFileUploader.compress(java.lang.String, java.lang.String):boolean");
    }
}
