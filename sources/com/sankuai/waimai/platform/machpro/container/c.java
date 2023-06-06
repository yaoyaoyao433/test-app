package com.sankuai.waimai.platform.machpro.container;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.container.d;
import com.sankuai.waimai.machpro.container.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends e {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.machpro.container.e
    public final d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53cf959a674798e5a239ddf93f3e70ae", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53cf959a674798e5a239ddf93f3e70ae") : new b();
    }
}
