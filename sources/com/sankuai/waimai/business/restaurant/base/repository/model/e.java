package com.sankuai.waimai.business.restaurant.base.repository.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.poi.PoiItem;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends PoiItem {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public double e;
    public double f;
    public long g;
    public List<GoodsSpu> h;
    public int i;
    private String j;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30b882a9f1ba2a8f1bb702a38f274eb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30b882a9f1ba2a8f1bb702a38f274eb6");
        } else {
            this.i = -1;
        }
    }

    private ArrayList<GoodsSpu> a(JSONObject jSONObject, String str, boolean z) {
        Object[] objArr = {jSONObject, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "600fac7dbf8be6c1bb0eb9298d460624", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "600fac7dbf8be6c1bb0eb9298d460624");
        }
        ArrayList<GoodsSpu> arrayList = new ArrayList<>();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(z ? "dynamic_spus" : "product_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    GoodsSpu goodsSpu = new GoodsSpu();
                    goodsSpu.parseJson(optJSONObject);
                    goodsSpu.setTag(str);
                    arrayList.add(goodsSpu);
                }
            }
        } catch (Exception e) {
            String simpleName = getClass().getSimpleName();
            com.sankuai.waimai.foundation.utils.log.a.e(simpleName, e.getMessage(), new Object[0]);
        }
        return arrayList;
    }

    public static ArrayList<e> a(JSONArray jSONArray, String str, boolean z) {
        Object[] objArr = {jSONArray, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50e7171630c2a76a092d634b2cb72d01", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50e7171630c2a76a092d634b2cb72d01");
        }
        ArrayList<e> arrayList = new ArrayList<>();
        if (jSONArray == null || jSONArray.length() == 0) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            e eVar = new e();
            Object[] objArr2 = {optJSONObject, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "99dcd1fb7388a6c5ad33036574013110", RobustBitConfig.DEFAULT_VALUE)) {
                eVar = (e) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "99dcd1fb7388a6c5ad33036574013110");
            } else if (optJSONObject != null) {
                eVar.setTag(str);
                eVar.b = optJSONObject.optString("title");
                eVar.c = optJSONObject.optString("recommend_reason");
                eVar.d = optJSONObject.optString("activity_tips");
                eVar.e = optJSONObject.optDouble("price");
                eVar.f = optJSONObject.optDouble("origin_price");
                eVar.g = optJSONObject.optLong("group_id");
                eVar.h = eVar.a(optJSONObject, str, z);
                eVar.i = optJSONObject.optInt("spu_type", -1);
                arrayList.add(eVar);
            }
            arrayList.add(eVar);
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem, com.sankuai.waimai.platform.domain.core.poi.IPoiItem
    public final String getTag() {
        return this.j;
    }

    @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem
    public final void setTag(String str) {
        this.j = str;
    }
}
