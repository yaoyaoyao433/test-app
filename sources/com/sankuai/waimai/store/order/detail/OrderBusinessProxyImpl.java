package com.sankuai.waimai.store.order.detail;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogCallback;
import com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogController;
import com.sankuai.waimai.business.order.api.store.IOrderBusinessService;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.widget.dialog.a;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.mach.SGHttpJSNativeMethod;
import com.sankuai.waimai.store.mrn.dialog.SGMRNDialogFragment;
import com.sankuai.waimai.store.newcustomer.NewCustomerCouponListDialog;
import com.sankuai.waimai.store.newcustomer.NewCustomerImageDialog;
import com.sankuai.waimai.store.order.detail.rocks.c;
import com.sankuai.waimai.store.platform.domain.core.poi.CouponCollectionTip;
import com.sankuai.waimai.store.poi.list.newp.methods.OnJsEventJump;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.shopping.cart.ui.ShopCartBoxPriceDialog;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.m;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class OrderBusinessProxyImpl implements IOrderBusinessService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.business.order.api.store.b
    public Dialog showNewCustomImageDialog(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9511de1e261e0aaf9f37296b3cbb87e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9511de1e261e0aaf9f37296b3cbb87e7");
        }
        CouponCollectionTip couponCollectionTip = (CouponCollectionTip) i.a(str, CouponCollectionTip.class);
        if (couponCollectionTip == null || t.a(couponCollectionTip.getTipBeginImageUrl())) {
            return null;
        }
        NewCustomerImageDialog newCustomerImageDialog = new NewCustomerImageDialog(activity);
        Object[] objArr2 = {couponCollectionTip};
        ChangeQuickRedirect changeQuickRedirect3 = NewCustomerImageDialog.a;
        if (PatchProxy.isSupport(objArr2, newCustomerImageDialog, changeQuickRedirect3, false, "ef30d66f52f3c994d1424b12a6440f9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, newCustomerImageDialog, changeQuickRedirect3, false, "ef30d66f52f3c994d1424b12a6440f9e");
        } else if (couponCollectionTip != null) {
            newCustomerImageDialog.e = couponCollectionTip;
            String tipBeginImageUrl = couponCollectionTip.getTipBeginImageUrl();
            Object[] objArr3 = {tipBeginImageUrl};
            ChangeQuickRedirect changeQuickRedirect4 = NewCustomerImageDialog.a;
            if (PatchProxy.isSupport(objArr3, newCustomerImageDialog, changeQuickRedirect4, false, "47a64d92ce722ea3a8821f36eefe86af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, newCustomerImageDialog, changeQuickRedirect4, false, "47a64d92ce722ea3a8821f36eefe86af");
            } else if (!TextUtils.isEmpty(tipBeginImageUrl)) {
                b.C0608b b = m.b(tipBeginImageUrl, h.a(newCustomerImageDialog.bB_(), 310.0f), ImageQualityUtil.a());
                b.j = R.drawable.wm_sc_common_loading_large;
                b.i = R.drawable.wm_sc_common_loading_large;
                b.a(newCustomerImageDialog.b);
            }
            newCustomerImageDialog.c.setText(couponCollectionTip.getTipBeginTitle());
            newCustomerImageDialog.d.setText(couponCollectionTip.getTipBeginSubtitle());
        }
        a.a(newCustomerImageDialog);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = NewCustomerImageDialog.a;
        if (PatchProxy.isSupport(objArr4, newCustomerImageDialog, changeQuickRedirect5, false, "6fb69e867a3c3f8869a1cb5f4f6c10e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, newCustomerImageDialog, changeQuickRedirect5, false, "6fb69e867a3c3f8869a1cb5f4f6c10e4");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b("c_hgowsqb", "b_waimai_5w0rjvuj_mv").a("order_view_id", newCustomerImageDialog.e == null ? "" : newCustomerImageDialog.e.getOrderId()).a();
        }
        return newCustomerImageDialog;
    }

    @Override // com.sankuai.waimai.business.order.api.store.b
    public Dialog showCouponListDialog(Activity activity, String str, DialogInterface.OnDismissListener onDismissListener) {
        Object[] objArr = {activity, str, onDismissListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "830ce9ed0fd38b1d68e0208ed1973b2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "830ce9ed0fd38b1d68e0208ed1973b2c");
        }
        CouponCollectionTip couponCollectionTip = (CouponCollectionTip) i.a(str, CouponCollectionTip.class);
        if (couponCollectionTip == null || com.sankuai.shangou.stone.util.a.b(couponCollectionTip.getCouponDetailInfoList())) {
            return null;
        }
        NewCustomerCouponListDialog newCustomerCouponListDialog = new NewCustomerCouponListDialog(activity);
        newCustomerCouponListDialog.a(couponCollectionTip, new com.sankuai.waimai.store.newcustomer.a());
        newCustomerCouponListDialog.setOnDismissListener(onDismissListener);
        newCustomerCouponListDialog.show();
        return newCustomerCouponListDialog;
    }

    @Override // com.sankuai.waimai.business.order.api.store.b
    public void showSGMrnDialog(Context context, HashMap<String, String> hashMap, int i, String str, String str2, String str3) {
        Object[] objArr = {context, hashMap, Integer.valueOf(i), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3b2edbbde22a3561d98e13afb48ca32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3b2edbbde22a3561d98e13afb48ca32");
            return;
        }
        Object[] objArr2 = {context, hashMap, Integer.valueOf(i), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect3 = g.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "0f7e7b1ec923afb22ac8f1d37a95458e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "0f7e7b1ec923afb22ac8f1d37a95458e");
        } else {
            d.a(context, hashMap, i, str, str2, str3);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.store.b
    public Dialog showDialog(Context context, Map<String, Object> map, String str) {
        Object[] objArr = {context, map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e9f61f67545abfad6b2b13519ca8cc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e9f61f67545abfad6b2b13519ca8cc3");
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 467349553) {
            if (hashCode == 1593498253 && str.equals("total_box_price_dialog")) {
                c = 0;
            }
        } else if (str.equals("image_viewer_dialog")) {
            c = 1;
        }
        switch (c) {
            case 0:
                ShopCartBoxPriceDialog shopCartBoxPriceDialog = new ShopCartBoxPriceDialog(context);
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect3 = ShopCartBoxPriceDialog.a;
                if (PatchProxy.isSupport(objArr2, shopCartBoxPriceDialog, changeQuickRedirect3, false, "b979af3a7d5095e0b30b9ef77b8017cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, shopCartBoxPriceDialog, changeQuickRedirect3, false, "b979af3a7d5095e0b30b9ef77b8017cf");
                } else if (map != null) {
                    Object obj = map.get("shop_cart_total_box_info");
                    if (obj instanceof ShopCartTotalBoxPriceInfo) {
                        shopCartBoxPriceDialog.a((ShopCartTotalBoxPriceInfo) obj);
                    }
                }
                shopCartBoxPriceDialog.show();
                return shopCartBoxPriceDialog;
            case 1:
                if (map != null && (map.get("orderViewId") instanceof String)) {
                    showImageViewer(context, (String) map.get("orderViewId"), map);
                    break;
                }
                break;
        }
        return null;
    }

    public static void showImageViewer(Context context, String str, Map<String, Object> map) {
        Object[] objArr = {context, str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3ab7a16ab99d464530b3a3a29414200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3ab7a16ab99d464530b3a3a29414200");
            return;
        }
        String str2 = "";
        if (map != null && map.get("poiId") != null) {
            str2 = String.valueOf(map.get("poiId"));
        }
        SGMRNDialogFragment.a aVar = new SGMRNDialogFragment.a();
        aVar.d = "flashbuy-prescription-image-viewer";
        aVar.c = "flashbuy-medicial-user";
        SGMRNDialogFragment a = aVar.a("orderViewId", str).a("poiId", str2).a();
        if (context instanceof FragmentActivity) {
            a.b((FragmentActivity) context, context.getClass().getSimpleName());
        }
    }

    @Override // com.sankuai.waimai.business.order.api.store.e
    public String getRecommendCouponInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d722704cdc4b3bb2871c4aa232c58e23", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d722704cdc4b3bb2871c4aa232c58e23");
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b d = com.sankuai.waimai.store.order.a.e().d(Long.parseLong(str));
        if (d == null || d.u == null) {
            return null;
        }
        return d.u.recommendCouponInfo;
    }

    @Override // com.sankuai.waimai.business.order.api.store.c
    public IDynamicDialogController createDynamicDialog(Activity activity, AlertInfo alertInfo, @NonNull Map<String, Object> map, boolean z, IDynamicDialogCallback iDynamicDialogCallback) {
        Object[] objArr = {activity, alertInfo, map, Byte.valueOf(z ? (byte) 1 : (byte) 0), iDynamicDialogCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8771f9a7149d39186d7a4c165e3a446b", RobustBitConfig.DEFAULT_VALUE) ? (IDynamicDialogController) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8771f9a7149d39186d7a4c165e3a446b") : new com.sankuai.waimai.store.order.detail.dynamic.a(activity, alertInfo, map, z, iDynamicDialogCallback);
    }

    @Override // com.sankuai.waimai.business.order.api.store.e
    public void showPauseCyclePurchaseSheet(Context context, int i, String str, String str2, String str3) {
        Object[] objArr = {context, Integer.valueOf(i), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "087194ae6034fbafdb9d552fd19347ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "087194ae6034fbafdb9d552fd19347ef");
            return;
        }
        Object[] objArr2 = {context, Integer.valueOf(i), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect3 = g.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "fb388c317bf6c099702bbe8fb930a841", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "fb388c317bf6c099702bbe8fb930a841");
            return;
        }
        d.b(context, com.sankuai.waimai.store.router.h.s + "?mrn_biz=supermarket&mrn_entry=flashbuy-cycle-buy&mrn_component=flashbuy-cyclebuy-order-pause-delivery&page_height=0.73&order_view_id=" + str + "&poi_id=" + str2 + "&poi_id_str=" + str3, (Bundle) null, i);
    }

    @Override // com.sankuai.waimai.business.order.api.store.e
    public void showMrnDialog(Context context, String str, double d, double d2, double d3, double d4, long j, String str2, int i, String str3, long j2) {
        String str4;
        Object[] objArr = {context, str, Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), new Long(j), str2, Integer.valueOf(i), str3, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36880ea3e267c982e6bea242f606790f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36880ea3e267c982e6bea242f606790f");
            return;
        }
        try {
            str4 = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            str4 = "";
        }
        d.a(context, com.sankuai.waimai.store.router.h.s + "?mrn_biz=supermarket&mrn_entry=flashbuy-collect-bills&mrn_component=flashbuy-collect-bills&page_height=0.73&coupon_price=" + d + "&can_use_coupon_price=" + d2 + "&coupon_discount_price=" + d3 + "&wm_poi_id=" + j + "&poi_id_str=" + str2 + "&collect_order_type=" + i + "&spread_money=" + d4 + "&poi_first_cate_id=" + j2 + "&act_uuid=" + str3 + "&recommend_coupon_view_id=" + str4 + "&cid=c_ykhs39e&pageName=c_ykhs39e");
    }

    public void registerCertificateFinishListener(com.sankuai.waimai.business.order.api.pay.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1048f15474cea83f281b3c3d52f9dc06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1048f15474cea83f281b3c3d52f9dc06");
            return;
        }
        com.sankuai.waimai.store.knb.manager.a a = com.sankuai.waimai.store.knb.manager.a.a();
        if (bVar == null) {
            return;
        }
        a.c = bVar;
    }

    @Override // com.sankuai.waimai.business.order.api.store.d
    public void registerOnPayTypeListener(com.sankuai.waimai.business.order.api.pay.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18e7f9bbcdb7a88384e6cf4178241b9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18e7f9bbcdb7a88384e6cf4178241b9f");
            return;
        }
        com.sankuai.waimai.store.knb.manager.a a = com.sankuai.waimai.store.knb.manager.a.a();
        if (dVar == null) {
            return;
        }
        a.d = dVar;
    }

    @Override // com.sankuai.waimai.business.order.api.store.a
    public void onRocksReceiveMachJsEvent(final Context context, @NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {context, str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6ef5c3bf02fc6e0ed2f0cc7f8dec69d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6ef5c3bf02fc6e0ed2f0cc7f8dec69d");
            return;
        }
        Object[] objArr2 = {context, str, map};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "e2c4bf5f90cc46db1ef938ec2b7930be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "e2c4bf5f90cc46db1ef938ec2b7930be");
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1129090925) {
            if (hashCode == 3273774 && str.equals("jump")) {
                c = 1;
            }
        } else if (str.equals("flashbuy-medicial-user")) {
            c = 0;
        }
        switch (c) {
            case 0:
                com.sankuai.waimai.store.order.detail.rocks.a aVar = new com.sankuai.waimai.store.order.detail.rocks.a();
                Object[] objArr3 = {context, map};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.order.detail.rocks.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect4, false, "df1b375462dc0f6675ed6033681fabca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect4, false, "df1b375462dc0f6675ed6033681fabca");
                    return;
                } else if (map != null && (context instanceof Activity)) {
                    String a = com.sankuai.waimai.store.order.detail.rocks.a.a(map, Constants.EventConstants.KEY_ORDER_ID);
                    String a2 = com.sankuai.waimai.store.order.detail.rocks.a.a(map, "poiId");
                    String a3 = com.sankuai.waimai.store.order.detail.rocks.a.a(map, FoodDetailNetWorkPreLoader.URI_POI_STR);
                    Object[] objArr4 = {context, a, a2, a3};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.order.detail.rocks.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect5, false, "30c0027b94aff9e90de7b769b30e4c49", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect5, false, "30c0027b94aff9e90de7b769b30e4c49");
                        return;
                    }
                    SGMRNDialogFragment.a aVar2 = new SGMRNDialogFragment.a();
                    aVar2.d = "flashbuy-prescription-image-viewer";
                    aVar2.c = "flashbuy-medicial-user";
                    SGMRNDialogFragment a4 = aVar2.a("poi_id", a2).a(FoodDetailNetWorkPreLoader.URI_POI_STR, a3).a("orderViewId", a).a();
                    if (context instanceof FragmentActivity) {
                        a4.b((FragmentActivity) context, context.getClass().getSimpleName());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                final com.sankuai.waimai.store.order.detail.rocks.b bVar = new com.sankuai.waimai.store.order.detail.rocks.b();
                Object[] objArr5 = {context, map};
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.order.detail.rocks.b.a;
                if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect6, false, "27e3d05f453c590e99e14e8205fa09de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect6, false, "27e3d05f453c590e99e14e8205fa09de");
                    return;
                } else if (context instanceof Activity) {
                    new OnJsEventJump().a(new com.sankuai.waimai.store.mach.event.a() { // from class: com.sankuai.waimai.store.order.detail.rocks.b.1
                        @Override // com.sankuai.waimai.store.mach.event.a
                        public final void b(@NonNull String str2, @Nullable Map<String, Object> map2) {
                        }

                        @Override // com.sankuai.waimai.store.mach.event.a
                        public final Activity a() {
                            return (Activity) context;
                        }
                    }, null, map);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.sankuai.waimai.business.order.api.store.a
    public JSInvokeNativeMethod getRocksSGHttpMethod(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "073e01751bf9c1ad11ad407bd86945e4", RobustBitConfig.DEFAULT_VALUE) ? (JSInvokeNativeMethod) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "073e01751bf9c1ad11ad407bd86945e4") : new SGHttpJSNativeMethod(str);
    }

    @Override // com.sankuai.waimai.business.order.api.store.IOrderBusinessService
    public boolean backIntercept(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a43cc36628a5d9b04e697ca234720308", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a43cc36628a5d9b04e697ca234720308")).booleanValue();
        }
        List list = (List) j.h().a("order/order_back_target_schemes", new TypeToken<ArrayList<String>>() { // from class: com.sankuai.waimai.store.order.detail.OrderBusinessProxyImpl.1
        }.getType());
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return false;
        }
        List<Activity> a = com.sankuai.waimai.store.util.a.b.a();
        if (com.sankuai.shangou.stone.util.a.b(a)) {
            return false;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) a);
        int i = 0;
        int i2 = -1;
        while (true) {
            if (i >= a2) {
                i = i2;
                break;
            }
            String readSchemePathFrom = readSchemePathFrom((Activity) com.sankuai.shangou.stone.util.a.a((List<Object>) a, i));
            if (t.a(readSchemePathFrom)) {
                i2 = i;
            } else if (list.contains(readSchemePathFrom)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            if (j.h().a("order/clear_all_strategy", false)) {
                for (Activity activity2 : a) {
                    if (activity != activity2 && !com.sankuai.waimai.store.util.b.a(activity2)) {
                        activity2.finish();
                    }
                }
                return true;
            }
            return false;
        }
        int a3 = com.sankuai.shangou.stone.util.a.a((List) a);
        for (int i3 = 0; i3 < i && i3 < a3; i3++) {
            Activity activity3 = (Activity) com.sankuai.shangou.stone.util.a.a((List<Object>) a, i3);
            if (activity != activity3 && !com.sankuai.waimai.store.util.b.a(activity3)) {
                activity3.finish();
            }
        }
        return true;
    }

    private String readSchemePathFrom(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "368f82280f0ef112aef670f1b9b9a3f2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "368f82280f0ef112aef670f1b9b9a3f2") : (activity == null || activity.getIntent() == null || activity.getIntent().getData() == null) ? "" : activity.getIntent().getData().getPath();
    }
}
