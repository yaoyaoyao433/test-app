package com.sankuai.waimai.business.page.home.model.v10;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.page.home.head.recommendwords.RecommendSearchWord;
import com.sankuai.waimai.business.page.home.model.MidAdBanner;
import com.sankuai.waimai.business.page.home.model.NavigateItem;
import com.sankuai.waimai.business.search.api.RollSearchKeyword;
import com.sankuai.waimai.platform.domain.core.ad.Ad;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class HomeNewHeadResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("homeSalesJson")
    public String acrossBannerMachInfo;
    @SerializedName("kingkong_stid")
    public String kingkongStid;
    @SerializedName("kingkong_version")
    public String kingkongVersion;
    @SerializedName("bubble_max_num")
    public int maxBubbleNum = -1;
    @SerializedName("mid_ad_banner")
    public MidAdBanner midAdBanner;
    @SerializedName("kingkong_bg_image")
    public String primaryBg;
    @SerializedName("primary_filter")
    public ArrayList<NavigateItem> primaryCondList;
    @SerializedName("kingkong_font_color")
    public String primaryTextColor;
    @SerializedName("qualification_rule")
    public Ad.d qualificationRule;
    @SerializedName(RollSearchKeyword.ROLL_SEARCH_KEYWORD)
    public RollSearchKeyword rollSearchKeyword;
    @SerializedName("search_guide_keywords")
    public RecommendSearchWord searchGuideKeywords;
    @SerializedName("top_banner_list")
    public ArrayList<Ad> topBannerList;
}
