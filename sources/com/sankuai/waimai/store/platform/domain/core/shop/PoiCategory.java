package com.sankuai.waimai.store.platform.domain.core.shop;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.activities.MutilReceiveCouponTip;
import com.sankuai.waimai.store.platform.domain.core.activities.ReceiveCouponTip;
import com.sankuai.waimai.store.platform.domain.core.activities.StoreActivityInfo;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public abstract class PoiCategory implements Serializable {
    public static final int TYPE_COMBO = 2;
    public static final int TYPE_COMMON = 1;
    public static final int TYPE_SALES_VOLUME = 3;
    public static final int TYPE_SEARCH_AGGREGATION = 10;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_info")
    public StoreActivityInfo activityInfo;
    @SerializedName("activity_tag")
    public String activityTag;
    @SerializedName("aggregationActivityTags")
    public boolean aggregationActivityTags;
    @SerializedName("big_pic_url")
    public String bigPicUrl;
    @SerializedName("description")
    public String description;
    public boolean isCloneCategory;
    @SerializedName("multi_receive_coupon_tip")
    public MutilReceiveCouponTip mutilReceiveCouponTip;
    @SerializedName("receive_coupon_tip")
    public ReceiveCouponTip receiveCouponTip;
    @SerializedName(DMKeys.KEY_SELECTED)
    public int selected;
    @SerializedName("tag_description")
    public String tagDescription;
    @SerializedName("tagSource")
    public int tagSource;

    public String getSubName() {
        return "";
    }

    public abstract String getTagCode();

    public abstract String getTagIcon();

    public abstract String getTagName();

    public String getTagDescription() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e59436e99172922a12ef9a7dab4cd140", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e59436e99172922a12ef9a7dab4cd140");
        }
        if (TextUtils.isEmpty(this.tagDescription)) {
            return getTagName();
        }
        return this.tagDescription;
    }

    public boolean isSelected() {
        return this.selected == 1;
    }

    public PoiCategory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d5b693c60f4f2895795b4fc3e370a8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d5b693c60f4f2895795b4fc3e370a8a");
            return;
        }
        this.aggregationActivityTags = false;
        this.tagSource = 0;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21956e97b7b1500694cd52e4510e4de0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21956e97b7b1500694cd52e4510e4de0")).booleanValue() : (obj instanceof PoiCategory) && TextUtils.equals(((PoiCategory) obj).getTagCode(), getTagCode());
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adf64429971ba62c557a1e05d778b25c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adf64429971ba62c557a1e05d778b25c")).intValue();
        }
        if (TextUtils.isEmpty(getTagCode())) {
            return super.hashCode();
        }
        return getTagCode().hashCode();
    }
}
