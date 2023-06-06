package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class FactorExtend implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6198058025587988901L;
    @SerializedName("display_window")
    private DisplayDialog displayDialog;

    public DisplayDialog getDisplayDialog() {
        return this.displayDialog;
    }

    public void setDisplayDialog(DisplayDialog displayDialog) {
        this.displayDialog = displayDialog;
    }
}
