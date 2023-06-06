package com.sankuai.waimai.business.page.kingkong.future.network;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.page.tablist.rocklist.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f implements com.sankuai.waimai.rocks.page.tablist.rocklist.a {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.business.page.kingkong.a b;

    public f(com.sankuai.waimai.business.page.kingkong.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d947d24d3b05968552f1e689c0448c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d947d24d3b05968552f1e689c0448c4");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.a
    public final com.sankuai.waimai.rocks.page.tablist.rocklist.b a(Context context, a.EnumC1131a enumC1131a) {
        Object[] objArr = {context, enumC1131a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3300a9c94d4b4195446ba2640ab3cd16", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.rocks.page.tablist.rocklist.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3300a9c94d4b4195446ba2640ab3cd16");
        }
        if (enumC1131a == a.EnumC1131a.GLOBAL) {
            return null;
        }
        return new d(context, this.b, false);
    }
}
