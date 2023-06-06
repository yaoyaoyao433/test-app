package com.meituan.android.legwork.ui.component.orderDetail;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ShareChannelDialogFragment b;
    private final String c;

    private b(ShareChannelDialogFragment shareChannelDialogFragment, String str) {
        this.b = shareChannelDialogFragment;
        this.c = str;
    }

    public static View.OnClickListener a(ShareChannelDialogFragment shareChannelDialogFragment, String str) {
        Object[] objArr = {shareChannelDialogFragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b0cc019ff59d89ca315d80dc3b643a2", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b0cc019ff59d89ca315d80dc3b643a2") : new b(shareChannelDialogFragment, str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c55894fa1585c431de8b4fd0b01e6a94", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c55894fa1585c431de8b4fd0b01e6a94");
        } else {
            ShareChannelDialogFragment.a(this.b, this.c, view);
        }
    }
}
