package com.meituan.android.cashier.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CashierRouterPreGuideHornConfig implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7232133225596412389L;
    private String backgroundColor;
    @SerializedName("cashier_type")
    private String cashierType;
    @SerializedName("cover_url")
    private boolean coverUrl;
    @SerializedName("loading_timeout")
    private long loadingTimeOut;
    private boolean nsf;
    @SerializedName("nsf_params")
    private Map<String, String> nsfParams;
    @SerializedName("nsf_url")
    private String nsfUrl;
    @SerializedName("render_error_action")
    private String renderErrorAction;
    @SerializedName("render_error_toast")
    private String renderErrorToast;
    @SerializedName("request_predispatcher")
    private String requestPreDispatcher;
    private String url;

    public String getCashierType() {
        return this.cashierType;
    }

    public void setCashierType(String str) {
        this.cashierType = str;
    }

    public String getRenderErrorAction() {
        return this.renderErrorAction;
    }

    public void setRenderErrorAction(String str) {
        this.renderErrorAction = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getRequestPreDispatcher() {
        return this.requestPreDispatcher;
    }

    public void setRequestPreDispatcher(String str) {
        this.requestPreDispatcher = str;
    }

    public String getNsfUrl() {
        return this.nsfUrl;
    }

    public void setNsfUrl(String str) {
        this.nsfUrl = str;
    }

    public Map<String, String> getNsfParams() {
        return this.nsfParams;
    }

    public void setNsfParams(Map<String, String> map) {
        this.nsfParams = map;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public long getLoadingTimeOut() {
        return this.loadingTimeOut;
    }

    public void setLoadingTimeOut(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d409778dd94e178843f1d9a9e8d3aad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d409778dd94e178843f1d9a9e8d3aad0");
        } else {
            this.loadingTimeOut = j;
        }
    }

    public String getRenderErrorToast() {
        return this.renderErrorToast;
    }

    public void setRenderErrorToast(String str) {
        this.renderErrorToast = str;
    }

    public boolean isNsf() {
        return this.nsf;
    }

    public void setNsf(boolean z) {
        this.nsf = z;
    }

    public boolean isCoverUrl() {
        return this.coverUrl;
    }

    public void setCoverUrl(boolean z) {
        this.coverUrl = z;
    }
}
