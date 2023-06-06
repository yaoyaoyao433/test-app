package com.meituan.android.paybase.fingerprint.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class VerifyData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2829094301694299013L;
    @SerializedName("paypassword")
    private PayPassword payPassword;
    @SerializedName("verify_type")
    private int verifyType;

    public int getVerifyType() {
        return this.verifyType;
    }

    public void setVerifyType(int i) {
        this.verifyType = i;
    }

    public PayPassword getPayPassword() {
        return this.payPassword;
    }

    public void setPayPassword(PayPassword payPassword) {
        this.payPassword = payPassword;
    }
}
