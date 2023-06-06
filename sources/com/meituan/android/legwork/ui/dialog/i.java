package com.meituan.android.legwork.ui.dialog;

import com.meituan.android.legwork.ui.dialog.BalancePayFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public static ChangeQuickRedirect a;
    private final BalancePayFragment.AnonymousClass1 b;
    private final String c;

    private i(BalancePayFragment.AnonymousClass1 anonymousClass1, String str) {
        this.b = anonymousClass1;
        this.c = str;
    }

    public static Runnable a(BalancePayFragment.AnonymousClass1 anonymousClass1, String str) {
        Object[] objArr = {anonymousClass1, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93a18fcf10d63d981d9ababd562499e6", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93a18fcf10d63d981d9ababd562499e6") : new i(anonymousClass1, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d79a35bd661a9d6ff66c7e8ab0f35f5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d79a35bd661a9d6ff66c7e8ab0f35f5e");
            return;
        }
        BalancePayFragment.AnonymousClass1 anonymousClass1 = this.b;
        String str = this.c;
        Object[] objArr2 = {anonymousClass1, str};
        ChangeQuickRedirect changeQuickRedirect2 = BalancePayFragment.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fc3f6eda1a2f4f6209b14bdad01e5aba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fc3f6eda1a2f4f6209b14bdad01e5aba");
        } else {
            BalancePayFragment.this.a(3, str);
        }
    }
}
