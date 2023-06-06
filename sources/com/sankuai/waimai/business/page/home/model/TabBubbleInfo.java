package com.sankuai.waimai.business.page.home.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class TabBubbleInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("expire_time")
    public long expireTime;
    @SerializedName("ext_info")
    public String extInfo;
    @SerializedName("bubble_id")
    public String id;
    @SerializedName("log_field_info")
    public String logInfo;
    @SerializedName("msg")
    public String message;
    @SerializedName("tab_id")
    public int tabId;

    public String getBubbleType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c057efceaf7de568b70224270ad9f6d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c057efceaf7de568b70224270ad9f6d3");
        }
        try {
            try {
                return new JSONObject(this.logInfo).optString("viptab_bubble_type");
            } catch (JSONException e) {
                e.printStackTrace();
                return "";
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getLogInfo() {
        if (this.logInfo == null) {
            this.logInfo = "";
        }
        return this.logInfo;
    }
}
