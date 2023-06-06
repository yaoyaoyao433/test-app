package com.sankuai.waimai.bussiness.order.base.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RelevantPoiResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("alert_content")
    public String alertContent;
    @SerializedName("alert_title")
    public String alertTitle;
    @SerializedName("poi_list")
    public ArrayList<Poi> poiList;
}
