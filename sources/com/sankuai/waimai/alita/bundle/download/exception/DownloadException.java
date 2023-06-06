package com.sankuai.waimai.alita.bundle.download.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.bundle.exception.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class DownloadException extends a {
    public static ChangeQuickRedirect a;
    private int b;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface ErrorType {
    }

    @Override // com.sankuai.waimai.alita.bundle.exception.a
    public final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ae4bfd51035c93312c848ad7a8d14d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ae4bfd51035c93312c848ad7a8d14d");
        }
        switch (i) {
            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.ILLEGAL_URL /* 18001 */:
                return "非法的URL";
            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.CANCELED /* 18002 */:
                return "下载被取消";
            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.NET_ERROR /* 18003 */:
                return "网络错误";
            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.UNZIP_ERROR /* 18004 */:
                return "文件处理（解压zip）失败";
            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.UN_FOUND_FILE /* 18005 */:
                return "磁盘中未找到文件";
            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.UN_KNOWN /* 18006 */:
            default:
                return "未知错误";
            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.MD5_VERIFY_FAILED /* 18007 */:
                return "MD5校验失败";
            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.DOWNLOAD_TIME_OUT /* 18008 */:
                return "下载超时";
        }
    }

    public DownloadException(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2a7f904cae5c94e30282781d6713a80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2a7f904cae5c94e30282781d6713a80");
        }
    }

    public DownloadException(int i, int i2) {
        super(com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.NET_ERROR);
        Object[] objArr = {Integer.valueOf((int) com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.NET_ERROR), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b3135d924f88ff0f7f9e7a175484815", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b3135d924f88ff0f7f9e7a175484815");
        } else {
            this.b = i2;
        }
    }

    public DownloadException(Throwable th, int i) {
        super(th, i);
        Object[] objArr = {th, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9ee4140c24335e8c144a06ea333fab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9ee4140c24335e8c144a06ea333fab");
        }
    }
}
