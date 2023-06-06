package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SearchRecommendCollocateCard implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1785217618079738790L;
    @SerializedName("spus")
    public List<GoodsSpu> spus;
    @SerializedName("title")
    public String title;
}
