package com.meituan.android.common.aidata.ai.bundle.download.model;

import android.os.SystemClock;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.bundle.TimeoutHandler;
import com.meituan.android.common.aidata.ai.bundle.download.BundleDownloader;
import com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException;
import com.meituan.android.common.aidata.ai.bundle.download.record.DownloadRecord;
import com.meituan.android.common.aidata.ai.bundle.download.update.BundleInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DownloadInfo {
    public static final int DOWNLOAD_FAILED = 1004;
    public static final int DOWNLOAD_ING = 1002;
    public static final int DOWNLOAD_INIT = 1000;
    public static final int DOWNLOAD_START = 1001;
    public static final int DOWNLOAD_SUCCESS = 1003;
    public static final String TAG = "DownloadInfo";
    public static final int UNZIP_FAILED = 1006;
    public static final int UNZIP_NOT_ZIP_FILE = 1007;
    public static final int UNZIP_SUCCESS = 1005;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String downloadDirPath;
    @Nullable
    private DownloadException downloadException;
    private boolean isTimeout;
    private BundleInfo mBundleInfo;
    private Set<BundleDownloader.Callback> mCallbackList;
    private int mDownloadProgress;
    private DownloadStatusListener mDownloadStatusListener;
    private long mDownloadTimeMills;
    private boolean mIsZipFile;
    private DownloadRecord mRecord;
    private int mStatus;
    private TimeoutHandler.Listener mTimeoutListener;
    private long markEndTimeMills;
    private long markStartTimeMills;
    private String unzipDirPath;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface DownloadStatusListener {
        void onDownloadFail(DownloadException downloadException);

        void onDownloadStart();

        void onDownloadSuccess();

        void onDownloading(int i);

        void onUnZipFail(DownloadException downloadException);

        void onUnZipSuccess();
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Status {
    }

    public DownloadRecord getRecord() {
        return this.mRecord;
    }

    public void setRecord(DownloadRecord downloadRecord) {
        this.mRecord = downloadRecord;
    }

    public void setDownloadStatusListener(DownloadStatusListener downloadStatusListener) {
        this.mDownloadStatusListener = downloadStatusListener;
    }

    public String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4942f9c896969f64f866fe8211b77d9c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4942f9c896969f64f866fe8211b77d9c") : this.mBundleInfo.getUrl();
    }

    public int getDownloadProgress() {
        return this.mDownloadProgress;
    }

    public void updateStatus(int i, DownloadException downloadException) {
        Object[] objArr = {Integer.valueOf(i), downloadException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab484594d8cf5b9e36487d3eee3fa0e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab484594d8cf5b9e36487d3eee3fa0e1");
            return;
        }
        this.downloadException = downloadException;
        updateStatus(i);
    }

    public void updateStatus(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5e3a774c7ff58a6ef906eb97d8e12cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5e3a774c7ff58a6ef906eb97d8e12cb");
        } else if (this.mStatus < i) {
            this.mStatus = i;
            if (i == 1001) {
                this.markStartTimeMills = SystemClock.uptimeMillis();
                if (this.mDownloadStatusListener != null) {
                    this.mDownloadStatusListener.onDownloadStart();
                }
            } else if (this.mIsZipFile) {
                if (i == 1005) {
                    this.markEndTimeMills = SystemClock.uptimeMillis();
                    this.mDownloadTimeMills = System.currentTimeMillis();
                    if (this.mDownloadStatusListener != null) {
                        this.mDownloadStatusListener.onUnZipSuccess();
                    }
                } else if (i == 1006) {
                    this.markEndTimeMills = SystemClock.uptimeMillis();
                    this.mDownloadTimeMills = System.currentTimeMillis();
                    if (this.mDownloadStatusListener != null) {
                        this.mDownloadStatusListener.onUnZipFail(this.downloadException);
                    }
                }
            } else if (i == 1003) {
                this.markEndTimeMills = SystemClock.uptimeMillis();
                this.mDownloadTimeMills = System.currentTimeMillis();
                if (this.mDownloadStatusListener != null) {
                    this.mDownloadStatusListener.onDownloadSuccess();
                }
            } else if (i == 1004) {
                this.markEndTimeMills = SystemClock.uptimeMillis();
                this.mDownloadTimeMills = System.currentTimeMillis();
                if (this.mDownloadStatusListener != null) {
                    this.mDownloadStatusListener.onDownloadFail(this.downloadException);
                }
            }
        }
    }

    public void setDownloadProgress(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3774b533ef2fe302e7da2c57a0a1701c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3774b533ef2fe302e7da2c57a0a1701c");
            return;
        }
        this.mDownloadProgress = i;
        if (this.mDownloadStatusListener != null) {
            this.mDownloadStatusListener.onDownloading(i);
        }
    }

    public void notifyCallbackOnSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be1c88790ca3e26e7e263f9de273355a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be1c88790ca3e26e7e263f9de273355a");
        } else if (!isCallbackListEmpty() && !isTimeout()) {
            StringBuilder sb = new StringBuilder("notifyCallbackOnSuccess:模板[");
            sb.append(getDownloadId());
            sb.append("] mCallbackList.size()=");
            sb.append(this.mCallbackList.size());
            for (BundleDownloader.Callback callback : this.mCallbackList) {
                if (callback != null) {
                    StringBuilder sb2 = new StringBuilder("notifyCallbackOnSuccess,[");
                    sb2.append(getDownloadId());
                    sb2.append("] callback=");
                    sb2.append(callback);
                    callback.onSuccess(this);
                }
            }
            this.mCallbackList.clear();
        }
    }

    public void notifyCallbackOnFail(DownloadException downloadException) {
        Object[] objArr = {downloadException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a84560fb2a1c8522495c37829b89950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a84560fb2a1c8522495c37829b89950");
        } else if (!isCallbackListEmpty() && !isTimeout()) {
            StringBuilder sb = new StringBuilder("DownloadInfo-->notifyCallbackOnFail:模板[");
            sb.append(getDownloadId());
            sb.append("] mCallbackList.size()=");
            sb.append(this.mCallbackList.size());
            for (BundleDownloader.Callback callback : this.mCallbackList) {
                if (callback != null) {
                    StringBuilder sb2 = new StringBuilder("DownloadInfo-->notifyCallbackOnFail,[");
                    sb2.append(getDownloadId());
                    sb2.append("] callback=");
                    sb2.append(callback);
                    callback.onFailed(this, downloadException);
                }
            }
            this.mCallbackList.clear();
        }
    }

    public DownloadInfo(BundleInfo bundleInfo, String str, BundleDownloader.Callback callback) {
        Object[] objArr = {bundleInfo, str, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "502e4800b54b80d8a0039571ee28f84f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "502e4800b54b80d8a0039571ee28f84f");
            return;
        }
        this.isTimeout = false;
        this.mCallbackList = new CopyOnWriteArraySet();
        this.mTimeoutListener = new TimeoutHandler.Listener() { // from class: com.meituan.android.common.aidata.ai.bundle.download.model.DownloadInfo.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.ai.bundle.TimeoutHandler.Listener
            public void onTimeout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3afeffde4e058d217460b8c91a138d2b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3afeffde4e058d217460b8c91a138d2b");
                    return;
                }
                DownloadInfo.this.isTimeout = true;
                String str2 = DownloadInfo.TAG;
            }
        };
        this.mCallbackList.add(callback);
        this.mBundleInfo = bundleInfo;
        this.downloadDirPath = str;
        this.mStatus = 1000;
        if (this.mBundleInfo.hasSetTimeout()) {
            TimeoutHandler.get().registerTimeoutListener(getDownloadId(), this.mTimeoutListener);
        }
    }

    public boolean isCallbackListEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfebc1877d2c560fa968d47c8e2c6873", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfebc1877d2c560fa968d47c8e2c6873")).booleanValue() : this.mCallbackList.isEmpty();
    }

    public void addCallback(BundleDownloader.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e10a3e2c17c5eb900514c57d517ed997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e10a3e2c17c5eb900514c57d517ed997");
            return;
        }
        this.mCallbackList.add(callback);
        StringBuilder sb = new StringBuilder("DownloadInfo-->addCallback,callback");
        sb.append(callback);
        sb.append(",mCallbackList.size()=");
        sb.append(this.mCallbackList.size());
    }

    public boolean isTimeout() {
        return this.isTimeout;
    }

    public BundleInfo getBundleInfo() {
        return this.mBundleInfo;
    }

    public String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7232ab3e5a6502f473a8829e8ed6a48b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7232ab3e5a6502f473a8829e8ed6a48b") : this.mBundleInfo.getDDBundleName();
    }

    public String getDownloadId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65dd8976aed354b3f5012841cc1ce085", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65dd8976aed354b3f5012841cc1ce085") : this.mBundleInfo.getJsId();
    }

    public void setZipFile(boolean z) {
        this.mIsZipFile = z;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public boolean isDownloading() {
        return this.mStatus == 1002;
    }

    public String getUnzipDirPath() {
        return this.unzipDirPath;
    }

    public void setUnzipDirPath(String str) {
        this.unzipDirPath = str;
    }

    public long getDownloadCostTime() {
        return this.markEndTimeMills - this.markStartTimeMills;
    }

    public String getDownloadTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc5de1d391b03fc78daff27b4c8b09bf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc5de1d391b03fc78daff27b4c8b09bf") : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(this.mDownloadTimeMills));
    }

    @Nullable
    public DownloadException getDownloadException() {
        return this.downloadException;
    }

    public String getDownloadDirPath() {
        return this.downloadDirPath;
    }
}
