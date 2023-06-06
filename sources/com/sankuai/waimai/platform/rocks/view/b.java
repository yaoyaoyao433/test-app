package com.sankuai.waimai.platform.rocks.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.rocks.view.recyclerview.footer.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.rocks.view.recyclerview.footer.a
    public final com.meituan.android.cube.pga.block.a a(com.sankuai.waimai.rocks.view.block.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2329204083978275921008cb54d58fd", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2329204083978275921008cb54d58fd") : new a(cVar);
    }
}
