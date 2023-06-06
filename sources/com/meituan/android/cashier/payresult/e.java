package com.meituan.android.cashier.payresult;

import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements f.InterfaceC0337f {
    public static ChangeQuickRedirect a;
    private final d b;

    public e(d dVar) {
        this.b = dVar;
    }

    @Override // com.meituan.android.paybase.utils.f.InterfaceC0337f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83c976419b5b3c9cd3782508ce26fb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83c976419b5b3c9cd3782508ce26fb2");
            return;
        }
        d dVar = this.b;
        Object[] objArr2 = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4508dd17d6cc4f2f5e8b847fe1264782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4508dd17d6cc4f2f5e8b847fe1264782");
        } else {
            dVar.b.a(null);
        }
    }
}
