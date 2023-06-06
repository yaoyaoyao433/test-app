package com.meituan.android.ptcommonim.protocol;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final PTProtocolSessionFragment b;

    private b(PTProtocolSessionFragment pTProtocolSessionFragment) {
        this.b = pTProtocolSessionFragment;
    }

    public static Runnable a(PTProtocolSessionFragment pTProtocolSessionFragment) {
        Object[] objArr = {pTProtocolSessionFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37b6c3a95fafedba97a553517bd8779b", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37b6c3a95fafedba97a553517bd8779b") : new b(pTProtocolSessionFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd2b433ff6a89ced10b2e1dc09cedb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd2b433ff6a89ced10b2e1dc09cedb7");
        } else {
            PTProtocolSessionFragment.a(this.b);
        }
    }
}
