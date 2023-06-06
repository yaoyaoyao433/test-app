package com.meituan.android.neohybrid.core;

import com.meituan.android.neohybrid.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements a.InterfaceC0302a {
    public static ChangeQuickRedirect a;
    private static final f b = new f();

    public static a.InterfaceC0302a a() {
        return b;
    }

    @Override // com.meituan.android.neohybrid.core.a.InterfaceC0302a
    public final boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edb0bd74025b4934c528847a848854e4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb0bd74025b4934c528847a848854e4")).booleanValue() : a.a(aVar);
    }
}
