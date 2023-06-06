package com.sankuai.waimai.store.skuchoose.judas;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends f {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.skuchoose.judas.f
    public final void a(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b70dcbb12ba4faf27a69b390970216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b70dcbb12ba4faf27a69b390970216");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(context, "b_f7ur7zus").a("poi_id", Long.valueOf(this.c.f())).a("spu_id", Long.valueOf(this.d.id)).a("sku_id", Long.valueOf(j)).a("stid", this.k != null ? this.k : "-999").a("keyword", this.f != null ? this.f : "-999").a("index", Integer.valueOf(this.i)).a("poisearch_log_id", this.g != null ? this.g : "-999").a("poisearch_global_id", this.h != null ? this.h : "-999").a("template_id", 2).a("spu_tag", a()).a();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.judas.f
    public final void b(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e4744808bfaeec396def7aed3978e7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e4744808bfaeec396def7aed3978e7a");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(context, "b_waimai_endbn85r_mc").a("poi_id", this.c.d()).a("spu_id", Long.valueOf(this.d.getId())).a("template_id", 2).a("sku_id", Long.valueOf(j)).a("keyword", this.f != null ? this.f : "-999").a("poisearch_log_id", this.g != null ? this.g : "-999").a("poisearch_global_id", this.h != null ? this.h : "-999").a();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.judas.f
    public final void c(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9abcc1ad7ac2dfe3c384aa4b0bb5f16c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9abcc1ad7ac2dfe3c384aa4b0bb5f16c");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(context, "b_bGeUX").a("poi_id", Long.valueOf(this.c.f())).a("spu_id", Long.valueOf(this.d.id)).a("stid", this.k != null ? this.k : "-999").a("sku_id", Long.valueOf(j)).a("index", Integer.valueOf(this.i)).a("keyword", this.f != null ? this.f : "-999").a("poisearch_log_id", this.g != null ? this.g : "-999").a("poisearch_global_id", this.h != null ? this.h : "-999").a("fixedprice", "-999").a("template_id", 2).a();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.judas.f
    public final void d(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e14ec4f669f7d26b905c7e8f5ed0903d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e14ec4f669f7d26b905c7e8f5ed0903d");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(context, "b_nrb8gump").a("poi_id", Long.valueOf(this.c.f())).a("spu_id", Long.valueOf(this.d.id)).a("sku_id", Long.valueOf(j)).a("index", Integer.valueOf(this.i)).a("keyword", this.f != null ? this.f : "-999").a("poisearch_log_id", this.g != null ? this.g : "-999").a("poisearch_global_id", this.h != null ? this.h : "-999").a("stid", this.k != null ? this.k : "-999").a("template_id", 2).a();
        }
    }
}
