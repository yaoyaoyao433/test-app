package com.meituan.android.legwork.ui.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final IMSessionFragment b;
    private final View c;

    private b(IMSessionFragment iMSessionFragment, View view) {
        this.b = iMSessionFragment;
        this.c = view;
    }

    public static Runnable a(IMSessionFragment iMSessionFragment, View view) {
        Object[] objArr = {iMSessionFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21bb954ab03899732a6a9f484a04024d", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21bb954ab03899732a6a9f484a04024d") : new b(iMSessionFragment, view);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b5d0140891b7ba5f2084566a58ffaa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b5d0140891b7ba5f2084566a58ffaa8");
        } else {
            IMSessionFragment.b(this.b, this.c);
        }
    }
}
