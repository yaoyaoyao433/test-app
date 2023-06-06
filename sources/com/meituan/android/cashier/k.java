package com.meituan.android.cashier;

import android.app.Dialog;
import com.meituan.android.cashier.model.bean.PopDetailInfo;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final NativeStandardCashierAdapter b;
    private final PopDetailInfo c;

    public k(NativeStandardCashierAdapter nativeStandardCashierAdapter, PopDetailInfo popDetailInfo) {
        this.b = nativeStandardCashierAdapter;
        this.c = popDetailInfo;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f02815d01674cd691e2b8b10097481c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f02815d01674cd691e2b8b10097481c");
        } else {
            NativeStandardCashierAdapter.a(this.b, this.c, dialog);
        }
    }
}
