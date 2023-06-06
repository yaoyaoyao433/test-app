package com.meituan.android.hybridcashier.bridge.result;

import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements f.InterfaceC0337f {
    public static ChangeQuickRedirect a;
    private final NotifyHybridProcessResultJSHandler b;
    private final PayResultBean c;

    public b(NotifyHybridProcessResultJSHandler notifyHybridProcessResultJSHandler, PayResultBean payResultBean) {
        this.b = notifyHybridProcessResultJSHandler;
        this.c = payResultBean;
    }

    @Override // com.meituan.android.paybase.utils.f.InterfaceC0337f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ef2a326f8d0f0f9bc5c483694818d0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ef2a326f8d0f0f9bc5c483694818d0c");
        } else {
            NotifyHybridProcessResultJSHandler.lambda$handlePayFinish$1(this.b, this.c, z);
        }
    }
}
