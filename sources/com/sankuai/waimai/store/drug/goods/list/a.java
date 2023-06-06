package com.sankuai.waimai.store.drug.goods.list;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.base.preload.c;
import com.sankuai.waimai.store.config.d;
import com.sankuai.waimai.store.mrn.preload.l;
import com.sankuai.waimai.store.mrn.preload.m;
import com.sankuai.waimai.store.mrn.preload.p;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.activity.a
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.router.activity.a, com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        return true;
    }

    public a() {
        super(DrugPoiActivity.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db213e03ca5276ca0d49730d9e9cc9d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db213e03ca5276ca0d49730d9e9cc9d1");
        }
    }

    @Override // com.sankuai.waimai.router.activity.c, com.sankuai.waimai.router.activity.a
    @NonNull
    public final Intent b(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd750b8631c77030aa7d11bfb8298999", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd750b8631c77030aa7d11bfb8298999");
        }
        Intent b = super.b(jVar);
        Uri uri = jVar.d;
        long a2 = af.a(uri, "poi_id", -1L);
        String b2 = af.b(uri, FoodDetailNetWorkPreLoader.URI_POI_STR, "");
        if (a2 < 0) {
            a2 = af.a(uri, "restaurant_id", -1L);
        }
        long j = a2;
        Bundle bundle = new Bundle();
        Object[] objArr2 = {uri, bundle, new Long(j), b2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff898f914e264b5945ab971480af1549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff898f914e264b5945ab971480af1549");
        } else {
            bundle.putInt("need_add", af.a(uri, "add_to_shopcart", 0));
            bundle.putLong("foodId", af.a(uri, "foodId", -1L));
            bundle.putString("order_again", af.b(uri, "order_again", ""));
            bundle.putString("from", af.b(uri, "from", ""));
            bundle.putLong("poiId", j);
            bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, b2);
            String b3 = af.b(uri, "g_source", "");
            if (TextUtils.isEmpty(b3) || "0".equals(b3)) {
                String b4 = af.b(uri, "source", "");
                if ("1".equals(b4)) {
                    b3 = "8";
                } else if ("2".equals(b4)) {
                    b3 = "10";
                } else if ("3".equals(b4)) {
                    b3 = "9";
                } else if ("6".equals(b4)) {
                    b3 = "7";
                }
            }
            bundle.putString("gSource", b3);
        }
        b.putExtras(bundle);
        return b;
    }

    @Override // com.sankuai.waimai.router.activity.a, com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        long a2;
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7280067e23b8fb6abd66ca19d13fa7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7280067e23b8fb6abd66ca19d13fa7f");
            return;
        }
        Uri uri = jVar.d;
        Object[] objArr2 = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7b557ce78436131c0c2c273ceb296b8", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7b557ce78436131c0c2c273ceb296b8")).longValue();
        } else {
            a2 = af.a(uri, "poi_id", -1L);
            if (a2 <= 0) {
                a2 = af.a(uri, "restaurant_id", -1L);
            }
            if (a2 <= 0) {
                a2 = af.a(uri, "wm_poi_id", -1L);
            }
            if (a2 <= 0) {
                a2 = af.a(uri, "poiId", -1L);
            }
        }
        String b = af.b(uri, FoodDetailNetWorkPreLoader.URI_POI_STR, "");
        Object[] objArr3 = {jVar, new Long(a2), b};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "60eda0cfb8cb5c7d0021a7162840e1f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "60eda0cfb8cb5c7d0021a7162840e1f0");
        } else if (d.h().a("drug_shop/speed_switch", true)) {
            Uri uri2 = jVar.d;
            String a3 = com.sankuai.waimai.store.base.preload.d.a();
            Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
            if (bundle == null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("key_pre_request_cache", a3);
                jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle2);
            } else {
                bundle.putString("key_pre_request_cache", a3);
            }
            final p a4 = p.a(a3);
            k<RestMenuResponse> kVar = new k<RestMenuResponse>() { // from class: com.sankuai.waimai.store.drug.goods.list.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    RestMenuResponse restMenuResponse = (RestMenuResponse) obj;
                    Object[] objArr4 = {restMenuResponse};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c4c8465f098df0c34b68ed7f1eb34a27", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c4c8465f098df0c34b68ed7f1eb34a27");
                    } else {
                        l.a().a(p.this, m.a(restMenuResponse));
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr4 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7ddb721e8fba8a6f3f251a7a9186522d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7ddb721e8fba8a6f3f251a7a9186522d");
                    } else {
                        l.a().b(p.this, m.a(bVar));
                    }
                }
            };
            long a5 = af.a(uri2, "spu_id", -1L);
            long a6 = a5 < 0 ? af.a(uri2, "foodId", -1L) : a5;
            long a7 = af.a(uri2, "tag_id", -1L);
            String b2 = af.b(uri2, "extra", "");
            l.a().a(a4);
            com.sankuai.waimai.store.drug.base.net.b.a(a3).a(a2, b, a6, a7, b2, kVar);
        }
        super.a(jVar, gVar);
        com.sankuai.waimai.store.drug.goods.list.utils.c.a(b.a(this, jVar));
    }
}
