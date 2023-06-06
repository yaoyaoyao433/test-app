package com.meituan.android.cashier.oneclick.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OneClickPayOrderState implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1203263777174342174L;
    private String action;
    private String oneClickPayExtPrams;
    @SerializedName("oneclickpay_errmsg")
    private String oneclickpayErrmsg;
    private Promotion promotion;
    @SerializedName("success_notice")
    private String successNotice;
    private String text;
    @SerializedName("wait_dialog_ms")
    private long toastDisplayTime;

    public String getAction() {
        return this.action;
    }

    public Promotion getPromotion() {
        return this.promotion;
    }

    public String getText() {
        return this.text;
    }

    public String getOneclickpayErrmsg() {
        return this.oneclickpayErrmsg;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setOneclickpayErrmsg(String str) {
        this.oneclickpayErrmsg = str;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public String getOneClickPayExtPrams() {
        return this.oneClickPayExtPrams;
    }

    public void setOneClickPayExtPrams(String str) {
        this.oneClickPayExtPrams = str;
    }

    public String getSuccessNotice() {
        return this.successNotice;
    }

    public void setSuccessNotice(String str) {
        this.successNotice = str;
    }

    public long getToastDisplayTime() {
        return this.toastDisplayTime;
    }

    public void setToastDisplayTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a325419e856109ef7b9a7466425e2ff4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a325419e856109ef7b9a7466425e2ff4");
        } else {
            this.toastDisplayTime = j;
        }
    }
}
