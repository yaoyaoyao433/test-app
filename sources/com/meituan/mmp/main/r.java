package com.meituan.mmp.main;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.user.AbsUserModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements com.meituan.mmp.lib.api.e {
    public static ChangeQuickRedirect a;
    private static final r b = new r();

    public static com.meituan.mmp.lib.api.e b() {
        return b;
    }

    @Override // com.meituan.mmp.lib.api.e
    public final ApiFunction a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (ApiFunction) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690f1edc9b9d0b712ffaf1e74a00250b", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690f1edc9b9d0b712ffaf1e74a00250b") : new AbsUserModule.AbsMtLogout());
    }
}
