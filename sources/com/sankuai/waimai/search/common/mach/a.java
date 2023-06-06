package com.sankuai.waimai.search.common.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.k;
import com.sankuai.waimai.platform.mach.util.WmMachImageLoaderUtil;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.c
    public final void a(c.a aVar, k kVar) {
        Object[] objArr = {aVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f7084d1e0887b2d6470dce9200fc8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f7084d1e0887b2d6470dce9200fc8f");
        } else {
            WmMachImageLoaderUtil.a(aVar, kVar);
        }
    }
}
