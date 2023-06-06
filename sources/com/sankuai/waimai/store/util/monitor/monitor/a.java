package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.c
    public final boolean d() {
        return true;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.c
    public final b b() {
        return b.NORMAL;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.c
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0b3ae0f2a9a21e3b0df3fb2d035f758", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0b3ae0f2a9a21e3b0df3fb2d035f758") : super.a();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.c
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51f822982ca911b181ab57c2df8b852f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51f822982ca911b181ab57c2df8b852f") : super.c();
    }
}
