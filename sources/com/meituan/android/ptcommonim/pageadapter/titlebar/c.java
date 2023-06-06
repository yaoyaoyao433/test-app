package com.meituan.android.ptcommonim.pageadapter.titlebar;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final PTTitleBarAdapter b;
    private final List c;

    private c(PTTitleBarAdapter pTTitleBarAdapter, List list) {
        this.b = pTTitleBarAdapter;
        this.c = list;
    }

    public static Runnable a(PTTitleBarAdapter pTTitleBarAdapter, List list) {
        Object[] objArr = {pTTitleBarAdapter, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a754acad381e830b328b4df0179c656", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a754acad381e830b328b4df0179c656") : new c(pTTitleBarAdapter, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bd623d0c90eded1c08c653b45719fac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bd623d0c90eded1c08c653b45719fac");
        } else {
            PTTitleBarAdapter.a(this.b, this.c);
        }
    }
}
