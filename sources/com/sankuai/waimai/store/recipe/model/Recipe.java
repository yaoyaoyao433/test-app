package com.sankuai.waimai.store.recipe.model;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Recipe implements Serializable {
    public static final int SELECTED = 1;
    public static final int UNSELECTED = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("desc")
    public String desc;
    @SerializedName("hard_level")
    public String hardLevel;
    @SerializedName("id")
    public String id;
    @SerializedName("ingredient_list")
    public List<Ingredient> ingredientList;
    @SerializedName("labels")
    public List<String> labels;
    @SerializedName("like_count")
    public String likeCount;
    @SerializedName("like_status")
    public int likeStatus;
    @SerializedName("name")
    public String name;
    @SerializedName("picture")
    public String picture;
    @SerializedName("resume")
    public String resume;
    @SerializedName(DMKeys.KEY_SELECTED)
    public int selected;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Ingredient implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("add_cart_text")
        public String cartText;
        @SerializedName("origin_price")
        public Double originPrice;
        @SerializedName("price")
        public Double price;
        @SerializedName("spu_list")
        public List<GoodsSpu> spuList;
        @SerializedName("sub_title")
        public String subTitle;
        @SerializedName("title")
        public String title;
    }

    public boolean isSelected() {
        return 1 == this.selected;
    }

    public void copy(Recipe recipe) {
        if (recipe == null) {
            return;
        }
        this.ingredientList = recipe.ingredientList;
    }

    public void copyAll(Recipe recipe) {
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18097a542d1eaa682447396254c0088c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18097a542d1eaa682447396254c0088c");
        } else if (recipe == null) {
        } else {
            this.ingredientList = recipe.ingredientList;
            this.id = recipe.id;
            this.name = recipe.name;
            this.desc = recipe.desc;
            this.resume = recipe.resume;
            this.picture = recipe.picture;
            this.hardLevel = recipe.hardLevel;
            this.likeCount = recipe.likeCount;
            this.likeStatus = recipe.likeStatus;
            this.labels = recipe.labels;
            this.selected = recipe.selected;
        }
    }
}
