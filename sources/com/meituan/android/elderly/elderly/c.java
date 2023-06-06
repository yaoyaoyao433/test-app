package com.meituan.android.elderly.elderly;

import android.app.Dialog;
import com.meituan.android.elderly.bean.PopDetailInfo;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final ElderlyCashier b;
    private final PopDetailInfo c;

    public c(ElderlyCashier elderlyCashier, PopDetailInfo popDetailInfo) {
        this.b = elderlyCashier;
        this.c = popDetailInfo;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "681c924396437c73fe954413e6094276", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "681c924396437c73fe954413e6094276");
        } else {
            ElderlyCashier.a(this.b, this.c, dialog);
        }
    }
}
