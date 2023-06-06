package com.meituan.android.recce.views.modal;

import android.content.DialogInterface;
import com.meituan.android.recce.views.modal.RecceModalView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class RecceModalManager$$Lambda$1 implements RecceModalView.OnRequestCloseListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final RecceModalView arg$1;

    public RecceModalManager$$Lambda$1(RecceModalView recceModalView) {
        this.arg$1 = recceModalView;
    }

    public static RecceModalView.OnRequestCloseListener lambdaFactory$(RecceModalView recceModalView) {
        Object[] objArr = {recceModalView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0f48acf39c1db3ddcc685b32808af181", RobustBitConfig.DEFAULT_VALUE) ? (RecceModalView.OnRequestCloseListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0f48acf39c1db3ddcc685b32808af181") : new RecceModalManager$$Lambda$1(recceModalView);
    }

    @Override // com.meituan.android.recce.views.modal.RecceModalView.OnRequestCloseListener
    public final void onRequestClose(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58be4fb1e0ee8fc0a00924af993e338a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58be4fb1e0ee8fc0a00924af993e338a");
        } else {
            RecceModalManager.lambda$handleBackKey$0(this.arg$1, dialogInterface);
        }
    }
}
