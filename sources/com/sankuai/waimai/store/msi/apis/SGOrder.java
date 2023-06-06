package com.sankuai.waimai.store.msi.apis;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.msi.api.extension.sgc.order.IOrder;
import com.meituan.msi.api.extension.sgc.order.SubmitOrderWithoutShopCartParam;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.utils.d;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.msi.listener.a;
import com.sankuai.waimai.store.msi.view.b;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.pre.c;
import com.sankuai.waimai.store.util.al;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGOrder extends IOrder {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.sgc.order.IOrder
    public final void a(MsiCustomContext msiCustomContext, SubmitOrderWithoutShopCartParam submitOrderWithoutShopCartParam, i<EmptyResponse> iVar) {
        int i = 0;
        Object[] objArr = {msiCustomContext, submitOrderWithoutShopCartParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bea43a5f9fea15fbf25ad4b16250f39c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bea43a5f9fea15fbf25ad4b16250f39c");
        } else if (a.a(msiCustomContext)) {
            iVar.a(1000, "submitOrderWithoutShopCart msiCustomContext.getActivity() is dead or null");
        } else if (submitOrderWithoutShopCartParam.poiInfo == null || submitOrderWithoutShopCartParam.extra == null || com.sankuai.shangou.stone.util.a.b(submitOrderWithoutShopCartParam.goodsList)) {
            iVar.a(1, "params error");
        } else {
            JSONObject jSONObject = new JSONObject((Map) submitOrderWithoutShopCartParam.extra);
            final Activity activity = msiCustomContext.getActivity();
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a419d422334a8e6cecabc67dfa36694", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a419d422334a8e6cecabc67dfa36694");
            } else {
                final Activity a = com.sankuai.waimai.store.shopping.cart.data.a.b(activity) ? com.sankuai.waimai.store.msi.shopcart.a.a() : activity;
                if (a != null) {
                    b.a(activity, new Runnable() { // from class: com.sankuai.waimai.store.msi.apis.SGOrder.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0ee312d108a3e749fd200b43423e7def", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0ee312d108a3e749fd200b43423e7def");
                                return;
                            }
                            final Dialog a2 = d.a(a);
                            if (a2 == null) {
                                return;
                            }
                            al.a(new Runnable() { // from class: com.sankuai.waimai.store.msi.apis.SGOrder.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0735d00176a1ae519697ceb4244878ce", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0735d00176a1ae519697ceb4244878ce");
                                    } else if (a.isDestroyed() || a.isFinishing() || !a2.isShowing()) {
                                    } else {
                                        a2.dismiss();
                                    }
                                }
                            }, 3000, com.sankuai.waimai.store.msi.listener.a.a(a));
                            com.sankuai.waimai.store.msi.listener.a.a((Context) a).a(a, new a.AbstractC1243a() { // from class: com.sankuai.waimai.store.msi.apis.SGOrder.1.2
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.msi.listener.a.AbstractC1243a
                                public final void a() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f820aa23f1af8203cd13d5d0418e24a9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f820aa23f1af8203cd13d5d0418e24a9");
                                    }
                                }

                                @Override // com.sankuai.waimai.store.msi.listener.a.AbstractC1243a
                                public final void b() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "82472484fb4d347da6e0a66ea5fe7c25", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "82472484fb4d347da6e0a66ea5fe7c25");
                                    } else if (a2.isShowing()) {
                                        a2.dismiss();
                                    }
                                }
                            });
                        }
                    });
                }
            }
            String optString = jSONObject.optString("volleyTag");
            if (TextUtils.isEmpty(optString)) {
                optString = com.sankuai.waimai.store.msi.listener.a.a(activity);
            }
            final String str = optString;
            int optInt = jSONObject.optInt(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, 0);
            final String optString2 = jSONObject.optString("recommendCouponInfo", "");
            Poi poi = new Poi();
            poi.parseJsonToPoi(new JSONObject((Map) submitOrderWithoutShopCartParam.poiInfo));
            final com.sankuai.waimai.store.platform.domain.manager.poi.a aVar = new com.sankuai.waimai.store.platform.domain.manager.poi.a(poi);
            final SCPageConfig a2 = SCPageConfig.a(submitOrderWithoutShopCartParam.pageSource, optInt, submitOrderWithoutShopCartParam.cid);
            JSONArray jSONArray = new JSONArray();
            final JSONObject jSONObject2 = new JSONObject();
            for (Object obj : submitOrderWithoutShopCartParam.goodsList) {
                JSONObject jSONObject3 = new JSONObject((Map) obj);
                if (submitOrderWithoutShopCartParam.goodsList.get(i) == obj) {
                    try {
                        jSONObject2.put("store_installment", jSONObject3.getJSONObject("user_select_term").toString());
                    } catch (Exception unused) {
                    }
                }
                if (jSONObject3.has("goods_attrs")) {
                    try {
                        JSONArray optJSONArray = jSONObject3.optJSONArray("goods_attrs");
                        if (optJSONArray != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                                optJSONObject.put("id", String.valueOf(optJSONObject.optLong("id")));
                                optJSONArray.put(i2, optJSONObject);
                            }
                            jSONObject3.put("attrs", optJSONArray);
                        }
                    } catch (JSONException e) {
                        iVar.a(2, e.toString());
                        return;
                    }
                }
                jSONArray.put(jSONObject3);
                i = 0;
            }
            final List<WmOrderedFood> fromJsonArray = WmOrderedFood.fromJsonArray(jSONArray);
            final com.sankuai.waimai.store.order.a e2 = com.sankuai.waimai.store.order.a.e();
            Object[] objArr3 = {activity, a2, aVar, str, fromJsonArray, optString2, jSONObject2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.a.a;
            if (PatchProxy.isSupport(objArr3, e2, changeQuickRedirect3, false, "6b57be2c9009562c0e61b5ad5556ebaa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, e2, changeQuickRedirect3, false, "6b57be2c9009562c0e61b5ad5556ebaa");
            } else {
                com.sankuai.waimai.store.shopping.cart.pre.d.a(activity, aVar, a2).a(new c() { // from class: com.sankuai.waimai.store.order.a.10
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.shopping.cart.pre.c
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "109babd7e20ec1148b17c4dedb863ee0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "109babd7e20ec1148b17c4dedb863ee0");
                        } else {
                            a.a(e2, activity, aVar, a2, str, fromJsonArray, jSONObject2, optString2);
                        }
                    }
                });
            }
            iVar.a(EmptyResponse.INSTANCE);
        }
    }
}
