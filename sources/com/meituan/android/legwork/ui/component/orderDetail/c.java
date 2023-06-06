package com.meituan.android.legwork.ui.component.orderDetail;

import android.view.View;
import com.meituan.android.legwork.common.share.PtShareBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ShareChannelDialogFragment b;
    private final int c;
    private final PtShareBean d;

    private c(ShareChannelDialogFragment shareChannelDialogFragment, int i, PtShareBean ptShareBean) {
        this.b = shareChannelDialogFragment;
        this.c = i;
        this.d = ptShareBean;
    }

    public static View.OnClickListener a(ShareChannelDialogFragment shareChannelDialogFragment, int i, PtShareBean ptShareBean) {
        Object[] objArr = {shareChannelDialogFragment, Integer.valueOf(i), ptShareBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "785d157c2aea0372718a8ccdfb7cfb36", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "785d157c2aea0372718a8ccdfb7cfb36") : new c(shareChannelDialogFragment, i, ptShareBean);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daca6c11322946b05aec5707566f8889", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daca6c11322946b05aec5707566f8889");
        } else {
            ShareChannelDialogFragment.a(this.b, this.c, this.d, view);
        }
    }
}
