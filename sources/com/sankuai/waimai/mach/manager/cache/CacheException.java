package com.sankuai.waimai.mach.manager.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class CacheException extends com.sankuai.waimai.mach.manager.exception.a {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c0f804fbc00145c0c26fd6b2b1ed5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c0f804fbc00145c0c26fd6b2b1ed5d");
        }
        switch (i) {
            case com.meituan.android.common.aidata.ai.bundle.cache.CacheException.LOAD_BUNDLE_SUCCESS_RENDER_SUCCESS /* 17800 */:
                return "渲染成功";
            case com.meituan.android.common.aidata.ai.bundle.cache.CacheException.LOAD_BUNDLE_SUCCESS_RENDER_FAILURE /* 17801 */:
                return "缓存加载成功，渲染失败";
            default:
                switch (i) {
                    case com.meituan.android.common.aidata.ai.bundle.cache.CacheException.UNKNOWN_ERROR /* 17806 */:
                        return "其他错误";
                    case 17807:
                        return "模板加载失败";
                    case 17808:
                        return "加载超时";
                    case 17809:
                        return "没有下载资源";
                    default:
                        switch (i) {
                            case 17901:
                                return "Mach Pro子包没有可匹配的";
                            case 17902:
                                return "mach_min_version没有可以匹配的包";
                            case 17903:
                                return "mach_pro内置bundle不存在";
                            default:
                                return "未知错误";
                        }
                }
        }
    }

    public CacheException(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3272230f757ecf32851895982db7008", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3272230f757ecf32851895982db7008");
        }
    }
}
