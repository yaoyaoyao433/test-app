package com.sankuai.waimai.store.msi.view.shoprest;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.base.statistic.b {
    public static ChangeQuickRedirect c;
    private final com.sankuai.waimai.store.param.a d;

    @Override // com.sankuai.waimai.store.base.statistic.b
    public final String a() {
        return "c_waimai_qeknbhm9";
    }

    @Override // com.sankuai.waimai.store.base.statistic.b, com.sankuai.waimai.store.base.statistic.a
    public final void a(@Nullable com.sankuai.waimai.store.expose.v2.entity.b bVar, int i, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.store.base.statistic.b
    public final String b() {
        return "b_waimai_9u4e19qi_mv";
    }

    @Override // com.sankuai.waimai.store.base.statistic.b
    public final String c() {
        return "b_waimai_9u4e19qi_mc";
    }

    public d(@Nullable com.sankuai.waimai.store.param.a aVar) {
        super(null);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f2987d14749382dae65e13148389854", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f2987d14749382dae65e13148389854");
        } else {
            this.d = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.statistic.b
    @NonNull
    public final Map<String, Object> b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccafb3873777d83fce224663c2a58f13", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccafb3873777d83fce224663c2a58f13");
        }
        if (this.d == null) {
            return super.b(map);
        }
        Map<String, Object> b = super.b(map);
        b.put("cat_id", Long.valueOf(this.d.c));
        b.put("sec_cat_id", this.d.f);
        return b;
    }

    @Override // com.sankuai.waimai.store.base.statistic.b
    public final String a(@NonNull com.sankuai.waimai.store.expose.v2.entity.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "020171881717b5618e6547085a9c1351", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "020171881717b5618e6547085a9c1351");
        }
        return "b_waimai_9u4e19qi_mv-" + i;
    }
}
