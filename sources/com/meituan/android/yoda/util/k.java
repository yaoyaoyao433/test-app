package com.meituan.android.yoda.util;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k implements DialogInterface.OnClickListener {
    public static ChangeQuickRedirect a;
    private DialogInterface.OnClickListener b;

    public static /* synthetic */ DialogInterface.OnClickListener a(k kVar, DialogInterface.OnClickListener onClickListener) {
        kVar.b = null;
        return null;
    }

    public static k a(DialogInterface.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "137995fcd9f74037d20f847af015b267", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "137995fcd9f74037d20f847af015b267") : new k(onClickListener);
    }

    private k(DialogInterface.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "918373d053584ed8745809b6dd2a10ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "918373d053584ed8745809b6dd2a10ab");
        } else {
            this.b = onClickListener;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7bc8e40d886a49826f1f7524865b77a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7bc8e40d886a49826f1f7524865b77a");
        } else if (this.b != null) {
            this.b.onClick(dialogInterface, i);
        }
    }

    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96c385ec389e010f7966b08f3c9a3774", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96c385ec389e010f7966b08f3c9a3774");
        } else if (Build.VERSION.SDK_INT >= 18) {
            dialog.getWindow().getDecorView().getViewTreeObserver().addOnWindowAttachListener(new ViewTreeObserver.OnWindowAttachListener() { // from class: com.meituan.android.yoda.util.k.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnWindowAttachListener
                public final void onWindowAttached() {
                }

                @Override // android.view.ViewTreeObserver.OnWindowAttachListener
                public final void onWindowDetached() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80c987eab60487791563333e0a6639ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80c987eab60487791563333e0a6639ba");
                    } else {
                        k.a(k.this, null);
                    }
                }
            });
        }
    }
}
