package com.meituan.android.pay.setpassword;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements ViewTreeObserver.OnWindowFocusChangeListener {
    public static ChangeQuickRedirect a;
    private final View b;
    private final Activity c;

    private j(View view, Activity activity) {
        this.b = view;
        this.c = activity;
    }

    public static ViewTreeObserver.OnWindowFocusChangeListener a(View view, Activity activity) {
        Object[] objArr = {view, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71ed8c6eb3d2c1854388217ba45ec523", RobustBitConfig.DEFAULT_VALUE) ? (ViewTreeObserver.OnWindowFocusChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71ed8c6eb3d2c1854388217ba45ec523") : new j(view, activity);
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900856f4413d9bc65420fa1598087c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900856f4413d9bc65420fa1598087c10");
        } else {
            SetPasswordFragment.a(this.b, this.c, z);
        }
    }
}
