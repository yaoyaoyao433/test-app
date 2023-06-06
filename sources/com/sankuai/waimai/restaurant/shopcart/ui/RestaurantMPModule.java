package com.sankuai.waimai.restaurant.shopcart.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.foundation.utils.ac;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RestaurantMPModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RestaurantMPModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac2985ad089e1cf5e436eba800264034", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac2985ad089e1cf5e436eba800264034");
        }
    }

    @JSMethod(methodName = "clearOrderWithoutCalculate")
    public void clearOrderWithoutCalculate(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87219f125737cd137249d6a485fccd59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87219f125737cd137249d6a485fccd59");
        } else {
            com.sankuai.waimai.business.restaurant.base.manager.order.k.a().a(com.sankuai.waimai.business.restaurant.base.util.c.a(str));
        }
    }

    @JSMethod(methodName = "addGoodWithSpuSku")
    public void addGoodWithSpuSku(String str, String str2, String str3, String str4, int i, int i2, float f, String str5, MPJSCallBack mPJSCallBack) {
        Object[] objArr = {str, str2, str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), str5, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "052415c8762e9110e84befae10417b4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "052415c8762e9110e84befae10417b4f");
            return;
        }
        String a = com.sankuai.waimai.business.restaurant.base.util.c.a(str);
        long transformLong = transformLong(str3);
        MachMap machMap = new MachMap();
        try {
            try {
                GoodsSpu transformGoodsSpu = transformGoodsSpu(str2);
                GoodsAttr[] transformGoodsAttrArr = transformGoodsAttrArr(str4);
                int a2 = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(a).a(transformGoodsSpu.getId(), transformLong);
                GoodsSku a3 = com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.c.a(transformGoodsSpu, transformLong);
                int a4 = com.sankuai.waimai.business.restaurant.base.manager.order.b.a(a3, a2, 1);
                if (i < a4) {
                    throw new com.sankuai.waimai.platform.domain.manager.exceptions.a(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_cart_must_reach_min_count));
                }
                int i3 = (i - a4) + 1;
                for (int i4 = 0; i4 < i3; i4++) {
                    com.sankuai.waimai.business.restaurant.base.manager.order.k.a().a((Activity) getMachContext().getContext(), a, transformGoodsSpu, a3, transformGoodsAttrArr);
                }
                machMap.put("isAddSuccess", Boolean.TRUE);
                if (mPJSCallBack != null) {
                    mPJSCallBack.invoke(machMap);
                }
            } catch (com.sankuai.waimai.platform.domain.manager.exceptions.a unused) {
                machMap.put("isAddSuccess", Boolean.FALSE);
                if (mPJSCallBack != null) {
                    mPJSCallBack.invoke(machMap);
                }
            } catch (Exception unused2) {
                machMap.put("isAddSuccess", Boolean.FALSE);
                if (mPJSCallBack != null) {
                    mPJSCallBack.invoke(machMap);
                }
            }
        } catch (Throwable th) {
            if (mPJSCallBack != null) {
                mPJSCallBack.invoke(machMap);
            }
            throw th;
        }
    }

    @JSMethod(methodName = "removeGoodWithSpuSku")
    public void removeGoodWithSpuSku(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e80c61a86cd69362bffbd6519167e76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e80c61a86cd69362bffbd6519167e76");
            return;
        }
        long transformLong = transformLong(str3);
        GoodsSpu transformGoodsSpu = transformGoodsSpu(str2);
        OrderedFood orderedFood = new OrderedFood(transformGoodsSpu, com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.c.a(transformGoodsSpu, transformLong), null, 0);
        orderedFood.ignoreAttrs = true;
        com.sankuai.waimai.business.restaurant.base.manager.order.k.a().a(com.sankuai.waimai.business.restaurant.base.util.c.a(str), orderedFood);
    }

    @JSMethod(methodName = "calculateShopCart")
    public void calculateShopCart(String str, final MPJSCallBack mPJSCallBack) {
        Object[] objArr = {str, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ebfa46e30b4be63bd5a5afa07f8fc3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ebfa46e30b4be63bd5a5afa07f8fc3f");
        } else {
            com.sankuai.waimai.business.restaurant.base.manager.order.k.a().b(com.sankuai.waimai.business.restaurant.base.util.c.a(str), new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.RestaurantMPModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ada8ed613650ea1172dfdb1cac389092", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ada8ed613650ea1172dfdb1cac389092");
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "68cec71c4ea42eca0ce740e34108d1de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "68cec71c4ea42eca0ce740e34108d1de");
                        return;
                    }
                    MachMap machMap = new MachMap();
                    machMap.put("isSuccess", Boolean.TRUE);
                    if (mPJSCallBack != null) {
                        mPJSCallBack.invoke(machMap);
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2661fa129ae7dd3a78d62938bba48803", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2661fa129ae7dd3a78d62938bba48803");
                        return;
                    }
                    MachMap machMap = new MachMap();
                    machMap.put("isSuccess", Boolean.FALSE);
                    if (mPJSCallBack != null) {
                        mPJSCallBack.invoke(machMap);
                    }
                }
            });
        }
    }

    @JSMethod(methodName = "previewOrder")
    public void previewOrder(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78a83f41076fd9daf6633787db300afa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78a83f41076fd9daf6633787db300afa");
        } else if (getMachContext() == null) {
        } else {
            Context context = getMachContext().getContext();
            if (context instanceof WMRestaurantActivity) {
                ((WMRestaurantActivity) context).e.F.g.a((com.meituan.android.cube.pga.common.b<Object>) null);
            }
        }
    }

    @JSMethod(methodName = "closeMoneyOffAssistant")
    public void closeMoneyOffAssistant() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbeca1574b6c35e985b64f6bf5ad6878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbeca1574b6c35e985b64f6bf5ad6878");
        } else if (getMachContext() == null) {
        } else {
            Context context = getMachContext().getContext();
            if (context instanceof WMRestaurantActivity) {
                ((WMRestaurantActivity) context).e.F.r.a((com.meituan.android.cube.pga.common.b<Boolean>) null);
            }
        }
    }

    @JSMethod(methodName = "isHasDiscountGood")
    public void isHasDiscountGood(String str, MPJSCallBack mPJSCallBack) {
        OrderedFood orderedFood;
        GoodsSpu goodsSpu;
        boolean z = true;
        Object[] objArr = {str, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aba59e3c93679a0642cb5dff24a6f356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aba59e3c93679a0642cb5dff24a6f356");
        } else if (getMachContext() == null) {
            if (mPJSCallBack != null) {
                mPJSCallBack.invoke((MachMap) null);
            }
        } else {
            Context context = getMachContext().getContext();
            if (context instanceof WMRestaurantActivity) {
                List<com.sankuai.waimai.business.restaurant.base.shopcart.g> list = ((WMRestaurantActivity) context).e.F.w.a().b;
                if (com.sankuai.waimai.foundation.utils.b.a(list)) {
                    for (com.sankuai.waimai.business.restaurant.base.shopcart.g gVar : list) {
                        ShopCartItem shopCartItem = gVar.h;
                        if (shopCartItem != null && (orderedFood = shopCartItem.food) != null && (goodsSpu = orderedFood.spu) != null && (goodsSpu.getActivityType() == 1 || goodsSpu.getActivityType() == 2)) {
                            break;
                        }
                    }
                }
            }
            z = false;
            MachMap machMap = new MachMap();
            machMap.put("isHasDiscountGood", Boolean.valueOf(z));
            if (mPJSCallBack != null) {
                mPJSCallBack.invoke(machMap);
            }
        }
    }

    public long transformLong(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "765bfa25a72bbabecace9a8deaa45a6f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "765bfa25a72bbabecace9a8deaa45a6f")).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public GoodsSpu transformGoodsSpu(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef3d3c1cade9738ed107420bfa919b13", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSpu) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef3d3c1cade9738ed107420bfa919b13");
        }
        if (str == null) {
            return null;
        }
        return (GoodsSpu) com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().fromJson(str, (Class<Object>) GoodsSpu.class);
    }

    public GoodsAttr[] transformGoodsAttrArr(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ffa61013b8a7d205daa2b7f114b9334", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ffa61013b8a7d205daa2b7f114b9334");
        }
        if (str == null) {
            return null;
        }
        return (GoodsAttr[]) com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().fromJson(str, (Class<Object>) GoodsAttr[].class);
    }

    @JSMethod(methodName = "toastWithMessage")
    public void toastWithMessage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29f9e7ab61b3ca61ae8955e8f16c77bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29f9e7ab61b3ca61ae8955e8f16c77bc");
        } else if (getMachContext() == null) {
        } else {
            ae.a(getMachContext().getContext(), str);
        }
    }

    @JSMethod(methodName = "loginStatus")
    public boolean loginStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42a431a69ccc7ca9eec72a6cfac790e5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42a431a69ccc7ca9eec72a6cfac790e5")).booleanValue() : com.sankuai.waimai.platform.domain.manager.user.a.i().a();
    }

    @JSMethod(methodName = "loginAlert")
    public void loginAlert(final MPJSCallBack mPJSCallBack) {
        final WMRestaurantActivity wMRestaurantActivity;
        Object[] objArr = {mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b65b1305b45245e690e11b706b96f3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b65b1305b45245e690e11b706b96f3c");
            return;
        }
        final Context context = getMachContext().getContext();
        if ((context instanceof WMRestaurantActivity) && (wMRestaurantActivity = (WMRestaurantActivity) context) != null) {
            new CustomDialog.a(context).b(context.getString(R.string.wm_restaurant_poi_address_login_dialog_content)).a(context.getString(R.string.wm_restaurant_poi_address_login_dialog_button), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.RestaurantMPModule.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "00acf960aebcf470fe1a7188cda867a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "00acf960aebcf470fe1a7188cda867a8");
                        return;
                    }
                    JudasManualManager.a a2 = JudasManualManager.a("b_waimai_itnjrzb0_mc").a("c_CijEL");
                    a2.b = AppUtil.generatePageInfoKey(wMRestaurantActivity);
                    a2.a("poi_id", wMRestaurantActivity.k()).a();
                    com.sankuai.waimai.platform.domain.manager.user.a.a(context, new Runnable() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.RestaurantMPModule.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c5494fba17f35513e3bd38daf0f103dc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c5494fba17f35513e3bd38daf0f103dc");
                                return;
                            }
                            MachMap machMap = new MachMap();
                            machMap.put("success", Boolean.TRUE);
                            mPJSCallBack.invoke(machMap);
                        }
                    }, new Runnable() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.RestaurantMPModule.2.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f4f9b238dd3aabf21b3b0265ae8c7e18", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f4f9b238dd3aabf21b3b0265ae8c7e18");
                                return;
                            }
                            MachMap machMap = new MachMap();
                            machMap.put("success", Boolean.FALSE);
                            mPJSCallBack.invoke(machMap);
                        }
                    });
                }
            }).b(CustomDialog.d.CENTER).a().show();
        }
    }

    @JSMethod(methodName = "alertWithInfo")
    public void alertWithInfo(String str, String str2, String str3, String str4, final MPJSCallBack mPJSCallBack, final MPJSCallBack mPJSCallBack2) {
        Object[] objArr = {str, str2, str3, str4, mPJSCallBack, mPJSCallBack2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b49ffa6687dec8da58f457924507a21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b49ffa6687dec8da58f457924507a21");
        } else {
            new CustomDialog.a(getMachContext().getContext()).a(str).b(str2).a(str3, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.RestaurantMPModule.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6348dfac885beb41de588a8326df6a52", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6348dfac885beb41de588a8326df6a52");
                        return;
                    }
                    MachMap machMap = new MachMap();
                    if (mPJSCallBack != null) {
                        mPJSCallBack.invoke(machMap);
                    }
                }
            }).b(str4, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.RestaurantMPModule.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "50a75a82575db9a8443df548b9b7dc84", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "50a75a82575db9a8443df548b9b7dc84");
                        return;
                    }
                    MachMap machMap = new MachMap();
                    if (mPJSCallBack2 != null) {
                        mPJSCallBack2.invoke(machMap);
                    }
                }
            }).b(CustomDialog.d.CENTER).a().show();
        }
    }

    @JSMethod(methodName = "alertWithPhoneList")
    public void alertWithPhoneList(MachArray machArray, String str, MPJSCallBack mPJSCallBack) {
        Object[] objArr = {machArray, str, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c8f44605d5aaa3f861f5bcce1fc72b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c8f44605d5aaa3f861f5bcce1fc72b5");
            return;
        }
        final Context context = getMachContext().getContext();
        if (!ac.a(context)) {
            ae.a(context, (int) R.string.wm_restaurant_orderProgress_telephonyDisable);
        } else if (machArray == null || machArray.size() == 0) {
            ae.a(context, (int) R.string.wm_restaurant_no_useable_phones);
        } else {
            final String[] strArr = new String[machArray.size()];
            for (int i = 0; i < machArray.size(); i++) {
                if (machArray.get(i) != null) {
                    strArr[i] = str + "：" + machArray.get(i).toString();
                }
            }
            new CustomDialog.a(context).c(R.string.wm_restaurant_order_detail_phone_call).a(strArr, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.RestaurantMPModule.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "44fd92ba705e009e897e7baff33048ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "44fd92ba705e009e897e7baff33048ef");
                        return;
                    }
                    JudasManualManager.a a2 = JudasManualManager.a("b_waimai_g88f0b1s_mc").a("c_CijEL");
                    a2.b = AppUtil.generatePageInfoKey(context);
                    a2.a();
                    com.sankuai.waimai.foundation.utils.z.a(context, strArr[i2]);
                }
            }).b(R.string.wm_restaurant_dialog_btn_cancel, (DialogInterface.OnClickListener) null).c();
        }
    }

    @JSMethod(methodName = "showNormalHeader")
    public void date(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "821f29f7015a24eded360a2f69b79a88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "821f29f7015a24eded360a2f69b79a88");
            return;
        }
        Context context = getMachContext().getContext();
        if (context instanceof WMRestaurantActivity) {
            ((WMRestaurantActivity) context).e.H.b.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
        }
    }

    @JSMethod(methodName = "showExpandableHeader")
    public void showExpandableHeader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "607b778afc62f88be3773ce2737224dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "607b778afc62f88be3773ce2737224dd");
        } else if (getMachContext() == null) {
        } else {
            Context context = getMachContext().getContext();
            if (context instanceof WMRestaurantActivity) {
                ((WMRestaurantActivity) context).e.H.c.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
            }
        }
    }
}
