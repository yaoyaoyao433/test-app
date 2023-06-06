package com.sankuai.waimai.store.widgets.filterbar.home;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements c.a {
    public static ChangeQuickRedirect a;
    protected C1340a b;
    final com.sankuai.waimai.store.param.a c;
    protected BaseModuleDesc d;
    private Context e;

    public a(@NonNull Context context, @NonNull com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3562dfd5b3f7951598cae93376ec1539", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3562dfd5b3f7951598cae93376ec1539");
            return;
        }
        this.e = context;
        this.c = aVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3acd78a050cbe3d37a5acb236e68b143", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3acd78a050cbe3d37a5acb236e68b143");
            return;
        }
        this.b = new C1340a(this.e);
        c.a().a(this);
    }

    public final View a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "351ccdbd22fa9cbf7e03e1e69681e3d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "351ccdbd22fa9cbf7e03e1e69681e3d9");
        }
        if (this.b == null) {
            this.b = new C1340a(this.e);
        }
        return this.b.d;
    }

    public final void a(BaseModuleDesc baseModuleDesc, int i, boolean z) {
        Object[] objArr = {baseModuleDesc, 0, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f8b8a791ac04686db2140d42e09407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f8b8a791ac04686db2140d42e09407");
            return;
        }
        this.d = baseModuleDesc;
        if (p.a(baseModuleDesc.jsonData)) {
            return;
        }
        this.b.a(baseModuleDesc, 0, true);
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8287ed6efce703362d9f06b078ed9e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8287ed6efce703362d9f06b078ed9e06");
        } else if (this.d == null || this.b.d == null || poiCouponItem == null) {
        } else {
            SCBaseActivity sCBaseActivity = (SCBaseActivity) this.b.d.getContext();
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("coupon_id", Long.valueOf(poiCouponItem.mCouponId));
                hashMap.put("coupon_status", Integer.valueOf(poiCouponItem.mCouponStatus));
                if (sCBaseActivity == null || sCBaseActivity.d == null) {
                    return;
                }
                sCBaseActivity.d.a(this.d, "newUsercouponStatusChanged", hashMap);
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.widgets.filterbar.home.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1340a extends com.sankuai.waimai.store.mach.machfeed.b {
        public static ChangeQuickRedirect a;

        private C1340a(@NonNull Context context) {
            super(context);
            Object[] objArr = {a.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f61ec28f6109ce4af50dcab73ad1c3f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f61ec28f6109ce4af50dcab73ad1c3f");
            }
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final Map<String, com.sankuai.waimai.store.mach.event.b> a(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61706cf1b63ac9b5aab9c09b1ad6c144", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61706cf1b63ac9b5aab9c09b1ad6c144");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("user_coupon_refrsh", new com.sankuai.waimai.store.poi.list.newp.methods.c());
            return hashMap;
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final Map<String, Object> b(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5facf458ac844ca03122a65036755eb3", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5facf458ac844ca03122a65036755eb3");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cat_id", Long.valueOf(a.this.c.c));
            hashMap.put("sec_cat_id", a.this.c.f);
            hashMap.put("api_stids", a.this.c.T);
            return hashMap;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8e39e260aa0ace852ac409082505475", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8e39e260aa0ace852ac409082505475");
        } else {
            c.a().b(this);
        }
    }
}
