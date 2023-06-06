package com.meituan.android.elderly.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class RouteInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4973266716373621418L;
    @SerializedName("abtest_grp")
    private String abTestGroup;
    @SerializedName("cashier_info")
    private HashMap<String, Cashier> cashierInfo;
    @SerializedName("pop_window")
    private CashierPopWindowBean cashierPopWindowBean;
    @SerializedName("cashier_type")
    private String cashierType;
    @SerializedName("retain_window")
    private RetainWindow retainWindow;
    @SerializedName("root_desc")
    private String rootDesc;
    @SerializedName("degrade_url")
    private String url;

    public String getCashierType() {
        return this.cashierType;
    }

    public void setCashierType(String str) {
        this.cashierType = str;
    }

    public HashMap<String, Cashier> getCashierInfo() {
        return this.cashierInfo;
    }

    public void setCashierInfo(HashMap<String, Cashier> hashMap) {
        this.cashierInfo = hashMap;
    }

    public String getRootDesc() {
        return this.rootDesc;
    }

    public void setRootDesc(String str) {
        this.rootDesc = str;
    }

    public String getAbTestGroup() {
        return this.abTestGroup;
    }

    public void setAbTestGroup(String str) {
        this.abTestGroup = str;
    }

    public RetainWindow getRetainWindow() {
        return this.retainWindow;
    }

    public void setRetainWindow(RetainWindow retainWindow) {
        this.retainWindow = retainWindow;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public CashierPopWindowBean getCashierPopWindowBean() {
        return this.cashierPopWindowBean;
    }

    public void setCashierPopWindowBean(CashierPopWindowBean cashierPopWindowBean) {
        this.cashierPopWindowBean = cashierPopWindowBean;
    }
}
