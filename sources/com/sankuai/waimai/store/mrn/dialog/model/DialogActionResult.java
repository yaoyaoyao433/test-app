package com.sankuai.waimai.store.mrn.dialog.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DialogActionResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("component")
    public String component;
    @SerializedName("data")
    public Object data;
    @SerializedName("entry")
    public String entry;
    @SerializedName("close")
    public boolean isCloseDialog;
}
