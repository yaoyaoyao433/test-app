package com.sankuai.waimai.business.restaurant.base.skuchoose;

import android.app.Activity;
import android.view.View;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.shopcart.protocol.GoodsSpuAttrs;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPCartModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public MPCartModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22d608f61036f1422f117ce3d166d1ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22d608f61036f1422f117ce3d166d1ec");
        }
    }

    @JSMethod(methodName = "increaseMultiAttrFood")
    public void increaseMultiAttrFood(MachMap machMap, final MPJSCallBack mPJSCallBack) {
        boolean z = false;
        Object[] objArr = {machMap, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65651ec613a42bc2dfaef28bc0da5848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65651ec613a42bc2dfaef28bc0da5848");
            return;
        }
        final Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        String str = (String) machMap.get("poiId");
        double parseDouble = Double.parseDouble((String) machMap.get(Constants.GestureMoveEvent.KEY_X));
        double parseDouble2 = Double.parseDouble((String) machMap.get(Constants.GestureMoveEvent.KEY_Y));
        GoodsSpuAttrs goodsSpu = GoodsSpuAttrs.getGoodsSpu((String) machMap.get("goodsSpuAttrs"));
        if (goodsSpu == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(goodsSpu);
        if (parseDouble != -1.0d && parseDouble2 != -1.0d) {
            z = true;
        }
        final com.sankuai.waimai.restaurant.shopcart.utils.f fVar = new com.sankuai.waimai.restaurant.shopcart.utils.f(activity);
        fVar.a((int) com.sankuai.waimai.machpro.util.b.b((float) parseDouble), (int) com.sankuai.waimai.machpro.util.b.b((float) parseDouble2));
        final boolean z2 = z;
        com.sankuai.waimai.business.restaurant.base.shopcart.protocol.a.a(activity, str, arrayList, new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.MPCartModule.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e559d95ba87fb39b3b46454c743820dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e559d95ba87fb39b3b46454c743820dc");
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fcaa527f95140b24f0378c688e0caa39", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fcaa527f95140b24f0378c688e0caa39");
                    return;
                }
                if (z2 && (activity instanceof WMRestaurantActivity)) {
                    ((WMRestaurantActivity) activity).e.F.k.a((com.meituan.android.cube.pga.common.b<View>) fVar);
                }
                MachMap machMap2 = new MachMap();
                machMap2.put("code", 0);
                mPJSCallBack.invoke(machMap2);
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8623fc01570d0b8d23c8c71d79875380", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8623fc01570d0b8d23c8c71d79875380");
                    return;
                }
                MachMap machMap2 = new MachMap();
                machMap2.put("code", 1);
                machMap2.put("msg", aVar.getMessage());
                mPJSCallBack.invoke(machMap2);
            }
        });
    }

    @JSMethod(methodName = "decreaseMultiAttrFood")
    public void decreaseMultiAttrFood(MachMap machMap, final MPJSCallBack mPJSCallBack) {
        Object[] objArr = {machMap, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30b7d8d5cbf107a0bab8e79578875077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30b7d8d5cbf107a0bab8e79578875077");
            return;
        }
        String str = (String) machMap.get("poiId");
        GoodsSpuAttrs goodsSpu = GoodsSpuAttrs.getGoodsSpu((String) machMap.get("goodsSpuAttrs"));
        if (goodsSpu == null) {
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.protocol.a.a(str, goodsSpu, new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.MPCartModule.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ccf5a5006ab1b6ee1f3898ad834e7bf2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ccf5a5006ab1b6ee1f3898ad834e7bf2");
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8ada3fe1d518ec1ca0bc584b9b940bc2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8ada3fe1d518ec1ca0bc584b9b940bc2");
                    return;
                }
                MachMap machMap2 = new MachMap();
                machMap2.put("code", 0);
                mPJSCallBack.invoke(machMap2);
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dff1f7a3922fcc359d08ba59cba904ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dff1f7a3922fcc359d08ba59cba904ed");
                    return;
                }
                MachMap machMap2 = new MachMap();
                machMap2.put("code", 1);
                machMap2.put("msg", aVar.getMessage());
                mPJSCallBack.invoke(machMap2);
                i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("delete_food").c(aVar.getMessage()).b());
            }
        });
    }

    @JSMethod(methodName = "orderedFoodCount")
    public MachMap orderedFoodCount(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9c91f251ea04a5773caae48fcd2b557", RobustBitConfig.DEFAULT_VALUE) ? (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9c91f251ea04a5773caae48fcd2b557") : getShopCartOrderCount((String) machMap.get("poiId"), Long.parseLong((String) machMap.get("spuId")), Long.parseLong((String) machMap.get("skuId")), (GoodsAttr[]) com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().fromJson((String) machMap.get("attrs"), new TypeToken<GoodsAttr[]>() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.MPCartModule.3
        }.getType()));
    }

    @JSMethod(methodName = "getOrderedFood")
    public String getOrderedFood(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75f4a216ae016c09e2cce30830296793", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75f4a216ae016c09e2cce30830296793");
        }
        ArrayList<OrderedFood> b = k.a().n((String) machMap.get("poiId")).b(Long.parseLong((String) machMap.get("spuId")));
        JsonArray jsonArray = new JsonArray();
        if (!com.sankuai.waimai.foundation.utils.b.b(b)) {
            Iterator<OrderedFood> it = b.iterator();
            while (it.hasNext()) {
                OrderedFood next = it.next();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("spu_id", Long.valueOf(next.getSpuId()));
                jsonObject.addProperty("sku_id", Long.valueOf(next.getSkuId()));
                jsonObject.addProperty("spu_name", next.getName());
                jsonObject.addProperty("count", Integer.valueOf(next.getCount()));
                jsonObject.add("attrs", com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().toJsonTree(next.getAttrIds()));
                jsonArray.add(jsonObject);
            }
        }
        return jsonArray.toString();
    }

    private Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91e93ba928a969edc7d5f9e6add5bb08", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91e93ba928a969edc7d5f9e6add5bb08");
        }
        if (getMachContext() == null || !(getMachContext().getContext() instanceof Activity)) {
            return null;
        }
        return (Activity) getMachContext().getContext();
    }

    public MachMap getShopCartOrderCount(String str, long j, long j2, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {str, new Long(j), new Long(j2), goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45b38e7418796b4dbd3c5464178b21b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45b38e7418796b4dbd3c5464178b21b1");
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(str);
        if (n != null) {
            int e = n.e();
            int a = n.a(j);
            int a2 = n.a(j, j2);
            int a3 = n.a(j, j2, goodsAttrArr);
            MachMap machMap = new MachMap();
            machMap.put("countWithTotal", Integer.valueOf(e));
            machMap.put("countWithSpu", Integer.valueOf(a));
            machMap.put("countWithSku", Integer.valueOf(a2));
            machMap.put("countWithAttrs", Integer.valueOf(a3));
            return machMap;
        }
        return null;
    }
}
