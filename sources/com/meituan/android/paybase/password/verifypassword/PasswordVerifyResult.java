package com.meituan.android.paybase.password.verifypassword;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PasswordVerifyResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1517264117656053016L;
    @SerializedName("navigate")
    private String navigate;
    @SerializedName("outer_params")
    private HashMap<String, String> outerParams;
    @SerializedName("payToken")
    private String payToken;
    @SerializedName("update_soter_key")
    private UpdateSoterKey updateSoterKey;
    @SerializedName("verify_soter_status")
    private int verifySoterStatus;

    public String getNavigate() {
        return this.navigate;
    }

    public void setNavigate(String str) {
        this.navigate = str;
    }

    public String getPayToken() {
        return this.payToken;
    }

    public void setPayToken(String str) {
        this.payToken = str;
    }

    public UpdateSoterKey getUpdateSoterKey() {
        return this.updateSoterKey;
    }

    public void setUpdateSoterKey(UpdateSoterKey updateSoterKey) {
        this.updateSoterKey = updateSoterKey;
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
