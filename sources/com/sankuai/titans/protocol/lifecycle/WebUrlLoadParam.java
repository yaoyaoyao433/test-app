package com.sankuai.titans.protocol.lifecycle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class WebUrlLoadParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map<String, String> additionalHeaders;
    private final Set<String> additionalUA;
    private String url;

    public WebUrlLoadParam(Map<String, String> map, Set<String> set) {
        Object[] objArr = {map, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ebfc6839af5c96df7fef20173082b7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ebfc6839af5c96df7fef20173082b7e");
            return;
        }
        this.additionalHeaders = map;
        this.additionalUA = set;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setReferer(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58ebfafa640251807db7368546fb5e18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58ebfafa640251807db7368546fb5e18");
        } else {
            this.additionalHeaders.put("Referer", str);
        }
    }

    public final String getReferer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ed1937bab5c49ecc6d1ff113f5f4388", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ed1937bab5c49ecc6d1ff113f5f4388") : this.additionalHeaders.get("Referer");
    }

    public final String getUrl() {
        return this.url;
    }

    public final Map<String, String> getAdditionalHeaders() {
        return this.additionalHeaders;
    }

    public final Set<String> getAdditionalUA() {
        return this.additionalUA;
    }
}
