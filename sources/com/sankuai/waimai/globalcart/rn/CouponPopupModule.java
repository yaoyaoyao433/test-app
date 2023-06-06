package com.sankuai.waimai.globalcart.rn;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.meituan.android.mrn.engine.n;
import com.meituan.android.recce.props.gens.MinHeight;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.utils.l;
import javax.annotation.Nonnull;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CouponPopupModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final String EXTRA_EVENT_NAME = "extra_global_cart_coupon_event_name";
    private static final int REQUEST_CODE_COUPON_WM = 5224;
    private static final String TAG = "CouponPopupModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "WMMRNPOPRouter";
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public CouponPopupModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4db189a40a600d6f6175747483e725c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4db189a40a600d6f6175747483e725c1");
        }
    }

    @ReactMethod
    public void openSlideWithURL(final String str, final int i, final int i2, final int i3, final double d, final double d2, final double d3, final String str2, final double d4) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), str2, Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1380c14bb20f796cd1f0274c75a647e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1380c14bb20f796cd1f0274c75a647e9");
        } else if (getReactApplicationContext() == null || f.a(getCurrentActivity())) {
        } else {
            Intent intent = getCurrentActivity().getIntent();
            if (intent == null || TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(intent, EXTRA_EVENT_NAME))) {
                l.a(new Runnable() { // from class: com.sankuai.waimai.globalcart.rn.CouponPopupModule.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "49d6275c00541a1a5b19184a2c3686b7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "49d6275c00541a1a5b19184a2c3686b7");
                        } else if (CouponPopupModule.this.getReactApplicationContext() == null || f.a(CouponPopupModule.this.getCurrentActivity())) {
                        } else {
                            Intent intent2 = CouponPopupModule.this.getCurrentActivity().getIntent();
                            if (intent2 == null || TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(intent2, CouponPopupModule.EXTRA_EVENT_NAME))) {
                                l.cancel(CouponPopupModule.TAG);
                                if (intent2 == null) {
                                    intent2 = new Intent();
                                }
                                intent2.putExtra(CouponPopupModule.EXTRA_EVENT_NAME, str2);
                                CouponPopupModule.this.getCurrentActivity().setIntent(intent2);
                                Bundle bundle = new Bundle();
                                int parseColor = Color.parseColor("#" + Integer.toHexString((int) (d * 256.0d)) + Integer.toHexString(i) + Integer.toHexString(i2) + Integer.toHexString(i3));
                                bundle.putString("mrnURLString", str);
                                bundle.putInt("maskColor", parseColor);
                                bundle.putInt(MinHeight.LOWER_CASE_NAME, g.a(b.a, (float) d2));
                                bundle.putInt("maxHeight", g.a(b.a, (float) d3));
                                bundle.putInt("topCorner", g.a(b.a, (float) d4));
                                bundle.putString(CouponPopupModule.EXTRA_EVENT_NAME, str2);
                                CouponPopupModule.this.getReactApplicationContext().addActivityEventListener(CouponPopupModule.this);
                                com.sankuai.waimai.foundation.router.a.a(CouponPopupModule.this.getCurrentActivity(), c.an, bundle, (int) CouponPopupModule.REQUEST_CODE_COUPON_WM);
                            }
                        }
                    }
                }, TAG);
            }
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d0410413ef5e68778cf9d904f3711cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d0410413ef5e68778cf9d904f3711cc");
        } else if (getReactApplicationContext() == null || f.a(activity) || activity.getIntent() == null || i != REQUEST_CODE_COUPON_WM || i2 != -1) {
        } else {
            getReactApplicationContext().removeActivityEventListener(this);
            Intent intent2 = activity.getIntent();
            if (intent2 == null) {
                return;
            }
            String a = com.sankuai.waimai.platform.utils.f.a(intent, "resultData");
            String a2 = com.sankuai.waimai.platform.utils.f.a(intent, EXTRA_EVENT_NAME);
            if (!TextUtils.isEmpty(a2) && a2.equals(com.sankuai.waimai.platform.utils.f.a(intent2, EXTRA_EVENT_NAME))) {
                couponCallBack(getReactApplicationContext(), a2, a);
            }
            intent2.putExtra(EXTRA_EVENT_NAME, "");
            activity.setIntent(intent2);
        }
    }

    private void couponCallBack(ReactContext reactContext, String str, String str2) {
        JSONObject jSONObject;
        Object[] objArr = {reactContext, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71a4c94a2b4d62f2093a980062f15562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71a4c94a2b4d62f2093a980062f15562");
        } else if (reactContext == null) {
        } else {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                if (jSONObject2.has("didCancel")) {
                    writableNativeMap.putBoolean("didCancel", jSONObject2.getBoolean("didCancel"));
                }
                if (jSONObject2.has("result") && (jSONObject = jSONObject2.getJSONObject("result")) != null) {
                    if (jSONObject.has("coupon_id")) {
                        writableNativeMap2.putString("coupon_id", jSONObject.getString("coupon_id"));
                    }
                    if (jSONObject.has("intent_poi_id")) {
                        writableNativeMap2.putString("intent_poi_id", jSONObject.getString("intent_poi_id"));
                    }
                    if (jSONObject.has(FoodDetailNetWorkPreLoader.URI_POI_STR)) {
                        writableNativeMap2.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR));
                    }
                    if (jSONObject.has("poicoupon_view_id")) {
                        writableNativeMap2.putString("poicoupon_view_id", jSONObject.getString("poicoupon_view_id"));
                    }
                    if (jSONObject.has("sg_item_coupon_view_id")) {
                        writableNativeMap2.putString("sg_item_coupon_view_id", jSONObject.getString("sg_item_coupon_view_id"));
                    }
                    if (jSONObject.has("goods_coupon_view_id")) {
                        writableNativeMap2.putString("goods_coupon_view_id", jSONObject.getString("goods_coupon_view_id"));
                    }
                    if (jSONObject.has("apParams")) {
                        writableNativeMap2.putString("apParams", jSONObject.getString("apParams"));
                    }
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
            writableNativeMap.putMap("result", (WritableMap) writableNativeMap2);
            n.a(reactContext, str, writableNativeMap);
        }
    }
}
