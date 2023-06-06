package com.sankuai.waimai.store.poi.list.util;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.mrn.SGUtilsModule;
import com.sankuai.waimai.store.shopping.cart.c;
import com.sankuai.waimai.store.util.al;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NewGusetBuyMachBridge {
    public static ChangeQuickRedirect a;

    public static void a(Map<String, Object> map, Context context) {
        Object[] objArr = {map, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fc9848e44c75b86849ff538fc56ba13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fc9848e44c75b86849ff538fc56ba13");
        } else if (map == null || !(context instanceof Activity)) {
        } else {
            try {
                a(new JSONObject(map), (Activity) context);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(final JSONObject jSONObject, final Activity activity) {
        Object[] objArr = {jSONObject, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b79732b0926b519d9cea47f2eb411b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b79732b0926b519d9cea47f2eb411b2");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            al.a(new al.b<InnerData>() { // from class: com.sankuai.waimai.store.poi.list.util.NewGusetBuyMachBridge.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(InnerData innerData) {
                    final InnerData innerData2 = innerData;
                    Object[] objArr2 = {innerData2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a8f882144761ff40e7621c1ea56b08b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a8f882144761ff40e7621c1ea56b08b");
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("preview_order_callback_info", innerData2.poiHelper.H());
                        if (!t.a(innerData2.actPageCode)) {
                            jSONObject2.put("act_page_code", innerData2.actPageCode);
                        }
                        c.a aVar = new c.a() { // from class: com.sankuai.waimai.store.poi.list.util.NewGusetBuyMachBridge.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.shopping.cart.c.a
                            public final void a(JSONObject jSONObject3, JSONObject jSONObject4) {
                                Object[] objArr3 = {jSONObject3, jSONObject4};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "894626cce30c4c6e2c9392da1ac4ec6c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "894626cce30c4c6e2c9392da1ac4ec6c");
                                } else {
                                    com.sankuai.waimai.store.shopping.cart.d.a().a("order_business_channel", jSONObject3);
                                }
                            }

                            @Override // com.sankuai.waimai.store.shopping.cart.c.a
                            public final void a(d.a aVar2) {
                                Object[] objArr3 = {aVar2};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "23f0f1c99b194bd1b95ef8588e5ff55b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "23f0f1c99b194bd1b95ef8588e5ff55b");
                                } else {
                                    aVar2.n = innerData2.orderedFoodList;
                                }
                            }
                        };
                        d.a aVar2 = new d.a();
                        aVar2.b = activity;
                        d.a a2 = aVar2.a(innerData2.poiHelper.f());
                        a2.c = innerData2.poiHelper.h();
                        a2.d = innerData2.poiHelper.i();
                        a2.f = SGUtilsModule.class.getSimpleName();
                        a2.k = com.sankuai.waimai.store.manager.globalcart.a.a().b();
                        a2.j = false;
                        a2.g = "from_sc_restaurant";
                        a2.i = 3;
                        a2.n = innerData2.orderedFoodList;
                        a2.m = a(innerData2, aVar);
                        com.sankuai.waimai.store.manager.order.b.a(aVar2.b(), innerData2.poiHelper.t());
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                }

                private String a(@NonNull InnerData innerData, c.a aVar) {
                    Object[] objArr2 = {innerData, aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0b33f97c748210c666b84ffe8f50c6a", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0b33f97c748210c666b84ffe8f50c6a");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        JSONObject H = innerData.poiHelper.H();
                        aVar.a(H, jSONObject2);
                        if (innerData.previewExtra != null && !innerData.previewExtra.isEmpty()) {
                            for (Map.Entry<String, Object> entry : innerData.previewExtra.entrySet()) {
                                if (entry != null && !t.a(entry.getKey())) {
                                    if (H == null) {
                                        H = new JSONObject();
                                    }
                                    H.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        jSONObject2.put("preview_order_callback_info", H);
                        if (!t.a(innerData.actPageCode)) {
                            jSONObject2.put("act_page_code", innerData.actPageCode);
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                    return jSONObject2.toString();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0082 A[Catch: Exception -> 0x00ef, TryCatch #0 {Exception -> 0x00ef, blocks: (B:9:0x0024, B:11:0x0031, B:13:0x003d, B:15:0x004a, B:16:0x0053, B:18:0x0068, B:23:0x0077, B:25:0x0082, B:27:0x008f, B:29:0x009a, B:30:0x00a4, B:32:0x00b1, B:33:0x00b9, B:35:0x00c7, B:36:0x00cf), top: B:41:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[Catch: Exception -> 0x00ef, TryCatch #0 {Exception -> 0x00ef, blocks: (B:9:0x0024, B:11:0x0031, B:13:0x003d, B:15:0x004a, B:16:0x0053, B:18:0x0068, B:23:0x0077, B:25:0x0082, B:27:0x008f, B:29:0x009a, B:30:0x00a4, B:32:0x00b1, B:33:0x00b9, B:35:0x00c7, B:36:0x00cf), top: B:41:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[Catch: Exception -> 0x00ef, TryCatch #0 {Exception -> 0x00ef, blocks: (B:9:0x0024, B:11:0x0031, B:13:0x003d, B:15:0x004a, B:16:0x0053, B:18:0x0068, B:23:0x0077, B:25:0x0082, B:27:0x008f, B:29:0x009a, B:30:0x00a4, B:32:0x00b1, B:33:0x00b9, B:35:0x00c7, B:36:0x00cf), top: B:41:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00c7 A[Catch: Exception -> 0x00ef, TryCatch #0 {Exception -> 0x00ef, blocks: (B:9:0x0024, B:11:0x0031, B:13:0x003d, B:15:0x004a, B:16:0x0053, B:18:0x0068, B:23:0x0077, B:25:0x0082, B:27:0x008f, B:29:0x009a, B:30:0x00a4, B:32:0x00b1, B:33:0x00b9, B:35:0x00c7, B:36:0x00cf), top: B:41:0x0024 }] */
                @Override // com.sankuai.waimai.store.util.al.b
                /* renamed from: b */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public com.sankuai.waimai.store.poi.list.util.NewGusetBuyMachBridge.InnerData a() {
                    /*
                        Method dump skipped, instructions count: 244
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.util.NewGusetBuyMachBridge.AnonymousClass1.a():com.sankuai.waimai.store.poi.list.util.NewGusetBuyMachBridge$InnerData");
                }
            }, NewGusetBuyMachBridge.class.getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class InnerData {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String actPageCode;
        public final List<WmOrderedFood> orderedFoodList;
        public final com.sankuai.waimai.store.platform.domain.manager.poi.a poiHelper;
        public final Map<String, Object> previewExtra;

        public InnerData(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, List<WmOrderedFood> list, String str, Map<String, Object> map) {
            this.poiHelper = aVar;
            this.orderedFoodList = list;
            this.actPageCode = str;
            this.previewExtra = map;
        }
    }
}
