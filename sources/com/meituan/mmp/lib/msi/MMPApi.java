package com.meituan.mmp.lib.msi;

import com.meituan.msi.api.IMsiApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MMPApi implements b, IMsiApi {
    public static ChangeQuickRedirect b;
    public com.meituan.mmp.main.e c;
    public com.meituan.mmp.lib.engine.m d;

    @Override // com.meituan.mmp.lib.msi.b
    public final void a(com.meituan.mmp.main.e eVar) {
        this.c = eVar;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b168274f7eb3b04c8cc93e8e0137426", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b168274f7eb3b04c8cc93e8e0137426") : this.d.d.g();
    }
}
