package com.meituan.mmp.lib.api;

import com.meituan.mmp.lib.api.update.UpdateHostAppModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements e {
    public static ChangeQuickRedirect a;
    private static final g b = new g();

    public static e b() {
        return b;
    }

    @Override // com.meituan.mmp.lib.api.e
    public final ApiFunction a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (ApiFunction) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "960ba41413b0074e30dd9f8ae04dde07", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "960ba41413b0074e30dd9f8ae04dde07") : new UpdateHostAppModule.UpdateHostApp());
    }
}
