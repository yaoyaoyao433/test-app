package com.sankuai.waimai.store.manager.screenshot;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Map<com.sankuai.waimai.store.i.screenshot.observer.a, com.sankuai.waimai.foundation.core.service.screenshot.observer.a> b = new HashMap();

    public static void a(final com.sankuai.waimai.store.i.screenshot.observer.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "250881b2a8de8b247c27e2297028fa48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "250881b2a8de8b247c27e2297028fa48");
        } else if (aVar == null) {
        } else {
            com.sankuai.waimai.foundation.core.service.screenshot.observer.a aVar2 = new com.sankuai.waimai.foundation.core.service.screenshot.observer.a() { // from class: com.sankuai.waimai.store.manager.screenshot.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.core.service.screenshot.observer.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3bd1e1851b974867a712843111f7216d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3bd1e1851b974867a712843111f7216d");
                    }
                }
            };
            b.put(aVar, aVar2);
            com.sankuai.waimai.foundation.core.service.screenshot.a.a().a(aVar2);
        }
    }

    public static void b(com.sankuai.waimai.store.i.screenshot.observer.a aVar) {
        com.sankuai.waimai.foundation.core.service.screenshot.observer.a remove;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69b31661620d529dc1c74340c69aec32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69b31661620d529dc1c74340c69aec32");
        } else if (aVar == null || (remove = b.remove(aVar)) == null) {
        } else {
            com.sankuai.waimai.foundation.core.service.screenshot.a.a().b(remove);
        }
    }
}
