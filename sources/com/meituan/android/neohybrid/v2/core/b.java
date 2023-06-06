package com.meituan.android.neohybrid.v2.core;

import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.v2.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements a.InterfaceC0311a {
    public static ChangeQuickRedirect a;
    private final NeoConfig b;

    public b(NeoConfig neoConfig) {
        this.b = neoConfig;
    }

    @Override // com.meituan.android.neohybrid.v2.core.a.InterfaceC0311a
    public final boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9d61c5dadb16e0626b4ef845d69d9aa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9d61c5dadb16e0626b4ef845d69d9aa")).booleanValue() : a.a(this.b, aVar);
    }
}
