package com.meituan.android.legwork.ui.dialog;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements DialogInterface.OnKeyListener {
    public static ChangeQuickRedirect a;
    private final BalancePayFragment b;

    private a(BalancePayFragment balancePayFragment) {
        this.b = balancePayFragment;
    }

    public static DialogInterface.OnKeyListener a(BalancePayFragment balancePayFragment) {
        Object[] objArr = {balancePayFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30d71d066a84396c42731f9bf2d3774c", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnKeyListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30d71d066a84396c42731f9bf2d3774c") : new a(balancePayFragment);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c02000790a0aa6eab6b5260e09b749", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c02000790a0aa6eab6b5260e09b749")).booleanValue() : BalancePayFragment.a(this.b, dialogInterface, i, keyEvent);
    }
}
