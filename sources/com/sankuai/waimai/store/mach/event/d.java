package com.sankuai.waimai.store.mach.event;

import android.app.Dialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.u;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "351e7f42779da9451f3720050cd450ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "351e7f42779da9451f3720050cd450ed");
        } else if (map == null || map.isEmpty()) {
        } else {
            String valueOf = String.valueOf(map.get("msg"));
            if (t.a(valueOf)) {
                return;
            }
            if (u.a(map, "level", 0) == 1) {
                Dialog j = SCBaseDialog.j();
                if (j == null) {
                    am.a(aVar.a(), valueOf);
                    return;
                } else {
                    am.a(j, valueOf, aVar.a());
                    return;
                }
            }
            am.a(aVar.a(), valueOf);
        }
    }
}
