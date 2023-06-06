package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BrandFilter implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("filter_list")
    public List<BrandFilterItem> mBrandFilterList;
    @SerializedName("filter_tips")
    public String mFilterTips;
}
