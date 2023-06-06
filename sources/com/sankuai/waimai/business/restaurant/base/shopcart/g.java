package com.sankuai.waimai.business.restaurant.base.shopcart;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g implements Serializable {
    public static ChangeQuickRedirect a = null;
    public static int b = 4;
    public static int c = -1;
    public int d;
    public int e;
    public int f;
    public int g;
    public ShopCartItem h;
    public boolean i;
    public String j;
    public boolean k;
    public double l;
    public String m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14d6394c340f772dca82516b3ccbf64a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14d6394c340f772dca82516b3ccbf64a");
            return;
        }
        this.o = false;
        this.p = true;
        this.q = false;
        this.r = false;
    }

    public static String a(List<g> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cd88f3f937de48863cedecf8dcd657c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cd88f3f937de48863cedecf8dcd657c");
        }
        JSONArray jSONArray = new JSONArray();
        while (i < list.size()) {
            try {
                g gVar = list.get(i);
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                if (gVar.e == 0) {
                    int i2 = i + 1;
                    while (true) {
                        if (i2 < list.size()) {
                            g gVar2 = list.get(i2);
                            if (gVar2.e == 1) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("subbox_price_desc", gVar2.h.food.getSubBoxPriceDesc());
                                jSONObject2.put("spu_name", gVar2.h.food.getName());
                                jSONObject2.put("subbox_price", gVar2.h.food.getSubBoxPrice());
                                jSONArray2.put(jSONObject2);
                                if (i2 == list.size() - 1) {
                                    jSONObject.put("food_list", jSONArray2);
                                    jSONObject.put("subbox_price", gVar.l);
                                    jSONObject.put("pocket_name", gVar.j);
                                    jSONArray.put(jSONObject);
                                    break;
                                }
                                i2++;
                            } else {
                                jSONObject.put("food_list", jSONArray2);
                                jSONObject.put("subbox_price", gVar.l);
                                jSONObject.put("pocket_name", gVar.j);
                                jSONArray.put(jSONObject);
                                i = i2 - 1;
                                break;
                            }
                        }
                    }
                }
                i++;
            } catch (JSONException unused) {
                return "";
            }
        }
        return jSONArray.toString();
    }
}
