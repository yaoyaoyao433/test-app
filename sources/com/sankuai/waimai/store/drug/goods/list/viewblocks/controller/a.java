package com.sankuai.waimai.store.drug.goods.list.viewblocks.controller;

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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8dee062a351c746beb5b81fd76d55fc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8dee062a351c746beb5b81fd76d55fc2");
        } else if (aVar == null) {
        } else {
            com.sankuai.waimai.foundation.core.service.screenshot.observer.a aVar2 = new com.sankuai.waimai.foundation.core.service.screenshot.observer.a() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.controller.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.core.service.screenshot.observer.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b793f0bf1fa871a30167e18be89762e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b793f0bf1fa871a30167e18be89762e");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71f84751643060c6e5b48ca01e1fafae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71f84751643060c6e5b48ca01e1fafae");
        } else if (aVar == null || (remove = b.remove(aVar)) == null) {
        } else {
            com.sankuai.waimai.foundation.core.service.screenshot.a.a().b(remove);
        }
    }
}
