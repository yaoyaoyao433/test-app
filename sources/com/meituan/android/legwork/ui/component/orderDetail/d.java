package com.meituan.android.legwork.ui.component.orderDetail;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ShareChannelDialogFragment b;

    private d(ShareChannelDialogFragment shareChannelDialogFragment) {
        this.b = shareChannelDialogFragment;
    }

    public static View.OnClickListener a(ShareChannelDialogFragment shareChannelDialogFragment) {
        Object[] objArr = {shareChannelDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec7c30eec8ac3761cf31ae9afbe8a3e6", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec7c30eec8ac3761cf31ae9afbe8a3e6") : new d(shareChannelDialogFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c71aea450e492069abcc88798e37a20d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c71aea450e492069abcc88798e37a20d");
        } else {
            ShareChannelDialogFragment.a(this.b, view);
        }
    }
}
