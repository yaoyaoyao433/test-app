package com.sankuai.waimai.business.page.common.net.response;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.model.ChannelImages;
import com.sankuai.waimai.business.page.common.model.ChannelService;
import com.sankuai.waimai.business.page.home.head.recommendwords.alita.RefreshResponseData;
import com.sankuai.waimai.business.page.home.list.future.ad.a;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ChannelBannerInfoResponseV8 implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bar_style")
    public int barStyle;
    @SerializedName("brand_promotion")
    public JsonObject brand;
    @SerializedName("channel_images")
    public ChannelImages channelImages;
    @SerializedName("channel_search_words")
    public RefreshResponseData channelSearchWords;
    @SerializedName(ConfigInfo.MODULE_PLATINUM_BANNER)
    public a dynamicPlatinumBanner;
    @SerializedName("exp_stids")
    public String expStids;
    @SerializedName("operation_recommend")
    public String marketing;
    @SerializedName("tabs_show_style")
    public int newRecommendStyle;
    @SerializedName("poi_rank")
    public JsonObject poiRank;
    @SerializedName("search_keyword")
    public ArrayList<RecommendedSearchKeyword> searchKeywords;

    public ChannelBannerInfoResponseV8(ChannelImages channelImages, RefreshResponseData refreshResponseData) {
        Object[] objArr = {channelImages, refreshResponseData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90660c75da2acf04a9f9a494e0b5efef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90660c75da2acf04a9f9a494e0b5efef");
            return;
        }
        this.channelImages = channelImages;
        this.channelSearchWords = refreshResponseData;
    }

    public boolean newRecommendStyle() {
        return this.newRecommendStyle == 1;
    }

    public boolean shouldShowChannelService() {
        ArrayList<ChannelService> filterChannelServices;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e2917dba154dbff408cbd22463d3715", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e2917dba154dbff408cbd22463d3715")).booleanValue() : (this.channelImages == null || (filterChannelServices = getFilterChannelServices(this.channelImages.channelServices)) == null || filterChannelServices.size() < 3) ? false : true;
    }

    public boolean shouldShowRecommendSearchWords() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4765f3a1dd45835cb5974460e203198", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4765f3a1dd45835cb5974460e203198")).booleanValue() : this.barStyle == 0 && this.searchKeywords != null && this.searchKeywords.size() >= 3;
    }

    public boolean shouldShowAtmosphere() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4e5641c6f70bd683c961eca62ac9f12", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4e5641c6f70bd683c961eca62ac9f12")).booleanValue() : (this.channelImages == null || this.channelImages.channelInfo == null || TextUtils.isEmpty(this.channelImages.channelInfo.bgPicUrl)) ? false : true;
    }

    public boolean isNewBarStyle() {
        return this.barStyle == 1;
    }

    public static ArrayList<ChannelService> getFilterChannelServices(ArrayList<ChannelService> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9987496912d6984bb08dc632e569dba8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9987496912d6984bb08dc632e569dba8");
        }
        ArrayList<ChannelService> arrayList2 = new ArrayList<>();
        if (d.a(arrayList)) {
            return arrayList2;
        }
        Iterator<ChannelService> it = arrayList.iterator();
        while (it.hasNext()) {
            ChannelService next = it.next();
            if (!TextUtils.isEmpty(next.icon) && !TextUtils.isEmpty(next.desc)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
