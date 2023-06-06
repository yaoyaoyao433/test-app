package com.meituan.android.yoda.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final ConfirmListFragment b;
    private final String c;

    private b(ConfirmListFragment confirmListFragment, String str) {
        this.b = confirmListFragment;
        this.c = str;
    }

    public static Runnable a(ConfirmListFragment confirmListFragment, String str) {
        Object[] objArr = {confirmListFragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea91cfb83402e4a08a4d3ecaf46c2ae9", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea91cfb83402e4a08a4d3ecaf46c2ae9") : new b(confirmListFragment, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e29bfb6039e36948d96dbfa1b484979e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e29bfb6039e36948d96dbfa1b484979e");
        } else {
            ConfirmListFragment.a(this.b, this.c);
        }
    }
}
