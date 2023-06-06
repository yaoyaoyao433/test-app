package com.sankuai.meituan.location.collector.locator;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.c;
/* loaded from: classes4.dex */
public final class c extends b {
    public static ChangeQuickRedirect e;

    public c(c.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba5476a10b64782c6a40e97a8688e53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba5476a10b64782c6a40e97a8688e53");
        }
    }

    @Override // com.sankuai.meituan.location.collector.locator.a, com.sankuai.meituan.location.collector.locator.d
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b099ada8b2679511e85717e575ddfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b099ada8b2679511e85717e575ddfa");
            return;
        }
        com.sankuai.meituan.location.collector.a.a().b = this;
        super.b();
    }

    @Override // com.sankuai.meituan.location.collector.locator.a, com.sankuai.meituan.location.collector.locator.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88b4654f6befaddb2d2411dd67de1952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88b4654f6befaddb2d2411dd67de1952");
            return;
        }
        super.c();
        com.sankuai.meituan.location.collector.a.a().b = null;
    }
}
