package com.meituan.android.pay.widget.bankinfoitem;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public static ChangeQuickRedirect a;
    private final c b;

    private g(c cVar) {
        this.b = cVar;
    }

    public static Runnable a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a815ac08a25eac61a9ff6c4aacc9474", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a815ac08a25eac61a9ff6c4aacc9474") : new g(cVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93a0c48854563e2e311236c6c59610fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93a0c48854563e2e311236c6c59610fe");
        } else {
            c.a(this.b);
        }
    }
}
