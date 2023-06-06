package com.sankuai.waimai.business.im.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("content")
    public String b;
    @SerializedName(RegionLinkDao.TABLENAME)
    public String c;
    @SerializedName("coupon_id")
    public long d;
    @SerializedName("poi_id")
    public long e;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String f;

    public c(String str, String str2, long j, long j2, String str3) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28327d42929365fc968a1957b2cd45b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28327d42929365fc968a1957b2cd45b");
            return;
        }
        this.f = "";
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = str3;
    }

    public final byte[] a(int i) {
        Object[] objArr = {2020};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da8e5ffe68b4a1ab7de56a228b0abc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da8e5ffe68b4a1ab7de56a228b0abc5");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("content", this.b);
            jSONObject.put(RegionLinkDao.TABLENAME, this.c);
            jSONObject.put("poi_id", this.e);
            jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.f);
            jSONObject.put("coupon_id", this.d);
            jSONObject2.put("data", jSONObject);
            jSONObject2.put("type", 2020);
            return jSONObject2.toString().getBytes("utf-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
