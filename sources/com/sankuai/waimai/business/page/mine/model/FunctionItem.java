package com.sankuai.waimai.business.page.mine.model;

import android.support.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class FunctionItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bubble")
    private a bubble;
    @SerializedName("click_url")
    private String clickUrl;
    @SerializedName("fun_code")
    private int code;
    public boolean hasViewReport;
    public boolean hasViewReportNew;
    @SerializedName("high_light_desc")
    private String highLightDesc;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    private String iconUrl;
    @SerializedName("need_login")
    private int needLogin;
    @SerializedName("desc_secd")
    private String secondDesc;
    @SerializedName("desc_secd_status")
    private int secondDescStatus;
    @SerializedName("fun_title")
    private String title;

    public static FunctionItem fromJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "391ca738d53d1362ed97cea42e71e459", RobustBitConfig.DEFAULT_VALUE)) {
            return (FunctionItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "391ca738d53d1362ed97cea42e71e459");
        }
        if (str != null) {
            return (FunctionItem) new Gson().fromJson(str, (Class<Object>) FunctionItem.class);
        }
        return null;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public void setClickUrl(String str) {
        this.clickUrl = str;
    }

    public int getNeedLogin() {
        return this.needLogin;
    }

    public void setNeedLogin(int i) {
        this.needLogin = i;
    }

    public String getSecondDesc() {
        return this.secondDesc;
    }

    public void setSecondDesc(String str) {
        this.secondDesc = str;
    }

    public int getSecondDescStatus() {
        return this.secondDescStatus;
    }

    public void setSecondDescStatus(int i) {
        this.secondDescStatus = i;
    }

    public a getBubble() {
        return this.bubble;
    }

    public void setBubble(a aVar) {
        this.bubble = aVar;
    }

    public String getHighLightDesc() {
        return this.highLightDesc;
    }

    public void setHighLightDesc(String str) {
        this.highLightDesc = str;
    }
}
