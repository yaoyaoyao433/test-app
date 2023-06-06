package com.sankuai.waimai.store.msi;

import android.app.Activity;
import android.content.Context;
import com.meituan.msi.api.extension.sgc.page.SgPageCreateParam;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.msi.SGMSCContextManager;
import com.sankuai.waimai.store.msi.shopcart.SGMSCShopcartDelegate;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.store.i.user.a, SGMSCContextManager.a {
    public static ChangeQuickRedirect a;
    public SGMSCShopcartDelegate b;
    public Activity c;
    private com.sankuai.waimai.store.i.poi.a d;

    public a(MsiCustomContext msiCustomContext, SgPageCreateParam sgPageCreateParam) {
        Object[] objArr = {msiCustomContext, sgPageCreateParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f16e42e230b781b76bc15e386cb97a41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f16e42e230b781b76bc15e386cb97a41");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = new com.sankuai.waimai.store.i.poi.a() { // from class: com.sankuai.waimai.store.msi.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.i.poi.a
            public final void a(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
                Object[] objArr2 = {str, list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b575d01cee2e54c9a9a1c9f9ee73af1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b575d01cee2e54c9a9a1c9f9ee73af1");
                } else if (a.this.b == null || a.this.b.f == null) {
                } else {
                    com.sankuai.waimai.store.order.a.e().d(a.this.b.f.d(), list);
                }
            }

            @Override // com.sankuai.waimai.store.i.poi.a
            public final void c_(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a6d644a361b962bd647b6f1fd060830", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a6d644a361b962bd647b6f1fd060830");
                } else {
                    a.this.c();
                }
            }
        };
        this.c = msiCustomContext.getActivity();
    }

    @Override // com.sankuai.waimai.store.msi.SGMSCContextManager.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764aa99da5200d7bf9d45731b2845b6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764aa99da5200d7bf9d45731b2845b6d");
            return;
        }
        com.sankuai.waimai.store.manager.poi.a.a().a(this.d);
        com.sankuai.waimai.store.manager.user.a.a().b((com.sankuai.waimai.store.i.user.a) this);
    }

    @Override // com.sankuai.waimai.store.msi.SGMSCContextManager.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f08e2ad87f9ffb182ebe9c853023b52f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f08e2ad87f9ffb182ebe9c853023b52f");
            return;
        }
        com.sankuai.waimai.store.manager.poi.a.a().b(this.d);
        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        String queryParameter;
        boolean z = true;
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29576c45c74f3a119a3b4790ae1d1e73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29576c45c74f3a119a3b4790ae1d1e73");
        } else if (enumC1205a == a.EnumC1205a.LOGIN && com.sankuai.waimai.store.manager.user.a.a().b()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88cceead5b438fe369689f85be2cec53", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88cceead5b438fe369689f85be2cec53")).booleanValue();
            } else {
                List<Activity> b = b.b();
                Activity activity = com.sankuai.shangou.stone.util.a.b(b) ? null : b.get(0);
                if (activity == null || !com.sankuai.waimai.store.shopping.cart.data.a.c(activity) || (queryParameter = activity.getIntent().getData().getQueryParameter("targetPath")) == null || !queryParameter.startsWith("/pages/store/index")) {
                    z = false;
                }
            }
            if (z && com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER) {
                this.b.b();
            }
            ab.b().a((Context) this.c, "poi_coupon_need_login", false);
            c();
        }
    }

    void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "639503f873961a02e849adfddd86dda5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "639503f873961a02e849adfddd86dda5");
        } else if (this.b == null || this.b.f == null) {
        } else {
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.msc.b(this.b.f.f(), this.b.f.h(), ""));
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3576698aec2f6c01e140928d9e87c33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3576698aec2f6c01e140928d9e87c33");
        } else if (bVar == a.b.PHONE && com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER && this.b != null) {
            this.b.b();
        }
    }

    @Override // com.sankuai.waimai.store.msi.SGMSCContextManager.a
    public final void a(SGMSCShopcartDelegate sGMSCShopcartDelegate) {
        this.b = sGMSCShopcartDelegate;
    }
}
