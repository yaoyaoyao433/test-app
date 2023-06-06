package com.meituan.mmp.main;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.device.MTScanCodeModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements com.meituan.mmp.lib.api.e {
    public static ChangeQuickRedirect a;
    private static final o b = new o();

    public static com.meituan.mmp.lib.api.e b() {
        return b;
    }

    @Override // com.meituan.mmp.lib.api.e
    public final ApiFunction a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (ApiFunction) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "824173acaa06f8b68a07c830783f191d", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "824173acaa06f8b68a07c830783f191d") : new MTScanCodeModule.ScanCode());
    }
}
