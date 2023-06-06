package com.sankuai.waimai.store.entity;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class RestRecommendPoi implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("poi_list")
    public ArrayList<PoiVerticality> poiList;
}
