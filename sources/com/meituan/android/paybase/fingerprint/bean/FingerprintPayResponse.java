package com.meituan.android.paybase.fingerprint.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class FingerprintPayResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4193250492105250963L;
    @SerializedName("challenge")
    private String challenge;
    @SerializedName("finger_type")
    private int fingerType;
    @SerializedName("open_fingerprint_pay")
    private OpenFingerprintPayGuideResponse openFingerprintPayGuideResponse;
    @SerializedName("paypassword_verify")
    private PasswordVerify passwordVerify;
    private String scene;
    @SerializedName("page_subtip")
    private String subTip;
    @SerializedName("submit_url")
    private String submitUrl;
    @SerializedName("page_tip")
    private String tip;
    @SerializedName("page_title")
    private String title;

    public FingerprintPayResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c2a98b672cf8289e654a143168a7388", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c2a98b672cf8289e654a143168a7388");
        } else {
            this.scene = "";
        }
    }

    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public OpenFingerprintPayGuideResponse getOpenFingerprintPayGuideResponse() {
        return this.openFingerprintPayGuideResponse;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }

    public void setOpenFingerprintPayGuideResponse(OpenFingerprintPayGuideResponse openFingerprintPayGuideResponse) {
        this.openFingerprintPayGuideResponse = openFingerprintPayGuideResponse;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getTip() {
        return this.tip;
    }

    public void setTip(String str) {
        this.tip = str;
    }

    public String getSubTip() {
        return this.subTip;
    }

    public void setSubTip(String str) {
        this.subTip = str;
    }

    public PasswordVerify getPasswordVerify() {
        return this.passwordVerify;
    }

    public void setPasswordVerify(PasswordVerify passwordVerify) {
        this.passwordVerify = passwordVerify;
    }

    public String getChallenge() {
        return this.challenge;
    }

    public void setChallenge(String str) {
        this.challenge = str;
    }

    public int getFingerType() {
        return this.fingerType;
    }

    public void setFingerType(int i) {
        this.fingerType = i;
    }

    public String getScene() {
        return this.scene;
    }

    public void setScene(String str) {
        this.scene = str;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72d8a411a9f333a720189d3d845d0bff", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72d8a411a9f333a720189d3d845d0bff") : new Gson().toJson(this);
    }
}
