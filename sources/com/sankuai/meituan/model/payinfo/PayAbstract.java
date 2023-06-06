package com.sankuai.meituan.model.payinfo;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.model.NoProguard;
import java.io.Serializable;
/* compiled from: ProGuard */
@NoProguard
/* loaded from: classes4.dex */
public class PayAbstract implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("icon_url")
    private String icon;
    @SerializedName("abstract")
    private String tips;
    private String type;
}
