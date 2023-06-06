package com.meituan.android.ptcommonim.pageadapter.widget;

import com.meituan.android.ptcommonim.pageadapter.widget.PTFrameMachContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final PTFrameMachContainer.a b;

    private d(PTFrameMachContainer.a aVar) {
        this.b = aVar;
    }

    public static Runnable a(PTFrameMachContainer.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe6096f9b1f3128061802b06c296ff97", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe6096f9b1f3128061802b06c296ff97") : new d(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2587e35b58ee35072a8f6c15263f60ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2587e35b58ee35072a8f6c15263f60ed");
            return;
        }
        PTFrameMachContainer.a aVar = this.b;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = PTFrameMachContainer.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "487b6f28c00c8e52f776837a678a3f7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "487b6f28c00c8e52f776837a678a3f7a");
        } else {
            PTFrameMachContainer.this.c.a();
        }
    }
}
