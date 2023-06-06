package com.meituan.mmp.main;

import com.meituan.mmp.lib.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements m.a {
    public static ChangeQuickRedirect a;
    private static final m b = new m();

    public static m.a b() {
        return b;
    }

    @Override // com.meituan.mmp.lib.utils.m.a
    public final Class a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "329a072944963638d36bda2e0520cdf5", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "329a072944963638d36bda2e0520cdf5") : MMPEnvHelper.lambda$delayedInit$14();
    }
}
