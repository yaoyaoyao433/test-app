package com.meituan.android.common.aidata.ai.bundle.cache;

import com.meituan.android.common.aidata.ai.bundle.exception.BaseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CacheException extends BaseException {
    public static final int DOWNLOAD_BUNDLE_NOT_ZIP = 17804;
    public static final int LOAD_BUNDLE_FAILURE = 17950;
    public static final int LOAD_BUNDLE_FAILURE_FILE_IS_DOWNLOADING = 17930;
    public static final int LOAD_BUNDLE_FAILURE_FILE_NOT_FOUND = 17940;
    public static final int LOAD_BUNDLE_SUCCESS_RENDER_FAILURE = 17801;
    public static final int LOAD_BUNDLE_SUCCESS_RENDER_SUCCESS = 17800;
    public static final int MANAGER_NOT_INIT = 17805;
    public static final int UNKNOWN_ERROR = 17806;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ErrorType {
    }

    @Override // com.meituan.android.common.aidata.ai.bundle.exception.BaseException
    public String errorDescription(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3c2f6d9f3b3f55c787ecb7b12cc6190", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3c2f6d9f3b3f55c787ecb7b12cc6190");
        }
        if (i != 0) {
            if (i != 17930) {
                if (i != 17940) {
                    if (i != 17950) {
                        switch (i) {
                            case 3:
                                return "网络模板加载失败，缓存未命中，文件下载中";
                            case 4:
                                return "网络模板加载失败，缓存未命中，且未处于检查更新或下载状态";
                            case 5:
                                return "网络模板加载失败，文件读取失败（包括文件缺失）";
                            case 6:
                                return "网络模板加载失败，其他错误";
                            case 7:
                                return "网络模板加载失败，命中缓存但是返回null";
                            case 8:
                                return "网络模板加载失败，命中缓存但是AiBundle is null";
                            case 9:
                                return "网络模板加载失败,缓存命中，但是解析失败";
                            case 10:
                                return "网络模板加载失败,解析时发生Crash";
                            default:
                                switch (i) {
                                    case LOAD_BUNDLE_SUCCESS_RENDER_SUCCESS /* 17800 */:
                                        return "渲染成功";
                                    case LOAD_BUNDLE_SUCCESS_RENDER_FAILURE /* 17801 */:
                                        return "缓存加载成功，渲染失败";
                                    default:
                                        switch (i) {
                                            case DOWNLOAD_BUNDLE_NOT_ZIP /* 17804 */:
                                                return "DD下载的Bundle文件不是zip文件";
                                            case MANAGER_NOT_INIT /* 17805 */:
                                                return "AiBundleManager未初始化";
                                            case UNKNOWN_ERROR /* 17806 */:
                                                return "其他错误";
                                            default:
                                                return "未知错误";
                                        }
                                }
                        }
                    }
                    return "模板加载失败";
                }
                return "资源加载失败，文件未找到";
            }
            return "资源加载失败，文件下载中";
        }
        return "未指定模板ID";
    }

    public CacheException(Throwable th, int i) {
        super(th, i);
        Object[] objArr = {th, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d969909dd1f113aac9e1517771ca9b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d969909dd1f113aac9e1517771ca9b2");
        }
    }

    public CacheException(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4699fc716ecbde86e8f0f0a3ade18c66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4699fc716ecbde86e8f0f0a3ade18c66");
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80939cc1abad0da4697308f43a004aa0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80939cc1abad0da4697308f43a004aa0");
        }
        return "CacheException errorType : " + getErrorType() + ",errorDesc : " + getErrorDesc() + ",cause : " + getCause();
    }
}
