package com.meituan.msc.extern;

import com.meituan.msc.common.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements k.a {
    public static ChangeQuickRedirect a;
    private static final g b = new g();

    public static k.a b() {
        return b;
    }

    @Override // com.meituan.msc.common.utils.k.a
    public final Class a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "638d0998161a5534ccaca8f7121f77f9", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "638d0998161a5534ccaca8f7121f77f9") : MSCEnvHelper.lambda$downloaderLogic$18();
    }
}
