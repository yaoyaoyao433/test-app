package com.sankuai.waimai.business.restaurant.base.soldoutguide;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.i;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog;
import com.sankuai.waimai.restaurant.shopcart.popup.c;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SoldOutGuideRNDialog extends MRNDialog implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static ChangeQuickRedirect a;
    private long b;
    private String c;
    private List<OrderedFood> d;
    private long e;
    private String f;
    private String g;
    private int h;
    private long i;
    private String l;

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final String g() {
        return "waimai";
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final String h() {
        return "sold-out-guide";
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final String i() {
        return "SoldOutGuidePopUp";
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final String j() {
        return "SoldOutGuideRNDialog";
    }

    public SoldOutGuideRNDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b88ef5fc761cd8f9c8f58e98692607ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b88ef5fc761cd8f9c8f58e98692607ce");
        } else {
            this.h = -1;
        }
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final int[] e() {
        return new int[4];
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final c d() {
        return c.BOTTOM_UP;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final List<i> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9691efc3643291b9c0d16ceb3596cdb6", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9691efc3643291b9c0d16ceb3596cdb6") : super.k();
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2564aa247a354b89f7e58a72adfeade0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2564aa247a354b89f7e58a72adfeade0");
        } else if (TextUtils.isEmpty(this.g)) {
        } else {
            super.a(activity);
        }
    }

    public final void a(int i, String str, Poi poi, GoodsSpu goodsSpu, List<OrderedFood> list) {
        Object[] objArr = {Integer.valueOf(i), str, poi, goodsSpu, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3cda2e888747817655b0e0386538209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3cda2e888747817655b0e0386538209");
        } else if (poi == null || goodsSpu == null) {
            com.sankuai.waimai.foundation.utils.log.a.e("SoldOutGuideRNDialog", "输入参数不合法", new Object[0]);
        } else {
            this.g = str;
            this.e = poi.getId();
            this.l = poi.getPoiIDStr();
            this.b = goodsSpu.getId();
            this.i = poi.getOriginBrandId();
            this.c = goodsSpu.getName();
            this.d = list;
            this.h = i;
            JsonArray jsonArray = new JsonArray();
            if (list != null) {
                for (OrderedFood orderedFood : list) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("spu_id", Long.valueOf(orderedFood.getSpuId()));
                    jsonObject.addProperty("sku_id", Long.valueOf(orderedFood.getSkuId()));
                    jsonObject.addProperty("spu_name", orderedFood.getName());
                    jsonObject.addProperty("count", Integer.valueOf(orderedFood.getCount()));
                    jsonObject.add("attrs", com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().toJsonTree(orderedFood.getAttrIds()));
                    jsonArray.add(jsonObject);
                }
            }
            this.f = jsonArray.toString();
        }
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final Bundle f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e81cd770e9a121da54b739ffcf3338b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e81cd770e9a121da54b739ffcf3338b2");
        }
        Bundle bundle = new Bundle();
        bundle.putString("data", this.g);
        bundle.putSerializable("spu_id", Long.valueOf(this.b));
        bundle.putLong("poi_id", this.e);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, this.l);
        bundle.putString("spu_name", this.c);
        bundle.putString("orderedFoods", this.f);
        bundle.putInt("pageFrom", this.h);
        bundle.putLong("brand_id", this.i);
        return bundle;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba7cd33f8920fc2624bb4bcb23b47a38", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba7cd33f8920fc2624bb4bcb23b47a38")).intValue() : g.b(b.a);
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6969b30d063c2958700c5e10a590c815", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6969b30d063c2958700c5e10a590c815")).intValue() : (int) (g.b(b.a) * 0.28d);
    }
}
