package com.sankuai.waimai.store.widgets.filterbar.home.controller;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.base.statistic.b {
    public static ChangeQuickRedirect c;
    private com.sankuai.waimai.store.param.a d;

    @Override // com.sankuai.waimai.store.base.statistic.b
    public final String b() {
        return "b_waimai_qvt8n0z8_mv";
    }

    @Override // com.sankuai.waimai.store.base.statistic.b
    public final String c() {
        return "b_waimai_qvt8n0z8_mc";
    }

    public g(@NonNull SCBaseActivity sCBaseActivity, com.sankuai.waimai.store.param.a aVar) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42fa4d96930ae8b30081404399753f24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42fa4d96930ae8b30081404399753f24");
        } else {
            this.d = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.statistic.b
    @NonNull
    public final Map<String, Object> b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7cf98d8c15aa0cf163294bbd7518308", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7cf98d8c15aa0cf163294bbd7518308");
        }
        Map<String, Object> b = super.b(map);
        b.put("cat_id", Long.valueOf(this.d.c));
        b.put("sec_cate_id", this.d.f);
        return b;
    }

    @Override // com.sankuai.waimai.store.base.statistic.b
    public final String a(@NonNull com.sankuai.waimai.store.expose.v2.entity.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51c2bbb2a0e4cf4a2a6f82f22b01f9cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51c2bbb2a0e4cf4a2a6f82f22b01f9cd");
        }
        return this.b.hashCode() + CommonConstant.Symbol.MINUS + "b_waimai_qvt8n0z8_mv-" + i + CommonConstant.Symbol.MINUS + this.d.f;
    }
}
