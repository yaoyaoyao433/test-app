package com.meituan.android.neohybrid.v2.core;

import com.meituan.android.neohybrid.v2.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements a.InterfaceC0311a {
    public static ChangeQuickRedirect a;
    private final String b;

    public l(String str) {
        this.b = str;
    }

    @Override // com.meituan.android.neohybrid.v2.core.a.InterfaceC0311a
    public final boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aed7f63de30690bd5e47ccfcf3056dc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aed7f63de30690bd5e47ccfcf3056dc")).booleanValue() : a.a(this.b, aVar);
    }
}
