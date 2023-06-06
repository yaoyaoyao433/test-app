package com.meituan.passport.listener;

import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import com.meituan.passport.LoginActivity;
import com.meituan.passport.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements DialogInterface.OnKeyListener {
    public static ChangeQuickRedirect a;
    private DialogFragment b;

    public a(DialogFragment dialogFragment) {
        Object[] objArr = {dialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7e51c22e04ca137b93081a949733fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7e51c22e04ca137b93081a949733fa");
        } else {
            this.b = dialogFragment;
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94736a18d67214d7807548cf1849300a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94736a18d67214d7807548cf1849300a")).booleanValue();
        }
        if (i == 4) {
            a();
        }
        return false;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4805d01c86c571013f03aae4e2d65c73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4805d01c86c571013f03aae4e2d65c73");
        } else if (this.b == null) {
        } else {
            this.b.dismissAllowingStateLoss();
            FragmentActivity activity = this.b.getActivity();
            if ((activity instanceof LoginActivity) && ab.a() == 3) {
                ((LoginActivity) activity).onBackPressed();
            }
        }
    }
}
