package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CommonDialog b;

    private b(CommonDialog commonDialog) {
        this.b = commonDialog;
    }

    public static View.OnClickListener a(CommonDialog commonDialog) {
        Object[] objArr = {commonDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be9488c584b2f898cc93c070e235c49f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be9488c584b2f898cc93c070e235c49f") : new b(commonDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "575d8aedf3d5ace272eba86c53ef98f1", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "575d8aedf3d5ace272eba86c53ef98f1");
        } else {
            CommonDialog.b(this.b, view);
        }
    }
}
