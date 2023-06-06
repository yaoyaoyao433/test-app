package com.meituan.android.paybase.password.verifypassword;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class UpdateSoterKey implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8904356992318288607L;
    @SerializedName("can_update_soter_key")
    private int canUpdateSoterKey;
    @SerializedName("update_soter_key_url")
    private String updateSoterKeyUrl;

    public int getCanUpdateSoterKey() {
        return this.canUpdateSoterKey;
    }

    public void setCanUpdateSoterKey(int i) {
        this.canUpdateSoterKey = i;
    }

    public String getUpdateSoterKeyUrl() {
        return this.updateSoterKeyUrl;
    }

    public void setUpdateSoterKeyUrl(String str) {
        this.updateSoterKeyUrl = str;
    }
}
