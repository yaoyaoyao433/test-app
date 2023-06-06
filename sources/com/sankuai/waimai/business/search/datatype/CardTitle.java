package com.sankuai.waimai.business.search.datatype;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CardTitle implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("subTitle")
    public String highlight;
    @SerializedName("mainTitle")
    public String mainTitle;
}
