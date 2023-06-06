package com.meituan.android.neohybrid.neo;

import com.meituan.android.neohybrid.neo.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements b.a {
    public static ChangeQuickRedirect a;
    private final n b;

    public e(n nVar) {
        this.b = nVar;
    }

    @Override // com.meituan.android.neohybrid.neo.b.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "077e772823d710201b0926fdbf3385c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "077e772823d710201b0926fdbf3385c2");
            return;
        }
        n nVar = this.b;
        Object[] objArr2 = {nVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fe45c46d8e6428a7a9693b7d065eda84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fe45c46d8e6428a7a9693b7d065eda84");
        } else {
            aVar.a(nVar);
        }
    }
}
