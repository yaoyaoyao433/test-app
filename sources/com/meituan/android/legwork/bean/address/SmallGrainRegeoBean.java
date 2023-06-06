package com.meituan.android.legwork.bean.address;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class SmallGrainRegeoBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(GearsLocator.ADDRESS)
    public String address;
    @SerializedName("lat")
    public int lat;
    @SerializedName("lng")
    public int lng;
    @SerializedName("name")
    public String name;
}
