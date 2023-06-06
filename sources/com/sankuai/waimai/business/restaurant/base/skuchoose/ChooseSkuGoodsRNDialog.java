package com.sankuai.waimai.business.restaurant.base.skuchoose;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.l;
import com.sankuai.waimai.business.restaurant.poicontainer.utils.MachProJsonUtil;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.domain.core.goods.GoodsLogField;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog;
import com.sankuai.waimai.restaurant.shopcart.popup.MRNPopupFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ChooseSkuGoodsRNDialog extends MRNDialog implements OrderGoodObserver {
    public static ChangeQuickRedirect a;
    protected GoodsSpu b;
    com.sankuai.waimai.business.restaurant.base.manager.order.g c;
    WeakReference<View> d;
    boolean e;
    List<OrderedFood> f;
    int g;
    String h;
    com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.a i;
    private int l;
    private int m;
    private g n;
    private h o;
    private long p;
    private String q;

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final String g() {
        return "waimai";
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final String h() {
        return "multi-sku-template";
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final String i() {
        return "MultiSkuTemplate";
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final String j() {
        return "ChooseSkuGoodsRNDialog";
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final boolean m() {
        return true;
    }

    public ChooseSkuGoodsRNDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20dc7dcf7ddd562e3587d03aec4957b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20dc7dcf7ddd562e3587d03aec4957b2");
            return;
        }
        this.l = -1;
        this.q = "";
        this.m = com.sankuai.waimai.foundation.utils.g.b(com.meituan.android.singleton.b.a);
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final int b() {
        return this.m;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final com.sankuai.waimai.restaurant.shopcart.popup.c d() {
        return com.sankuai.waimai.restaurant.shopcart.popup.c.MIDDLE;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final int[] e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8952bd56213a470a3783604a300bd5f3", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8952bd56213a470a3783604a300bd5f3") : new int[]{0, 0, 0, 0};
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final Bundle f() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abb6a91593c11ebcab8c5ff297a37012", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abb6a91593c11ebcab8c5ff297a37012");
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("goodSpu", com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().toJson(this.b));
        bundle.putLong("poi_id", com.sankuai.waimai.platform.domain.core.poi.b.a(this.q));
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, this.q);
        bundle.putLong("brand_id", this.p);
        bundle.putLong("maxHeight", com.sankuai.waimai.foundation.utils.g.c(com.meituan.android.singleton.b.a, this.m));
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject = new JsonObject();
        com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(this.q);
        List<OrderedFood> list = this.f;
        if (!n()) {
            if (n == null || this.b == null) {
                i2 = 0;
                i3 = 0;
            } else {
                list = n.b(this.b.getId());
                i3 = n.e();
                i2 = n.a(this.b.getId());
            }
        } else {
            if (com.sankuai.waimai.foundation.utils.b.b(list)) {
                i = 0;
            } else {
                i = 0;
                for (OrderedFood orderedFood : list) {
                    i += orderedFood.count;
                }
            }
            bundle.putInt("limitCount", this.g);
            i2 = i;
            i3 = 1;
        }
        if (list != null) {
            for (OrderedFood orderedFood2 : list) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("spu_id", Long.valueOf(orderedFood2.getSpuId()));
                jsonObject2.addProperty("sku_id", Long.valueOf(orderedFood2.getSkuId()));
                jsonObject2.addProperty("spu_name", orderedFood2.getName());
                jsonObject2.addProperty("count", Integer.valueOf(orderedFood2.getCount()));
                jsonObject2.add("attrs", com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().toJsonTree(orderedFood2.getAttrIds()));
                jsonArray.add(jsonObject2);
            }
        }
        jsonObject.addProperty("countWithTotal", Integer.valueOf(i3));
        jsonObject.addProperty("countWithSpu", Integer.valueOf(i2));
        bundle.putString("orderedFoods", jsonArray.toString());
        bundle.putString("orderedCount", jsonObject.toString());
        bundle.putInt("pageFrom", this.l);
        HashMap hashMap = new HashMap();
        try {
            Map<String, Object> javaMap = MachProJsonUtil.a(this.b.logData.toString()).getJavaMap();
            if (javaMap != null) {
                hashMap.putAll(javaMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        double d = -1.0d;
        int i7 = -1;
        if (this.l == 0) {
            hashMap.put("poi_id", this.q);
            hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(u().a));
            hashMap.put(DataConstants.CATEGORY_ID, this.b.getTag());
            hashMap.put("spu_id", Long.valueOf(this.b.id));
            hashMap.put("spu_type", Integer.valueOf(this.b.spuType));
            hashMap.put("rec_trace_id", this.b.recTraceId);
            hashMap.put("stid", this.c.e);
            hashMap.put("rank_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok"));
            hashMap.put("ref_list_id", ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok_ref"));
            if (u().b >= 0) {
                hashMap.put("product_index", Integer.valueOf(this.n.b));
            }
            JSONObject jSONObject = this.b.logData;
            if (jSONObject != null) {
                d = jSONObject.optDouble("reduce_price");
                i5 = jSONObject.optInt("tag_type");
                i6 = jSONObject.optInt("fixedprice");
            } else {
                i5 = -1;
                i6 = -1;
            }
            hashMap.put("reduce_price", Double.valueOf(d));
            hashMap.put("tag_type", Integer.valueOf(i5));
            hashMap.put("fixedprice", Integer.valueOf(i6));
            hashMap.put("word_type", l.a(jSONObject, "word_type", -1));
            hashMap.put("brand_id", Long.valueOf(this.c.A()));
            l.a(getActivity(), hashMap);
        } else if (r()) {
            com.sankuai.waimai.platform.domain.manager.goods.a.a();
            GoodsLogField goodLogField = this.b.getGoodLogField();
            if (goodLogField != null) {
                d = goodLogField.getReducePrice();
                i7 = goodLogField.getTagType();
                i4 = goodLogField.getFixedPrice();
            } else {
                i4 = -1;
            }
            hashMap.put("reduce_price", Double.valueOf(d));
            hashMap.put("tag_type", Integer.valueOf(i7));
            hashMap.put("fixedprice", Integer.valueOf(i4));
            hashMap.put("brand_id", Long.valueOf(this.c.A()));
            l.a(getActivity(), hashMap);
        } else if (s()) {
            hashMap.put("poi_id", this.q);
            hashMap.put("spu_id", Long.valueOf(this.b.id));
            hashMap.put("keyword", p().a == null ? "" : p().a);
            hashMap.put("poisearch_log_id", p().c);
            hashMap.put("index", Integer.valueOf(p().d));
            hashMap.put("poisearch_global_id", p().b);
            hashMap.put("brand_id", Long.valueOf(this.c.A()));
            l.a(getActivity(), hashMap);
        } else if (t()) {
            hashMap.put("poi_id", this.q);
            hashMap.put("spu_id", Long.valueOf(this.b.id));
            hashMap.put("orig_price", "");
            hashMap.put("current_price", this.b.getPromotionInfo());
            hashMap.put("brand_id", Long.valueOf(this.c.A()));
        }
        bundle.putString("judasParam", com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().toJson(hashMap));
        return bundle;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final List<i> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e10f27f231ddcc849891be163b8ef280", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e10f27f231ddcc849891be163b8ef280");
        }
        List<i> k = super.k();
        k.add(new a());
        return k;
    }

    public final void a(int i, Poi poi, GoodsSpu goodsSpu, View view) {
        Object[] objArr = {Integer.valueOf(i), poi, goodsSpu, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae43875c177756febc170a822bacbc8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae43875c177756febc170a822bacbc8c");
        } else if (poi == null || goodsSpu == null) {
            com.sankuai.waimai.foundation.utils.log.a.e("ChooseSkuGoodsRNDialog", "输入参数不合法", new Object[0]);
        } else {
            this.l = i;
            this.d = new WeakReference<>(view);
            this.c = new com.sankuai.waimai.business.restaurant.base.manager.order.g(poi);
            this.q = this.c.f();
            this.b = goodsSpu;
            this.p = this.c.A();
        }
    }

    public final GoodsSpu l() {
        return this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements i {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.facebook.react.i
        @NonNull
        public final List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
            Object[] objArr = {reactApplicationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0284281f2e3d8be232ecf5b0a5149ef", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0284281f2e3d8be232ecf5b0a5149ef");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ChooseSkuDialogModule(reactApplicationContext));
            return arrayList;
        }

        @Override // com.facebook.react.i
        @NonNull
        public final List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
            Object[] objArr = {reactApplicationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a708921f012648545b1905ebc8bad7d5", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a708921f012648545b1905ebc8bad7d5") : Collections.emptyList();
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93b4930066e1cc3e65e47a84952244d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93b4930066e1cc3e65e47a84952244d2");
            return;
        }
        super.onCancel(dialogInterface);
        k.a().b(this);
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog, android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8380ee9f619d7dbfaa7175c5dddb000d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8380ee9f619d7dbfaa7175c5dddb000d");
            return;
        }
        super.onDismiss(dialogInterface);
        k.a().b(this);
        ae.a();
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db1f2bc9cca77d40aa7cc196318c1d8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db1f2bc9cca77d40aa7cc196318c1d8d");
            return;
        }
        super.onStart();
        k.a().a(this);
        ae.a(getDialog().getWindow());
    }

    private boolean r() {
        return this.l == 2;
    }

    private boolean s() {
        return this.l == 1;
    }

    private boolean t() {
        return this.l == 4;
    }

    public final boolean n() {
        return this.l == 6;
    }

    public final String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88a08d7cfcdbcb01ccf43d9f5dba7e47", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88a08d7cfcdbcb01ccf43d9f5dba7e47") : r() ? "c_u4fk4kw" : s() ? "c_1b9anm4" : t() ? "c_u4fk4kw" : "c_CijEL";
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bce293e76b62b4718b5958087a9c6645", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bce293e76b62b4718b5958087a9c6645");
            return;
        }
        u().a = i;
        u().b = i2;
    }

    private g u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52638271b995813ee0f3ee4104f6d1d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52638271b995813ee0f3ee4104f6d1d9");
        }
        if (this.n == null) {
            this.n = new g();
        }
        return this.n;
    }

    public final h p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f63085ff21b0b106a39d37bd0d6d5c21", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f63085ff21b0b106a39d37bd0d6d5c21");
        }
        if (this.o == null) {
            this.o = new h();
        }
        return this.o;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog
    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfcdac0e89ae140a0b994ed91b2197fd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfcdac0e89ae140a0b994ed91b2197fd")).intValue() : com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 460.0f);
    }

    @Override // com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver
    public final void aF_() {
        ReactInstanceManager l;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cad2c13d879062eac505574fac8dc515", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cad2c13d879062eac505574fac8dc515");
            return;
        }
        WeakReference<MRNPopupFragment> weakReference = this.k;
        if (weakReference == null || weakReference.get() == null || (l = weakReference.get().l()) == null || l.getCurrentReactContext() == null) {
            return;
        }
        com.sankuai.waimai.business.restaurant.rn.bridge.a.a(l.getCurrentReactContext(), "updateOrderGood", Arguments.createMap());
    }
}
