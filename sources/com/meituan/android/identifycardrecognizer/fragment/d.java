package com.meituan.android.identifycardrecognizer.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final IdCardCaptureFragment b;
    private final int c;
    private final int d;

    private d(IdCardCaptureFragment idCardCaptureFragment, int i, int i2) {
        this.b = idCardCaptureFragment;
        this.c = i;
        this.d = i2;
    }

    public static Runnable a(IdCardCaptureFragment idCardCaptureFragment, int i, int i2) {
        Object[] objArr = {idCardCaptureFragment, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "780ab1e737c44bb54c62657796902852", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "780ab1e737c44bb54c62657796902852") : new d(idCardCaptureFragment, i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18574edeedcf404b1c3743894a1e0277", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18574edeedcf404b1c3743894a1e0277");
        } else {
            IdCardCaptureFragment.a(this.b, this.c, this.d);
        }
    }
}
