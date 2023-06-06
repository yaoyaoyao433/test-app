package com.sankuai.waimai.business.restaurant.base.soldoutguide;

import android.app.Activity;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.b;
import com.sankuai.waimai.business.restaurant.base.repository.net.c;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.utils.m;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.base.soldoutguide.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    interface InterfaceC0827a {
        void a(String str);
    }

    public static void a(final Activity activity, final GoodsSpu goodsSpu, final Poi poi, final int i) {
        Object[] objArr = {activity, goodsSpu, poi, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6002784ffa1194fb26be971cc8d86c1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6002784ffa1194fb26be971cc8d86c1c");
        } else if (goodsSpu == null || poi == null) {
        } else {
            final ArrayList<OrderedFood> h = k.a().n(poi.getPoiIDStr()).h();
            JSONArray jSONArray = new JSONArray();
            if (h != null) {
                try {
                    Iterator<OrderedFood> it = h.iterator();
                    while (it.hasNext()) {
                        OrderedFood next = it.next();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("spu_id", next.spu != null ? next.spu.id : -1L);
                        jSONObject.put("sku_id", next.sku != null ? next.sku.id : -1L);
                        jSONObject.put("spu_name", next.spu != null ? next.spu.name : "");
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            final InterfaceC0827a interfaceC0827a = new InterfaceC0827a() { // from class: com.sankuai.waimai.business.restaurant.base.soldoutguide.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.soldoutguide.a.InterfaceC0827a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06b53a7f0064ad218a3b22be718f566b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06b53a7f0064ad218a3b22be718f566b");
                        return;
                    }
                    Activity activity2 = activity;
                    int i2 = i;
                    GoodsSpu goodsSpu2 = goodsSpu;
                    Poi poi2 = poi;
                    ArrayList arrayList = h;
                    Object[] objArr3 = {activity2, Integer.valueOf(i2), str, goodsSpu2, poi2, arrayList};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f72da480030744c2e01fce83886f56af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f72da480030744c2e01fce83886f56af");
                        return;
                    }
                    SoldOutGuideRNDialog soldOutGuideRNDialog = new SoldOutGuideRNDialog();
                    soldOutGuideRNDialog.a(i2, str, poi2, goodsSpu2, arrayList);
                    soldOutGuideRNDialog.a(activity2);
                }
            };
            Object[] objArr2 = {activity, goodsSpu, poi, jSONArray, interfaceC0827a};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3d9a18c5a713b782e9b750032ee441be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3d9a18c5a713b782e9b750032ee441be");
                return;
            }
            BaseActivity baseActivity = (BaseActivity) activity;
            baseActivity.u();
            b.a(baseActivity.w()).a(poi.getPoiIDStr(), goodsSpu, jSONArray, new c<String>() { // from class: com.sankuai.waimai.business.restaurant.base.soldoutguide.a.2
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
                public final /* synthetic */ void a(Object obj) {
                    String str = (String) obj;
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cd4939d4a003830cfa4beade6f4ab26e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cd4939d4a003830cfa4beade6f4ab26e");
                        return;
                    }
                    ((BaseActivity) activity).v();
                    interfaceC0827a.a(str);
                }

                @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
                public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                    Object[] objArr3 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b0f03be17c8c2e675b345593aff531d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b0f03be17c8c2e675b345593aff531d6");
                        return;
                    }
                    ((BaseActivity) activity).v();
                    m.a(activity, !TextUtils.isEmpty(aVar.a()) ? aVar.a() : activity.getString(R.string.wm_restaurant_fail_retry));
                }
            });
        }
    }
}
