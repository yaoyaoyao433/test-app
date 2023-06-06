package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SearchCarouselTextInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1649152094938748896L;
    @SerializedName("carousel_time")
    public int carouselTime;
    @SerializedName("search_carousel_text_list")
    public List<SearchCarouselText> searchCarouselTextList;
}
