package com.sankuai.waimai.store.util.monitor.cache;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ApiCache {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int code;
    private String request;
    private String response;
    private String url;

    public String getUrl() {
        return this.url;
    }

    public int getCode() {
        return this.code;
    }

    public String getRequest() {
        return this.request;
    }

    public String getResponse() {
        return this.response;
    }

    public static ApiCache create(String str, String str2, String str3, int i) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "281750f91f5d6c4b959cd52c2806bff5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiCache) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "281750f91f5d6c4b959cd52c2806bff5");
        }
        ApiCache apiCache = new ApiCache();
        apiCache.url = str;
        apiCache.request = str2;
        apiCache.response = str3;
        apiCache.code = i;
        return apiCache;
    }
}
