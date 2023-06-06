package com.meituan.android.recce.views.modal;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class RecceModalManager$$Lambda$2 implements DialogInterface.OnShowListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final RecceModalView arg$1;

    public RecceModalManager$$Lambda$2(RecceModalView recceModalView) {
        this.arg$1 = recceModalView;
    }

    public static DialogInterface.OnShowListener lambdaFactory$(RecceModalView recceModalView) {
        Object[] objArr = {recceModalView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b2f991b6b38bdb1693e372b62ebd92b", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnShowListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b2f991b6b38bdb1693e372b62ebd92b") : new RecceModalManager$$Lambda$2(recceModalView);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b12b6cd29fd85466d793820685d89573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b12b6cd29fd85466d793820685d89573");
        } else {
            RecceModalManager.lambda$handleShowEvent$1(this.arg$1, dialogInterface);
        }
    }
}
