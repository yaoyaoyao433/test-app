package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class TileTabInner implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code")
    public int code;
    @SerializedName("categories")
    public List<TileTabItem> tabList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class TileTabItem implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("category_code")
        public int categoryCode;
        @SerializedName("category_name")
        public String categoryName;
    }
}
