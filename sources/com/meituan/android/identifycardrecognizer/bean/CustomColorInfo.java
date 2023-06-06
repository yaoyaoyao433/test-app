package com.meituan.android.identifycardrecognizer.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CustomColorInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4619147913293870428L;
    @SerializedName("commonColor")
    private String commonColor;
    @SerializedName("rightPhotoColor")
    private String demoCheckedColor;
    @SerializedName("wrongPhotoColor")
    private String demoFaultColor;

    public String getCommonColor() {
        return this.commonColor;
    }

    public void setCommonColor(String str) {
        this.commonColor = str;
    }

    public String getDemoCheckedColor() {
        return this.demoCheckedColor;
    }

    public void setDemoCheckedColor(String str) {
        this.demoCheckedColor = str;
    }

    public String getDemoFaultColor() {
        return this.demoFaultColor;
    }

    public void setDemoFaultColor(String str) {
        this.demoFaultColor = str;
    }
}
