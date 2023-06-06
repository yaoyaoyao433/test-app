package com.meituan.android.legwork.ui.component.pickerview.lib;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements Runnable {
    public static ChangeQuickRedirect a;
    public final WheelView b;

    public d(WheelView wheelView) {
        Object[] objArr = {wheelView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b377fb9481d63f7964d769c34fd17e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b377fb9481d63f7964d769c34fd17e2");
        } else {
            this.b = wheelView;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b93837fe0854f2c09b30cfb42a0699", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b93837fe0854f2c09b30cfb42a0699");
        } else {
            this.b.d.a(this.b.getCurrentItem());
        }
    }
}
