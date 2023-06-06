package com.meituan.android.paycommon.lib.utils;

import android.app.Dialog;
import android.view.View;
import com.meituan.android.paycommon.lib.utils.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final j.a b;
    private final Dialog c;

    private k(j.a aVar, Dialog dialog) {
        this.b = aVar;
        this.c = dialog;
    }

    public static View.OnClickListener a(j.a aVar, Dialog dialog) {
        Object[] objArr = {aVar, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de9a65301ff62d1c0a4acc3a41722573", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de9a65301ff62d1c0a4acc3a41722573") : new k(aVar, dialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d040ba66641ffd3955fa901787a90e82", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d040ba66641ffd3955fa901787a90e82");
            return;
        }
        j.a aVar = this.b;
        Dialog dialog = this.c;
        Object[] objArr2 = {aVar, dialog, view};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f62d0cb47aab8396d0bad14547158d85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f62d0cb47aab8396d0bad14547158d85");
        } else {
            dialog.dismiss();
        }
    }
}
