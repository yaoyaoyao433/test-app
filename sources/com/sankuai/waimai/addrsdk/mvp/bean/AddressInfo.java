package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AddressInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("admin_code")
    public String adminCode;
    @SerializedName("admin_level")
    public String adminLevel;
    @SerializedName("level_desc")
    public String levelDesc;
    @SerializedName("name")
    public String name;
}
