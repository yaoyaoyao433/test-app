package com.meituan.mmp.lib.web;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class X5Provider implements IX5Provider {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.web.IX5Provider
    public final c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5779c82cad8d8bbdc87b03ad6c7cc7d1", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5779c82cad8d8bbdc87b03ad6c7cc7d1") : new k();
    }
}
