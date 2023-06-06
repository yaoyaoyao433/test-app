package com.sankuai.waimai.platform.domain.core.shop;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.poi.IPoiItem;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public abstract class PoiCategory implements Serializable {
    public static final int TYPE_COMBO = 2;
    public static final int TYPE_COMMON = 1;
    public static final int TYPE_SALES_VOLUME = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_info")
    @Expose
    public String activityInfo;
    @SerializedName("activity_tag")
    public String activityTag;
    @SerializedName("activity_tag_list")
    public List<String> activityTagList;
    @SerializedName("big_pic_url")
    public String bigPicUrl;
    @SerializedName("description")
    public String description;
    private int mFoodTagPosition;
    @SerializedName(DMKeys.KEY_SELECTED)
    public int selected;
    @SerializedName("tag_description")
    public String tagDescription;

    public abstract List<? extends IPoiItem> getItemList();

    public abstract String getTagCode();

    public abstract String getTagIcon();

    public abstract String getTagName();

    public abstract int getTagSequence();

    public boolean isEmpty() {
        return false;
    }

    public String getTagDescription() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "123c486abbbc58889a1986befd221181", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "123c486abbbc58889a1986befd221181");
        }
        if (TextUtils.isEmpty(this.tagDescription)) {
            return getTagName();
        }
        return this.tagDescription;
    }

    public boolean containsTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d89114d47a0826d548e8e905e11d29a4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d89114d47a0826d548e8e905e11d29a4")).booleanValue() : this.activityTagList != null && this.activityTagList.contains(str);
    }

    public boolean isSelected() {
        return this.selected == 1;
    }

    public int getFoodTagPositon() {
        return this.mFoodTagPosition;
    }

    public void setFoodTagPosition(int i) {
        this.mFoodTagPosition = i;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ea2483927c4b24d1e769cf59e007003", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ea2483927c4b24d1e769cf59e007003")).booleanValue() : (obj instanceof PoiCategory) && TextUtils.equals(((PoiCategory) obj).getTagCode(), getTagCode());
    }
}
