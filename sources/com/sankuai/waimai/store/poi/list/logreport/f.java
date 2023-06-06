package com.sankuai.waimai.store.poi.list.logreport;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements com.sankuai.waimai.store.widgets.filterbar.home.controller.b {
    public static ChangeQuickRedirect a;
    private final SCBaseActivity b;
    private final com.sankuai.waimai.store.param.a c;
    private final com.sankuai.waimai.store.widgets.filterbar.home.controller.b d;

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(long j, String str, String str2, boolean z, boolean z2) {
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(com.sankuai.waimai.store.expose.v2.a aVar, View view, long j, String str, String str2, boolean z) {
    }

    public f(@NonNull SCBaseActivity sCBaseActivity, @NonNull com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {sCBaseActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce49bb556aa14b1364d8f68e261ca35a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce49bb556aa14b1364d8f68e261ca35a");
            return;
        }
        this.b = sCBaseActivity;
        this.c = aVar;
        this.d = new com.sankuai.waimai.store.widgets.filterbar.home.controller.f(aVar.G, this.b, this.c.c());
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(com.sankuai.waimai.store.expose.v2.a aVar, View view, long j, String str) {
        Object[] objArr = {aVar, view, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2d5ba3d3df7caf8b6b37e2662bd7b1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2d5ba3d3df7caf8b6b37e2662bd7b1a");
        } else {
            this.d.a(aVar, view, j, str);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bd5b7b9336ac94bece7396d514bef52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bd5b7b9336ac94bece7396d514bef52");
        } else {
            this.d.a(j, str);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(long j, String str, boolean z) {
        Object[] objArr = {new Long(j), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26a82ade358bdafbd7c0e2bbc050156a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26a82ade358bdafbd7c0e2bbc050156a");
        } else {
            this.d.a(j, str, z);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(long j, String str, String str2) {
        Object[] objArr = {new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "527939ca0dae47a06228c345253fb930", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "527939ca0dae47a06228c345253fb930");
        } else {
            this.d.a(j, str, str2);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(String str, long j, String str2) {
        Object[] objArr = {str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65961db80ab1222a8d0b3b9380389e09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65961db80ab1222a8d0b3b9380389e09");
            return;
        }
        this.d.a(str, j, str2);
        com.sankuai.waimai.store.manager.judas.b.a(this.c.G, "b_waimai_ry2scpay_mc").a("category_code", Long.valueOf(j)).a("sec_cate_id", str2).a("type", str).a();
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(String str, long j, String str2, String str3) {
        Object[] objArr = {str, new Long(j), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e58d6845d4ce8dadbc1edbe2d1cf0f62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e58d6845d4ce8dadbc1edbe2d1cf0f62");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.b("commit,%s", str3);
        com.sankuai.waimai.store.manager.judas.b.a(this.c.G, "b_waimai_wl3x9c9i_mc").a("cat_id", Long.valueOf(j)).a("sec_cat_id", str2).a("codes", str3).a("type", str).a();
    }
}
