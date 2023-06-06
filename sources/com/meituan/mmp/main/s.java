package com.meituan.mmp.main;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.report.LxModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements com.meituan.mmp.lib.api.e {
    public static ChangeQuickRedirect a;
    private static final s b = new s();

    public static com.meituan.mmp.lib.api.e b() {
        return b;
    }

    @Override // com.meituan.mmp.lib.api.e
    public final ApiFunction a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (ApiFunction) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b628155c0870b10aa2c461ea0f8211ff", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b628155c0870b10aa2c461ea0f8211ff") : new LxModule.LxLog());
    }
}
