package com.meituan.mmp.main;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.report.ReportModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements com.meituan.mmp.lib.api.e {
    public static ChangeQuickRedirect a;
    private static final q b = new q();

    public static com.meituan.mmp.lib.api.e b() {
        return b;
    }

    @Override // com.meituan.mmp.lib.api.e
    public final ApiFunction a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (ApiFunction) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dd15ef9963e9abb65310bf4d97a4c7b", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dd15ef9963e9abb65310bf4d97a4c7b") : new ReportModule.SetLxTag());
    }
}
