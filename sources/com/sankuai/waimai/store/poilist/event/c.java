package com.sankuai.waimai.store.poilist.event;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.statistic.b {
    public static ChangeQuickRedirect c;
    private final com.sankuai.waimai.store.param.a d;

    @Override // com.sankuai.waimai.store.base.statistic.b
    public final String b() {
        return "b_waimai_9u4e19qi_mv";
    }

    @Override // com.sankuai.waimai.store.base.statistic.b
    public final String c() {
        return "b_waimai_9u4e19qi_mc";
    }

    public c(@NonNull SCBaseActivity sCBaseActivity, @Nullable com.sankuai.waimai.store.param.a aVar) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aa002023fcdb264725826c503ab16d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aa002023fcdb264725826c503ab16d2");
        } else {
            this.d = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.statistic.b
    @NonNull
    public final Map<String, Object> b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41f0752c078707b5412ead2a36baabb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41f0752c078707b5412ead2a36baabb1");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3bd9460b0796178c66adc29fcee881c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3bd9460b0796178c66adc29fcee881c");
        }
        return this.b.hashCode() + CommonConstant.Symbol.MINUS + "b_waimai_9u4e19qi_mv-" + i;
    }
}
