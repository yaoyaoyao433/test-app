package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class NavigationTileConfig implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8871808188076579419L;
    @SerializedName("backImageUrl")
    public String backImageUrl;
    @SerializedName("center_sub_title_pic")
    public String centerSubTitlePic;
    @SerializedName("center_title_pic")
    public String centerTitlePic;
    @SerializedName("channelCode")
    public int channelCode;
    @SerializedName("hide_globalcart")
    public int hide_globalcart;
    @SerializedName("hide_msg")
    public int hide_msg;
    @SerializedName("hide_share")
    public int hide_share;
    @SerializedName("include_maicai_poi")
    public int include_maicai_poi;
    @SerializedName("interest_point_pic")
    public String interestPointPic;
    @SerializedName("interest_point_pic_dark")
    public String interestPointPicDark;
    @SerializedName("is_new_flower")
    public boolean isNewWithFlower;
    @SerializedName("is_show_title_point_pic")
    public int isShowTitlePointPic;
    @SerializedName("msgDotBoderColor")
    public String msgDotBoderColor;
    @SerializedName("msgScheme")
    public String msgScheme;
    @SerializedName("mtMsgScheme")
    public String mtMsgScheme;
    @SerializedName("mt_globalcart_scheme")
    public String mt_globalcart_scheme;
    @SerializedName("pageSubTitle")
    public String pageSubTitle;
    @SerializedName("pageThinkurl")
    public String pageThinkUrl;
    @SerializedName("pageTitle")
    public String pageTitle;
    @SerializedName("pageTitleUrl")
    public String pageTitleUrl;
    @SerializedName("promotionASearchFrameEndColor")
    public String promotionASearchFrameEndColor;
    @SerializedName("promotionASearchFrameStartColor")
    public String promotionASearchFrameStartColor;
    @SerializedName("searchBarBgColor")
    public String searchBarBgColor;
    @SerializedName("searchBarFrameColor")
    public String searchBarFrameColor;
    @SerializedName("searchBarGradientColorLeft")
    public String searchBarGradientColorLeft;
    @SerializedName("searchBarGradientColorRight")
    public String searchBarGradientColorRight;
    @SerializedName("searchButtonBgFromColor")
    public String searchButtonBgFromColor;
    @SerializedName("searchButtonBgToColor")
    public String searchButtonBgToColor;
    @SerializedName("searchButtonTextColor")
    public String searchButtonTextColor;
    @SerializedName("searchIconColor")
    public String searchIconColor;
    @SerializedName("meituan_share_info")
    public String shareInfoMT;
    @SerializedName("waimai_share_info")
    public String shareInfoWM;
    @SerializedName("title_color_style")
    public String titleColorStyle;
    @SerializedName("searchBarPlaceholderFontColor")
    public String searchBarPlaceholderFontColor = "";
    @SerializedName("scheme_source")
    public String schemeSource = "";
}
