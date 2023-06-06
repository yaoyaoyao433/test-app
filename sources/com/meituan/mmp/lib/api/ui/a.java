package com.meituan.mmp.lib.api.ui;

import com.meituan.mmp.lib.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements m.a {
    public static ChangeQuickRedirect a;
    private static final a b = new a();

    public static m.a b() {
        return b;
    }

    @Override // com.meituan.mmp.lib.utils.m.a
    public final Class a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a9eb5ad852e148927a0ae5dd08b256e", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a9eb5ad852e148927a0ae5dd08b256e") : MiniProgramApi.f();
    }
}
