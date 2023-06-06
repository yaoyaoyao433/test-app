package com.sankuai.waimai.store.skuchoose.judas;

import android.content.Context;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends f {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.skuchoose.judas.f
    public final void a(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "443eb858add405297326c3ddbe3ee4e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "443eb858add405297326c3ddbe3ee4e0");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(context, "b_UHTLt").a("poi_id", this.c.d()).a("spu_id", Long.valueOf(this.d.id)).a("template_id", 2).a("spu_tag", a()).a();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.judas.f
    public final void b(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8d428c6a87a30dbbdc7f3ea83fde636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8d428c6a87a30dbbdc7f3ea83fde636");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(context, "b_waimai_endbn85r_mc").a("poi_id", this.c.d()).a("spu_id", Long.valueOf(this.d.getId())).a("template_id", 2).a("sku_id", Long.valueOf(j)).a("keyword", "-999").a("poisearch_log_id", "-999").a("poisearch_global_id", "-999").a();
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.judas.f
    public final void c(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e7311b0ee8baada9f4bb5beb1f76407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e7311b0ee8baada9f4bb5beb1f76407");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.goods.a a2 = com.sankuai.waimai.store.platform.domain.manager.goods.a.a();
        if (this.m == null) {
            this.m = new HashMap();
        }
        this.m.put("sku_id", Long.valueOf(j));
        this.m.put("spu_id", Long.valueOf(this.d.id));
        this.m.put("poi_id", this.c.d());
        this.m.put(DataConstants.CATEGORY_ID, this.d.getTag());
        this.m.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.l));
        this.m.put("is_show_remain_num", a2.b ? "1" : "0");
        this.m.put("has_comment", a2.c ? "1" : "0");
        this.m.put("product_tag", "-999");
        this.m.put("comment_source", a2.d);
        this.m.put("template_id", 2);
        com.sankuai.waimai.store.manager.judas.b.a(context, "b_m9pmX").b(this.m).a();
    }

    @Override // com.sankuai.waimai.store.skuchoose.judas.f
    public final void d(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8dba8ab5fa19f5bc2ef493a9bf7fcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8dba8ab5fa19f5bc2ef493a9bf7fcc");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.goods.a a2 = com.sankuai.waimai.store.platform.domain.manager.goods.a.a();
        if (this.m == null) {
            this.m = new HashMap();
        }
        this.m.put("poi_id", this.c.d());
        this.m.put("spu_id", Long.valueOf(this.d.id));
        this.m.put("sku_id", Long.valueOf(j));
        this.m.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.l));
        this.m.put(DataConstants.CATEGORY_ID, this.d.getTag());
        this.m.put("is_show_remain_num", a2.b ? "1" : "0");
        this.m.put("has_comment", a2.c ? "1" : "0");
        this.m.put("comment_source", a2.d);
        this.m.put("template_id", 2);
        this.m.put("product_tag", "");
        com.sankuai.waimai.store.manager.judas.b.a(context, "b_FRrXo").b(this.m).a();
    }
}
