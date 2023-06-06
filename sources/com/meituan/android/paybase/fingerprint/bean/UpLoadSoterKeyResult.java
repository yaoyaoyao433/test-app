package com.meituan.android.paybase.fingerprint.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class UpLoadSoterKeyResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2370101781841618117L;
    @SerializedName("outer_params")
    private HashMap<String, String> outerParams;
    @SerializedName("verify_info")
    private SoterVerifyInfo soterVerifyInfo;
    @SerializedName("verify_soter_status")
    private int soterVerifyStatus;
    @SerializedName("verify_soter_success")
    private boolean soterVerifySuccess;

    public HashMap<String, String> getOuterParams() {
        return this.outerParams;
    }

    public void setOuterParams(HashMap<String, String> hashMap) {
        this.outerParams = hashMap;
    }

    public SoterVerifyInfo getSoterVerifyInfo() {
        return this.soterVerifyInfo;
    }

    public void setSoterVerifyInfo(SoterVerifyInfo soterVerifyInfo) {
        this.soterVerifyInfo = soterVerifyInfo;
    }

    public boolean isUpLoadKeySuccess() {
        return this.soterVerifyStatus == 0;
    }

    public boolean isSoterVerifySuccess() {
        return this.soterVerifySuccess;
    }

    public void setSoterVerifySuccess(boolean z) {
        this.soterVerifySuccess = z;
    }

    public int getSoterVerifyStatus() {
        return this.soterVerifyStatus;
    }

    public void setSoterVerifyStatus(int i) {
        this.soterVerifyStatus = i;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "601f965e0b829001884247fc9fe9b369", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "601f965e0b829001884247fc9fe9b369") : new Gson().toJson(this);
    }
}
