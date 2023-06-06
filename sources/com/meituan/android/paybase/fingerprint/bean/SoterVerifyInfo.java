package com.meituan.android.paybase.fingerprint.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class SoterVerifyInfo implements Serializable {
    public static final int ASK_FAIL = 1;
    public static final int AUTH_FAIL = 4;
    public static final int AUTH_KEY_FAIL = 2;
    public static final int CHALLENGE_FAIL = 3;
    public static final int ERROR_OK = 0;
    public static final int FID_NOT_EXIT = 5;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8028615221585289378L;
    @SerializedName("fingerprintpay")
    private FingerprintPayResponse fingerprintPay;
    @SerializedName("open_fingerprintpay_success")
    private boolean openFingerprintPaySuccess;
    @SerializedName("page_message")
    private String pageMessage;
    @SerializedName("verify_soter_status")
    private int soterVerifyStatus;
    @SerializedName("verify_soter_success")
    private boolean soterVerifySuccess;
    @SerializedName("submit_url")
    private String submitUrl;

    public int getSoterVerifyStatus() {
        return this.soterVerifyStatus;
    }

    public void setSoterVerifyStatus(int i) {
        this.soterVerifyStatus = i;
    }

    public boolean isUpLoadKeySuccess() {
        return this.soterVerifyStatus == 0;
    }

    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }

    public FingerprintPayResponse getFingerprintPay() {
        return this.fingerprintPay;
    }

    public void setFingerprintPay(FingerprintPayResponse fingerprintPayResponse) {
        this.fingerprintPay = fingerprintPayResponse;
    }

    public boolean isSoterVerifySuccess() {
        return this.soterVerifySuccess;
    }

    public void setSoterVerifySuccess(boolean z) {
        this.soterVerifySuccess = z;
    }

    public boolean isOpenFingerprintPaySuccess() {
        return this.openFingerprintPaySuccess;
    }

    public void setOpenFingerprintPaySuccess(boolean z) {
        this.openFingerprintPaySuccess = z;
    }

    public String getPageMessage() {
        return this.pageMessage;
    }

    public void setPageMessage(String str) {
        this.pageMessage = str;
    }
}
