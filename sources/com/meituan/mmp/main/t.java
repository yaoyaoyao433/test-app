package com.meituan.mmp.main;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.report.LoganModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements com.meituan.mmp.lib.api.e {
    public static ChangeQuickRedirect a;
    private static final t b = new t();

    public static com.meituan.mmp.lib.api.e b() {
        return b;
    }

    @Override // com.meituan.mmp.lib.api.e
    public final ApiFunction a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (ApiFunction) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fb3af1294697bcd0904dae9b041e0a", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fb3af1294697bcd0904dae9b041e0a") : new LoganModule.Logan());
    }
}
