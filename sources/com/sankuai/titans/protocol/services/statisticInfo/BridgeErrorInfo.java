package com.sankuai.titans.protocol.services.statisticInfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.utils.UrlUtils;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BridgeErrorInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String args;
    private String errorCode;
    private String errorMessage;
    private String method;
    private String pageOriginalUrl;
    private String pageUrl;
    private String source;

    public BridgeErrorInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c720dc8db859ecf39759b32e2b8875ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c720dc8db859ecf39759b32e2b8875ba");
            return;
        }
        this.errorCode = "";
        this.errorMessage = "";
        this.method = str;
        this.args = str2;
        this.source = str3;
        this.pageOriginalUrl = str4;
        this.pageUrl = str5;
        this.errorCode = str6;
        this.errorMessage = str7;
    }

    public String getMethod() {
        return this.method;
    }

    public String getArgs() {
        return this.args;
    }

    public String getSource() {
        return this.source;
    }

    public String getPageOriginalUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4392c29a7f91f658e883f40835b54537", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4392c29a7f91f658e883f40835b54537") : UrlUtils.clearQueryAndFragment(this.pageOriginalUrl);
    }

    public String getPageUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b412312e3040cdfb801e6048f311c11c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b412312e3040cdfb801e6048f311c11c") : UrlUtils.clearQueryAndFragment(this.pageUrl);
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
