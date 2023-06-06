package com.meituan.android.paycommon.lib.fingerprint.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class UpdateSoterKey implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5823760139849983030L;
    @SerializedName("can_update_soter_key")
    private int canUpdateSoterKey;
    @SerializedName("update_soter_key_url")
    private String url;

    public boolean canUpdateSoterKey() {
        return this.canUpdateSoterKey == 1;
    }

    public void setCanUpdateSoterKey(int i) {
        this.canUpdateSoterKey = i;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
