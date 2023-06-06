package com.sankuai.waimai.monitor.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class LoganInfo implements Serializable {
    public static String NAME = "LoganInfo";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, String> customField;
    private String pageId;
    private String requestParams;
    private String requestUrl;
    private String responseCode;
    private String responseData;

    public LoganInfo() {
    }

    public LoganInfo(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25c20ed3f704b8dba8f9de0f2eefc71d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25c20ed3f704b8dba8f9de0f2eefc71d");
            return;
        }
        this.requestUrl = str;
        this.requestParams = str2;
        this.responseCode = str3;
        this.responseData = str4;
    }

    public String buildLogStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "485cf32421f790d3c0d09298334783b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "485cf32421f790d3c0d09298334783b7");
        }
        return "request:[url:" + this.requestUrl + ",body:" + this.requestParams + "],response[code:" + this.responseCode + ",body:" + this.responseData + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public void setRequestUrl(String str) {
        this.requestUrl = str;
    }

    public String getRequestParams() {
        return this.requestParams;
    }

    public void setRequestParams(String str) {
        this.requestParams = str;
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public void setResponseCode(String str) {
        this.responseCode = str;
    }

    public String getResponseData() {
        return this.responseData;
    }

    public void setResponseData(String str) {
        this.responseData = str;
    }

    public String getPageId() {
        return this.pageId;
    }

    public void setPageId(String str) {
        this.pageId = str;
    }

    public Map<String, String> getCustomField() {
        return this.customField;
    }

    public void setCustomField(Map<String, String> map) {
        this.customField = map;
    }
}
