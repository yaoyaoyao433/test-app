package com.meituan.android.legwork.ui.dialog;

import com.meituan.android.legwork.ui.dialog.BalancePayFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public static ChangeQuickRedirect a;
    private final BalancePayFragment.AnonymousClass1 b;

    private h(BalancePayFragment.AnonymousClass1 anonymousClass1) {
        this.b = anonymousClass1;
    }

    public static Runnable a(BalancePayFragment.AnonymousClass1 anonymousClass1) {
        Object[] objArr = {anonymousClass1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0eb5004d87a8c20e069ddf9fae3584d9", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0eb5004d87a8c20e069ddf9fae3584d9") : new h(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37e5cb2c1a1676c58bef057150012a1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37e5cb2c1a1676c58bef057150012a1a");
            return;
        }
        BalancePayFragment.AnonymousClass1 anonymousClass1 = this.b;
        Object[] objArr2 = {anonymousClass1};
        ChangeQuickRedirect changeQuickRedirect2 = BalancePayFragment.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ea62658c483fbb82ff7f4daabcd30b8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ea62658c483fbb82ff7f4daabcd30b8f");
        } else {
            BalancePayFragment.this.a(0, "");
        }
    }
}
