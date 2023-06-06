package com.meituan.android.elderly.elderly;

import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements f.InterfaceC0337f {
    public static ChangeQuickRedirect a;
    private final ElderlyCashier b;

    public d(ElderlyCashier elderlyCashier) {
        this.b = elderlyCashier;
    }

    @Override // com.meituan.android.paybase.utils.f.InterfaceC0337f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a5cd8a2743dc194872e07b983cb9cc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a5cd8a2743dc194872e07b983cb9cc2");
        } else {
            ElderlyCashier.a(this.b, z);
        }
    }
}
