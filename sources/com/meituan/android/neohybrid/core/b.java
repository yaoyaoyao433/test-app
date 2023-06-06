package com.meituan.android.neohybrid.core;

import com.meituan.android.neohybrid.core.a;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements a.InterfaceC0302a {
    public static ChangeQuickRedirect a;
    private final NeoConfig b;

    public b(NeoConfig neoConfig) {
        this.b = neoConfig;
    }

    @Override // com.meituan.android.neohybrid.core.a.InterfaceC0302a
    public final boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e58912c14fcbf4f7e7c6071d591ed46", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e58912c14fcbf4f7e7c6071d591ed46")).booleanValue() : a.a(this.b, aVar);
    }
}
