package com.sankuai.eh.plugins.skeleton.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final SKTText b;

    private b(SKTText sKTText) {
        this.b = sKTText;
    }

    public static Runnable a(SKTText sKTText) {
        Object[] objArr = {sKTText};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d14e5c1a87519777b2fbaf24707bfdb9", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d14e5c1a87519777b2fbaf24707bfdb9") : new b(sKTText);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d581e8d640c63593c3f4903244ad7c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d581e8d640c63593c3f4903244ad7c5");
        } else {
            SKTText.a(this.b);
        }
    }
}
