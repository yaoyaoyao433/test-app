package com.meituan.android.ptcommonim;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final PTSessionFragmentV2 b;

    private d(PTSessionFragmentV2 pTSessionFragmentV2) {
        this.b = pTSessionFragmentV2;
    }

    public static Runnable a(PTSessionFragmentV2 pTSessionFragmentV2) {
        Object[] objArr = {pTSessionFragmentV2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a764fba95ba44904ea418b0ae348a202", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a764fba95ba44904ea418b0ae348a202") : new d(pTSessionFragmentV2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba3986048d0ab753a579f435c943a401", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba3986048d0ab753a579f435c943a401");
        } else {
            PTSessionFragmentV2.a(this.b);
        }
    }
}
