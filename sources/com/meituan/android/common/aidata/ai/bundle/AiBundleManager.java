package com.meituan.android.common.aidata.ai.bundle;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.AIDispatcher;
import com.meituan.android.common.aidata.ai.bundle.cache.AIDataBundleCacheManager;
import com.meituan.android.common.aidata.ai.bundle.cache.CacheException;
import com.meituan.android.common.aidata.ai.bundle.cache.LoadBundleResult;
import com.meituan.android.common.aidata.ai.bundle.download.BundleDownloader;
import com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException;
import com.meituan.android.common.aidata.ai.bundle.download.model.DownloadInfo;
import com.meituan.android.common.aidata.ai.bundle.download.record.DownloadRecord;
import com.meituan.android.common.aidata.ai.bundle.download.update.BundleInfo;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorService;
import com.meituan.android.common.aidata.ai.mlmodel.operator.producer.js.JSOperatorProducer;
import com.meituan.android.common.aidata.ai.utils.AiUtils;
import com.meituan.android.common.aidata.async.AsyncHashMap;
import com.meituan.android.common.aidata.feature.JSFeatureManager;
import com.meituan.android.common.aidata.monitor.LoganManager;
import com.meituan.android.common.aidata.resources.config.DDResourceRequest;
import com.meituan.android.common.aidata.resources.downloader.DDResRequest;
import com.meituan.android.common.aidata.resources.downloader.DDResResponse;
import com.meituan.android.common.aidata.resources.downloader.DDResResultCallback;
import com.meituan.android.common.aidata.utils.FileUtil;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AiBundleManager {
    public static final String TAG = "AiBundleManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile AiBundleManager sInstance;
    private volatile boolean hasInited;
    private volatile AIDataBundleCacheManager mAIDataBundleCacheManager;
    private volatile BundleDownloader mBundleDownloader;
    private final Map<String, LoadBundleResult> mBundleMemoryCacheMap;
    private final Map<String, ReentrantReadWriteLock> mLockMap;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface DownloadBundleCallback {
        void onError(Exception exc);

        void onLoadSuccess(AiBundle aiBundle);
    }

    private void onDownloadSuccess(DownloadInfo downloadInfo) {
    }

    @Deprecated
    public void asyncLoadBundle(String str, boolean z, String str2, AIDataBundleCacheManager.Callback callback) {
    }

    public AiBundleManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69d2410d08ee1d5b5138aac8c72732f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69d2410d08ee1d5b5138aac8c72732f9");
            return;
        }
        this.mBundleMemoryCacheMap = new AsyncHashMap();
        this.mLockMap = new AsyncHashMap();
        this.hasInited = false;
    }

    public static AiBundleManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54e74eefe22807df0fe13cad06fd5816", RobustBitConfig.DEFAULT_VALUE)) {
            return (AiBundleManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54e74eefe22807df0fe13cad06fd5816");
        }
        if (sInstance == null) {
            synchronized (AiBundleManager.class) {
                if (sInstance == null) {
                    sInstance = new AiBundleManager();
                }
            }
        }
        return sInstance;
    }

    public void setBundleDownloader(BundleDownloader bundleDownloader) {
        this.mBundleDownloader = bundleDownloader;
    }

    public BundleDownloader getBundleDownloader() {
        return this.mBundleDownloader;
    }

    public ReentrantReadWriteLock.WriteLock getWriteLockById(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffdfbbd2900b5484475cfb47f9478a1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReentrantReadWriteLock.WriteLock) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffdfbbd2900b5484475cfb47f9478a1a");
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.mLockMap.get(str);
        if (reentrantReadWriteLock != null) {
            return reentrantReadWriteLock.writeLock();
        }
        return null;
    }

    public void init(AiDownloadEnv aiDownloadEnv) {
        Object[] objArr = {aiDownloadEnv};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ff37c1dd11efa6e3e11e985a63ce41c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ff37c1dd11efa6e3e11e985a63ce41c");
        } else if (this.hasInited) {
        } else {
            this.mBundleDownloader = new BundleDownloader();
            this.mBundleDownloader.init("js", aiDownloadEnv == AiDownloadEnv.ONLINE ? AiDownloadEnv.ENV_ONLINE : "debug");
            this.mAIDataBundleCacheManager = new AIDataBundleCacheManager(aiDownloadEnv);
            this.hasInited = true;
        }
    }

    public void syncLoadBundle(String str, AIDataBundleCacheManager.Callback callback) {
        LoadBundleResult loadBundleResult;
        Object[] objArr = {str, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc6819e3da324dbf0fa1d90a8d800e25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc6819e3da324dbf0fa1d90a8d800e25");
        } else if (!this.hasInited) {
            if (callback != null) {
                callback.onFailure(new CacheException(CacheException.MANAGER_NOT_INIT));
            }
        } else {
            try {
                loadBundleResult = getNetBundleResult(str);
            } catch (Exception unused) {
                loadBundleResult = new LoadBundleResult();
                loadBundleResult.setNetErrorCode(10);
            }
            if (callback != null) {
                if (loadBundleResult != null && loadBundleResult.getBundle() != null) {
                    callback.onSuccess(loadBundleResult.getBundle());
                } else {
                    callback.onFailure(new CacheException(loadBundleResult == null ? CacheException.UNKNOWN_ERROR : loadBundleResult.getErrorCode()));
                }
            }
        }
    }

    @NonNull
    private LoadBundleResult getNetBundleResult(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ace77a7ea36bbe08e86dd91015e4d2c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (LoadBundleResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ace77a7ea36bbe08e86dd91015e4d2c3");
        }
        if (TextUtils.isEmpty(str)) {
            LoadBundleResult loadBundleResult = new LoadBundleResult();
            loadBundleResult.setNetErrorCode(0);
            return loadBundleResult;
        } else if (this.mBundleMemoryCacheMap.containsKey(str)) {
            LoadBundleResult loadBundleResult2 = this.mBundleMemoryCacheMap.get(str);
            if (loadBundleResult2 != null) {
                AiBundle bundle = loadBundleResult2.getBundle();
                if (bundle != null) {
                    bundle.loadFrom = 1;
                    return loadBundleResult2;
                }
                loadBundleResult2.setNetErrorCode(8);
                return loadBundleResult2;
            }
            LoadBundleResult loadBundleResult3 = new LoadBundleResult();
            loadBundleResult3.setNetErrorCode(7);
            return loadBundleResult3;
        } else {
            LoadBundleResult syncFindDebugBundle = AIDataDelegate.getInstance().isDebugEnable() ? this.mAIDataBundleCacheManager.syncFindDebugBundle(str) : null;
            if (syncFindDebugBundle == null || syncFindDebugBundle.getBundle() == null) {
                syncFindDebugBundle = this.mAIDataBundleCacheManager.syncFindCachedBundleById(str);
            }
            AiBundle bundle2 = syncFindDebugBundle.getBundle();
            if (bundle2 != null) {
                this.mBundleMemoryCacheMap.put(str, syncFindDebugBundle);
                bundle2.loadFrom = 2;
            }
            return syncFindDebugBundle;
        }
    }

    public void loadCEP(DDResourceRequest dDResourceRequest, DDResResultCallback dDResResultCallback) {
        Object[] objArr = {dDResourceRequest, dDResResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e95bbf62219ad35ace6d88ebaac672c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e95bbf62219ad35ace6d88ebaac672c2");
        } else if (dDResourceRequest == null) {
        } else {
            File cepCacheFile = getCepCacheFile(dDResourceRequest);
            if (cepCacheFile == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(dDResourceRequest.mResourcePackName);
                sb.append(CommonConstant.Symbol.COLON);
                sb.append(dDResourceRequest.mVer);
                sb.append(" ,not hit cache,start download");
                downloadCep(dDResourceRequest, dDResResultCallback);
                return;
            }
            syncLoadCep(dDResourceRequest, cepCacheFile, dDResResultCallback);
        }
    }

    private void syncLoadCep(DDResourceRequest dDResourceRequest, File file, DDResResultCallback dDResResultCallback) {
        Object[] objArr = {dDResourceRequest, file, dDResResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e356b53ae719ab2a9914ed55b76765e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e356b53ae719ab2a9914ed55b76765e");
        } else if (dDResResultCallback == null) {
        } else {
            if (!this.hasInited) {
                dDResResultCallback.onFail(new CacheException(CacheException.MANAGER_NOT_INIT));
                return;
            }
            if (file != null && file.exists() && file.isFile()) {
                String readFileAsString = FileUtil.readFileAsString(file.getAbsolutePath());
                if (!TextUtils.isEmpty(readFileAsString)) {
                    DDResResponse dDResResponse = new DDResResponse();
                    dDResResponse.addResponseBean(new DDResResponse.PackageBean(dDResourceRequest.mResourcePackName, dDResourceRequest.mVer, readFileAsString));
                    dDResResultCallback.onSuccess(dDResResponse);
                    StringBuilder sb = new StringBuilder();
                    sb.append(dDResourceRequest.mResourcePackName);
                    sb.append(CommonConstant.Symbol.COLON);
                    sb.append(dDResourceRequest.mVer);
                    sb.append(" ,syncLoadCep success,File Path : ");
                    sb.append(file.getAbsolutePath());
                    return;
                }
            }
            downloadCep(dDResourceRequest, dDResResultCallback);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dDResourceRequest.mResourcePackName);
            sb2.append(CommonConstant.Symbol.COLON);
            sb2.append(dDResourceRequest.mVer);
            sb2.append(" ,syncLoadCep not valid,start download");
        }
    }

    private void downloadCep(DDResourceRequest dDResourceRequest, DDResResultCallback dDResResultCallback) {
        Object[] objArr = {dDResourceRequest, dDResResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a84e5a2c9c3f38d009ec9f0df251932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a84e5a2c9c3f38d009ec9f0df251932");
        } else if (this.mBundleDownloader == null) {
            dDResResultCallback.onFail(new IllegalArgumentException("mBundleDownloader is null"));
        } else {
            this.mBundleDownloader.downloadCEP(dDResourceRequest, dDResResultCallback);
        }
    }

    public void cacheCepFile(File file, DDResRequest dDResRequest) {
        BundleDownloader bundleDownloader;
        Object[] objArr = {file, dDResRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7a40126193062c9594573089310cc3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7a40126193062c9594573089310cc3f");
        } else if (file == null || !file.exists() || dDResRequest == null || (bundleDownloader = getBundleDownloader()) == null) {
        } else {
            File file2 = new File(bundleDownloader.getDownloadCepFileDir(dDResRequest));
            if (!file2.exists()) {
                file2.mkdirs();
                StringBuilder sb = new StringBuilder("cacheCepFile dir = ");
                sb.append(dDResRequest.mResName);
                sb.append("not exist");
            }
            FileUtil.copyFileUsingStream(file, new File(file2, dDResRequest.mResVer));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dDResRequest.mResName);
            sb2.append(CommonConstant.Symbol.COLON);
            sb2.append(dDResRequest.mResVer);
            sb2.append(" ,copy cacheCepFile = ");
            sb2.append(new File(file2, dDResRequest.mResVer).getAbsolutePath());
        }
    }

    public void downloadTemplate(@NonNull BundleInfo bundleInfo, final DownloadBundleCallback downloadBundleCallback) {
        Object[] objArr = {bundleInfo, downloadBundleCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "708c1138bbce9127359c14a5eaf2ad6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "708c1138bbce9127359c14a5eaf2ad6f");
        } else if (this.mBundleDownloader == null) {
            downloadBundleCallback.onError(new IllegalArgumentException("mBundleDownloader is null"));
        } else {
            this.mBundleDownloader.downloadTemplate(bundleInfo, new BundleDownloader.Callback() { // from class: com.meituan.android.common.aidata.ai.bundle.AiBundleManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.ai.bundle.download.BundleDownloader.Callback
                public void onSuccess(DownloadInfo downloadInfo) {
                    Object[] objArr2 = {downloadInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "789f4554e4ab4226410780bd9cb59caa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "789f4554e4ab4226410780bd9cb59caa");
                        return;
                    }
                    if (LogUtil.isLogEnabled()) {
                        LogUtil.aiLogD(AiBundleManager.TAG + " downloadBundle success, name=" + downloadInfo.getBundleInfo().getDDBundleName() + ", version=" + downloadInfo.getBundleInfo().getBundleVersion());
                    }
                    AiBundleManager.this.mLockMap.remove(downloadInfo.getDownloadId());
                    DownloadRecord record = downloadInfo.getRecord();
                    if (record != null) {
                        record.reportSuccess();
                    }
                    final DownloadException downloadException = downloadInfo.getDownloadException();
                    AiBundleManager.this.mBundleMemoryCacheMap.remove(downloadInfo.getBundleInfo().getDDBundleName());
                    AiBundleManager.this.syncLoadBundle(downloadInfo.getBundleInfo().getDDBundleName(), new AIDataBundleCacheManager.Callback() { // from class: com.meituan.android.common.aidata.ai.bundle.AiBundleManager.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.aidata.ai.bundle.cache.AIDataBundleCacheManager.Callback
                        public void onSuccess(@NonNull AiBundle aiBundle) {
                            Object[] objArr3 = {aiBundle};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "40e2cb63f70d0ca4f18b5307e7662239", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "40e2cb63f70d0ca4f18b5307e7662239");
                                return;
                            }
                            if (downloadBundleCallback != null) {
                                downloadBundleCallback.onLoadSuccess(aiBundle);
                            }
                            if (LogUtil.isLogEnabled()) {
                                LogUtil.aiLogD("下载bundle后重新加载bundle成功-----bundleName: " + aiBundle.getCachedBundle().getBundleName() + " bundleVersion: " + aiBundle.getCachedBundle().getBundleVersion());
                            }
                        }

                        @Override // com.meituan.android.common.aidata.ai.bundle.cache.AIDataBundleCacheManager.Callback
                        public void onFailure(@NonNull CacheException cacheException) {
                            Object[] objArr3 = {cacheException};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "58d15cc79de0cdabe357cb1e42022c90", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "58d15cc79de0cdabe357cb1e42022c90");
                                return;
                            }
                            if (downloadException != null) {
                                cacheException = new CacheException(downloadException, CacheException.DOWNLOAD_BUNDLE_NOT_ZIP);
                            }
                            LoganManager.getInstance().recordLoadBundleError(cacheException, 1);
                            if (downloadBundleCallback != null) {
                                downloadBundleCallback.onError(cacheException);
                            }
                            String str = AiBundleManager.TAG;
                            LogUtil.aiLogE(str, "下载bundle后加载bundle失败" + cacheException.getErrorDesc());
                        }
                    });
                }

                @Override // com.meituan.android.common.aidata.ai.bundle.download.BundleDownloader.Callback
                public void onFailed(DownloadInfo downloadInfo, DownloadException downloadException) {
                    Object[] objArr2 = {downloadInfo, downloadException};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dde4f82794285fe0a84a536dd94e0adb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dde4f82794285fe0a84a536dd94e0adb");
                        return;
                    }
                    if (downloadBundleCallback != null) {
                        downloadBundleCallback.onError(downloadException);
                    }
                    if (downloadInfo == null || downloadInfo.getBundleInfo() == null) {
                        return;
                    }
                    String str = AiBundleManager.TAG;
                    StringBuilder sb = new StringBuilder(" downloadBundle fail, name=");
                    sb.append(downloadInfo.getBundleInfo().getDDBundleName());
                    sb.append(", version=");
                    sb.append(downloadInfo.getBundleInfo().getBundleVersion());
                    sb.append(", error=");
                    sb.append(downloadException);
                    LogUtil.aiLogE(str, sb.toString() == null ? StringUtil.NULL : downloadException.getMessage());
                    AiBundleManager.this.mLockMap.remove(downloadInfo.getDownloadId());
                    DownloadRecord record = downloadInfo.getRecord();
                    if (record != null) {
                        record.reportError();
                    }
                }
            });
        }
    }

    public void loadTemplate(@NonNull final BundleInfo bundleInfo, final DownloadBundleCallback downloadBundleCallback) {
        Object[] objArr = {bundleInfo, downloadBundleCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae75329eb41aee9f15cd49c5051f4aae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae75329eb41aee9f15cd49c5051f4aae");
        } else if (!hitCache(bundleInfo)) {
            downloadTemplate(bundleInfo, downloadBundleCallback);
        } else {
            syncLoadBundle(bundleInfo.getDDBundleName(), new AIDataBundleCacheManager.Callback() { // from class: com.meituan.android.common.aidata.ai.bundle.AiBundleManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.ai.bundle.cache.AIDataBundleCacheManager.Callback
                public void onSuccess(@NonNull AiBundle aiBundle) {
                    Object[] objArr2 = {aiBundle};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "81af9ea8a7137bf03c32da7c13625d2e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "81af9ea8a7137bf03c32da7c13625d2e");
                        return;
                    }
                    if (downloadBundleCallback != null) {
                        downloadBundleCallback.onLoadSuccess(aiBundle);
                    }
                    if (LogUtil.isLogEnabled()) {
                        LogUtil.aiLogD("加载缓存bundle成功------bundleName: " + aiBundle.getCachedBundle().getBundleName() + " bundleVersion: " + aiBundle.getCachedBundle().getBundleVersion());
                    }
                }

                @Override // com.meituan.android.common.aidata.ai.bundle.cache.AIDataBundleCacheManager.Callback
                public void onFailure(@NonNull CacheException cacheException) {
                    Object[] objArr2 = {cacheException};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3c10d41b5989bb3e00a6c1bd5bc00ccd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3c10d41b5989bb3e00a6c1bd5bc00ccd");
                        return;
                    }
                    LoganManager.getInstance().recordLoadBundleError(cacheException, 0);
                    AiBundleManager.this.downloadTemplate(bundleInfo, downloadBundleCallback);
                    if (LogUtil.isLogEnabled()) {
                        String str = AiBundleManager.TAG;
                        LogUtil.aiLogE(str, "加载缓存bundle失败-尝试重新下载-----bundleName: " + bundleInfo.getDDBundleName() + " bundleVersion: " + bundleInfo.getBundleVersion() + ", error : " + cacheException.getErrorDesc());
                    }
                }
            });
        }
    }

    public boolean registerBundle(String str, AiBundle aiBundle) {
        Object[] objArr = {str, aiBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "194cffa80b5d14b39fbb46e00e21e278", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "194cffa80b5d14b39fbb46e00e21e278")).booleanValue();
        }
        if (aiBundle != null) {
            aiBundle.setBiz(str);
        }
        if (aiBundle == null || aiBundle.getJsConfig() == null) {
            return true;
        }
        switch (aiBundle.getJsConfig().getBundleType()) {
            case 1:
                return registerOperatorBundle(str, aiBundle);
            case 2:
                return JSFeatureManager.getInstance().registerJSFeature(aiBundle);
            default:
                return true;
        }
    }

    private boolean registerOperatorBundle(String str, AiBundle aiBundle) {
        Object[] objArr = {str, aiBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efb5dae4038b558f348f06266f01d68c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efb5dae4038b558f348f06266f01d68c")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || aiBundle == null) {
            return false;
        }
        OperatorService.getInstance().getOperatorManager().registerOperatorProducer(new JSOperatorProducer(aiBundle));
        return true;
    }

    public void deleteBundle(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3eab98956a79cd9e6649ea87aeca1c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3eab98956a79cd9e6649ea87aeca1c10");
        } else if (bundleInfo == null || this.mBundleDownloader == null) {
        } else {
            String bundleDownloadDir = this.mBundleDownloader.getBundleDownloadDir();
            if (TextUtils.isEmpty(bundleDownloadDir)) {
                return;
            }
            File file = new File(bundleDownloadDir, bundleInfo.getDDBundleName() + File.separator + BundleUtil.getBundleFullName(bundleInfo));
            StringBuilder sb = new StringBuilder();
            sb.append(TAG);
            sb.append(" delete Bundle, bundle download dir=");
            sb.append(file);
            if (file.exists()) {
                AiUtils.deleteDir(file);
            }
        }
    }

    public LoadBundleResult removeCacheBundle(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1402abdbe183faa1593430c5d9f20714", RobustBitConfig.DEFAULT_VALUE)) {
            return (LoadBundleResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1402abdbe183faa1593430c5d9f20714");
        }
        if (bundleInfo == null) {
            return null;
        }
        unregisterBundle(bundleInfo);
        return this.mBundleMemoryCacheMap.remove(bundleInfo.getDDBundleName());
    }

    public void deleteDebugBundleFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e577f4409ac983c715fc42808a983e26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e577f4409ac983c715fc42808a983e26");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append(" deleteDebugBundle, bundleName=");
        sb.append(str);
        this.mAIDataBundleCacheManager.deleteDebugBundleFile(str);
    }

    public void initDebugBundle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dd9ce66c0cf342229e54a3cb45988fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dd9ce66c0cf342229e54a3cb45988fa");
            return;
        }
        for (Map.Entry<String, LoadBundleResult> entry : this.mBundleMemoryCacheMap.entrySet()) {
            AiBundle bundle = entry.getValue().getBundle();
            if (bundle != null) {
                bundle.resetDebugInstance();
            }
        }
    }

    public void unregisterBundle(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de32fcfd5f3175f827f852d2d3acd41d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de32fcfd5f3175f827f852d2d3acd41d");
        } else if (bundleInfo == null) {
        } else {
            String dDBundleName = bundleInfo.getDDBundleName();
            JSFeatureManager.getInstance().unregisterJSFeature(dDBundleName);
            OperatorService.getInstance().getOperatorManager().unregisterOperator(dDBundleName);
            AIDispatcher.getInstance().removeCache(bundleInfo);
        }
    }

    public boolean hitCache(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50eb26fd3e55b7446e87ecbaf41e3fb6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50eb26fd3e55b7446e87ecbaf41e3fb6")).booleanValue() : this.mBundleDownloader != null && this.mBundleDownloader.hitCache(bundleInfo);
    }

    public File getCepCacheFile(DDResourceRequest dDResourceRequest) {
        Object[] objArr = {dDResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8833672ff379c94873e3d98390f45a5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8833672ff379c94873e3d98390f45a5e");
        }
        if (this.mBundleDownloader != null) {
            return this.mBundleDownloader.getCepCacheFile(dDResourceRequest);
        }
        return null;
    }

    public void deleteCepFile(DDResourceRequest dDResourceRequest) {
        BundleDownloader bundleDownloader;
        Object[] objArr = {dDResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18983fa982ccd4db7cc5014ef49b8909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18983fa982ccd4db7cc5014ef49b8909");
        } else if (dDResourceRequest == null || (bundleDownloader = getBundleDownloader()) == null) {
        } else {
            StringBuilder sb = new StringBuilder("delete cep file : ");
            sb.append(bundleDownloader.getDownloadCepFileDir(dDResourceRequest));
            sb.append(File.separator);
            sb.append(dDResourceRequest.mVer);
            FileUtil.delFile(new File(bundleDownloader.getDownloadCepFileDir(dDResourceRequest) + File.separator + dDResourceRequest.mVer));
        }
    }
}
