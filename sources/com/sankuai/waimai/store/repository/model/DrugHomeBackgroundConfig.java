package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DrugHomeBackgroundConfig implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_arrow_pic")
    public String addressArrowPic;
    @SerializedName("address_color")
    public String addressColor;
    @SerializedName("address_loc_pic")
    public String addressLocPic;
    @SerializedName("background_json")
    public String backgroundJson;
    @SerializedName("background_pic")
    public String backgroundPic;
    @SerializedName("head_bg_color_center")
    public String headBgColorCenter;
    @SerializedName("head_bg_color_frm")
    public String headBgColorFrm;
    @SerializedName("head_bg_color_to")
    public String headBgColorTo;
    @SerializedName("market_bg_pic_url")
    public String marketBgPicUrl;
    @SerializedName("return_arrow_pic")
    public String returnArrowPic;
    @SerializedName("shopping_cart_pic")
    public String shoppingCartPic;
    @SerializedName("status_bar_color_rule")
    public int statusBarColorRule;
    @SerializedName("title_json")
    public String titleJson;
    @SerializedName("title_url")
    public String titleUrl;
}
