package com.sankuai.waimai.business.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CommonPageStyleConfig {
    public static final int BL_TR = 4;
    public static final int LEFT_RIGHT = 2;
    public static final long THEME_DARK = 0;
    public static final long THEME_LIGHT = 1;
    public static final int TL_BR = 3;
    public static final int TOP_BOTTOM = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_switch_color")
    public String addressSwitchColor;
    @SerializedName("background_image")
    public String backgroundImage;
    @SerializedName("bg_blur_radius")
    public int bgBlurRadius;
    @SerializedName("bg_gradient_endcolor")
    public String bgGradientEndColor;
    @SerializedName("bg_gradient_orientation")
    public int bgGradientOrientation;
    @SerializedName("bg_gradient_startcolor")
    public String bgGradientStartColor;
    @SerializedName("divider_color")
    public String dividerColor;
    @SerializedName("input_box_theme")
    public long inputBoxTheme;
    @SerializedName("poi_spu_switch_color")
    public String poiSpuSwitchColor;
    @SerializedName("return_button_color")
    public String returnButtonColor;
    @SerializedName("search_box_blur")
    public int searchBoxBlur;
    @SerializedName("search_term_color")
    public String searchTermColor;
}
