package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiChannelBackgroundConfig implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bgColor")
    public String bgColor;
    @SerializedName("bgPicId")
    public long bgPicId;
    @SerializedName("bgPicUrl")
    public String bgPicUrl;
    @SerializedName("channelPageBottomColor")
    public String channelPageBottomColor;
    public transient String errorHomeHeadDefColor;
    @SerializedName("headBgImageUrl")
    public String headBgImageUrl;
    @SerializedName("headContentNoRadiusCorner")
    public boolean headContentNoRadiusCorner;
    @SerializedName("headTitleFontImgFrm")
    public String headTitleFontImgFrm;
    @SerializedName("headTitleFontImgTo")
    public String headTitleFontImgTo;
    @SerializedName("kingKongDefaultBg")
    public String kingKongDefaultBg;
    @SerializedName("kingKongSelectedBg")
    public String kingKongSelectedBg;
    @SerializedName("minuteBgColorFrm")
    public String minuteBgColorFrm;
    @SerializedName("minuteBgColorTo")
    public String minuteBgColorTo;
    @SerializedName("minuteHeadDefBgUrl")
    public String minuteHeadDefBgUrl;
    @SerializedName("minuteHeadTopBgUrl")
    public String minuteHeadTopBgUrl;
    @SerializedName("module_title")
    public String moduleTitle;
    @SerializedName("pageTitleUrl")
    public String pageTitleUrl;
    @SerializedName("quickFilterBgColor")
    public String quickFilterBgColor;
    @SerializedName("quickFilterBgColorFrm")
    public String quickFilterBgColorFrm;
    @SerializedName("quickFilterBgColorTo")
    public String quickFilterBgColorTo;
    @SerializedName("quickFilterTextColor")
    public String quickFilterTextColor;
    @SerializedName("searchBarBgColor")
    public String searchBarBgColor;
    @SerializedName("searchBarFrameColor")
    public String searchBarFrameColor;
    @SerializedName("searchButton")
    public SearchButton searchButton;
    @SerializedName("searchIconColor")
    public String searchIconColor;
    @SerializedName("tips_color")
    public String tipsColor;
    @SerializedName("title_color_style")
    public int titleColorStyle;
    @SerializedName("topCartonUrl")
    public String topCartonTitleUrl;
    @SerializedName("verticalLineColor")
    public String verticalLineColor;
    @SerializedName("headBgColorFrm")
    public String headBgColorFrm = "";
    @SerializedName("headBgColorCenter")
    public String headBgColorCenter = "";
    @SerializedName("headBgColorTo")
    public String headBgColorTo = "";
    @SerializedName("channelPageHeadBgImgUrl")
    public String channelPageHeadBgImgUrl = "";
    @SerializedName("iconSelectedColorFrm")
    public String iconSelectedColorFrm = "";
    @SerializedName("iconSelectedColorTo")
    public String iconSelectedColorTo = "";
    @SerializedName("subCateTextSelectedBgColorFrm")
    public String subCateTextSelectedBgColorFrm = "";
    @SerializedName("subCateTextSelectedBgColorTo")
    public String subCateTextSelectedBgColorTo = "";
    @SerializedName("iconSelectedFontColor1119200")
    public String iconSelectedFontColor = "";
    @SerializedName("subCatIndicatorUrl")
    public String subCatIndicatorUrl = "";
    @SerializedName("searchBarPlaceholderFontColor")
    public String searchBarPlaceholderFontColor = "";
    @SerializedName("headBgGradientDirection")
    public String headBgGradientDirection = "";
    @SerializedName("hotSearchLabelFrameColor")
    public String hotSearchLabelFrameColor = "";
    @SerializedName("hotSearchLabelBgColor")
    public String hotSearchLabelBgColor = "";
    @SerializedName("hotSearchLabelFontColor")
    public String hotSearchLabelFontColor = "";

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SearchButton implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("searchButtonBgFromColor")
        public String searchButtonBgFromColor;
        @SerializedName("searchButtonBgToColor")
        public String searchButtonBgToColor;
        @SerializedName("searchButtonTextColor")
        public String searchButtonTextColor;
    }
}
