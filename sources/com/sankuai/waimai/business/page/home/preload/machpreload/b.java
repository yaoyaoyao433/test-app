package com.sankuai.waimai.business.page.home.preload.machpreload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.view.mach.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(com.sankuai.waimai.rocks.view.a aVar, com.sankuai.waimai.mach.recycler.b bVar) {
        com.sankuai.waimai.rocks.view.mach.a aVar2;
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "595b6f2179f5a904c7041572b3116de7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "595b6f2179f5a904c7041572b3116de7");
        } else if (aVar == null || bVar == null || (aVar2 = aVar.c) == null || !(aVar2 instanceof c)) {
        } else {
            aVar2.a(bVar);
        }
    }
}
