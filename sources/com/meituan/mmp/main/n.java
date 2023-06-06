package com.meituan.mmp.main;

import com.meituan.mmp.lib.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements m.a {
    public static ChangeQuickRedirect a;
    private static final n b = new n();

    public static m.a b() {
        return b;
    }

    @Override // com.meituan.mmp.lib.utils.m.a
    public final Class a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd6b4fef49bebcb5ef30d02d9ac81c9d", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd6b4fef49bebcb5ef30d02d9ac81c9d") : MMPEnvHelper.lambda$downloaderLogic$16();
    }
}
