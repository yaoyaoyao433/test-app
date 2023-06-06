package com.meituan.android.pay.widget.bankinfoitem;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final j b;

    private o(j jVar) {
        this.b = jVar;
    }

    public static View.OnClickListener a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb8c1a0b581042c4f689dfe09b399c31", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb8c1a0b581042c4f689dfe09b399c31") : new o(jVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7de9f884510f759487b93e73961473b0", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7de9f884510f759487b93e73961473b0");
        } else {
            j.a(this.b, view);
        }
    }
}
