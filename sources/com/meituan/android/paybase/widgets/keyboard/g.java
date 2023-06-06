package com.meituan.android.paybase.widgets.keyboard;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public static ChangeQuickRedirect a;
    private final SafeEditText b;

    private g(SafeEditText safeEditText) {
        this.b = safeEditText;
    }

    public static Runnable a(SafeEditText safeEditText) {
        Object[] objArr = {safeEditText};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "660c6c7ca5dd58e322600a8ce1cc2e94", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "660c6c7ca5dd58e322600a8ce1cc2e94") : new g(safeEditText);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf48261a1f29e65909e0df2cb206cf68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf48261a1f29e65909e0df2cb206cf68");
        } else {
            SafeEditText.a(this.b);
        }
    }
}
