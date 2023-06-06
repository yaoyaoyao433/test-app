package com.sankuai.waimai.store.goods.list.viewblocks.embed;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements c.a, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    public a b;
    public List<Poi.PoiCouponItem> c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        String c();

        Map<String, Object> d();

        Mach f();
    }

    public b(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98a5bc6049202f9f638a5272fdfd1ad9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98a5bc6049202f9f638a5272fdfd1ad9");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c6a2fb084607137e1a92deb81bb1a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c6a2fb084607137e1a92deb81bb1a83");
            return;
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(poiCouponItem);
        final List<Poi.PoiCouponItem> list = this.c;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "598425fcb0fbb8dd1ae6a1c5945306f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "598425fcb0fbb8dd1ae6a1c5945306f9");
        } else {
            al.a(new al.b<List<JSONObject>>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.embed.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(List<JSONObject> list2) {
                    List<JSONObject> list3 = list2;
                    Object[] objArr3 = {list3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "83405c3e36ec1fbebe739f3a24ed19a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "83405c3e36ec1fbebe739f3a24ed19a4");
                    } else if (com.sankuai.shangou.stone.util.a.b(list3)) {
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("coupon_list", list3);
                        if (b.this.b.f() != null) {
                            b.this.b.f().sendJsEvent("refresh_coupon_info_module", hashMap);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.sankuai.waimai.store.util.al.b
                /* renamed from: b */
                public List<JSONObject> a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f47d5ec929ab2a718531b1f6abc38f9c", RobustBitConfig.DEFAULT_VALUE)) {
                        return (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f47d5ec929ab2a718531b1f6abc38f9c");
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Poi.PoiCouponItem poiCouponItem2 : list) {
                        if (poiCouponItem2 != null) {
                            try {
                                arrayList.add(new JSONObject(i.a(poiCouponItem2)));
                            } catch (JSONException e) {
                                com.sankuai.waimai.store.base.log.a.a(e);
                            }
                        }
                    }
                    return arrayList;
                }
            }, this.b.c());
        }
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3d980db15d293668b7681a5e53d6870", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3d980db15d293668b7681a5e53d6870");
            return;
        }
        try {
            if (this.b.d() == null) {
                return;
            }
            String valueOf = String.valueOf(this.b.d().get("poi_id"));
            if (com.sankuai.waimai.store.platform.domain.manager.poi.a.b(valueOf) && this.b.f() != null) {
                this.b.f().sendJsEvent("goods_detail_update_shopcart_account", com.sankuai.waimai.store.shopping.cart.util.a.a(valueOf));
            }
        } catch (Exception unused) {
        }
    }
}
