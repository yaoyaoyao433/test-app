package com.meituan.android.cashier.payresult;

import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements f.InterfaceC0337f {
    public static ChangeQuickRedirect a;
    private final a b;

    public c(a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.android.paybase.utils.f.InterfaceC0337f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3296d90625ef9084727a6ce9d2b08d10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3296d90625ef9084727a6ce9d2b08d10");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b1ac68c10b6b2583f04a746a1a7341a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b1ac68c10b6b2583f04a746a1a7341a5");
        } else {
            aVar.d.a(null);
        }
    }
}
