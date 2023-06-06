package com.sankuai.waimai.business.restaurant.composeorder;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.ContextThemeWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.net.c;
import com.sankuai.waimai.business.restaurant.base.shopcart.b;
import com.sankuai.waimai.business.restaurant.base.shopcart.e;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.multiperson.MultiPersonCart;
import com.sankuai.waimai.platform.domain.core.multiperson.inner.Product;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.globalcart.poimix.a;
import com.sankuai.waimai.router.activity.d;
import com.sankuai.waimai.router.core.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public static boolean c = false;
    private static a h;
    public List<Product> d;
    public String e;
    public String f;
    public boolean g;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "921d6f4f87168ed2a1f037cf17d93aa5", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "921d6f4f87168ed2a1f037cf17d93aa5");
        }
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        return h;
    }

    public static void a(final String str, String str2, String str3, final Activity activity, int i) {
        Object[] objArr = {str, str2, str3, activity, 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73c16e76dafbe0b378c810ff3dfcac0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73c16e76dafbe0b378c810ff3dfcac0c");
            return;
        }
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(activity);
        String i2 = g.i();
        b n = k.a().n(str);
        final String str4 = n.r;
        com.sankuai.waimai.business.restaurant.base.repository.b.a(activity.getClass().getSimpleName() + System.currentTimeMillis()).a(str, str2, str3, i2, n, new c<String>() { // from class: com.sankuai.waimai.business.restaurant.composeorder.a.1
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
            public final /* synthetic */ void a(Object obj) {
                String str5 = (String) obj;
                Object[] objArr2 = {str5};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8215efaec1bcb9868548cd070a023a06", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8215efaec1bcb9868548cd070a023a06");
                    return;
                }
                super.a((AnonymousClass1) str5);
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                try {
                    MultiPersonCart fromJson = MultiPersonCart.fromJson(new JSONObject(str5));
                    if (fromJson.getPoiInfo() != null) {
                        String poiIdStr = fromJson.getPoiInfo().getPoiIdStr();
                        if (str != null && !str.equals(poiIdStr)) {
                            GlobalCartManager.getInstance().addNewPoiId(str, poiIdStr);
                            a.C1052a.a("cart_modify", str, poiIdStr);
                            com.sankuai.waimai.platform.domain.core.poi.b.a(fromJson.getPoiInfo().getPoiId(), poiIdStr);
                        }
                    }
                    com.sankuai.waimai.business.restaurant.base.log.c.d();
                    Bundle bundle = new Bundle();
                    bundle.putString("multi_person_data", str5);
                    bundle.putInt("page_source", r3);
                    bundle.putString("goods_coupon_view_id", str4);
                    com.sankuai.waimai.foundation.router.a.a().a(new d() { // from class: com.sankuai.waimai.business.restaurant.composeorder.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.router.activity.d
                        public final boolean a(@NonNull j jVar, @NonNull Intent intent) throws ActivityNotFoundException, SecurityException {
                            Object[] objArr3 = {jVar, intent};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5ba5a6dd8b9f34759330ef2ca923f035", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5ba5a6dd8b9f34759330ef2ca923f035")).booleanValue();
                            }
                            intent.addFlags(603979776);
                            jVar.c.startActivity(intent);
                            return true;
                        }
                    }).a(bundle).a(activity, "wm_router://page/mrn?mrn_biz=waimai&mrn_component=multiPerson&mrn_entry=multi-person");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3dd7a43f598519cdf24845466f25381", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3dd7a43f598519cdf24845466f25381");
                    return;
                }
                super.a(aVar);
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                if (aVar != null) {
                    ae.a(activity, aVar.getMessage());
                    com.sankuai.waimai.business.restaurant.base.log.c.a(aVar.b(), aVar.getMessage());
                }
            }
        });
    }

    public static void a(final String str, boolean z, final Activity activity, int i) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), activity, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0f2c005aeffe543d2ac58317ababf2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0f2c005aeffe543d2ac58317ababf2f");
            return;
        }
        final Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.business.restaurant.composeorder.a.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a554977a90464798bbf276f46c2aac8c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a554977a90464798bbf276f46c2aac8c");
                    return;
                }
                final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(activity);
                b n = k.a().n(str);
                final String str2 = n.r;
                com.sankuai.waimai.business.restaurant.base.repository.b.a(activity.getClass().getSimpleName() + System.currentTimeMillis()).a(str, n, new c<String>() { // from class: com.sankuai.waimai.business.restaurant.composeorder.a.2.1
                    public static ChangeQuickRedirect b;

                    @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
                    public final /* synthetic */ void a(Object obj) {
                        String str3 = (String) obj;
                        Object[] objArr3 = {str3};
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3296287f00b361113b93e45f8024511e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3296287f00b361113b93e45f8024511e");
                            return;
                        }
                        super.a((AnonymousClass1) str3);
                        com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                        try {
                            MultiPersonCart fromJson = MultiPersonCart.fromJson(new JSONObject(str3));
                            if (fromJson.getPoiInfo() != null) {
                                String poiIdStr = fromJson.getPoiInfo().getPoiIdStr();
                                if (str != null && !str.equals(poiIdStr)) {
                                    GlobalCartManager.getInstance().addNewPoiId(str, poiIdStr);
                                    a.C1052a.a("cart_modify", str, poiIdStr);
                                    com.sankuai.waimai.platform.domain.core.poi.b.a(fromJson.getPoiInfo().getPoiId(), poiIdStr);
                                }
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("multi_person_data", str3);
                            bundle.putInt("page_source", r3);
                            bundle.putString("goods_coupon_view_id", str2);
                            com.sankuai.waimai.foundation.router.a.a(activity, "wm_router://page/mrn?mrn_biz=waimai&mrn_component=multiPerson&mrn_entry=multi-person", bundle);
                        } catch (Exception unused) {
                        }
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
                    public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                        Object[] objArr3 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce63c47f3b40983545bdee5ea00936c1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce63c47f3b40983545bdee5ea00936c1");
                            return;
                        }
                        super.a(aVar);
                        com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                        if (aVar != null) {
                            ae.a(activity, aVar.getMessage());
                        }
                    }
                });
            }
        };
        final b n = k.a().n(str);
        ArrayList<OrderedFood> h2 = n.h();
        final ArrayList arrayList = new ArrayList();
        Iterator<OrderedFood> it = h2.iterator();
        while (it.hasNext()) {
            OrderedFood next = it.next();
            if (!com.sankuai.waimai.foundation.utils.b.b(next.getComboItems())) {
                arrayList.add(next);
            }
        }
        if (!com.sankuai.waimai.foundation.utils.b.b(arrayList)) {
            new RooAlertDialog.a(new ContextThemeWrapper(activity, 2131558962)).a((CharSequence) null).b(com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_restaurant_multi_person_combo_submit)).a("是", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.composeorder.a.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(final DialogInterface dialogInterface, int i2) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27636b669f8180fddeb29fb517273978", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27636b669f8180fddeb29fb517273978");
                        return;
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        n.b((OrderedFood) it2.next());
                    }
                    k.a().p(str);
                    k.a().b(str, new e() { // from class: com.sankuai.waimai.business.restaurant.composeorder.a.4.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "deacdea3ffac324eaebd97faab405617", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "deacdea3ffac324eaebd97faab405617");
                            }
                        }

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a(b bVar) {
                            Object[] objArr3 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "996bfc8364173c3cbcbde298c9d1df0c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "996bfc8364173c3cbcbde298c9d1df0c");
                                return;
                            }
                            runnable.run();
                            dialogInterface.dismiss();
                        }

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                            Object[] objArr3 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "357e2b1029666ff2da6cfc88ef16cd77", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "357e2b1029666ff2da6cfc88ef16cd77");
                                return;
                            }
                            runnable.run();
                            dialogInterface.dismiss();
                        }
                    });
                }
            }).b("否", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.composeorder.a.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34ae4056d816b4a8404dedf54991d15e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34ae4056d816b4a8404dedf54991d15e");
                    } else {
                        dialogInterface.dismiss();
                    }
                }
            }).b();
        } else {
            runnable.run();
        }
    }

    public static void a(Activity activity, int i, String str, String str2) {
        Object[] objArr = {activity, 3, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "733c606bdcc00dd9c48118b33091cd08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "733c606bdcc00dd9c48118b33091cd08");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("page_source", 3);
        StringBuilder sb = new StringBuilder();
        sb.append(com.sankuai.waimai.platform.domain.core.poi.b.a(str));
        bundle.putString("poi_id", sb.toString());
        bundle.putString("poi_id_Str", str);
        bundle.putString("cart_id", str2);
        com.sankuai.waimai.foundation.router.a.a(activity, "wm_router://page/mrn?mrn_biz=waimai&mrn_component=multiPerson&mrn_entry=multi-person", bundle);
    }

    public final void a(List<GoodsSpu> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbdb33b5b270ab3a88cd92916c6b5a0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbdb33b5b270ab3a88cd92916c6b5a0d");
        } else if (b && !com.sankuai.waimai.foundation.utils.b.b(list) && !c) {
            if (com.sankuai.waimai.foundation.utils.b.b(this.d)) {
                k.a().a(str);
                k.a().f(str);
                com.sankuai.waimai.business.order.api.submit.c.a().clearOrder();
                k.a().b(str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.d.size(); i++) {
                Product product = this.d.get(i);
                OrderedFood a2 = a(list, product.getSpuId(), product.getSkuId(), product);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            k.a().f(str, arrayList);
        }
    }

    private OrderedFood a(List<GoodsSpu> list, long j, long j2, Product product) {
        Object[] objArr = {list, new Long(j), new Long(j2), product};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e28a7895da9343032417b00e6cca5834", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e28a7895da9343032417b00e6cca5834");
        }
        for (int i = 0; i < list.size(); i++) {
            GoodsSpu goodsSpu = list.get(i);
            if (goodsSpu.getId() == j) {
                List<GoodsSku> skuList = goodsSpu.getSkuList();
                for (int i2 = 0; i2 < skuList.size(); i2++) {
                    GoodsSku goodsSku = skuList.get(i2);
                    if (goodsSku.getSkuId() == j2) {
                        OrderedFood orderedFood = new OrderedFood();
                        orderedFood.spu = goodsSpu;
                        orderedFood.sku = goodsSku;
                        orderedFood.setCartId(product.getPackageId());
                        orderedFood.setCount(product.getCount());
                        ArrayList<GoodsAttr> attrs = product.getAttrs();
                        if (!com.sankuai.waimai.foundation.utils.b.b(attrs)) {
                            GoodsAttr[] goodsAttrArr = new GoodsAttr[attrs.size()];
                            for (int i3 = 0; i3 < attrs.size(); i3++) {
                                goodsAttrArr[i3] = attrs.get(i3);
                            }
                            orderedFood.setAttrIds(goodsAttrArr);
                        }
                        return orderedFood;
                    }
                }
                continue;
            }
        }
        return null;
    }
}
