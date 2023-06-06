package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiRecommend implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("recommend_poi_index")
    public int poiIndex;
    @SerializedName("recommend_poi_list")
    public List<PoiVerticality> poiList;
    @SerializedName("recommend_title")
    public String title;
    @SerializedName("recommend_type")
    public int type;
}
