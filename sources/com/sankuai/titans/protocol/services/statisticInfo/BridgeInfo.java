package com.sankuai.titans.protocol.services.statisticInfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.utils.UrlUtils;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BridgeInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String method;
    private String pageOriginalUrl;
    private String pageUrl;
    private String source;

    public BridgeInfo(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7ac2cc1f9ded3a3633e78ffaf99da89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7ac2cc1f9ded3a3633e78ffaf99da89");
            return;
        }
        this.method = str;
        this.source = str2;
        this.pageOriginalUrl = str3;
        this.pageUrl = str4;
    }

    public String getPageOriginalUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53f3d315ba194fa4774ab6814a60ca74", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53f3d315ba194fa4774ab6814a60ca74") : UrlUtils.clearQueryAndFragment(this.pageOriginalUrl);
    }

    public String getPageUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d745f489f29efe7bb69cb98a70fe4c4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d745f489f29efe7bb69cb98a70fe4c4") : UrlUtils.clearQueryAndFragment(this.pageUrl);
    }

    public String getSource() {
        return this.source;
    }

    public String getMethod() {
        return this.method;
    }
}
