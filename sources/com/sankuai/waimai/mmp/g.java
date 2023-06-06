package com.sankuai.waimai.mmp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g implements com.meituan.msc.extern.f {
    public static ChangeQuickRedirect a;
    private static com.sankuai.meituan.city.a b = com.meituan.android.singleton.a.a();

    @Override // com.meituan.msc.extern.f
    public final long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb57e48464be4ae3d22eb54917e5d0db", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb57e48464be4ae3d22eb54917e5d0db")).longValue() : b.b();
    }
}
