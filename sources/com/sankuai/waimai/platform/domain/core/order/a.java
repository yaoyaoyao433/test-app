package com.sankuai.waimai.platform.domain.core.order;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a implements d, Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("spu_id")
    public long b;
    @SerializedName("id")
    public long c;
    @SerializedName("name")
    public String d;
    @SerializedName("stock")
    public int e;
    @SerializedName("reason")
    public String f;
    @SerializedName("picture")
    public String g;
    public boolean h;
    @SerializedName("unavailable_count")
    public int i;
    @SerializedName("simple_error_reason")
    public String j;
    @SerializedName("attrs")
    public List<GoodsAttr> k;
    @SerializedName("attr_list")
    public List<GoodsAttr> l;
    @SerializedName("premium_attrs")
    public List<GoodsAttr> m;
    @SerializedName("combo_products")
    public List<ComboProduct> n;

    @Override // com.sankuai.waimai.platform.domain.core.goods.d
    public final String f() {
        return null;
    }

    private a a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47c1875fbf5026a8ff0da065c6af192c", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47c1875fbf5026a8ff0da065c6af192c");
        }
        this.b = jSONObject.optLong("spu_id");
        this.c = jSONObject.optLong("id");
        this.d = jSONObject.optString("name");
        this.e = jSONObject.optInt("stock");
        this.f = jSONObject.optString("reason");
        this.g = jSONObject.optString("picture");
        this.i = jSONObject.optInt("unavailable_count");
        this.j = jSONObject.optString("simple_error_reason");
        try {
            this.k = GoodsAttr.fromJsonArray(jSONObject.optJSONArray("attrs"));
            JSONArray optJSONArray = jSONObject.optJSONArray("attr_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                if (this.k == null) {
                    this.k = new ArrayList();
                }
                for (int i = 0; i < length; i++) {
                    this.k.add(GoodsAttr.fromJson(optJSONArray.getJSONObject(i)));
                }
            }
            this.m = GoodsAttr.fromPremiumJsonArray(jSONObject.optJSONArray("premium_attrs"));
            JSONArray optJSONArray2 = jSONObject.optJSONArray("combo_products");
            if (optJSONArray2 != null) {
                this.n = (List) new Gson().fromJson(optJSONArray2.toString(), new TypeToken<List<ComboProduct>>() { // from class: com.sankuai.waimai.platform.domain.core.order.a.1
                }.getType());
            }
        } catch (JSONException unused) {
        }
        this.h = true;
        return this;
    }

    public static List<a> a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c829410df8528ccd3b8bd41c20c74093", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c829410df8528ccd3b8bd41c20c74093");
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.length() <= 0) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.optInt("id", -1) != -1) {
                arrayList.add(new a().a(optJSONObject));
            }
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.platform.domain.core.goods.d
    public final String a() {
        return this.g;
    }

    @Override // com.sankuai.waimai.platform.domain.core.goods.d
    public final String b() {
        return this.d;
    }

    @Override // com.sankuai.waimai.platform.domain.core.goods.d
    public final int c() {
        return this.i;
    }

    @Override // com.sankuai.waimai.platform.domain.core.goods.d
    public final String d() {
        return this.j;
    }

    @Override // com.sankuai.waimai.platform.domain.core.goods.d
    public final List<GoodsAttr> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13fcf853a2aa982f15b5c676afaa4d74", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13fcf853a2aa982f15b5c676afaa4d74");
        }
        ArrayList arrayList = new ArrayList();
        if (this.k != null) {
            arrayList.addAll(this.k);
        }
        if (this.l != null) {
            arrayList.addAll(this.l);
        }
        if (this.m != null) {
            arrayList.addAll(this.m);
        }
        return arrayList;
    }
}
