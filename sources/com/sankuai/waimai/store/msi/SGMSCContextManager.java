package com.sankuai.waimai.store.msi;

import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.msi.api.extension.sgc.common.OnStoreStatusChangeResponse;
import com.meituan.msi.api.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.msc.b;
import com.sankuai.waimai.store.msi.shopcart.SGMSCShopcartDelegate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMSCContextManager {
    public static ChangeQuickRedirect a;
    public static Map<Integer, a> b = new HashMap(2);
    private static SGMSCContextManager c;
    private final Set<j<OnStoreStatusChangeResponse>> d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(SGMSCShopcartDelegate sGMSCShopcartDelegate);

        void b();
    }

    public SGMSCContextManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "775cb7039ceb3ee81c4eeb25154173f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "775cb7039ceb3ee81c4eeb25154173f1");
            return;
        }
        this.d = new HashSet();
        com.meituan.android.bus.a.a().a(this);
    }

    @Subscribe
    public void onNeedRefreshStore(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1619b4f90f4212e864ebd8b91473a06f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1619b4f90f4212e864ebd8b91473a06f");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poi_id", bVar.a);
            jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, bVar.b);
            jSONObject.put("newScheme", bVar.c);
            a(jSONObject.toString());
        } catch (JSONException e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    @Subscribe
    public void onSubmitOrderError(com.sankuai.waimai.business.order.api.submit.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "428976281c954ca208c4bb68c8682a9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "428976281c954ca208c4bb68c8682a9f");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poi_id", bVar.c);
            jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, bVar.b);
            jSONObject.put("type", "submit_order_error");
            jSONObject.put("popup_shopping_cart", bVar.e);
            jSONObject.put("toast", bVar.d);
            com.sankuai.waimai.store.order.a.e().h(bVar.b);
            a(jSONObject.toString());
        } catch (JSONException e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79edbb5319405e5b85492b929d487682", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79edbb5319405e5b85492b929d487682");
            return;
        }
        OnStoreStatusChangeResponse onStoreStatusChangeResponse = new OnStoreStatusChangeResponse();
        onStoreStatusChangeResponse.reason = str;
        for (j<OnStoreStatusChangeResponse> jVar : this.d) {
            jVar.a(onStoreStatusChangeResponse);
        }
    }

    public static SGMSCContextManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b3a2fd43eb8c3e235e14ed69241a7c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (SGMSCContextManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b3a2fd43eb8c3e235e14ed69241a7c1");
        }
        if (c == null) {
            synchronized (SGMSCContextManager.class) {
                if (c == null) {
                    c = new SGMSCContextManager();
                }
            }
        }
        return c;
    }
}
