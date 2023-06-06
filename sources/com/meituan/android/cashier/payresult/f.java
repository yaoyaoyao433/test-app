package com.meituan.android.cashier.payresult;

import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements f.InterfaceC0337f {
    public static ChangeQuickRedirect a;
    private final d b;

    public f(d dVar) {
        this.b = dVar;
    }

    @Override // com.meituan.android.paybase.utils.f.InterfaceC0337f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11ee7dec62ca2b833c1666b69c0406bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11ee7dec62ca2b833c1666b69c0406bf");
            return;
        }
        d dVar = this.b;
        Object[] objArr2 = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "633831e969e1326b3a77439faa1b8474", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "633831e969e1326b3a77439faa1b8474");
        } else {
            dVar.b.a(null);
        }
    }
}
