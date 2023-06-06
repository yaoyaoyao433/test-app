package com.sankuai.waimai.store.recipe.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class RecipeResponse extends BaseDataResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("menu_list")
    public List<Recipe> recipes;
    @SerializedName("sub_title")
    public String subTitle;
    @SerializedName("title")
    public String title;
}
