package com.meituan.android.paycommon.lib.utils;

import android.app.Dialog;
import android.view.View;
import com.meituan.android.paycommon.lib.utils.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final j.a b;
    private final Dialog c;

    private l(j.a aVar, Dialog dialog) {
        this.b = aVar;
        this.c = dialog;
    }

    public static View.OnClickListener a(j.a aVar, Dialog dialog) {
        Object[] objArr = {aVar, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea004bcb5a21dc426f07ebfea672d0ec", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea004bcb5a21dc426f07ebfea672d0ec") : new l(aVar, dialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08f1e7cdd02b9d5ffeb8297bbe9d151d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08f1e7cdd02b9d5ffeb8297bbe9d151d");
            return;
        }
        j.a aVar = this.b;
        Dialog dialog = this.c;
        Object[] objArr2 = {aVar, dialog, view};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f252fa27f26d08059892aaf47a1a1f92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f252fa27f26d08059892aaf47a1a1f92");
        } else {
            dialog.dismiss();
        }
    }
}
