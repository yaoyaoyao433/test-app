package com.sankuai.waimai.business.search.datatype;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.datarequest.dealfilter.Filter;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GuideQueryData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("filter_flash_buy_icon")
    public String filterFlashBuyIcon;
    @SerializedName("guided_item_list")
    public List<GuidedQueryWordNew> guidedQueryWordsNew;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class SecondGuidedQuery implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("filterMapping")
        public String filterMapping;
        @SerializedName("guidedType")
        public String guidedType;
        @SerializedName("picture")
        public String picture;
        @SerializedName("searchQuery")
        public String searchQuery;
        @SerializedName("showQuery")
        public String showQuery;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class WmFilterGroup implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("groupId")
        public String groupId;
        @SerializedName("isHit")
        public boolean isHit;
        @SerializedName("items")
        public List<WmFilterItem> items;
        @SerializedName(Filter.TYPE_MULTI)
        public int multi;
        @SerializedName("style")
        public int style;
        @SerializedName("title")
        public String title;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class WmFilterItem implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("code")
        public String code;
        @SerializedName("hitOnlyPicture")
        public String hitOnlyPicture;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        public boolean isExposed;
        @SerializedName("isHit")
        public boolean isHit;
        @SerializedName("name")
        public String name;
        @SerializedName("onlyPicture")
        public String onlyPicture;
        @SerializedName("picture")
        public String picture;
        @SerializedName("remarks")
        public String remarks;
        @SerializedName("showText")
        public boolean showText;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class GuidedQueryWordNew implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean isExposed;
        @SerializedName("secondGuidedQuery")
        public SecondGuidedQuery secondGuidedQuery;
        @SerializedName("type")
        public int type;
        @SerializedName("wmFilterGroup")
        public WmFilterGroup wmFilterGroup;
        @SerializedName("wmFilterItem")
        public WmFilterItem wmFilterItem;

        public boolean isSecondGuide() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "946599f6235549b3e4935562fc33c303", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "946599f6235549b3e4935562fc33c303")).booleanValue() : this.type == 0 && TextUtils.equals(this.secondGuidedQuery.guidedType, "NORMAL");
        }

        public boolean isAmbiguousWord() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ef6b52b519863792dec39a763d0a24e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ef6b52b519863792dec39a763d0a24e")).booleanValue() : this.type == 0 && TextUtils.equals(this.secondGuidedQuery.guidedType, "FILTER");
        }

        public boolean isFilterGroup() {
            return this.type == 1;
        }

        public boolean isFilterItem() {
            return this.type == 2;
        }

        public boolean isGuideItem() {
            return this.type == 3;
        }
    }
}
