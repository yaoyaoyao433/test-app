package com.sankuai.waimai.store.goods.list.viewblocks.newuser;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.poilist.mach.a<BaseModuleDesc> {
    public static ChangeQuickRedirect a;
    protected com.sankuai.waimai.mach.recycler.c b;
    int c;
    b d;

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* bridge */ /* synthetic */ void a(BaseModuleDesc baseModuleDesc, com.sankuai.waimai.mach.recycler.c cVar) {
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* synthetic */ String a(BaseModuleDesc baseModuleDesc) {
        BaseModuleDesc baseModuleDesc2 = baseModuleDesc;
        Object[] objArr = {baseModuleDesc2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c93a3cfadfa8e6b7e77368ac347b9e65", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c93a3cfadfa8e6b7e77368ac347b9e65") : (baseModuleDesc2 == null || t.a(baseModuleDesc2.templateId)) ? "" : baseModuleDesc2.templateId;
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* synthetic */ Map a(int i, BaseModuleDesc baseModuleDesc) {
        BaseModuleDesc baseModuleDesc2 = baseModuleDesc;
        Object[] objArr = {Integer.valueOf(i), baseModuleDesc2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acfd4320b7abfeccebda59298d0472cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acfd4320b7abfeccebda59298d0472cb");
        }
        if (baseModuleDesc2 == null || baseModuleDesc2.jsonData == null) {
            return null;
        }
        return new HashMap(baseModuleDesc2.jsonData);
    }

    public g(@NonNull BaseActivity baseActivity, @NonNull com.sankuai.waimai.mach.d dVar, String str, com.sankuai.waimai.mach.recycler.b bVar) {
        super(baseActivity, dVar, str, bVar);
        Object[] objArr = {baseActivity, dVar, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a288abd1ba1fd3a603fcbc50344e735", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a288abd1ba1fd3a603fcbc50344e735");
            return;
        }
        this.b = null;
        this.c = 0;
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f895718ca7d662075f36edfbbb43e5f3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f895718ca7d662075f36edfbbb43e5f3") : t.a(str) ? "" : str;
    }

    public final com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> a(@NonNull BaseModuleDesc baseModuleDesc, int i) {
        Mach.d b;
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c0104630ab6887797463259d073e959", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.poilist.mach.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c0104630ab6887797463259d073e959");
        }
        if (!t.a(baseModuleDesc.templateId)) {
            this.b = a(i, baseModuleDesc, baseModuleDesc.moduleId, this.c);
        }
        if (this.b != null) {
            Mach k = this.b.k();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51c9746ec69ad30a89b458cf891f1787", RobustBitConfig.DEFAULT_VALUE)) {
                b = (Mach.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51c9746ec69ad30a89b458cf891f1787");
            } else {
                com.sankuai.waimai.store.goods.list.mach.event.c cVar = new com.sankuai.waimai.store.goods.list.mach.event.c();
                com.sankuai.waimai.store.goods.list.mach.event.b bVar = new com.sankuai.waimai.store.goods.list.mach.event.b(this.g, null);
                bVar.a(new a(this.g));
                cVar.a(bVar);
                b = cVar.b();
            }
            k.registerJsEventCallback(b);
        }
        return new com.sankuai.waimai.store.poilist.mach.f<>(baseModuleDesc, this.b);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.store.goods.list.mach.event.c {
        public static ChangeQuickRedirect a;
        public BaseActivity b;

        public a(BaseActivity baseActivity) {
            Object[] objArr = {baseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "980ef8aec3c77c994793a45a4bfbbd90", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "980ef8aec3c77c994793a45a4bfbbd90");
            } else {
                this.b = baseActivity;
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.mach.event.c
        public final List a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5440a6c98fcf3e2105098185fec50616", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5440a6c98fcf3e2105098185fec50616") : Arrays.asList("user_coupon_refrsh");
        }

        @Override // com.sankuai.waimai.store.goods.list.mach.event.c
        public final void a(String str, Map<String, Object> map) {
            Object[] objArr = {str, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e189d08a3c3774a4781ea93bea7918cb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e189d08a3c3774a4781ea93bea7918cb");
                return;
            }
            char c = 65535;
            if (str.hashCode() == -1140235879 && str.equals("user_coupon_refrsh")) {
                c = 0;
            }
            if (c != 0) {
                super.a(str, map);
            } else if (p.a(map)) {
            } else {
                JSONObject jSONObject = new JSONObject(map);
                if (p.a(jSONObject)) {
                    return;
                }
                com.sankuai.waimai.store.manager.coupon.c.a().a((Poi.PoiCouponItem) com.sankuai.waimai.store.util.i.a(jSONObject.toString(), Poi.PoiCouponItem.class));
            }
        }
    }
}
