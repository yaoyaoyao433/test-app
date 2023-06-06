package com.sankuai.waimai.globalcart.model;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.xm.monitor.report.db.TraceBean;
import java.io.Serializable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("wm_poi_id")
    public long b;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String c;
    @SerializedName("is_delete")
    public boolean d;
    @SerializedName("product_list")
    public List<CartProduct> e;
    @SerializedName(TraceBean.UPDATE_TIME)
    public long f;
    @SerializedName("poi_operated")
    public boolean g;
    @SerializedName("goodsManagerType")
    public int h;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fbdba124813f457bfad29d5e6645e9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fbdba124813f457bfad29d5e6645e9f");
        } else {
            this.c = "";
        }
    }

    private JSONObject a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "359c1dede290f66fd09d48ccd1553ce1", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "359c1dede290f66fd09d48ccd1553ce1");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wm_poi_id", this.b);
            jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, aa.a(this.c) ? "" : this.c);
            if (z) {
                jSONObject.put("is_delete", this.d);
                jSONObject.put(TraceBean.UPDATE_TIME, this.f);
            }
            jSONObject.put("poi_operated", this.g);
            JSONArray jSONArray = new JSONArray();
            if (this.e != null) {
                for (CartProduct cartProduct : this.e) {
                    jSONArray.put(cartProduct.toJsonObj(z));
                }
            }
            jSONObject.put("product_list", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a908d3515280b01346ba12219328ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a908d3515280b01346ba12219328ac")).booleanValue();
        }
        if (obj instanceof a) {
            return (!aa.a(this.c) && TextUtils.equals(this.c, ((a) obj).c)) || this.b == ((a) obj).b;
        }
        return false;
    }

    public static JSONArray a(List<a> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58628576357b6a48d0c4da3d99ac7e2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58628576357b6a48d0c4da3d99ac7e2b");
        }
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (a aVar : list) {
                if (aVar != null) {
                    jSONArray.put(aVar.a(z));
                }
            }
        }
        return jSONArray;
    }
}
