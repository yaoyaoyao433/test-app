package com.meituan.android.pay.desk.payment.view;

import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements ViewTreeObserver.OnGlobalLayoutListener {
    public static ChangeQuickRedirect a;
    private final m b;

    private n(m mVar) {
        this.b = mVar;
    }

    public static ViewTreeObserver.OnGlobalLayoutListener a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b69cec12ee4b81d6c61497dd3f4b8b36", RobustBitConfig.DEFAULT_VALUE) ? (ViewTreeObserver.OnGlobalLayoutListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b69cec12ee4b81d6c61497dd3f4b8b36") : new n(mVar);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04cee261b3da42919b857a8c309da18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04cee261b3da42919b857a8c309da18");
        } else {
            m.a(this.b);
        }
    }
}
