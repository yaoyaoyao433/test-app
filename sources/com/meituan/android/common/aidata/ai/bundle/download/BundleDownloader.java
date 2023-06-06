package com.meituan.android.common.aidata.ai.bundle.download;

import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.ai.bundle.AiBundleManager;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.meituan.android.common.aidata.ai.bundle.BundleUtil;
import com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException;
import com.meituan.android.common.aidata.ai.bundle.download.model.DownloadInfo;
import com.meituan.android.common.aidata.ai.bundle.download.record.DownloadRecord;
import com.meituan.android.common.aidata.ai.bundle.download.record.RecordInfo;
import com.meituan.android.common.aidata.ai.bundle.download.update.BundleInfo;
import com.meituan.android.common.aidata.ai.utils.AiUtils;
import com.meituan.android.common.aidata.ai.utils.ZipUtil;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.resources.config.DDResourceRequest;
import com.meituan.android.common.aidata.resources.downloader.DDResLoader;
import com.meituan.android.common.aidata.resources.downloader.DDResRawResultCallback;
import com.meituan.android.common.aidata.resources.downloader.DDResRequest;
import com.meituan.android.common.aidata.resources.downloader.DDResResultCallback;
import com.meituan.android.common.aidata.utils.Constants;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BundleDownloader {
    private static final String TAG = AiBundleManager.TAG;
    public static ChangeQuickRedirect changeQuickRedirect;
    protected String envName;
    private Map<String, List<DownloadInfo>> mDownloadInfoMap;
    protected ConcurrentHashMap<String, DownloadInfo> mDownloadMaps;
    protected String mInitFileDir;
    protected String storageDir;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface Callback {
        void onFailed(DownloadInfo downloadInfo, DownloadException downloadException);

        void onSuccess(DownloadInfo downloadInfo);
    }

    public boolean hasPermission() {
        return true;
    }

    public void init(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4af8f9538837c6d433324f53a2b84348", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4af8f9538837c6d433324f53a2b84348");
            return;
        }
        this.storageDir = str;
        this.envName = str2;
        setupEnvironment();
    }

    public BundleDownloader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ba157f0df84f640ea5dd331af79b3f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ba157f0df84f640ea5dd331af79b3f6");
            return;
        }
        this.mDownloadInfoMap = new ConcurrentHashMap();
        this.mDownloadMaps = new ConcurrentHashMap<>();
    }

    public void downloadTemplate(@NonNull BundleInfo bundleInfo, Callback callback) {
        Object[] objArr = {bundleInfo, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d70c5882d9be4b18875837d5f56f3dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d70c5882d9be4b18875837d5f56f3dd");
        } else if (!checkBundleValid(bundleInfo)) {
            if (callback != null) {
                callback.onFailed(null, new DownloadException(new Exception("bundle info is illegal")));
            }
        } else if (TextUtils.isEmpty(bundleInfo.getJsId())) {
            if (callback != null) {
                callback.onFailed(null, new DownloadException(new Exception("bundle name is null")));
            }
        } else {
            DownloadInfo downloadInfo = new DownloadInfo(bundleInfo, getDownloadFileDir(bundleInfo), callback);
            this.mDownloadMaps.put(bundleInfo.getJsId(), downloadInfo);
            DownloadRecord create = DownloadRecord.create(null, false);
            create.setTemplateId(bundleInfo.getJsId());
            downloadInfo.setRecord(create);
            downloadFile(downloadInfo, create);
        }
    }

    public String getDownloadFileDir(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "008484e973148f6b61a535c074065cea", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "008484e973148f6b61a535c074065cea");
        }
        File file = new File(this.mInitFileDir, bundleInfo.getJsId());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public String getDownloadCepFileDir(@NonNull DDResRequest dDResRequest) {
        Object[] objArr = {dDResRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18faf59f29061a2a41f38ac5b6e2ad5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18faf59f29061a2a41f38ac5b6e2ad5f");
        }
        File file = new File(this.mInitFileDir, dDResRequest.mResName);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public void setupEnvironment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f92b81a271869eb1fbc42c803f999115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f92b81a271869eb1fbc42c803f999115");
        } else if (TextUtils.isEmpty(this.mInitFileDir)) {
            Context context = AIData.getContext();
            this.mInitFileDir = q.a(context, Constants.SDK_LOG_TAG, AiDownloadEnv.AI_ROOT_DIR + File.separator + this.storageDir + File.separator + this.envName + File.separator).getAbsolutePath();
            new StringBuilder("BundleDownloader-->setupEnvironment，下载的根目录为:").append(this.mInitFileDir);
        }
    }

    private boolean checkBundleValid(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06fd8042beeaa74dadc7f2cacec82a69", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06fd8042beeaa74dadc7f2cacec82a69")).booleanValue() : (bundleInfo == null || TextUtils.isEmpty(bundleInfo.getDDBundleName()) || !checkBundleVersion(bundleInfo)) ? false : true;
    }

    private boolean checkBundleVersion(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06590038ea2ae5b683237c845faf1539", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06590038ea2ae5b683237c845faf1539")).booleanValue() : (TextUtils.isEmpty(bundleInfo.getBundleVersion()) && TextUtils.isEmpty(bundleInfo.getVersion())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void callbackOnFail(DownloadInfo downloadInfo, DownloadException downloadException, DownloadRecord downloadRecord) {
        Object[] objArr = {downloadInfo, downloadException, downloadRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e090beb68feb319c3920b777c4c1ac47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e090beb68feb319c3920b777c4c1ac47");
            return;
        }
        if (downloadInfo != null) {
            downloadInfo.notifyCallbackOnFail(downloadException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void callbackOnSuccess(DownloadInfo downloadInfo, DownloadRecord downloadRecord) {
        Object[] objArr = {downloadInfo, downloadRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cc3c60d1ebc2035f4677d585e34db97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cc3c60d1ebc2035f4677d585e34db97");
            return;
        }
        if (downloadInfo != null) {
            downloadInfo.notifyCallbackOnSuccess();
        }
    }

    public void deleteTempFile(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d4f1a3c0f04efc7983016b065efc931", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d4f1a3c0f04efc7983016b065efc931");
        } else if (file == null || !file.exists()) {
        } else {
            file.delete();
        }
    }

    public void deleteUnzipDir(File file, DownloadInfo downloadInfo) {
        File[] listFiles;
        Object[] objArr = {file, downloadInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23f0fb1dad9c5d6c56817cf2902f7f20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23f0fb1dad9c5d6c56817cf2902f7f20");
            return;
        }
        String unzipFilePath = ZipUtil.getUnzipFilePath(file, downloadInfo);
        if (!TextUtils.isEmpty(unzipFilePath)) {
            File file2 = new File(unzipFilePath);
            if (file2.exists()) {
                AiUtils.deleteDir(file2);
            }
        }
        if (TextUtils.isEmpty(downloadInfo.getDownloadDirPath())) {
            return;
        }
        File file3 = new File(downloadInfo.getDownloadDirPath());
        if (file3.exists() && (listFiles = file3.listFiles()) != null && listFiles.length == 0) {
            file3.delete();
        }
    }

    public boolean isDownloadFileValid(DownloadInfo downloadInfo) {
        Object[] objArr = {downloadInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "522ed2568d26e9845bf6a81746929973", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "522ed2568d26e9845bf6a81746929973")).booleanValue();
        }
        File[] listFiles = new File(downloadInfo.getUnzipDirPath()).listFiles(new FilenameFilter() { // from class: com.meituan.android.common.aidata.ai.bundle.download.BundleDownloader.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                Object[] objArr2 = {file, str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1ba7ff2250ebeba98d6215687c06e378", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1ba7ff2250ebeba98d6215687c06e378")).booleanValue() : str.equals(AiDownloadEnv.FILE_NAME_JS) || str.equals(AiDownloadEnv.FILE_NAME_MODEL_CONFIG);
            }
        });
        return (listFiles == null || listFiles.length == 0 || listFiles[0].length() == 0) ? false : true;
    }

    public void deleteOtherBundles(DownloadInfo downloadInfo) {
        Object[] objArr = {downloadInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3ac868e38f82822fbdddd5bd3bcebea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3ac868e38f82822fbdddd5bd3bcebea");
            return;
        }
        BundleInfo bundleInfo = downloadInfo.getBundleInfo();
        File file = new File(downloadInfo.getUnzipDirPath());
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles == null || file.length() <= 1) {
            return;
        }
        for (File file2 : listFiles) {
            if (!TextUtils.equals(file2.getName(), BundleUtil.getBundleFullName(bundleInfo))) {
                AiUtils.setDirDeleteFlag(file2);
            }
        }
    }

    public boolean isDownloading(String str) {
        DownloadInfo downloadInfo;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c49fd1e47e63d3dd52089b73723b8d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c49fd1e47e63d3dd52089b73723b8d1")).booleanValue();
        }
        if (this.mDownloadMaps.containsKey(str) && (downloadInfo = this.mDownloadMaps.get(str)) != null) {
            return downloadInfo.isDownloading();
        }
        return false;
    }

    public void downloadCEP(DDResourceRequest dDResourceRequest, DDResResultCallback dDResResultCallback) {
        Object[] objArr = {dDResourceRequest, dDResResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "189242d650f607838da87193aed1a96c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "189242d650f607838da87193aed1a96c");
        } else {
            DDResLoader.getInstance().loadResource(dDResourceRequest, dDResResultCallback);
        }
    }

    public void downloadFile(final DownloadInfo downloadInfo, final DownloadRecord downloadRecord) {
        Object[] objArr = {downloadInfo, downloadRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1799d07a9630d408003d2c4bd18e6545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1799d07a9630d408003d2c4bd18e6545");
            return;
        }
        downloadInfo.updateStatus(1001);
        DDResLoader.getInstance().loadResource(new DDResRequest(downloadInfo.getBundleInfo().getDDBundleName(), downloadInfo.getBundleInfo().getBundleVersion()), new DDResRawResultCallback() { // from class: com.meituan.android.common.aidata.ai.bundle.download.BundleDownloader.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.resources.downloader.DDResRawResultCallback
            public void onSuccess(DDResource dDResource) {
                Object[] objArr2 = {dDResource};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1140270061114c4a2f19d8f432b2fc12", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1140270061114c4a2f19d8f432b2fc12");
                } else if (dDResource == null) {
                    onFail(new IllegalArgumentException("download success with null response"));
                } else {
                    BundleDownloader.this.unzipFile(dDResource, downloadInfo, downloadRecord);
                }
            }

            @Override // com.meituan.android.common.aidata.resources.downloader.DDResRawResultCallback
            public void onFail(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ad636e678b12bbd1c7eff5e8c8e9ead9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ad636e678b12bbd1c7eff5e8c8e9ead9");
                    return;
                }
                DownloadException downloadException = new DownloadException(exc, exc instanceof IOException ? DownloadException.NET_ERROR : DownloadException.UN_KNOWN);
                downloadInfo.updateStatus(1004, downloadException);
                if (downloadRecord != null) {
                    RecordInfo.Builder trace = new RecordInfo.Builder().trace("BundleDownloader-->innerDownload-->onResponse");
                    downloadRecord.add(trace.desc("网络连接失败，详情::" + downloadException.getErrorDesc()).build());
                }
                BundleDownloader.this.callbackOnFail(downloadInfo, downloadException, downloadRecord);
            }
        });
    }

    public synchronized void unzipFile(DDResource dDResource, final DownloadInfo downloadInfo, final DownloadRecord downloadRecord) {
        Object[] objArr = {dDResource, downloadInfo, downloadRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dae407ccc49f4ac3a13ba50b5cc13d59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dae407ccc49f4ac3a13ba50b5cc13d59");
            return;
        }
        final File file = new File(dDResource.getLocalPath());
        try {
            downloadInfo.updateStatus(1003);
            if (downloadRecord != null) {
                downloadRecord.add(new RecordInfo.Builder().trace("BundleDownloader-->saveToLocalFile").desc("模板下载完成，开始解压").build());
            }
            if (ZipUtil.isZipFile(file)) {
                downloadInfo.setZipFile(true);
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                ZipUtil.unZipFile(file, downloadInfo, ZipUtil.getUnzipFilePath2(downloadInfo), new ZipUtil.Callback() { // from class: com.meituan.android.common.aidata.ai.bundle.download.BundleDownloader.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.ai.utils.ZipUtil.Callback
                    public void unzipSuccess() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "08b536daf1728177f97a1c9772de3842", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "08b536daf1728177f97a1c9772de3842");
                            return;
                        }
                        CatMonitorManager.getInstance().reportUnzipResult(downloadInfo.getBundleInfo().getDDBundleName(), downloadInfo.getBundleInfo().getBundleVersion(), SystemClock.elapsedRealtime() - elapsedRealtime, null);
                        if (BundleDownloader.this.isDownloadFileValid(downloadInfo)) {
                            BundleDownloader.this.deleteOtherBundles(downloadInfo);
                            AiUtils.recursiveClearDirDeleteFlag(new File(downloadInfo.getUnzipDirPath()));
                            downloadInfo.updateStatus(1005);
                            if (downloadRecord != null) {
                                RecordInfo.Builder trace = new RecordInfo.Builder().trace("BundleDownloader-->saveToLocalFile#unzipSuccess");
                                downloadRecord.add(trace.desc("模板解压成功，源文件[" + file.getName() + "]删除成功").build());
                            }
                            BundleDownloader.this.callbackOnSuccess(downloadInfo, downloadRecord);
                            return;
                        }
                        BundleDownloader.this.deleteUnzipDir(file, downloadInfo);
                        if (downloadRecord != null) {
                            downloadRecord.add(new RecordInfo.Builder().trace("BundleDownloader-->saveToLocalFile#unzipSuccess").desc("模板解压成功，但是解压后的main.js文件无效").build());
                        }
                        BundleDownloader.this.callbackOnFail(downloadInfo, new DownloadException((int) DownloadException.UN_FOUND_FILE), downloadRecord);
                    }

                    @Override // com.meituan.android.common.aidata.ai.utils.ZipUtil.Callback
                    public void unzipFailed(Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2a28bfc2cb64c79f6c52170725e4a7bf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2a28bfc2cb64c79f6c52170725e4a7bf");
                            return;
                        }
                        CatMonitorManager.getInstance().reportUnzipResult(downloadInfo.getBundleInfo().getDDBundleName(), downloadInfo.getBundleInfo().getBundleVersion(), SystemClock.elapsedRealtime() - elapsedRealtime, new BlueException(exc, BaseRaptorUploader.ERROR_UNZIP_FAILED));
                        BundleDownloader.this.deleteTempFile(file);
                        BundleDownloader.this.deleteUnzipDir(file, downloadInfo);
                        DownloadException downloadException = new DownloadException(exc, (int) DownloadException.UNZIP_ERROR);
                        downloadInfo.updateStatus(1006, downloadException);
                        if (downloadRecord != null) {
                            RecordInfo.Builder trace = new RecordInfo.Builder().trace("BundleDownloader-->saveToLocalFile#unzipFailed");
                            downloadRecord.add(trace.desc("模板解压失败，原因::" + Log.getStackTraceString(exc)).build());
                        }
                        BundleDownloader.this.callbackOnFail(downloadInfo, downloadException, downloadRecord);
                    }
                });
                return;
            }
            downloadInfo.setZipFile(false);
            if (downloadRecord != null) {
                RecordInfo.Builder trace = new RecordInfo.Builder().trace("BundleDownloader-->saveToLocalFile");
                downloadRecord.add(trace.desc("下载文件[" + downloadInfo.getName() + "]不是ZIP文件，下载完成").build());
            }
            downloadInfo.updateStatus(1007, new DownloadException((int) DownloadException.UNZIP_NOT_ZIP_FILE));
            callbackOnSuccess(downloadInfo, downloadRecord);
        } catch (Exception e) {
            deleteTempFile(file);
            deleteUnzipDir(file, downloadInfo);
            DownloadException downloadException = new DownloadException(e, (int) DownloadException.UN_KNOWN);
            downloadInfo.updateStatus(1004, downloadException);
            if (downloadRecord != null) {
                RecordInfo.Builder trace2 = new RecordInfo.Builder().trace("BundleDownloader-->saveToLocalFile");
                downloadRecord.add(trace2.desc("模板下载失败，原因::" + Log.getStackTraceString(e)).build());
            }
            callbackOnFail(downloadInfo, downloadException, downloadRecord);
        }
    }

    public String getBundleDownloadDir() {
        return this.mInitFileDir;
    }

    public boolean hitCache(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77e59c5351f8960af683632baeb18852", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77e59c5351f8960af683632baeb18852")).booleanValue();
        }
        if (bundleInfo == null) {
            return false;
        }
        String str = getDownloadFileDir(bundleInfo) + File.separator + bundleInfo.getDDBundleName() + "@" + bundleInfo.getBundleVersion();
        return (new File(str, AiDownloadEnv.FILE_NAME_JS).exists() && new File(str, AiDownloadEnv.FILE_NAME_JS_CONFIG).exists()) || (new File(str, "model").exists() && new File(str, AiDownloadEnv.FILE_NAME_MODEL_CONFIG).exists());
    }

    @Nullable
    public File getCepCacheFile(DDResourceRequest dDResourceRequest) {
        Object[] objArr = {dDResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "848fb96c604479b7ea6fe043b5e71b46", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "848fb96c604479b7ea6fe043b5e71b46");
        }
        if (dDResourceRequest != null) {
            File file = new File(getDownloadCepFileDir(dDResourceRequest) + File.separator + dDResourceRequest.mVer);
            if (file.exists() && file.isFile()) {
                StringBuilder sb = new StringBuilder();
                sb.append(dDResourceRequest.mResourcePackName);
                sb.append(CommonConstant.Symbol.COLON);
                sb.append(dDResourceRequest.mVer);
                sb.append(" ,get cache file path : ");
                sb.append(file.getAbsolutePath());
                return file;
            }
            return null;
        }
        return null;
    }
}
