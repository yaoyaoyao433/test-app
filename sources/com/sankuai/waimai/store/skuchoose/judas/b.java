package com.sankuai.waimai.store.skuchoose.judas;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends f {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.skuchoose.judas.f
    public final void a(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab230ae5ecf0c020f656a5611bdf826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab230ae5ecf0c020f656a5611bdf826");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b("c_u4fk4kw", com.sankuai.waimai.store.manager.judas.b.a((Object) context), "b_waimai_92jx5p7c_mv").a("poi_id", this.c.d()).a("spu_id", Long.valueOf(this.d.id)).a("sku_id", Long.valueOf(j)).a("template_id", 2).a("spu_tag", a()).a();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.judas.f
    public final void b(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5b0bf101659970336b0d2e06fd1df08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5b0bf101659970336b0d2e06fd1df08");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a("c_u4fk4kw", com.sankuai.waimai.store.manager.judas.b.a((Object) context), "b_waimai_endbn85r_mc").a("poi_id", this.c.d()).a("spu_id", Long.valueOf(this.d.getId())).a("template_id", 2).a("sku_id", Long.valueOf(j)).a("keyword", "-999").a("poisearch_log_id", "-999").a("poisearch_global_id", "-999").a();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.judas.f
    public final void c(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f307b6ec5465468cf8ea51571c346ff4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f307b6ec5465468cf8ea51571c346ff4");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.goods.a a2 = com.sankuai.waimai.store.platform.domain.manager.goods.a.a();
        com.sankuai.waimai.store.manager.judas.b.a("c_u4fk4kw", com.sankuai.waimai.store.manager.judas.b.a((Object) context), "b_fwQ6d").a("poi_id", this.c.d()).a("spu_id", Long.valueOf(this.d.id)).a("sku_id", Long.valueOf(j)).a("is_show_remain_num", a2.b ? "1" : "0").a("has_comment", a2.c ? "1" : "0").a("product_tag", "").a("comment_source", a2.d).a("template_id", 2).a("stid", !t.a(this.d.stid) ? this.d.stid : "").a("product_icon_type_list", !t.a(this.d.iconTypes) ? this.d.iconTypes : "").a();
    }

    @Override // com.sankuai.waimai.store.skuchoose.judas.f
    public final void d(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e5c814ea9b0a89fd0c7747f3c722331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e5c814ea9b0a89fd0c7747f3c722331");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.goods.a a2 = com.sankuai.waimai.store.platform.domain.manager.goods.a.a();
        com.sankuai.waimai.store.manager.judas.b.a("c_u4fk4kw", com.sankuai.waimai.store.manager.judas.b.a((Object) context), "b_utxGH").a("poi_id", this.c.d()).a("spu_id", Long.valueOf(this.d.id)).a("sku_id", Long.valueOf(j)).a("is_show_remain_num", a2.b ? "1" : "0").a("has_comment", a2.c ? "1" : "0").a("product_tag", "").a("comment_source", a2.d).a("template_id", 2).a("stid", !t.a(this.d.stid) ? this.d.stid : "").a("product_icon_type_list", !t.a(this.d.iconTypes) ? this.d.iconTypes : "").a();
    }
}
