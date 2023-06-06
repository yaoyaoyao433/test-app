package com.meituan.android.paybase.password.verifypassword;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements ViewTreeObserver.OnWindowFocusChangeListener {
    public static ChangeQuickRedirect a;
    private final View b;
    private final Activity c;

    private f(View view, Activity activity) {
        this.b = view;
        this.c = activity;
    }

    public static ViewTreeObserver.OnWindowFocusChangeListener a(View view, Activity activity) {
        Object[] objArr = {view, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c4d6ad0ede32b892e9246a4a3cce69d", RobustBitConfig.DEFAULT_VALUE) ? (ViewTreeObserver.OnWindowFocusChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c4d6ad0ede32b892e9246a4a3cce69d") : new f(view, activity);
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205574a7e1d57b3af5fcd567fb1b9a37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205574a7e1d57b3af5fcd567fb1b9a37");
        } else {
            PasswordConfirmPageFragment.a(this.b, this.c, z);
        }
    }
}
