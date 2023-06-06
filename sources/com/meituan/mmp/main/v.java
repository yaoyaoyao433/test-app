package com.meituan.mmp.main;

import com.meituan.mmp.lib.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements m.a {
    public static ChangeQuickRedirect a;
    private static final v b = new v();

    public static m.a b() {
        return b;
    }

    @Override // com.meituan.mmp.lib.utils.m.a
    public final Class a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33053388418872707140e9bb1a5e707e", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33053388418872707140e9bb1a5e707e") : MMPEnvHelper.lambda$registerApis$15();
    }
}
