package com.sankuai.waimai.bussiness.order.confirm.coupon.rn;

import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.globalcart.rn.CouponPopupModule;
import com.sankuai.waimai.platform.utils.l;
import javax.annotation.Nonnull;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CouponPopupCallbackModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String EXTRA_EVENT_NAME;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "WMMRNPOPRouterCallback";
    }

    public CouponPopupCallbackModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c82543e7ddd6e8017a800c29ccd5a9df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c82543e7ddd6e8017a800c29ccd5a9df");
        } else {
            this.EXTRA_EVENT_NAME = CouponPopupModule.EXTRA_EVENT_NAME;
        }
    }

    @ReactMethod
    public void didCloseWithParams(final ReadableMap readableMap, final String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c427d940c85d7d00d12e88846ae8b43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c427d940c85d7d00d12e88846ae8b43");
        } else {
            l.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.coupon.rn.CouponPopupCallbackModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ffd2cc2ab86661c2fb44695a558bdb77", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ffd2cc2ab86661c2fb44695a558bdb77");
                    } else if (f.a(CouponPopupCallbackModule.this.getCurrentActivity())) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            if (readableMap.hasKey("didCancel")) {
                                jSONObject.put("didCancel", readableMap.getBoolean("didCancel"));
                            }
                            if (readableMap.hasKey("result")) {
                                ReadableMap map = readableMap.getMap("result");
                                JSONObject jSONObject2 = new JSONObject();
                                if (map != null) {
                                    if (map.hasKey("coupon_id")) {
                                        jSONObject2.put("coupon_id", map.getString("coupon_id"));
                                    }
                                    if (map.hasKey("intent_poi_id")) {
                                        jSONObject2.put("intent_poi_id", map.getString("intent_poi_id"));
                                    }
                                    if (map.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR)) {
                                        jSONObject2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, map.getString(FoodDetailNetWorkPreLoader.URI_POI_STR));
                                    }
                                    if (map.hasKey("poicoupon_view_id")) {
                                        jSONObject2.put("poicoupon_view_id", map.getString("poicoupon_view_id"));
                                    }
                                    if (map.hasKey("sg_item_coupon_view_id")) {
                                        jSONObject2.put("sg_item_coupon_view_id", map.getString("sg_item_coupon_view_id"));
                                    }
                                    if (map.hasKey("goods_coupon_view_id")) {
                                        jSONObject2.put("goods_coupon_view_id", map.getString("goods_coupon_view_id"));
                                    }
                                    if (map.hasKey("apParams")) {
                                        jSONObject2.put("apParams", map.getString("apParams"));
                                    }
                                }
                                jSONObject.put("result", jSONObject2);
                            }
                        } catch (Exception e) {
                            a.a(e);
                        }
                        Intent intent = CouponPopupCallbackModule.this.getCurrentActivity().getIntent();
                        if (intent == null) {
                            intent = new Intent();
                        }
                        intent.putExtra("didCancel", false);
                        CouponPopupCallbackModule.this.getCurrentActivity().setIntent(intent);
                        Intent intent2 = new Intent();
                        intent2.putExtra("resultData", jSONObject.toString());
                        intent2.putExtra(CouponPopupModule.EXTRA_EVENT_NAME, str);
                        CouponPopupCallbackModule.this.getCurrentActivity().setResult(-1, intent2);
                        CouponPopupCallbackModule.this.getCurrentActivity().finish();
                    }
                }
            }, (String) null);
        }
    }
}
