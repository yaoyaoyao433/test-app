package com.sankuai.waimai.business.page.home.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.model.EmptyBtnInfo;
import com.sankuai.waimai.business.search.model.ExpAbInfo;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.Remind;
import com.sankuai.waimai.platform.domain.core.response.ServerExpResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class HomePagePoiListResponse extends ServerExpResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_type")
    public int activityType;
    @SerializedName("addition_tab_list")
    public List<AdditionTabs> additionTabList;
    @SerializedName("boldingList")
    private ArrayList<Integer> boldingList;
    @SerializedName("click_title_icon")
    public String clickTitleIcon;
    @SerializedName("coupon_nologin_background")
    public String couponNologinBg;
    @SerializedName("click_buttons")
    public List<EmptyBtnInfo> emptyBtnInfoList;
    @SerializedName("tip_content")
    public String emptyText;
    @SerializedName("has_activity")
    private boolean hasActivity;
    @SerializedName("poi_has_next_page")
    private boolean hasMore;
    @SerializedName("judas_field")
    public PoiListJudasField judasField;
    @SerializedName("exp_ab_info")
    public LabelExtraInfo labelExtraInfo;
    private long mCursor;
    @SerializedName("marketing_window")
    public ArrayList<MarketingWindow> marketingWindow;
    @SerializedName("need_login")
    private boolean needLogin;
    @SerializedName("page_index")
    private int pageIndex;
    @SerializedName("page_size")
    private int pageSize;
    @SerializedName("poilist")
    private ArrayList<Poi> poiList;
    @SerializedName("rank_strategy_tag")
    private String rankStrategy;
    @SerializedName("rank_strategy_version")
    private String rankStrategyVersion;
    @SerializedName("remind_infos")
    public List<Remind> remindInfos;
    @SerializedName("server_notification")
    public ServerNotification serverNotification;
    @SerializedName("tab_enable_index")
    public int tabEnableIndex;
    @SerializedName("tab_mode")
    public int tabMode;
    @SerializedName("tab_name")
    public String tabName;
    @SerializedName("title_icon")
    public String titleIcon;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class LabelExtraInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("poi_list_show_style")
        public String poiCardStyle;
        @SerializedName("poi_img_replace")
        public String poiImgReplace;
        @SerializedName(ExpAbInfo.RANK_UGC_LABEL_EXP)
        public String searchRankUGCLabelExp;
        @SerializedName("tags_show_style")
        public String tagShowStyle;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class PoiListJudasField {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("rank_trace_id")
        public String rankTraceId;
    }

    public HomePagePoiListResponse() {
    }

    public HomePagePoiListResponse(int i, int i2, int i3, ArrayList<Poi> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc370442038b7e9a7d863c0314a807e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc370442038b7e9a7d863c0314a807e8");
            return;
        }
        this.pageIndex = i;
        this.pageSize = i2;
        this.poiList = arrayList;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageIndex(int i) {
        this.pageIndex = i;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int i) {
        this.pageSize = i;
    }

    public ArrayList<Poi> getPoiList() {
        return this.poiList;
    }

    public ArrayList<Object> getAdapterData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2e79b49b295a7a02b52c5febb1bd75e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2e79b49b295a7a02b52c5febb1bd75e");
        }
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.addAll(this.poiList);
        return arrayList;
    }

    public void setPoiList(ArrayList<Poi> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80278d7fdcf219f5b97fcb1286a66fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80278d7fdcf219f5b97fcb1286a66fae");
            return;
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.poiList = arrayList;
    }

    public String getErrorTip() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ed4b242850ae8ce084c344897bd887d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ed4b242850ae8ce084c344897bd887d") : this.serverNotification == null ? "" : this.serverNotification.errorTip;
    }

    public String getErrorUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaebe61f3c1468dbceafbd5a004bcd0e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaebe61f3c1468dbceafbd5a004bcd0e") : this.serverNotification == null ? "" : this.serverNotification.errorUrl;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public boolean hasActivity() {
        return this.hasActivity;
    }

    public boolean needLogin() {
        return this.needLogin;
    }

    public ArrayList<Integer> getBoldingList() {
        return this.boldingList;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class ServerNotification {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("content")
        private String errorTip;
        @SerializedName("url")
        private String errorUrl;
    }

    public boolean isPoiKaStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65fcad101815c2cbeb6c23542cc78f04", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65fcad101815c2cbeb6c23542cc78f04")).booleanValue();
        }
        if (this.labelExtraInfo == null || TextUtils.isEmpty(this.labelExtraInfo.poiImgReplace)) {
            return false;
        }
        try {
            return new JSONObject(this.labelExtraInfo.poiImgReplace).optInt("is_hit", 0) == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean isAllowLoopAnimatorStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e7b4d083081b5d75f044f196fe7f2a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e7b4d083081b5d75f044f196fe7f2a7")).booleanValue();
        }
        if (!isPoiKaStyle() || this.labelExtraInfo == null || TextUtils.isEmpty(this.labelExtraInfo.poiImgReplace)) {
            return false;
        }
        try {
            String optString = new JSONObject(this.labelExtraInfo.poiImgReplace).optString("exp_result", "");
            if (!"G1".equalsIgnoreCase(optString)) {
                if (!"G2".equalsIgnoreCase(optString)) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean showAveragePrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ad5253abb99cf4cc3c8da8f38883727", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ad5253abb99cf4cc3c8da8f38883727")).booleanValue();
        }
        if (this.labelExtraInfo == null || TextUtils.isEmpty(this.labelExtraInfo.poiImgReplace)) {
            return false;
        }
        try {
            return new JSONObject(this.labelExtraInfo.poiImgReplace).optInt("show_average_price", 0) == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean isNewPoiCardStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "812816493b72492571b7b876ed396342", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "812816493b72492571b7b876ed396342")).booleanValue() : this.labelExtraInfo != null && "1".equals(this.labelExtraInfo.poiCardStyle);
    }

    public boolean tagClassifyStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d20c0ace8163273e309a7324c6f86da", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d20c0ace8163273e309a7324c6f86da")).booleanValue() : this.labelExtraInfo != null && "1".equals(this.labelExtraInfo.tagShowStyle);
    }

    public String getLabelExp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "193e62597eb2153a6ecb5e675f339886", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "193e62597eb2153a6ecb5e675f339886") : (this.labelExtraInfo == null || TextUtils.isEmpty(this.labelExtraInfo.searchRankUGCLabelExp)) ? ErrorCode.ERROR_TYPE_B : this.labelExtraInfo.searchRankUGCLabelExp;
    }

    public void prepareData(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b0c6e86ed7ebdeeacf04c79d940f6ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b0c6e86ed7ebdeeacf04c79d940f6ef");
        } else {
            preparePoiListData(i);
        }
    }

    private void preparePoiListData(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5bc42babd13e66aa4c7d80b1f858153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5bc42babd13e66aa4c7d80b1f858153");
        } else if (com.sankuai.waimai.foundation.utils.b.a(this.poiList)) {
            Iterator<Poi> it = this.poiList.iterator();
            while (it.hasNext()) {
                Poi next = it.next();
                com.sankuai.waimai.business.page.common.util.a.a(next, this.boldingList, isPoiKaStyle(), showAveragePrice(), tagClassifyStyle());
                next.labelSortAndTextSizeStrategy = getLabelExp();
                next.seqNumber = i;
            }
        }
    }
}
