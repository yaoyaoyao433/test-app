package com.meituan.android.paybase.widgets.password;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final SafePasswordView b;
    private final StringBuffer c;

    private b(SafePasswordView safePasswordView, StringBuffer stringBuffer) {
        this.b = safePasswordView;
        this.c = stringBuffer;
    }

    public static Runnable a(SafePasswordView safePasswordView, StringBuffer stringBuffer) {
        Object[] objArr = {safePasswordView, stringBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e674d3ab0c0828616a73930ee003fe7d", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e674d3ab0c0828616a73930ee003fe7d") : new b(safePasswordView, stringBuffer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af4a157bf72963e7d71d9eeecbb49528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af4a157bf72963e7d71d9eeecbb49528");
        } else {
            SafePasswordView.a(this.b, this.c);
        }
    }
}
