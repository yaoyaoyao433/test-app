package com.sankuai.waimai.platform.net.phoenix.monitor;

import android.text.TextUtils;
import com.meituan.phoenix.monitor.c;
import com.meituan.phoenix.monitor.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.phoenix.monitor.c
    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c72453ea5ed881c4ddceb3ef49b099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c72453ea5ed881c4ddceb3ef49b099");
        } else if (eVar != null) {
            com.sankuai.waimai.platform.capacity.log.c a2 = com.sankuai.waimai.platform.capacity.log.c.a();
            int i = eVar.i;
            a2.a(i, eVar.h + "_origin", eVar.l);
            if (eVar.f && !TextUtils.isEmpty(eVar.j)) {
                com.sankuai.waimai.platform.capacity.log.c.a().a(200, (int) eVar.m, eVar.j + "_phoenix");
            }
            if (eVar.n != null && eVar.n.size() != 0) {
                for (int i2 = 0; i2 < eVar.n.size(); i2++) {
                    long longValue = eVar.p.get(i2).longValue();
                    com.sankuai.waimai.platform.capacity.log.c.a().a(eVar.o.get(i2).intValue(), (int) longValue, eVar.n.get(i2) + "_phoenix");
                }
            }
            com.sankuai.waimai.platform.capacity.log.c.a().a(Math.min(eVar.r + 4700, 4710), "waimai_phoenix_retry_count", (int) eVar.l);
        }
    }
}
