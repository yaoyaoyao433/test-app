package com.meituan.android.ptcommonim.pageadapter.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final PTFrameMachContainer b;

    private a(PTFrameMachContainer pTFrameMachContainer) {
        this.b = pTFrameMachContainer;
    }

    public static Runnable a(PTFrameMachContainer pTFrameMachContainer) {
        Object[] objArr = {pTFrameMachContainer};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e8b4d3a42eb3f1e47d72227419c7dc6", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e8b4d3a42eb3f1e47d72227419c7dc6") : new a(pTFrameMachContainer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e53894a15b5ea0a0037cb2fe987f6b3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e53894a15b5ea0a0037cb2fe987f6b3d");
        } else {
            PTFrameMachContainer.a(this.b);
        }
    }
}
