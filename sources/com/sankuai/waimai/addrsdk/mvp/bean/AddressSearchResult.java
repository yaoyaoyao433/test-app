package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AddressSearchResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("count")
    public int count;
    @SerializedName("pois")
    public List<PoiAddressBean> pois;
    @SerializedName("ret_coordtype")
    public String retCoordtype;
}
