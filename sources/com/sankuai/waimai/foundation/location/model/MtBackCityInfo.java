package com.sankuai.waimai.foundation.location.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MtBackCityInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("admin_code")
    public String adcode;
    @SerializedName("id")
    public String id;
    @SerializedName("level")
    public int level;
    @SerializedName("name")
    public String name;
}
