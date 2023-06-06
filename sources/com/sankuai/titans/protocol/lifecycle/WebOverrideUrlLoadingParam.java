package com.sankuai.titans.protocol.lifecycle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WebOverrideUrlLoadingParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map<String, String> additionalHeaders;
    private final Set<String> additionalUA;
    private String url;

    public WebOverrideUrlLoadingParam(Map<String, String> map, Set<String> set) {
        Object[] objArr = {map, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf2c7355e40706b11c4e91da15f574e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf2c7355e40706b11c4e91da15f574e9");
            return;
        }
        this.additionalHeaders = map;
        this.additionalUA = set;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setReferer(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9f8a905d34af53dd792f9f2d14a81b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9f8a905d34af53dd792f9f2d14a81b9");
        } else {
            this.additionalHeaders.put("Referer", str);
        }
    }

    public String getReferer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bc37db3826b4170e642266a36df7432", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bc37db3826b4170e642266a36df7432") : this.additionalHeaders.get("Referer");
    }

    public Map<String, String> getAdditionalHeaders() {
        return this.additionalHeaders;
    }

    public Set<String> getAdditionalUA() {
        return this.additionalUA;
    }
}
