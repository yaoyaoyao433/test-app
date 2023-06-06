package com.sankuai.waimai.store.search.ui.result.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.k;
import com.sankuai.waimai.platform.mach.util.WmMachImageLoaderUtil;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements com.sankuai.waimai.mach.c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.c
    public final void a(c.a aVar, k kVar) {
        Object[] objArr = {aVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de1ccb93e924b060c5fb537941fd16ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de1ccb93e924b060c5fb537941fd16ff");
        } else {
            WmMachImageLoaderUtil.a(aVar, kVar);
        }
    }
}
