package com.meituan.android.pay.desk.component.bean.standardcomponent;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class ChangeVerifyTypeDialog implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5682943076656187410L;
    @SerializedName("deal_type")
    private int dealType;
    @SerializedName("left_button")
    private String leftButtonText;
    @SerializedName("right_button")
    private String rightButtonText;
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getLeftButtonText() {
        return this.leftButtonText;
    }

    public void setLeftButtonText(String str) {
        this.leftButtonText = str;
    }

    public String getRightButtonText() {
        return this.rightButtonText;
    }

    public void setRightButtonText(String str) {
        this.rightButtonText = str;
    }

    public int getDealType() {
        return this.dealType;
    }

    public void setDealType(int i) {
        this.dealType = i;
    }
}
