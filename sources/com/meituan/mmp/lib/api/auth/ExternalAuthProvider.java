package com.meituan.mmp.lib.api.auth;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ExternalAuthProvider implements IExternalAuthProvider {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.auth.IExternalAuthProvider
    public final f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9afecaa346a78998ae29e5c278b5a17f", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9afecaa346a78998ae29e5c278b5a17f") : new e();
    }
}
