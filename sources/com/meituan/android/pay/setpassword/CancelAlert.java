package com.meituan.android.pay.setpassword;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CancelAlert implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1165345935832313924L;
    @SerializedName("cancel_tip")
    private String cancelTip;
    @SerializedName("isBindCardProcess")
    private boolean isBindCardProcess;
    @SerializedName("left_button")
    private String leftButton;
    @SerializedName("right_button")
    private String rightButton;

    public String getCancelTip() {
        return this.cancelTip;
    }

    public void setCancelTip(String str) {
        this.cancelTip = str;
    }

    public String getLeftButton() {
        return this.leftButton;
    }

    public void setLeftButton(String str) {
        this.leftButton = str;
    }

    public String getRightButton() {
        return this.rightButton;
    }

    public void setRightButton(String str) {
        this.rightButton = str;
    }

    public boolean isBindCardProcess() {
        return this.isBindCardProcess;
    }

    public void setBindCardProcess(boolean z) {
        this.isBindCardProcess = z;
    }
}
