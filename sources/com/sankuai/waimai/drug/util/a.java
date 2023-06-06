package com.sankuai.waimai.drug.util;

import android.app.Activity;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.util.am;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(final Activity activity, final com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, final GoodsSpu goodsSpu, final SCPageConfig sCPageConfig, String str) {
        Object[] objArr = {activity, aVar, goodsSpu, sCPageConfig, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e4f335f9109c9dbb6d91283c240dbdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e4f335f9109c9dbb6d91283c240dbdf");
        } else if (aVar != null && !t.a(aVar.J())) {
            final String J = aVar.J();
            com.sankuai.waimai.store.manager.user.a.a(activity, new Runnable() { // from class: com.sankuai.waimai.drug.util.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String replace;
                    boolean z;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48d0d8722306e0f79b3d4275b2508b3a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48d0d8722306e0f79b3d4275b2508b3a");
                        return;
                    }
                    String str2 = J;
                    int i = sCPageConfig.e == 2 ? 19 : 18;
                    String queryParameter = Uri.parse(J).getQueryParameter("extra");
                    if (!t.a(queryParameter)) {
                        try {
                            JSONObject jSONObject = new JSONObject(queryParameter);
                            jSONObject.put("actionType", i);
                            if (sCPageConfig.e == 2) {
                                String d = aVar.d();
                                GoodsSpu goodsSpu2 = goodsSpu;
                                Object[] objArr3 = {d, goodsSpu2};
                                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                                long j = 0;
                                GoodsSku goodsSku = null;
                                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "31f0575537cfccab983a43c0f5085d41", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = true;
                                    goodsSku = (GoodsSku) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "31f0575537cfccab983a43c0f5085d41");
                                } else {
                                    z = true;
                                    if (goodsSpu2 != null) {
                                        List<OrderedFood> b = com.sankuai.waimai.store.order.a.e().b(d, goodsSpu2.getId());
                                        List<GoodsSku> skuList = goodsSpu2.getSkuList();
                                        OrderedFood a2 = d.a(b, skuList, goodsSpu2.getAttrList());
                                        if (!com.sankuai.shangou.stone.util.a.b(skuList)) {
                                            if (a2 == null) {
                                                GoodsSku a3 = d.a(skuList);
                                                if (a3 != null) {
                                                    goodsSku = d.a(skuList, a3.getSkuId());
                                                } else {
                                                    goodsSku = d.a(skuList, 0L);
                                                }
                                            } else {
                                                goodsSku = d.a(skuList, a2.getSkuId());
                                            }
                                        }
                                    }
                                }
                                jSONObject.put("spuId", goodsSpu != null ? goodsSpu.id : -999L);
                                if (goodsSpu == null || !goodsSpu.isManySku()) {
                                    z = false;
                                }
                                jSONObject.put("isManySku", z);
                                if (goodsSku != null) {
                                    j = goodsSku.getSkuId();
                                }
                                jSONObject.put("skuId", j);
                            }
                            replace = J.replace(Uri.encode(queryParameter), Uri.encode(jSONObject.toString()));
                        } catch (JSONException e) {
                            com.sankuai.waimai.store.base.log.a.a(e);
                        }
                        com.sankuai.waimai.store.router.d.a(activity, replace);
                    }
                    replace = str2;
                    com.sankuai.waimai.store.router.d.a(activity, replace);
                }
            });
        } else {
            am.a(activity, "跳转失败，请退出页面重新进入");
        }
    }
}
