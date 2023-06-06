package com.meituan.android.common.aidata.ai.bundle.download.exception;

import com.meituan.android.common.aidata.ai.bundle.exception.BaseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DownloadException extends BaseException {
    public static final int CANCELED = 18002;
    public static final int DOWNLOAD_TIME_OUT = 18008;
    public static final int ILLEGAL_URL = 18001;
    public static final int MD5_VERIFY_FAILED = 18007;
    public static final int NET_ERROR = 18003;
    public static final int UNZIP_ERROR = 18004;
    public static final int UNZIP_NOT_ZIP_FILE = 18009;
    public static final int UN_FOUND_FILE = 18005;
    public static final int UN_KNOWN = 18006;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mHttpCode;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ErrorType {
    }

    @Override // com.meituan.android.common.aidata.ai.bundle.exception.BaseException
    public String errorDescription(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "249db525f58e648623d7fa1231d9d537", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "249db525f58e648623d7fa1231d9d537");
        }
        switch (i) {
            case ILLEGAL_URL /* 18001 */:
                return "非法的URL";
            case CANCELED /* 18002 */:
                return "下载被取消";
            case NET_ERROR /* 18003 */:
                return "网络错误";
            case UNZIP_ERROR /* 18004 */:
                return "文件处理（解压zip）失败";
            case UN_FOUND_FILE /* 18005 */:
                return "磁盘中未找到文件";
            case UN_KNOWN /* 18006 */:
            default:
                return "未知错误";
            case MD5_VERIFY_FAILED /* 18007 */:
                return "MD5校验失败";
            case DOWNLOAD_TIME_OUT /* 18008 */:
                return "下载超时";
            case UNZIP_NOT_ZIP_FILE /* 18009 */:
                return "非压缩文件";
        }
    }

    public int getHttpCode() {
        return this.mHttpCode;
    }

    public DownloadException(Exception exc) {
        super(exc);
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87ef3386268fb41933addffc99b6b164", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87ef3386268fb41933addffc99b6b164");
        }
    }

    public DownloadException(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dfe2ae9e0973463d1476e73f5673ae5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dfe2ae9e0973463d1476e73f5673ae5");
        }
    }

    public DownloadException(int i, int i2) {
        super(i);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa760cc619356682741bd01973efeb96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa760cc619356682741bd01973efeb96");
        } else {
            this.mHttpCode = i2;
        }
    }

    public DownloadException(Throwable th, int i) {
        super(th, i);
        Object[] objArr = {th, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e78ebf6b9345e60e58fb0ee42d2559b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e78ebf6b9345e60e58fb0ee42d2559b");
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c3f6920fa5233c747fc5e66bae50a32", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c3f6920fa5233c747fc5e66bae50a32");
        }
        return "DownloadException errorType : " + getErrorType() + ",errorDesc : " + getErrorDesc() + ",cause : " + getCause();
    }
}
