package com.meituan.android.paycommon.lib.webview.jshandler;

import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements f.InterfaceC0337f {
    public static ChangeQuickRedirect a;
    private final CashierScreenSnapShotJsHandler b;

    public b(CashierScreenSnapShotJsHandler cashierScreenSnapShotJsHandler) {
        this.b = cashierScreenSnapShotJsHandler;
    }

    @Override // com.meituan.android.paybase.utils.f.InterfaceC0337f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10604574b8038b4773aeaa27f36c90e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10604574b8038b4773aeaa27f36c90e0");
        } else {
            CashierScreenSnapShotJsHandler.lambda$null$2(this.b, z);
        }
    }
}
