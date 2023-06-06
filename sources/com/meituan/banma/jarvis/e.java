package com.meituan.banma.jarvis;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private static final e b = new e();

    public static Runnable a() {
        return b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4da049f975e01e92eda27dfb6bdf1b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4da049f975e01e92eda27dfb6bdf1b5");
        } else {
            d.d();
        }
    }
}
