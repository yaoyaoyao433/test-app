package com.meituan.android.common.aidata.ai.bundle.cache;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.ai.bundle.AiBundleManager;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.meituan.android.common.aidata.ai.bundle.download.BundleDownloader;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.bundle.model.CachedBundle;
import com.meituan.android.common.aidata.ai.utils.AiUtils;
import com.meituan.android.common.aidata.utils.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FilenameFilter;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AIDataBundleCacheManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AiDownloadEnv mAiDownloadEnv;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface Callback {
        void onFailure(@NonNull CacheException cacheException);

        void onSuccess(@NonNull AiBundle aiBundle);
    }

    public AIDataBundleCacheManager(AiDownloadEnv aiDownloadEnv) {
        Object[] objArr = {aiDownloadEnv};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "841562eb6f4b9af3c51b5e532fe2f75f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "841562eb6f4b9af3c51b5e532fe2f75f");
        } else {
            this.mAiDownloadEnv = aiDownloadEnv;
        }
    }

    @NonNull
    public LoadBundleResult syncFindCachedBundleById(String str) {
        BundleDownloader bundleDownloader;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17d3b0efe2c0a3ffacf9b0c575d18b1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (LoadBundleResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17d3b0efe2c0a3ffacf9b0c575d18b1c");
        }
        LoadBundleResult loadBundleResult = new LoadBundleResult();
        if (TextUtils.isEmpty(str)) {
            loadBundleResult.setNetErrorCode(0);
            return loadBundleResult;
        }
        AiBundleManager aiBundleManager = AiBundleManager.getInstance();
        if (!isLocalExist(str) && (bundleDownloader = aiBundleManager.getBundleDownloader()) != null && bundleDownloader.isDownloading(str)) {
            loadBundleResult.setNetErrorCode(3);
            return loadBundleResult;
        }
        File[] listFiles = new File(getBundleFilePath()).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            loadBundleResult.setNetErrorCode(4);
            return loadBundleResult;
        }
        for (File file : listFiles) {
            if (str.equals(file.getName())) {
                return parseCachedBundle(file, loadBundleResult, str);
            }
        }
        loadBundleResult.setNetErrorCode(5);
        return loadBundleResult;
    }

    public LoadBundleResult syncFindDebugBundle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95d701d711b83fdf7f1b26bc9f32075a", RobustBitConfig.DEFAULT_VALUE)) {
            return (LoadBundleResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95d701d711b83fdf7f1b26bc9f32075a");
        }
        LoadBundleResult loadBundleResult = new LoadBundleResult();
        if (TextUtils.isEmpty(str)) {
            loadBundleResult.setNetErrorCode(0);
            return loadBundleResult;
        }
        File[] listFiles = new File(getDebugBundleFilePath()).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            loadBundleResult.setNetErrorCode(4);
            return loadBundleResult;
        }
        for (File file : listFiles) {
            if (file != null && str.equals(file.getName())) {
                return parseCachedBundle(file, loadBundleResult, str);
            }
        }
        loadBundleResult.setNetErrorCode(5);
        return loadBundleResult;
    }

    @NonNull
    private String getBundleFilePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff71739e62ec047566eca8c06e704297", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff71739e62ec047566eca8c06e704297");
        }
        if (AiDownloadEnv.ONLINE.equals(this.mAiDownloadEnv)) {
            Context context = AIData.getContext();
            return q.a(context, Constants.SDK_LOG_TAG, AiDownloadEnv.AI_ROOT_DIR + File.separator + "js" + File.separator + AiDownloadEnv.ENV_ONLINE).getAbsolutePath();
        } else if (AiDownloadEnv.DEBUG.equals(this.mAiDownloadEnv)) {
            Context context2 = AIData.getContext();
            return q.a(context2, Constants.SDK_LOG_TAG, AiDownloadEnv.AI_ROOT_DIR + File.separator + "js" + File.separator + "debug").getAbsolutePath();
        } else {
            throw new IllegalArgumentException("查询MachBundle缓存异常，请指定Env环境参数！");
        }
    }

    public String getDebugBundleFilePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf0425a1a18cfd8fe44639cbcfe47587", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf0425a1a18cfd8fe44639cbcfe47587");
        }
        Context context = AIData.getContext();
        return q.a(context, Constants.SDK_LOG_TAG, AiDownloadEnv.AI_ROOT_DIR + File.separator + AiDownloadEnv.AI_DEBUG_BUNDLE_DIR + File.separator).getAbsolutePath();
    }

    private LoadBundleResult parseCachedBundle(File file, LoadBundleResult loadBundleResult, String str) {
        Object[] objArr = {file, loadBundleResult, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1a89c6856dc593c72e80700ce16589a", RobustBitConfig.DEFAULT_VALUE)) {
            return (LoadBundleResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1a89c6856dc593c72e80700ce16589a");
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            int length = listFiles.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                File file2 = listFiles[i];
                if (file2 != null && file2.isDirectory() && !AiUtils.isDirHasDeleteFlag(file2)) {
                    String[] split = file2.getName().split("@");
                    if (split.length < 2) {
                        loadBundleResult.setNetErrorCode(5);
                    } else {
                        CachedBundle cachedBundle = new CachedBundle();
                        cachedBundle.setBundleName(split[0]);
                        cachedBundle.setBundleVersion(split[1]);
                        cachedBundle.setBundleFilePath(file2.getAbsolutePath());
                        File[] listFiles2 = file2.listFiles();
                        if (listFiles2 != null && listFiles2.length > 0) {
                            for (File file3 : listFiles2) {
                                if (AiDownloadEnv.FILE_NAME_JS.equals(file3.getName())) {
                                    cachedBundle.setJsFilePath(file3.getAbsolutePath());
                                } else if (AiDownloadEnv.FILE_NAME_ENV_JSON.equals(file3.getName())) {
                                    cachedBundle.setEnvFilePath(file3.getAbsolutePath());
                                } else if (AiDownloadEnv.FILE_NAME_DATA_CVS.equals(file3.getName())) {
                                    cachedBundle.setDataFilePath(file3.getAbsolutePath());
                                } else if (AiDownloadEnv.FILE_NAME_JS_CONFIG.equals(file3.getName())) {
                                    cachedBundle.setJsConfigFilePath(file3.getAbsolutePath());
                                } else if (AiDownloadEnv.FILE_NAME_AUTO_RUN_STRATEGY.equals(file3.getName())) {
                                    cachedBundle.setAutoRunStrategyPath(file3.getAbsolutePath());
                                } else if ("model".equals(file3.getName())) {
                                    cachedBundle.setModelFilePath(file3.getAbsolutePath());
                                } else if (AiDownloadEnv.FILE_NAME_MODEL_CONFIG.equals(file3.getName())) {
                                    cachedBundle.setModelConfigFilePath(file3.getAbsolutePath());
                                } else if (AiDownloadEnv.FILE_NAME_MODEL_FEATURE_CONFIG.equals(file3.getName())) {
                                    cachedBundle.setFeatureConfigFilePath(file3.getAbsolutePath());
                                } else if (AiDownloadEnv.FILE_NAME_MODEL_TENSOR_CONFIG.equals(file3.getName())) {
                                    cachedBundle.setTensorConfigFilePath(file3.getAbsolutePath());
                                } else if (AiDownloadEnv.FILE_NAME_MODEL_POST_PROCESS.equals(file3.getName())) {
                                    cachedBundle.setModelPostProcessFilePath(file3.getAbsolutePath());
                                } else if (AiDownloadEnv.FILE_NAME_MODEL_AUTO_PREDICT.equals(file3.getName())) {
                                    cachedBundle.setAutoPredictFilePath(file3.getAbsolutePath());
                                }
                            }
                        }
                        if (!cachedBundle.isBundleValid()) {
                            loadBundleResult.setNetErrorCode(9);
                        } else {
                            loadBundleResult.setBundle(new AiBundle(cachedBundle));
                            break;
                        }
                    }
                }
                i++;
            }
        } else {
            loadBundleResult.setNetErrorCode(4);
        }
        return loadBundleResult;
    }

    public boolean isLocalExist(String str) {
        File[] listFiles;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f837ac300554f815ef4949b2bf6ec0e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f837ac300554f815ef4949b2bf6ec0e")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(getBundleFilePath());
        if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (str.equals(file2.getName())) {
                    return checkTemplateFileValidity(file2);
                }
            }
        }
        return false;
    }

    private boolean checkTemplateFileValidity(File file) {
        File[] listFiles;
        File[] listFiles2;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe3a520184b7649a3042ee8468bca381", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe3a520184b7649a3042ee8468bca381")).booleanValue();
        }
        if (file == null || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2 != null && file2.isDirectory() && !AiUtils.isDirHasDeleteFlag(file2) && (listFiles2 = file2.listFiles(new FilenameFilter() { // from class: com.meituan.android.common.aidata.ai.bundle.cache.AIDataBundleCacheManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.io.FilenameFilter
                public boolean accept(File file3, String str) {
                    Object[] objArr2 = {file3, str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "479d757e5045801097c4e4a7762211fd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "479d757e5045801097c4e4a7762211fd")).booleanValue() : str.equals(AiDownloadEnv.FILE_NAME_JS) || str.equals(AiDownloadEnv.FILE_NAME_MODEL_CONFIG);
                }
            })) != null && listFiles2.length > 0) {
                return true;
            }
        }
        return false;
    }

    public void deleteDebugBundleFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25b5e9ae84873124fb99b5cce571c795", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25b5e9ae84873124fb99b5cce571c795");
            return;
        }
        File file = new File(getDebugBundleFilePath());
        if (file.exists()) {
            deleteBundle(file, str);
        }
    }

    public static void deleteBundle(File file, String str) {
        File[] listFiles;
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f81b2a4bb1120b7b5b664d94bb65ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f81b2a4bb1120b7b5b664d94bb65ad7");
        } else if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.getName().equals(str)) {
                    if (file2.isDirectory()) {
                        AiUtils.deleteDir(file2);
                    } else {
                        file2.delete();
                    }
                } else {
                    deleteBundle(file2, str);
                }
            }
        }
    }
}
