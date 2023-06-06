package com.meituan.android.elderly.payresult;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36231875e634bba9cba18d442d14b965", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36231875e634bba9cba18d442d14b965");
            return;
        }
        d dVar = this.b;
        Object[] objArr2 = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "99b419ae67ee9df7e8d397b4b12ed6dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "99b419ae67ee9df7e8d397b4b12ed6dd");
        } else {
            dVar.b.a(null);
        }
    }
}
