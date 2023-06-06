package com.meituan.android.cashier.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class ClientRouterInfoBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 181763860133468820L;
    @SerializedName("cache_configurations")
    private HashMap<String, Object> cacheConfigurations;
    @SerializedName("cashier_url")
    private String cashierUrl;
    @SerializedName("merchantNo")
    private String merchantNo;
    @SerializedName("neo_configurations")
    private HashMap<String, Object> neoConfigurations;
    @SerializedName("nest_configurations")
    private HashMap<String, Object> nestConfigurations;

    public String getMerchantNo() {
        return this.merchantNo;
    }

    public void setMerchantNo(String str) {
        this.merchantNo = str;
    }

    public HashMap<String, Object> getCacheConfigurations() {
        return this.cacheConfigurations;
    }

    public void setCacheConfigurations(HashMap<String, Object> hashMap) {
        this.cacheConfigurations = hashMap;
    }

    public String getCashierUrl() {
        return this.cashierUrl;
    }

    public void setCashierUrl(String str) {
        this.cashierUrl = str;
    }

    public HashMap<String, Object> getNeoConfigurations() {
        return this.neoConfigurations;
    }

    public void setNeoConfigurations(HashMap<String, Object> hashMap) {
        this.neoConfigurations = hashMap;
    }

    public HashMap<String, Object> getNestConfigurations() {
        return this.nestConfigurations;
    }

    public void setNestConfigurations(HashMap<String, Object> hashMap) {
        this.nestConfigurations = hashMap;
    }
}
