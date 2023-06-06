package com.meituan.android.legwork.ui.component.orderDetail;

import android.support.v4.app.FragmentActivity;
import com.meituan.android.legwork.common.share.PtBaseShare;
import com.meituan.android.legwork.common.share.PtShareBean;
import com.meituan.android.legwork.ui.component.orderDetail.ShareChannelDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final ShareChannelDialogFragment.AnonymousClass1 b;

    private e(ShareChannelDialogFragment.AnonymousClass1 anonymousClass1) {
        this.b = anonymousClass1;
    }

    public static Runnable a(ShareChannelDialogFragment.AnonymousClass1 anonymousClass1) {
        Object[] objArr = {anonymousClass1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "416df4a466b9b24ff416f6c0deadf16e", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "416df4a466b9b24ff416f6c0deadf16e") : new e(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PtShareBean ptShareBean;
        String str;
        PtShareBean ptShareBean2;
        PtBaseShare.OnShareListener onShareListener;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "071e24bc111f99670c0021515cf8eab6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "071e24bc111f99670c0021515cf8eab6");
            return;
        }
        ShareChannelDialogFragment.AnonymousClass1 anonymousClass1 = this.b;
        Object[] objArr2 = {anonymousClass1};
        ChangeQuickRedirect changeQuickRedirect2 = ShareChannelDialogFragment.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d4d189dabb54cdbd5b4a8646a2b0d530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d4d189dabb54cdbd5b4a8646a2b0d530");
            return;
        }
        ptShareBean = ShareChannelDialogFragment.this.g;
        ptShareBean.bmp = ShareChannelDialogFragment.this.k;
        FragmentActivity activity = ShareChannelDialogFragment.this.getActivity();
        str = ShareChannelDialogFragment.this.m;
        ptShareBean2 = ShareChannelDialogFragment.this.g;
        onShareListener = ShareChannelDialogFragment.this.n;
        com.meituan.android.legwork.common.share.e.a(activity, str, ptShareBean2, onShareListener);
    }
}
