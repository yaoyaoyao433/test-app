package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GuessRecommend implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -890448411752712214L;
    public boolean isExposed;
    @SerializedName("recommend_context")
    public String recommendContext;
    @SerializedName("recommend_sub_context")
    public String recommendSubContext;
}
