package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class r implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("user_icon")
    public String b;
    @SerializedName(alternate = {Constants.PRIVACY.KEY_LATITUDE}, value = "user_latitude")
    public long c;
    @SerializedName(alternate = {Constants.PRIVACY.KEY_LONGITUDE}, value = "user_longitude")
    public long d;

    public final LatLng a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f87ec8c3fc49bd4acd8a4a419563f589", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f87ec8c3fc49bd4acd8a4a419563f589");
        }
        if (this.c == 0 || this.d == 0) {
            return null;
        }
        return new LatLng((this.c * 1.0d) / 1000000.0d, (this.d * 1.0d) / 1000000.0d);
    }
}
