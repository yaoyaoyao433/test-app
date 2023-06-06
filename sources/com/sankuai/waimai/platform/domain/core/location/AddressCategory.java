package com.sankuai.waimai.platform.domain.core.location;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AddressCategory implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("category")
    public int category;
    public String categoryIcon;
    @SerializedName("category_name")
    public String categoryName;

    public AddressCategory() {
        this.categoryName = "";
        this.categoryIcon = "";
    }

    public AddressCategory(JSONObject jSONObject) {
        this.categoryName = "";
        this.categoryIcon = "";
        this.category = jSONObject.optInt("category");
        this.categoryName = jSONObject.optString("category_name");
        this.categoryIcon = jSONObject.optString("category_icon");
    }
}
