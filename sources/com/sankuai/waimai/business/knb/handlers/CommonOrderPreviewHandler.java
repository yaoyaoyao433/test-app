package com.sankuai.waimai.business.knb.handlers;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.c;
import com.sankuai.waimai.business.knb.utils.OrderSchemeFactory;
import com.sankuai.waimai.business.order.api.submit.listener.a;
import com.sankuai.waimai.business.order.api.submit.model.CrossOrderPoiParam;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.router.a;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.router.core.e;
import com.sankuai.waimai.router.core.j;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CommonOrderPreviewHandler extends TakeoutBaseJsHandler {
    private static final String KEY_LOGIN_OBSERVER = "com.sankuai.waimai.business.knb.handlers.CommonOrderPreviewHandler";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final b loginObserver;
    private a mCrossOrderConfirmCallBack;
    private Gson mGson;

    public CommonOrderPreviewHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cf23f067ec58ee069090935b9d605be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cf23f067ec58ee069090935b9d605be");
            return;
        }
        this.mGson = new Gson();
        this.loginObserver = new b() { // from class: com.sankuai.waimai.business.knb.handlers.CommonOrderPreviewHandler.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.user.b
            public final void onChanged(b.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b8d5ec418bd532b7d53eff62030d7137", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b8d5ec418bd532b7d53eff62030d7137");
                } else if (aVar == b.a.LOGIN) {
                    CommonOrderPreviewHandler.this.openOrderConfirmActivity();
                }
            }

            @Override // com.sankuai.waimai.foundation.core.service.user.b
            public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
                Object[] objArr2 = {enumC0948b};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5a4b2e2487ed086285705e609dbba179", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5a4b2e2487ed086285705e609dbba179");
                } else if (enumC0948b == b.EnumC0948b.PHONE) {
                    CommonOrderPreviewHandler.this.openOrderConfirmActivity();
                }
            }
        };
        this.mCrossOrderConfirmCallBack = new a() { // from class: com.sankuai.waimai.business.knb.handlers.CommonOrderPreviewHandler.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.order.api.submit.listener.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c38c3535d671fbd5b805dcf6989fa6b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c38c3535d671fbd5b805dcf6989fa6b4");
                } else {
                    CommonOrderPreviewHandler.this.jsCallback();
                }
            }

            @Override // com.sankuai.waimai.business.order.api.submit.listener.a
            public final void a(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1ef5a1f948ef2ef4cd2e7170c22906f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1ef5a1f948ef2ef4cd2e7170c22906f6");
                } else {
                    CommonOrderPreviewHandler.this.jsCallbackError(i, str);
                }
            }
        };
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f35ec3aa5e57bf35bc2a161e062789e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f35ec3aa5e57bf35bc2a161e062789e");
        } else if (validateArgs()) {
            Activity activity = jsHost().getActivity();
            if (activity instanceof c) {
                ((c) activity).a(KEY_LOGIN_OBSERVER, this.loginObserver);
            }
            openOrderConfirmActivity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openOrderConfirmActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c27016d58a6801c16233f67cf8ecd46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c27016d58a6801c16233f67cf8ecd46");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity == null) {
            return;
        }
        String w = activity instanceof BaseActivity ? ((BaseActivity) activity).w() : "";
        if (jsBean().argsJson.optBoolean("isCrossOrder")) {
            execCrossOrderPreview(activity, w);
        } else {
            execSingleOrderPreview(activity, w);
        }
    }

    private void execSingleOrderPreview(final Activity activity, final String str) {
        int i;
        int i2;
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c31a92de98f501f2cc7442d0d6055ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c31a92de98f501f2cc7442d0d6055ae");
            return;
        }
        final long optLong = jsBean().argsJson.optLong("poi_id");
        final String optString = jsBean().argsJson.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
        final int optInt = jsBean().argsJson.optInt("business_type");
        int optInt2 = jsBean().argsJson.optInt("source_type", Integer.MIN_VALUE);
        int optInt3 = jsBean().argsJson.optInt("sub_biz_type", Integer.MIN_VALUE);
        JSONObject optJSONObject = jsBean().argsJson.optJSONObject("common_params");
        String jSONObject = optJSONObject != null ? optJSONObject.toString() : null;
        if (optInt2 != Integer.MIN_VALUE || optInt3 != Integer.MIN_VALUE) {
            i = optInt2;
            i2 = optInt3;
        } else if (optJSONObject == null || !optJSONObject.has("drug_extra")) {
            i2 = optInt3;
            i = 15;
        } else {
            i = 14;
            i2 = 2;
        }
        final boolean optBoolean = optJSONObject != null ? optJSONObject.optBoolean("gstar", false) : false;
        final List<WmOrderedFood> fromJsonArray = WmOrderedFood.fromJsonArray(jsBean().argsJson.optJSONArray("food"));
        final String json = new Gson().toJson(fromJsonArray);
        final String str2 = jSONObject;
        final int i3 = i;
        final int i4 = i2;
        com.sankuai.waimai.platform.domain.manager.user.a.a(activity, new Runnable() { // from class: com.sankuai.waimai.business.knb.handlers.CommonOrderPreviewHandler.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c2998936aafe27c9d10dc5c7885b383e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c2998936aafe27c9d10dc5c7885b383e");
                } else if (com.sankuai.waimai.business.order.api.confirm.a.a()) {
                    if (optBoolean) {
                        com.sankuai.waimai.foundation.router.a.a().a(new e() { // from class: com.sankuai.waimai.business.knb.handlers.CommonOrderPreviewHandler.2.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.router.core.e
                            public final void a(@NonNull j jVar) {
                                Object[] objArr3 = {jVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ca65c525163c75d19a29737bd24559a1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ca65c525163c75d19a29737bd24559a1");
                                    return;
                                }
                                int b = jVar.b("pre_order_code", Integer.MIN_VALUE);
                                if (b == Integer.MIN_VALUE) {
                                    CommonOrderPreviewHandler.this.jsCallbackError(-1, "code is MIN_VALUE");
                                    return;
                                }
                                String b2 = jVar.b("pre_order_msg", "");
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.putOpt("code", Integer.valueOf(b));
                                    jSONObject2.putOpt("msg", b2);
                                } catch (Exception e) {
                                    CommonOrderPreviewHandler.this.jsCallbackError(-1, e.getMessage());
                                }
                                CommonOrderPreviewHandler.this.jsCallback(jSONObject2);
                            }

                            @Override // com.sankuai.waimai.router.core.e
                            public final void a(@NonNull j jVar, int i5) {
                                Object[] objArr3 = {jVar, Integer.valueOf(i5)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cc550e2ff8d4ccde0bf3497891a81732", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cc550e2ff8d4ccde0bf3497891a81732");
                                } else {
                                    CommonOrderPreviewHandler.this.jsCallbackError(i5, jVar.b());
                                }
                            }
                        }).a(activity, OrderSchemeFactory.a(optLong, optString, false).a(optInt).a(json).b(CommonOrderPreviewHandler.this.getCommonParams(str2)).b(i3).c(i4).d(0).e(5).d("from_h5_order").c(str).a());
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(activity, OrderSchemeFactory.a(optLong, optString, false).a(optInt).a(json).b(CommonOrderPreviewHandler.this.getCommonParams(str2)).b(i3).c(i4).d(0).e(5).d("from_h5_order").c(str).a());
                    }
                } else if (optBoolean) {
                    com.sankuai.waimai.business.order.api.submit.c.a().h5CommonOrderPreOrder(activity, optLong, optString, optInt, fromJsonArray, str2, str, 0, new com.sankuai.waimai.business.order.api.submit.listener.b() { // from class: com.sankuai.waimai.business.knb.handlers.CommonOrderPreviewHandler.2.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.order.api.submit.listener.b
                        public final void a(int i5, Map<String, Object> map, String str3) {
                            Object[] objArr3 = {Integer.valueOf(i5), map, str3};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "edaa9c7b02d808b68b793cbbaf13b143", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "edaa9c7b02d808b68b793cbbaf13b143");
                                return;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.putOpt("code", Integer.valueOf(i5));
                                jSONObject2.putOpt("msg", str3);
                            } catch (Exception e) {
                                CommonOrderPreviewHandler.this.jsCallbackError(-1, e.getMessage());
                            }
                            CommonOrderPreviewHandler.this.jsCallback(jSONObject2);
                        }
                    });
                } else {
                    com.sankuai.waimai.business.order.api.submit.c.a().h5CommonOrderPreOrder(activity, optLong, optString, optInt, fromJsonArray, str2, str, 0);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCommonParams(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b410beee5652ec69acf62c9e471e107", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b410beee5652ec69acf62c9e471e107");
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("preview_order_callback_info", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private void execCrossOrderPreview(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78313a1c53c9e2069d145e6f2a3c1068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78313a1c53c9e2069d145e6f2a3c1068");
            return;
        }
        String jSONArray = jsBean().argsJson.optJSONArray("cross_orders").toString();
        if (com.sankuai.waimai.business.order.api.confirm.a.a()) {
            a.C0950a a = com.sankuai.waimai.foundation.router.a.a().a(new e() { // from class: com.sankuai.waimai.business.knb.handlers.CommonOrderPreviewHandler.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.router.core.e
                public final void a(@NonNull j jVar, int i) {
                }

                @Override // com.sankuai.waimai.router.core.e
                public final void a(@NonNull j jVar) {
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d7be22a6be7abb74fd85d0feca14f5b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d7be22a6be7abb74fd85d0feca14f5b5");
                        return;
                    }
                    int b = jVar.b("pre_order_code", Integer.MIN_VALUE);
                    if (b == Integer.MIN_VALUE) {
                        return;
                    }
                    String b2 = jVar.b("pre_order_msg", "");
                    if (b == 0) {
                        CommonOrderPreviewHandler.this.jsCallback();
                    } else {
                        CommonOrderPreviewHandler.this.jsCallbackError(b, b2);
                    }
                }
            });
            Object[] objArr2 = {2147483647L, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect3 = OrderSchemeFactory.a;
            a.a(activity, (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "c5b7d861649631ff3e4eed081f208c35", RobustBitConfig.DEFAULT_VALUE) ? (OrderSchemeFactory.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "c5b7d861649631ff3e4eed081f208c35") : new OrderSchemeFactory.a(2147483647L, true)).c(str).a(jSONArray).d("from_mrn_cross_order").a());
            return;
        }
        com.sankuai.waimai.business.order.api.submit.c.a().commonCrossOrderPreOrder(activity, (List) this.mGson.fromJson(jSONArray, new TypeToken<List<CrossOrderPoiParam>>() { // from class: com.sankuai.waimai.business.knb.handlers.CommonOrderPreviewHandler.4
        }.getType()), null, this.mCrossOrderConfirmCallBack, str, 0, a.EnumC0947a.NONE, "from_mrn_cross_order");
    }
}
