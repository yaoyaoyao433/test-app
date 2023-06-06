package com.sankuai.waimai.business.search.datatype;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RecommendPoiListTitle implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("recommend_context")
    public String recommendContext;
    @SerializedName("recommend_sub_context")
    public String recommendSubContext;
}
