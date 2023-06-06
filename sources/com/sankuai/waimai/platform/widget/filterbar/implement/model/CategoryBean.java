package com.sankuai.waimai.platform.widget.filterbar.implement.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class CategoryBean {
    @SerializedName("category_list")
    public ArrayList<Category> a;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Category {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("code")
        public int code;
        @SerializedName("icon_url")
        public String iconUrl;
        @SerializedName("click_url")
        public String iconUrlClick;
        @SerializedName("name")
        public String name;
        @SerializedName("quantity")
        public int quantity;
        @SerializedName("sub_category_list")
        public ArrayList<Category> subList;
    }
}
