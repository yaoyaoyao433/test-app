package com.meituan.android.cashier.oneclick.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OneClickPay implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3030718146717834319L;
    private boolean accept;
    private String oneClickPayExtPrams;
    @SerializedName("oneclickpay_errmsg")
    private String oneclickpayErrmsg;
    @SerializedName("round_query")
    private OneClickPayRoundQuery roundQuery;
    private String text;
    @SerializedName("verify_quit_text")
    private String verifyQuitText;
    @SerializedName("verify_url")
    private String verifyUrl;

    public boolean isAccept() {
        return this.accept;
    }

    public String getText() {
        return this.text;
    }

    public String getOneclickpayErrmsg() {
        return this.oneclickpayErrmsg;
    }

    public OneClickPayRoundQuery getRoundQuery() {
        return this.roundQuery;
    }

    public void setAccept(boolean z) {
        this.accept = z;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setOneclickpayErrmsg(String str) {
        this.oneclickpayErrmsg = str;
    }

    public void setRoundQuery(OneClickPayRoundQuery oneClickPayRoundQuery) {
        this.roundQuery = oneClickPayRoundQuery;
    }

    public String getOneClickPayExtPrams() {
        return this.oneClickPayExtPrams;
    }

    public void setOneClickPayExtPrams(String str) {
        this.oneClickPayExtPrams = str;
    }

    public String getVerifyUrl() {
        return this.verifyUrl;
    }

    public void setVerifyUrl(String str) {
        this.verifyUrl = str;
    }

    public String getVerifyQuitText() {
        return this.verifyQuitText;
    }

    public void setVerifyQuitText(String str) {
        this.verifyQuitText = str;
    }
}
