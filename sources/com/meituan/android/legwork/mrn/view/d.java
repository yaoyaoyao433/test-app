package com.meituan.android.legwork.mrn.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final PtNestedScrollContainer b;

    private d(PtNestedScrollContainer ptNestedScrollContainer) {
        this.b = ptNestedScrollContainer;
    }

    public static Runnable a(PtNestedScrollContainer ptNestedScrollContainer) {
        Object[] objArr = {ptNestedScrollContainer};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7bc0f8842526a1561cac524f57c9cd1e", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7bc0f8842526a1561cac524f57c9cd1e") : new d(ptNestedScrollContainer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e57ab0d5323e694a3f46796e594306bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e57ab0d5323e694a3f46796e594306bc");
        } else {
            PtNestedScrollContainer.a(this.b);
        }
    }
}
