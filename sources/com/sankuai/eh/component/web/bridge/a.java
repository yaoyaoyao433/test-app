package com.sankuai.eh.component.web.bridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final EHDfpFingerprintJsHandler b;

    public a(EHDfpFingerprintJsHandler eHDfpFingerprintJsHandler) {
        this.b = eHDfpFingerprintJsHandler;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e8dada1675d4539e1d65e3b6115e843", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e8dada1675d4539e1d65e3b6115e843");
        } else {
            EHDfpFingerprintJsHandler.lambda$innerExec$4(this.b);
        }
    }
}
