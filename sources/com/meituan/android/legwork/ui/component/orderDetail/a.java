package com.meituan.android.legwork.ui.component.orderDetail;

import com.meituan.android.legwork.common.share.PtBaseShare;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements PtBaseShare.OnShareListener {
    public static ChangeQuickRedirect a;
    private final ShareChannelDialogFragment b;

    public a(ShareChannelDialogFragment shareChannelDialogFragment) {
        this.b = shareChannelDialogFragment;
    }

    @Override // com.meituan.android.legwork.common.share.PtBaseShare.OnShareListener
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a8c9f2b491eb96a3345a8b5a4f5d69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a8c9f2b491eb96a3345a8b5a4f5d69");
        } else {
            ShareChannelDialogFragment.a(this.b, i, i2);
        }
    }
}
