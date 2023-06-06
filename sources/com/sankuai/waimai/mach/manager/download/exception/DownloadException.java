package com.sankuai.waimai.mach.manager.download.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DownloadException extends com.sankuai.waimai.mach.manager.exception.a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ErrorType {
    }

    @Override // com.sankuai.waimai.mach.manager.exception.a
    public final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d57977092a42d55fcc68ca958a1f67", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d57977092a42d55fcc68ca958a1f67");
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
            case 18015:
            case 18016:
            case 18017:
            case 18018:
            case 18019:
            default:
                return "未知错误";
            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.MD5_VERIFY_FAILED /* 18007 */:
                return "MD5校验失败";
            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.DOWNLOAD_TIME_OUT /* 18008 */:
                return "解压后文件移动失败";
            case com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException.UNZIP_NOT_ZIP_FILE /* 18009 */:
                return "下载超时";
            case 18010:
                return "文件移动超时";
            case 18011:
                return "流文件保存本地失败";
            case 18012:
                return "内部逻辑错误";
            case 18013:
                return "解压后文件移动异常";
            case 18014:
                return "文件压缩异常";
            case 18020:
                return "Bundle无效";
            case 18021:
                return "网络不可用";
        }
    }

    public DownloadException(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "822a4b104383c2ac8acc2fbad51248f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "822a4b104383c2ac8acc2fbad51248f1");
        }
    }
}
