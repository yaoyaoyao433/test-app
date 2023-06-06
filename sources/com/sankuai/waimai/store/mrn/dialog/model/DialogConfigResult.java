package com.sankuai.waimai.store.mrn.dialog.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DialogConfigResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("backgroundColor")
    public String backgroundColor;
    @SerializedName("closeWhenTouchMask")
    public boolean closeWhenTouchMask;
    @SerializedName("component")
    public String component;
    @SerializedName("height")
    public float dialogHeight;
    @SerializedName("position")
    public String dialogPosition;
    @SerializedName("width")
    public float dialogWidth;
    @SerializedName("entry")
    public String entry;
}
