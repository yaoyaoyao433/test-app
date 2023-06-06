package com.meituan.android.pay.fragment;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class ab implements ViewTreeObserver.OnWindowFocusChangeListener {
    public static ChangeQuickRedirect a;
    private final VerifyPasswordFragment b;
    private final Activity c;

    private ab(VerifyPasswordFragment verifyPasswordFragment, Activity activity) {
        this.b = verifyPasswordFragment;
        this.c = activity;
    }

    public static ViewTreeObserver.OnWindowFocusChangeListener a(VerifyPasswordFragment verifyPasswordFragment, Activity activity) {
        Object[] objArr = {verifyPasswordFragment, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "109196d4d9fd1845b7d3c3b5a38a0b0f", RobustBitConfig.DEFAULT_VALUE) ? (ViewTreeObserver.OnWindowFocusChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "109196d4d9fd1845b7d3c3b5a38a0b0f") : new ab(verifyPasswordFragment, activity);
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "682ee5db320d21ad27e766bd14f996bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "682ee5db320d21ad27e766bd14f996bb");
        } else {
            VerifyPasswordFragment.a(this.b, this.c, z);
        }
    }
}
