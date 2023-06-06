package com.sankuai.waimai.store.base.net.wm;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.h;
import com.sankuai.waimai.store.base.net.sg.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends e {
    public static ChangeQuickRedirect d;

    @Override // com.sankuai.waimai.store.base.net.e, com.sankuai.waimai.store.base.net.b
    public final h e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1403c29c5bd7a2a82a3e7646a0a2a132", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1403c29c5bd7a2a82a3e7646a0a2a132") : new b();
    }
}
