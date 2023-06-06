package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CityDeliveryArea implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("status_stream")
    public List<OrderStreamStatus> mCityDeliveryStatusStreams;
    @SerializedName("main_title")
    public String mainDesc;
    @SerializedName("show_position")
    public int showPosition;
    @SerializedName("sub_title")
    public String subDesc;
}
