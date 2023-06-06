package com.meituan.android.pay.setpassword;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final SetPasswordFragment b;
    private final Serializable c;

    public g(SetPasswordFragment setPasswordFragment, Serializable serializable) {
        this.b = setPasswordFragment;
        this.c = serializable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "642c81ccf4670bd1c9a8cb78af08c43a", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "642c81ccf4670bd1c9a8cb78af08c43a");
        } else {
            SetPasswordFragment.a(this.b, this.c, view);
        }
    }
}
