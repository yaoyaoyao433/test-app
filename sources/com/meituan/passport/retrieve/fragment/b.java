package com.meituan.passport.retrieve.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements com.meituan.passport.clickaction.a {
    public static ChangeQuickRedirect a;
    private final InputAccountFragment b;

    private b(InputAccountFragment inputAccountFragment) {
        this.b = inputAccountFragment;
    }

    public static com.meituan.passport.clickaction.a a(InputAccountFragment inputAccountFragment) {
        Object[] objArr = {inputAccountFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c74efd604fc668d28011f1fa49f17ee", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c74efd604fc668d28011f1fa49f17ee") : new b(inputAccountFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15362ec66bd3ee559cf75ba89bf67367", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15362ec66bd3ee559cf75ba89bf67367");
        } else {
            InputAccountFragment.a(this.b, view);
        }
    }
}
