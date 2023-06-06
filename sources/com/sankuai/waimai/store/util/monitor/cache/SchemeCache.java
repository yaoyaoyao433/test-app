package com.sankuai.waimai.store.util.monitor.cache;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SchemeCache {
    public static final String FAILED = "failed";
    public static final String SUCCESS = "success";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String scheme;
    private String status;

    public static SchemeCache create(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d153d04fa7859d26bb61d5f5240347b", RobustBitConfig.DEFAULT_VALUE)) {
            return (SchemeCache) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d153d04fa7859d26bb61d5f5240347b");
        }
        SchemeCache schemeCache = new SchemeCache();
        schemeCache.scheme = str;
        schemeCache.status = str2;
        return schemeCache;
    }
}
