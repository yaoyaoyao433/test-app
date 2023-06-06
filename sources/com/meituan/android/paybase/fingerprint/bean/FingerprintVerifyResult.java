package com.meituan.android.paybase.fingerprint.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class FingerprintVerifyResult implements Serializable {
    public static final int ASK_FAIL = 1;
    public static final int AUTH_FAIL = 4;
    public static final int AUTH_KEY_FAIL = 2;
    public static final int CHALLENGE_FAIL = 3;
    public static final int FID_NOT_EXIT = 5;
    public static final int VERIFY_OK = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3755315538913784589L;
    private int navigate;
    @SerializedName("outer_params")
    private HashMap<String, String> outerParams;
    private String payToken;
    @SerializedName("verify_data")
    private VerifyData verifyData;
    @SerializedName("verify_soter_status")
    private int verifySoterStatus;

    public int getNavigate() {
        return this.navigate;
    }

    public void setNavigate(int i) {
        this.navigate = i;
    }

    public String getPayToken() {
        return this.payToken;
    }

    public void setPayToken(String str) {
        this.payToken = str;
    }

    public VerifyData getVerifyData() {
        return this.verifyData;
    }

    public void setVerifyData(VerifyData verifyData) {
        this.verifyData = verifyData;
    }

    public int getVerifySoterStatus() {
        return this.verifySoterStatus;
    }

    public void setVerifySoterStatus(int i) {
        this.verifySoterStatus = i;
    }

    public HashMap<String, String> getOuterParams() {
        return this.outerParams;
    }

    public void setOuterParams(HashMap<String, String> hashMap) {
        this.outerParams = hashMap;
    }
}
