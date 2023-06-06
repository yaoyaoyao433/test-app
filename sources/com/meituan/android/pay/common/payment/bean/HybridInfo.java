package com.meituan.android.pay.common.payment.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class HybridInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2101372073570150963L;
    @SerializedName("hybrid_url")
    private String hybridUrl;
    @SerializedName("load_already")
    private boolean loadAlready;
    @SerializedName("loading_time")
    private int loadingTime;

    public String getHybridUrl() {
        return this.hybridUrl;
    }

    public void setHybridUrl(String str) {
        this.hybridUrl = str;
    }

    public int getLoadingTime() {
        return this.loadingTime;
    }

    public void setLoadingTime(int i) {
        this.loadingTime = i;
    }

    public boolean isLoadAlready() {
        return this.loadAlready;
    }

    public void setLoadAlready(boolean z) {
        this.loadAlready = z;
    }
}
