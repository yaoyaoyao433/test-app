package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.android.pay.dialogfragment.DelayPayGuideDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DelayPayGuideDialogFragment.DelayPayGuideDialog b;

    private g(DelayPayGuideDialogFragment.DelayPayGuideDialog delayPayGuideDialog) {
        this.b = delayPayGuideDialog;
    }

    public static View.OnClickListener a(DelayPayGuideDialogFragment.DelayPayGuideDialog delayPayGuideDialog) {
        Object[] objArr = {delayPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2ecde4f05218d792583a645fa236c40", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2ecde4f05218d792583a645fa236c40") : new g(delayPayGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6ca68511bc5990f50ddda5839ab5f2d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6ca68511bc5990f50ddda5839ab5f2d");
        } else {
            DelayPayGuideDialogFragment.DelayPayGuideDialog.a(this.b, view);
        }
    }
}
