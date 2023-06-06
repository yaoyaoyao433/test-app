package com.sankuai.waimai.store.convenient.landing;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGConvenientExtra {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ExpInfo exp_info;
    @SerializedName("navigate_type")
    public String navigate_type;
    @SerializedName("search_category_type")
    public String search_category_type;
    public long skuId;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ExpInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("shelf-ABtest")
        public boolean shelfABtest;
    }
}
