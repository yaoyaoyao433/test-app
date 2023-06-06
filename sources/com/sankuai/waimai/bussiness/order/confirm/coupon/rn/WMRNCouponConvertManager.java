package com.sankuai.waimai.bussiness.order.confirm.coupon.rn;

import android.text.TextUtils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.confirm.coupon.controller.ExchangeCouponDialog;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.manager.poi.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMRNCouponConvertManager extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "WMRNCouponConvertManager";
    public static final int SCR_PAGE_H5_COIN = 4;
    public static final int SCR_PAGE_H5_COUPON_LIST = 3;
    public static final int SCR_PAGE_RESTAURANT = 1;
    public static final int SCR_PAGE_SELECT_RED_PACKET = 2;
    public static final String WM_COUPON_PAGE_CID = "c_av0m4wrp";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ReactApplicationContext mReactContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public WMRNCouponConvertManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afe3287e9d4e4c3e9f1cf871e9793cc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afe3287e9d4e4c3e9f1cf871e9793cc5");
        } else {
            this.mReactContext = reactApplicationContext;
        }
    }

    @ReactMethod
    public void showExchangePOICouponViewWithParams(ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49692935d1776973ce0cbd3fea487c70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49692935d1776973ce0cbd3fea487c70");
        } else if (this.mReactContext.getCurrentActivity() == null) {
        } else {
            final long parseLong = Long.parseLong(readableMap.getString("poi_id"));
            final String string = readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR) ? readableMap.getString(FoodDetailNetWorkPreLoader.URI_POI_STR) : "";
            final String string2 = readableMap.getString("coupon_id");
            String string3 = readableMap.hasKey("other_poi_selected_coupon_view_ids") ? readableMap.getString("other_poi_selected_coupon_view_ids") : null;
            int i = readableMap.hasKey("exchange_type") ? readableMap.getInt("exchange_type") : 0;
            int parseInt = readableMap.hasKey("card_type") ? Integer.parseInt(readableMap.getString("card_type")) : 0;
            final int i2 = i;
            final int i3 = i;
            new ExchangeCouponDialog().setCounponOuterCode(readableMap.hasKey("outerCode") ? readableMap.getString("outerCode") : "").setCouponCardType(parseInt).setCouponProductId(readableMap.hasKey("product_id") ? Long.parseLong(readableMap.getString("product_id")) : 0L).setOtherCouponViewIds(string3).setExchangeType(i).setCid(WM_COUPON_PAGE_CID).setOnExchangeSuccessCallbackWithParams(new ExchangeCouponDialog.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.coupon.rn.WMRNCouponConvertManager.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.coupon.controller.ExchangeCouponDialog.a
                public final void a(WritableMap writableMap) {
                    Object[] objArr2 = {writableMap};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fb4413bb29983056c55aecac496388a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fb4413bb29983056c55aecac496388a6");
                        return;
                    }
                    JudasManualManager.a a2 = JudasManualManager.b("b_meyjyt2c").a("poi_id", !TextUtils.isEmpty(string) ? string : String.valueOf(parseLong)).a("coupon_source", i2).a("coupon_id", string2).a(WMRNCouponConvertManager.WM_COUPON_PAGE_CID);
                    a2.b = WMRNCouponConvertManager.REACT_CLASS;
                    a2.a();
                    if (writableMap != null) {
                        promise.resolve(writableMap);
                    } else {
                        promise.resolve("success");
                    }
                }
            }).showExchangeCouponDialog(this.mReactContext.getCurrentActivity(), b.b.toString(), new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.coupon.rn.WMRNCouponConvertManager.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c662c4a164596dcd0f24cc32d335dd96", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c662c4a164596dcd0f24cc32d335dd96");
                    } else {
                        a.a().a(string);
                    }
                }
            }, new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.coupon.rn.WMRNCouponConvertManager.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b8f53a4fbb72624750f70db6e97d5010", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b8f53a4fbb72624750f70db6e97d5010");
                        return;
                    }
                    promise.reject("-1", "failed");
                    JudasManualManager.a a2 = JudasManualManager.b("b_ts86f20q").a("poi_id", !TextUtils.isEmpty(string) ? string : String.valueOf(parseLong)).a("coupon_source", i3).a("src_page_id", 2).a(WMRNCouponConvertManager.WM_COUPON_PAGE_CID);
                    a2.b = WMRNCouponConvertManager.REACT_CLASS;
                    a2.a();
                }
            }, null, parseLong, string, i, string2, 2, readableMap.hasKey("extend_info") ? readableMap.getString("extend_info") : "");
        }
    }

    @ReactMethod
    public void showToast(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b69ad3414650d357e43d770ff1114601", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b69ad3414650d357e43d770ff1114601");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ae.a(this.mReactContext.getCurrentActivity(), str);
        }
    }
}
