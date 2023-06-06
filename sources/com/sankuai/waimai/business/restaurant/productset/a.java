package com.sankuai.waimai.business.restaurant.productset;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.MainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.net.ShopApiService;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.network.rxsupport.c;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCartAndPoi;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
import rx.subscriptions.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static a e;
    protected Context b;
    protected b c;
    protected ShopApiService d;

    private a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8c70d8aaae51ed38b6a851d6ac91abd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8c70d8aaae51ed38b6a851d6ac91abd");
            return;
        }
        this.b = context;
        this.d = (ShopApiService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) ShopApiService.class);
        this.c = new b();
    }

    @MainThread
    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fae33d95f1ac59107499e2ad99ea797e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fae33d95f1ac59107499e2ad99ea797e");
        }
        if (e == null && context != null) {
            e = new a(context.getApplicationContext());
        }
        return e;
    }

    public final void a(String str, boolean z, String str2, final com.sankuai.waimai.business.restaurant.base.repository.net.b<PoiShoppingCartAndPoi> bVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d86963bc1e30c76fb4387f880ce0dca1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d86963bc1e30c76fb4387f880ce0dca1");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#getPoiAndShopCartInfo-->start", new Object[0]);
        long a2 = com.sankuai.waimai.platform.domain.core.poi.b.a(str);
        String q = k.a().q(str);
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(com.sankuai.waimai.business.restaurant.composeorder.a.b);
            jSONObject.put("share_bill_mode", sb.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        ShopApiService shopApiService = this.d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a2);
        this.c.a(d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<PoiShoppingCartAndPoi>() { // from class: com.sankuai.waimai.business.restaurant.productset.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final /* synthetic */ void a(PoiShoppingCartAndPoi poiShoppingCartAndPoi) {
                final PoiShoppingCartAndPoi poiShoppingCartAndPoi2 = poiShoppingCartAndPoi;
                Object[] objArr2 = {poiShoppingCartAndPoi2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e7458e1b80e643357beff0aafa63705", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e7458e1b80e643357beff0aafa63705");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#getPoiAndShopCartInfo-->onSuccess", new Object[0]);
                if (bVar != null) {
                    ad.c(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.productset.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fdecf9909b6add2331153bd1a266d291", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fdecf9909b6add2331153bd1a266d291");
                            } else {
                                bVar.a((com.sankuai.waimai.business.restaurant.base.repository.net.b) poiShoppingCartAndPoi2);
                            }
                        }
                    });
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final void a(final com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11cf876d0f154cdf66d1ab04eaecec2f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11cf876d0f154cdf66d1ab04eaecec2f");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.e("Restaurant", "RestApiManager#getPoiAndShopCartInfo-->onFailure::e=" + aVar, new Object[0]);
                if (bVar != null) {
                    ad.c(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.productset.a.1.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "724430df8d4094226b97b82f5943eb13", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "724430df8d4094226b97b82f5943eb13");
                            } else {
                                bVar.a(aVar);
                            }
                        }
                    });
                }
            }
        }, shopApiService.getPoiAndShopcartInfo(sb2.toString(), str, q, 0, z ? "1" : "0", jSONObject.toString(), str2).a(c.a(this.b)).b(new rx.functions.a() { // from class: com.sankuai.waimai.business.restaurant.productset.a.3
            public static ChangeQuickRedirect a;

            @Override // rx.functions.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8403cec441949d922948b715d03776a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8403cec441949d922948b715d03776a");
                } else if (bVar != null) {
                    bVar.a();
                }
            }
        }).c(new rx.functions.a() { // from class: com.sankuai.waimai.business.restaurant.productset.a.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ef5372cf7040159f7639b72d0309272", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ef5372cf7040159f7639b72d0309272");
                } else if (bVar != null) {
                    bVar.b();
                }
            }
        })));
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9391f72c7a9cdf5ec3a8dcddf749fbd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9391f72c7a9cdf5ec3a8dcddf749fbd1");
            return;
        }
        if (this.c != null && this.c.b()) {
            this.c.a();
        }
        if (this.c == null || !this.c.isUnsubscribed()) {
            return;
        }
        this.c.unsubscribe();
    }
}
