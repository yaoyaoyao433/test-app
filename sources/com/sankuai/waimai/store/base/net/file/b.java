package com.sankuai.waimai.store.base.net.file;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.e;
import com.sankuai.waimai.store.base.net.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends e {
    public static ChangeQuickRedirect d;

    @Override // com.sankuai.waimai.store.base.net.e, com.sankuai.waimai.store.base.net.b
    public final h e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbaee771fc8b1d8fb0e7ee9d1232198b", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbaee771fc8b1d8fb0e7ee9d1232198b") : new a();
    }
}
